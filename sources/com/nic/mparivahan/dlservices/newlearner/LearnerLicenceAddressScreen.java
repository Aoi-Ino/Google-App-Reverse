package com.nic.mparivahan.dlservices.newlearner;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bj.g2;
import bj.h2;
import bj.i2;
import bj.j2;
import bj.k2;
import bj.l2;
import bj.m2;
import bj.n2;
import bj.o2;
import bj.p2;
import bj.q2;
import bj.r2;
import bj.s2;
import bj.t2;
import bj.u2;
import bm.l;
import cm.m;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.StateMasterItem;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import java.util.ArrayList;
import java.util.List;
import jj.c0;
import kk.e;
import ni.c5;
import pl.x;
import v9.e;

public final class LearnerLicenceAddressScreen extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public Aadarkyc.DOEkyc A0;
    private long B0;
    /* access modifiers changed from: private */
    public boolean C0;
    /* access modifiers changed from: private */
    public c5 G;
    /* access modifiers changed from: private */
    public c0 H;
    public t9.a I;
    public ClInter J;
    /* access modifiers changed from: private */
    public List K;
    /* access modifiers changed from: private */
    public List L;
    /* access modifiers changed from: private */
    public List M;
    /* access modifiers changed from: private */
    public List N;
    /* access modifiers changed from: private */
    public List O;
    /* access modifiers changed from: private */
    public List P;
    /* access modifiers changed from: private */
    public List Q;
    /* access modifiers changed from: private */
    public String R = "";
    private DlAddress S = new DlAddress("", "", "", "", "", "", "", "");
    private DlAddress T = new DlAddress("", "", "", "", "", "", "", "");
    public String U;
    public String V;
    public Context W;
    public ProgressDialog X;
    public ld.c Y;
    public ld.f Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f21769a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f21770b0 = "";
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public String f21771c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f21772d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f21773e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f21774f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f21775g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f21776h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f21777i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f21778j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f21779k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f21780l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f21781m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f21782n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f21783o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f21784p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f21785q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f21786r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f21787s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f21788t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f21789u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f21790v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f21791w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f21792x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f21793y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private int f21794z0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21795e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            super(1);
            this.f21795e = learnerLicenceAddressScreen;
        }

        public final void b(StateResponse stateResponse) {
            try {
                this.f21795e.i2().dismiss();
                if (cm.l.a(stateResponse.getStatusCode(), "00")) {
                    List<StateMasterItem> stateMaster = stateResponse.getStateMaster();
                    if (stateMaster != null && (!stateMaster.isEmpty())) {
                        this.f21795e.K = stateResponse.getStateMaster();
                        ArrayList arrayList = new ArrayList();
                        List<StateMasterItem> I1 = this.f21795e.K;
                        c0 c0Var = null;
                        if (I1 != null) {
                            for (StateMasterItem stateMasterItem : I1) {
                                arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                            }
                        }
                        String str = "";
                        List I12 = this.f21795e.K;
                        cm.l.c(I12);
                        int size = I12.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            String K1 = this.f21795e.f21771c0;
                            List I13 = this.f21795e.K;
                            cm.l.c(I13);
                            Object obj = I13.get(i10);
                            cm.l.c(obj);
                            if (cm.l.a(K1, ((StateMasterItem) obj).getStateCode())) {
                                LearnerLicenceAddressScreen learnerLicenceAddressScreen = this.f21795e;
                                List I14 = learnerLicenceAddressScreen.K;
                                cm.l.c(I14);
                                Object obj2 = I14.get(i10);
                                cm.l.c(obj2);
                                String stateCode = ((StateMasterItem) obj2).getStateCode();
                                cm.l.c(stateCode);
                                learnerLicenceAddressScreen.M2(stateCode);
                                LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = this.f21795e;
                                List I15 = learnerLicenceAddressScreen2.K;
                                cm.l.c(I15);
                                Object obj3 = I15.get(i10);
                                cm.l.c(obj3);
                                String stateCode2 = ((StateMasterItem) obj3).getStateCode();
                                cm.l.c(stateCode2);
                                learnerLicenceAddressScreen2.R2(stateCode2);
                                List I16 = this.f21795e.K;
                                cm.l.c(I16);
                                Object obj4 = I16.get(i10);
                                cm.l.c(obj4);
                                str = ((StateMasterItem) obj4).getStateName();
                                cm.l.c(str);
                                break;
                            }
                            i10++;
                        }
                        c5 z12 = this.f21795e.G;
                        if (z12 == null) {
                            cm.l.v("binding");
                            z12 = null;
                        }
                        z12.f25625z.setText(str);
                        c5 z13 = this.f21795e.G;
                        if (z13 == null) {
                            cm.l.v("binding");
                            z13 = null;
                        }
                        z13.f25625z.setContentDescription(this.f21795e.d2());
                        this.f21795e.X1();
                        String d22 = this.f21795e.d2();
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen3 = this.f21795e;
                        learnerLicenceAddressScreen3.i2().dismiss();
                        c0 L1 = learnerLicenceAddressScreen3.H;
                        if (L1 == null) {
                            cm.l.v("viewModel");
                            L1 = null;
                        }
                        L1.g(d22);
                        c5 z14 = this.f21795e.G;
                        if (z14 == null) {
                            cm.l.v("binding");
                            z14 = null;
                        }
                        z14.G.setText(str);
                        c5 z15 = this.f21795e.G;
                        if (z15 == null) {
                            cm.l.v("binding");
                            z15 = null;
                        }
                        z15.G.setContentDescription(this.f21795e.j2());
                        this.f21795e.a2();
                        String j22 = this.f21795e.j2();
                        LearnerLicenceAddressScreen learnerLicenceAddressScreen4 = this.f21795e;
                        learnerLicenceAddressScreen4.i2().dismiss();
                        c0 L12 = learnerLicenceAddressScreen4.H;
                        if (L12 == null) {
                            cm.l.v("viewModel");
                        } else {
                            c0Var = L12;
                        }
                        c0Var.g(j22);
                        return;
                    }
                    return;
                }
                LearnerLicenceAddressScreen learnerLicenceAddressScreen5 = this.f21795e;
                learnerLicenceAddressScreen5.J2(learnerLicenceAddressScreen5.o2().b("no_details", this.f21795e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen6 = this.f21795e;
                learnerLicenceAddressScreen6.J2(learnerLicenceAddressScreen6.o2().b("service_is_not_present", this.f21795e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21796e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            super(1);
            this.f21796e = learnerLicenceAddressScreen;
        }

        public final void b(DistResponse distResponse) {
            String str;
            String str2;
            String str3;
            String str4;
            try {
                this.f21796e.i2().dismiss();
                c5 c5Var = null;
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f21796e.L = distResponse.getDistMaster();
                    this.f21796e.M = distResponse.getDistMaster();
                    if (this.f21796e.C0) {
                        Aadarkyc.DOEkyc y12 = this.f21796e.A0;
                        if (y12 == null) {
                            cm.l.v("aadharData");
                            y12 = null;
                        }
                        if (com.nic.mparivahan.dlservices.utilities.d.d(y12.getDist())) {
                            List C1 = this.f21796e.L;
                            cm.l.c(C1);
                            int size = C1.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                str = "";
                                if (i11 >= size) {
                                    str2 = str;
                                    str3 = str2;
                                    break;
                                }
                                Aadarkyc.DOEkyc y13 = this.f21796e.A0;
                                if (y13 == null) {
                                    cm.l.v("aadharData");
                                    y13 = null;
                                }
                                String dist = y13.getDist();
                                List C12 = this.f21796e.L;
                                cm.l.c(C12);
                                Object obj = C12.get(i11);
                                cm.l.c(obj);
                                if (cm.l.a(dist, ((DistrictsMasterItem) obj).getDistName())) {
                                    List C13 = this.f21796e.L;
                                    cm.l.c(C13);
                                    Object obj2 = C13.get(i11);
                                    cm.l.c(obj2);
                                    str2 = ((DistrictsMasterItem) obj2).getDistName();
                                    cm.l.c(str2);
                                    List C14 = this.f21796e.L;
                                    cm.l.c(C14);
                                    Object obj3 = C14.get(i11);
                                    cm.l.c(obj3);
                                    str3 = ((DistrictsMasterItem) obj3).getDistCode();
                                    cm.l.c(str3);
                                    break;
                                }
                                i11++;
                            }
                            c5 z12 = this.f21796e.G;
                            if (z12 == null) {
                                cm.l.v("binding");
                                z12 = null;
                            }
                            z12.f25624y.setText(str2);
                            c5 z13 = this.f21796e.G;
                            if (z13 == null) {
                                cm.l.v("binding");
                                z13 = null;
                            }
                            z13.f25624y.setContentDescription(str3);
                            this.f21796e.m2().setDistrict(str3);
                            this.f21796e.Y1();
                            LearnerLicenceAddressScreen learnerLicenceAddressScreen = this.f21796e;
                            learnerLicenceAddressScreen.i2().dismiss();
                            c0 L1 = learnerLicenceAddressScreen.H;
                            if (L1 == null) {
                                cm.l.v("viewModel");
                                L1 = null;
                            }
                            c5 z14 = learnerLicenceAddressScreen.G;
                            if (z14 == null) {
                                cm.l.v("binding");
                                z14 = null;
                            }
                            L1.n(z14.f25625z.getContentDescription().toString(), str3);
                            List F1 = this.f21796e.M;
                            cm.l.c(F1);
                            int size2 = F1.size();
                            while (true) {
                                if (i10 >= size2) {
                                    str4 = str;
                                    break;
                                }
                                Aadarkyc.DOEkyc y14 = this.f21796e.A0;
                                if (y14 == null) {
                                    cm.l.v("aadharData");
                                    y14 = null;
                                }
                                String dist2 = y14.getDist();
                                List F12 = this.f21796e.M;
                                cm.l.c(F12);
                                Object obj4 = F12.get(i10);
                                cm.l.c(obj4);
                                if (cm.l.a(dist2, ((DistrictsMasterItem) obj4).getDistName())) {
                                    List C15 = this.f21796e.L;
                                    cm.l.c(C15);
                                    Object obj5 = C15.get(i10);
                                    cm.l.c(obj5);
                                    str = ((DistrictsMasterItem) obj5).getDistName();
                                    cm.l.c(str);
                                    List C16 = this.f21796e.L;
                                    cm.l.c(C16);
                                    Object obj6 = C16.get(i10);
                                    cm.l.c(obj6);
                                    str4 = ((DistrictsMasterItem) obj6).getDistCode();
                                    cm.l.c(str4);
                                    break;
                                }
                                i10++;
                            }
                            c5 z15 = this.f21796e.G;
                            if (z15 == null) {
                                cm.l.v("binding");
                                z15 = null;
                            }
                            z15.F.setText(str);
                            c5 z16 = this.f21796e.G;
                            if (z16 == null) {
                                cm.l.v("binding");
                                z16 = null;
                            }
                            z16.F.setContentDescription(str4);
                            this.f21796e.k2().setDistrict(str4);
                            this.f21796e.b2();
                            LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = this.f21796e;
                            learnerLicenceAddressScreen2.i2().dismiss();
                            c0 L12 = learnerLicenceAddressScreen2.H;
                            if (L12 == null) {
                                cm.l.v("viewModel");
                                L12 = null;
                            }
                            c5 z17 = learnerLicenceAddressScreen2.G;
                            if (z17 == null) {
                                cm.l.v("binding");
                            } else {
                                c5Var = z17;
                            }
                            L12.n(c5Var.G.getContentDescription().toString(), str4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                LearnerLicenceAddressScreen learnerLicenceAddressScreen3 = this.f21796e;
                learnerLicenceAddressScreen3.J2(learnerLicenceAddressScreen3.o2().b("no_details", this.f21796e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen4 = this.f21796e;
                learnerLicenceAddressScreen4.J2(learnerLicenceAddressScreen4.o2().b("service_is_not_present", this.f21796e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21797e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            super(1);
            this.f21797e = learnerLicenceAddressScreen;
        }

        /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.TalukaResponse r10) {
            /*
                r9 = this;
                r0 = 2132019337(0x7f140889, float:1.9677006E38)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r1 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                android.app.ProgressDialog r1 = r1.i2()     // Catch:{ Exception -> 0x01da }
                r1.dismiss()     // Catch:{ Exception -> 0x01da }
                r1 = 0
                if (r10 == 0) goto L_0x0014
                java.lang.String r2 = r10.getStatusCode()     // Catch:{ Exception -> 0x01da }
                goto L_0x0015
            L_0x0014:
                r2 = r1
            L_0x0015:
                java.lang.String r3 = "00"
                boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x01da }
                if (r2 == 0) goto L_0x01a1
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.lang.String r2 = r2.R     // Catch:{ Exception -> 0x01da }
                java.lang.String r3 = "dl-renewal-current-address"
                boolean r2 = cm.l.a(r2, r3)     // Catch:{ Exception -> 0x01da }
                if (r2 == 0) goto L_0x0035
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r3 = r10.getTakulaMaster()     // Catch:{ Exception -> 0x01da }
                r2.N = r3     // Catch:{ Exception -> 0x01da }
                goto L_0x003e
            L_0x0035:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r3 = r10.getTakulaMaster()     // Catch:{ Exception -> 0x01da }
                r2.O = r3     // Catch:{ Exception -> 0x01da }
            L_0x003e:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                boolean r2 = r2.C0     // Catch:{ Exception -> 0x01da }
                if (r2 == 0) goto L_0x01d0
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.A0     // Catch:{ Exception -> 0x01da }
                java.lang.String r3 = "aadharData"
                if (r2 != 0) goto L_0x0054
                cm.l.v(r3)     // Catch:{ Exception -> 0x01da }
                r2 = r1
            L_0x0054:
                java.lang.String r2 = r2.getSubDist()     // Catch:{ Exception -> 0x01da }
                boolean r2 = com.nic.mparivahan.dlservices.utilities.d.d(r2)     // Catch:{ Exception -> 0x01da }
                if (r2 == 0) goto L_0x01d0
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r2 = r2.O     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                int r2 = r2.size()     // Catch:{ Exception -> 0x01da }
                r4 = 0
                r5 = r4
            L_0x006d:
                java.lang.String r6 = ""
                if (r5 >= r2) goto L_0x00d3
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r7.A0     // Catch:{ Exception -> 0x01da }
                if (r7 != 0) goto L_0x007d
                cm.l.v(r3)     // Catch:{ Exception -> 0x01da }
                r7 = r1
            L_0x007d:
                java.lang.String r7 = r7.getSubDist()     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r8 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r8 = r8.O     // Catch:{ Exception -> 0x01da }
                cm.l.c(r8)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r8 = r8.get(r5)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r8)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r8 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r8     // Catch:{ Exception -> 0x01da }
                java.lang.String r8 = r8.getSubDistname()     // Catch:{ Exception -> 0x01da }
                boolean r7 = cm.l.a(r7, r8)     // Catch:{ Exception -> 0x01da }
                if (r7 == 0) goto L_0x00d0
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r2 = r2.O     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r2 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r2     // Catch:{ Exception -> 0x01da }
                java.lang.String r2 = r2.getSubDistname()     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r7 = r7.O     // Catch:{ Exception -> 0x01da }
                cm.l.c(r7)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r5)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r5     // Catch:{ Exception -> 0x01da }
                java.lang.String r5 = r5.getSubDistcode()     // Catch:{ Exception -> 0x01da }
                cm.l.c(r5)     // Catch:{ Exception -> 0x01da }
                goto L_0x00d5
            L_0x00d0:
                int r5 = r5 + 1
                goto L_0x006d
            L_0x00d3:
                r2 = r6
                r5 = r2
            L_0x00d5:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ni.c5 r7 = r7.G     // Catch:{ Exception -> 0x01da }
                java.lang.String r8 = "binding"
                if (r7 != 0) goto L_0x00e3
                cm.l.v(r8)     // Catch:{ Exception -> 0x01da }
                r7 = r1
            L_0x00e3:
                android.widget.EditText r7 = r7.E     // Catch:{ Exception -> 0x01da }
                r7.setText(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ni.c5 r2 = r2.G     // Catch:{ Exception -> 0x01da }
                if (r2 != 0) goto L_0x00f4
                cm.l.v(r8)     // Catch:{ Exception -> 0x01da }
                r2 = r1
            L_0x00f4:
                android.widget.EditText r2 = r2.E     // Catch:{ Exception -> 0x01da }
                r2.setContentDescription(r5)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.DlAddress r2 = r2.k2()     // Catch:{ Exception -> 0x01da }
                r2.setSubDistrict(r5)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r2 = r2.N     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                int r2 = r2.size()     // Catch:{ Exception -> 0x01da }
            L_0x010f:
                if (r4 >= r2) goto L_0x0173
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r5 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r5.A0     // Catch:{ Exception -> 0x01da }
                if (r5 != 0) goto L_0x011d
                cm.l.v(r3)     // Catch:{ Exception -> 0x01da }
                r5 = r1
            L_0x011d:
                java.lang.String r5 = r5.getSubDist()     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r7 = r7.N     // Catch:{ Exception -> 0x01da }
                cm.l.c(r7)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r7)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r7     // Catch:{ Exception -> 0x01da }
                java.lang.String r7 = r7.getSubDistname()     // Catch:{ Exception -> 0x01da }
                boolean r5 = cm.l.a(r5, r7)     // Catch:{ Exception -> 0x01da }
                if (r5 == 0) goto L_0x0170
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r2 = r2.N     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r2 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r2     // Catch:{ Exception -> 0x01da }
                java.lang.String r6 = r2.getSubDistname()     // Catch:{ Exception -> 0x01da }
                cm.l.c(r6)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.util.List r2 = r2.N     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r2 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r2     // Catch:{ Exception -> 0x01da }
                java.lang.String r2 = r2.getSubDistcode()     // Catch:{ Exception -> 0x01da }
                cm.l.c(r2)     // Catch:{ Exception -> 0x01da }
                goto L_0x0174
            L_0x0170:
                int r4 = r4 + 1
                goto L_0x010f
            L_0x0173:
                r2 = r6
            L_0x0174:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r3 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ni.c5 r3 = r3.G     // Catch:{ Exception -> 0x01da }
                if (r3 != 0) goto L_0x0180
                cm.l.v(r8)     // Catch:{ Exception -> 0x01da }
                r3 = r1
            L_0x0180:
                android.widget.EditText r3 = r3.f25623x     // Catch:{ Exception -> 0x01da }
                r3.setText(r6)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r3 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ni.c5 r3 = r3.G     // Catch:{ Exception -> 0x01da }
                if (r3 != 0) goto L_0x0191
                cm.l.v(r8)     // Catch:{ Exception -> 0x01da }
                goto L_0x0192
            L_0x0191:
                r1 = r3
            L_0x0192:
                android.widget.EditText r1 = r1.f25623x     // Catch:{ Exception -> 0x01da }
                r1.setContentDescription(r2)     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r1 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                com.nic.mparivahan.dlservices.data.model.DlAddress r1 = r1.m2()     // Catch:{ Exception -> 0x01da }
                r1.setSubDistrict(r2)     // Catch:{ Exception -> 0x01da }
                goto L_0x01d0
            L_0x01a1:
                if (r10 == 0) goto L_0x01a7
                java.lang.String r1 = r10.getStatusCode()     // Catch:{ Exception -> 0x01da }
            L_0x01a7:
                java.lang.String r2 = "01"
                boolean r1 = cm.l.a(r1, r2)     // Catch:{ Exception -> 0x01da }
                if (r1 == 0) goto L_0x01c1
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r1 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ld.c r2 = r1.o2()     // Catch:{ Exception -> 0x01da }
                java.lang.String r3 = "no_taluka_found"
                java.lang.String r4 = "No Taluka / Block found for selected District"
            L_0x01b9:
                java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x01da }
                r1.J2(r2)     // Catch:{ Exception -> 0x01da }
                goto L_0x01d0
            L_0x01c1:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r1 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                ld.c r2 = r1.o2()     // Catch:{ Exception -> 0x01da }
                java.lang.String r3 = "no_details"
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r9.f21797e     // Catch:{ Exception -> 0x01da }
                java.lang.String r4 = r4.getString(r0)     // Catch:{ Exception -> 0x01da }
                goto L_0x01b9
            L_0x01d0:
                java.lang.String r1 = "dl_taluka"
                java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01da }
                android.util.Log.e(r1, r10)     // Catch:{ Exception -> 0x01da }
                goto L_0x01ef
            L_0x01da:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r10 = r9.f21797e
                ld.c r1 = r10.o2()
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r9.f21797e
                java.lang.String r0 = r2.getString(r0)
                java.lang.String r2 = "service_is_not_present"
                java.lang.String r0 = r1.b(r2, r0)
                r10.J2(r0)
            L_0x01ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.c.b(com.nic.mparivahan.dlservices.data.model.TalukaResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21798e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            super(1);
            this.f21798e = learnerLicenceAddressScreen;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            try {
                this.f21798e.i2().dismiss();
                if (!cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    LearnerLicenceAddressScreen learnerLicenceAddressScreen = this.f21798e;
                    learnerLicenceAddressScreen.J2(learnerLicenceAddressScreen.o2().b("no_vill_found", "No Village/Town found for selected Taluka/Block"));
                } else if (cm.l.a(this.f21798e.R, "dl-renewal-current-address")) {
                    this.f21798e.P = villageOrTownResponse.getVillageMaster();
                } else {
                    this.f21798e.Q = villageOrTownResponse.getVillageMaster();
                }
            } catch (Exception unused) {
                LearnerLicenceAddressScreen learnerLicenceAddressScreen2 = this.f21798e;
                learnerLicenceAddressScreen2.J2(learnerLicenceAddressScreen2.o2().b("service_is_not_present", this.f21798e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21799a;

        e(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            this.f21799a = learnerLicenceAddressScreen;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
            r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r7);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r6, int r7) {
            /*
                r5 = this;
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21799a
                java.lang.String r0 = r0.R
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                java.lang.String r3 = "binding"
                r4 = 0
                if (r1 == 0) goto L_0x0088
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21799a
                java.util.List r0 = r0.L
                if (r0 == 0) goto L_0x0028
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r7
                if (r7 == 0) goto L_0x0028
                java.lang.String r7 = r7.getDistCode()
                goto L_0x0029
            L_0x0028:
                r7 = r4
            L_0x0029:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21799a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0035
                cm.l.v(r3)
                r0 = r4
            L_0x0035:
                android.widget.EditText r0 = r0.f25624y
                r0.setText(r6)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x0046
                cm.l.v(r3)
                r6 = r4
            L_0x0046:
                android.widget.EditText r6 = r6.f25624y
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.m2()
                r6.setDistrict(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                r6.Y1()
                if (r7 == 0) goto L_0x00f9
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                android.app.ProgressDialog r0 = r6.i2()
                r0.dismiss()
                jj.c0 r0 = r6.H
                if (r0 != 0) goto L_0x006e
                cm.l.v(r2)
                r0 = r4
            L_0x006e:
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x0078
                cm.l.v(r3)
                goto L_0x0079
            L_0x0078:
                r4 = r6
            L_0x0079:
                android.widget.EditText r6 = r4.f25625z
            L_0x007b:
                java.lang.CharSequence r6 = r6.getContentDescription()
                java.lang.String r6 = r6.toString()
                r0.n(r6, r7)
                goto L_0x00f9
            L_0x0088:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00f9
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21799a
                java.util.List r0 = r0.M
                if (r0 == 0) goto L_0x00a5
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r7
                if (r7 == 0) goto L_0x00a5
                java.lang.String r7 = r7.getDistCode()
                goto L_0x00a6
            L_0x00a5:
                r7 = r4
            L_0x00a6:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21799a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x00b2
                cm.l.v(r3)
                r0 = r4
            L_0x00b2:
                android.widget.EditText r0 = r0.F
                r0.setText(r6)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x00c3
                cm.l.v(r3)
                r6 = r4
            L_0x00c3:
                android.widget.EditText r6 = r6.F
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.k2()
                r6.setDistrict(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                r6.b2()
                if (r7 == 0) goto L_0x00f9
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21799a
                android.app.ProgressDialog r0 = r6.i2()
                r0.dismiss()
                jj.c0 r0 = r6.H
                if (r0 != 0) goto L_0x00eb
                cm.l.v(r2)
                r0 = r4
            L_0x00eb:
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x00f5
                cm.l.v(r3)
                goto L_0x00f6
            L_0x00f5:
                r4 = r6
            L_0x00f6:
                android.widget.EditText r6 = r4.G
                goto L_0x007b
            L_0x00f9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.e.a(java.lang.String, int):void");
        }
    }

    public static final class f implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21800a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21801b;

        f(LearnerLicenceAddressScreen learnerLicenceAddressScreen, String str) {
            this.f21800a = learnerLicenceAddressScreen;
            this.f21801b = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [ni.c5] */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v3, types: [ni.c5] */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7, types: [ni.c5] */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
            r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r0.get(r7);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r6, int r7) {
            /*
                r5 = this;
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                java.lang.String r0 = r0.R
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = ", "
                java.lang.String r2 = "binding"
                r3 = 0
                if (r0 == 0) goto L_0x01be
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                java.util.List r0 = r0.N
                if (r0 == 0) goto L_0x0028
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r7
                if (r7 == 0) goto L_0x0028
                java.lang.String r7 = r7.getSubDistcode()
                goto L_0x0029
            L_0x0028:
                r7 = r3
            L_0x0029:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0035
                cm.l.v(r2)
                r0 = r3
            L_0x0035:
                android.widget.EditText r0 = r0.f25623x
                r0.setText(r6)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x0046
                cm.l.v(r2)
                r6 = r3
            L_0x0046:
                android.widget.EditText r6 = r6.f25623x
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.m2()
                r6.setSubDistrict(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                java.lang.String r7 = r5.f21801b
                r6.e2(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                boolean r6 = r6.C0
                if (r6 == 0) goto L_0x015f
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r6.A0
                java.lang.String r7 = "aadharData"
                if (r6 != 0) goto L_0x0071
                cm.l.v(r7)
                r6 = r3
            L_0x0071:
                java.lang.String r6 = r6.getLandMark()
                boolean r6 = com.nic.mparivahan.dlservices.utilities.d.d(r6)
                if (r6 == 0) goto L_0x00f3
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x0087
                cm.l.v(r2)
                r6 = r3
            L_0x0087:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r5.f21800a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r4.A0
                if (r4 != 0) goto L_0x009a
                cm.l.v(r7)
                r4 = r3
            L_0x009a:
                java.lang.String r7 = r4.getLandMark()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r5.f21800a
                ni.c5 r7 = r7.G
                if (r7 != 0) goto L_0x00b0
                cm.l.v(r2)
                r7 = r3
            L_0x00b0:
                android.widget.EditText r7 = r7.f25623x
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r5.f21800a
                ni.c5 r7 = r7.G
                if (r7 != 0) goto L_0x00c8
                cm.l.v(r2)
                r7 = r3
            L_0x00c8:
                android.widget.EditText r7 = r7.f25624y
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r7 = r5.f21800a
                ni.c5 r7 = r7.G
                if (r7 != 0) goto L_0x00e0
                cm.l.v(r2)
                goto L_0x00e1
            L_0x00e0:
                r3 = r7
            L_0x00e1:
                android.widget.EditText r7 = r3.f25625z
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
            L_0x00ea:
                java.lang.String r7 = r0.toString()
            L_0x00ee:
                r6.setText(r7)
                goto L_0x025a
            L_0x00f3:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x00ff
                cm.l.v(r2)
                r6 = r3
            L_0x00ff:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r5.f21800a
                ni.c5 r4 = r4.G
                if (r4 != 0) goto L_0x0112
                cm.l.v(r2)
                r4 = r3
            L_0x0112:
                android.widget.EditText r2 = r4.f25623x
                android.text.Editable r2 = r2.getText()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r5.f21800a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.A0
                if (r2 != 0) goto L_0x012a
                cm.l.v(r7)
                r2 = r3
            L_0x012a:
                java.lang.String r2 = r2.getLocalityIfAny()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r2 = r5.f21800a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.A0
                if (r2 != 0) goto L_0x0140
                cm.l.v(r7)
                r2 = r3
            L_0x0140:
                java.lang.String r2 = r2.getDist()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r1 = r5.f21800a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r1.A0
                if (r1 != 0) goto L_0x0156
                cm.l.v(r7)
                goto L_0x0157
            L_0x0156:
                r3 = r1
            L_0x0157:
                java.lang.String r7 = r3.getState()
                r0.append(r7)
                goto L_0x00ea
            L_0x015f:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x016b
                cm.l.v(r2)
                r6 = r3
            L_0x016b:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x017e
                cm.l.v(r2)
                r0 = r3
            L_0x017e:
                android.widget.EditText r0 = r0.f25623x
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0196
                cm.l.v(r2)
                r0 = r3
            L_0x0196:
                android.widget.EditText r0 = r0.f25624y
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x01ae
                cm.l.v(r2)
                goto L_0x01af
            L_0x01ae:
                r3 = r0
            L_0x01af:
                android.widget.EditText r0 = r3.f25625z
            L_0x01b1:
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                goto L_0x00ee
            L_0x01be:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                java.util.List r0 = r0.O
                if (r0 == 0) goto L_0x01d3
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r7
                if (r7 == 0) goto L_0x01d3
                java.lang.String r7 = r7.getSubDistcode()
                goto L_0x01d4
            L_0x01d3:
                r7 = r3
            L_0x01d4:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x01e0
                cm.l.v(r2)
                r0 = r3
            L_0x01e0:
                android.widget.EditText r0 = r0.E
                r0.setText(r6)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x01f1
                cm.l.v(r2)
                r6 = r3
            L_0x01f1:
                android.widget.EditText r6 = r6.E
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.k2()
                r6.setSubDistrict(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                java.lang.String r7 = r5.f21801b
                r6.l2(r7)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r6 = r5.f21800a
                ni.c5 r6 = r6.G
                if (r6 != 0) goto L_0x0212
                cm.l.v(r2)
                r6 = r3
            L_0x0212:
                android.widget.EditText r6 = r6.B
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0225
                cm.l.v(r2)
                r0 = r3
            L_0x0225:
                android.widget.EditText r0 = r0.E
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x023d
                cm.l.v(r2)
                r0 = r3
            L_0x023d:
                android.widget.EditText r0 = r0.F
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r5.f21800a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0255
                cm.l.v(r2)
                goto L_0x0256
            L_0x0255:
                r3 = r0
            L_0x0256:
                android.widget.EditText r0 = r3.G
                goto L_0x01b1
            L_0x025a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.f.a(java.lang.String, int):void");
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnerLicenceAddressScreen f21802a;

        g(LearnerLicenceAddressScreen learnerLicenceAddressScreen) {
            this.f21802a = learnerLicenceAddressScreen;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r0.get(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r4, int r5) {
            /*
                r3 = this;
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r3.f21802a
                java.lang.String r0 = r0.R
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = "binding"
                r2 = 0
                if (r0 == 0) goto L_0x0054
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r3.f21802a
                java.util.List r0 = r0.P
                if (r0 == 0) goto L_0x0026
                java.lang.Object r5 = r0.get(r5)
                com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r5
                if (r5 == 0) goto L_0x0026
                java.lang.String r5 = r5.getVillageCode()
                goto L_0x0027
            L_0x0026:
                r5 = r2
            L_0x0027:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r3.f21802a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0033
                cm.l.v(r1)
                r0 = r2
            L_0x0033:
                android.widget.EditText r0 = r0.M
                r0.setText(r4)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r3.f21802a
                ni.c5 r4 = r4.G
                if (r4 != 0) goto L_0x0044
                cm.l.v(r1)
                goto L_0x0045
            L_0x0044:
                r2 = r4
            L_0x0045:
                android.widget.EditText r4 = r2.M
                r4.setContentDescription(r5)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r3.f21802a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.m2()
            L_0x0050:
                r4.setVillageOrTown(r5)
                goto L_0x0094
            L_0x0054:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r3.f21802a
                java.util.List r0 = r0.Q
                if (r0 == 0) goto L_0x0069
                java.lang.Object r5 = r0.get(r5)
                com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r5
                if (r5 == 0) goto L_0x0069
                java.lang.String r5 = r5.getVillageCode()
                goto L_0x006a
            L_0x0069:
                r5 = r2
            L_0x006a:
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r0 = r3.f21802a
                ni.c5 r0 = r0.G
                if (r0 != 0) goto L_0x0076
                cm.l.v(r1)
                r0 = r2
            L_0x0076:
                android.widget.EditText r0 = r0.H
                r0.setText(r4)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r3.f21802a
                ni.c5 r4 = r4.G
                if (r4 != 0) goto L_0x0087
                cm.l.v(r1)
                goto L_0x0088
            L_0x0087:
                r2 = r4
            L_0x0088:
                android.widget.EditText r4 = r2.H
                r4.setContentDescription(r5)
                com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen r4 = r3.f21802a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.k2()
                goto L_0x0050
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.g.a(java.lang.String, int):void");
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21803a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f21803a = lVar;
        }

        public final pl.c a() {
            return this.f21803a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21803a.invoke(obj);
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

    public LearnerLicenceAddressScreen() {
    }

    /* access modifiers changed from: private */
    public static final void A2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.G2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void B2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.H2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void C2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.I2("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        List list = learnerLicenceAddressScreen.O;
        if (list != null && (!list.isEmpty())) {
            switch (i10) {
                case R.id.dl_permanent_town_rb:
                    str = "U";
                    break;
                case R.id.dl_permanent_village_rb:
                    str = "R";
                    break;
                default:
                    return;
            }
            learnerLicenceAddressScreen.f21770b0 = str;
            learnerLicenceAddressScreen.l2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, CompoundButton compoundButton, boolean z10) {
        boolean z11;
        EditText editText;
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        c5 c5Var = null;
        if (z10) {
            try {
                learnerLicenceAddressScreen.L2();
                c5 c5Var2 = learnerLicenceAddressScreen.G;
                if (c5Var2 == null) {
                    cm.l.v("binding");
                    c5Var2 = null;
                }
                z11 = false;
                c5Var2.G.setEnabled(false);
                c5 c5Var3 = learnerLicenceAddressScreen.G;
                if (c5Var3 == null) {
                    cm.l.v("binding");
                    c5Var3 = null;
                }
                c5Var3.F.setEnabled(false);
                c5 c5Var4 = learnerLicenceAddressScreen.G;
                if (c5Var4 == null) {
                    cm.l.v("binding");
                    c5Var4 = null;
                }
                c5Var4.E.setEnabled(false);
                c5 c5Var5 = learnerLicenceAddressScreen.G;
                if (c5Var5 == null) {
                    cm.l.v("binding");
                    c5Var5 = null;
                }
                c5Var5.H.setEnabled(false);
                c5 c5Var6 = learnerLicenceAddressScreen.G;
                if (c5Var6 == null) {
                    cm.l.v("binding");
                    c5Var6 = null;
                }
                c5Var6.B.setEnabled(false);
                c5 c5Var7 = learnerLicenceAddressScreen.G;
                if (c5Var7 == null) {
                    cm.l.v("binding");
                    c5Var7 = null;
                }
                c5Var7.A.setEnabled(false);
                c5 c5Var8 = learnerLicenceAddressScreen.G;
                if (c5Var8 == null) {
                    cm.l.v("binding");
                    c5Var8 = null;
                }
                c5Var8.D.setEnabled(false);
                c5 c5Var9 = learnerLicenceAddressScreen.G;
                if (c5Var9 == null) {
                    cm.l.v("binding");
                    c5Var9 = null;
                }
                editText = c5Var9.C;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        } else {
            learnerLicenceAddressScreen.T = new DlAddress("", "", "", "", "", "", "", "");
            c5 c5Var10 = learnerLicenceAddressScreen.G;
            if (c5Var10 == null) {
                cm.l.v("binding");
                c5Var10 = null;
            }
            c5Var10.F.setText("");
            c5 c5Var11 = learnerLicenceAddressScreen.G;
            if (c5Var11 == null) {
                cm.l.v("binding");
                c5Var11 = null;
            }
            c5Var11.E.setText("");
            c5 c5Var12 = learnerLicenceAddressScreen.G;
            if (c5Var12 == null) {
                cm.l.v("binding");
                c5Var12 = null;
            }
            c5Var12.H.setText("");
            c5 c5Var13 = learnerLicenceAddressScreen.G;
            if (c5Var13 == null) {
                cm.l.v("binding");
                c5Var13 = null;
            }
            c5Var13.A.setText("");
            c5 c5Var14 = learnerLicenceAddressScreen.G;
            if (c5Var14 == null) {
                cm.l.v("binding");
                c5Var14 = null;
            }
            c5Var14.D.setText("");
            c5 c5Var15 = learnerLicenceAddressScreen.G;
            if (c5Var15 == null) {
                cm.l.v("binding");
                c5Var15 = null;
            }
            c5Var15.B.setText("");
            c5 c5Var16 = learnerLicenceAddressScreen.G;
            if (c5Var16 == null) {
                cm.l.v("binding");
                c5Var16 = null;
            }
            c5Var16.C.setText("");
            c5 c5Var17 = learnerLicenceAddressScreen.G;
            if (c5Var17 == null) {
                cm.l.v("binding");
                c5Var17 = null;
            }
            z11 = true;
            c5Var17.G.setEnabled(true);
            c5 c5Var18 = learnerLicenceAddressScreen.G;
            if (c5Var18 == null) {
                cm.l.v("binding");
                c5Var18 = null;
            }
            c5Var18.F.setEnabled(true);
            c5 c5Var19 = learnerLicenceAddressScreen.G;
            if (c5Var19 == null) {
                cm.l.v("binding");
                c5Var19 = null;
            }
            c5Var19.E.setEnabled(true);
            c5 c5Var20 = learnerLicenceAddressScreen.G;
            if (c5Var20 == null) {
                cm.l.v("binding");
                c5Var20 = null;
            }
            c5Var20.H.setEnabled(true);
            c5 c5Var21 = learnerLicenceAddressScreen.G;
            if (c5Var21 == null) {
                cm.l.v("binding");
                c5Var21 = null;
            }
            c5Var21.B.setEnabled(true);
            c5 c5Var22 = learnerLicenceAddressScreen.G;
            if (c5Var22 == null) {
                cm.l.v("binding");
                c5Var22 = null;
            }
            c5Var22.A.setEnabled(true);
            c5 c5Var23 = learnerLicenceAddressScreen.G;
            if (c5Var23 == null) {
                cm.l.v("binding");
                c5Var23 = null;
            }
            c5Var23.D.setEnabled(true);
            c5 c5Var24 = learnerLicenceAddressScreen.G;
            if (c5Var24 == null) {
                cm.l.v("binding");
                c5Var24 = null;
            }
            editText = c5Var24.C;
        }
        editText.setEnabled(z11);
        c5 c5Var25 = learnerLicenceAddressScreen.G;
        if (c5Var25 == null) {
            cm.l.v("binding");
            c5Var25 = null;
        }
        c5Var25.z(learnerLicenceAddressScreen.T);
        c5 c5Var26 = learnerLicenceAddressScreen.G;
        if (c5Var26 == null) {
            cm.l.v("binding");
        } else {
            c5Var = c5Var26;
        }
        c5Var.a();
    }

    /* access modifiers changed from: private */
    public static final void F2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (learnerLicenceAddressScreen.u2()) {
            Intent intent = new Intent(learnerLicenceAddressScreen, LearnerLicenseTrainingScreen.class);
            intent.putExtra("stateCd", learnerLicenceAddressScreen.f21771c0);
            intent.putExtra("rtoCd", learnerLicenceAddressScreen.f21772d0);
            intent.putExtra("rtoName", learnerLicenceAddressScreen.f21773e0);
            intent.putExtra("applicantFName", learnerLicenceAddressScreen.f21774f0);
            intent.putExtra("applicantMName", learnerLicenceAddressScreen.f21775g0);
            intent.putExtra("applicantLName", learnerLicenceAddressScreen.f21776h0);
            intent.putExtra("fullName", learnerLicenceAddressScreen.f21777i0);
            intent.putExtra("relationship", learnerLicenceAddressScreen.f21778j0);
            intent.putExtra("relationFName", learnerLicenceAddressScreen.f21779k0);
            intent.putExtra("relationMName", learnerLicenceAddressScreen.f21780l0);
            intent.putExtra("relationLName", learnerLicenceAddressScreen.f21781m0);
            intent.putExtra("gender", learnerLicenceAddressScreen.f21782n0);
            intent.putExtra("dob", learnerLicenceAddressScreen.f21783o0);
            intent.putExtra("placeOfBirth", learnerLicenceAddressScreen.f21784p0);
            intent.putExtra("country", learnerLicenceAddressScreen.f21785q0);
            intent.putExtra("educationQualification", learnerLicenceAddressScreen.f21786r0);
            intent.putExtra("bloodGroup", learnerLicenceAddressScreen.f21787s0);
            intent.putExtra("landlineNo", learnerLicenceAddressScreen.f21793y0);
            intent.putExtra("emailId", learnerLicenceAddressScreen.f21789u0);
            intent.putExtra("applicantMobileNo", learnerLicenceAddressScreen.f21788t0);
            intent.putExtra("altMobileNo", learnerLicenceAddressScreen.f21790v0);
            intent.putExtra("identificationMark1", learnerLicenceAddressScreen.f21791w0);
            intent.putExtra("identificationMark2", learnerLicenceAddressScreen.f21792x0);
            intent.putExtra("enteredAge", learnerLicenceAddressScreen.f21794z0);
            c5 c5Var = learnerLicenceAddressScreen.G;
            Aadarkyc.DOEkyc dOEkyc = null;
            if (c5Var == null) {
                cm.l.v("binding");
                c5Var = null;
            }
            intent.putExtra("presHouseNo", c5Var.L.getText().toString());
            c5 c5Var2 = learnerLicenceAddressScreen.G;
            if (c5Var2 == null) {
                cm.l.v("binding");
                c5Var2 = null;
            }
            intent.putExtra("presStreet", c5Var2.P.getText().toString());
            c5 c5Var3 = learnerLicenceAddressScreen.G;
            if (c5Var3 == null) {
                cm.l.v("binding");
                c5Var3 = null;
            }
            intent.putExtra("presLocation", c5Var3.N.getText().toString());
            intent.putExtra("presVillageOrTown", learnerLicenceAddressScreen.S.getVillageOrTown());
            intent.putExtra("presSubDistrict", learnerLicenceAddressScreen.S.getSubDistrict());
            intent.putExtra("presDistrict", learnerLicenceAddressScreen.S.getDistrict());
            intent.putExtra("presState", learnerLicenceAddressScreen.d2());
            c5 c5Var4 = learnerLicenceAddressScreen.G;
            if (c5Var4 == null) {
                cm.l.v("binding");
                c5Var4 = null;
            }
            intent.putExtra("presPincode", c5Var4.O.getText().toString());
            intent.putExtra("preSelectedVillOrTown", learnerLicenceAddressScreen.f21769a0);
            c5 c5Var5 = learnerLicenceAddressScreen.G;
            if (c5Var5 == null) {
                cm.l.v("binding");
                c5Var5 = null;
            }
            intent.putExtra("perHouseNo", c5Var5.A.getText().toString());
            c5 c5Var6 = learnerLicenceAddressScreen.G;
            if (c5Var6 == null) {
                cm.l.v("binding");
                c5Var6 = null;
            }
            intent.putExtra("perStreet", c5Var6.D.getText().toString());
            c5 c5Var7 = learnerLicenceAddressScreen.G;
            if (c5Var7 == null) {
                cm.l.v("binding");
                c5Var7 = null;
            }
            intent.putExtra("perLocation", c5Var7.B.getText().toString());
            intent.putExtra("permVillageOrTown", learnerLicenceAddressScreen.T.getVillageOrTown());
            intent.putExtra("perSubDistrict", learnerLicenceAddressScreen.T.getSubDistrict());
            intent.putExtra("perDistrict", learnerLicenceAddressScreen.T.getDistrict());
            intent.putExtra("perState", learnerLicenceAddressScreen.j2());
            c5 c5Var8 = learnerLicenceAddressScreen.G;
            if (c5Var8 == null) {
                cm.l.v("binding");
                c5Var8 = null;
            }
            intent.putExtra("perPinCode", c5Var8.O.getText().toString());
            intent.putExtra("permSelectedVillOrTown", learnerLicenceAddressScreen.f21770b0);
            intent.putExtra("permanentAdd", learnerLicenceAddressScreen.T);
            c5 c5Var9 = learnerLicenceAddressScreen.G;
            if (c5Var9 == null) {
                cm.l.v("binding");
                c5Var9 = null;
            }
            intent.putExtra("year", String.valueOf(c5Var9.f25620t0.getText()));
            c5 c5Var10 = learnerLicenceAddressScreen.G;
            if (c5Var10 == null) {
                cm.l.v("binding");
                c5Var10 = null;
            }
            intent.putExtra("month", String.valueOf(c5Var10.V.getText()));
            if (learnerLicenceAddressScreen.C0) {
                Aadarkyc.DOEkyc dOEkyc2 = learnerLicenceAddressScreen.A0;
                if (dOEkyc2 == null) {
                    cm.l.v("aadharData");
                } else {
                    dOEkyc = dOEkyc2;
                }
                intent.putExtra("aadharData", dOEkyc);
                intent.putExtra("ekycId", learnerLicenceAddressScreen.B0);
                intent.putExtra("dataFromAadhar", learnerLicenceAddressScreen.C0);
            }
            learnerLicenceAddressScreen.startActivity(intent);
        }
    }

    private final void G2(String str) {
        try {
            this.R = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.R, "dl-renewal-current-address")) {
                List<DistrictsMasterItem> list = this.L;
                if (list != null) {
                    for (DistrictsMasterItem districtsMasterItem : list) {
                        arrayList.add(String.valueOf(districtsMasterItem != null ? districtsMasterItem.getDistName() : null));
                    }
                }
            } else {
                List<DistrictsMasterItem> list2 = this.M;
                if (list2 != null) {
                    for (DistrictsMasterItem districtsMasterItem2 : list2) {
                        arrayList.add(String.valueOf(districtsMasterItem2 != null ? districtsMasterItem2.getDistName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Districts", arrayList);
            a10.k2(F0(), "DistPicker");
            a10.n2(new e(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void H2(String str) {
        try {
            this.R = str;
            ArrayList arrayList = new ArrayList();
            String str2 = "R";
            c5 c5Var = null;
            if (cm.l.a(this.R, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.N;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                c5 c5Var2 = this.G;
                if (c5Var2 == null) {
                    cm.l.v("binding");
                } else {
                    c5Var = c5Var2;
                }
                if (c5Var.f25601a0.isChecked()) {
                    str2 = "U";
                }
                this.f21769a0 = str2;
            } else {
                List<TalukaMasterItem> list2 = this.O;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                c5 c5Var3 = this.G;
                if (c5Var3 == null) {
                    cm.l.v("binding");
                } else {
                    c5Var = c5Var3;
                }
                if (c5Var.I.isChecked()) {
                    str2 = "U";
                }
                this.f21770b0 = str2;
            }
            kk.e a10 = kk.e.A0.a("Select Taluka", arrayList);
            a10.k2(F0(), "TalukaPicker");
            a10.n2(new f(this, str2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void I2(String str) {
        try {
            this.R = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.R, "dl-renewal-current-address")) {
                List<VillageOrTownMasterItem> list = this.P;
                if (list != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem : list) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem != null ? villageOrTownMasterItem.getVillageName() : null));
                    }
                }
            } else {
                List<VillageOrTownMasterItem> list2 = this.Q;
                if (list2 != null) {
                    for (VillageOrTownMasterItem villageOrTownMasterItem2 : list2) {
                        arrayList.add(String.valueOf(villageOrTownMasterItem2 != null ? villageOrTownMasterItem2.getVillageName() : null));
                    }
                }
            }
            kk.e a10 = kk.e.A0.a("Select Village/Town", arrayList);
            a10.k2(F0(), "VillageTownPicker");
            a10.n2(new g(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void J2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new k2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void K2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void L2() {
        RadioButton radioButton;
        try {
            this.T = this.S;
            R2(d2());
            c5 c5Var = this.G;
            c5 c5Var2 = null;
            if (c5Var == null) {
                cm.l.v("binding");
                c5Var = null;
            }
            EditText editText = c5Var.G;
            c5 c5Var3 = this.G;
            if (c5Var3 == null) {
                cm.l.v("binding");
                c5Var3 = null;
            }
            editText.setText(c5Var3.f25625z.getText());
            c5 c5Var4 = this.G;
            if (c5Var4 == null) {
                cm.l.v("binding");
                c5Var4 = null;
            }
            EditText editText2 = c5Var4.F;
            c5 c5Var5 = this.G;
            if (c5Var5 == null) {
                cm.l.v("binding");
                c5Var5 = null;
            }
            editText2.setText(c5Var5.f25624y.getText());
            c5 c5Var6 = this.G;
            if (c5Var6 == null) {
                cm.l.v("binding");
                c5Var6 = null;
            }
            EditText editText3 = c5Var6.E;
            c5 c5Var7 = this.G;
            if (c5Var7 == null) {
                cm.l.v("binding");
                c5Var7 = null;
            }
            editText3.setText(c5Var7.f25623x.getText());
            c5 c5Var8 = this.G;
            if (c5Var8 == null) {
                cm.l.v("binding");
                c5Var8 = null;
            }
            EditText editText4 = c5Var8.H;
            c5 c5Var9 = this.G;
            if (c5Var9 == null) {
                cm.l.v("binding");
                c5Var9 = null;
            }
            editText4.setText(c5Var9.M.getText());
            c5 c5Var10 = this.G;
            if (c5Var10 == null) {
                cm.l.v("binding");
                c5Var10 = null;
            }
            EditText editText5 = c5Var10.A;
            c5 c5Var11 = this.G;
            if (c5Var11 == null) {
                cm.l.v("binding");
                c5Var11 = null;
            }
            editText5.setText(c5Var11.L.getText());
            c5 c5Var12 = this.G;
            if (c5Var12 == null) {
                cm.l.v("binding");
                c5Var12 = null;
            }
            EditText editText6 = c5Var12.D;
            c5 c5Var13 = this.G;
            if (c5Var13 == null) {
                cm.l.v("binding");
                c5Var13 = null;
            }
            editText6.setText(c5Var13.P.getText());
            c5 c5Var14 = this.G;
            if (c5Var14 == null) {
                cm.l.v("binding");
                c5Var14 = null;
            }
            EditText editText7 = c5Var14.B;
            c5 c5Var15 = this.G;
            if (c5Var15 == null) {
                cm.l.v("binding");
                c5Var15 = null;
            }
            editText7.setText(c5Var15.N.getText());
            c5 c5Var16 = this.G;
            if (c5Var16 == null) {
                cm.l.v("binding");
                c5Var16 = null;
            }
            EditText editText8 = c5Var16.C;
            c5 c5Var17 = this.G;
            if (c5Var17 == null) {
                cm.l.v("binding");
                c5Var17 = null;
            }
            editText8.setText(c5Var17.O.getText());
            c5 c5Var18 = this.G;
            if (c5Var18 == null) {
                cm.l.v("binding");
                c5Var18 = null;
            }
            if (c5Var18.f25618r0.isChecked()) {
                c5 c5Var19 = this.G;
                if (c5Var19 == null) {
                    cm.l.v("binding");
                } else {
                    c5Var2 = c5Var19;
                }
                radioButton = c5Var2.J;
            } else {
                c5 c5Var20 = this.G;
                if (c5Var20 == null) {
                    cm.l.v("binding");
                    c5Var20 = null;
                }
                if (c5Var20.f25601a0.isChecked()) {
                    c5 c5Var21 = this.G;
                    if (c5Var21 == null) {
                        cm.l.v("binding");
                    } else {
                        c5Var2 = c5Var21;
                    }
                    radioButton = c5Var2.I;
                }
                this.f21770b0 = this.f21769a0;
            }
            radioButton.setChecked(true);
            this.f21770b0 = this.f21769a0;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [ni.c5] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void U2() {
        /*
            r7 = this;
            boolean r0 = r7.C0
            r1 = 0
            java.lang.String r2 = "binding"
            r3 = 0
            if (r0 == 0) goto L_0x0293
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0010
            cm.l.v(r2)
            r0 = r3
        L_0x0010:
            android.widget.CheckBox r0 = r0.X
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x001d
            cm.l.v(r2)
            r0 = r3
        L_0x001d:
            android.widget.CheckBox r0 = r0.X
            r0.setClickable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x002a
            cm.l.v(r2)
            r0 = r3
        L_0x002a:
            android.widget.CheckBox r0 = r0.X
            r0.setChecked(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0037
            cm.l.v(r2)
            r0 = r3
        L_0x0037:
            android.widget.EditText r0 = r0.A
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0044
            cm.l.v(r2)
            r0 = r3
        L_0x0044:
            android.widget.EditText r0 = r0.B
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0051
            cm.l.v(r2)
            r0 = r3
        L_0x0051:
            android.widget.EditText r0 = r0.D
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x005e
            cm.l.v(r2)
            r0 = r3
        L_0x005e:
            android.widget.EditText r0 = r0.C
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x006b
            cm.l.v(r2)
            r0 = r3
        L_0x006b:
            android.widget.EditText r0 = r0.F
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0078
            cm.l.v(r2)
            r0 = r3
        L_0x0078:
            android.widget.EditText r0 = r0.F
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0085
            cm.l.v(r2)
            r0 = r3
        L_0x0085:
            android.widget.EditText r0 = r0.E
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0092
            cm.l.v(r2)
            r0 = r3
        L_0x0092:
            android.widget.EditText r0 = r0.E
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x009f
            cm.l.v(r2)
            r0 = r3
        L_0x009f:
            android.widget.EditText r0 = r0.H
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x00ac
            cm.l.v(r2)
            r0 = r3
        L_0x00ac:
            android.widget.RadioButton r0 = r0.J
            r0.setClickable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x00b9
            cm.l.v(r2)
            r0 = r3
        L_0x00b9:
            android.widget.RadioButton r0 = r0.J
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x00c6
            cm.l.v(r2)
            r0 = r3
        L_0x00c6:
            android.widget.RadioButton r0 = r0.I
            r0.setEnabled(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x00d3
            cm.l.v(r2)
            r0 = r3
        L_0x00d3:
            android.widget.RadioButton r0 = r0.I
            r0.setClickable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x00e0
            cm.l.v(r2)
            r0 = r3
        L_0x00e0:
            android.widget.EditText r0 = r0.H
            r0.setFocusable(r1)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.A0
            java.lang.String r1 = "aadharData"
            if (r0 != 0) goto L_0x00ef
            cm.l.v(r1)
            r0 = r3
        L_0x00ef:
            java.lang.String r0 = r0.getHouse()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x012b
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0101
            cm.l.v(r2)
            r0 = r3
        L_0x0101:
            android.widget.EditText r0 = r0.A
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x010b
            cm.l.v(r1)
            r4 = r3
        L_0x010b:
            java.lang.String r4 = r4.getHouse()
            r0.setText(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x011a
            cm.l.v(r2)
            r0 = r3
        L_0x011a:
            android.widget.EditText r0 = r0.L
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x0124
            cm.l.v(r1)
            r4 = r3
        L_0x0124:
            java.lang.String r4 = r4.getHouse()
            r0.setText(r4)
        L_0x012b:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.A0
            if (r0 != 0) goto L_0x0133
            cm.l.v(r1)
            r0 = r3
        L_0x0133:
            java.lang.String r0 = r0.getLocalityIfAny()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x016f
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0145
            cm.l.v(r2)
            r0 = r3
        L_0x0145:
            android.widget.EditText r0 = r0.D
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x014f
            cm.l.v(r1)
            r4 = r3
        L_0x014f:
            java.lang.String r4 = r4.getLocalityIfAny()
            r0.setText(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x015e
            cm.l.v(r2)
            r0 = r3
        L_0x015e:
            android.widget.EditText r0 = r0.P
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x0168
            cm.l.v(r1)
            r4 = r3
        L_0x0168:
            java.lang.String r4 = r4.getLocalityIfAny()
            r0.setText(r4)
        L_0x016f:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.A0
            if (r0 != 0) goto L_0x0177
            cm.l.v(r1)
            r0 = r3
        L_0x0177:
            java.lang.String r0 = r0.getLandMark()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x01b5
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0189
            cm.l.v(r2)
            r0 = r3
        L_0x0189:
            android.widget.EditText r0 = r0.B
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x0193
            cm.l.v(r1)
            r4 = r3
        L_0x0193:
            java.lang.String r4 = r4.getLandMark()
            r0.setText(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x01a2
            cm.l.v(r2)
            r0 = r3
        L_0x01a2:
            android.widget.EditText r0 = r0.N
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x01ac
            cm.l.v(r1)
            r4 = r3
        L_0x01ac:
            java.lang.String r4 = r4.getLandMark()
        L_0x01b0:
            r0.setText(r4)
            goto L_0x0248
        L_0x01b5:
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x01bd
            cm.l.v(r2)
            r0 = r3
        L_0x01bd:
            android.widget.EditText r0 = r0.B
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r7.A0
            if (r5 != 0) goto L_0x01cc
            cm.l.v(r1)
            r5 = r3
        L_0x01cc:
            java.lang.String r5 = r5.getLocalityIfAny()
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.A0
            if (r6 != 0) goto L_0x01e0
            cm.l.v(r1)
            r6 = r3
        L_0x01e0:
            java.lang.String r6 = r6.getDist()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.A0
            if (r6 != 0) goto L_0x01f2
            cm.l.v(r1)
            r6 = r3
        L_0x01f2:
            java.lang.String r6 = r6.getState()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0208
            cm.l.v(r2)
            r0 = r3
        L_0x0208:
            android.widget.EditText r0 = r0.N
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.A0
            if (r6 != 0) goto L_0x0217
            cm.l.v(r1)
            r6 = r3
        L_0x0217:
            java.lang.String r6 = r6.getLocalityIfAny()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.A0
            if (r6 != 0) goto L_0x0229
            cm.l.v(r1)
            r6 = r3
        L_0x0229:
            java.lang.String r6 = r6.getDist()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r7.A0
            if (r5 != 0) goto L_0x023b
            cm.l.v(r1)
            r5 = r3
        L_0x023b:
            java.lang.String r5 = r5.getState()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x01b0
        L_0x0248:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.A0
            if (r0 != 0) goto L_0x0250
            cm.l.v(r1)
            r0 = r3
        L_0x0250:
            java.lang.String r0 = r0.getPincode()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x028d
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0262
            cm.l.v(r2)
            r0 = r3
        L_0x0262:
            android.widget.EditText r0 = r0.C
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.A0
            if (r4 != 0) goto L_0x026c
            cm.l.v(r1)
            r4 = r3
        L_0x026c:
            java.lang.String r4 = r4.getPincode()
            r0.setText(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x027b
            cm.l.v(r2)
            r0 = r3
        L_0x027b:
            android.widget.EditText r0 = r0.O
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r7.A0
            if (r2 != 0) goto L_0x0285
            cm.l.v(r1)
            goto L_0x0286
        L_0x0285:
            r3 = r2
        L_0x0286:
            java.lang.String r1 = r3.getPincode()
            r0.setText(r1)
        L_0x028d:
            java.lang.String r0 = "dl-renewal-current-address"
            r7.R = r0
            goto L_0x0365
        L_0x0293:
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x029b
            cm.l.v(r2)
            r0 = r3
        L_0x029b:
            android.widget.CheckBox r0 = r0.X
            r4 = 1
            r0.setEnabled(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02a9
            cm.l.v(r2)
            r0 = r3
        L_0x02a9:
            android.widget.CheckBox r0 = r0.X
            r0.setClickable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02b6
            cm.l.v(r2)
            r0 = r3
        L_0x02b6:
            android.widget.EditText r0 = r0.A
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02c3
            cm.l.v(r2)
            r0 = r3
        L_0x02c3:
            android.widget.EditText r0 = r0.B
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02d0
            cm.l.v(r2)
            r0 = r3
        L_0x02d0:
            android.widget.EditText r0 = r0.D
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02dd
            cm.l.v(r2)
            r0 = r3
        L_0x02dd:
            android.widget.EditText r0 = r0.C
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02ea
            cm.l.v(r2)
            r0 = r3
        L_0x02ea:
            android.widget.EditText r0 = r0.F
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x02f7
            cm.l.v(r2)
            r0 = r3
        L_0x02f7:
            android.widget.EditText r0 = r0.F
            r0.setEnabled(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0304
            cm.l.v(r2)
            r0 = r3
        L_0x0304:
            android.widget.EditText r0 = r0.E
            r0.setFocusable(r1)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0311
            cm.l.v(r2)
            r0 = r3
        L_0x0311:
            android.widget.EditText r0 = r0.E
            r0.setEnabled(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x031e
            cm.l.v(r2)
            r0 = r3
        L_0x031e:
            android.widget.RadioButton r0 = r0.J
            r0.setClickable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x032b
            cm.l.v(r2)
            r0 = r3
        L_0x032b:
            android.widget.RadioButton r0 = r0.J
            r0.setEnabled(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0338
            cm.l.v(r2)
            r0 = r3
        L_0x0338:
            android.widget.RadioButton r0 = r0.I
            r0.setEnabled(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0345
            cm.l.v(r2)
            r0 = r3
        L_0x0345:
            android.widget.RadioButton r0 = r0.I
            r0.setClickable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x0352
            cm.l.v(r2)
            r0 = r3
        L_0x0352:
            android.widget.EditText r0 = r0.H
            r0.setFocusable(r4)
            ni.c5 r0 = r7.G
            if (r0 != 0) goto L_0x035f
            cm.l.v(r2)
            goto L_0x0360
        L_0x035f:
            r3 = r0
        L_0x0360:
            android.widget.EditText r0 = r3.H
            r0.setEnabled(r4)
        L_0x0365:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.U2():void");
    }

    private final void V1() {
        this.H = (c0) new u0(this).a(c0.class);
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            i2().show();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c0Var.m();
            return;
        }
        Toast.makeText(h2(), o2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    private final void W1() {
        c0 c0Var = this.H;
        c0 c0Var2 = null;
        if (c0Var == null) {
            cm.l.v("viewModel");
            c0Var = null;
        }
        c0Var.i().g(this, new h(new a(this)));
        c0 c0Var3 = this.H;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.h().g(this, new h(new b(this)));
        c0 c0Var4 = this.H;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
            c0Var4 = null;
        }
        c0Var4.k().g(this, new h(new c(this)));
        c0 c0Var5 = this.H;
        if (c0Var5 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var2 = c0Var5;
        }
        c0Var2.l().g(this, new h(new d(this)));
    }

    /* access modifiers changed from: private */
    public final void X1() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.f25624y.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.f25624y.setHint(o2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.N = q.i();
        Y1();
    }

    /* access modifiers changed from: private */
    public final void Y1() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.f25623x.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.f25623x.setHint(o2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.N = q.i();
        Z1();
        Z1();
    }

    private final void Z1() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.M.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.M.setHint(o2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.P = q.i();
    }

    /* access modifiers changed from: private */
    public final void a2() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.F.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.F.setHint(o2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.M = q.i();
        b2();
    }

    /* access modifiers changed from: private */
    public final void b2() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.E.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.E.setHint(o2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.O = q.i();
        c2();
    }

    private final void c2() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.H.setText("");
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.H.setHint(o2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.Q = q.i();
    }

    /* access modifiers changed from: private */
    public final void e2(String str) {
        try {
            c5 c5Var = this.G;
            c5 c5Var2 = null;
            if (c5Var == null) {
                cm.l.v("binding");
                c5Var = null;
            }
            String obj = c5Var.f25623x.getContentDescription().toString();
            Z1();
            i2().dismiss();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c5 c5Var3 = this.G;
            if (c5Var3 == null) {
                cm.l.v("binding");
                c5Var3 = null;
            }
            String obj2 = c5Var3.f25625z.getContentDescription().toString();
            c5 c5Var4 = this.G;
            if (c5Var4 == null) {
                cm.l.v("binding");
            } else {
                c5Var2 = c5Var4;
            }
            c0Var.o(obj2, c5Var2.f25624y.getContentDescription().toString(), obj, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void f2() {
        String stringExtra = getIntent().getStringExtra("stateCd");
        cm.l.c(stringExtra);
        this.f21771c0 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("rtoCd");
        cm.l.c(stringExtra2);
        this.f21772d0 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("rtoName");
        cm.l.c(stringExtra3);
        this.f21773e0 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("applicantFName");
        cm.l.c(stringExtra4);
        this.f21774f0 = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicantMName");
        cm.l.c(stringExtra5);
        this.f21775g0 = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("applicantLName");
        cm.l.c(stringExtra6);
        this.f21776h0 = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("fullName");
        cm.l.c(stringExtra7);
        this.f21777i0 = stringExtra7;
        String stringExtra8 = getIntent().getStringExtra("relationship");
        cm.l.c(stringExtra8);
        this.f21778j0 = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("relationFName");
        cm.l.c(stringExtra9);
        this.f21779k0 = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("relationMName");
        cm.l.c(stringExtra10);
        this.f21780l0 = stringExtra10;
        String stringExtra11 = getIntent().getStringExtra("relationLName");
        cm.l.c(stringExtra11);
        this.f21781m0 = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("gender");
        cm.l.c(stringExtra12);
        this.f21782n0 = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("dob");
        cm.l.c(stringExtra13);
        this.f21783o0 = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("placeOfBirth");
        cm.l.c(stringExtra14);
        this.f21784p0 = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("country");
        cm.l.c(stringExtra15);
        this.f21785q0 = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("educationQualification");
        cm.l.c(stringExtra16);
        this.f21786r0 = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("bloodGroup");
        cm.l.c(stringExtra17);
        this.f21787s0 = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("applicantMobileNo");
        cm.l.c(stringExtra18);
        this.f21788t0 = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("emailId");
        cm.l.c(stringExtra19);
        this.f21789u0 = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("altMobileNo");
        cm.l.c(stringExtra20);
        this.f21790v0 = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("landlineNo");
        cm.l.c(stringExtra21);
        this.f21793y0 = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("identificationMark1");
        cm.l.c(stringExtra22);
        this.f21791w0 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("identificationMark2");
        cm.l.c(stringExtra23);
        this.f21792x0 = stringExtra23;
        this.f21794z0 = getIntent().getIntExtra("enteredAge", 0);
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.f25625z.setText(this.f21771c0);
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var3;
        }
        c5Var2.G.setText(this.f21771c0);
        if (getIntent().hasExtra("dataFromAadhar") && getIntent().getBooleanExtra("dataFromAadhar", false)) {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("aadharData");
            cm.l.c(parcelableExtra);
            this.A0 = (Aadarkyc.DOEkyc) parcelableExtra;
            this.B0 = getIntent().getLongExtra("ekycId", 0);
            this.C0 = getIntent().getBooleanExtra("dataFromAadhar", false);
        }
        U2();
    }

    /* access modifiers changed from: private */
    public final void l2(String str) {
        try {
            c5 c5Var = this.G;
            c5 c5Var2 = null;
            if (c5Var == null) {
                cm.l.v("binding");
                c5Var = null;
            }
            String obj = c5Var.E.getContentDescription().toString();
            c2();
            c0 c0Var = this.H;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            c5 c5Var3 = this.G;
            if (c5Var3 == null) {
                cm.l.v("binding");
                c5Var3 = null;
            }
            String obj2 = c5Var3.G.getContentDescription().toString();
            c5 c5Var4 = this.G;
            if (c5Var4 == null) {
                cm.l.v("binding");
            } else {
                c5Var2 = c5Var4;
            }
            c0Var.o(obj2, c5Var2.F.getContentDescription().toString(), obj, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void p2() {
        P2(this);
        T2(new ld.c(h2()));
        S2(new ld.f(h2()));
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.U.f28452f.setText(n2().i());
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
            c5Var3 = null;
        }
        c5Var3.U.f28448b.setOnClickListener(new h2(this));
        Q2(new ProgressDialog(h2()));
        i2().setMessage(o2().b("label_challan_please_wait", getString(R.string.please_wait)));
        i2().setCancelable(false);
        i2().setCanceledOnTouchOutside(false);
        O2(ClInter.f7830a.a(h2()));
        N2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(g2()))).a(t9.a.class));
        c5 c5Var4 = this.G;
        if (c5Var4 == null) {
            cm.l.v("binding");
            c5Var4 = null;
        }
        c5Var4.S.setOnClickListener(new i2(this));
        c5 c5Var5 = this.G;
        if (c5Var5 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var5;
        }
        c5Var2.f25622w.setOnClickListener(new j2(this));
    }

    /* access modifiers changed from: private */
    public static final void q2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        learnerLicenceAddressScreen.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void r2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        Object systemService = learnerLicenceAddressScreen.getSystemService("layout_inflater");
        cm.l.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        c5 c5Var = null;
        View inflate = ((LayoutInflater) systemService).inflate(R.layout.dialog_info, (ViewGroup) null);
        cm.l.e(inflate, "inflate(...)");
        PopupWindow popupWindow = new PopupWindow(inflate, (int) (((double) learnerLicenceAddressScreen.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        ((ImageView) inflate.findViewById(R.id.closeIv)).setOnClickListener(new l2(popupWindow));
        ((TextView) inflate.findViewById(R.id.infoMessageTv)).setText(learnerLicenceAddressScreen.o2().b("below_line_print_on_dl", "The Address 3 & Pincode lines will be printed on driving licence"));
        c5 c5Var2 = learnerLicenceAddressScreen.G;
        if (c5Var2 == null) {
            cm.l.v("binding");
        } else {
            c5Var = c5Var2;
        }
        popupWindow.showAsDropDown(c5Var.Z, 0, 10);
    }

    /* access modifiers changed from: private */
    public static final void s2(PopupWindow popupWindow, View view) {
        cm.l.f(popupWindow, "$popupWindow");
        popupWindow.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        learnerLicenceAddressScreen.startActivity(new Intent(learnerLicenceAddressScreen, LearnerLicenceAadharScreen.class));
        learnerLicenceAddressScreen.finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ef, code lost:
        if (r0.length() == 0) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean u2() {
        /*
            r9 = this;
            ni.c5 r0 = r9.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.f25625z
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = "getText(...)"
            cm.l.e(r0, r3)
            int r0 = r0.length()
            r4 = 0
            if (r0 != 0) goto L_0x0036
            ld.c r0 = r9.o2()
            r1 = 2132019090(0x7f140792, float:1.9676505E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_state"
        L_0x002a:
            java.lang.String r0 = r0.b(r2, r1)
        L_0x002e:
            android.widget.Toast r0 = android.widget.Toast.makeText(r9, r0, r4)
            r0.show()
            return r4
        L_0x0036:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x003e
            cm.l.v(r2)
            r0 = r1
        L_0x003e:
            android.widget.EditText r0 = r0.f25624y
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x005b
            ld.c r0 = r9.o2()
            r1 = 2132019072(0x7f140780, float:1.9676469E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_district"
            goto L_0x002a
        L_0x005b:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x0063
            cm.l.v(r2)
            r0 = r1
        L_0x0063:
            android.widget.EditText r0 = r0.f25623x
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0080
            ld.c r0 = r9.o2()
            r1 = 2132019092(0x7f140794, float:1.967651E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_taluka"
            goto L_0x002a
        L_0x0080:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x0088
            cm.l.v(r2)
            r0 = r1
        L_0x0088:
            android.widget.EditText r0 = r0.N
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00a5
            ld.c r0 = r9.o2()
            r1 = 2132019057(0x7f140771, float:1.9676438E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_landmark"
            goto L_0x002a
        L_0x00a5:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x00ad
            cm.l.v(r2)
            r0 = r1
        L_0x00ad:
            android.widget.EditText r0 = r0.O
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x00cb
            ld.c r0 = r9.o2()
            r1 = 2132017880(0x7f1402d8, float:1.967405E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_pincode"
            goto L_0x002a
        L_0x00cb:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x00d3
            cm.l.v(r2)
            r0 = r1
        L_0x00d3:
            android.widget.EditText r0 = r0.O
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            r5 = 2132017809(0x7f140291, float:1.9673907E38)
            java.lang.String r6 = "select_pin_code"
            r7 = 6
            if (r0 >= r7) goto L_0x00f3
        L_0x00e5:
            ld.c r0 = r9.o2()
            java.lang.String r1 = r9.getString(r5)
            java.lang.String r0 = r0.b(r6, r1)
            goto L_0x002e
        L_0x00f3:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x00fb
            cm.l.v(r2)
            r0 = r1
        L_0x00fb:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.V
            android.text.Editable r0 = r0.getText()
            cm.l.c(r0)
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0132
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x0112
            cm.l.v(r2)
            r0 = r1
        L_0x0112:
            androidx.appcompat.widget.AppCompatEditText r0 = r0.V
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = 11
            if (r0 <= r8) goto L_0x0132
            ld.c r0 = r9.o2()
            java.lang.String r1 = "duration_month_0_12"
            java.lang.String r2 = "Month duration should be 0 to 12"
            java.lang.String r0 = r0.b(r1, r2)
            goto L_0x002e
        L_0x0132:
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x013a
            cm.l.v(r2)
            r0 = r1
        L_0x013a:
            android.widget.EditText r0 = r0.G
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0158
            ld.c r0 = r9.o2()
            r1 = 2132019061(0x7f140775, float:1.9676446E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_pstate"
            goto L_0x002a
        L_0x0158:
            boolean r0 = r9.C0
            if (r0 != 0) goto L_0x0182
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x0164
            cm.l.v(r2)
            r0 = r1
        L_0x0164:
            android.widget.EditText r0 = r0.F
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0182
            ld.c r0 = r9.o2()
            r1 = 2132019058(0x7f140772, float:1.967644E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_pdistrict"
            goto L_0x002a
        L_0x0182:
            boolean r0 = r9.C0
            if (r0 != 0) goto L_0x01ac
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x018e
            cm.l.v(r2)
            r0 = r1
        L_0x018e:
            android.widget.EditText r0 = r0.E
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01ac
            ld.c r0 = r9.o2()
            r1 = 2132019062(0x7f140776, float:1.9676448E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_ptaluka"
            goto L_0x002a
        L_0x01ac:
            boolean r0 = r9.C0
            if (r0 != 0) goto L_0x01d6
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x01b8
            cm.l.v(r2)
            r0 = r1
        L_0x01b8:
            android.widget.EditText r0 = r0.B
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01d6
            ld.c r0 = r9.o2()
            r1 = 2132019059(0x7f140773, float:1.9676442E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_plandmark"
            goto L_0x002a
        L_0x01d6:
            boolean r0 = r9.C0
            if (r0 != 0) goto L_0x01f3
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x01e2
            cm.l.v(r2)
            r0 = r1
        L_0x01e2:
            android.widget.EditText r0 = r0.C
            android.text.Editable r0 = r0.getText()
            cm.l.e(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x01f3
            goto L_0x00e5
        L_0x01f3:
            boolean r0 = r9.C0
            if (r0 != 0) goto L_0x021b
            ni.c5 r0 = r9.G
            if (r0 != 0) goto L_0x01ff
            cm.l.v(r2)
            goto L_0x0200
        L_0x01ff:
            r1 = r0
        L_0x0200:
            android.widget.EditText r0 = r1.C
            android.text.Editable r0 = r0.getText()
            int r0 = r0.length()
            if (r0 >= r7) goto L_0x021b
            ld.c r0 = r9.o2()
            r1 = 2132019063(0x7f140777, float:1.967645E38)
            java.lang.String r1 = r9.getString(r1)
            java.lang.String r2 = "select_ppin_code"
            goto L_0x002a
        L_0x021b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LearnerLicenceAddressScreen.u2():boolean");
    }

    private final void v2() {
        c5 c5Var = this.G;
        c5 c5Var2 = null;
        if (c5Var == null) {
            cm.l.v("binding");
            c5Var = null;
        }
        c5Var.f25624y.setOnClickListener(new g2(this));
        c5 c5Var3 = this.G;
        if (c5Var3 == null) {
            cm.l.v("binding");
            c5Var3 = null;
        }
        c5Var3.f25623x.setOnClickListener(new m2(this));
        c5 c5Var4 = this.G;
        if (c5Var4 == null) {
            cm.l.v("binding");
            c5Var4 = null;
        }
        c5Var4.M.setOnClickListener(new n2(this));
        c5 c5Var5 = this.G;
        if (c5Var5 == null) {
            cm.l.v("binding");
            c5Var5 = null;
        }
        c5Var5.f25619s0.setOnCheckedChangeListener(new o2(this));
        c5 c5Var6 = this.G;
        if (c5Var6 == null) {
            cm.l.v("binding");
            c5Var6 = null;
        }
        c5Var6.F.setOnClickListener(new p2(this));
        c5 c5Var7 = this.G;
        if (c5Var7 == null) {
            cm.l.v("binding");
            c5Var7 = null;
        }
        c5Var7.E.setOnClickListener(new q2(this));
        c5 c5Var8 = this.G;
        if (c5Var8 == null) {
            cm.l.v("binding");
            c5Var8 = null;
        }
        c5Var8.H.setOnClickListener(new r2(this));
        c5 c5Var9 = this.G;
        if (c5Var9 == null) {
            cm.l.v("binding");
            c5Var9 = null;
        }
        c5Var9.K.setOnCheckedChangeListener(new s2(this));
        c5 c5Var10 = this.G;
        if (c5Var10 == null) {
            cm.l.v("binding");
            c5Var10 = null;
        }
        c5Var10.X.setOnCheckedChangeListener(new t2(this));
        c5 c5Var11 = this.G;
        if (c5Var11 == null) {
            cm.l.v("binding");
        } else {
            c5Var2 = c5Var11;
        }
        c5Var2.Y.setOnClickListener(new u2(this));
    }

    /* access modifiers changed from: private */
    public static final void w2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.G2("dl-renewal-current-address");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.H2("dl-renewal-current-address");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, View view) {
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(learnerLicenceAddressScreen)) {
            learnerLicenceAddressScreen.I2("dl-renewal-current-address");
        } else {
            Toast.makeText(learnerLicenceAddressScreen.h2(), learnerLicenceAddressScreen.o2().b("label_log_check_internet", learnerLicenceAddressScreen.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(LearnerLicenceAddressScreen learnerLicenceAddressScreen, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(learnerLicenceAddressScreen, "this$0");
        List list = learnerLicenceAddressScreen.N;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                str = "U";
            } else if (i10 == R.id.village_rb) {
                str = "R";
            } else {
                return;
            }
            learnerLicenceAddressScreen.f21769a0 = str;
            learnerLicenceAddressScreen.e2(str);
        }
    }

    public final void M2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void N2(t9.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.I = aVar;
    }

    public final void O2(ClInter clInter) {
        cm.l.f(clInter, "<set-?>");
        this.J = clInter;
    }

    public final void P2(Context context) {
        cm.l.f(context, "<set-?>");
        this.W = context;
    }

    public final void Q2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.X = progressDialog;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void S2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Z = fVar;
    }

    public final void T2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final String d2() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("currStateCd");
        return null;
    }

    public final ClInter g2() {
        ClInter clInter = this.J;
        if (clInter != null) {
            return clInter;
        }
        cm.l.v("mClInter");
        return null;
    }

    public final Context h2() {
        Context context = this.W;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressDialog i2() {
        ProgressDialog progressDialog = this.X;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String j2() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("perStateCd");
        return null;
    }

    public final DlAddress k2() {
        return this.T;
    }

    public final DlAddress m2() {
        return this.S;
    }

    public final ld.f n2() {
        ld.f fVar = this.Z;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.c o2() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c5 x10 = c5.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        c5 c5Var = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = v9.e.f17509a;
        c5 c5Var2 = this.G;
        if (c5Var2 == null) {
            cm.l.v("binding");
        } else {
            c5Var = c5Var2;
        }
        aVar.a1(this, c5Var);
        f2();
        p2();
        V1();
        W1();
        v2();
    }
}
