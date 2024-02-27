package com.nic.mparivahan.dlservices.ui.coa;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.u;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlCombineServices.CombineReq;
import com.nic.mparivahan.DlCombineServices.CombineServiceInterface;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.AppCatPojo;
import com.nic.mparivahan.dlservices.data.model.DistResponse;
import com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem;
import com.nic.mparivahan.dlservices.data.model.DlAddress;
import com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto;
import com.nic.mparivahan.dlservices.data.model.StateMasterItem;
import com.nic.mparivahan.dlservices.data.model.StateResponse;
import com.nic.mparivahan.dlservices.data.model.TalukaMasterItem;
import com.nic.mparivahan.dlservices.data.model.TalukaResponse;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem;
import com.nic.mparivahan.dlservices.data.model.VillageOrTownResponse;
import com.nic.mparivahan.dlservices.ui.changeName.ChangeOfName;
import com.nic.mparivahan.dlservices.ui.dlextract.DLExtractActivity;
import com.nic.mparivahan.dlservices.ui.dobChange.DobChangeActivity;
import com.nic.mparivahan.dlservices.ui.dublicatedl.DLDuplicateActivity;
import com.nic.mparivahan.dlservices.ui.hillService.HillReligion;
import com.nic.mparivahan.dlservices.ui.idp.DLIdpActivity;
import com.nic.mparivahan.dlservices.ui.renewalofdl.RenewalOfDLActivity;
import com.nic.mparivahan.dlservices.ui.replacementdl.DLReplecementActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import jj.c0;
import jj.s;
import jj.t;
import jj.v;
import kk.e;
import ni.b0;
import pl.x;
import v9.e;

public final class ChangeOfAddressActivity extends oi.g {
    public ArrayList A0;
    public ArrayList B0;
    private boolean C0;
    private int D0;
    private int E0;
    private String F0 = "";
    private ab.d G0;
    public CombineServiceInterface H0;
    /* access modifiers changed from: private */
    public Aadarkyc.DOEkyc I0;
    /* access modifiers changed from: private */
    public c0 J;
    private String J0 = "";
    /* access modifiers changed from: private */
    public List K;
    private String K0 = "";
    /* access modifiers changed from: private */
    public List L;
    public ProgressDialog L0;
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
    public b0 R;
    /* access modifiers changed from: private */
    public String S = "";
    private DlAddress T = new DlAddress("", "", "", "", "", "", "", "");
    private DlAddress U = new DlAddress("", "", "", "", "", "", "", "");
    public String V;
    public String W;
    private String X;
    private String Y;
    private String Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f21955a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f21956b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f21957c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f21958d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f21959e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f21960f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f21961g0 = "0";

    /* renamed from: h0  reason: collision with root package name */
    private HashMap f21962h0 = new HashMap();

    /* renamed from: i0  reason: collision with root package name */
    public DldetobjX f21963i0;

    /* renamed from: j0  reason: collision with root package name */
    public ld.f f21964j0;

    /* renamed from: k0  reason: collision with root package name */
    public ProgressBar f21965k0;

    /* renamed from: l0  reason: collision with root package name */
    public ld.g f21966l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f21967m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f21968n0;

    /* renamed from: o0  reason: collision with root package name */
    private String f21969o0 = "0";

    /* renamed from: p0  reason: collision with root package name */
    public ld.c f21970p0;

    /* renamed from: q0  reason: collision with root package name */
    private String f21971q0 = "N";

    /* renamed from: r0  reason: collision with root package name */
    private String f21972r0 = "N";

    /* renamed from: s0  reason: collision with root package name */
    private String f21973s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f21974t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f21975u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f21976v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f21977w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f21978x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f21979y0 = "N";

    /* renamed from: z0  reason: collision with root package name */
    public Context f21980z0;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21981e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f21982f;

        a(ChangeOfAddressActivity changeOfAddressActivity, u uVar) {
            this.f21981e = changeOfAddressActivity;
            this.f21982f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f21981e.V3(((AppCatPojo) ((ArrayList) this.f21982f.f20234e).get(i10)).getAppCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21983e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21983e = changeOfAddressActivity;
        }

        public final void b(StateResponse stateResponse) {
            this.f21983e.X2().dismiss();
            try {
                this.f21983e.T2().setVisibility(8);
                if (cm.l.a(stateResponse.getStatusCode(), "00")) {
                    List<StateMasterItem> stateMaster = stateResponse.getStateMaster();
                    if (stateMaster != null && (!stateMaster.isEmpty())) {
                        this.f21983e.K = stateResponse.getStateMaster();
                        ArrayList arrayList = new ArrayList();
                        List<StateMasterItem> k22 = this.f21983e.K;
                        c0 c0Var = null;
                        if (k22 != null) {
                            for (StateMasterItem stateMasterItem : k22) {
                                arrayList.add(String.valueOf(stateMasterItem != null ? stateMasterItem.getStateName() : null));
                            }
                        }
                        String str = "";
                        List k23 = this.f21983e.K;
                        cm.l.c(k23);
                        int size = k23.size();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= size) {
                                break;
                            }
                            String P2 = this.f21983e.P2();
                            List k24 = this.f21983e.K;
                            cm.l.c(k24);
                            Object obj = k24.get(i10);
                            cm.l.c(obj);
                            if (cm.l.a(P2, ((StateMasterItem) obj).getStateCode())) {
                                ChangeOfAddressActivity changeOfAddressActivity = this.f21983e;
                                List k25 = changeOfAddressActivity.K;
                                cm.l.c(k25);
                                Object obj2 = k25.get(i10);
                                cm.l.c(obj2);
                                String stateCode = ((StateMasterItem) obj2).getStateCode();
                                cm.l.c(stateCode);
                                changeOfAddressActivity.X3(stateCode);
                                ChangeOfAddressActivity changeOfAddressActivity2 = this.f21983e;
                                List k26 = changeOfAddressActivity2.K;
                                cm.l.c(k26);
                                Object obj3 = k26.get(i10);
                                cm.l.c(obj3);
                                String stateCode2 = ((StateMasterItem) obj3).getStateCode();
                                cm.l.c(stateCode2);
                                changeOfAddressActivity2.h4(stateCode2);
                                List k27 = this.f21983e.K;
                                cm.l.c(k27);
                                Object obj4 = k27.get(i10);
                                cm.l.c(obj4);
                                str = ((StateMasterItem) obj4).getStateName();
                                cm.l.c(str);
                                break;
                            }
                            i10++;
                        }
                        b0 d22 = this.f21983e.R;
                        if (d22 == null) {
                            cm.l.v("mBinding");
                            d22 = null;
                        }
                        d22.f25438y.setText(str);
                        b0 d23 = this.f21983e.R;
                        if (d23 == null) {
                            cm.l.v("mBinding");
                            d23 = null;
                        }
                        d23.f25438y.setContentDescription(this.f21983e.G2());
                        this.f21983e.x2();
                        String G2 = this.f21983e.G2();
                        ChangeOfAddressActivity changeOfAddressActivity3 = this.f21983e;
                        changeOfAddressActivity3.X2().dismiss();
                        c0 m22 = changeOfAddressActivity3.J;
                        if (m22 == null) {
                            cm.l.v("viewModel");
                            m22 = null;
                        }
                        m22.g(G2);
                        b0 d24 = this.f21983e.R;
                        if (d24 == null) {
                            cm.l.v("mBinding");
                            d24 = null;
                        }
                        d24.G.setText(str);
                        b0 d25 = this.f21983e.R;
                        if (d25 == null) {
                            cm.l.v("mBinding");
                            d25 = null;
                        }
                        d25.G.setContentDescription(this.f21983e.Y2());
                        this.f21983e.A2();
                        String Y2 = this.f21983e.Y2();
                        ChangeOfAddressActivity changeOfAddressActivity4 = this.f21983e;
                        changeOfAddressActivity4.X2().dismiss();
                        c0 m23 = changeOfAddressActivity4.J;
                        if (m23 == null) {
                            cm.l.v("viewModel");
                        } else {
                            c0Var = m23;
                        }
                        c0Var.g(Y2);
                        return;
                    }
                    return;
                }
                ChangeOfAddressActivity changeOfAddressActivity5 = this.f21983e;
                changeOfAddressActivity5.P3(changeOfAddressActivity5.L2().b("no_details", this.f21983e.getString(R.string.no_Details_are_avail)));
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity6 = this.f21983e;
                changeOfAddressActivity6.P3(changeOfAddressActivity6.L2().b("service_is_not_present", this.f21983e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21984e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21984e = changeOfAddressActivity;
        }

        public final void b(DistResponse distResponse) {
            String str;
            String str2;
            String str3;
            String str4;
            this.f21984e.X2().dismiss();
            try {
                this.f21984e.T2().setVisibility(8);
                c0 c0Var = null;
                if (cm.l.a(distResponse != null ? distResponse.getStatusCode() : null, "00")) {
                    this.f21984e.L = distResponse.getDistMaster();
                    this.f21984e.M = distResponse.getDistMaster();
                    if (cm.l.a(this.f21984e.d3().g(), "Y")) {
                        Aadarkyc.DOEkyc b22 = this.f21984e.I0;
                        if (b22 == null) {
                            cm.l.v("aadharData");
                            b22 = null;
                        }
                        if (com.nic.mparivahan.dlservices.utilities.d.d(b22.getDist())) {
                            List e22 = this.f21984e.L;
                            cm.l.c(e22);
                            int size = e22.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                str = "";
                                if (i11 >= size) {
                                    str2 = str;
                                    str3 = str2;
                                    break;
                                }
                                Aadarkyc.DOEkyc b23 = this.f21984e.I0;
                                if (b23 == null) {
                                    cm.l.v("aadharData");
                                    b23 = null;
                                }
                                String dist = b23.getDist();
                                List e23 = this.f21984e.L;
                                cm.l.c(e23);
                                Object obj = e23.get(i11);
                                cm.l.c(obj);
                                if (cm.l.a(dist, ((DistrictsMasterItem) obj).getDistName())) {
                                    List e24 = this.f21984e.L;
                                    cm.l.c(e24);
                                    Object obj2 = e24.get(i11);
                                    cm.l.c(obj2);
                                    str2 = ((DistrictsMasterItem) obj2).getDistName();
                                    cm.l.c(str2);
                                    List e25 = this.f21984e.L;
                                    cm.l.c(e25);
                                    Object obj3 = e25.get(i11);
                                    cm.l.c(obj3);
                                    str3 = ((DistrictsMasterItem) obj3).getDistCode();
                                    cm.l.c(str3);
                                    break;
                                }
                                i11++;
                            }
                            b0 d22 = this.f21984e.R;
                            if (d22 == null) {
                                cm.l.v("mBinding");
                                d22 = null;
                            }
                            d22.f25436x.setText(str2);
                            b0 d23 = this.f21984e.R;
                            if (d23 == null) {
                                cm.l.v("mBinding");
                                d23 = null;
                            }
                            d23.f25436x.setContentDescription(str3);
                            this.f21984e.b3().setDistrict(str3);
                            this.f21984e.y2();
                            c0 m22 = this.f21984e.J;
                            if (m22 == null) {
                                cm.l.v("viewModel");
                                m22 = null;
                            }
                            m22.n(this.f21984e.P2(), str3);
                            List h22 = this.f21984e.M;
                            cm.l.c(h22);
                            int size2 = h22.size();
                            while (true) {
                                if (i10 >= size2) {
                                    str4 = str;
                                    break;
                                }
                                Aadarkyc.DOEkyc b24 = this.f21984e.I0;
                                if (b24 == null) {
                                    cm.l.v("aadharData");
                                    b24 = null;
                                }
                                String dist2 = b24.getDist();
                                List h23 = this.f21984e.M;
                                cm.l.c(h23);
                                Object obj4 = h23.get(i10);
                                cm.l.c(obj4);
                                if (cm.l.a(dist2, ((DistrictsMasterItem) obj4).getDistName())) {
                                    List e26 = this.f21984e.L;
                                    cm.l.c(e26);
                                    Object obj5 = e26.get(i10);
                                    cm.l.c(obj5);
                                    str = ((DistrictsMasterItem) obj5).getDistName();
                                    cm.l.c(str);
                                    List e27 = this.f21984e.L;
                                    cm.l.c(e27);
                                    Object obj6 = e27.get(i10);
                                    cm.l.c(obj6);
                                    str4 = ((DistrictsMasterItem) obj6).getDistCode();
                                    cm.l.c(str4);
                                    break;
                                }
                                i10++;
                            }
                            Log.d("permanentDistNameValue", str);
                            b0 d24 = this.f21984e.R;
                            if (d24 == null) {
                                cm.l.v("mBinding");
                                d24 = null;
                            }
                            d24.F.setText(str);
                            b0 d25 = this.f21984e.R;
                            if (d25 == null) {
                                cm.l.v("mBinding");
                                d25 = null;
                            }
                            d25.F.setContentDescription(str4);
                            this.f21984e.Z2().setDistrict(str4);
                            this.f21984e.B2();
                            c0 m23 = this.f21984e.J;
                            if (m23 == null) {
                                cm.l.v("viewModel");
                            } else {
                                c0Var = m23;
                            }
                            c0Var.n(this.f21984e.P2(), str4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ChangeOfAddressActivity changeOfAddressActivity = this.f21984e;
                changeOfAddressActivity.P3(changeOfAddressActivity.L2().b("no_details", this.f21984e.getString(R.string.unable_to_get_details)));
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity2 = this.f21984e;
                changeOfAddressActivity2.P3(changeOfAddressActivity2.L2().b("service_is_not_present", this.f21984e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DistResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21985e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21985e = changeOfAddressActivity;
        }

        /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x007a A[SYNTHETIC, Splitter:B:19:0x007a] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01db A[Catch:{ Exception -> 0x0227 }] */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x01ed A[Catch:{ Exception -> 0x0227 }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01f1 A[Catch:{ Exception -> 0x0227 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.TalukaResponse r10) {
            /*
                r9 = this;
                java.lang.String r0 = "Y"
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r1 = r9.f21985e
                android.app.ProgressDialog r1 = r1.X2()
                r1.dismiss()
                r1 = 2132019337(0x7f140889, float:1.9677006E38)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r2 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                android.widget.ProgressBar r2 = r2.T2()     // Catch:{ Exception -> 0x0227 }
                r3 = 8
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0227 }
                r2 = 0
                if (r10 == 0) goto L_0x0021
                java.lang.String r3 = r10.getStatusCode()     // Catch:{ Exception -> 0x0227 }
                goto L_0x0022
            L_0x0021:
                r3 = r2
            L_0x0022:
                java.lang.String r4 = "00"
                boolean r3 = cm.l.a(r3, r4)     // Catch:{ Exception -> 0x0227 }
                if (r3 == 0) goto L_0x01f8
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ld.f r3 = r3.d3()     // Catch:{ Exception -> 0x0227 }
                java.lang.String r3 = r3.g()     // Catch:{ Exception -> 0x0227 }
                boolean r3 = cm.l.a(r3, r0)     // Catch:{ Exception -> 0x0227 }
                if (r3 == 0) goto L_0x004d
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r4 = r10.getTakulaMaster()     // Catch:{ Exception -> 0x0227 }
                r3.N = r4     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
            L_0x0045:
                java.util.List r10 = r10.getTakulaMaster()     // Catch:{ Exception -> 0x0227 }
                r3.O = r10     // Catch:{ Exception -> 0x0227 }
                goto L_0x0068
            L_0x004d:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.lang.String r3 = r3.S     // Catch:{ Exception -> 0x0227 }
                java.lang.String r4 = "dl-renewal-current-address"
                boolean r3 = cm.l.a(r3, r4)     // Catch:{ Exception -> 0x0227 }
                if (r3 == 0) goto L_0x0065
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.getTakulaMaster()     // Catch:{ Exception -> 0x0227 }
                r3.N = r10     // Catch:{ Exception -> 0x0227 }
                goto L_0x0068
            L_0x0065:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                goto L_0x0045
            L_0x0068:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ld.f r10 = r10.d3()     // Catch:{ Exception -> 0x0227 }
                java.lang.String r10 = r10.g()     // Catch:{ Exception -> 0x0227 }
                boolean r10 = cm.l.a(r10, r0)     // Catch:{ Exception -> 0x0227 }
                java.lang.String r0 = "mBinding"
                if (r10 == 0) goto L_0x01d3
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r10 = r10.I0     // Catch:{ Exception -> 0x0227 }
                java.lang.String r3 = "aadharData"
                if (r10 != 0) goto L_0x0088
                cm.l.v(r3)     // Catch:{ Exception -> 0x0227 }
                r10 = r2
            L_0x0088:
                java.lang.String r10 = r10.getSubDist()     // Catch:{ Exception -> 0x0227 }
                boolean r10 = com.nic.mparivahan.dlservices.utilities.d.d(r10)     // Catch:{ Exception -> 0x0227 }
                if (r10 == 0) goto L_0x01d3
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.O     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0227 }
                r4 = 0
                r5 = r4
            L_0x00a1:
                java.lang.String r6 = ""
                if (r5 >= r10) goto L_0x0107
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r7 = r7.I0     // Catch:{ Exception -> 0x0227 }
                if (r7 != 0) goto L_0x00b1
                cm.l.v(r3)     // Catch:{ Exception -> 0x0227 }
                r7 = r2
            L_0x00b1:
                java.lang.String r7 = r7.getSubDist()     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r8 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r8 = r8.O     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r8)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r8 = r8.get(r5)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r8)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r8 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r8     // Catch:{ Exception -> 0x0227 }
                java.lang.String r8 = r8.getSubDistname()     // Catch:{ Exception -> 0x0227 }
                boolean r7 = cm.l.a(r7, r8)     // Catch:{ Exception -> 0x0227 }
                if (r7 == 0) goto L_0x0104
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.O     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r10 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r10     // Catch:{ Exception -> 0x0227 }
                java.lang.String r10 = r10.getSubDistname()     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r7 = r7.O     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r7)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r5 = r7.get(r5)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r5)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r5 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r5     // Catch:{ Exception -> 0x0227 }
                java.lang.String r5 = r5.getSubDistcode()     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r5)     // Catch:{ Exception -> 0x0227 }
                goto L_0x0109
            L_0x0104:
                int r5 = r5 + 1
                goto L_0x00a1
            L_0x0107:
                r10 = r6
                r5 = r10
            L_0x0109:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r7 = r7.R     // Catch:{ Exception -> 0x0227 }
                if (r7 != 0) goto L_0x0115
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                r7 = r2
            L_0x0115:
                android.widget.EditText r7 = r7.E     // Catch:{ Exception -> 0x0227 }
                r7.setText(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r10 = r10.R     // Catch:{ Exception -> 0x0227 }
                if (r10 != 0) goto L_0x0126
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                r10 = r2
            L_0x0126:
                android.widget.EditText r10 = r10.E     // Catch:{ Exception -> 0x0227 }
                r10.setContentDescription(r5)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.DlAddress r10 = r10.Z2()     // Catch:{ Exception -> 0x0227 }
                r10.setSubDistrict(r5)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.N     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                int r10 = r10.size()     // Catch:{ Exception -> 0x0227 }
            L_0x0141:
                if (r4 >= r10) goto L_0x01a5
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r5 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r5.I0     // Catch:{ Exception -> 0x0227 }
                if (r5 != 0) goto L_0x014f
                cm.l.v(r3)     // Catch:{ Exception -> 0x0227 }
                r5 = r2
            L_0x014f:
                java.lang.String r5 = r5.getSubDist()     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r7 = r7.N     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r7)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r7)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r7     // Catch:{ Exception -> 0x0227 }
                java.lang.String r7 = r7.getSubDistname()     // Catch:{ Exception -> 0x0227 }
                boolean r5 = cm.l.a(r5, r7)     // Catch:{ Exception -> 0x0227 }
                if (r5 == 0) goto L_0x01a2
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.N     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r10 = r10.get(r4)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r10 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r10     // Catch:{ Exception -> 0x0227 }
                java.lang.String r6 = r10.getSubDistname()     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r6)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.util.List r10 = r10.N     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                java.lang.Object r10 = r10.get(r4)     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r10 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r10     // Catch:{ Exception -> 0x0227 }
                java.lang.String r10 = r10.getSubDistcode()     // Catch:{ Exception -> 0x0227 }
                cm.l.c(r10)     // Catch:{ Exception -> 0x0227 }
                goto L_0x01a6
            L_0x01a2:
                int r4 = r4 + 1
                goto L_0x0141
            L_0x01a5:
                r10 = r6
            L_0x01a6:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r3 = r3.R     // Catch:{ Exception -> 0x0227 }
                if (r3 != 0) goto L_0x01b2
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                r3 = r2
            L_0x01b2:
                android.widget.EditText r3 = r3.f25434w     // Catch:{ Exception -> 0x0227 }
                r3.setText(r6)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r3 = r3.R     // Catch:{ Exception -> 0x0227 }
                if (r3 != 0) goto L_0x01c3
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                goto L_0x01c4
            L_0x01c3:
                r2 = r3
            L_0x01c4:
                android.widget.EditText r0 = r2.f25434w     // Catch:{ Exception -> 0x0227 }
                r0.setContentDescription(r10)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.data.model.DlAddress r0 = r0.b3()     // Catch:{ Exception -> 0x0227 }
                r0.setSubDistrict(r10)     // Catch:{ Exception -> 0x0227 }
                goto L_0x023c
            L_0x01d3:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r10 = r10.R     // Catch:{ Exception -> 0x0227 }
                if (r10 != 0) goto L_0x01df
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                r10 = r2
            L_0x01df:
                android.widget.EditText r10 = r10.E     // Catch:{ Exception -> 0x0227 }
                r3 = 1
                r10.setFocusable(r3)     // Catch:{ Exception -> 0x0227 }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ni.b0 r10 = r10.R     // Catch:{ Exception -> 0x0227 }
                if (r10 != 0) goto L_0x01f1
                cm.l.v(r0)     // Catch:{ Exception -> 0x0227 }
                goto L_0x01f2
            L_0x01f1:
                r2 = r10
            L_0x01f2:
                android.widget.EditText r10 = r2.E     // Catch:{ Exception -> 0x0227 }
                r10.setEnabled(r3)     // Catch:{ Exception -> 0x0227 }
                goto L_0x023c
            L_0x01f8:
                if (r10 == 0) goto L_0x01fe
                java.lang.String r2 = r10.getStatusCode()     // Catch:{ Exception -> 0x0227 }
            L_0x01fe:
                java.lang.String r10 = "01"
                boolean r10 = cm.l.a(r2, r10)     // Catch:{ Exception -> 0x0227 }
                if (r10 == 0) goto L_0x0218
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ld.c r0 = r10.L2()     // Catch:{ Exception -> 0x0227 }
                java.lang.String r2 = "no_taluka_found"
                java.lang.String r3 = "No Taluka / Block found for selected District"
            L_0x0210:
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0227 }
                r10.P3(r0)     // Catch:{ Exception -> 0x0227 }
                goto L_0x023c
            L_0x0218:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                ld.c r0 = r10.L2()     // Catch:{ Exception -> 0x0227 }
                java.lang.String r2 = "no_details"
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r3 = r9.f21985e     // Catch:{ Exception -> 0x0227 }
                java.lang.String r3 = r3.getString(r1)     // Catch:{ Exception -> 0x0227 }
                goto L_0x0210
            L_0x0227:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r10 = r9.f21985e
                ld.c r0 = r10.L2()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r2 = r9.f21985e
                java.lang.String r1 = r2.getString(r1)
                java.lang.String r2 = "service_is_not_present"
                java.lang.String r0 = r0.b(r2, r1)
                r10.P3(r0)
            L_0x023c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.d.b(com.nic.mparivahan.dlservices.data.model.TalukaResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TalukaResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21986e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21986e = changeOfAddressActivity;
        }

        public final void b(VillageOrTownResponse villageOrTownResponse) {
            this.f21986e.X2().dismiss();
            try {
                this.f21986e.T2().setVisibility(8);
                if (!cm.l.a(villageOrTownResponse != null ? villageOrTownResponse.getStatusCode() : null, "00")) {
                    ChangeOfAddressActivity changeOfAddressActivity = this.f21986e;
                    changeOfAddressActivity.P3(changeOfAddressActivity.L2().b("no_vill_found", "No Village/Town found for selected Taluka/Block"));
                } else if (cm.l.a(this.f21986e.S, "dl-renewal-current-address")) {
                    this.f21986e.P = villageOrTownResponse.getVillageMaster();
                } else {
                    this.f21986e.Q = villageOrTownResponse.getVillageMaster();
                }
                Log.e("dl_village", villageOrTownResponse.toString());
            } catch (Exception unused) {
                ChangeOfAddressActivity changeOfAddressActivity2 = this.f21986e;
                changeOfAddressActivity2.P3(changeOfAddressActivity2.L2().b("service_is_not_present", this.f21986e.getString(R.string.unable_to_get_details)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VillageOrTownResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21987e = changeOfAddressActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|(1:21)|22|42) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00c2 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00d2 A[Catch:{ Exception -> 0x014a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto r30) {
            /*
                r29 = this;
                r0 = r29
                java.lang.String r1 = "service_is_not_present"
                java.lang.String r2 = "mBinding"
                r3 = 2132019337(0x7f140889, float:1.9677006E38)
                r4 = 0
                r5 = 0
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                android.widget.ProgressBar r6 = r6.T2()     // Catch:{ Exception -> 0x014a }
                r7 = 8
                r6.setVisibility(r7)     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                ni.b0 r6 = r6.R     // Catch:{ Exception -> 0x014a }
                if (r6 != 0) goto L_0x0022
                cm.l.v(r2)     // Catch:{ Exception -> 0x014a }
                r6 = r4
            L_0x0022:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r6 = r6.f25430s0     // Catch:{ Exception -> 0x014a }
                r6.c(r5)     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getResult()     // Catch:{ Exception -> 0x014a }
                cm.l.c(r6)     // Catch:{ Exception -> 0x014a }
                java.lang.String r6 = r6.getStatusCode()     // Catch:{ Exception -> 0x014a }
                java.lang.String r7 = "00"
                r8 = 2
                boolean r6 = km.p.p(r6, r7, r5, r8, r4)     // Catch:{ Exception -> 0x014a }
                if (r6 == 0) goto L_0x0111
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getResult()     // Catch:{ Exception -> 0x014a }
                cm.l.c(r6)     // Catch:{ Exception -> 0x014a }
                java.util.List r6 = r6.getResult()     // Catch:{ Exception -> 0x014a }
                if (r6 == 0) goto L_0x016f
                java.util.Collection r6 = (java.util.Collection) r6     // Catch:{ Exception -> 0x014a }
                boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x014a }
                r7 = 1
                r6 = r6 ^ r7
                if (r6 != r7) goto L_0x016f
                com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r8 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x014a }
                r8.<init>()     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getResult()     // Catch:{ Exception -> 0x014a }
                java.util.List r6 = r6.getResult()     // Catch:{ Exception -> 0x014a }
                if (r6 == 0) goto L_0x016f
                java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x014a }
                r10 = r6
                com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r10 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r10     // Catch:{ Exception -> 0x014a }
                if (r10 == 0) goto L_0x016f
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r9 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                java.lang.String r6 = "date_"
                java.lang.String r7 = r10.getApplicationDate()     // Catch:{ Exception -> 0x014a }
                android.util.Log.d(r6, r7)     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r11 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r13 = "1234"
                java.lang.String r14 = "S"
                java.lang.String r15 = r10.getApplicationDate()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r6 = r10.getApplicationNo()     // Catch:{ Exception -> 0x00c2 }
                cm.l.c(r6)     // Catch:{ Exception -> 0x00c2 }
                long r16 = java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x00c2 }
                ld.g r6 = r9.U2()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r6 = r6.k()     // Catch:{ Exception -> 0x00c2 }
                int r18 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r19 = r10.getDateofBirth()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r20 = r10.getDlno()     // Catch:{ Exception -> 0x00c2 }
                cm.l.c(r20)     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r21 = "N"
                java.lang.String r22 = "N"
                java.lang.String r23 = r10.getApplicantGender()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r24 = r9.V2()     // Catch:{ Exception -> 0x00c2 }
                cm.l.c(r24)     // Catch:{ Exception -> 0x00c2 }
                r25 = 0
                java.lang.String r26 = r9.c3()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r27 = r9.M2()     // Catch:{ Exception -> 0x00c2 }
                java.lang.String r28 = r9.P2()     // Catch:{ Exception -> 0x00c2 }
                r12 = r9
                r11.a(r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x00c2 }
            L_0x00c2:
                ld.f r6 = r9.d3()     // Catch:{ Exception -> 0x014a }
                java.lang.String r6 = r6.b()     // Catch:{ Exception -> 0x014a }
                java.lang.String r7 = "950"
                boolean r6 = cm.l.a(r6, r7)     // Catch:{ Exception -> 0x014a }
                if (r6 != 0) goto L_0x00e9
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x014a }
                r6.<init>()     // Catch:{ Exception -> 0x014a }
                r9.f4(r6)     // Catch:{ Exception -> 0x014a }
                java.util.ArrayList r6 = r9.W2()     // Catch:{ Exception -> 0x014a }
                ld.f r7 = r9.d3()     // Catch:{ Exception -> 0x014a }
                java.lang.String r7 = r7.i()     // Catch:{ Exception -> 0x014a }
                r6.add(r7)     // Catch:{ Exception -> 0x014a }
            L_0x00e9:
                java.lang.String r11 = r9.M2()     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.Dl.Model.DldetobjX r12 = r9.I2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r13 = r9.J2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r14 = r9.K2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r15 = r9.V2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r16 = r9.N2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r17 = r9.O2()     // Catch:{ Exception -> 0x014a }
                java.lang.String r18 = r9.P2()     // Catch:{ Exception -> 0x014a }
                java.util.ArrayList r19 = r9.W2()     // Catch:{ Exception -> 0x014a }
                r8.E2(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x014a }
                goto L_0x016f
            L_0x0111:
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r6 = r30.getResult()     // Catch:{ Exception -> 0x014a }
                cm.l.c(r6)     // Catch:{ Exception -> 0x014a }
                java.lang.String r6 = r6.getReqStatus()     // Catch:{ Exception -> 0x014a }
                if (r6 == 0) goto L_0x0139
                int r6 = r6.length()     // Catch:{ Exception -> 0x014a }
                if (r6 != 0) goto L_0x0125
                goto L_0x0139
            L_0x0125:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.data.model.DlSubmitResult r7 = r30.getResult()     // Catch:{ Exception -> 0x014a }
                cm.l.c(r7)     // Catch:{ Exception -> 0x014a }
                java.lang.String r7 = r7.getReqStatus()     // Catch:{ Exception -> 0x014a }
                cm.l.c(r7)     // Catch:{ Exception -> 0x014a }
            L_0x0135:
                r6.P3(r7)     // Catch:{ Exception -> 0x014a }
                goto L_0x016f
            L_0x0139:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                ld.c r7 = r6.L2()     // Catch:{ Exception -> 0x014a }
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r8 = r0.f21987e     // Catch:{ Exception -> 0x014a }
                java.lang.String r8 = r8.getString(r3)     // Catch:{ Exception -> 0x014a }
                java.lang.String r7 = r7.b(r1, r8)     // Catch:{ Exception -> 0x014a }
                goto L_0x0135
            L_0x014a:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r0.f21987e
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x0156
                cm.l.v(r2)
                goto L_0x0157
            L_0x0156:
                r4 = r6
            L_0x0157:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r4.f25430s0
                r2.c(r5)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r2 = r0.f21987e
                ld.c r4 = r2.L2()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r5 = r0.f21987e
                java.lang.String r3 = r5.getString(r3)
                java.lang.String r1 = r4.b(r1, r3)
                r2.P3(r1)
            L_0x016f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.f.b(com.nic.mparivahan.dlservices.data.model.DlRenewalSaveDto):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlRenewalSaveDto) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21988e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21988e = changeOfAddressActivity;
        }

        public final void b(String str) {
            c0 c0Var;
            String str2 = str;
            cm.l.f(str2, "it");
            if (p.o(str2, "yes", true)) {
                b0 d22 = this.f21988e.R;
                b0 b0Var = null;
                if (d22 == null) {
                    cm.l.v("mBinding");
                    d22 = null;
                }
                d22.f25430s0.c(true);
                c0 m22 = this.f21988e.J;
                if (m22 == null) {
                    cm.l.v("viewModel");
                    c0Var = null;
                } else {
                    c0Var = m22;
                }
                String obj = q.B0(String.valueOf(this.f21988e.J2())).toString();
                String K2 = this.f21988e.K2();
                cm.l.c(K2);
                String M2 = this.f21988e.M2();
                String E2 = this.f21988e.E2();
                b0 d23 = this.f21988e.R;
                if (d23 == null) {
                    cm.l.v("mBinding");
                    d23 = null;
                }
                String obj2 = d23.A.getText().toString();
                b0 d24 = this.f21988e.R;
                if (d24 == null) {
                    cm.l.v("mBinding");
                    d24 = null;
                }
                String obj3 = d24.D.getText().toString();
                b0 d25 = this.f21988e.R;
                if (d25 == null) {
                    cm.l.v("mBinding");
                    d25 = null;
                }
                String obj4 = d25.B.getText().toString();
                String villageOrTown = this.f21988e.Z2().getVillageOrTown();
                cm.l.c(villageOrTown);
                String subDistrict = this.f21988e.Z2().getSubDistrict();
                cm.l.c(subDistrict);
                String district = this.f21988e.Z2().getDistrict();
                cm.l.c(district);
                String Y2 = this.f21988e.Y2();
                b0 d26 = this.f21988e.R;
                if (d26 == null) {
                    cm.l.v("mBinding");
                    d26 = null;
                }
                String obj5 = d26.O.getText().toString();
                b0 d27 = this.f21988e.R;
                if (d27 == null) {
                    cm.l.v("mBinding");
                    d27 = null;
                }
                String obj6 = d27.L.getText().toString();
                b0 d28 = this.f21988e.R;
                if (d28 == null) {
                    cm.l.v("mBinding");
                    d28 = null;
                }
                String obj7 = d28.P.getText().toString();
                b0 d29 = this.f21988e.R;
                if (d29 == null) {
                    cm.l.v("mBinding");
                    d29 = null;
                }
                String obj8 = d29.N.getText().toString();
                String villageOrTown2 = this.f21988e.b3().getVillageOrTown();
                cm.l.c(villageOrTown2);
                String subDistrict2 = this.f21988e.b3().getSubDistrict();
                cm.l.c(subDistrict2);
                String district2 = this.f21988e.b3().getDistrict();
                cm.l.c(district2);
                String G2 = this.f21988e.G2();
                b0 d210 = this.f21988e.R;
                if (d210 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var = d210;
                }
                String obj9 = b0Var.O.getText().toString();
                String V2 = this.f21988e.V2();
                cm.l.c(V2);
                c0Var.p(obj, K2, M2, E2, "B", obj2, obj3, obj4, villageOrTown, subDistrict, district, Y2, obj5, obj6, obj7, obj8, villageOrTown2, subDistrict2, district2, G2, obj9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", V2, this.f21988e.d3().f(), this.f21988e.d3().g(), this.f21988e.d3().e(), this.f21988e.d3().h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21989e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21989e = changeOfAddressActivity;
        }

        public final void b(String str) {
            c0 c0Var;
            String str2 = str;
            cm.l.f(str2, "it");
            if (p.o(str2, "yes", true)) {
                b0 d22 = this.f21989e.R;
                b0 b0Var = null;
                if (d22 == null) {
                    cm.l.v("mBinding");
                    d22 = null;
                }
                d22.f25430s0.c(true);
                c0 m22 = this.f21989e.J;
                if (m22 == null) {
                    cm.l.v("viewModel");
                    c0Var = null;
                } else {
                    c0Var = m22;
                }
                String obj = q.B0(String.valueOf(this.f21989e.J2())).toString();
                String K2 = this.f21989e.K2();
                cm.l.c(K2);
                String M2 = this.f21989e.M2();
                String E2 = this.f21989e.E2();
                b0 d23 = this.f21989e.R;
                if (d23 == null) {
                    cm.l.v("mBinding");
                    d23 = null;
                }
                String obj2 = d23.A.getText().toString();
                b0 d24 = this.f21989e.R;
                if (d24 == null) {
                    cm.l.v("mBinding");
                    d24 = null;
                }
                String obj3 = d24.D.getText().toString();
                b0 d25 = this.f21989e.R;
                if (d25 == null) {
                    cm.l.v("mBinding");
                    d25 = null;
                }
                String obj4 = d25.B.getText().toString();
                String villageOrTown = this.f21989e.Z2().getVillageOrTown();
                cm.l.c(villageOrTown);
                String subDistrict = this.f21989e.Z2().getSubDistrict();
                cm.l.c(subDistrict);
                String district = this.f21989e.Z2().getDistrict();
                cm.l.c(district);
                String Y2 = this.f21989e.Y2();
                b0 d26 = this.f21989e.R;
                if (d26 == null) {
                    cm.l.v("mBinding");
                    d26 = null;
                }
                String obj5 = d26.O.getText().toString();
                b0 d27 = this.f21989e.R;
                if (d27 == null) {
                    cm.l.v("mBinding");
                    d27 = null;
                }
                String obj6 = d27.L.getText().toString();
                b0 d28 = this.f21989e.R;
                if (d28 == null) {
                    cm.l.v("mBinding");
                    d28 = null;
                }
                String obj7 = d28.P.getText().toString();
                b0 d29 = this.f21989e.R;
                if (d29 == null) {
                    cm.l.v("mBinding");
                    d29 = null;
                }
                String obj8 = d29.N.getText().toString();
                String villageOrTown2 = this.f21989e.b3().getVillageOrTown();
                cm.l.c(villageOrTown2);
                String subDistrict2 = this.f21989e.b3().getSubDistrict();
                cm.l.c(subDistrict2);
                String district2 = this.f21989e.b3().getDistrict();
                cm.l.c(district2);
                String G2 = this.f21989e.G2();
                b0 d210 = this.f21989e.R;
                if (d210 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var = d210;
                }
                String obj9 = b0Var.O.getText().toString();
                String V2 = this.f21989e.V2();
                cm.l.c(V2);
                c0Var.p(obj, K2, M2, E2, "B", obj2, obj3, obj4, villageOrTown, subDistrict, district, Y2, obj5, obj6, obj7, obj8, villageOrTown2, subDistrict2, district2, G2, obj9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", V2, this.f21989e.d3().f(), this.f21989e.d3().g(), this.f21989e.d3().e(), this.f21989e.d3().h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21990e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ChangeOfAddressActivity changeOfAddressActivity) {
            super(1);
            this.f21990e = changeOfAddressActivity;
        }

        public final void b(String str) {
            c0 c0Var;
            String str2 = str;
            cm.l.f(str2, "it");
            if (p.o(str2, "yes", true)) {
                b0 d22 = this.f21990e.R;
                b0 b0Var = null;
                if (d22 == null) {
                    cm.l.v("mBinding");
                    d22 = null;
                }
                d22.f25430s0.c(true);
                c0 m22 = this.f21990e.J;
                if (m22 == null) {
                    cm.l.v("viewModel");
                    c0Var = null;
                } else {
                    c0Var = m22;
                }
                String obj = q.B0(String.valueOf(this.f21990e.J2())).toString();
                String K2 = this.f21990e.K2();
                cm.l.c(K2);
                String M2 = this.f21990e.M2();
                String E2 = this.f21990e.E2();
                b0 d23 = this.f21990e.R;
                if (d23 == null) {
                    cm.l.v("mBinding");
                    d23 = null;
                }
                String obj2 = d23.A.getText().toString();
                b0 d24 = this.f21990e.R;
                if (d24 == null) {
                    cm.l.v("mBinding");
                    d24 = null;
                }
                String obj3 = d24.D.getText().toString();
                b0 d25 = this.f21990e.R;
                if (d25 == null) {
                    cm.l.v("mBinding");
                    d25 = null;
                }
                String obj4 = d25.B.getText().toString();
                String villageOrTown = this.f21990e.Z2().getVillageOrTown();
                cm.l.c(villageOrTown);
                String subDistrict = this.f21990e.Z2().getSubDistrict();
                cm.l.c(subDistrict);
                String district = this.f21990e.Z2().getDistrict();
                cm.l.c(district);
                String Y2 = this.f21990e.Y2();
                b0 d26 = this.f21990e.R;
                if (d26 == null) {
                    cm.l.v("mBinding");
                    d26 = null;
                }
                String obj5 = d26.O.getText().toString();
                b0 d27 = this.f21990e.R;
                if (d27 == null) {
                    cm.l.v("mBinding");
                    d27 = null;
                }
                String obj6 = d27.L.getText().toString();
                b0 d28 = this.f21990e.R;
                if (d28 == null) {
                    cm.l.v("mBinding");
                    d28 = null;
                }
                String obj7 = d28.P.getText().toString();
                b0 d29 = this.f21990e.R;
                if (d29 == null) {
                    cm.l.v("mBinding");
                    d29 = null;
                }
                String obj8 = d29.N.getText().toString();
                String villageOrTown2 = this.f21990e.b3().getVillageOrTown();
                cm.l.c(villageOrTown2);
                String subDistrict2 = this.f21990e.b3().getSubDistrict();
                cm.l.c(subDistrict2);
                String district2 = this.f21990e.b3().getDistrict();
                cm.l.c(district2);
                String G2 = this.f21990e.G2();
                b0 d210 = this.f21990e.R;
                if (d210 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var = d210;
                }
                String obj9 = b0Var.O.getText().toString();
                String V2 = this.f21990e.V2();
                cm.l.c(V2);
                c0Var.p(obj, K2, M2, E2, "B", obj2, obj3, obj4, villageOrTown, subDistrict, district, Y2, obj5, obj6, obj7, obj8, villageOrTown2, subDistrict2, district2, G2, obj9, "DelhTrans", "0.0.0.0", "d9fe1613399b0883e4ecf3f710e18317", "sarathiservice", V2, this.f21990e.d3().f(), this.f21990e.d3().g(), this.f21990e.d3().e(), this.f21990e.d3().h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class j implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21991a;

        j(ChangeOfAddressActivity changeOfAddressActivity) {
            this.f21991a = changeOfAddressActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
            if (r0 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
            r5 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dd, code lost:
            if (r0 == null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
            r8 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r0.get(r8);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r7, int r8) {
            /*
                r6 = this;
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r6.f21991a
                java.lang.String r0 = r0.S
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r1 = cm.l.a(r0, r1)
                java.lang.String r2 = "viewModel"
                r3 = 0
                java.lang.String r4 = "mBinding"
                r5 = 0
                if (r1 == 0) goto L_0x0080
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r6.f21991a
                java.util.List r0 = r0.L
                if (r0 == 0) goto L_0x0029
                java.lang.Object r8 = r0.get(r8)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r8 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r8
                if (r8 == 0) goto L_0x0029
                java.lang.String r8 = r8.getDistCode()
                goto L_0x002a
            L_0x0029:
                r8 = r5
            L_0x002a:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r6.f21991a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0036
                cm.l.v(r4)
                r0 = r5
            L_0x0036:
                android.widget.EditText r0 = r0.f25436x
                r0.setText(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                ni.b0 r7 = r7.R
                if (r7 != 0) goto L_0x0047
                cm.l.v(r4)
                r7 = r5
            L_0x0047:
                android.widget.EditText r7 = r7.f25436x
                r7.setContentDescription(r8)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                com.nic.mparivahan.dlservices.data.model.DlAddress r7 = r7.b3()
                r7.setDistrict(r8)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                r7.y2()
                if (r8 == 0) goto L_0x00e0
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                android.widget.ProgressBar r0 = r7.T2()
                r0.setVisibility(r3)
                jj.c0 r0 = r7.J
                if (r0 != 0) goto L_0x006f
            L_0x006b:
                cm.l.v(r2)
                goto L_0x0070
            L_0x006f:
                r5 = r0
            L_0x0070:
                java.lang.String r7 = r7.P2()
                java.lang.CharSequence r7 = km.q.B0(r7)
                java.lang.String r7 = r7.toString()
                r5.n(r7, r8)
                goto L_0x00e0
            L_0x0080:
                java.lang.String r1 = "dl-renewal-permanent-addressx"
                boolean r0 = cm.l.a(r0, r1)
                if (r0 == 0) goto L_0x00e0
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r6.f21991a
                java.util.List r0 = r0.M
                if (r0 == 0) goto L_0x009d
                java.lang.Object r8 = r0.get(r8)
                com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem r8 = (com.nic.mparivahan.dlservices.data.model.DistrictsMasterItem) r8
                if (r8 == 0) goto L_0x009d
                java.lang.String r8 = r8.getDistCode()
                goto L_0x009e
            L_0x009d:
                r8 = r5
            L_0x009e:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r6.f21991a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x00aa
                cm.l.v(r4)
                r0 = r5
            L_0x00aa:
                android.widget.EditText r0 = r0.F
                r0.setText(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                ni.b0 r7 = r7.R
                if (r7 != 0) goto L_0x00bb
                cm.l.v(r4)
                r7 = r5
            L_0x00bb:
                android.widget.EditText r7 = r7.F
                r7.setContentDescription(r8)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                com.nic.mparivahan.dlservices.data.model.DlAddress r7 = r7.Z2()
                r7.setDistrict(r8)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                r7.B2()
                if (r8 == 0) goto L_0x00e0
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r6.f21991a
                android.widget.ProgressBar r0 = r7.T2()
                r0.setVisibility(r3)
                jj.c0 r0 = r7.J
                if (r0 != 0) goto L_0x006f
                goto L_0x006b
            L_0x00e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.j.a(java.lang.String, int):void");
        }
    }

    public static final class k implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f21993b;

        k(ChangeOfAddressActivity changeOfAddressActivity, u uVar) {
            this.f21992a = changeOfAddressActivity;
            this.f21993b = uVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v1, types: [ni.b0] */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v3, types: [ni.b0] */
        /* JADX WARNING: type inference failed for: r3v4 */
        /* JADX WARNING: type inference failed for: r3v6 */
        /* JADX WARNING: type inference failed for: r3v7, types: [ni.b0] */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
            r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r0.get(r7);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r6, int r7) {
            /*
                r5 = this;
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                java.lang.String r0 = r0.S
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = ", "
                java.lang.String r2 = "mBinding"
                r3 = 0
                if (r0 == 0) goto L_0x01cc
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
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
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0035
                cm.l.v(r2)
                r0 = r3
            L_0x0035:
                android.widget.EditText r0 = r0.f25434w
                r0.setText(r6)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x0046
                cm.l.v(r2)
                r6 = r3
            L_0x0046:
                android.widget.EditText r6 = r6.f25434w
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.b3()
                r6.setSubDistrict(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                cm.u r7 = r5.f21993b
                java.lang.Object r7 = r7.f20234e
                java.lang.String r7 = (java.lang.String) r7
                r6.H2(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ld.f r6 = r6.d3()
                java.lang.String r6 = r6.g()
                java.lang.String r7 = "Y"
                boolean r6 = cm.l.a(r6, r7)
                if (r6 == 0) goto L_0x016d
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r6.I0
                java.lang.String r7 = "aadharData"
                if (r6 != 0) goto L_0x007f
                cm.l.v(r7)
                r6 = r3
            L_0x007f:
                java.lang.String r6 = r6.getLandMark()
                boolean r6 = com.nic.mparivahan.dlservices.utilities.d.d(r6)
                if (r6 == 0) goto L_0x0101
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x0095
                cm.l.v(r2)
                r6 = r3
            L_0x0095:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r5.f21992a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r4.I0
                if (r4 != 0) goto L_0x00a8
                cm.l.v(r7)
                r4 = r3
            L_0x00a8:
                java.lang.String r7 = r4.getLandMark()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r5.f21992a
                ni.b0 r7 = r7.R
                if (r7 != 0) goto L_0x00be
                cm.l.v(r2)
                r7 = r3
            L_0x00be:
                android.widget.EditText r7 = r7.f25434w
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r5.f21992a
                ni.b0 r7 = r7.R
                if (r7 != 0) goto L_0x00d6
                cm.l.v(r2)
                r7 = r3
            L_0x00d6:
                android.widget.EditText r7 = r7.f25436x
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r7 = r5.f21992a
                ni.b0 r7 = r7.R
                if (r7 != 0) goto L_0x00ee
                cm.l.v(r2)
                goto L_0x00ef
            L_0x00ee:
                r3 = r7
            L_0x00ef:
                android.widget.EditText r7 = r3.f25438y
                android.text.Editable r7 = r7.getText()
                r0.append(r7)
            L_0x00f8:
                java.lang.String r7 = r0.toString()
            L_0x00fc:
                r6.setText(r7)
                goto L_0x026c
            L_0x0101:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x010d
                cm.l.v(r2)
                r6 = r3
            L_0x010d:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r5.f21992a
                ni.b0 r4 = r4.R
                if (r4 != 0) goto L_0x0120
                cm.l.v(r2)
                r4 = r3
            L_0x0120:
                android.widget.EditText r2 = r4.f25434w
                android.text.Editable r2 = r2.getText()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r2 = r5.f21992a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.I0
                if (r2 != 0) goto L_0x0138
                cm.l.v(r7)
                r2 = r3
            L_0x0138:
                java.lang.String r2 = r2.getLocalityIfAny()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r2 = r5.f21992a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r2.I0
                if (r2 != 0) goto L_0x014e
                cm.l.v(r7)
                r2 = r3
            L_0x014e:
                java.lang.String r2 = r2.getDist()
                r0.append(r2)
                r0.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r1 = r5.f21992a
                com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = r1.I0
                if (r1 != 0) goto L_0x0164
                cm.l.v(r7)
                goto L_0x0165
            L_0x0164:
                r3 = r1
            L_0x0165:
                java.lang.String r7 = r3.getState()
                r0.append(r7)
                goto L_0x00f8
            L_0x016d:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x0179
                cm.l.v(r2)
                r6 = r3
            L_0x0179:
                android.widget.EditText r6 = r6.N
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x018c
                cm.l.v(r2)
                r0 = r3
            L_0x018c:
                android.widget.EditText r0 = r0.f25434w
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x01a4
                cm.l.v(r2)
                r0 = r3
            L_0x01a4:
                android.widget.EditText r0 = r0.f25436x
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x01bc
                cm.l.v(r2)
                goto L_0x01bd
            L_0x01bc:
                r3 = r0
            L_0x01bd:
                android.widget.EditText r0 = r3.f25438y
            L_0x01bf:
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                goto L_0x00fc
            L_0x01cc:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                java.util.List r0 = r0.O
                if (r0 == 0) goto L_0x01e1
                java.lang.Object r7 = r0.get(r7)
                com.nic.mparivahan.dlservices.data.model.TalukaMasterItem r7 = (com.nic.mparivahan.dlservices.data.model.TalukaMasterItem) r7
                if (r7 == 0) goto L_0x01e1
                java.lang.String r7 = r7.getSubDistcode()
                goto L_0x01e2
            L_0x01e1:
                r7 = r3
            L_0x01e2:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x01ee
                cm.l.v(r2)
                r0 = r3
            L_0x01ee:
                android.widget.EditText r0 = r0.E
                r0.setText(r6)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x01ff
                cm.l.v(r2)
                r6 = r3
            L_0x01ff:
                android.widget.EditText r6 = r6.E
                r6.setContentDescription(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                com.nic.mparivahan.dlservices.data.model.DlAddress r6 = r6.Z2()
                r6.setSubDistrict(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                cm.u r7 = r5.f21993b
                java.lang.Object r7 = r7.f20234e
                java.lang.String r7 = (java.lang.String) r7
                r6.a3(r7)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r6 = r5.f21992a
                ni.b0 r6 = r6.R
                if (r6 != 0) goto L_0x0224
                cm.l.v(r2)
                r6 = r3
            L_0x0224:
                android.widget.EditText r6 = r6.B
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0237
                cm.l.v(r2)
                r0 = r3
            L_0x0237:
                android.widget.EditText r0 = r0.E
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x024f
                cm.l.v(r2)
                r0 = r3
            L_0x024f:
                android.widget.EditText r0 = r0.F
                android.text.Editable r0 = r0.getText()
                r7.append(r0)
                r7.append(r1)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r5.f21992a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0267
                cm.l.v(r2)
                goto L_0x0268
            L_0x0267:
                r3 = r0
            L_0x0268:
                android.widget.EditText r0 = r3.G
                goto L_0x01bf
            L_0x026c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.k.a(java.lang.String, int):void");
        }
    }

    public static final class l implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeOfAddressActivity f21994a;

        l(ChangeOfAddressActivity changeOfAddressActivity) {
            this.f21994a = changeOfAddressActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
            r5 = (com.nic.mparivahan.dlservices.data.model.VillageOrTownMasterItem) r0.get(r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r4, int r5) {
            /*
                r3 = this;
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r3.f21994a
                java.lang.String r0 = r0.S
                java.lang.String r1 = "dl-renewal-current-address"
                boolean r0 = cm.l.a(r0, r1)
                java.lang.String r1 = "mBinding"
                r2 = 0
                if (r0 == 0) goto L_0x0054
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r3.f21994a
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
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r3.f21994a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0033
                cm.l.v(r1)
                r0 = r2
            L_0x0033:
                android.widget.EditText r0 = r0.M
                r0.setText(r4)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r3.f21994a
                ni.b0 r4 = r4.R
                if (r4 != 0) goto L_0x0044
                cm.l.v(r1)
                goto L_0x0045
            L_0x0044:
                r2 = r4
            L_0x0045:
                android.widget.EditText r4 = r2.M
                r4.setContentDescription(r5)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r3.f21994a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.b3()
            L_0x0050:
                r4.setVillageOrTown(r5)
                goto L_0x0094
            L_0x0054:
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r3.f21994a
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
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r0 = r3.f21994a
                ni.b0 r0 = r0.R
                if (r0 != 0) goto L_0x0076
                cm.l.v(r1)
                r0 = r2
            L_0x0076:
                android.widget.EditText r0 = r0.H
                r0.setText(r4)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r3.f21994a
                ni.b0 r4 = r4.R
                if (r4 != 0) goto L_0x0087
                cm.l.v(r1)
                goto L_0x0088
            L_0x0087:
                r2 = r4
            L_0x0088:
                android.widget.EditText r4 = r2.H
                r4.setContentDescription(r5)
                com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r4 = r3.f21994a
                com.nic.mparivahan.dlservices.data.model.DlAddress r4 = r4.Z2()
                goto L_0x0050
            L_0x0094:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.l.a(java.lang.String, int):void");
        }
    }

    static final class m implements androidx.lifecycle.b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21995a;

        m(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21995a = lVar;
        }

        public final pl.c a() {
            return this.f21995a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21995a.invoke(obj);
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

    public ChangeOfAddressActivity() {
    }

    /* access modifiers changed from: private */
    public final void A2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.F.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.F.setHint(L2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.M = q.i();
        B2();
    }

    /* access modifiers changed from: private */
    public static final void A3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.U.setVisibility(0);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.T.setVisibility(8);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.f25413b0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public final void B2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.E.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.E.setHint(L2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.O = q.i();
        C2();
    }

    /* access modifiers changed from: private */
    public static final void B3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25421j0.setVisibility(8);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.f25420i0.setVisibility(0);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.f25414c0.setVisibility(8);
    }

    private final void C2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.H.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.H.setHint(L2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.Q = q.i();
    }

    /* access modifiers changed from: private */
    public static final void C3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25421j0.setVisibility(0);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.f25420i0.setVisibility(8);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.f25414c0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void D3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25418g0.setVisibility(8);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.f25419h0.setVisibility(0);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.S.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void E3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25418g0.setVisibility(0);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.f25419h0.setVisibility(8);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.S.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void F3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        try {
            Intent intent = new Intent(changeOfAddressActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", changeOfAddressActivity.X);
            intent.putExtra("dob", changeOfAddressActivity.Y);
            intent.putExtra("DLDetails", changeOfAddressActivity.I2());
            intent.putExtra("Mobile_no", changeOfAddressActivity.Z);
            intent.putExtra("lastEndorsedRTO", changeOfAddressActivity.f21956b0);
            intent.putExtra("lastEndorsedState", changeOfAddressActivity.f21957c0);
            intent.putExtra("lastEndorsedRTOCode", changeOfAddressActivity.f21959e0);
            intent.putExtra("lastEndorseStateCode", changeOfAddressActivity.f21958d0);
            intent.putExtra("whatServiceRequired", changeOfAddressActivity.f21962h0);
            changeOfAddressActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void G3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        changeOfAddressActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void H2(String str) {
        try {
            b0 b0Var = this.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            String obj = b0Var.f25434w.getContentDescription().toString();
            z2();
            T2().setVisibility(0);
            c0 c0Var = this.J;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            String obj2 = q.B0(this.f21958d0).toString();
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
            } else {
                b0Var2 = b0Var3;
            }
            c0Var.o(obj2, b0Var2.f25436x.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void H3(View view) {
    }

    private final void I3() {
        ab.d dVar = this.G0;
        ab.d dVar2 = null;
        if (dVar == null) {
            cm.l.v("mCombineViewModel");
            dVar = null;
        }
        dVar.i().g(this, new jj.l(this));
        ab.d dVar3 = this.G0;
        if (dVar3 == null) {
            cm.l.v("mCombineViewModel");
        } else {
            dVar2 = dVar3;
        }
        dVar2.h().g(this, new jj.u(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void J3(com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity r27, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse r28) {
        /*
            r15 = r27
            java.lang.String r14 = "service_is_not_present"
            java.lang.String r0 = "this$0"
            cm.l.f(r15, r0)
            ni.b0 r0 = r15.R
            java.lang.String r19 = "mBinding"
            r13 = 0
            if (r0 != 0) goto L_0x0014
            cm.l.v(r19)
            r0 = r13
        L_0x0014:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0
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
            goto L_0x02b8
        L_0x002f:
            r0 = r13
        L_0x0030:
            java.lang.String r1 = "00"
            r2 = 2
            boolean r0 = km.p.p(r0, r1, r12, r2, r13)     // Catch:{ Exception -> 0x0028 }
            if (r0 == 0) goto L_0x0272
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026c }
            if (r0 == 0) goto L_0x02d6
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026c }
            if (r0 == 0) goto L_0x02d6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x026c }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x026c }
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != r1) goto L_0x02d6
            com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity r20 = new com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity     // Catch:{ Exception -> 0x026c }
            r20.<init>()     // Catch:{ Exception -> 0x026c }
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x026c }
            java.util.List r0 = r0.getResult()     // Catch:{ Exception -> 0x026c }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ Exception -> 0x026c }
            r21 = r0
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r21 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r21     // Catch:{ Exception -> 0x026c }
            if (r21 == 0) goto L_0x02d6
            java.lang.String r0 = ""
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "check_dl_serv_dupl_dl"
            java.lang.String r4 = "Issue of Duplicate DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x0097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "513,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
            goto L_0x0097
        L_0x0090:
            r0 = move-exception
            r25 = r13
            r26 = r14
            goto L_0x0238
        L_0x0097:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "check_dl_serv_renewal_dl"
            java.lang.String r4 = "Renewal of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "514,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x00be:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "revalidtion_expired_dl"
            java.lang.String r4 = "Re-Validation of Expired DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x00e5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "537,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x00e5:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "check_dl_serv_change_addr"
            java.lang.String r4 = "Change of Address in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x010c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "515,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x010c:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "check_dl_serv_replacement_dl"
            java.lang.String r4 = "Replacement of DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x0133
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "516,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x0133:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "check_dl_serv_extract_dl"
            java.lang.String r4 = "DL Extract"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x015a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "523,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x015a:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "hill_region_title"
            java.lang.String r4 = "Endorsement to Drive in Hill Region"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x0181
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "524,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x0181:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "change_name_dl"
            java.lang.String r4 = "Change of Name in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x01a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "526,"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x01a8:
            java.util.ArrayList r1 = r27.W2()     // Catch:{ Exception -> 0x0090 }
            ld.c r2 = r27.L2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "change_birth_dl"
            java.lang.String r4 = "Change of Date of Birth in DL"
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0090 }
            boolean r1 = ql.y.R(r1, r2)     // Catch:{ Exception -> 0x0090 }
            if (r1 == 0) goto L_0x01cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0090 }
            r1.<init>()     // Catch:{ Exception -> 0x0090 }
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "548"
            r1.append(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0090 }
        L_0x01cf:
            r16 = r0
            com.nic.mparivahan.dlservices.DlLog.DlLogCapture$a r1 = com.nic.mparivahan.dlservices.DlLog.DlLogCapture.f21655k     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = "1234"
            java.lang.String r4 = "S"
            java.lang.String r5 = r21.getApplicationDate()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r21.getApplicationNo()     // Catch:{ Exception -> 0x0090 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0090 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0090 }
            ld.g r0 = r27.U2()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = r0.k()     // Catch:{ Exception -> 0x0090 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r9 = r21.getDateofBirth()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r10 = r21.getDlno()     // Catch:{ Exception -> 0x0090 }
            cm.l.c(r10)     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "N"
            java.lang.String r17 = "N"
            java.lang.String r18 = r21.getApplicantGender()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = r15.Z     // Catch:{ Exception -> 0x0090 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x0090 }
            r22 = 0
            r23 = r14
            java.lang.String r14 = r15.f21959e0     // Catch:{ Exception -> 0x0233 }
            r28 = r14
            java.lang.String r14 = r15.f21958d0     // Catch:{ Exception -> 0x0233 }
            r24 = r2
            r2 = r27
            r11 = r0
            r12 = r17
            r25 = r13
            r13 = r18
            r0 = r28
            r18 = r14
            r26 = r23
            r14 = r24
            r15 = r22
            r17 = r0
            r1.a(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0231 }
        L_0x022e:
            r13 = r27
            goto L_0x0242
        L_0x0231:
            r0 = move-exception
            goto L_0x0238
        L_0x0233:
            r0 = move-exception
            r25 = r13
            r26 = r23
        L_0x0238:
            java.lang.String r1 = "valiii"
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch:{ Exception -> 0x0269 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x0269 }
            goto L_0x022e
        L_0x0242:
            java.lang.String r4 = r13.f21959e0     // Catch:{ Exception -> 0x0263 }
            com.nic.mparivahan.Dl.Model.DldetobjX r5 = r27.I2()     // Catch:{ Exception -> 0x0263 }
            java.lang.String r6 = r13.X     // Catch:{ Exception -> 0x0263 }
            java.lang.String r7 = r13.Y     // Catch:{ Exception -> 0x0263 }
            java.lang.String r8 = r13.Z     // Catch:{ Exception -> 0x0263 }
            java.lang.String r9 = r13.f21956b0     // Catch:{ Exception -> 0x0263 }
            java.lang.String r10 = r13.f21957c0     // Catch:{ Exception -> 0x0263 }
            java.lang.String r11 = r13.f21958d0     // Catch:{ Exception -> 0x0263 }
            java.util.ArrayList r12 = r27.Q2()     // Catch:{ Exception -> 0x0263 }
            r1 = r20
            r2 = r27
            r3 = r21
            r1.E2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0263 }
            goto L_0x02d6
        L_0x0263:
            r3 = r26
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            goto L_0x02b8
        L_0x0269:
            r13 = r27
            goto L_0x0263
        L_0x026c:
            r25 = r13
            r13 = r15
            r1 = r11
            r3 = r14
            goto L_0x02b8
        L_0x0272:
            r25 = r13
            r26 = r14
            r13 = r15
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0282
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0263 }
            goto L_0x0284
        L_0x0282:
            r0 = r25
        L_0x0284:
            if (r0 == 0) goto L_0x02a1
            int r0 = r0.length()     // Catch:{ Exception -> 0x0263 }
            if (r0 != 0) goto L_0x028d
            goto L_0x02a1
        L_0x028d:
            com.nic.mparivahan.dlservices.data.model.DlSubmitResult r0 = r28.getDlSubmitresult()     // Catch:{ Exception -> 0x0263 }
            if (r0 == 0) goto L_0x0298
            java.lang.String r0 = r0.getReqStatus()     // Catch:{ Exception -> 0x0263 }
            goto L_0x029a
        L_0x0298:
            r0 = r25
        L_0x029a:
            cm.l.c(r0)     // Catch:{ Exception -> 0x0263 }
            r13.P3(r0)     // Catch:{ Exception -> 0x0263 }
            goto L_0x02d6
        L_0x02a1:
            ld.c r0 = r27.L2()     // Catch:{ Exception -> 0x0263 }
            r1 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r13.getString(r1)     // Catch:{ Exception -> 0x02b6 }
            r3 = r26
            java.lang.String r0 = r0.b(r3, r2)     // Catch:{ Exception -> 0x02b8 }
            r13.P3(r0)     // Catch:{ Exception -> 0x02b8 }
            goto L_0x02d6
        L_0x02b6:
            r3 = r26
        L_0x02b8:
            ni.b0 r0 = r13.R
            if (r0 != 0) goto L_0x02c1
            cm.l.v(r19)
            r0 = r25
        L_0x02c1:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0
            r2 = 0
            r0.c(r2)
            ld.c r0 = r27.L2()
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r0 = r0.b(r3, r1)
            r13.P3(r0)
        L_0x02d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.J3(com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity, com.nic.mparivahan.dlservices.data.model.duplicatedl.GetAckDetForGivenDLNumberResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void K3(ChangeOfAddressActivity changeOfAddressActivity, String str) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25430s0.c(false);
        changeOfAddressActivity.P3(changeOfAddressActivity.L2().b("service_is_not_present", changeOfAddressActivity.getString(R.string.unable_to_get_details)));
    }

    /* access modifiers changed from: private */
    public static final void L3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        changeOfAddressActivity.finish();
    }

    private final void M3(String str) {
        try {
            this.S = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.S, "dl-renewal-current-address")) {
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
            a10.n2(new j(this));
        } catch (Exception unused) {
        }
    }

    private final void N3(String str) {
        try {
            this.S = str;
            u uVar = new u();
            uVar.f20234e = "";
            ArrayList arrayList = new ArrayList();
            String str2 = "R";
            b0 b0Var = null;
            if (cm.l.a(this.S, "dl-renewal-current-address")) {
                List<TalukaMasterItem> list = this.N;
                if (list != null) {
                    for (TalukaMasterItem talukaMasterItem : list) {
                        arrayList.add(String.valueOf(talukaMasterItem != null ? talukaMasterItem.getSubDistname() : null));
                    }
                }
                b0 b0Var2 = this.R;
                if (b0Var2 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var = b0Var2;
                }
                if (b0Var.f25431t0.isChecked()) {
                    str2 = "U";
                }
                uVar.f20234e = str2;
                this.J0 = str2;
            } else {
                List<TalukaMasterItem> list2 = this.O;
                if (list2 != null) {
                    for (TalukaMasterItem talukaMasterItem2 : list2) {
                        arrayList.add(String.valueOf(talukaMasterItem2 != null ? talukaMasterItem2.getSubDistname() : null));
                    }
                }
                b0 b0Var3 = this.R;
                if (b0Var3 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var = b0Var3;
                }
                if (b0Var.I.isChecked()) {
                    str2 = "U";
                }
                uVar.f20234e = str2;
                this.K0 = str2;
            }
            kk.e a10 = kk.e.A0.a("Select Taluka", arrayList);
            a10.k2(F0(), "TalukaPicker");
            a10.n2(new k(this, uVar));
        } catch (Exception unused) {
        }
    }

    private final void O3(String str) {
        try {
            this.S = str;
            ArrayList arrayList = new ArrayList();
            if (cm.l.a(this.S, "dl-renewal-current-address")) {
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
            a10.n2(new l(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void P3(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new v(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Q3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void R3() {
        try {
            String bioPermAdd1 = I2().getBioObj().getBioPermAdd1();
            String bioPermAdd2 = I2().getBioObj().getBioPermAdd2();
            String bioPermAdd3 = I2().getBioObj().getBioPermAdd3();
            int bioPermPin = I2().getBioObj().getBioPermPin();
            String bioTempAdd1 = I2().getBioObj().getBioTempAdd1();
            String bioTempAdd2 = I2().getBioObj().getBioTempAdd2();
            String bioTempAdd3 = I2().getBioObj().getBioTempAdd3();
            int bioTempPin = I2().getBioObj().getBioTempPin();
            b0 b0Var = this.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            b0Var.f25423l0.setText(bioPermAdd1 + ' ' + bioPermAdd2 + ' ' + bioPermAdd3 + ' ' + bioPermPin);
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
                b0Var3 = null;
            }
            b0Var3.f25424m0.setText(bioTempAdd1 + ' ' + bioTempAdd2 + ' ' + bioTempAdd3 + ' ' + bioTempPin);
            if (p.o(F2(), "S", true) && !cm.l.a(d3().b(), VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                b0 b0Var4 = this.R;
                if (b0Var4 == null) {
                    cm.l.v("mBinding");
                    b0Var4 = null;
                }
                b0Var4.D0.setText(L2().b("current_add_details", getString(R.string.current_address_details)));
                b0 b0Var5 = this.R;
                if (b0Var5 == null) {
                    cm.l.v("mBinding");
                    b0Var5 = null;
                }
                b0Var5.E0.setText(L2().b("permanent_add_details", getString(R.string.perm_add_det)));
                if (bioTempAdd1 != null) {
                    b0 b0Var6 = this.R;
                    if (b0Var6 == null) {
                        cm.l.v("mBinding");
                        b0Var6 = null;
                    }
                    b0Var6.L.setText(bioTempAdd1);
                }
                if (bioTempAdd2 != null) {
                    b0 b0Var7 = this.R;
                    if (b0Var7 == null) {
                        cm.l.v("mBinding");
                        b0Var7 = null;
                    }
                    b0Var7.P.setText(bioTempAdd2);
                }
                if (bioTempAdd3 != null) {
                    b0 b0Var8 = this.R;
                    if (b0Var8 == null) {
                        cm.l.v("mBinding");
                        b0Var8 = null;
                    }
                    b0Var8.N.setText(bioTempAdd3);
                }
                if (bioPermAdd1 != null) {
                    b0 b0Var9 = this.R;
                    if (b0Var9 == null) {
                        cm.l.v("mBinding");
                        b0Var9 = null;
                    }
                    b0Var9.A.setText(bioTempAdd1);
                }
                if (bioPermAdd2 != null) {
                    b0 b0Var10 = this.R;
                    if (b0Var10 == null) {
                        cm.l.v("mBinding");
                        b0Var10 = null;
                    }
                    b0Var10.D.setText(bioTempAdd2);
                }
                if (bioPermAdd3 != null) {
                    b0 b0Var11 = this.R;
                    if (b0Var11 == null) {
                        cm.l.v("mBinding");
                    } else {
                        b0Var2 = b0Var11;
                    }
                    b0Var2.B.setText(bioTempAdd3);
                }
            }
        } catch (Exception e10) {
            Toast.makeText(this, e10.getLocalizedMessage(), 1).show();
        }
    }

    private final void S3() {
        ab.d dVar;
        b0 b0Var;
        Intent intent;
        String str;
        String str2;
        String str3;
        ArrayList W2;
        if (m3()) {
            Class<CombineReq> cls = CombineReq.class;
            if (W2().size() > this.E0) {
                try {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    i7.d dVar2 = new i7.d();
                    CombineReq combineReq = (CombineReq) dVar2.j(defaultSharedPreferences.getString("MultiService", ""), cls);
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
                    combineReq2.setApplDateOfBirth(combineReq.getApplDateOfBirth());
                    combineReq2.setCodobDlReasonName(combineReq.getCodobDlReasonName());
                    combineReq2.setCodobDlReasonCode(combineReq.getCodobDlReasonCode());
                    combineReq2.setDeclaringcheck("Y");
                    combineReq2.setHillcertificate(combineReq.getHillcertificate());
                    combineReq2.setHillissueDate(combineReq.getHillissueDate());
                    combineReq2.setHillvalidFrom(combineReq.getHillvalidFrom());
                    combineReq2.setHillvalidTo(combineReq.getHillvalidTo());
                    combineReq2.setHilldrivingschool(combineReq.getHilldrivingschool());
                    combineReq2.setHillissby(combineReq.getHillissby());
                    b0 b0Var2 = this.R;
                    if (b0Var2 == null) {
                        cm.l.v("mBinding");
                        b0Var2 = null;
                    }
                    combineReq2.setPerHouseNo(b0Var2.A.getText().toString());
                    b0 b0Var3 = this.R;
                    if (b0Var3 == null) {
                        cm.l.v("mBinding");
                        b0Var3 = null;
                    }
                    combineReq2.setPerStreet(b0Var3.D.getText().toString());
                    b0 b0Var4 = this.R;
                    if (b0Var4 == null) {
                        cm.l.v("mBinding");
                        b0Var4 = null;
                    }
                    combineReq2.setPerLocation(b0Var4.B.getText().toString());
                    String villageOrTown = this.U.getVillageOrTown();
                    cm.l.c(villageOrTown);
                    combineReq2.setPermVillageOrTown(villageOrTown);
                    String subDistrict = this.U.getSubDistrict();
                    cm.l.c(subDistrict);
                    combineReq2.setPerSubDistrict(subDistrict);
                    String district = this.U.getDistrict();
                    cm.l.c(district);
                    combineReq2.setPerDistrict(district);
                    combineReq2.setPerState(Y2());
                    b0 b0Var5 = this.R;
                    if (b0Var5 == null) {
                        cm.l.v("mBinding");
                        b0Var5 = null;
                    }
                    combineReq2.setPerPinCode(b0Var5.O.getText().toString());
                    b0 b0Var6 = this.R;
                    if (b0Var6 == null) {
                        cm.l.v("mBinding");
                        b0Var6 = null;
                    }
                    combineReq2.setPresHouseNo(b0Var6.L.getText().toString());
                    b0 b0Var7 = this.R;
                    if (b0Var7 == null) {
                        cm.l.v("mBinding");
                        b0Var7 = null;
                    }
                    combineReq2.setPresStreet(b0Var7.P.getText().toString());
                    b0 b0Var8 = this.R;
                    if (b0Var8 == null) {
                        cm.l.v("mBinding");
                        b0Var8 = null;
                    }
                    combineReq2.setPresLocation(b0Var8.N.getText().toString());
                    String villageOrTown2 = this.T.getVillageOrTown();
                    cm.l.c(villageOrTown2);
                    combineReq2.setPresVillageOrTown(villageOrTown2);
                    String subDistrict2 = this.T.getSubDistrict();
                    cm.l.c(subDistrict2);
                    combineReq2.setPresSubDistrict(subDistrict2);
                    String district2 = this.T.getDistrict();
                    cm.l.c(district2);
                    combineReq2.setPresDistrict(district2);
                    combineReq2.setPresState(G2());
                    b0 b0Var9 = this.R;
                    if (b0Var9 == null) {
                        cm.l.v("mBinding");
                        b0Var = null;
                    } else {
                        b0Var = b0Var9;
                    }
                    combineReq2.setPresPincode(b0Var.O.getText().toString());
                    SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    edit.putString("MultiService", dVar2.t(combineReq2));
                    edit.commit();
                    if (cm.l.a(W2().get(this.E0), L2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL"))) {
                        setIntent(new Intent(this, DLDuplicateActivity.class));
                        intent = getIntent();
                        cm.l.e(intent, "getIntent(...)");
                        str = this.f21959e0;
                        str2 = this.f21957c0;
                        str3 = "513";
                        W2 = W2();
                    } else {
                        Class<RenewalOfDLActivity> cls2 = RenewalOfDLActivity.class;
                        if (cm.l.a(W2().get(this.E0), L2().b("check_dl_serv_renewal_dl", "Renewal of DL"))) {
                            setIntent(new Intent(this, cls2));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "514";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("revalidtion_expired_dl", "Re-Validation of Expired DL"))) {
                            setIntent(new Intent(this, cls2));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "537";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("check_dl_serv_change_addr", "Change of Address in DL"))) {
                            setIntent(new Intent(this, ChangeOfAddressActivity.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "515";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("check_dl_serv_replacement_dl", "Replacement of DL"))) {
                            setIntent(new Intent(this, DLReplecementActivity.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "516";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("check_dl_serv_extract_dl", "DL Extract"))) {
                            setIntent(new Intent(this, DLExtractActivity.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "523";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("hill_region_title", "Endorsement to Drive in Hill Region"))) {
                            setIntent(new Intent(this, HillReligion.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "524";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("change_name_dl", "Change of Name in DL"))) {
                            setIntent(new Intent(this, ChangeOfName.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "526";
                            W2 = W2();
                        } else if (cm.l.a(W2().get(this.E0), L2().b("change_birth_dl", "Change of Date of Birth in DL"))) {
                            setIntent(new Intent(this, DobChangeActivity.class));
                            intent = getIntent();
                            cm.l.e(intent, "getIntent(...)");
                            str = this.f21959e0;
                            str2 = this.f21957c0;
                            str3 = "548";
                            W2 = W2();
                        } else {
                            return;
                        }
                    }
                    l3(intent, str, str2, str3, W2);
                } catch (Exception e10) {
                    Log.d("multi_error", e10.getLocalizedMessage());
                }
            } else {
                try {
                    CombineReq combineReq3 = (CombineReq) new i7.d().j(PreferenceManager.getDefaultSharedPreferences(getApplicationContext()).getString("MultiService", ""), cls);
                    if (com.nic.mparivahan.a.f9624a.a(this)) {
                        b0 b0Var10 = this.R;
                        if (b0Var10 == null) {
                            cm.l.v("mBinding");
                            b0Var10 = null;
                        }
                        b0Var10.f25430s0.c(true);
                        ArrayList arrayList = new ArrayList();
                        int size = I2().getDlcovs().size();
                        for (int i10 = 0; i10 < size; i10++) {
                            arrayList.add(String.valueOf(I2().getDlcovs().get(i10).getDcCovcd()));
                        }
                        ab.d dVar3 = this.G0;
                        if (dVar3 == null) {
                            cm.l.v("mCombineViewModel");
                            dVar = null;
                        } else {
                            dVar = dVar3;
                        }
                        boolean z10 = this.C0;
                        String F2 = F2();
                        String D2 = D2();
                        ArrayList W22 = W2();
                        String str4 = this.f21969o0;
                        String dlHolderAltMobMum = combineReq3.getDlHolderAltMobMum();
                        cm.l.c(dlHolderAltMobMum);
                        String obj = q.B0(String.valueOf(this.X)).toString();
                        String str5 = this.Y;
                        cm.l.c(str5);
                        String str6 = this.f21959e0;
                        String willtoDonateOrgans = combineReq3.getWilltoDonateOrgans();
                        cm.l.c(willtoDonateOrgans);
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
                        String str7 = this.Z;
                        cm.l.c(str7);
                        String changeOfAddReq = combineReq3.getChangeOfAddReq();
                        cm.l.c(changeOfAddReq);
                        b0 b0Var11 = this.R;
                        if (b0Var11 == null) {
                            cm.l.v("mBinding");
                            b0Var11 = null;
                        }
                        String obj2 = b0Var11.A.getText().toString();
                        b0 b0Var12 = this.R;
                        if (b0Var12 == null) {
                            cm.l.v("mBinding");
                            b0Var12 = null;
                        }
                        String obj3 = b0Var12.D.getText().toString();
                        b0 b0Var13 = this.R;
                        if (b0Var13 == null) {
                            cm.l.v("mBinding");
                            b0Var13 = null;
                        }
                        String obj4 = b0Var13.B.getText().toString();
                        String villageOrTown3 = this.U.getVillageOrTown();
                        cm.l.c(villageOrTown3);
                        String subDistrict3 = this.U.getSubDistrict();
                        cm.l.c(subDistrict3);
                        String district3 = this.U.getDistrict();
                        cm.l.c(district3);
                        String Y2 = Y2();
                        b0 b0Var14 = this.R;
                        if (b0Var14 == null) {
                            cm.l.v("mBinding");
                            b0Var14 = null;
                        }
                        String obj5 = b0Var14.O.getText().toString();
                        b0 b0Var15 = this.R;
                        if (b0Var15 == null) {
                            cm.l.v("mBinding");
                            b0Var15 = null;
                        }
                        String obj6 = b0Var15.L.getText().toString();
                        b0 b0Var16 = this.R;
                        if (b0Var16 == null) {
                            cm.l.v("mBinding");
                            b0Var16 = null;
                        }
                        String obj7 = b0Var16.P.getText().toString();
                        b0 b0Var17 = this.R;
                        if (b0Var17 == null) {
                            cm.l.v("mBinding");
                            b0Var17 = null;
                        }
                        String obj8 = b0Var17.N.getText().toString();
                        String villageOrTown4 = this.T.getVillageOrTown();
                        cm.l.c(villageOrTown4);
                        String subDistrict4 = this.T.getSubDistrict();
                        cm.l.c(subDistrict4);
                        String district4 = this.T.getDistrict();
                        cm.l.c(district4);
                        String G2 = G2();
                        b0 b0Var18 = this.R;
                        if (b0Var18 == null) {
                            cm.l.v("mBinding");
                            b0Var18 = null;
                        }
                        String obj9 = b0Var18.O.getText().toString();
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
                        String declaringcheck = combineReq3.getDeclaringcheck();
                        cm.l.c(declaringcheck);
                        String hillcertificate = combineReq3.getHillcertificate();
                        cm.l.c(hillcertificate);
                        String hillissueDate = combineReq3.getHillissueDate();
                        cm.l.c(hillissueDate);
                        String hillvalidFrom = combineReq3.getHillvalidFrom();
                        cm.l.c(hillvalidFrom);
                        String hillvalidTo = combineReq3.getHillvalidTo();
                        cm.l.c(hillvalidTo);
                        String hilldrivingschool = combineReq3.getHilldrivingschool();
                        cm.l.c(hilldrivingschool);
                        String hillissby = combineReq3.getHillissby();
                        cm.l.c(hillissby);
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
                        dVar.g(z10, arrayList, F2, D2, W22, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", str4, dlHolderAltMobMum, obj, str5, str6, willtoDonateOrgans, relationType, valueOf, conDlReasonName, dlHolderNaturalName, conEffdate, applFirstName, applLastName, relFirstName, relLastName, str7, changeOfAddReq, obj2, obj3, obj4, villageOrTown3, subDistrict3, district3, Y2, obj5, obj6, obj7, obj8, villageOrTown4, subDistrict4, district4, G2, obj9, dleDlReasonCode, dleDlReasonName, dupDlReasonName, dupDlReasonCode, applDateOfBirth, codobDlReasonName, codobDlReasonCode, declaringcheck, hillcertificate, hillissueDate, hillvalidFrom, hillvalidTo, hilldrivingschool, hillissby, pofbirth, country, passno, passvaltill, visano, visavaltill, tovisit, iscountryrestricted, countryRestrictedReason, isDlSerdisqualified, dlSerdisqualifiedReason, forAdd1, forAdd2, forAdd3, forAddPinCode, forNationMobNum, emailID, appliedIdpfromIndEmb, indEmbName, embPlace, dateOfVerifEmb, embEndorseNo, idpcountryapplyfrom, d3().f(), d3().g(), d3().e(), d3().h());
                        return;
                    }
                    Toast.makeText(getApplicationContext(), L2().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final void T3() {
        RadioButton radioButton;
        try {
            this.U = this.T;
            h4(this.f21958d0);
            X3(this.f21958d0);
            b0 b0Var = this.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            EditText editText = b0Var.F;
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
                b0Var3 = null;
            }
            editText.setText(b0Var3.f25436x.getText());
            b0 b0Var4 = this.R;
            if (b0Var4 == null) {
                cm.l.v("mBinding");
                b0Var4 = null;
            }
            EditText editText2 = b0Var4.E;
            b0 b0Var5 = this.R;
            if (b0Var5 == null) {
                cm.l.v("mBinding");
                b0Var5 = null;
            }
            editText2.setText(b0Var5.f25434w.getText());
            b0 b0Var6 = this.R;
            if (b0Var6 == null) {
                cm.l.v("mBinding");
                b0Var6 = null;
            }
            EditText editText3 = b0Var6.H;
            b0 b0Var7 = this.R;
            if (b0Var7 == null) {
                cm.l.v("mBinding");
                b0Var7 = null;
            }
            editText3.setText(b0Var7.M.getText());
            b0 b0Var8 = this.R;
            if (b0Var8 == null) {
                cm.l.v("mBinding");
                b0Var8 = null;
            }
            EditText editText4 = b0Var8.A;
            b0 b0Var9 = this.R;
            if (b0Var9 == null) {
                cm.l.v("mBinding");
                b0Var9 = null;
            }
            editText4.setText(b0Var9.L.getText());
            b0 b0Var10 = this.R;
            if (b0Var10 == null) {
                cm.l.v("mBinding");
                b0Var10 = null;
            }
            EditText editText5 = b0Var10.D;
            b0 b0Var11 = this.R;
            if (b0Var11 == null) {
                cm.l.v("mBinding");
                b0Var11 = null;
            }
            editText5.setText(b0Var11.P.getText());
            b0 b0Var12 = this.R;
            if (b0Var12 == null) {
                cm.l.v("mBinding");
                b0Var12 = null;
            }
            EditText editText6 = b0Var12.B;
            b0 b0Var13 = this.R;
            if (b0Var13 == null) {
                cm.l.v("mBinding");
                b0Var13 = null;
            }
            editText6.setText(b0Var13.N.getText());
            b0 b0Var14 = this.R;
            if (b0Var14 == null) {
                cm.l.v("mBinding");
                b0Var14 = null;
            }
            EditText editText7 = b0Var14.C;
            b0 b0Var15 = this.R;
            if (b0Var15 == null) {
                cm.l.v("mBinding");
                b0Var15 = null;
            }
            editText7.setText(b0Var15.O.getText());
            b0 b0Var16 = this.R;
            if (b0Var16 == null) {
                cm.l.v("mBinding");
                b0Var16 = null;
            }
            if (b0Var16.R0.isChecked()) {
                b0 b0Var17 = this.R;
                if (b0Var17 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var2 = b0Var17;
                }
                radioButton = b0Var2.J;
            } else {
                b0 b0Var18 = this.R;
                if (b0Var18 == null) {
                    cm.l.v("mBinding");
                    b0Var18 = null;
                }
                if (b0Var18.f25431t0.isChecked()) {
                    b0 b0Var19 = this.R;
                    if (b0Var19 == null) {
                        cm.l.v("mBinding");
                    } else {
                        b0Var2 = b0Var19;
                    }
                    radioButton = b0Var2.I;
                }
                this.K0 = this.J0;
            }
            radioButton.setChecked(true);
            this.K0 = this.J0;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void a3(String str) {
        try {
            b0 b0Var = this.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            String obj = b0Var.E.getContentDescription().toString();
            C2();
            T2().setVisibility(0);
            c0 c0Var = this.J;
            if (c0Var == null) {
                cm.l.v("viewModel");
                c0Var = null;
            }
            String obj2 = q.B0(this.f21958d0).toString();
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
            } else {
                b0Var2 = b0Var3;
            }
            c0Var.o(obj2, b0Var2.F.getContentDescription().toString(), obj, str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:40|41|42|43|(1:45)(1:47)|46|48|(1:50)|51|(1:53)|54|(3:56|57|(5:59|(1:61)|62|(1:64)|65))|66|67|(3:69|(1:71)|72)(3:74|(1:76)|77)|73) */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:1|2|3|(2:5|6)|7|(1:9)(1:10)|11|(5:13|(1:15)|16|(1:18)|19)(9:20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)(1:32)|33)|34|(1:36)|37|38|(16:40|41|42|43|(1:45)(1:47)|46|48|(1:50)|51|(1:53)|54|(3:56|57|(5:59|(1:61)|62|(1:64)|65))|66|67|(3:69|(1:71)|72)(3:74|(1:76)|77)|73)|78|79|(1:81)|82|(1:84)|85|(2:87|(3:89|(1:91)(1:92)|93)(9:95|(1:97)|98|(1:100)|101|(1:103)(1:104)|105|111|113))(3:106|(1:108)(1:109)|110)|94) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x02ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x02f3 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0393 A[Catch:{ Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02c6 A[Catch:{ Exception -> 0x02f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02e0 A[Catch:{ Exception -> 0x02f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02f7 A[Catch:{ Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x030b A[Catch:{ Exception -> 0x03a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0329 A[Catch:{ Exception -> 0x03a9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e3() {
        /*
            r16 = this;
            r6 = r16
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>"
            java.lang.String r1 = "lastEndorsedRTOCode"
            java.lang.String r7 = "950"
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.String"
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "bioRecGenesis"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03a9 }
            r6.W3(r3)     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "allowAddrChangeAtDlservReqst"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03a9 }
            r6.U3(r3)     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "DL"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03a9 }
            r6.X = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "dob"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03a9 }
            r6.Y = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "Mobile_no"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03a9 }
            r6.Z = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = r3.getStringExtra(r1)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21955a0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "state_value"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21960f0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "purCode"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21961g0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "lastEndorsedRTO"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21956b0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "lastEndorsedState"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21957c0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = "lastEndorseStateCode"
            java.lang.String r3 = r3.getStringExtra(r4)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21958d0 = r3     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r3 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = r3.getStringExtra(r1)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.f21959e0 = r1     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "whatServiceRequired"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "null cannot be cast to non-null type java.util.HashMap<kotlin.String?, kotlin.String?>"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x03a9 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ Exception -> 0x03a9 }
            r6.f21962h0 = r1     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "DLDetails"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x03a9 }
            r6.Y3(r1)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r8 = "mBinding"
            r9 = 0
            if (r1 != 0) goto L_0x00f3
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x00f3:
            android.widget.TextView r1 = r1.f25440z     // Catch:{ Exception -> 0x03a9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03a9 }
            r3.<init>()     // Catch:{ Exception -> 0x03a9 }
            ld.c r4 = r16.L2()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r5 = "dl_no"
            java.lang.String r10 = "DL No. : "
            java.lang.String r4 = r4.b(r5, r10)     // Catch:{ Exception -> 0x03a9 }
            r3.append(r4)     // Catch:{ Exception -> 0x03a9 }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r4 = r6.X     // Catch:{ Exception -> 0x03a9 }
            r3.append(r4)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x03a9 }
            r1.setText(r3)     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r16.I2()     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x03a9 }
            if (r1 == 0) goto L_0x0129
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x03a9 }
            goto L_0x012a
        L_0x0129:
            r1 = r9
        L_0x012a:
            r10 = 8
            r11 = 0
            if (r1 != 0) goto L_0x014a
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x0137
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x0137:
            androidx.cardview.widget.CardView r1 = r1.f25426o0     // Catch:{ Exception -> 0x03a9 }
            r1.setVisibility(r10)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x0144
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x0144:
            androidx.cardview.widget.CardView r1 = r1.X     // Catch:{ Exception -> 0x03a9 }
            r1.setVisibility(r11)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x0185
        L_0x014a:
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x0152
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x0152:
            androidx.cardview.widget.CardView r1 = r1.f25426o0     // Catch:{ Exception -> 0x03a9 }
            r1.setVisibility(r11)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x015f
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x015f:
            androidx.cardview.widget.CardView r1 = r1.X     // Catch:{ Exception -> 0x03a9 }
            r1.setVisibility(r10)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x016c
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r1 = r9
        L_0x016c:
            android.widget.ImageView r1 = r1.Y     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = r16.I2()     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r3 = r3.getBioImgObj()     // Catch:{ Exception -> 0x03a9 }
            if (r3 == 0) goto L_0x017d
            java.lang.String r3 = r3.getBiPhoto()     // Catch:{ Exception -> 0x03a9 }
            goto L_0x017e
        L_0x017d:
            r3 = r9
        L_0x017e:
            android.graphics.Bitmap r3 = com.nic.mparivahan.dlservices.utilities.d.a(r3)     // Catch:{ Exception -> 0x03a9 }
            r1.setImageBitmap(r3)     // Catch:{ Exception -> 0x03a9 }
        L_0x0185:
            ld.f r1 = r16.d3()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = r1.g()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "Y"
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x03a9 }
            if (r1 == 0) goto L_0x01a6
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "aadharData"
            android.os.Parcelable r1 = r1.getParcelableExtra(r3)     // Catch:{ Exception -> 0x03a9 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x03a9 }
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r1 = (com.nic.mparivahan.VahanEkyc.Aadarkyc.DOEkyc) r1     // Catch:{ Exception -> 0x03a9 }
            r6.I0 = r1     // Catch:{ Exception -> 0x03a9 }
        L_0x01a6:
            ld.f r1 = r16.d3()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = r1.b()     // Catch:{ Exception -> 0x03a9 }
            boolean r1 = cm.l.a(r1, r7)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r12 = "Change of Address in DL"
            java.lang.String r13 = "check_dl_serv_change_addr"
            r14 = 1
            if (r1 == 0) goto L_0x02f3
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "serialNo"
            int r1 = r1.getIntExtra(r3, r11)     // Catch:{ Exception -> 0x03a9 }
            r6.E0 = r1     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "multiList"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x03a9 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x03a9 }
            r6.f4(r1)     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r1 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r3 = "listHeaderSteps"
            java.io.Serializable r1 = r1.getSerializableExtra(r3)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x03a9 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x03a9 }
            r6.a4(r1)     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r0 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = "metaflag"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ Exception -> 0x03a9 }
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x03a9 }
            r6.F0 = r0     // Catch:{ Exception -> 0x03a9 }
            android.content.Intent r0 = r16.getIntent()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = "COA"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x03a9 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x03a9 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x03a9 }
            r6.C0 = r0     // Catch:{ Exception -> 0x03a9 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x02f3 }
            r1 = 30
            if (r0 < r1) goto L_0x0239
            android.view.WindowManager r0 = r16.getWindowManager()     // Catch:{ Exception -> 0x02f3 }
            android.view.WindowMetrics r0 = r0.getMaximumWindowMetrics()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = "getMaximumWindowMetrics(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x02f3 }
            android.graphics.Rect r0 = r0.getBounds()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = "getBounds(...)"
            cm.l.e(r0, r1)     // Catch:{ Exception -> 0x02f3 }
            int r0 = r0.right     // Catch:{ Exception -> 0x02f3 }
            r6.D0 = r0     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = "Width"
        L_0x0231:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x02f3 }
            android.util.Log.d(r1, r0)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x0248
        L_0x0239:
            android.content.res.Resources r0 = r16.getResources()     // Catch:{ Exception -> 0x02f3 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x02f3 }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x02f3 }
            r6.D0 = r0     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r1 = "Width 1"
            goto L_0x0231
        L_0x0248:
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x0250
            cm.l.v(r8)     // Catch:{ Exception -> 0x02f3 }
            r0 = r9
        L_0x0250:
            ni.yb r0 = r0.f25416e0     // Catch:{ Exception -> 0x02f3 }
            android.widget.TextView r0 = r0.f29581h     // Catch:{ Exception -> 0x02f3 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x02f3 }
            if (r1 != 0) goto L_0x025c
            cm.l.v(r8)     // Catch:{ Exception -> 0x02f3 }
            r1 = r9
        L_0x025c:
            ni.yb r1 = r1.f25416e0     // Catch:{ Exception -> 0x02f3 }
            android.widget.TextView r1 = r1.f29581h     // Catch:{ Exception -> 0x02f3 }
            int r1 = r1.getPaintFlags()     // Catch:{ Exception -> 0x02f3 }
            r1 = r1 | r10
            r0.setPaintFlags(r1)     // Catch:{ Exception -> 0x02f3 }
            ld.f r0 = r16.d3()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x02f3 }
            boolean r0 = cm.l.a(r0, r7)     // Catch:{ Exception -> 0x02f3 }
            if (r0 == 0) goto L_0x02ba
            java.util.ArrayList r0 = r16.Q2()     // Catch:{ Exception -> 0x02ba }
            int r0 = r0.size()     // Catch:{ Exception -> 0x02ba }
            if (r0 <= r14) goto L_0x02ba
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x02ba }
            if (r0 != 0) goto L_0x0288
            cm.l.v(r8)     // Catch:{ Exception -> 0x02ba }
            r0 = r9
        L_0x0288:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f25417f0     // Catch:{ Exception -> 0x02ba }
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x02ba }
            r1.<init>(r6, r11, r11)     // Catch:{ Exception -> 0x02ba }
            r0.setLayoutManager(r1)     // Catch:{ Exception -> 0x02ba }
            bb.a r15 = new bb.a     // Catch:{ Exception -> 0x02ba }
            java.util.ArrayList r1 = r16.Q2()     // Catch:{ Exception -> 0x02ba }
            int r3 = r6.E0     // Catch:{ Exception -> 0x02ba }
            int r4 = r6.D0     // Catch:{ Exception -> 0x02ba }
            ld.c r0 = r16.L2()     // Catch:{ Exception -> 0x02ba }
            java.lang.String r5 = r0.b(r13, r12)     // Catch:{ Exception -> 0x02ba }
            cm.l.c(r5)     // Catch:{ Exception -> 0x02ba }
            r0 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ Exception -> 0x02ba }
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x02ba }
            if (r0 != 0) goto L_0x02b5
            cm.l.v(r8)     // Catch:{ Exception -> 0x02ba }
            r0 = r9
        L_0x02b5:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f25417f0     // Catch:{ Exception -> 0x02ba }
            r0.setAdapter(r15)     // Catch:{ Exception -> 0x02ba }
        L_0x02ba:
            int r0 = r6.E0     // Catch:{ Exception -> 0x02f3 }
            java.util.ArrayList r1 = r16.W2()     // Catch:{ Exception -> 0x02f3 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x02f3 }
            if (r0 != r1) goto L_0x02e0
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r8)     // Catch:{ Exception -> 0x02f3 }
            r0 = r9
        L_0x02ce:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0     // Catch:{ Exception -> 0x02f3 }
            ld.c r1 = r16.L2()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r2 = "vahan_btn_submit"
            java.lang.String r3 = "Submit"
        L_0x02d8:
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x02f3 }
            r0.setText(r1)     // Catch:{ Exception -> 0x02f3 }
            goto L_0x02f3
        L_0x02e0:
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x02f3 }
            if (r0 != 0) goto L_0x02e8
            cm.l.v(r8)     // Catch:{ Exception -> 0x02f3 }
            r0 = r9
        L_0x02e8:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0     // Catch:{ Exception -> 0x02f3 }
            ld.c r1 = r16.L2()     // Catch:{ Exception -> 0x02f3 }
            java.lang.String r2 = "btn_dl_serv_next"
            java.lang.String r3 = "Next"
            goto L_0x02d8
        L_0x02f3:
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x02fb
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r0 = r9
        L_0x02fb:
            ni.yb r0 = r0.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29581h     // Catch:{ Exception -> 0x03a9 }
            jj.q r1 = new jj.q     // Catch:{ Exception -> 0x03a9 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x03a9 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x030f
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r0 = r9
        L_0x030f:
            ni.yb r0 = r0.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x03a9 }
            jj.r r1 = new jj.r     // Catch:{ Exception -> 0x03a9 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x03a9 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x03a9 }
            ld.f r0 = r16.d3()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x03a9 }
            boolean r0 = cm.l.a(r0, r7)     // Catch:{ Exception -> 0x03a9 }
            if (r0 == 0) goto L_0x0393
            java.util.ArrayList r0 = r16.Q2()     // Catch:{ Exception -> 0x03a9 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x03a9 }
            if (r0 != r14) goto L_0x034e
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x033b
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x033c
        L_0x033b:
            r9 = r0
        L_0x033c:
            ni.yb r0 = r9.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x03a9 }
            java.util.ArrayList r1 = r16.Q2()     // Catch:{ Exception -> 0x03a9 }
            java.lang.Object r1 = r1.get(r11)     // Catch:{ Exception -> 0x03a9 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x03a9 }
        L_0x034a:
            r0.setText(r1)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x03a9
        L_0x034e:
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x0356
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r0 = r9
        L_0x0356:
            ni.yb r0 = r0.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x03a9 }
            ld.c r1 = r16.L2()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r2 = "dl_services"
            r3 = 2132017656(0x7f1401f8, float:1.9673597E38)
            java.lang.String r3 = r6.getString(r3)     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x03a9 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x03a9 }
            r0.setText(r1)     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x0379
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            r0 = r9
        L_0x0379:
            ni.yb r0 = r0.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x03a9 }
            ni.b0 r1 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r1 != 0) goto L_0x0385
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x0386
        L_0x0385:
            r9 = r1
        L_0x0386:
            ni.yb r1 = r9.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r1 = r1.f29580g     // Catch:{ Exception -> 0x03a9 }
            int r1 = r1.getPaintFlags()     // Catch:{ Exception -> 0x03a9 }
            r1 = r1 | r10
            r0.setPaintFlags(r1)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x03a9
        L_0x0393:
            ni.b0 r0 = r6.R     // Catch:{ Exception -> 0x03a9 }
            if (r0 != 0) goto L_0x039b
            cm.l.v(r8)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x039c
        L_0x039b:
            r9 = r0
        L_0x039c:
            ni.yb r0 = r9.f25416e0     // Catch:{ Exception -> 0x03a9 }
            android.widget.TextView r0 = r0.f29580g     // Catch:{ Exception -> 0x03a9 }
            ld.c r1 = r16.L2()     // Catch:{ Exception -> 0x03a9 }
            java.lang.String r1 = r1.b(r13, r12)     // Catch:{ Exception -> 0x03a9 }
            goto L_0x034a
        L_0x03a9:
            r16.R3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.e3():void");
    }

    /* access modifiers changed from: private */
    public static final void f3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        try {
            Intent intent = new Intent(changeOfAddressActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", changeOfAddressActivity.X);
            intent.putExtra("dob", changeOfAddressActivity.Y);
            intent.putExtra("DLDetails", changeOfAddressActivity.I2());
            intent.putExtra("Mobile_no", changeOfAddressActivity.Z);
            intent.putExtra("lastEndorsedRTO", changeOfAddressActivity.f21956b0);
            intent.putExtra("lastEndorsedState", changeOfAddressActivity.f21957c0);
            intent.putExtra("lastEndorsedRTOCode", changeOfAddressActivity.f21959e0);
            intent.putExtra("lastEndorseStateCode", changeOfAddressActivity.f21958d0);
            intent.putExtra("whatServiceRequired", changeOfAddressActivity.f21962h0);
            if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", changeOfAddressActivity.W2());
            }
            changeOfAddressActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void g3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                if (changeOfAddressActivity.Q2().size() > 1) {
                    Dialog dialog = new Dialog(changeOfAddressActivity);
                    dialog.setContentView(R.layout.layout_multi);
                    Window window = dialog.getWindow();
                    cm.l.c(window);
                    int i10 = 0;
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
                    textView.setText(changeOfAddressActivity.L2().b("btn_ok", "OK"));
                    ((TextView) findViewById5).setText(changeOfAddressActivity.L2().b("title_dl_services", "Driving Licence Services"));
                    ((ImageView) findViewById).setOnClickListener(new s(dialog));
                    textView.setOnClickListener(new t(dialog));
                    int size = changeOfAddressActivity.Q2().size();
                    String str = "";
                    String str2 = str;
                    while (i10 < size) {
                        str = str + ((String) changeOfAddressActivity.Q2().get(i10)) + 10;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        i10++;
                        sb2.append(i10);
                        sb2.append(".\n");
                        str2 = sb2.toString();
                    }
                    textView2.setText(str);
                    textView3.setText(str2);
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
    public static final void h3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void i3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void j3() {
        this.J = (c0) new u0(this).a(c0.class);
        b0 b0Var = this.R;
        c0 c0Var = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.v(this);
        b0 b0Var2 = this.R;
        if (b0Var2 == null) {
            cm.l.v("mBinding");
            b0Var2 = null;
        }
        b0Var2.y(this.T);
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.x(this.U);
        try {
            if (com.nic.mparivahan.a.f9624a.a(this)) {
                X2().show();
                c0 c0Var2 = this.J;
                if (c0Var2 == null) {
                    cm.l.v("viewModel");
                    c0Var2 = null;
                }
                c0Var2.m();
            } else {
                Toast.makeText(getApplicationContext(), L2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 1).show();
            }
        } catch (Exception unused) {
        }
        c0 c0Var3 = this.J;
        if (c0Var3 == null) {
            cm.l.v("viewModel");
            c0Var3 = null;
        }
        c0Var3.i().g(this, new m(new b(this)));
        c0 c0Var4 = this.J;
        if (c0Var4 == null) {
            cm.l.v("viewModel");
            c0Var4 = null;
        }
        c0Var4.h().g(this, new m(new c(this)));
        c0 c0Var5 = this.J;
        if (c0Var5 == null) {
            cm.l.v("viewModel");
            c0Var5 = null;
        }
        c0Var5.k().g(this, new m(new d(this)));
        c0 c0Var6 = this.J;
        if (c0Var6 == null) {
            cm.l.v("viewModel");
            c0Var6 = null;
        }
        c0Var6.l().g(this, new m(new e(this)));
        c0 c0Var7 = this.J;
        if (c0Var7 == null) {
            cm.l.v("viewModel");
        } else {
            c0Var = c0Var7;
        }
        c0Var.j().g(this, new m(new f(this)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [ni.b0] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void j4() {
        /*
            r7 = this;
            ld.f r0 = r7.d3()
            java.lang.String r0 = r0.g()
            java.lang.String r1 = "Y"
            boolean r0 = cm.l.a(r0, r1)
            r1 = 0
            java.lang.String r2 = "mBinding"
            r3 = 0
            if (r0 == 0) goto L_0x029f
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x001c
            cm.l.v(r2)
            r0 = r3
        L_0x001c:
            android.widget.CheckBox r0 = r0.f25427p0
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0029
            cm.l.v(r2)
            r0 = r3
        L_0x0029:
            android.widget.CheckBox r0 = r0.f25427p0
            r0.setClickable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0036
            cm.l.v(r2)
            r0 = r3
        L_0x0036:
            android.widget.CheckBox r0 = r0.f25427p0
            r0.setChecked(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0043
            cm.l.v(r2)
            r0 = r3
        L_0x0043:
            android.widget.EditText r0 = r0.A
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0050
            cm.l.v(r2)
            r0 = r3
        L_0x0050:
            android.widget.EditText r0 = r0.B
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x005d
            cm.l.v(r2)
            r0 = r3
        L_0x005d:
            android.widget.EditText r0 = r0.D
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x006a
            cm.l.v(r2)
            r0 = r3
        L_0x006a:
            android.widget.EditText r0 = r0.C
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0077
            cm.l.v(r2)
            r0 = r3
        L_0x0077:
            android.widget.EditText r0 = r0.F
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0084
            cm.l.v(r2)
            r0 = r3
        L_0x0084:
            android.widget.EditText r0 = r0.F
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0091
            cm.l.v(r2)
            r0 = r3
        L_0x0091:
            android.widget.EditText r0 = r0.E
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x009e
            cm.l.v(r2)
            r0 = r3
        L_0x009e:
            android.widget.EditText r0 = r0.E
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00ab
            cm.l.v(r2)
            r0 = r3
        L_0x00ab:
            android.widget.EditText r0 = r0.H
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00b8
            cm.l.v(r2)
            r0 = r3
        L_0x00b8:
            android.widget.RadioButton r0 = r0.J
            r0.setClickable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00c5
            cm.l.v(r2)
            r0 = r3
        L_0x00c5:
            android.widget.RadioButton r0 = r0.J
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00d2
            cm.l.v(r2)
            r0 = r3
        L_0x00d2:
            android.widget.RadioButton r0 = r0.I
            r0.setEnabled(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00df
            cm.l.v(r2)
            r0 = r3
        L_0x00df:
            android.widget.RadioButton r0 = r0.I
            r0.setClickable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x00ec
            cm.l.v(r2)
            r0 = r3
        L_0x00ec:
            android.widget.EditText r0 = r0.H
            r0.setFocusable(r1)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.I0
            java.lang.String r1 = "aadharData"
            if (r0 != 0) goto L_0x00fb
            cm.l.v(r1)
            r0 = r3
        L_0x00fb:
            java.lang.String r0 = r0.getHouse()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x0137
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x010d
            cm.l.v(r2)
            r0 = r3
        L_0x010d:
            android.widget.EditText r0 = r0.A
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x0117
            cm.l.v(r1)
            r4 = r3
        L_0x0117:
            java.lang.String r4 = r4.getHouse()
            r0.setText(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0126
            cm.l.v(r2)
            r0 = r3
        L_0x0126:
            android.widget.EditText r0 = r0.L
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x0130
            cm.l.v(r1)
            r4 = r3
        L_0x0130:
            java.lang.String r4 = r4.getHouse()
            r0.setText(r4)
        L_0x0137:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.I0
            if (r0 != 0) goto L_0x013f
            cm.l.v(r1)
            r0 = r3
        L_0x013f:
            java.lang.String r0 = r0.getLocalityIfAny()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x017b
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0151
            cm.l.v(r2)
            r0 = r3
        L_0x0151:
            android.widget.EditText r0 = r0.D
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x015b
            cm.l.v(r1)
            r4 = r3
        L_0x015b:
            java.lang.String r4 = r4.getLocalityIfAny()
            r0.setText(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x016a
            cm.l.v(r2)
            r0 = r3
        L_0x016a:
            android.widget.EditText r0 = r0.P
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x0174
            cm.l.v(r1)
            r4 = r3
        L_0x0174:
            java.lang.String r4 = r4.getLocalityIfAny()
            r0.setText(r4)
        L_0x017b:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.I0
            if (r0 != 0) goto L_0x0183
            cm.l.v(r1)
            r0 = r3
        L_0x0183:
            java.lang.String r0 = r0.getLandMark()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x01c1
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0195
            cm.l.v(r2)
            r0 = r3
        L_0x0195:
            android.widget.EditText r0 = r0.B
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x019f
            cm.l.v(r1)
            r4 = r3
        L_0x019f:
            java.lang.String r4 = r4.getLandMark()
            r0.setText(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x01ae
            cm.l.v(r2)
            r0 = r3
        L_0x01ae:
            android.widget.EditText r0 = r0.N
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x01b8
            cm.l.v(r1)
            r4 = r3
        L_0x01b8:
            java.lang.String r4 = r4.getLandMark()
        L_0x01bc:
            r0.setText(r4)
            goto L_0x0254
        L_0x01c1:
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x01c9
            cm.l.v(r2)
            r0 = r3
        L_0x01c9:
            android.widget.EditText r0 = r0.B
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r7.I0
            if (r5 != 0) goto L_0x01d8
            cm.l.v(r1)
            r5 = r3
        L_0x01d8:
            java.lang.String r5 = r5.getLocalityIfAny()
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.I0
            if (r6 != 0) goto L_0x01ec
            cm.l.v(r1)
            r6 = r3
        L_0x01ec:
            java.lang.String r6 = r6.getDist()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.I0
            if (r6 != 0) goto L_0x01fe
            cm.l.v(r1)
            r6 = r3
        L_0x01fe:
            java.lang.String r6 = r6.getState()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.setText(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0214
            cm.l.v(r2)
            r0 = r3
        L_0x0214:
            android.widget.EditText r0 = r0.N
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.I0
            if (r6 != 0) goto L_0x0223
            cm.l.v(r1)
            r6 = r3
        L_0x0223:
            java.lang.String r6 = r6.getLocalityIfAny()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r6 = r7.I0
            if (r6 != 0) goto L_0x0235
            cm.l.v(r1)
            r6 = r3
        L_0x0235:
            java.lang.String r6 = r6.getDist()
            r4.append(r6)
            r4.append(r5)
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r5 = r7.I0
            if (r5 != 0) goto L_0x0247
            cm.l.v(r1)
            r5 = r3
        L_0x0247:
            java.lang.String r5 = r5.getState()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x01bc
        L_0x0254:
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r0 = r7.I0
            if (r0 != 0) goto L_0x025c
            cm.l.v(r1)
            r0 = r3
        L_0x025c:
            java.lang.String r0 = r0.getPincode()
            boolean r0 = com.nic.mparivahan.dlservices.utilities.d.d(r0)
            if (r0 == 0) goto L_0x0299
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x026e
            cm.l.v(r2)
            r0 = r3
        L_0x026e:
            android.widget.EditText r0 = r0.C
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r4 = r7.I0
            if (r4 != 0) goto L_0x0278
            cm.l.v(r1)
            r4 = r3
        L_0x0278:
            java.lang.String r4 = r4.getPincode()
            r0.setText(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0287
            cm.l.v(r2)
            r0 = r3
        L_0x0287:
            android.widget.EditText r0 = r0.O
            com.nic.mparivahan.VahanEkyc.Aadarkyc$DOEkyc r2 = r7.I0
            if (r2 != 0) goto L_0x0291
            cm.l.v(r1)
            goto L_0x0292
        L_0x0291:
            r3 = r2
        L_0x0292:
            java.lang.String r1 = r3.getPincode()
            r0.setText(r1)
        L_0x0299:
            java.lang.String r0 = "dl-renewal-current-address"
            r7.S = r0
            goto L_0x0371
        L_0x029f:
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02a7
            cm.l.v(r2)
            r0 = r3
        L_0x02a7:
            android.widget.CheckBox r0 = r0.f25427p0
            r4 = 1
            r0.setEnabled(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02b5
            cm.l.v(r2)
            r0 = r3
        L_0x02b5:
            android.widget.CheckBox r0 = r0.f25427p0
            r0.setClickable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02c2
            cm.l.v(r2)
            r0 = r3
        L_0x02c2:
            android.widget.EditText r0 = r0.A
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02cf
            cm.l.v(r2)
            r0 = r3
        L_0x02cf:
            android.widget.EditText r0 = r0.B
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02dc
            cm.l.v(r2)
            r0 = r3
        L_0x02dc:
            android.widget.EditText r0 = r0.D
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02e9
            cm.l.v(r2)
            r0 = r3
        L_0x02e9:
            android.widget.EditText r0 = r0.C
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x02f6
            cm.l.v(r2)
            r0 = r3
        L_0x02f6:
            android.widget.EditText r0 = r0.F
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0303
            cm.l.v(r2)
            r0 = r3
        L_0x0303:
            android.widget.EditText r0 = r0.F
            r0.setEnabled(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0310
            cm.l.v(r2)
            r0 = r3
        L_0x0310:
            android.widget.EditText r0 = r0.E
            r0.setFocusable(r1)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x031d
            cm.l.v(r2)
            r0 = r3
        L_0x031d:
            android.widget.EditText r0 = r0.E
            r0.setEnabled(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x032a
            cm.l.v(r2)
            r0 = r3
        L_0x032a:
            android.widget.RadioButton r0 = r0.J
            r0.setClickable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0337
            cm.l.v(r2)
            r0 = r3
        L_0x0337:
            android.widget.RadioButton r0 = r0.J
            r0.setEnabled(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0344
            cm.l.v(r2)
            r0 = r3
        L_0x0344:
            android.widget.RadioButton r0 = r0.I
            r0.setEnabled(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x0351
            cm.l.v(r2)
            r0 = r3
        L_0x0351:
            android.widget.RadioButton r0 = r0.I
            r0.setClickable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x035e
            cm.l.v(r2)
            r0 = r3
        L_0x035e:
            android.widget.EditText r0 = r0.H
            r0.setFocusable(r4)
            ni.b0 r0 = r7.R
            if (r0 != 0) goto L_0x036b
            cm.l.v(r2)
            goto L_0x036c
        L_0x036b:
            r3 = r0
        L_0x036c:
            android.widget.EditText r0 = r3.H
            r0.setEnabled(r4)
        L_0x0371:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.j4():void");
    }

    private final void k3(Intent intent) {
        try {
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("DLDetails", I2());
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", this.f21956b0);
            intent.putExtra("lastEndorsedState", this.f21957c0);
            intent.putExtra("lastEndorsedRTOCode", this.f21959e0);
            intent.putExtra("lastEndorseStateCode", this.f21958d0);
            intent.putExtra("whatServiceRequired", this.f21962h0);
            b0 b0Var = this.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            intent.putExtra("presHouseNo", b0Var.L.getText().toString());
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
                b0Var3 = null;
            }
            intent.putExtra("presStreet", b0Var3.P.getText().toString());
            b0 b0Var4 = this.R;
            if (b0Var4 == null) {
                cm.l.v("mBinding");
                b0Var4 = null;
            }
            intent.putExtra("presLocation", b0Var4.N.getText().toString());
            intent.putExtra("presVillageOrTown", this.T.getVillageOrTown());
            intent.putExtra("presSubDistrict", this.T.getSubDistrict());
            intent.putExtra("presDistrict", this.T.getDistrict());
            intent.putExtra("presState", G2());
            b0 b0Var5 = this.R;
            if (b0Var5 == null) {
                cm.l.v("mBinding");
                b0Var5 = null;
            }
            intent.putExtra("presPincode", b0Var5.O.getText().toString());
            b0 b0Var6 = this.R;
            if (b0Var6 == null) {
                cm.l.v("mBinding");
                b0Var6 = null;
            }
            intent.putExtra("perHouseNo", b0Var6.A.getText().toString());
            b0 b0Var7 = this.R;
            if (b0Var7 == null) {
                cm.l.v("mBinding");
                b0Var7 = null;
            }
            intent.putExtra("perStreet", b0Var7.D.getText().toString());
            b0 b0Var8 = this.R;
            if (b0Var8 == null) {
                cm.l.v("mBinding");
                b0Var8 = null;
            }
            intent.putExtra("perLocation", b0Var8.B.getText().toString());
            intent.putExtra("permVillageOrTown", this.U.getVillageOrTown());
            intent.putExtra("perSubDistrict", this.U.getSubDistrict());
            intent.putExtra("perDistrict", this.U.getDistrict());
            intent.putExtra("perState", Y2());
            b0 b0Var9 = this.R;
            if (b0Var9 == null) {
                cm.l.v("mBinding");
            } else {
                b0Var2 = b0Var9;
            }
            intent.putExtra("perPinCode", b0Var2.O.getText().toString());
            intent.putExtra("permanentAdd", this.U);
            intent.putExtra("state_value", this.f21960f0);
            intent.putExtra("purCode", this.f21961g0);
            intent.putExtra("bioRecGenesis", F2());
            intent.putExtra("allowAddrChangeAtDlservReqst", D2());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void l3(Intent intent, String str, String str2, String str3, ArrayList arrayList) {
        try {
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("DLDetails", I2());
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", str);
            intent.putExtra("lastEndorsedState", str2);
            intent.putExtra("lastEndorsedRTOCode", this.f21959e0);
            intent.putExtra("lastEndorseStateCode", this.f21958d0);
            intent.putExtra("whatServiceRequired", this.f21962h0);
            intent.putExtra("state_value", this.f21960f0);
            intent.putExtra("purCode", str3);
            intent.putExtra("bioRecGenesis", F2());
            intent.putExtra("allowAddrChangeAtDlservReqst", D2());
            intent.putExtra("metaflag", this.F0);
            intent.putExtra("multiList", arrayList);
            intent.putExtra("serialNo", this.E0 + 1);
            intent.putExtra("COA", this.C0);
            intent.putExtra("listHeaderSteps", Q2());
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final boolean m3() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        if (!p.p(b0Var.f25430s0.getText(), L2().b("vahan_btn_submit", "Submit"), false, 2, (Object) null)) {
            b0 b0Var3 = this.R;
            if (b0Var3 == null) {
                cm.l.v("mBinding");
                b0Var3 = null;
            }
            Editable text = b0Var3.f25438y.getText();
            cm.l.e(text, "getText(...)");
            if (text.length() == 0) {
                Toast.makeText(this, L2().b("select_state", getString(R.string.select_state)), 0).show();
                return false;
            }
            b0 b0Var4 = this.R;
            if (b0Var4 == null) {
                cm.l.v("mBinding");
                b0Var4 = null;
            }
            Editable text2 = b0Var4.f25436x.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() == 0) {
                Toast.makeText(this, L2().b("select_district", getString(R.string.select_district)), 0).show();
                return false;
            }
            b0 b0Var5 = this.R;
            if (b0Var5 == null) {
                cm.l.v("mBinding");
                b0Var5 = null;
            }
            Editable text3 = b0Var5.f25434w.getText();
            cm.l.e(text3, "getText(...)");
            if (text3.length() == 0) {
                Toast.makeText(this, L2().b("select_taluka", getString(R.string.select_taluka)), 0).show();
                return false;
            }
            b0 b0Var6 = this.R;
            if (b0Var6 == null) {
                cm.l.v("mBinding");
                b0Var6 = null;
            }
            Editable text4 = b0Var6.N.getText();
            cm.l.e(text4, "getText(...)");
            if (text4.length() == 0) {
                Toast.makeText(this, L2().b("select_landmark", getString(R.string.sel_landmark)), 0).show();
                return false;
            }
            b0 b0Var7 = this.R;
            if (b0Var7 == null) {
                cm.l.v("mBinding");
                b0Var7 = null;
            }
            Editable text5 = b0Var7.O.getText();
            cm.l.e(text5, "getText(...)");
            if (text5.length() == 0) {
                Toast.makeText(this, L2().b("select_pincode", getString(R.string.enter_pincode)), 0).show();
                return false;
            }
            b0 b0Var8 = this.R;
            if (b0Var8 == null) {
                cm.l.v("mBinding");
                b0Var8 = null;
            }
            if (b0Var8.O.getText().length() < 6) {
                Toast.makeText(this, L2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
                return false;
            }
        } else if (this.f21969o0.equals("0")) {
            P3(L2().b("select_app_cat", getString(R.string.sel_app_category)));
            return false;
        }
        b0 b0Var9 = this.R;
        if (b0Var9 == null) {
            cm.l.v("mBinding");
            b0Var9 = null;
        }
        Editable text6 = b0Var9.G.getText();
        cm.l.e(text6, "getText(...)");
        if (text6.length() == 0) {
            Toast.makeText(this, L2().b("select_pstate", getString(R.string.sel_p_state)), 0).show();
            return false;
        }
        if (cm.l.a(d3().g(), "N")) {
            b0 b0Var10 = this.R;
            if (b0Var10 == null) {
                cm.l.v("mBinding");
                b0Var10 = null;
            }
            Editable text7 = b0Var10.F.getText();
            cm.l.e(text7, "getText(...)");
            if (text7.length() == 0) {
                Toast.makeText(this, L2().b("select_pdistrict", getString(R.string.sel_p_dis)), 0).show();
                return false;
            }
        }
        if (cm.l.a(d3().g(), "N")) {
            b0 b0Var11 = this.R;
            if (b0Var11 == null) {
                cm.l.v("mBinding");
                b0Var11 = null;
            }
            Editable text8 = b0Var11.E.getText();
            cm.l.e(text8, "getText(...)");
            if (text8.length() == 0) {
                Toast.makeText(this, L2().b("select_ptaluka", getString(R.string.sel_p_tal)), 0).show();
                return false;
            }
        }
        if (cm.l.a(d3().g(), "N")) {
            b0 b0Var12 = this.R;
            if (b0Var12 == null) {
                cm.l.v("mBinding");
                b0Var12 = null;
            }
            Editable text9 = b0Var12.B.getText();
            cm.l.e(text9, "getText(...)");
            if (text9.length() == 0) {
                Toast.makeText(this, L2().b("select_plandmark", getString(R.string.sel_p_lm)), 0).show();
                return false;
            }
        }
        if (cm.l.a(d3().g(), "N")) {
            b0 b0Var13 = this.R;
            if (b0Var13 == null) {
                cm.l.v("mBinding");
                b0Var13 = null;
            }
            Editable text10 = b0Var13.C.getText();
            cm.l.e(text10, "getText(...)");
            if (text10.length() == 0) {
                Toast.makeText(this, L2().b("select_pin_code", getString(R.string.enter_correct_pincode)), 0).show();
                return false;
            }
        }
        if (!cm.l.a(d3().g(), "N")) {
            return true;
        }
        b0 b0Var14 = this.R;
        if (b0Var14 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var14;
        }
        if (b0Var2.C.getText().length() >= 6) {
            return true;
        }
        Toast.makeText(this, L2().b("select_ppin_code", getString(R.string.sel_pc_pin)), 0).show();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n3() {
        /*
            r6 = this;
            ni.b0 r0 = r6.R
            r1 = 0
            java.lang.String r2 = "mBinding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            ni.dc r0 = r0.f25415d0
            android.widget.ImageView r0 = r0.f25959e
            jj.w r3 = new jj.w
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x001f
            cm.l.v(r2)
            r0 = r1
        L_0x001f:
            android.widget.EditText r0 = r0.f25438y
            jj.g r3 = new jj.g
            r3.<init>()
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0031
            cm.l.v(r2)
            r0 = r1
        L_0x0031:
            android.widget.EditText r0 = r0.f25436x
            jj.h r3 = new jj.h
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0043
            cm.l.v(r2)
            r0 = r1
        L_0x0043:
            android.widget.EditText r0 = r0.f25434w
            jj.i r3 = new jj.i
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0055
            cm.l.v(r2)
            r0 = r1
        L_0x0055:
            android.widget.EditText r0 = r0.M
            jj.j r3 = new jj.j
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0067
            cm.l.v(r2)
            r0 = r1
        L_0x0067:
            android.widget.RadioGroup r0 = r0.S0
            jj.k r3 = new jj.k
            r3.<init>(r6)
            r0.setOnCheckedChangeListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0079
            cm.l.v(r2)
            r0 = r1
        L_0x0079:
            android.widget.EditText r0 = r0.G
            jj.m r3 = new jj.m
            r3.<init>()
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x008b
            cm.l.v(r2)
            r0 = r1
        L_0x008b:
            android.widget.EditText r0 = r0.F
            jj.n r3 = new jj.n
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x009d
            cm.l.v(r2)
            r0 = r1
        L_0x009d:
            android.widget.EditText r0 = r0.E
            jj.o r3 = new jj.o
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x00af
            cm.l.v(r2)
            r0 = r1
        L_0x00af:
            android.widget.EditText r0 = r0.H
            jj.p r3 = new jj.p
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x00c1
            cm.l.v(r2)
            r0 = r1
        L_0x00c1:
            android.widget.RadioGroup r0 = r0.K
            jj.x r3 = new jj.x
            r3.<init>(r6)
            r0.setOnCheckedChangeListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x00d3
            cm.l.v(r2)
            r0 = r1
        L_0x00d3:
            android.widget.CheckBox r0 = r0.f25427p0
            jj.y r3 = new jj.y
            r3.<init>(r6)
            r0.setOnCheckedChangeListener(r3)
            ld.f r0 = r6.d3()
            java.lang.String r0 = r0.b()
            java.lang.String r3 = "3"
            boolean r0 = cm.l.a(r0, r3)
            if (r0 == 0) goto L_0x0107
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x00f5
            cm.l.v(r2)
            r0 = r1
        L_0x00f5:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0
            ld.c r3 = r6.L2()
            java.lang.String r4 = "vahan_btn_submit"
            java.lang.String r5 = "Submit"
        L_0x00ff:
            java.lang.String r3 = r3.b(r4, r5)
            r0.setText(r3)
            goto L_0x0131
        L_0x0107:
            java.lang.String r0 = r6.f21960f0
            java.lang.String r3 = "differ"
            r4 = 1
            boolean r0 = km.p.o(r0, r3, r4)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = r6.F2()
            java.lang.String r3 = "S"
            boolean r0 = km.p.o(r0, r3, r4)
            if (r0 == 0) goto L_0x0131
        L_0x011e:
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0126
            cm.l.v(r2)
            r0 = r1
        L_0x0126:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0
            ld.c r3 = r6.L2()
            java.lang.String r4 = "btn_dl_serv_next"
            java.lang.String r5 = "Next"
            goto L_0x00ff
        L_0x0131:
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0139
            cm.l.v(r2)
            r0 = r1
        L_0x0139:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.f25430s0
            jj.z r3 = new jj.z
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x014b
            cm.l.v(r2)
            r0 = r1
        L_0x014b:
            android.widget.ImageView r0 = r0.U
            jj.a0 r3 = new jj.a0
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x015d
            cm.l.v(r2)
            r0 = r1
        L_0x015d:
            android.widget.ImageView r0 = r0.T
            jj.b0 r3 = new jj.b0
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x016f
            cm.l.v(r2)
            r0 = r1
        L_0x016f:
            android.widget.ImageView r0 = r0.f25421j0
            jj.b r3 = new jj.b
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0181
            cm.l.v(r2)
            r0 = r1
        L_0x0181:
            android.widget.ImageView r0 = r0.f25420i0
            jj.c r3 = new jj.c
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x0193
            cm.l.v(r2)
            r0 = r1
        L_0x0193:
            android.widget.ImageView r0 = r0.f25418g0
            jj.d r3 = new jj.d
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x01a5
            cm.l.v(r2)
            r0 = r1
        L_0x01a5:
            android.widget.ImageView r0 = r0.f25419h0
            jj.e r3 = new jj.e
            r3.<init>(r6)
            r0.setOnClickListener(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x01b7
            cm.l.v(r2)
            r0 = r1
        L_0x01b7:
            android.widget.TextView r0 = r0.Q0
            ni.b0 r3 = r6.R
            if (r3 != 0) goto L_0x01c1
            cm.l.v(r2)
            r3 = r1
        L_0x01c1:
            android.widget.TextView r3 = r3.Q0
            int r3 = r3.getPaintFlags()
            r3 = r3 | 8
            r0.setPaintFlags(r3)
            ni.b0 r0 = r6.R
            if (r0 != 0) goto L_0x01d4
            cm.l.v(r2)
            goto L_0x01d5
        L_0x01d4:
            r1 = r0
        L_0x01d5:
            android.widget.TextView r0 = r1.Q0
            jj.f r1 = new jj.f
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.n3():void");
    }

    /* access modifiers changed from: private */
    public static final void o3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            changeOfAddressActivity.M3("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void p3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            changeOfAddressActivity.N3("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void q3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            changeOfAddressActivity.O3("dl-renewal-current-address");
        } else {
            Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void r3(ChangeOfAddressActivity changeOfAddressActivity, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeOfAddressActivity, "this$0");
        List list = changeOfAddressActivity.N;
        if (list != null && (!list.isEmpty())) {
            if (i10 == R.id.town_rb) {
                str = "U";
            } else if (i10 == R.id.village_rb) {
                str = "R";
            } else {
                return;
            }
            changeOfAddressActivity.J0 = str;
            changeOfAddressActivity.H2(str);
        }
    }

    /* access modifiers changed from: private */
    public static final void s3(View view) {
    }

    /* access modifiers changed from: private */
    public static final void t3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            changeOfAddressActivity.M3("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void u3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            b0 b0Var = changeOfAddressActivity.R;
            b0 b0Var2 = null;
            if (b0Var == null) {
                cm.l.v("mBinding");
                b0Var = null;
            }
            Editable text = b0Var.H.getText();
            cm.l.e(text, "getText(...)");
            if (text.length() == 0) {
                b0 b0Var3 = changeOfAddressActivity.R;
                if (b0Var3 == null) {
                    cm.l.v("mBinding");
                    b0Var3 = null;
                }
                b0Var3.H.setFocusable(true);
                b0 b0Var4 = changeOfAddressActivity.R;
                if (b0Var4 == null) {
                    cm.l.v("mBinding");
                } else {
                    b0Var2 = b0Var4;
                }
                b0Var2.H.setEnabled(true);
            }
            changeOfAddressActivity.N3("dl-renewal-permanent-addressx");
            return;
        }
        Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
    }

    /* access modifiers changed from: private */
    public static final void v3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(changeOfAddressActivity)) {
            changeOfAddressActivity.O3("dl-renewal-permanent-addressx");
        } else {
            Toast.makeText(changeOfAddressActivity.getApplicationContext(), changeOfAddressActivity.L2().b("label_log_check_internet", changeOfAddressActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0163, code lost:
        if (r0 == null) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0169, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x017a, code lost:
        if (r0 == null) goto L_0x0165;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void w2() {
        /*
            r12 = this;
            cm.u r0 = new cm.u
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f20234e = r1
            ni.b0 r1 = r12.R
            java.lang.String r2 = "mBinding"
            r3 = 0
            if (r1 != 0) goto L_0x0017
            cm.l.v(r2)
            r1 = r3
        L_0x0017:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r1 = r1.f25430s0
            java.lang.String r1 = r1.getText()
            ld.c r4 = r12.L2()
            java.lang.String r5 = "btn_dl_serv_next"
            java.lang.String r6 = "Next"
            java.lang.String r4 = r4.b(r5, r6)
            r5 = 0
            r6 = 2
            boolean r1 = km.p.p(r1, r4, r5, r6, r3)
            java.lang.String r4 = "0"
            r7 = 8
            r8 = 1
            if (r1 == 0) goto L_0x0045
            ni.b0 r1 = r12.R
            if (r1 != 0) goto L_0x003e
            cm.l.v(r2)
            r1 = r3
        L_0x003e:
            android.widget.LinearLayout r1 = r1.f25412a0
            r1.setVisibility(r7)
            goto L_0x0143
        L_0x0045:
            ni.b0 r1 = r12.R
            if (r1 != 0) goto L_0x004d
            cm.l.v(r2)
            r1 = r3
        L_0x004d:
            android.widget.LinearLayout r1 = r1.f25412a0
            r1.setVisibility(r5)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r9 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r10 = "Select Category"
            r9.<init>(r4, r10)
            r1.add(r5, r9)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r9 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r10 = "G"
            java.lang.String r11 = "General"
            r9.<init>(r10, r11)
            r1.add(r8, r9)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r9 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r10 = "R"
            java.lang.String r11 = "Repatriate"
            r9.<init>(r10, r11)
            r1.add(r6, r9)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "T"
            java.lang.String r10 = "Refugees"
            r6.<init>(r9, r10)
            r9 = 3
            r1.add(r9, r6)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "X"
            java.lang.String r10 = "Ex-Servicemen"
            r6.<init>(r9, r10)
            r9 = 4
            r1.add(r9, r6)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "F"
            java.lang.String r10 = "Foreigners (Not Diplomats)"
            r6.<init>(r9, r10)
            r9 = 5
            r1.add(r9, r6)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "D"
            java.lang.String r10 = "Diplomats (Foreigner)"
            r6.<init>(r9, r10)
            r9 = 6
            r1.add(r9, r6)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "O"
            java.lang.String r10 = "OCI"
            r6.<init>(r9, r10)
            r9 = 7
            r1.add(r9, r6)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r6 = new com.nic.mparivahan.dlservices.data.model.AppCatPojo
            java.lang.String r9 = "P"
            java.lang.String r10 = "Differently Abled"
            r6.<init>(r9, r10)
            r1.add(r7, r6)
            oi.a r1 = new oi.a
            java.lang.Object r6 = r0.f20234e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r1.<init>(r12, r6)
            ni.b0 r6 = r12.R
            if (r6 != 0) goto L_0x00f6
            cm.l.v(r2)
            r6 = r3
        L_0x00f6:
            android.widget.Spinner r6 = r6.f25429r0
            r6.setAdapter(r1)
            java.lang.Object r1 = r0.f20234e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            r6 = r5
        L_0x0104:
            if (r6 >= r1) goto L_0x0143
            ld.f r7 = r12.d3()
            java.lang.String r7 = r7.a()
            java.lang.CharSequence r7 = km.q.B0(r7)
            java.lang.String r7 = r7.toString()
            java.lang.Object r9 = r0.f20234e
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r6)
            com.nic.mparivahan.dlservices.data.model.AppCatPojo r9 = (com.nic.mparivahan.dlservices.data.model.AppCatPojo) r9
            java.lang.String r9 = r9.getAppCode()
            java.lang.CharSequence r9 = km.q.B0(r9)
            java.lang.String r9 = r9.toString()
            boolean r7 = cm.l.a(r7, r9)
            if (r7 == 0) goto L_0x0140
            ni.b0 r1 = r12.R
            if (r1 != 0) goto L_0x013a
            cm.l.v(r2)
            r1 = r3
        L_0x013a:
            android.widget.Spinner r1 = r1.f25429r0
            r1.setSelection(r6)
            goto L_0x0143
        L_0x0140:
            int r6 = r6 + 1
            goto L_0x0104
        L_0x0143:
            ni.b0 r1 = r12.R
            if (r1 != 0) goto L_0x014b
            cm.l.v(r2)
            r1 = r3
        L_0x014b:
            android.widget.Spinner r1 = r1.f25429r0
            com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity$a r6 = new com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity$a
            r6.<init>(r12, r0)
            r1.setOnItemSelectedListener(r6)
            java.lang.String r0 = r12.F2()
            java.lang.String r1 = "S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0170
            ni.b0 r0 = r12.R
            if (r0 != 0) goto L_0x0169
        L_0x0165:
            cm.l.v(r2)
            goto L_0x016a
        L_0x0169:
            r3 = r0
        L_0x016a:
            android.widget.Spinner r0 = r3.f25429r0
            r0.setEnabled(r8)
            goto L_0x018b
        L_0x0170:
            java.lang.String r0 = r12.f21969o0
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x017d
            ni.b0 r0 = r12.R
            if (r0 != 0) goto L_0x0169
            goto L_0x0165
        L_0x017d:
            ni.b0 r0 = r12.R
            if (r0 != 0) goto L_0x0185
            cm.l.v(r2)
            goto L_0x0186
        L_0x0185:
            r3 = r0
        L_0x0186:
            android.widget.Spinner r0 = r3.f25429r0
            r0.setEnabled(r5)
        L_0x018b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.coa.ChangeOfAddressActivity.w2():void");
    }

    /* access modifiers changed from: private */
    public static final void w3(ChangeOfAddressActivity changeOfAddressActivity, RadioGroup radioGroup, int i10) {
        String str;
        cm.l.f(changeOfAddressActivity, "this$0");
        List list = changeOfAddressActivity.O;
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
            changeOfAddressActivity.K0 = str;
            changeOfAddressActivity.a3(str);
        }
    }

    /* access modifiers changed from: private */
    public final void x2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25436x.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.f25436x.setHint(L2().b("edit_dl_serv_selc_district", getString(R.string.select_district)));
        this.N = q.i();
        y2();
    }

    /* access modifiers changed from: private */
    public static final void x3(ChangeOfAddressActivity changeOfAddressActivity, CompoundButton compoundButton, boolean z10) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = null;
        if (z10) {
            try {
                changeOfAddressActivity.T3();
                b0 b0Var2 = changeOfAddressActivity.R;
                if (b0Var2 == null) {
                    cm.l.v("mBinding");
                    b0Var2 = null;
                }
                b0Var2.G.setEnabled(false);
                b0 b0Var3 = changeOfAddressActivity.R;
                if (b0Var3 == null) {
                    cm.l.v("mBinding");
                    b0Var3 = null;
                }
                b0Var3.F.setEnabled(false);
                b0 b0Var4 = changeOfAddressActivity.R;
                if (b0Var4 == null) {
                    cm.l.v("mBinding");
                    b0Var4 = null;
                }
                b0Var4.E.setEnabled(false);
                b0 b0Var5 = changeOfAddressActivity.R;
                if (b0Var5 == null) {
                    cm.l.v("mBinding");
                    b0Var5 = null;
                }
                b0Var5.H.setEnabled(false);
                b0 b0Var6 = changeOfAddressActivity.R;
                if (b0Var6 == null) {
                    cm.l.v("mBinding");
                    b0Var6 = null;
                }
                b0Var6.B.setEnabled(false);
                b0 b0Var7 = changeOfAddressActivity.R;
                if (b0Var7 == null) {
                    cm.l.v("mBinding");
                    b0Var7 = null;
                }
                b0Var7.A.setEnabled(false);
                b0 b0Var8 = changeOfAddressActivity.R;
                if (b0Var8 == null) {
                    cm.l.v("mBinding");
                    b0Var8 = null;
                }
                b0Var8.D.setEnabled(false);
                b0 b0Var9 = changeOfAddressActivity.R;
                if (b0Var9 == null) {
                    cm.l.v("mBinding");
                    b0Var9 = null;
                }
                b0Var9.C.setEnabled(false);
            } catch (Exception unused) {
                return;
            }
        } else {
            b0 b0Var10 = changeOfAddressActivity.R;
            if (b0Var10 == null) {
                cm.l.v("mBinding");
                b0Var10 = null;
            }
            b0Var10.G.setEnabled(true);
            b0 b0Var11 = changeOfAddressActivity.R;
            if (b0Var11 == null) {
                cm.l.v("mBinding");
                b0Var11 = null;
            }
            b0Var11.F.setEnabled(true);
            b0 b0Var12 = changeOfAddressActivity.R;
            if (b0Var12 == null) {
                cm.l.v("mBinding");
                b0Var12 = null;
            }
            b0Var12.E.setEnabled(true);
            b0 b0Var13 = changeOfAddressActivity.R;
            if (b0Var13 == null) {
                cm.l.v("mBinding");
                b0Var13 = null;
            }
            b0Var13.H.setEnabled(true);
            b0 b0Var14 = changeOfAddressActivity.R;
            if (b0Var14 == null) {
                cm.l.v("mBinding");
                b0Var14 = null;
            }
            b0Var14.B.setEnabled(true);
            b0 b0Var15 = changeOfAddressActivity.R;
            if (b0Var15 == null) {
                cm.l.v("mBinding");
                b0Var15 = null;
            }
            b0Var15.A.setEnabled(true);
            b0 b0Var16 = changeOfAddressActivity.R;
            if (b0Var16 == null) {
                cm.l.v("mBinding");
                b0Var16 = null;
            }
            b0Var16.D.setEnabled(true);
            b0 b0Var17 = changeOfAddressActivity.R;
            if (b0Var17 == null) {
                cm.l.v("mBinding");
                b0Var17 = null;
            }
            b0Var17.C.setEnabled(true);
            changeOfAddressActivity.U = new DlAddress("", "", "", "", "", "", "", "");
            b0 b0Var18 = changeOfAddressActivity.R;
            if (b0Var18 == null) {
                cm.l.v("mBinding");
                b0Var18 = null;
            }
            b0Var18.F.setText("");
            b0 b0Var19 = changeOfAddressActivity.R;
            if (b0Var19 == null) {
                cm.l.v("mBinding");
                b0Var19 = null;
            }
            b0Var19.E.setText("");
            b0 b0Var20 = changeOfAddressActivity.R;
            if (b0Var20 == null) {
                cm.l.v("mBinding");
                b0Var20 = null;
            }
            b0Var20.H.setText("");
            b0 b0Var21 = changeOfAddressActivity.R;
            if (b0Var21 == null) {
                cm.l.v("mBinding");
                b0Var21 = null;
            }
            b0Var21.B.setText("");
            b0 b0Var22 = changeOfAddressActivity.R;
            if (b0Var22 == null) {
                cm.l.v("mBinding");
                b0Var22 = null;
            }
            b0Var22.A.setText("");
            b0 b0Var23 = changeOfAddressActivity.R;
            if (b0Var23 == null) {
                cm.l.v("mBinding");
                b0Var23 = null;
            }
            b0Var23.D.setText("");
            b0 b0Var24 = changeOfAddressActivity.R;
            if (b0Var24 == null) {
                cm.l.v("mBinding");
                b0Var24 = null;
            }
            b0Var24.C.setText("");
        }
        b0 b0Var25 = changeOfAddressActivity.R;
        if (b0Var25 == null) {
            cm.l.v("mBinding");
            b0Var25 = null;
        }
        b0Var25.x(changeOfAddressActivity.U);
        b0 b0Var26 = changeOfAddressActivity.R;
        if (b0Var26 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var = b0Var26;
        }
        b0Var.a();
    }

    /* access modifiers changed from: private */
    public final void y2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.f25434w.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.f25434w.setHint(L2().b("edit_dl_serv_selc_block", getString(R.string.select_taluka)));
        this.N = q.i();
        z2();
        z2();
    }

    /* access modifiers changed from: private */
    public static final void y3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        String b10;
        String b11;
        int i10;
        String str;
        String str2;
        bm.l iVar;
        Intent intent;
        ChangeOfAddressActivity changeOfAddressActivity2 = changeOfAddressActivity;
        cm.l.f(changeOfAddressActivity2, "this$0");
        if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            changeOfAddressActivity.S3();
            return;
        }
        try {
            if (changeOfAddressActivity.m3()) {
                Class<RenewalOfDLActivity> cls = RenewalOfDLActivity.class;
                Class<DLReplecementActivity> cls2 = DLReplecementActivity.class;
                Class<DLDuplicateActivity> cls3 = DLDuplicateActivity.class;
                if (cm.l.a(changeOfAddressActivity2.f21960f0, "differ")) {
                    if (!cm.l.a(changeOfAddressActivity.d3().b(), "1")) {
                        if (!cm.l.a(changeOfAddressActivity.d3().b(), "537")) {
                            if (cm.l.a(changeOfAddressActivity.d3().b(), "2")) {
                                intent = new Intent(changeOfAddressActivity2, cls3);
                            } else if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                                intent = new Intent(changeOfAddressActivity2, cls2);
                            } else if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                                b10 = changeOfAddressActivity.L2().b("nex_parivahan", changeOfAddressActivity2.getString(R.string.app_name));
                                cm.l.c(b10);
                                b11 = changeOfAddressActivity.L2().b("label_want_to_proceed", changeOfAddressActivity2.getString(R.string.are_you_want_to_proceed));
                                cm.l.c(b11);
                                i10 = 0;
                                str = null;
                                str2 = null;
                                iVar = new g(changeOfAddressActivity2);
                                oi.g.n1(changeOfAddressActivity, b10, b11, i10, str, str2, iVar, 24, (Object) null);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    intent = new Intent(changeOfAddressActivity2, cls);
                } else if (!p.o(changeOfAddressActivity.F2(), "S", true) || !cm.l.a(changeOfAddressActivity2.f21960f0, "same")) {
                    b10 = changeOfAddressActivity.L2().b("nex_parivahan", changeOfAddressActivity2.getString(R.string.app_name));
                    cm.l.c(b10);
                    b11 = changeOfAddressActivity.L2().b("label_want_to_proceed", changeOfAddressActivity2.getString(R.string.are_you_want_to_proceed));
                    cm.l.c(b11);
                    i10 = 0;
                    str = null;
                    str2 = null;
                    iVar = new i(changeOfAddressActivity2);
                    oi.g.n1(changeOfAddressActivity, b10, b11, i10, str, str2, iVar, 24, (Object) null);
                    return;
                } else if (cm.l.a(changeOfAddressActivity.d3().b(), "2")) {
                    intent = new Intent(changeOfAddressActivity2, cls3);
                } else if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE)) {
                    intent = new Intent(changeOfAddressActivity2, cls2);
                } else {
                    if (!cm.l.a(changeOfAddressActivity.d3().b(), "1")) {
                        if (!cm.l.a(changeOfAddressActivity.d3().b(), "537")) {
                            if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                                intent = new Intent(changeOfAddressActivity2, DLExtractActivity.class);
                            } else if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE)) {
                                intent = new Intent(changeOfAddressActivity2, DLIdpActivity.class);
                            } else if (cm.l.a(changeOfAddressActivity.d3().b(), VContant.DUPLICATE_RC_PURPOSE_CODE)) {
                                b10 = changeOfAddressActivity.L2().b("nex_parivahan", changeOfAddressActivity2.getString(R.string.app_name));
                                cm.l.c(b10);
                                b11 = changeOfAddressActivity.L2().b("label_want_to_proceed", changeOfAddressActivity2.getString(R.string.are_you_want_to_proceed));
                                cm.l.c(b11);
                                i10 = 0;
                                str = null;
                                str2 = null;
                                iVar = new h(changeOfAddressActivity2);
                                oi.g.n1(changeOfAddressActivity, b10, b11, i10, str, str2, iVar, 24, (Object) null);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    intent = new Intent(changeOfAddressActivity2, cls);
                }
                changeOfAddressActivity2.k3(intent);
            }
        } catch (Exception unused) {
        }
    }

    private final void z2() {
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.M.setText("");
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var3;
        }
        b0Var2.M.setHint(L2().b("edit_dl_serv_selc_town", getString(R.string.sel_vt)));
        this.P = q.i();
    }

    /* access modifiers changed from: private */
    public static final void z3(ChangeOfAddressActivity changeOfAddressActivity, View view) {
        cm.l.f(changeOfAddressActivity, "this$0");
        b0 b0Var = changeOfAddressActivity.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        b0Var.U.setVisibility(8);
        b0 b0Var3 = changeOfAddressActivity.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.T.setVisibility(0);
        b0 b0Var4 = changeOfAddressActivity.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var4;
        }
        b0Var2.f25413b0.setVisibility(8);
    }

    public final String D2() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("allowAddrChangeAtDlservReqst");
        return null;
    }

    public final String E2() {
        return this.f21969o0;
    }

    public final String F2() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("bioRecGenesis");
        return null;
    }

    public final String G2() {
        String str = this.f21967m0;
        if (str != null) {
            return str;
        }
        cm.l.v("currStateCd");
        return null;
    }

    public final DldetobjX I2() {
        DldetobjX dldetobjX = this.f21963i0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final String J2() {
        return this.X;
    }

    public final String K2() {
        return this.Y;
    }

    public final ld.c L2() {
        ld.c cVar = this.f21970p0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String M2() {
        return this.f21959e0;
    }

    public final String N2() {
        return this.f21956b0;
    }

    public final String O2() {
        return this.f21957c0;
    }

    public final String P2() {
        return this.f21958d0;
    }

    public final ArrayList Q2() {
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final CombineServiceInterface R2() {
        CombineServiceInterface combineServiceInterface = this.H0;
        if (combineServiceInterface != null) {
            return combineServiceInterface;
        }
        cm.l.v("mCombineServiceInterface");
        return null;
    }

    public final Context S2() {
        Context context = this.f21980z0;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final ProgressBar T2() {
        ProgressBar progressBar = this.f21965k0;
        if (progressBar != null) {
            return progressBar;
        }
        cm.l.v("mProgressBar");
        return null;
    }

    public final ld.g U2() {
        ld.g gVar = this.f21966l0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final void U3(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final String V2() {
        return this.Z;
    }

    public final void V3(String str) {
        cm.l.f(str, "<set-?>");
        this.f21969o0 = str;
    }

    public final ArrayList W2() {
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final void W3(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final ProgressDialog X2() {
        ProgressDialog progressDialog = this.L0;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void X3(String str) {
        cm.l.f(str, "<set-?>");
        this.f21967m0 = str;
    }

    public final String Y2() {
        String str = this.f21968n0;
        if (str != null) {
            return str;
        }
        cm.l.v("perStateCd");
        return null;
    }

    public final void Y3(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f21963i0 = dldetobjX;
    }

    public final DlAddress Z2() {
        return this.U;
    }

    public final void Z3(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21970p0 = cVar;
    }

    public final void a4(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.B0 = arrayList;
    }

    public final DlAddress b3() {
        return this.T;
    }

    public final void b4(CombineServiceInterface combineServiceInterface) {
        cm.l.f(combineServiceInterface, "<set-?>");
        this.H0 = combineServiceInterface;
    }

    public final String c3() {
        return this.f21961g0;
    }

    public final void c4(Context context) {
        cm.l.f(context, "<set-?>");
        this.f21980z0 = context;
    }

    public final ld.f d3() {
        ld.f fVar = this.f21964j0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void d4(ProgressBar progressBar) {
        cm.l.f(progressBar, "<set-?>");
        this.f21965k0 = progressBar;
    }

    public final void e4(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f21966l0 = gVar;
    }

    public final void f4(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.A0 = arrayList;
    }

    public final void g4(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L0 = progressDialog;
    }

    public final void h4(String str) {
        cm.l.f(str, "<set-?>");
        this.f21968n0 = str;
    }

    public final void i4(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f21964j0 = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_change_of_address);
        cm.l.e(f10, "setContentView(...)");
        this.R = (b0) f10;
        i4(new ld.f(this));
        e4(new ld.g(this));
        Z3(new ld.c(this));
        c4(this);
        e.a aVar = v9.e.f17509a;
        b0 b0Var = this.R;
        b0 b0Var2 = null;
        if (b0Var == null) {
            cm.l.v("mBinding");
            b0Var = null;
        }
        aVar.x(this, b0Var);
        View findViewById = findViewById(R.id.pb_coa);
        cm.l.e(findViewById, "findViewById(...)");
        d4((ProgressBar) findViewById);
        g4(new ProgressDialog(S2()));
        X2().setMessage(L2().b("label_challan_please_wait", getString(R.string.please_wait)));
        X2().setCancelable(false);
        X2().setCanceledOnTouchOutside(false);
        e3();
        j3();
        n3();
        w2();
        if (cm.l.a(d3().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            b4(CombineServiceInterface.f8704a.a(this));
            this.G0 = (ab.d) new u0((x0) this, (u0.b) new ab.b(new ab.a(R2()))).a(ab.d.class);
            I3();
        }
        b0 b0Var3 = this.R;
        if (b0Var3 == null) {
            cm.l.v("mBinding");
            b0Var3 = null;
        }
        b0Var3.f25416e0.f29577d.setOnClickListener(new jj.a(this));
        b0 b0Var4 = this.R;
        if (b0Var4 == null) {
            cm.l.v("mBinding");
            b0Var4 = null;
        }
        b0Var4.f25416e0.f29578e.setVisibility(8);
        b0 b0Var5 = this.R;
        if (b0Var5 == null) {
            cm.l.v("mBinding");
            b0Var5 = null;
        }
        b0Var5.f25415d0.f25961g.setText(d3().i());
        b0 b0Var6 = this.R;
        if (b0Var6 == null) {
            cm.l.v("mBinding");
            b0Var6 = null;
        }
        b0Var6.Q0.setVisibility(0);
        b0 b0Var7 = this.R;
        if (b0Var7 == null) {
            cm.l.v("mBinding");
        } else {
            b0Var2 = b0Var7;
        }
        b0Var2.f25440z.setVisibility(0);
        j4();
    }
}
