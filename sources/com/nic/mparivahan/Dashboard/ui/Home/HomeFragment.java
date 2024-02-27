package com.nic.mparivahan.Dashboard.ui.Home;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.i;
import androidx.fragment.app.j;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.p;
import cm.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Account.Model.GetEnableStateModel;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Account.Model.StateX;
import com.nic.mparivahan.Citizen.Activities.AccidentReportActivity;
import com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen;
import com.nic.mparivahan.Dashboard.ChallanViewMoreActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.EsActivity;
import com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.EnableServiceResponse;
import com.nic.mparivahan.Dashboard.EnabledServices.PojoClasses.Enabledservice;
import com.nic.mparivahan.Dashboard.OtherServices;
import com.nic.mparivahan.Dashboard.VehicleServiceHome;
import com.nic.mparivahan.Dashboard.a;
import com.nic.mparivahan.Dashboard.ui.DLServiceHome;
import com.nic.mparivahan.Dashboard.ui.VehicleServiceHomeNew;
import com.nic.mparivahan.Dashboard.ui.VirtualDocScreen;
import com.nic.mparivahan.Dl.DlInterface.DlService;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.Dl.NewDlSearch;
import com.nic.mparivahan.Echallan.PaymentSearchChallan;
import com.nic.mparivahan.Echallan.SearchChallanOnlineActivity;
import com.nic.mparivahan.Echallan.VerifyPaymentChallan;
import com.nic.mparivahan.InformationService.InformationalWebView;
import com.nic.mparivahan.NewDesignActivity.MyDocActivity;
import com.nic.mparivahan.PushNotification.BannerModel.BannerModel;
import com.nic.mparivahan.PushNotification.BannerModel.MparBanner;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.CreateRCAlertsScreen;
import com.nic.mparivahan.RC.Model.MyRcDeletResponse;
import com.nic.mparivahan.RC.Model.RcModelsDet;
import com.nic.mparivahan.RC.RcInterface.RcService;
import com.nic.mparivahan.VahanServices.FancyServices.AuctionStatusActivity;
import com.nic.mparivahan.VahanServices.FancyServices.AvailableFancyNumberStatus;
import com.nic.mparivahan.VahanServices.FancyServices.FancyFeeReceipt;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanView.VahanMainViewScreen;
import com.nic.mparivahan.Welcome.Model.NapixTokenModel;
import com.nic.mparivahan.Welcome.NapixService;
import com.nic.mparivahan.Welcome.VersionService;
import com.nic.mparivahan.dlservices.widget.CircleImageView;
import com.smarteist.autoimageslider.SliderView;
import ii.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ka.c;
import ld.f;
import ld.g;
import lm.d0;
import lm.e0;
import lm.f0;
import lm.q0;
import ma.u;
import ma.z;
import pl.n;
import pl.q;
import pl.x;
import ta.a2;
import ta.b2;
import ta.c2;
import ta.d2;
import ta.e2;
import ta.f2;
import ta.g2;
import ta.h2;
import ta.i2;
import ta.j1;
import ta.j2;
import ta.k1;
import ta.l1;
import ta.l2;
import ta.m1;
import ta.m2;
import ta.n1;
import ta.p1;
import ta.q1;
import ta.r1;
import ta.s1;
import ta.t1;
import ta.u1;
import ta.v1;
import ta.w0;
import ta.w1;
import ta.x0;
import ta.x1;
import ta.y0;
import ta.y1;
import yc.i;

public final class HomeFragment extends i implements zc.c, zc.b, ra.c, ra.d, ra.b, ra.a {
    public LinearLayout A0;
    public LinearLayout A1;
    public TextView A2;
    public LinearLayout B0;
    public LinearLayout B1;
    public TextView B2;
    public ImageView C0;
    public LinearLayout C1;
    public TextView C2;
    public ImageView D0;
    public LinearLayout D1;
    public TextView D2;
    public ImageView E0;
    public LinearLayout E1;
    public TextView E2;
    public ImageView F0;
    public LinearLayout F1;
    public TextView F2;
    public TextView G0;
    public LinearLayout G1;
    public TextView G2;
    public TextView H0;
    public f H1;
    public TextView H2;
    public TextView I0;
    private final int I1 = 23;
    public TextView I2;
    public TextView J0;
    public String J1;
    public RecyclerView J2;
    public TextView K0;
    public LinearLayout K1;
    public ConstraintLayout K2;
    public RecyclerView L0;
    public LinearLayout L1;
    public ConstraintLayout L2;
    public RecyclerView M0;
    public LinearLayout M1;
    public ConstraintLayout M2;
    public RecyclerView N0;
    public LinearLayout N1;
    public Spinner N2;
    public RecyclerView O0;
    public LinearLayout O1;
    public SliderView O2;
    public TextView P0;
    public LinearLayout P1;
    public TextView Q0;
    public LinearLayout Q1;
    public String R0;
    public LinearLayout R1;
    public LinearLayout S0;
    public LinearLayout S1;
    public DatabaseHelper T0;
    public TextView T1;
    private ArrayList U0 = new ArrayList();
    public TextView U1;
    public TextView V0;
    public TextView V1;
    public TextView W0;
    public Spinner W1;
    public TextView X0;
    public LinearLayout X1;
    public TextView Y0;
    public TextView Y1;
    public TextView Z0;
    public LinearLayout Z1;

    /* renamed from: a1  reason: collision with root package name */
    public TextView f8416a1;

    /* renamed from: a2  reason: collision with root package name */
    public FrameLayout f8417a2;

    /* renamed from: b1  reason: collision with root package name */
    public LinearLayout f8418b1;

    /* renamed from: b2  reason: collision with root package name */
    public LinearLayout f8419b2;

    /* renamed from: c1  reason: collision with root package name */
    public LinearLayout f8420c1;

    /* renamed from: c2  reason: collision with root package name */
    public LinearLayout f8421c2;

    /* renamed from: d1  reason: collision with root package name */
    public LinearLayout f8422d1;

    /* renamed from: d2  reason: collision with root package name */
    private CircleImageView f8423d2;

    /* renamed from: e1  reason: collision with root package name */
    public LinearLayout f8424e1;

    /* renamed from: e2  reason: collision with root package name */
    public ja.d f8425e2;

    /* renamed from: f1  reason: collision with root package name */
    public cd.c f8426f1;

    /* renamed from: f2  reason: collision with root package name */
    public li.e f8427f2;

    /* renamed from: g1  reason: collision with root package name */
    public RcService f8428g1;

    /* renamed from: g2  reason: collision with root package name */
    public qa.b f8429g2;

    /* renamed from: h0  reason: collision with root package name */
    public li.c f8430h0;

    /* renamed from: h1  reason: collision with root package name */
    public ProgressDialog f8431h1;

    /* renamed from: h2  reason: collision with root package name */
    private ESInterface f8432h2;

    /* renamed from: i0  reason: collision with root package name */
    private final NapixService f8433i0 = NapixService.f21647a.c();

    /* renamed from: i1  reason: collision with root package name */
    public LinearLayout f8434i1;

    /* renamed from: i2  reason: collision with root package name */
    private VersionService f8435i2;

    /* renamed from: j0  reason: collision with root package name */
    private Spinner f8436j0;

    /* renamed from: j1  reason: collision with root package name */
    public LinearLayout f8437j1;

    /* renamed from: j2  reason: collision with root package name */
    public RecyclerView f8438j2;

    /* renamed from: k0  reason: collision with root package name */
    private ImageView f8439k0;

    /* renamed from: k1  reason: collision with root package name */
    private int f8440k1;

    /* renamed from: k2  reason: collision with root package name */
    public RecyclerView f8441k2;

    /* renamed from: l0  reason: collision with root package name */
    private ImageView f8442l0;

    /* renamed from: l1  reason: collision with root package name */
    public LinearLayout f8443l1;

    /* renamed from: l2  reason: collision with root package name */
    public RecyclerView f8444l2;

    /* renamed from: m0  reason: collision with root package name */
    private TextView f8445m0;

    /* renamed from: m1  reason: collision with root package name */
    public LinearLayout f8446m1;

    /* renamed from: m2  reason: collision with root package name */
    public Context f8447m2;

    /* renamed from: n0  reason: collision with root package name */
    private TextView f8448n0;

    /* renamed from: n1  reason: collision with root package name */
    public LinearLayout f8449n1;

    /* renamed from: n2  reason: collision with root package name */
    public za.a f8450n2;

    /* renamed from: o0  reason: collision with root package name */
    private TextView f8451o0;

    /* renamed from: o1  reason: collision with root package name */
    public LinearLayout f8452o1;

    /* renamed from: o2  reason: collision with root package name */
    public LinearLayout f8453o2;

    /* renamed from: p0  reason: collision with root package name */
    private FrameLayout f8454p0;

    /* renamed from: p1  reason: collision with root package name */
    private final Handler f8455p1 = new Handler();

    /* renamed from: p2  reason: collision with root package name */
    public LinearLayout f8456p2;

    /* renamed from: q0  reason: collision with root package name */
    private LinearLayout f8457q0;

    /* renamed from: q1  reason: collision with root package name */
    public LinearLayout f8458q1;

    /* renamed from: q2  reason: collision with root package name */
    public LinearLayout f8459q2;

    /* renamed from: r0  reason: collision with root package name */
    private LinearLayout f8460r0;

    /* renamed from: r1  reason: collision with root package name */
    public TextView f8461r1;

    /* renamed from: r2  reason: collision with root package name */
    public LinearLayout f8462r2;

    /* renamed from: s0  reason: collision with root package name */
    private LinearLayout f8463s0;

    /* renamed from: s1  reason: collision with root package name */
    public AppCompatEditText f8464s1;

    /* renamed from: s2  reason: collision with root package name */
    public LinearLayout f8465s2;

    /* renamed from: t0  reason: collision with root package name */
    private TextView f8466t0;

    /* renamed from: t1  reason: collision with root package name */
    public TextView f8467t1;

    /* renamed from: t2  reason: collision with root package name */
    public LinearLayout f8468t2;
    /* access modifiers changed from: private */

    /* renamed from: u0  reason: collision with root package name */
    public AppCompatEditText f8469u0;

    /* renamed from: u1  reason: collision with root package name */
    public TextView f8470u1;

    /* renamed from: u2  reason: collision with root package name */
    public LinearLayout f8471u2;

    /* renamed from: v0  reason: collision with root package name */
    private TextView f8472v0;

    /* renamed from: v1  reason: collision with root package name */
    public LinearLayout f8473v1;

    /* renamed from: v2  reason: collision with root package name */
    private boolean f8474v2 = true;
    /* access modifiers changed from: private */

    /* renamed from: w0  reason: collision with root package name */
    public int f8475w0;

    /* renamed from: w1  reason: collision with root package name */
    public LinearLayout f8476w1;

    /* renamed from: w2  reason: collision with root package name */
    public DlService f8477w2;

    /* renamed from: x0  reason: collision with root package name */
    public g f8478x0;

    /* renamed from: x1  reason: collision with root package name */
    public RecyclerView f8479x1;

    /* renamed from: x2  reason: collision with root package name */
    private va.c f8480x2;

    /* renamed from: y0  reason: collision with root package name */
    private int f8481y0;

    /* renamed from: y1  reason: collision with root package name */
    public LinearLayout f8482y1;

    /* renamed from: y2  reason: collision with root package name */
    public ld.c f8483y2;

    /* renamed from: z0  reason: collision with root package name */
    public LinearLayout f8484z0;

    /* renamed from: z1  reason: collision with root package name */
    public LinearLayout f8485z1;

    /* renamed from: z2  reason: collision with root package name */
    public TextView f8486z2;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HomeFragment f8487e;

        a(HomeFragment homeFragment) {
            this.f8487e = homeFragment;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            AppCompatEditText appCompatEditText = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-1);
            this.f8487e.f8475w0 = i10;
            if (this.f8487e.f8475w0 == 1) {
                this.f8487e.h4().setVisibility(0);
                AppCompatEditText J3 = this.f8487e.f8469u0;
                if (J3 == null) {
                    l.v("Search_bar");
                } else {
                    appCompatEditText = J3;
                }
                appCompatEditText.setVisibility(8);
                return;
            }
            try {
                AppCompatEditText J32 = this.f8487e.f8469u0;
                if (J32 == null) {
                    l.v("Search_bar");
                    J32 = null;
                }
                Editable text = J32.getText();
                l.c(text);
                if (text.length() > 0) {
                    AppCompatEditText J33 = this.f8487e.f8469u0;
                    if (J33 == null) {
                        l.v("Search_bar");
                        J33 = null;
                    }
                    J33.setText("");
                }
            } catch (Exception unused) {
            }
            this.f8487e.h4().setVisibility(8);
            AppCompatEditText J34 = this.f8487e.f8469u0;
            if (J34 == null) {
                l.v("Search_bar");
            } else {
                appCompatEditText = J34;
            }
            appCompatEditText.setVisibility(0);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HomeFragment f8488e;

        b(HomeFragment homeFragment) {
            this.f8488e = homeFragment;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (i10 != 0) {
                Object selectedItem = this.f8488e.s5().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                if (!ka.c.f13158a.m(state.getStateCode())) {
                    this.f8488e.c5().show();
                    this.f8488e.q9(new f(this.f8488e.q()));
                    this.f8488e.m5().t(q.B0(state.getStateCode()).toString());
                    this.f8488e.L4().i(state.getStateCode());
                    this.f8488e.L4().h(state.getStateCode());
                    this.f8488e.L4().k(state.getStateCode());
                    if (p.o(state.getStateCode(), "DL", true)) {
                        this.f8488e.L4().g(state.getStateCode());
                        return;
                    }
                    this.f8488e.W4().setVisibility(8);
                    this.f8488e.i5().setVisibility(8);
                    this.f8488e.V4().setVisibility(8);
                }
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HomeFragment f8489e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(HomeFragment homeFragment) {
            super(1);
            this.f8489e = homeFragment;
        }

        public final void b(String str) {
            this.f8489e.c5().dismiss();
            Toast.makeText(this.f8489e.q(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: f  reason: collision with root package name */
        int f8490f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ HomeFragment f8491g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Integer f8492h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f8493i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(HomeFragment homeFragment, Integer num, String str, tl.d dVar) {
            super(2, dVar);
            this.f8491g = homeFragment;
            this.f8492h = num;
            this.f8493i = str;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new d(this.f8491g, this.f8492h, this.f8493i, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.f8490f == 0) {
                q.b(obj);
                HomeFragment homeFragment = this.f8491g;
                Integer num = this.f8492h;
                l.c(num);
                homeFragment.P9(num.intValue());
                this.f8491g.f4().s0(this.f8493i);
                j q10 = this.f8491g.q();
                if (q10 != null) {
                    HomeFragment homeFragment2 = this.f8491g;
                    homeFragment2.N4().l(this.f8493i, q10);
                }
                return x.f30437a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class e implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8494a;

        e(bm.l lVar) {
            l.f(lVar, "function");
            this.f8494a = lVar;
        }

        public final pl.c a() {
            return this.f8494a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8494a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A7(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        l.f(homeFragment, "this$0");
        try {
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                if (homeFragment.c5().isShowing()) {
                    homeFragment.c5().dismiss();
                }
                Intent intent = new Intent(homeFragment.w(), EsActivity.class);
                intent.putExtra("state_code", homeFragment.p5().q());
                homeFragment.R1(intent);
            }
        } catch (Exception unused) {
        }
    }

    private final void B6() {
        Q1("android.permission.ACCESS_FINE_LOCATION");
        C1(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, this.I1);
    }

    /* access modifiers changed from: private */
    public static final void B7(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void C6(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        TextView J5;
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                homeFragment.I5().setVisibility(0);
                homeFragment.J5().setVisibility(0);
                Object selectedItem = homeFragment.s5().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                homeFragment.j5().setLayoutManager(new GridLayoutManager(homeFragment.I4(), 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                if (enabledservice.size() > 0) {
                    u uVar = new u(enabledservice, homeFragment.I4(), state.getStateCode());
                    homeFragment.j5().setAdapter(uVar);
                    uVar.j();
                    return;
                }
                homeFragment.I5().setVisibility(8);
                J5 = homeFragment.J5();
            } else {
                homeFragment.I5().setVisibility(8);
                J5 = homeFragment.J5();
            }
            J5.setVisibility(8);
        } catch (Exception e10) {
            e10.printStackTrace();
            homeFragment.I5().setVisibility(8);
            homeFragment.J5().setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void C7(HomeFragment homeFragment, GetEnableStateModel getEnableStateModel) {
        l.f(homeFragment, "this$0");
        homeFragment.c5().dismiss();
        if (p.o(getEnableStateModel.getStatusCode(), "MSTR001", true)) {
            ArrayList<StateX> states = getEnableStateModel.getStates();
            a.C0115a aVar = com.nic.mparivahan.Dashboard.a.f8403a;
            Context E12 = homeFragment.E1();
            l.e(E12, "requireContext(...)");
            aVar.d(E12, states);
        }
    }

    /* access modifiers changed from: private */
    public static final void D6(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            if (str.toString().equals(v9.d.f17494a.u())) {
                homeFragment.M5().p();
            } else if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.I5().setVisibility(8);
                homeFragment.J5().setVisibility(8);
            }
        } catch (Exception unused) {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.I5().setVisibility(8);
                homeFragment.J5().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void E6(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        l.f(homeFragment, "this$0");
        try {
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                Object selectedItem = homeFragment.s5().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                homeFragment.n5().setVisibility(0);
                homeFragment.h5().setLayoutManager(new GridLayoutManager(homeFragment.I4(), 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                if (enabledservice.size() > 0) {
                    ma.m mVar = new ma.m(enabledservice, homeFragment.I4(), state.getStateCode());
                    homeFragment.h5().setAdapter(mVar);
                    mVar.j();
                    return;
                }
            }
            homeFragment.n5().setVisibility(8);
        } catch (Exception unused) {
            homeFragment.n5().setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void E7(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F6(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            homeFragment.n5().setVisibility(0);
        } catch (Exception unused) {
        }
    }

    private final void F7(String str) {
        j q10 = q();
        TextView textView = null;
        Dialog dialog = q10 != null ? new Dialog(q10) : null;
        if (dialog != null) {
            dialog.setContentView(R.layout.informlocation);
        }
        Window window = dialog != null ? dialog.getWindow() : null;
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        l.d(dialog != null ? (TextView) dialog.findViewById(R.id.pop_up_msg) : null, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = dialog != null ? (TextView) dialog.findViewById(R.id.accept) : null;
        l.d(textView2, "null cannot be cast to non-null type android.widget.TextView");
        if (dialog != null) {
            textView = (TextView) dialog.findViewById(R.id.deny);
        }
        l.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setOnClickListener(new j1(dialog, this));
        textView.setOnClickListener(new k1(dialog));
        if (dialog != null) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void G6(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        ConstraintLayout Y4;
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                homeFragment.Y3().setVisibility(0);
                homeFragment.W3().setVisibility(0);
                homeFragment.T3().setVisibility(0);
                Object selectedItem = homeFragment.s5().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                homeFragment.W3().setLayoutManager(new GridLayoutManager(homeFragment.I4(), 4));
                homeFragment.Z4().setLayoutManager(new GridLayoutManager(homeFragment.I4(), 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                if (enabledservice.size() > 0) {
                    c.a aVar = ka.c.f13158a;
                    if (!aVar.g(enabledservice, "2001")) {
                        homeFragment.a5().setVisibility(8);
                        homeFragment.Z4().setVisibility(8);
                        homeFragment.Y4().setVisibility(8);
                        ma.b bVar = new ma.b(enabledservice, homeFragment.I4(), state.getStateCode());
                        homeFragment.W3().setAdapter(bVar);
                        bVar.j();
                        return;
                    } else if (aVar.i(enabledservice, "2001") > -1) {
                        List<Enabledservice> subList = enabledservice.subList(0, aVar.i(enabledservice, "2001"));
                        l.e(subList, "subList(...)");
                        List t02 = y.t0(subList);
                        List<Enabledservice> subList2 = enabledservice.subList(aVar.i(enabledservice, "2001"), enabledservice.size());
                        l.e(subList2, "subList(...)");
                        List t03 = y.t0(subList2);
                        ma.b bVar2 = new ma.b(t02, homeFragment.I4(), state.getStateCode());
                        homeFragment.W3().setAdapter(bVar2);
                        bVar2.j();
                        if (t03.size() > 0) {
                            z zVar = new z(t03, homeFragment.I4(), state.getStateCode());
                            homeFragment.Z4().setAdapter(zVar);
                            zVar.j();
                            homeFragment.a5().setVisibility(0);
                            homeFragment.Z4().setVisibility(0);
                            homeFragment.Y4().setVisibility(0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    homeFragment.Y3().setVisibility(8);
                    homeFragment.W3().setVisibility(8);
                    homeFragment.T3().setVisibility(8);
                    homeFragment.a5().setVisibility(8);
                    homeFragment.Z4().setVisibility(8);
                    Y4 = homeFragment.Y4();
                }
            } else {
                homeFragment.Y3().setVisibility(8);
                homeFragment.W3().setVisibility(8);
                homeFragment.T3().setVisibility(8);
                homeFragment.a5().setVisibility(8);
                homeFragment.Z4().setVisibility(8);
                Y4 = homeFragment.Y4();
            }
            Y4.setVisibility(8);
        } catch (Exception e10) {
            e10.printStackTrace();
            homeFragment.Y3().setVisibility(8);
            homeFragment.W3().setVisibility(8);
            homeFragment.T3().setVisibility(8);
            homeFragment.a5().setVisibility(8);
            homeFragment.Z4().setVisibility(8);
            homeFragment.Y4().setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void G7(Dialog dialog, HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        if (dialog != null) {
            dialog.dismiss();
        }
        homeFragment.B6();
    }

    /* access modifiers changed from: private */
    public static final void H6(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            if (str.toString().equals(v9.d.f17494a.u())) {
                homeFragment.M5().p();
            } else if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.Y3().setVisibility(8);
                homeFragment.W3().setVisibility(8);
                homeFragment.a5().setVisibility(8);
                homeFragment.Z4().setVisibility(8);
                homeFragment.T3().setVisibility(8);
                homeFragment.Y4().setVisibility(8);
            }
        } catch (Exception unused) {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.Y3().setVisibility(8);
                homeFragment.W3().setVisibility(8);
                homeFragment.T3().setVisibility(8);
                homeFragment.a5().setVisibility(8);
                homeFragment.Z4().setVisibility(8);
                homeFragment.Y4().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void H7(Dialog dialog, View view) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void I6(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        ConstraintLayout V4;
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                homeFragment.W4().setVisibility(0);
                homeFragment.i5().setVisibility(0);
                homeFragment.V4().setVisibility(0);
                Object selectedItem = homeFragment.s5().getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Account.Model.State");
                State state = (State) selectedItem;
                homeFragment.i5().setLayoutManager(new GridLayoutManager(homeFragment.I4(), 4));
                ArrayList<Enabledservice> enabledservice = enableServiceResponse.getEnabledservice();
                Collections.sort(enabledservice);
                if (enabledservice.size() > 0) {
                    ma.f fVar = new ma.f(enabledservice, homeFragment.I4(), state.getStateCode());
                    homeFragment.i5().setAdapter(fVar);
                    fVar.j();
                    return;
                }
                homeFragment.W4().setVisibility(8);
                homeFragment.i5().setVisibility(8);
                V4 = homeFragment.V4();
            } else {
                homeFragment.W4().setVisibility(8);
                homeFragment.i5().setVisibility(8);
                V4 = homeFragment.V4();
            }
            V4.setVisibility(8);
        } catch (Exception e10) {
            e10.printStackTrace();
            homeFragment.W4().setVisibility(8);
            homeFragment.i5().setVisibility(8);
            homeFragment.V4().setVisibility(8);
        }
    }

    private final void I7() {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.location_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.pop_up_allow);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setOnClickListener(new w0(dialog));
        ((TextView) findViewById2).setOnClickListener(new x0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void J6(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            if (str.toString().equals(v9.d.f17494a.u())) {
                homeFragment.M5().p();
            } else if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.W4().setVisibility(8);
                homeFragment.i5().setVisibility(8);
                homeFragment.V4().setVisibility(8);
            }
        } catch (Exception unused) {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
                homeFragment.W4().setVisibility(8);
                homeFragment.i5().setVisibility(8);
                homeFragment.V4().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void J7(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K6(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        homeFragment.c5().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K7(Dialog dialog, HomeFragment homeFragment, View view) {
        Intent intent;
        l.f(dialog, "$d");
        l.f(homeFragment, "this$0");
        dialog.dismiss();
        if (homeFragment.z6()) {
            if (l.a(homeFragment.S3(), "0")) {
                homeFragment.R1(new Intent(homeFragment.q(), TrafficReportVioActivity.class));
            }
            if (l.a(homeFragment.S3(), "1")) {
                intent = new Intent(homeFragment.q(), AccidentReportActivity.class);
            } else {
                return;
            }
        } else {
            dialog.dismiss();
            j q10 = homeFragment.q();
            Boolean valueOf = q10 != null ? Boolean.valueOf(androidx.core.app.b.u(q10, "android.permission.ACCESS_FINE_LOCATION")) : null;
            l.c(valueOf);
            if (!valueOf.booleanValue()) {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", "com.nic.mparivahan", (String) null));
            } else {
                return;
            }
        }
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void L6(HomeFragment homeFragment, NapixTokenModel napixTokenModel) {
        l.f(homeFragment, "this$0");
        try {
            new g(homeFragment.q()).D(napixTokenModel.getAccess_token());
            homeFragment.M5().p();
        } catch (Exception unused) {
        }
    }

    private final boolean M3(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) == '-') {
                i10++;
            }
        }
        return i10 <= 4;
    }

    /* access modifiers changed from: private */
    public static final void M6(String str) {
    }

    /* access modifiers changed from: private */
    public static final void N6(HomeFragment homeFragment, ArrayList arrayList) {
        View P3;
        l.f(homeFragment, "this$0");
        if (homeFragment.f8474v2) {
            ja.d dVar = null;
            if (arrayList.size() > 0 && homeFragment.f4().c0() != null) {
                homeFragment.da();
                l.c(arrayList);
                homeFragment.U0 = arrayList;
                homeFragment.t4().setVisibility(0);
                homeFragment.A4().setVisibility(8);
                homeFragment.G4().setBackgroundResource(R.color.white);
                homeFragment.w4().setImageResource(R.drawable.drive);
                homeFragment.y5().setTextColor(Color.parseColor("#000000"));
                j q10 = homeFragment.q();
                if (q10 != null) {
                    dVar = new ja.d(homeFragment.U0, q10, homeFragment, homeFragment, homeFragment);
                }
            } else if (arrayList.size() > 0) {
                Log.e("Alerts", "Alerts--22");
                l.c(arrayList);
                homeFragment.U0 = arrayList;
                homeFragment.g5().setVisibility(8);
                homeFragment.t4().setVisibility(0);
                homeFragment.A4().setVisibility(8);
                homeFragment.G4().setBackgroundResource(R.color.white);
                homeFragment.w4().setImageResource(R.drawable.drive);
                homeFragment.y5().setTextColor(Color.parseColor("#000000"));
                j q11 = homeFragment.q();
                if (q11 != null) {
                    dVar = new ja.d(homeFragment.U0, q11, homeFragment, homeFragment, homeFragment);
                }
            } else {
                Log.e("Alerts", "Alerts--20");
                homeFragment.R3().setVisibility(8);
                homeFragment.t4().setVisibility(0);
                homeFragment.A4().setVisibility(8);
                homeFragment.G4().setBackgroundResource(R.color.white);
                homeFragment.w4().setImageResource(R.drawable.drive);
                homeFragment.y5().setTextColor(Color.parseColor("#000000"));
                P3 = homeFragment.P3();
                P3.setVisibility(0);
            }
            l.c(dVar);
            homeFragment.P7(dVar);
            homeFragment.O3().setAdapter(homeFragment.Q3());
            homeFragment.Q3().j();
            homeFragment.R3().setVisibility(0);
            homeFragment.P3().setVisibility(8);
            P3 = homeFragment.O3();
            P3.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void O6(HomeFragment homeFragment, String str) {
        View g52;
        l.f(homeFragment, "this$0");
        Log.e("Alerts", "Alerts--2");
        if (homeFragment.f8474v2) {
            if (homeFragment.f4().c0() != null) {
                Log.e("Alerts", "Alerts--23");
                homeFragment.da();
                homeFragment.O3().setVisibility(8);
                homeFragment.g5().setVisibility(0);
                homeFragment.t4().setVisibility(0);
                homeFragment.A4().setVisibility(8);
                homeFragment.G4().setBackgroundResource(R.color.white);
                homeFragment.w4().setImageResource(R.drawable.drive);
                homeFragment.y5().setTextColor(Color.parseColor("#000000"));
                homeFragment.R3().setVisibility(0);
                g52 = homeFragment.P3();
            } else {
                Log.e("Alerts", "Alerts--24");
                homeFragment.R3().setVisibility(8);
                homeFragment.t4().setVisibility(0);
                homeFragment.A4().setVisibility(8);
                homeFragment.G4().setBackgroundResource(R.color.white);
                homeFragment.w4().setImageResource(R.drawable.drive);
                homeFragment.y5().setTextColor(Color.parseColor("#000000"));
                homeFragment.P3().setVisibility(0);
                homeFragment.O3().setVisibility(8);
                g52 = homeFragment.g5();
            }
            g52.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void P6(HomeFragment homeFragment, DLServiceResponseModleV1 dLServiceResponseModleV1) {
        l.f(homeFragment, "this$0");
        try {
            homeFragment.f4().M0(q.B0(dLServiceResponseModleV1.getDldetobj().get(0).getDlobj().getDlLicno()).toString(), dLServiceResponseModleV1.getDldetobj().get(0));
            va.c cVar = homeFragment.f8480x2;
            if (cVar != null) {
                cVar.j();
            }
            j q10 = homeFragment.q();
            if (q10 != null) {
                homeFragment.Y9(q10, homeFragment.z4().b(v9.f.f17510a.j(), "Driving Licence alert successfully updated!"));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(29:2|3|4|(1:6)|9|(1:11)|12|13|(2:15|16)|17|(1:19)|20|21|22|(1:24)|25|26|27|(1:29)|30|(1:32)|33|(3:35|(1:37)|38)|39|(1:41)|42|(1:44)(1:45)|46|50) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x065b */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x065f A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x066f A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0687 A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0708 A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x071a A[Catch:{ Exception -> 0x05d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0720 A[Catch:{ Exception -> 0x05d4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Q5(android.view.View r10) {
        /*
            r9 = this;
            java.lang.String r0 = "spinner"
            java.lang.String r1 = "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatEditText"
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.ImageView"
            java.lang.String r3 = "null cannot be cast to non-null type android.widget.LinearLayout"
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            java.lang.String r5 = "null cannot be cast to non-null type android.widget.TextView"
            java.lang.String r6 = "findViewById(...)"
            if (r10 == 0) goto L_0x072d
            r7 = 2131363113(0x7f0a0529, float:1.8346026E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r7, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x05d4 }
            r9.f8466t0 = r7     // Catch:{ Exception -> 0x05d4 }
            r7 = 2131362020(0x7f0a00e4, float:1.8343809E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r8 = "null cannot be cast to non-null type android.widget.Spinner"
            cm.l.d(r7, r8)     // Catch:{ Exception -> 0x05d4 }
            android.widget.Spinner r7 = (android.widget.Spinner) r7     // Catch:{ Exception -> 0x05d4 }
            r9.f8436j0 = r7     // Catch:{ Exception -> 0x05d4 }
            r7 = 2131363526(0x7f0a06c6, float:1.8346863E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r7, r2)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05d4 }
            r9.f8439k0 = r7     // Catch:{ Exception -> 0x05d4 }
            r7 = 2131361814(0x7f0a0016, float:1.834339E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r7, r1)     // Catch:{ Exception -> 0x05d4 }
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7     // Catch:{ Exception -> 0x05d4 }
            r9.f8469u0 = r7     // Catch:{ Exception -> 0x05d4 }
            r7 = 2131363321(0x7f0a05f9, float:1.8346448E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r7, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x05d4 }
            r9.C8(r7)     // Catch:{ Exception -> 0x05d4 }
            r7 = 2131362564(0x7f0a0304, float:1.8344912E38)
            android.view.View r7 = r10.findViewById(r7)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r7, r1)     // Catch:{ Exception -> 0x05d4 }
            androidx.appcompat.widget.AppCompatEditText r7 = (androidx.appcompat.widget.AppCompatEditText) r7     // Catch:{ Exception -> 0x05d4 }
            r9.l8(r7)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362281(0x7f0a01e9, float:1.8344338E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.X7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363853(0x7f0a080d, float:1.8347527E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.a9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363491(0x7f0a06a3, float:1.8346792E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.M8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362342(0x7f0a0226, float:1.8344462E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r2)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8442l0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362346(0x7f0a022a, float:1.834447E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8445m0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364326(0x7f0a09e6, float:1.8348486E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8448n0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365469(0x7f0a0e5d, float:1.8350804E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.F9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363976(0x7f0a0888, float:1.8347776E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r3)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8457q0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365430(0x7f0a0e36, float:1.8350725E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8472v0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363534(0x7f0a06ce, float:1.834688E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.L8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363507(0x7f0a06b3, float:1.8346825E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.K8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363490(0x7f0a06a2, float:1.834679E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.H8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363501(0x7f0a06ad, float:1.8346813E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.J8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363393(0x7f0a0641, float:1.8346594E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.B8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363386(0x7f0a063a, float:1.834658E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.z8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363382(0x7f0a0636, float:1.8346571E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.y8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363385(0x7f0a0639, float:1.8346577E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.A8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365406(0x7f0a0e1e, float:1.8350676E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.D9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365330(0x7f0a0dd2, float:1.8350522E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.C9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365384(0x7f0a0e08, float:1.8350632E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.E9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365320(0x7f0a0dc8, float:1.8350502E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.G9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364970(0x7f0a0c6a, float:1.8349792E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.F8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365655(0x7f0a0f17, float:1.8351181E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.T9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364241(0x7f0a0991, float:1.8348314E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r4)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.j9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365734(0x7f0a0f66, float:1.8351342E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.X9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364239(0x7f0a098f, float:1.834831E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r4)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.i9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365729(0x7f0a0f61, float:1.8351332E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.W9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364218(0x7f0a097a, float:1.8348267E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r4)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.k9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363915(0x7f0a084b, float:1.8347652E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r5)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.d9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363914(0x7f0a084a, float:1.834765E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r4)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.c9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363919(0x7f0a084f, float:1.834766E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.b9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362268(0x7f0a01dc, float:1.8344312E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.S7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363850(0x7f0a080a, float:1.834752E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Z8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362576(0x7f0a0310, float:1.8344936E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.g8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362575(0x7f0a030f, float:1.8344934E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.i8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362573(0x7f0a030d, float:1.834493E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.h8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362574(0x7f0a030e, float:1.8344932E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362577(0x7f0a0311, float:1.8344939E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.j8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363495(0x7f0a06a7, float:1.83468E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.I8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363194(0x7f0a057a, float:1.834619E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.x8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363708(0x7f0a077c, float:1.8347232E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.U8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363707(0x7f0a077b, float:1.834723E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.T8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131361965(0x7f0a00ad, float:1.8343697E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.N7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362280(0x7f0a01e8, float:1.8344336E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.W7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362273(0x7f0a01e1, float:1.8344322E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.U7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363814(0x7f0a07e6, float:1.8347447E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Y8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131361885(0x7f0a005d, float:1.8343535E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.M7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131361969(0x7f0a00b1, float:1.8343705E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Q7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364322(0x7f0a09e2, float:1.8348478E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.o9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364323(0x7f0a09e3, float:1.834848E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.p9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365645(0x7f0a0f0d, float:1.8351161E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.S9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362277(0x7f0a01e5, float:1.834433E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r1, r4)     // Catch:{ Exception -> 0x05d4 }
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.V7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363773(0x7f0a07bd, float:1.8347364E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.X8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363769(0x7f0a07b9, float:1.8347356E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.W8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362808(0x7f0a03f8, float:1.8345407E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.q8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362294(0x7f0a01f6, float:1.8344365E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Z7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363354(0x7f0a061a, float:1.8346514E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.D8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362591(0x7f0a031f, float:1.8344967E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.m8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364479(0x7f0a0a7f, float:1.8348796E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.s9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365707(0x7f0a0f4b, float:1.8351287E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.V9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363455(0x7f0a067f, float:1.834672E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.G8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362687(0x7f0a037f, float:1.8345162E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.o8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131361967(0x7f0a00af, float:1.8343701E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.O7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362554(0x7f0a02fa, float:1.8344892E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.k8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362652(0x7f0a035c, float:1.834509E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.n8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362293(0x7f0a01f5, float:1.8344362E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Y7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364226(0x7f0a0982, float:1.8348283E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.h9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363145(0x7f0a0549, float:1.834609E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.w8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362471(0x7f0a02a7, float:1.8344724E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.c8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362809(0x7f0a03f9, float:1.834541E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.r8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362474(0x7f0a02aa, float:1.834473E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.d8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365534(0x7f0a0e9e, float:1.8350936E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            com.nic.mparivahan.dlservices.widget.CircleImageView r1 = (com.nic.mparivahan.dlservices.widget.CircleImageView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8423d2 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362874(0x7f0a043a, float:1.834554E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.t8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362873(0x7f0a0439, float:1.8345539E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.s8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364667(0x7f0a0b3b, float:1.8349178E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.A9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364486(0x7f0a0a86, float:1.834881E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch:{ Exception -> 0x05d4 }
            r9.z9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362846(0x7f0a041e, float:1.8345484E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.Q9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131365642(0x7f0a0f0a, float:1.8351155E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.R9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364434(0x7f0a0a52, float:1.8348705E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.r9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364617(0x7f0a0b09, float:1.8349076E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.w9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362284(0x7f0a01ec, float:1.8344344E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.T7(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363922(0x7f0a0852, float:1.8347666E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131363921(0x7f0a0851, float:1.8347664E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.e9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362969(0x7f0a0499, float:1.8345734E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.v8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362968(0x7f0a0498, float:1.8345732E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.u8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362743(0x7f0a03b7, float:1.8345275E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.p8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364668(0x7f0a0b3c, float:1.834918E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.B9(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362345(0x7f0a0229, float:1.8344468E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch:{ Exception -> 0x05d4 }
            r9.b8(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364376(0x7f0a0a18, float:1.8348587E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8451o0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131362341(0x7f0a0225, float:1.834446E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1     // Catch:{ Exception -> 0x05d4 }
            r9.f8454p0 = r1     // Catch:{ Exception -> 0x05d4 }
            r1 = 2131364579(0x7f0a0ae3, float:1.8349E38)
            android.view.View r1 = r10.findViewById(r1)     // Catch:{ Exception -> 0x05d4 }
            cm.l.e(r1, r6)     // Catch:{ Exception -> 0x05d4 }
            com.smarteist.autoimageslider.SliderView r1 = (com.smarteist.autoimageslider.SliderView) r1     // Catch:{ Exception -> 0x05d4 }
            r9.v9(r1)     // Catch:{ Exception -> 0x05d4 }
            androidx.appcompat.widget.AppCompatEditText r1 = r9.h4()     // Catch:{ Exception -> 0x05d4 }
            ld.c r2 = r9.z4()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r4 = "label_challan_enter_dl_no"
            java.lang.String r5 = "Enter Driving Licence No"
            java.lang.String r2 = r2.b(r4, r5)     // Catch:{ Exception -> 0x05d4 }
            r1.setHint(r2)     // Catch:{ Exception -> 0x05d4 }
            androidx.appcompat.widget.AppCompatEditText r1 = r9.f8469u0     // Catch:{ Exception -> 0x05d4 }
            r2 = 0
            if (r1 != 0) goto L_0x05d7
            java.lang.String r1 = "Search_bar"
            cm.l.v(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = r2
            goto L_0x05d7
        L_0x05d4:
            r10 = move-exception
            goto L_0x072a
        L_0x05d7:
            ld.c r4 = r9.z4()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r5 = "label_challan_enter_vehicle_no"
            java.lang.String r6 = "Enter Vehicle No"
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x05d4 }
            r1.setHint(r4)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = r9.f8445m0     // Catch:{ Exception -> 0x05d4 }
            if (r1 != 0) goto L_0x05f0
            java.lang.String r1 = "citzen_sentinal_title"
            cm.l.v(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = r2
        L_0x05f0:
            ld.c r4 = r9.z4()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r5 = "label_citizen_sentinel"
            r6 = 2132017485(0x7f14014d, float:1.967325E38)
            java.lang.String r6 = r9.e0(r6)     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x05d4 }
            r1.setText(r4)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = r9.f8448n0     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r4 = "report_traffic_violation"
            if (r1 != 0) goto L_0x060e
            cm.l.v(r4)     // Catch:{ Exception -> 0x05d4 }
            r1 = r2
        L_0x060e:
            ld.c r5 = r9.z4()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r6 = "Report Traffic Violation"
            java.lang.String r4 = r5.b(r4, r6)     // Catch:{ Exception -> 0x05d4 }
            r1.setText(r4)     // Catch:{ Exception -> 0x05d4 }
            android.widget.TextView r1 = r9.f8451o0     // Catch:{ Exception -> 0x05d4 }
            if (r1 != 0) goto L_0x0625
            java.lang.String r1 = "road_accident"
            cm.l.v(r1)     // Catch:{ Exception -> 0x05d4 }
            r1 = r2
        L_0x0625:
            ld.c r4 = r9.z4()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r5 = "label_report_accident"
            java.lang.String r6 = "Report Accident"
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x05d4 }
            r1.setText(r4)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter     // Catch:{ Exception -> 0x065b }
            androidx.fragment.app.j r4 = r9.D1()     // Catch:{ Exception -> 0x065b }
            ka.c$a r5 = ka.c.f13158a     // Catch:{ Exception -> 0x065b }
            androidx.fragment.app.j r6 = r9.q()     // Catch:{ Exception -> 0x065b }
            java.lang.String[] r5 = r5.c(r6)     // Catch:{ Exception -> 0x065b }
            r6 = 2131558982(0x7f0d0246, float:1.8743295E38)
            r1.<init>(r4, r6, r5)     // Catch:{ Exception -> 0x065b }
            r4 = 2131559031(0x7f0d0277, float:1.8743395E38)
            r1.setDropDownViewResource(r4)     // Catch:{ Exception -> 0x065b }
            android.widget.Spinner r4 = r9.f8436j0     // Catch:{ Exception -> 0x065b }
            if (r4 != 0) goto L_0x0658
            cm.l.v(r0)     // Catch:{ Exception -> 0x065b }
            r4 = r2
        L_0x0658:
            r4.setAdapter(r1)     // Catch:{ Exception -> 0x065b }
        L_0x065b:
            android.widget.Spinner r1 = r9.f8436j0     // Catch:{ Exception -> 0x05d4 }
            if (r1 != 0) goto L_0x0663
            cm.l.v(r0)     // Catch:{ Exception -> 0x05d4 }
            r1 = r2
        L_0x0663:
            com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$a r0 = new com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$a     // Catch:{ Exception -> 0x05d4 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r1.setOnItemSelectedListener(r0)     // Catch:{ Exception -> 0x05d4 }
            android.widget.ImageView r0 = r9.f8439k0     // Catch:{ Exception -> 0x05d4 }
            if (r0 != 0) goto L_0x0675
            java.lang.String r0 = "llSearh"
            cm.l.v(r0)     // Catch:{ Exception -> 0x05d4 }
            r0 = r2
        L_0x0675:
            ta.z0 r1 = new ta.z0     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            ld.g r0 = r9.p5()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r0 = r0.n()     // Catch:{ Exception -> 0x05d4 }
            if (r0 == 0) goto L_0x06a0
            android.widget.TextView r0 = r9.f8466t0     // Catch:{ Exception -> 0x05d4 }
            if (r0 != 0) goto L_0x0691
            java.lang.String r0 = "full_name"
            cm.l.v(r0)     // Catch:{ Exception -> 0x05d4 }
            r0 = r2
        L_0x0691:
            ld.g r1 = r9.p5()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r1 = r1.n()     // Catch:{ Exception -> 0x05d4 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05d4 }
            r0.setText(r1)     // Catch:{ Exception -> 0x05d4 }
        L_0x06a0:
            android.widget.LinearLayout r0 = r9.G4()     // Catch:{ Exception -> 0x05d4 }
            ta.a1 r1 = new ta.a1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = r9.F4()     // Catch:{ Exception -> 0x05d4 }
            ta.b1 r1 = new ta.b1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = r9.L5()     // Catch:{ Exception -> 0x05d4 }
            ta.c1 r1 = new ta.c1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = r9.C4()     // Catch:{ Exception -> 0x05d4 }
            ta.e1 r1 = new ta.e1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = r9.E4()     // Catch:{ Exception -> 0x05d4 }
            ta.f1 r1 = new ta.f1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = r9.H4()     // Catch:{ Exception -> 0x05d4 }
            ta.g1 r1 = new ta.g1     // Catch:{ Exception -> 0x05d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x05d4 }
            r0 = 2131362811(0x7f0a03fb, float:1.8345413E38)
            android.view.View r0 = r10.findViewById(r0)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r0, r3)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05d4 }
            r9.f8463s0 = r0     // Catch:{ Exception -> 0x05d4 }
            r0 = 2131363209(0x7f0a0589, float:1.834622E38)
            android.view.View r10 = r10.findViewById(r0)     // Catch:{ Exception -> 0x05d4 }
            cm.l.d(r10, r3)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10     // Catch:{ Exception -> 0x05d4 }
            r9.f8460r0 = r10     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r10 = r9.f8463s0     // Catch:{ Exception -> 0x05d4 }
            if (r10 != 0) goto L_0x070e
            java.lang.String r10 = "duplicate_rc"
            cm.l.v(r10)     // Catch:{ Exception -> 0x05d4 }
            r10 = r2
        L_0x070e:
            ta.h1 r0 = new ta.h1     // Catch:{ Exception -> 0x05d4 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r10.setOnClickListener(r0)     // Catch:{ Exception -> 0x05d4 }
            android.widget.LinearLayout r10 = r9.f8460r0     // Catch:{ Exception -> 0x05d4 }
            if (r10 != 0) goto L_0x0720
            java.lang.String r10 = "hp_termintion"
            cm.l.v(r10)     // Catch:{ Exception -> 0x05d4 }
            goto L_0x0721
        L_0x0720:
            r2 = r10
        L_0x0721:
            ta.i1 r10 = new ta.i1     // Catch:{ Exception -> 0x05d4 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x05d4 }
            r2.setOnClickListener(r10)     // Catch:{ Exception -> 0x05d4 }
            goto L_0x072d
        L_0x072a:
            r10.printStackTrace()
        L_0x072d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment.Q5(android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void Q6(String str) {
    }

    /* access modifiers changed from: private */
    public static final void R5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 == null || !ka.c.f13158a.e(q10)) {
            homeFragment.f8474v2 = false;
            homeFragment.R1(new Intent(homeFragment.q(), MyDocActivity.class));
            return;
        }
        p.a aVar = ii.p.f24363a;
        j q11 = homeFragment.q();
        l.c(q11);
        aVar.c(q11);
    }

    /* access modifiers changed from: private */
    public static final void R6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), OtherServices.class));
    }

    /* access modifiers changed from: private */
    public static final void S5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), VerifyPaymentChallan.class));
    }

    /* access modifiers changed from: private */
    public static final void S6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), AvailableFancyNumberStatus.class);
        intent.putExtra("ServiceName", "Available Fancy No. Status");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void T5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.f8474v2 = false;
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        homeFragment.F4().setBackgroundResource(R.color.white);
        homeFragment.E4().setBackgroundResource(R.color.white);
        homeFragment.v4().setImageResource(R.drawable.ic_informational_services);
        homeFragment.v4().setColorFilter((ColorFilter) null);
        homeFragment.w5().setTextColor(Color.parseColor("#000000"));
        homeFragment.x5().setTextColor(Color.parseColor("#000000"));
        homeFragment.R1(new Intent(homeFragment.q(), VirtualDocScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void T6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), AuctionStatusActivity.class);
        intent.putExtra("ServiceName", "Auction Status");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void U5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.f8474v2 = false;
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        homeFragment.D4().setVisibility(8);
        homeFragment.O5().setVisibility(8);
        homeFragment.P5().setVisibility(8);
        homeFragment.f5().setVisibility(8);
        homeFragment.U4().setVisibility(8);
        homeFragment.t4().setVisibility(8);
        homeFragment.N3().setVisibility(8);
        homeFragment.x4().setVisibility(0);
        TextView textView = homeFragment.f8472v0;
        if (textView == null) {
            l.v("txt_process");
            textView = null;
        }
        textView.setVisibility(8);
        homeFragment.G4().setBackgroundResource(R.color.white);
        homeFragment.F4().setBackgroundResource(R.color.white);
        homeFragment.C4().setBackgroundResource(R.color.white);
        homeFragment.H4().setBackgroundResource(R.color.white);
        homeFragment.E4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
        homeFragment.v4().setColorFilter(Color.argb(255, 255, 255, 255));
        homeFragment.y5().setTextColor(Color.parseColor("#000000"));
        homeFragment.w5().setTextColor(Color.parseColor("#000000"));
        homeFragment.v5().setTextColor(Color.parseColor("#000000"));
        homeFragment.z5().setTextColor(Color.parseColor("#000000"));
        homeFragment.x5().setTextColor(Color.parseColor("#FFFFFF"));
        homeFragment.u4().setColorFilter((ColorFilter) null);
        ImageView imageView = homeFragment.f8442l0;
        if (imageView == null) {
            l.v("citizen_image");
            imageView = null;
        }
        imageView.setColorFilter((ColorFilter) null);
        homeFragment.u4().setImageResource(R.drawable.dms_docs);
        homeFragment.w4().setImageResource(R.drawable.drive);
        homeFragment.A4().setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void U6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), FancyFeeReceipt.class);
        intent.putExtra("ServiceName", "View Fancy No. Fee Receipt");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void V5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.f8474v2 = false;
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        j q11 = homeFragment.q();
        if (q11 == null || !ka.c.f13158a.e(q11)) {
            homeFragment.D4().setVisibility(8);
            homeFragment.O5().setVisibility(8);
            homeFragment.P5().setVisibility(8);
            homeFragment.f5().setVisibility(8);
            homeFragment.U4().setVisibility(8);
            homeFragment.t4().setVisibility(8);
            homeFragment.N3().setVisibility(0);
            homeFragment.x4().setVisibility(8);
            TextView textView = homeFragment.f8472v0;
            if (textView == null) {
                l.v("txt_process");
                textView = null;
            }
            textView.setVisibility(8);
            homeFragment.G4().setBackgroundResource(R.color.white);
            homeFragment.F4().setBackgroundResource(R.color.white);
            homeFragment.C4().setBackgroundResource(R.color.white);
            homeFragment.E4().setBackgroundResource(R.color.white);
            homeFragment.H4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            ImageView imageView = homeFragment.f8442l0;
            if (imageView == null) {
                l.v("citizen_image");
                imageView = null;
            }
            imageView.setColorFilter(Color.argb(255, 255, 255, 255));
            homeFragment.y5().setTextColor(Color.parseColor("#000000"));
            homeFragment.w5().setTextColor(Color.parseColor("#000000"));
            homeFragment.v5().setTextColor(Color.parseColor("#000000"));
            homeFragment.x5().setTextColor(Color.parseColor("#000000"));
            homeFragment.z5().setTextColor(Color.parseColor("#FFFFFF"));
            homeFragment.u4().setColorFilter((ColorFilter) null);
            homeFragment.v4().setColorFilter((ColorFilter) null);
            homeFragment.u4().setImageResource(R.drawable.dms_docs);
            homeFragment.w4().setImageResource(R.drawable.drive);
            homeFragment.A4().setVisibility(8);
            String f10 = new ld.e(homeFragment.q()).f();
            if (f10.equals("0")) {
                homeFragment.u5().setVisibility(4);
                homeFragment.c4().setVisibility(4);
                return;
            }
            try {
                Object j10 = new i7.d().j(f10, StateMaster.class);
                l.e(j10, "fromJson(...)");
                homeFragment.y9((StateMaster) j10);
            } catch (Exception unused) {
            }
        } else {
            p.a aVar = ii.p.f24363a;
            j q12 = homeFragment.q();
            l.c(q12);
            aVar.c(q12);
        }
    }

    /* access modifiers changed from: private */
    public static final void V6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-ownership.html");
        intent.putExtra("title", homeFragment.H5().getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void W5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        new ld.h(homeFragment.q()).h(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
        homeFragment.R1(new Intent(homeFragment.q(), VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void W6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-hp-termination.html");
        intent.putExtra("title", homeFragment.E5().getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void X5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        new ld.h(homeFragment.q()).h(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
        homeFragment.R1(new Intent(homeFragment.q(), VahanMainViewScreen.class));
    }

    /* access modifiers changed from: private */
    public static final void X6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", homeFragment.C5().getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-duplicate-dl.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void Y5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 != null) {
            ka.c.f13158a.l(q10);
        }
        AppCompatEditText appCompatEditText = homeFragment.f8469u0;
        Spinner spinner = null;
        if (appCompatEditText == null) {
            l.v("Search_bar");
            appCompatEditText = null;
        }
        String valueOf = String.valueOf(appCompatEditText.getText());
        j q11 = homeFragment.q();
        if (q11 == null || !ka.c.f13158a.e(q11)) {
            Spinner spinner2 = homeFragment.f8436j0;
            if (spinner2 == null) {
                l.v("spinner");
            } else {
                spinner = spinner2;
            }
            if (spinner.getSelectedItemPosition() == 1) {
                j q12 = homeFragment.q();
                if (q12 != null && com.nic.mparivahan.a.f9624a.a(q12)) {
                    homeFragment.L7(String.valueOf(homeFragment.h4().getText()), 1);
                    return;
                }
            } else {
                j q13 = homeFragment.q();
                if (q13 != null && com.nic.mparivahan.a.f9624a.a(q13)) {
                    homeFragment.L7(valueOf, 2);
                    return;
                }
            }
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        p.a aVar = ii.p.f24363a;
        j q14 = homeFragment.q();
        l.c(q14);
        aVar.c(q14);
    }

    /* access modifiers changed from: private */
    public static final void Y6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", homeFragment.F5().getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-registration-particulars.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void Z5(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.f8474v2 = false;
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        j q11 = homeFragment.q();
        if (q11 == null || !ka.c.f13158a.e(q11)) {
            homeFragment.U4().setVisibility(8);
            homeFragment.D4().setVisibility(8);
            homeFragment.O5().setVisibility(8);
            homeFragment.P5().setVisibility(8);
            homeFragment.f5().setVisibility(8);
            homeFragment.t4().setVisibility(8);
            homeFragment.N3().setVisibility(8);
            homeFragment.x4().setVisibility(8);
            homeFragment.G4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            homeFragment.F4().setBackgroundResource(R.color.white);
            homeFragment.C4().setBackgroundResource(R.color.white);
            homeFragment.E4().setBackgroundResource(R.color.white);
            homeFragment.H4().setBackgroundResource(R.color.white);
            homeFragment.y5().setTextColor(Color.parseColor("#FFFFFF"));
            homeFragment.w5().setTextColor(Color.parseColor("#000000"));
            homeFragment.v5().setTextColor(Color.parseColor("#000000"));
            homeFragment.x5().setTextColor(Color.parseColor("#000000"));
            homeFragment.z5().setTextColor(Color.parseColor("#000000"));
            homeFragment.u4().setImageResource(R.drawable.dms_docs);
            homeFragment.w4().setImageResource(R.drawable.ic_transport_selected);
            homeFragment.v4().setImageResource(R.drawable.ic_informational_services);
            TextView textView = null;
            homeFragment.v4().setColorFilter((ColorFilter) null);
            homeFragment.u4().setColorFilter((ColorFilter) null);
            ImageView imageView = homeFragment.f8442l0;
            if (imageView == null) {
                l.v("citizen_image");
                imageView = null;
            }
            imageView.setColorFilter((ColorFilter) null);
            homeFragment.A4().setVisibility(0);
            TextView textView2 = homeFragment.f8472v0;
            if (textView2 == null) {
                l.v("txt_process");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            homeFragment.J5().setVisibility(8);
            String f10 = new ld.e(homeFragment.q()).f();
            if (f10.equals("0")) {
                Log.e("State", "1");
                homeFragment.c5().show();
                homeFragment.M5().p();
                return;
            }
            try {
                Log.e("State", "2");
                Object j10 = new i7.d().j(f10, StateMaster.class);
                l.e(j10, "fromJson(...)");
                homeFragment.x9((StateMaster) j10);
            } catch (Exception unused) {
            }
        } else {
            p.a aVar = ii.p.f24363a;
            j q12 = homeFragment.q();
            l.c(q12);
            aVar.c(q12);
        }
    }

    /* access modifiers changed from: private */
    public static final void Z6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", homeFragment.D5().getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-hpt-continuation.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void Z9(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", homeFragment.G5().getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-replacement.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void b6(View view) {
    }

    /* access modifiers changed from: private */
    public static final void b7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", homeFragment.A5().getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-change-of-address.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void c6(View view) {
    }

    /* access modifiers changed from: private */
    public static final void c7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-extract.html");
        intent.putExtra("title", homeFragment.B5().getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void d6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_virtual_rc");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/virtual-rc-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void d7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("Renewal of DL", "1");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void e6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$virtual_dl_textview");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/virtual-dl-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void e7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("Change of Address in DL", VContant.DUPLICATE_RC_PURPOSE_CODE);
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void f6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_shared_rc");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/shared-received-virtual-rc-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void f7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("Issue of Duplicate DL", "2");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void g6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_rcv_rc");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/shared-received-virtual-rc-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void g7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("Issue of Duplicate DL", "2");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void h6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_rc_search");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/search-rc-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void h7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("Change of Address in DL", VContant.DUPLICATE_RC_PURPOSE_CODE);
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void i6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_dl_search");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/search-dl-info.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void i7(View view) {
    }

    /* access modifiers changed from: private */
    public static final void j6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_dl_search");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-learner-dl.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void j7(HomeFragment homeFragment, StateMaster stateMaster) {
        l.f(homeFragment, "this$0");
        homeFragment.c5().dismiss();
        try {
            if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                homeFragment.r5().setVisibility(0);
                homeFragment.c5().dismiss();
                homeFragment.t5().setText(homeFragment.z4().b(v9.f.f17510a.w(), "Following services are allowed for your current state"));
                ArrayList<State> states = stateMaster.getStates();
                l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>");
                Collections.sort(states);
                if (!states.get(0).getStateCode().equals("0")) {
                    states.add(0, new State("Select State", "0", false, false, 1));
                    if (states.size() > 1) {
                        states.add(states.get(1));
                    }
                }
                homeFragment.s5().setAdapter(new q8.a(homeFragment.q(), states));
                String q10 = homeFragment.p5().q();
                int size = states.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (p.o(q10, states.get(i10).getStateCode(), true)) {
                        homeFragment.s5().setSelection(i10);
                        return;
                    }
                }
                return;
            }
            homeFragment.r5().setVisibility(8);
            homeFragment.c5().dismiss();
            ArrayList arrayList = new ArrayList();
            Collections.sort(arrayList);
            arrayList.add(0, new State("Select State", "0", false, false, 1));
            homeFragment.s5().setAdapter(new q8.a(homeFragment.q(), arrayList));
        } catch (Exception e10) {
            homeFragment.r5().setVisibility(8);
            homeFragment.c5().dismiss();
            e10.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            homeFragment.s5().setAdapter(new q8.a(homeFragment.q(), arrayList2));
        }
    }

    /* access modifiers changed from: private */
    public static final void k6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-permanent-dl.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void k7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), DlServicesMainScreen.class);
        homeFragment.q9(new f(homeFragment.q()));
        homeFragment.m5().r("DL Extract", VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void l6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_renewal");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-renewal-dl.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void l7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), DLServiceHome.class));
    }

    /* access modifiers changed from: private */
    public static final void m6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-additional-class.html");
        intent.putExtra("title", homeFragment.C5().getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void m7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.o5().setVisibility(8);
        homeFragment.B4().setVisibility(0);
        homeFragment.m4().setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void n6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_idp");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-international.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void n7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), VehicleServiceHome.class));
    }

    /* access modifiers changed from: private */
    public static final void o6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-fees.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void o7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
        } else {
            homeFragment.R1(new Intent(homeFragment.q(), CreateRCAlertsScreen.class));
        }
    }

    /* access modifiers changed from: private */
    public static final void p6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_dup_rc");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-duplicate-rc.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void p7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
        } else {
            homeFragment.R1(new Intent(homeFragment.q(), NewDlSearch.class));
        }
    }

    /* access modifiers changed from: private */
    public static final void q6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_noc");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-no-objection.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void q7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        boolean z62 = homeFragment.z6();
        homeFragment.R7("0");
        if (z62) {
            homeFragment.R1(new Intent(homeFragment.q(), TrafficReportVioActivity.class));
        } else {
            homeFragment.F7("jn");
        }
    }

    /* access modifiers changed from: private */
    public static final void r6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_coa");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-address-change.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void r7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        j q10 = homeFragment.q();
        if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
            Toast.makeText(homeFragment.q(), homeFragment.z4().b("label_log_check_internet", homeFragment.e0(R.string.kindly_check_your_internet_connection)), 0).show();
            return;
        }
        boolean z62 = homeFragment.z6();
        homeFragment.R7("1");
        if (z62) {
            homeFragment.R1(new Intent(homeFragment.q(), AccidentReportActivity.class));
        } else {
            homeFragment.F7("jn");
        }
    }

    /* access modifiers changed from: private */
    public static final void s6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_hp_end");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/rc-info-hp-endorsement.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void s7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), SearchChallanOnlineActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void t6(HomeFragment homeFragment, cm.u uVar, View view) {
        l.f(homeFragment, "this$0");
        l.f(uVar, "$txt_notification");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/ministry-advisory.html");
        intent.putExtra("title", ((TextView) uVar.f20234e).getText().toString());
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void t7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), PaymentSearchChallan.class));
    }

    /* access modifiers changed from: private */
    public static final void u6(View view) {
    }

    /* access modifiers changed from: private */
    public static final void u7(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        homeFragment.R1(new Intent(homeFragment.q(), ChallanViewMoreActivity.class));
    }

    /* access modifiers changed from: private */
    public static final void v6(View view) {
    }

    /* access modifiers changed from: private */
    public static final void v7(HomeFragment homeFragment, RcModelsDet rcModelsDet) {
        l.f(homeFragment, "this$0");
        homeFragment.c5().dismiss();
        try {
            if (p.o(rcModelsDet.getStatusCode().toString(), "NP001", true)) {
                i.a aVar = yc.i.f18692a;
                j D12 = homeFragment.D1();
                l.e(D12, "requireActivity(...)");
                if (aVar.l(D12, rcModelsDet.getNrvDetails()) > 0) {
                    homeFragment.Q3().k(homeFragment.f8440k1);
                }
                j q10 = homeFragment.q();
                if (q10 != null) {
                    homeFragment.Y9(q10, homeFragment.z4().b(v9.f.f17510a.R0(), "Vehicle alert successfully updated!"));
                }
            }
        } catch (Exception unused) {
            homeFragment.c5().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void w6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-additional-class.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void w7(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        homeFragment.r5().setVisibility(8);
        homeFragment.I5().setVisibility(8);
        if (str.toString().equals(v9.d.f17494a.u())) {
            homeFragment.R4().h();
        } else {
            homeFragment.c5().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void x6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-additional-class.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void x7(HomeFragment homeFragment, MyRcDeletResponse myRcDeletResponse) {
        Toast makeText;
        l.f(homeFragment, "this$0");
        try {
            homeFragment.c5().dismiss();
            if (!p.o(myRcDeletResponse.getStatusCode(), "VTLD001", true)) {
                makeText = p.o(myRcDeletResponse.getStatusCode(), "VTLD007", true) ? Toast.makeText(homeFragment.q(), "Unable to delet the Virtual RC, Please try after some times", 1) : Toast.makeText(homeFragment.q(), "Unable to delete the Virtual RC, Please try after some times", 1);
            } else {
                try {
                    homeFragment.O4();
                    throw null;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    makeText = Toast.makeText(homeFragment.q(), "Unable to delet the Virtual RC, Please try after some times", 1);
                }
            }
            makeText.show();
        } catch (Exception e11) {
            homeFragment.c5().dismiss();
            e11.printStackTrace();
            Toast.makeText(homeFragment.q(), "Unable to delet the Virtual RC, Please try after some times", 1).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void y6(HomeFragment homeFragment, View view) {
        l.f(homeFragment, "this$0");
        Intent intent = new Intent(homeFragment.q(), InformationalWebView.class);
        intent.putExtra("URL", hc.a.f12073a.g() + v9.d.f17494a.q(homeFragment.q()) + "/dl-info-additional-class.html");
        homeFragment.R1(intent);
    }

    /* access modifiers changed from: private */
    public static final void y7(HomeFragment homeFragment, EnableServiceResponse enableServiceResponse) {
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
            if (p.o(enableServiceResponse.getStatusCode(), "MSTR001", true)) {
                Intent intent = new Intent(homeFragment.w(), VehicleServiceHomeNew.class);
                intent.putExtra("state_code", homeFragment.p5().q());
                homeFragment.R1(intent);
            }
        } catch (Exception unused) {
        }
    }

    private final boolean z6() {
        return androidx.core.content.a.a(D1(), "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* access modifiers changed from: private */
    public static final void z7(HomeFragment homeFragment, String str) {
        l.f(homeFragment, "this$0");
        try {
            if (homeFragment.c5().isShowing()) {
                homeFragment.c5().dismiss();
            }
        } catch (Exception unused) {
        }
    }

    public final LinearLayout A4() {
        LinearLayout linearLayout = this.S0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("layout_options");
        return null;
    }

    public final TextView A5() {
        TextView textView = this.E2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_coa_dl");
        return null;
    }

    public final void A6(Context context, View view) {
        l.f(context, "context");
        l.f(view, "root");
        y5().setText(z4().b("trans_services", context.getString(R.string.trans_services)));
        v5().setText(z4().b("my_docs", context.getString(R.string.my_docs)));
        x5().setText(z4().b("inf_Serv", context.getString(R.string.inf_Serv)));
        w5().setText(z4().b("txt_md", context.getString(R.string.txt_md)));
        z5().setText(z4().b("label_citizen_sentinel", context.getString(R.string.citizen_sentinel)));
        View findViewById = view.findViewById(R.id.label_pull_rc_and_dl);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = view.findViewById(R.id.label_vrc_and_dl);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(z4().b("label_pull_rc_and_dl", "Please use the facility available in this app to pull your RC/DL from Transport Repository."));
        ((TextView) findViewById2).setText(z4().b("label_vrc_and_dl", "You can place your Vehicle Registration Certificates and Driving Licence."));
        View findViewById3 = view.findViewById(R.id.welcome);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = view.findViewById(R.id.dl_related_service);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z4().b("welcome", "Welcome"));
        J5().setText(z4().b("label_vehicle_related", "Vehicle Services"));
        Y3().setText(z4().b("label_challan_related", "Challan Services"));
        ((TextView) findViewById4).setText(z4().b("label_driving_licence_related", "Driving Licence Services"));
    }

    public final void A8(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.F0 = imageView;
    }

    public final void A9(TextView textView) {
        l.f(textView, "<set-?>");
        this.V1 = textView;
    }

    public final LinearLayout B4() {
        LinearLayout linearLayout = this.G1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("licence_viewmore");
        return null;
    }

    public final TextView B5() {
        TextView textView = this.G2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_dl_extract");
        return null;
    }

    public final void B8(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.C0 = imageView;
    }

    public final void B9(TextView textView) {
        l.f(textView, "<set-?>");
        this.H2 = textView;
    }

    public void C0(Bundle bundle) {
        super.C0(bundle);
        u9(new g(q()));
        g9(new ProgressDialog(q()));
        c5().setMessage("Please wait...");
        c5().setCancelable(false);
        c5().setCanceledOnTouchOutside(false);
    }

    public final LinearLayout C4() {
        LinearLayout linearLayout = this.f8443l1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llCitizen");
        return null;
    }

    public final TextView C5() {
        TextView textView = this.C2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_dup_dl");
        return null;
    }

    public final void C8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8458q1 = linearLayout;
    }

    public final void C9(TextView textView) {
        l.f(textView, "<set-?>");
        this.I0 = textView;
    }

    public final LinearLayout D4() {
        LinearLayout linearLayout = this.f8418b1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llDashboardDl");
        return null;
    }

    public final TextView D5() {
        TextView textView = this.B2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_hc");
        return null;
    }

    public final void D7(Context context, String str) {
        Dialog dialog = new Dialog(D1());
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(z4().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(z4().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new m2(dialog));
        dialog.show();
    }

    public final void D8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.C1 = linearLayout;
    }

    public final void D9(TextView textView) {
        l.f(textView, "<set-?>");
        this.H0 = textView;
    }

    public final LinearLayout E4() {
        LinearLayout linearLayout = this.B0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llInformation");
        return null;
    }

    public final TextView E5() {
        TextView textView = this.f8486z2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_ht");
        return null;
    }

    public final void E8(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8483y2 = cVar;
    }

    public final void E9(TextView textView) {
        l.f(textView, "<set-?>");
        this.J0 = textView;
    }

    public final LinearLayout F4() {
        LinearLayout linearLayout = this.A0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llMyDocs");
        return null;
    }

    public final TextView F5() {
        TextView textView = this.A2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_rc_pert");
        return null;
    }

    public final void F8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.S0 = linearLayout;
    }

    public final void F9(TextView textView) {
        l.f(textView, "<set-?>");
        this.G0 = textView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01b7 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01bd A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01d8 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01ee A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0204 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x021a A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0230 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0246 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x025c A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0272 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0288 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x029e A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02c0 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02d6 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x02ec A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0302 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0318 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x032e A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0344 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0527 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x053d A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0553 A[Catch:{ Exception -> 0x0094 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0572  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x057e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0594  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View G0(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            java.lang.String r9 = "Enrolled States"
            java.lang.String r0 = "findViewById(...)"
            java.lang.String r1 = "requireContext(...)"
            java.lang.String r2 = "inflater"
            cm.l.f(r7, r2)
            r2 = 2131558791(0x7f0d0187, float:1.8742908E38)
            r3 = 0
            android.view.View r7 = r7.inflate(r2, r8, r3)
            ld.e r8 = new ld.e     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r2 = r6.q()     // Catch:{ Exception -> 0x0094 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.D1()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = "requireActivity(...)"
            cm.l.e(r8, r2)     // Catch:{ Exception -> 0x0094 }
            r6.N8(r8)     // Catch:{ Exception -> 0x0094 }
            ld.c r8 = new ld.c     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r6.I4()     // Catch:{ Exception -> 0x0094 }
            r8.<init>(r2)     // Catch:{ Exception -> 0x0094 }
            r6.E8(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.DB.DatabaseHelper r8 = com.nic.mparivahan.DB.DatabaseHelper.A0(r8)     // Catch:{ Exception -> 0x0094 }
            java.lang.String r2 = "getInstance(...)"
            cm.l.e(r8, r2)     // Catch:{ Exception -> 0x0094 }
            r6.e8(r8)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.RC.RcInterface.RcService$a r8 = com.nic.mparivahan.RC.RcInterface.RcService.f9484a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r6.E1()     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.RC.RcInterface.RcService r8 = r8.c(r2)     // Catch:{ Exception -> 0x0094 }
            r6.R8(r8)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface$a r8 = com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface.f8381a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r6.E1()     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface r8 = r8.c(r2)     // Catch:{ Exception -> 0x0094 }
            r6.f8432h2 = r8     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Welcome.VersionService$a r8 = com.nic.mparivahan.Welcome.VersionService.f21650a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r6.E1()     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Welcome.VersionService r8 = r8.c(r2)     // Catch:{ Exception -> 0x0094 }
            r6.f8435i2 = r8     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dl.DlInterface.DlService$a r8 = com.nic.mparivahan.Dl.DlInterface.DlService.f8615a     // Catch:{ Exception -> 0x0094 }
            android.content.Context r2 = r6.E1()     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r2, r1)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dl.DlInterface.DlService r8 = r8.c(r2)     // Catch:{ Exception -> 0x0094 }
            r6.O8(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.u0 r8 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x0094 }
            li.b r1 = new li.b     // Catch:{ Exception -> 0x0094 }
            ji.c r2 = new ji.c     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Welcome.VersionService r4 = r6.f8435i2     // Catch:{ Exception -> 0x0094 }
            r5 = 0
            if (r4 != 0) goto L_0x0097
            java.lang.String r4 = "retrofitService"
            cm.l.v(r4)     // Catch:{ Exception -> 0x0094 }
            r4 = r5
            goto L_0x0097
        L_0x0094:
            r8 = move-exception
            goto L_0x0569
        L_0x0097:
            r2.<init>(r4)     // Catch:{ Exception -> 0x0094 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0094 }
            r8.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<li.e> r1 = li.e.class
            androidx.lifecycle.t0 r8 = r8.a(r1)     // Catch:{ Exception -> 0x0094 }
            li.e r8 = (li.e) r8     // Catch:{ Exception -> 0x0094 }
            r6.U9(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.u0 r8 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x0094 }
            li.d r1 = new li.d     // Catch:{ Exception -> 0x0094 }
            ji.b r2 = new ji.b     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Welcome.NapixService r4 = r6.f8433i0     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0094 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0094 }
            r8.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<li.c> r1 = li.c.class
            androidx.lifecycle.t0 r8 = r8.a(r1)     // Catch:{ Exception -> 0x0094 }
            li.c r8 = (li.c) r8     // Catch:{ Exception -> 0x0094 }
            r6.V8(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.u0 r8 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x0094 }
            za.b r1 = new za.b     // Catch:{ Exception -> 0x0094 }
            ya.a r2 = new ya.a     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dl.DlInterface.DlService r4 = r6.J4()     // Catch:{ Exception -> 0x0094 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0094 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0094 }
            r8.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<za.a> r1 = za.a.class
            androidx.lifecycle.t0 r8 = r8.a(r1)     // Catch:{ Exception -> 0x0094 }
            za.a r8 = (za.a) r8     // Catch:{ Exception -> 0x0094 }
            r6.P8(r8)     // Catch:{ Exception -> 0x0094 }
            r8 = 2131362910(0x7f0a045e, float:1.8345614E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8     // Catch:{ Exception -> 0x0094 }
            r6.l9(r8)     // Catch:{ Exception -> 0x0094 }
            r8 = 2131362912(0x7f0a0460, float:1.8345618E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8     // Catch:{ Exception -> 0x0094 }
            r6.n9(r8)     // Catch:{ Exception -> 0x0094 }
            r8 = 2131363852(0x7f0a080c, float:1.8347525E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8     // Catch:{ Exception -> 0x0094 }
            r6.m9(r8)     // Catch:{ Exception -> 0x0094 }
            r8 = 2131362343(0x7f0a0227, float:1.8344464E38)
            android.view.View r8 = r7.findViewById(r8)     // Catch:{ Exception -> 0x0094 }
            cm.l.e(r8, r0)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8     // Catch:{ Exception -> 0x0094 }
            r6.a8(r8)     // Catch:{ Exception -> 0x0094 }
            r6.Q5(r7)     // Catch:{ Exception -> 0x0094 }
            r6.a6(r7)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0135
            v9.e$a r0 = v9.e.f17509a     // Catch:{ Exception -> 0x0094 }
            cm.l.c(r7)     // Catch:{ Exception -> 0x0094 }
            r0.p1(r8, r7)     // Catch:{ Exception -> 0x0094 }
        L_0x0135:
            android.widget.TextView r8 = r6.p4()     // Catch:{ Exception -> 0x0094 }
            r8.setText(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.p4()     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r0 = r6.p4()     // Catch:{ Exception -> 0x0094 }
            int r0 = r0.getPaintFlags()     // Catch:{ Exception -> 0x0094 }
            r1 = 8
            r0 = r0 | r1
            r8.setPaintFlags(r0)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.o4()     // Catch:{ Exception -> 0x0094 }
            r8.setText(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.o4()     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r9 = r6.o4()     // Catch:{ Exception -> 0x0094 }
            int r9 = r9.getPaintFlags()     // Catch:{ Exception -> 0x0094 }
            r9 = r9 | r1
            r8.setPaintFlags(r9)     // Catch:{ Exception -> 0x0094 }
            ld.g r8 = r6.p5()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = r8.p()     // Catch:{ Exception -> 0x0094 }
            int r8 = r8.length()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r9 = "userIv"
            if (r8 <= 0) goto L_0x019f
            ld.g r8 = r6.p5()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = r8.p()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r0 = "0"
            boolean r8 = cm.l.a(r8, r0)     // Catch:{ Exception -> 0x0094 }
            if (r8 != 0) goto L_0x019f
            ld.g r8 = r6.p5()     // Catch:{ Exception -> 0x0094 }
            java.lang.String r8 = r8.p()     // Catch:{ Exception -> 0x0094 }
            android.graphics.Bitmap r8 = com.nic.mparivahan.dlservices.utilities.e.c(r8)     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x01ad
            com.nic.mparivahan.dlservices.widget.CircleImageView r0 = r6.f8423d2     // Catch:{ Exception -> 0x0094 }
            if (r0 != 0) goto L_0x019b
            cm.l.v(r9)     // Catch:{ Exception -> 0x0094 }
            r0 = r5
        L_0x019b:
            r0.setImageBitmap(r8)     // Catch:{ Exception -> 0x0094 }
            goto L_0x01ad
        L_0x019f:
            com.nic.mparivahan.dlservices.widget.CircleImageView r8 = r6.f8423d2     // Catch:{ Exception -> 0x0094 }
            if (r8 != 0) goto L_0x01a7
            cm.l.v(r9)     // Catch:{ Exception -> 0x0094 }
            r8 = r5
        L_0x01a7:
            r9 = 2131230862(0x7f08008e, float:1.8077789E38)
            r8.setImageResource(r9)     // Catch:{ Exception -> 0x0094 }
        L_0x01ad:
            androidx.lifecycle.u0 r8 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x0094 }
            qa.a r9 = new qa.a     // Catch:{ Exception -> 0x0094 }
            oa.a r0 = new oa.a     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.EnabledServices.Interfaces.ESInterface r2 = r6.f8432h2     // Catch:{ Exception -> 0x0094 }
            if (r2 != 0) goto L_0x01bd
            java.lang.String r2 = "mESInterface"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0094 }
            goto L_0x01be
        L_0x01bd:
            r5 = r2
        L_0x01be:
            r0.<init>(r5)     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0094 }
            r8.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r9)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<qa.b> r9 = qa.b.class
            androidx.lifecycle.t0 r8 = r8.a(r9)     // Catch:{ Exception -> 0x0094 }
            qa.b r8 = (qa.b) r8     // Catch:{ Exception -> 0x0094 }
            r6.Q8(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x01e8
            li.e r9 = r6.M5()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.o()     // Catch:{ Exception -> 0x0094 }
            ta.l r0 = new ta.l     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x01e8:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x01fe
            li.e r9 = r6.M5()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.q()     // Catch:{ Exception -> 0x0094 }
            ta.d r0 = new ta.d     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x01fe:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0214
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.t()     // Catch:{ Exception -> 0x0094 }
            ta.p r0 = new ta.p     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0214:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x022a
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.w()     // Catch:{ Exception -> 0x0094 }
            ta.b0 r0 = new ta.b0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x022a:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0240
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.n()     // Catch:{ Exception -> 0x0094 }
            ta.n0 r0 = new ta.n0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0240:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0256
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.q()     // Catch:{ Exception -> 0x0094 }
            ta.q0 r0 = new ta.q0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0256:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x026c
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.o()     // Catch:{ Exception -> 0x0094 }
            ta.r0 r0 = new ta.r0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x026c:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0282
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.p()     // Catch:{ Exception -> 0x0094 }
            ta.t0 r0 = new ta.t0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0282:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0298
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.r()     // Catch:{ Exception -> 0x0094 }
            ta.u0 r0 = new ta.u0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0298:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x02ae
            qa.b r9 = r6.L4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.s()     // Catch:{ Exception -> 0x0094 }
            ta.v0 r0 = new ta.v0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x02ae:
            android.widget.Spinner r8 = r6.s5()     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$b r9 = new com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$b     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnItemSelectedListener(r9)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x02d0
            li.e r9 = r6.M5()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.m()     // Catch:{ Exception -> 0x0094 }
            ta.w r0 = new ta.w     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x02d0:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x02e6
            li.c r9 = r6.R4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.g()     // Catch:{ Exception -> 0x0094 }
            ta.h0 r0 = new ta.h0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x02e6:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x02fc
            li.c r9 = r6.R4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.i()     // Catch:{ Exception -> 0x0094 }
            ta.s0 r0 = new ta.s0     // Catch:{ Exception -> 0x0094 }
            r0.<init>()     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x02fc:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0312
            li.e r9 = r6.M5()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.h()     // Catch:{ Exception -> 0x0094 }
            ta.d1 r0 = new ta.d1     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0312:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0328
            li.e r9 = r6.M5()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.i()     // Catch:{ Exception -> 0x0094 }
            ta.o1 r0 = new ta.o1     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0328:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x033e
            za.a r9 = r6.K4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.n()     // Catch:{ Exception -> 0x0094 }
            ta.z1 r0 = new ta.z1     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x033e:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0354
            za.a r9 = r6.K4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.o()     // Catch:{ Exception -> 0x0094 }
            ta.k2 r0 = new ta.k2     // Catch:{ Exception -> 0x0094 }
            r0.<init>()     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0354:
            android.widget.LinearLayout r8 = r6.b5()     // Catch:{ Exception -> 0x0094 }
            ta.n2 r9 = new ta.n2     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.r4()     // Catch:{ Exception -> 0x0094 }
            ta.b r9 = new ta.b     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.q4()     // Catch:{ Exception -> 0x0094 }
            ta.c r9 = new ta.c     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.l4()     // Catch:{ Exception -> 0x0094 }
            ta.e r9 = new ta.e     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.e4()     // Catch:{ Exception -> 0x0094 }
            ta.f r9 = new ta.f     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.d4()     // Catch:{ Exception -> 0x0094 }
            ta.g r9 = new ta.g     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.n4()     // Catch:{ Exception -> 0x0094 }
            ta.h r9 = new ta.h     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.d5()     // Catch:{ Exception -> 0x0094 }
            ta.i r9 = new ta.i     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.s4()     // Catch:{ Exception -> 0x0094 }
            ta.j r9 = new ta.j     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.j4()     // Catch:{ Exception -> 0x0094 }
            ta.k r9 = new ta.k     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.Z3()     // Catch:{ Exception -> 0x0094 }
            ta.m r9 = new ta.m     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.g4()     // Catch:{ Exception -> 0x0094 }
            ta.n r9 = new ta.n     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.k4()     // Catch:{ Exception -> 0x0094 }
            ta.o r9 = new ta.o     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.T4()     // Catch:{ Exception -> 0x0094 }
            ta.q r9 = new ta.q     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.S4()     // Catch:{ Exception -> 0x0094 }
            ta.r r9 = new ta.r     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.m4()     // Catch:{ Exception -> 0x0094 }
            ta.s r9 = new ta.s     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.a4()     // Catch:{ Exception -> 0x0094 }
            ta.t r9 = new ta.t     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.y4()     // Catch:{ Exception -> 0x0094 }
            ta.u r9 = new ta.u     // Catch:{ Exception -> 0x0094 }
            r9.<init>()     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.i4()     // Catch:{ Exception -> 0x0094 }
            ta.v r9 = new ta.v     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.B4()     // Catch:{ Exception -> 0x0094 }
            ta.x r9 = new ta.x     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.N5()     // Catch:{ Exception -> 0x0094 }
            ta.y r9 = new ta.y     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.D4()     // Catch:{ Exception -> 0x0094 }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.O5()     // Catch:{ Exception -> 0x0094 }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.P5()     // Catch:{ Exception -> 0x0094 }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = r6.f5()     // Catch:{ Exception -> 0x0094 }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x0094 }
            android.widget.TextView r8 = r6.U4()     // Catch:{ Exception -> 0x0094 }
            r8.setVisibility(r1)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.K5()     // Catch:{ Exception -> 0x0094 }
            ta.z r9 = new ta.z     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.Q4()     // Catch:{ Exception -> 0x0094 }
            ta.a0 r9 = new ta.a0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.P4()     // Catch:{ Exception -> 0x0094 }
            ta.c0 r9 = new ta.c0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.k5()     // Catch:{ Exception -> 0x0094 }
            ta.d0 r9 = new ta.d0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.l5()     // Catch:{ Exception -> 0x0094 }
            ta.e0 r9 = new ta.e0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.X3()     // Catch:{ Exception -> 0x0094 }
            ta.f0 r9 = new ta.f0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.V3()     // Catch:{ Exception -> 0x0094 }
            ta.g0 r9 = new ta.g0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            android.widget.LinearLayout r8 = r6.U3()     // Catch:{ Exception -> 0x0094 }
            ta.i0 r9 = new ta.i0     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r8.setOnClickListener(r9)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = r6.f5()     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r0 = r6.q()     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r0, r3, r3)     // Catch:{ Exception -> 0x0094 }
            r8.setLayoutManager(r9)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = r6.e5()     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r0 = r6.q()     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r0, r3, r3)     // Catch:{ Exception -> 0x0094 }
            r8.setLayoutManager(r9)     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.RecyclerView r8 = r6.O3()     // Catch:{ Exception -> 0x0094 }
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r0 = r6.q()     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r0, r3, r3)     // Catch:{ Exception -> 0x0094 }
            r8.setLayoutManager(r9)     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.u0 r8 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x0094 }
            cd.d r9 = new cd.d     // Catch:{ Exception -> 0x0094 }
            bd.b r0 = new bd.b     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.RC.RcInterface.RcService r1 = r6.M4()     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0094 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0094 }
            r8.<init>((androidx.lifecycle.x0) r6, (androidx.lifecycle.u0.b) r9)     // Catch:{ Exception -> 0x0094 }
            java.lang.Class<cd.c> r9 = cd.c.class
            androidx.lifecycle.t0 r8 = r8.a(r9)     // Catch:{ Exception -> 0x0094 }
            cd.c r8 = (cd.c) r8     // Catch:{ Exception -> 0x0094 }
            r6.S8(r8)     // Catch:{ Exception -> 0x0094 }
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x0537
            cd.c r9 = r6.N4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.p()     // Catch:{ Exception -> 0x0094 }
            ta.j0 r0 = new ta.j0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x0537:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x054d
            cd.c r9 = r6.N4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.z()     // Catch:{ Exception -> 0x0094 }
            ta.k0 r0 = new ta.k0     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r0)     // Catch:{ Exception -> 0x0094 }
        L_0x054d:
            androidx.fragment.app.j r8 = r6.q()     // Catch:{ Exception -> 0x0094 }
            if (r8 == 0) goto L_0x056c
            cd.c r9 = r6.N4()     // Catch:{ Exception -> 0x0094 }
            androidx.lifecycle.a0 r9 = r9.A()     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$c r0 = new com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$c     // Catch:{ Exception -> 0x0094 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0094 }
            com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$e r1 = new com.nic.mparivahan.Dashboard.ui.Home.HomeFragment$e     // Catch:{ Exception -> 0x0094 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0094 }
            r9.g(r8, r1)     // Catch:{ Exception -> 0x0094 }
            goto L_0x056c
        L_0x0569:
            r8.printStackTrace()
        L_0x056c:
            android.content.Context r8 = r6.w()
            if (r8 == 0) goto L_0x0578
            cm.l.c(r7)
            r6.A6(r8, r7)
        L_0x0578:
            androidx.fragment.app.j r8 = r6.q()
            if (r8 == 0) goto L_0x058e
            qa.b r9 = r6.L4()
            androidx.lifecycle.a0 r9 = r9.u()
            ta.l0 r0 = new ta.l0
            r0.<init>(r6)
            r9.g(r8, r0)
        L_0x058e:
            androidx.fragment.app.j r8 = r6.q()
            if (r8 == 0) goto L_0x05a4
            qa.b r9 = r6.L4()
            androidx.lifecycle.a0 r9 = r9.v()
            ta.m0 r0 = new ta.m0
            r0.<init>(r6)
            r9.g(r8, r0)
        L_0x05a4:
            androidx.fragment.app.j r8 = r6.q()
            if (r8 == 0) goto L_0x05ba
            qa.b r9 = r6.L4()
            androidx.lifecycle.a0 r9 = r9.l()
            ta.o0 r0 = new ta.o0
            r0.<init>(r6)
            r9.g(r8, r0)
        L_0x05ba:
            androidx.fragment.app.j r8 = r6.q()
            if (r8 == 0) goto L_0x05d0
            qa.b r9 = r6.L4()
            androidx.lifecycle.a0 r9 = r9.m()
            ta.p0 r0 = new ta.p0
            r0.<init>(r6)
            r9.g(r8, r0)
        L_0x05d0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment.G0(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final LinearLayout G4() {
        LinearLayout linearLayout = this.f8484z0;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("llTransportServices");
        return null;
    }

    public final TextView G5() {
        TextView textView = this.D2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_replace_dl");
        return null;
    }

    public final void G8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.G1 = linearLayout;
    }

    public final void G9(TextView textView) {
        l.f(textView, "<set-?>");
        this.K0 = textView;
    }

    public final LinearLayout H4() {
        LinearLayout linearLayout = this.f8476w1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("ll_citizen_sentinel");
        return null;
    }

    public final TextView H5() {
        TextView textView = this.F2;
        if (textView != null) {
            return textView;
        }
        l.v("txt_too");
        return null;
    }

    public final void H8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8443l1 = linearLayout;
    }

    public final void H9(TextView textView) {
        l.f(textView, "<set-?>");
        this.E2 = textView;
    }

    public final Context I4() {
        Context context = this.f8447m2;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final LinearLayout I5() {
        LinearLayout linearLayout = this.X1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("vahan_linear");
        return null;
    }

    public final void I8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8418b1 = linearLayout;
    }

    public final void I9(TextView textView) {
        l.f(textView, "<set-?>");
        this.G2 = textView;
    }

    public final DlService J4() {
        DlService dlService = this.f8477w2;
        if (dlService != null) {
            return dlService;
        }
        l.v("mDlService");
        return null;
    }

    public final TextView J5() {
        TextView textView = this.Y1;
        if (textView != null) {
            return textView;
        }
        l.v("vehicle_title");
        return null;
    }

    public final void J8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.B0 = linearLayout;
    }

    public final void J9(TextView textView) {
        l.f(textView, "<set-?>");
        this.C2 = textView;
    }

    public final za.a K4() {
        za.a aVar = this.f8450n2;
        if (aVar != null) {
            return aVar;
        }
        l.v("mDlViewModel");
        return null;
    }

    public final LinearLayout K5() {
        LinearLayout linearLayout = this.f8473v1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("vehicle_viewmore");
        return null;
    }

    public final void K8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.A0 = linearLayout;
    }

    public final void K9(TextView textView) {
        l.f(textView, "<set-?>");
        this.B2 = textView;
    }

    public final qa.b L4() {
        qa.b bVar = this.f8429g2;
        if (bVar != null) {
            return bVar;
        }
        l.v("mESViewModel");
        return null;
    }

    public final LinearLayout L5() {
        LinearLayout linearLayout = this.L1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("verify_payment_linear");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (km.q.F(r11, " ", false, 2, (java.lang.Object) null) != false) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void L7(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "value"
            cm.l.f(r10, r0)
            r0 = 3
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r11 != r4) goto L_0x00f0
            int r11 = r10.length()
            r5 = 10
            if (r11 >= r5) goto L_0x002d
            androidx.fragment.app.j r10 = r9.q()
            ld.c r11 = r9.z4()
            java.lang.String r0 = "dl_validation"
            java.lang.String r1 = "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed"
            java.lang.String r11 = r11.b(r0, r1)
        L_0x0024:
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r11, r3)
            r10.show()
            goto L_0x017a
        L_0x002d:
            int r11 = r10.length()
            if (r11 < r5) goto L_0x017a
            int r11 = r10.length()
            int r11 = r11 - r4
            r5 = r3
            r6 = r5
        L_0x003a:
            r7 = 32
            if (r5 > r11) goto L_0x005f
            if (r6 != 0) goto L_0x0042
            r8 = r5
            goto L_0x0043
        L_0x0042:
            r8 = r11
        L_0x0043:
            char r8 = r10.charAt(r8)
            int r8 = cm.l.h(r8, r7)
            if (r8 > 0) goto L_0x004f
            r8 = r4
            goto L_0x0050
        L_0x004f:
            r8 = r3
        L_0x0050:
            if (r6 != 0) goto L_0x0059
            if (r8 != 0) goto L_0x0056
            r6 = r4
            goto L_0x003a
        L_0x0056:
            int r5 = r5 + 1
            goto L_0x003a
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            int r11 = r11 + -1
            goto L_0x003a
        L_0x005f:
            int r11 = r11 + r4
            java.lang.CharSequence r11 = r10.subSequence(r5, r11)
            java.lang.String r11 = r11.toString()
            boolean r11 = r9.M3(r11)
            if (r11 == 0) goto L_0x017a
            int r11 = r10.length()
            int r11 = r11 - r4
            r5 = r3
            r6 = r5
        L_0x0075:
            if (r5 > r11) goto L_0x0098
            if (r6 != 0) goto L_0x007b
            r8 = r5
            goto L_0x007c
        L_0x007b:
            r8 = r11
        L_0x007c:
            char r8 = r10.charAt(r8)
            int r8 = cm.l.h(r8, r7)
            if (r8 > 0) goto L_0x0088
            r8 = r4
            goto L_0x0089
        L_0x0088:
            r8 = r3
        L_0x0089:
            if (r6 != 0) goto L_0x0092
            if (r8 != 0) goto L_0x008f
            r6 = r4
            goto L_0x0075
        L_0x008f:
            int r5 = r5 + 1
            goto L_0x0075
        L_0x0092:
            if (r8 != 0) goto L_0x0095
            goto L_0x0098
        L_0x0095:
            int r11 = r11 + -1
            goto L_0x0075
        L_0x0098:
            int r11 = r11 + r4
            java.lang.CharSequence r11 = r10.subSequence(r5, r11)
            java.lang.String r11 = r11.toString()
            boolean r11 = r9.X4(r11)
            if (r11 != 0) goto L_0x017a
            java.lang.String r11 = r10.substring(r2, r0)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r11, r4)
            java.lang.String r5 = "-"
            boolean r11 = km.q.F(r11, r5, r3, r2, r1)
            java.lang.String r6 = " "
            if (r11 != 0) goto L_0x00c7
            java.lang.String r11 = r10.substring(r2, r0)
            cm.l.e(r11, r4)
            boolean r11 = km.q.F(r11, r6, r3, r2, r1)
            if (r11 == 0) goto L_0x00db
        L_0x00c7:
            km.f r11 = new km.f
            r11.<init>((java.lang.String) r5)
            java.lang.String r0 = ""
            java.lang.String r10 = r11.c(r10, r0)
            km.f r11 = new km.f
            r11.<init>((java.lang.String) r6)
            java.lang.String r10 = r11.c(r10, r0)
        L_0x00db:
            android.content.Intent r11 = new android.content.Intent
            androidx.fragment.app.j r0 = r9.q()
            java.lang.Class<com.nic.mparivahan.Dl.SearchDL> r1 = com.nic.mparivahan.Dl.SearchDL.class
            r11.<init>(r0, r1)
            java.lang.String r0 = "DLNumber"
            r11.putExtra(r0, r10)
        L_0x00eb:
            r9.R1(r11)
            goto L_0x017a
        L_0x00f0:
            int r11 = r10.length()
            java.lang.String r4 = "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character"
            java.lang.String r5 = "label_challan_rc_validation"
            if (r11 == 0) goto L_0x010f
            int r11 = r10.length()
            r6 = 4
            if (r11 >= r6) goto L_0x0102
            goto L_0x010f
        L_0x0102:
            km.f r11 = new km.f
            java.lang.String r7 = "[a-zA-Z0-9]*"
            r11.<init>((java.lang.String) r7)
            boolean r11 = r11.a(r10)
            if (r11 != 0) goto L_0x011d
        L_0x010f:
            androidx.fragment.app.j r10 = r9.q()
            ld.c r11 = r9.z4()
            java.lang.String r11 = r11.b(r5, r4)
            goto L_0x0024
        L_0x011d:
            int r11 = r10.length()
            if (r11 < r6) goto L_0x017a
            km.f r11 = new km.f
            java.lang.String r6 = "^[0-9]*$"
            r11.<init>((java.lang.String) r6)
            boolean r11 = r11.a(r10)
            if (r11 != 0) goto L_0x010f
            km.f r11 = new km.f
            java.lang.String r6 = "[a-zA-Z]+"
            r11.<init>((java.lang.String) r6)
            boolean r11 = r11.a(r10)
            if (r11 != 0) goto L_0x010f
            android.content.Intent r11 = new android.content.Intent
            androidx.fragment.app.j r3 = r9.q()
            java.lang.Class<com.nic.mparivahan.RC.SearchRC> r4 = com.nic.mparivahan.RC.SearchRC.class
            r11.<init>(r3, r4)
            java.lang.String r3 = "RC_Number"
            r11.putExtra(r3, r10)
            android.widget.Spinner r10 = r9.f8436j0
            java.lang.String r3 = "spinner"
            if (r10 != 0) goto L_0x0157
            cm.l.v(r3)
            r10 = r1
        L_0x0157:
            int r10 = r10.getSelectedItemPosition()
            java.lang.String r4 = "RCSERVICE"
            if (r10 != r2) goto L_0x0164
            java.lang.String r10 = "INS002"
            r11.putExtra(r4, r10)
        L_0x0164:
            android.widget.Spinner r10 = r9.f8436j0
            if (r10 != 0) goto L_0x016c
            cm.l.v(r3)
            goto L_0x016d
        L_0x016c:
            r1 = r10
        L_0x016d:
            int r10 = r1.getSelectedItemPosition()
            if (r10 != r0) goto L_0x00eb
            java.lang.String r10 = "PUCC003"
            r11.putExtra(r4, r10)
            goto L_0x00eb
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment.L7(java.lang.String, int):void");
    }

    public final void L8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8484z0 = linearLayout;
    }

    public final void L9(TextView textView) {
        l.f(textView, "<set-?>");
        this.f8486z2 = textView;
    }

    public final RcService M4() {
        RcService rcService = this.f8428g1;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final li.e M5() {
        li.e eVar = this.f8427f2;
        if (eVar != null) {
            return eVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void M7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8446m1 = linearLayout;
    }

    public final void M8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8476w1 = linearLayout;
    }

    public final void M9(TextView textView) {
        l.f(textView, "<set-?>");
        this.A2 = textView;
    }

    public void N(String str, int i10) {
    }

    public final LinearLayout N3() {
        LinearLayout linearLayout = this.f8446m1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("accident_layout");
        return null;
    }

    public final cd.c N4() {
        cd.c cVar = this.f8426f1;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final LinearLayout N5() {
        LinearLayout linearLayout = this.E1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("viewless");
        return null;
    }

    public final void N7(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.N0 = recyclerView;
    }

    public final void N8(Context context) {
        l.f(context, "<set-?>");
        this.f8447m2 = context;
    }

    public final void N9(TextView textView) {
        l.f(textView, "<set-?>");
        this.D2 = textView;
    }

    public final RecyclerView O3() {
        RecyclerView recyclerView = this.N0;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("alerst_recycle_view");
        return null;
    }

    public final ja.h O4() {
        l.v("myRcAdapter");
        return null;
    }

    public final TextView O5() {
        TextView textView = this.Q0;
        if (textView != null) {
            return textView;
        }
        l.v("virtual_dl_textview");
        return null;
    }

    public final void O7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.M1 = linearLayout;
    }

    public final void O8(DlService dlService) {
        l.f(dlService, "<set-?>");
        this.f8477w2 = dlService;
    }

    public final void O9(TextView textView) {
        l.f(textView, "<set-?>");
        this.F2 = textView;
    }

    public void P(String str, int i10) {
        throw new n("An operation is not implemented: " + "Not yet implemented");
    }

    public final LinearLayout P3() {
        LinearLayout linearLayout = this.M1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("alert_mes_layout");
        return null;
    }

    public final LinearLayout P4() {
        LinearLayout linearLayout = this.f8437j1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("mylicence");
        return null;
    }

    public final TextView P5() {
        TextView textView = this.P0;
        if (textView != null) {
            return textView;
        }
        l.v("virtual_rc_textview");
        return null;
    }

    public final void P7(ja.d dVar) {
        l.f(dVar, "<set-?>");
        this.f8425e2 = dVar;
    }

    public final void P8(za.a aVar) {
        l.f(aVar, "<set-?>");
        this.f8450n2 = aVar;
    }

    public final void P9(int i10) {
        this.f8440k1 = i10;
    }

    public final ja.d Q3() {
        ja.d dVar = this.f8425e2;
        if (dVar != null) {
            return dVar;
        }
        l.v("alertsAdapter");
        return null;
    }

    public final LinearLayout Q4() {
        LinearLayout linearLayout = this.f8434i1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("myvehicle");
        return null;
    }

    public final void Q7(TextView textView) {
        l.f(textView, "<set-?>");
        this.f8461r1 = textView;
    }

    public final void Q8(qa.b bVar) {
        l.f(bVar, "<set-?>");
        this.f8429g2 = bVar;
    }

    public final void Q9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.X1 = linearLayout;
    }

    public final TextView R3() {
        TextView textView = this.f8461r1;
        if (textView != null) {
            return textView;
        }
        l.v("alerts_title");
        return null;
    }

    public final li.c R4() {
        li.c cVar = this.f8430h0;
        if (cVar != null) {
            return cVar;
        }
        l.v("napixViewModel");
        return null;
    }

    public final void R7(String str) {
        l.f(str, "<set-?>");
        this.J1 = str;
    }

    public final void R8(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f8428g1 = rcService;
    }

    public final void R9(TextView textView) {
        l.f(textView, "<set-?>");
        this.Y1 = textView;
    }

    public final String S3() {
        String str = this.J1;
        if (str != null) {
            return str;
        }
        l.v("callfrom");
        return null;
    }

    public final LinearLayout S4() {
        LinearLayout linearLayout = this.f8485z1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("new_driving_license");
        return null;
    }

    public final void S7(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.L2 = constraintLayout;
    }

    public final void S8(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8426f1 = cVar;
    }

    public final void S9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8473v1 = linearLayout;
    }

    public final ConstraintLayout T3() {
        ConstraintLayout constraintLayout = this.L2;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.v("challanConstraint");
        return null;
    }

    public final LinearLayout T4() {
        LinearLayout linearLayout = this.f8482y1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("new_learning_license");
        return null;
    }

    public final void T7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8453o2 = linearLayout;
    }

    public final void T8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8437j1 = linearLayout;
    }

    public final void T9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.L1 = linearLayout;
    }

    public final LinearLayout U3() {
        LinearLayout linearLayout = this.f8453o2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("challanViewMore");
        return null;
    }

    public final TextView U4() {
        TextView textView = this.f8416a1;
        if (textView != null) {
            return textView;
        }
        l.v("nodocument");
        return null;
    }

    public final void U7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8424e1 = linearLayout;
    }

    public final void U8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8434i1 = linearLayout;
    }

    public final void U9(li.e eVar) {
        l.f(eVar, "<set-?>");
        this.f8427f2 = eVar;
    }

    public final LinearLayout V3() {
        LinearLayout linearLayout = this.f8424e1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("challan_payment");
        return null;
    }

    public final ConstraintLayout V4() {
        ConstraintLayout constraintLayout = this.M2;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.v("noticeConstraint");
        return null;
    }

    public final void V7(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.f8479x1 = recyclerView;
    }

    public final void V8(li.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8430h0 = cVar;
    }

    public final void V9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.E1 = linearLayout;
    }

    public void W0(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.W0(i10, strArr, iArr);
        if (i10 != this.I1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            I7();
            return;
        }
        if (l.a(S3(), "0")) {
            R1(new Intent(q(), TrafficReportVioActivity.class));
        }
        if (l.a(S3(), "1")) {
            R1(new Intent(q(), AccidentReportActivity.class));
        }
    }

    public final RecyclerView W3() {
        RecyclerView recyclerView = this.f8479x1;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("challan_recyclerView");
        return null;
    }

    public final TextView W4() {
        TextView textView = this.f8470u1;
        if (textView != null) {
            return textView;
        }
        l.v("notice_status_tv");
        return null;
    }

    public final void W7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8422d1 = linearLayout;
    }

    public final void W8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8485z1 = linearLayout;
    }

    public final void W9(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q0 = textView;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        q5().setVisibility(8);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1 A[SYNTHETIC, Splitter:B:34:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ef A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0115 A[SYNTHETIC, Splitter:B:56:0x0115] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0128 A[SYNTHETIC, Splitter:B:61:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0145 A[Catch:{ Exception -> 0x0086 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X0() {
        /*
            r5 = this;
            super.X0()
            r0 = 0
            ld.g r1 = r5.p5()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r1.n()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0041 }
            if (r1 == 0) goto L_0x002b
            android.widget.TextView r1 = r5.f8466t0     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "full_name"
            cm.l.v(r1)     // Catch:{ Exception -> 0x0041 }
            r1 = r0
        L_0x001c:
            ld.g r2 = r5.p5()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r2.n()     // Catch:{ Exception -> 0x0041 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0041 }
            r1.setText(r2)     // Catch:{ Exception -> 0x0041 }
        L_0x002b:
            ld.e r1 = new ld.e     // Catch:{ Exception -> 0x0041 }
            androidx.fragment.app.j r2 = r5.q()     // Catch:{ Exception -> 0x0041 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0041 }
            int r1 = r1.d()     // Catch:{ Exception -> 0x0041 }
            if (r1 != 0) goto L_0x003d
            r5.aa()     // Catch:{ Exception -> 0x0041 }
        L_0x003d:
            r5.ba()     // Catch:{ Exception -> 0x0041 }
            goto L_0x004a
        L_0x0041:
            com.smarteist.autoimageslider.SliderView r1 = r5.q5()     // Catch:{ Exception -> 0x0086 }
            r2 = 8
            r1.setVisibility(r2)     // Catch:{ Exception -> 0x0086 }
        L_0x004a:
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter     // Catch:{ Exception -> 0x0073 }
            androidx.fragment.app.j r2 = r5.D1()     // Catch:{ Exception -> 0x0073 }
            ka.c$a r3 = ka.c.f13158a     // Catch:{ Exception -> 0x0073 }
            androidx.fragment.app.j r4 = r5.q()     // Catch:{ Exception -> 0x0073 }
            java.lang.String[] r3 = r3.c(r4)     // Catch:{ Exception -> 0x0073 }
            r4 = 2131558982(0x7f0d0246, float:1.8743295E38)
            r1.<init>(r2, r4, r3)     // Catch:{ Exception -> 0x0073 }
            r2 = 2131559031(0x7f0d0277, float:1.8743395E38)
            r1.setDropDownViewResource(r2)     // Catch:{ Exception -> 0x0073 }
            android.widget.Spinner r2 = r5.f8436j0     // Catch:{ Exception -> 0x0073 }
            if (r2 != 0) goto L_0x0070
            java.lang.String r2 = "spinner"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0073 }
            r2 = r0
        L_0x0070:
            r2.setAdapter(r1)     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            androidx.fragment.app.j r1 = r5.q()     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x0089
            com.nic.mparivahan.a$a r2 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0086 }
            boolean r1 = r2.a(r1)     // Catch:{ Exception -> 0x0086 }
            r2 = 1
            if (r1 != r2) goto L_0x0089
            r5.ca()     // Catch:{ Exception -> 0x0086 }
            goto L_0x00a6
        L_0x0086:
            r0 = move-exception
            goto L_0x014d
        L_0x0089:
            androidx.fragment.app.j r1 = r5.q()     // Catch:{ Exception -> 0x0086 }
            ld.c r2 = r5.z4()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "label_log_check_internet"
            r4 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r4 = r5.e0(r4)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = r2.b(r3, r4)     // Catch:{ Exception -> 0x0086 }
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)     // Catch:{ Exception -> 0x0086 }
            r1.show()     // Catch:{ Exception -> 0x0086 }
        L_0x00a6:
            androidx.fragment.app.j r1 = r5.q()     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x00b1
            com.nic.mparivahan.a$a r2 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0086 }
            r2.a(r1)     // Catch:{ Exception -> 0x0086 }
        L_0x00b1:
            ld.g r1 = r5.p5()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = r1.p()     // Catch:{ Exception -> 0x0086 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "userIv"
            if (r1 <= 0) goto L_0x00eb
            ld.g r1 = r5.p5()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = r1.p()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = "0"
            boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x0086 }
            if (r1 != 0) goto L_0x00eb
            ld.g r1 = r5.p5()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r1 = r1.p()     // Catch:{ Exception -> 0x0086 }
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.e.c(r1)     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x00f9
            com.nic.mparivahan.dlservices.widget.CircleImageView r3 = r5.f8423d2     // Catch:{ Exception -> 0x00f9 }
            if (r3 != 0) goto L_0x00e7
            cm.l.v(r2)     // Catch:{ Exception -> 0x00f9 }
            r3 = r0
        L_0x00e7:
            r3.setImageBitmap(r1)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00f9
        L_0x00eb:
            com.nic.mparivahan.dlservices.widget.CircleImageView r1 = r5.f8423d2     // Catch:{ Exception -> 0x0086 }
            if (r1 != 0) goto L_0x00f3
            cm.l.v(r2)     // Catch:{ Exception -> 0x0086 }
            r1 = r0
        L_0x00f3:
            r2 = 2131230862(0x7f08008e, float:1.8077789E38)
            r1.setImageResource(r2)     // Catch:{ Exception -> 0x0086 }
        L_0x00f9:
            androidx.fragment.app.j r1 = r5.q()     // Catch:{ Exception -> 0x0086 }
            if (r1 == 0) goto L_0x010f
            li.e r2 = r5.M5()     // Catch:{ Exception -> 0x0086 }
            androidx.lifecycle.a0 r2 = r2.l()     // Catch:{ Exception -> 0x0086 }
            ta.a r3 = new ta.a     // Catch:{ Exception -> 0x0086 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0086 }
            r2.g(r1, r3)     // Catch:{ Exception -> 0x0086 }
        L_0x010f:
            androidx.appcompat.widget.AppCompatEditText r1 = r5.f8469u0     // Catch:{ Exception -> 0x0086 }
            java.lang.String r2 = "Search_bar"
            if (r1 != 0) goto L_0x0119
            cm.l.v(r2)     // Catch:{ Exception -> 0x0086 }
            r1 = r0
        L_0x0119:
            android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0086 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0086 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0086 }
            java.lang.String r3 = ""
            if (r1 <= 0) goto L_0x0134
            androidx.appcompat.widget.AppCompatEditText r1 = r5.f8469u0     // Catch:{ Exception -> 0x0086 }
            if (r1 != 0) goto L_0x0130
            cm.l.v(r2)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0131
        L_0x0130:
            r0 = r1
        L_0x0131:
            r0.setText(r3)     // Catch:{ Exception -> 0x0086 }
        L_0x0134:
            androidx.appcompat.widget.AppCompatEditText r0 = r5.h4()     // Catch:{ Exception -> 0x0086 }
            android.text.Editable r0 = r0.getText()     // Catch:{ Exception -> 0x0086 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0086 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0086 }
            if (r0 <= 0) goto L_0x0150
            androidx.appcompat.widget.AppCompatEditText r0 = r5.h4()     // Catch:{ Exception -> 0x0086 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0086 }
            goto L_0x0150
        L_0x014d:
            r0.printStackTrace()
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Dashboard.ui.Home.HomeFragment.X0():void");
    }

    public final LinearLayout X3() {
        LinearLayout linearLayout = this.f8422d1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("challan_status_linear");
        return null;
    }

    public final boolean X4(String str) {
        l.f(str, "str");
        int[] iArr = new int[256];
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            iArr[charAt] = iArr[charAt] + 1;
        }
        char[] cArr = new char[str.length()];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = str.charAt(i11);
            if (i11 >= 0) {
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (str.charAt(i11) == cArr[i12]) {
                        i13++;
                    }
                    if (i12 == i11) {
                        break;
                    }
                    i12++;
                }
                if (i13 > 12) {
                    D7(q(), "Please enter minimum 10 & maximum 18 characters.Only hyphen(-), forward slash(/) & space is allowed");
                    return true;
                }
            }
        }
        return false;
    }

    public final void X7(TextView textView) {
        l.f(textView, "<set-?>");
        this.f8467t1 = textView;
    }

    public final void X8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8482y1 = linearLayout;
    }

    public final void X9(TextView textView) {
        l.f(textView, "<set-?>");
        this.P0 = textView;
    }

    public final TextView Y3() {
        TextView textView = this.f8467t1;
        if (textView != null) {
            return textView;
        }
        l.v("challan_status_tv");
        return null;
    }

    public final ConstraintLayout Y4() {
        ConstraintLayout constraintLayout = this.K2;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.v("otherConstraint");
        return null;
    }

    public final void Y7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.N1 = linearLayout;
    }

    public final void Y8(TextView textView) {
        l.f(textView, "<set-?>");
        this.f8416a1 = textView;
    }

    public final void Y9(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new y0(dialog));
        dialog.show();
    }

    public final LinearLayout Z3() {
        LinearLayout linearLayout = this.N1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("change_of_address_DLP");
        return null;
    }

    public final RecyclerView Z4() {
        RecyclerView recyclerView = this.J2;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("otherService_recyclerView");
        return null;
    }

    public final void Z7(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.B1 = linearLayout;
    }

    public final void Z8(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.M2 = constraintLayout;
    }

    public void a(String str, Integer num) {
        l.f(str, "dl");
        try {
            DldetobjX dldetails = ((DLDocument) f4().c0().get(0)).getDldetails();
            l.c(dldetails);
            String obj = q.B0(dldetails.getDlobj().getDlLicno()).toString();
            if (f4().j0(obj).equals("0")) {
                f4().j0(new km.f("\\s").b(obj, ""));
            }
            j q10 = q();
            if (q10 != null) {
                K4().j(q.B0(dldetails.getDlobj().getDlLicno().toString()).toString(), z9.a.f18947a.b(q.B0(dldetails.getBioObj().getBioDob().toString()).toString()), q10);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final LinearLayout a4() {
        LinearLayout linearLayout = this.B1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("change_of_address_dl");
        return null;
    }

    public final TextView a5() {
        TextView textView = this.I2;
        if (textView != null) {
            return textView;
        }
        l.v("otherService_textView");
        return null;
    }

    public final void a6(View view) {
        View view2 = view;
        View view3 = null;
        View findViewById = view2 != null ? view2.findViewById(R.id.lic_details) : null;
        l.d(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById).setOnClickListener(new l1());
        View findViewById2 = view2 != null ? view2.findViewById(R.id.vehicle_details) : null;
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById2).setOnClickListener(new x1());
        View findViewById3 = view2 != null ? view2.findViewById(R.id.permit_details) : null;
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById3;
        View findViewById4 = view2 != null ? view2.findViewById(R.id.act_and_rule) : null;
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) findViewById4;
        View findViewById5 = view2 != null ? view2.findViewById(R.id.fee_and_user_charges) : null;
        l.d(findViewById5, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout3 = (LinearLayout) findViewById5;
        View findViewById6 = view2 != null ? view2.findViewById(R.id.manual) : null;
        l.d(findViewById6, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout4 = (LinearLayout) findViewById6;
        if (view2 != null) {
            view3 = view2.findViewById(R.id.faq);
        }
        l.d(view3, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout5 = (LinearLayout) view3;
        View findViewById7 = view2.findViewById(R.id.welcome);
        l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById7;
        View findViewById8 = view2.findViewById(R.id.trans_services);
        l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById8;
        View findViewById9 = view2.findViewById(R.id.my_docs);
        l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById9;
        View findViewById10 = view2.findViewById(R.id.cit_sen);
        l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById10;
        View findViewById11 = view2.findViewById(R.id.inf_Serv);
        l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById11;
        View findViewById12 = view2.findViewById(R.id.txt_ts);
        l.d(findViewById12, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) findViewById12;
        View findViewById13 = view2.findViewById(R.id.txt_md);
        l.d(findViewById13, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) findViewById13;
        View findViewById14 = view2.findViewById(R.id.txt_cs);
        l.d(findViewById14, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView8 = (TextView) findViewById14;
        View findViewById15 = view2.findViewById(R.id.txt_is);
        l.d(findViewById15, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView9 = (TextView) findViewById15;
        View findViewById16 = view2.findViewById(R.id.virtual_rc_textview);
        l.d(findViewById16, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView10 = (TextView) findViewById16;
        View findViewById17 = view2.findViewById(R.id.nodocument);
        l.d(findViewById17, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView11 = (TextView) findViewById17;
        cm.u uVar = new cm.u();
        View findViewById18 = view2.findViewById(R.id.virtual_dl_textview);
        l.d(findViewById18, "null cannot be cast to non-null type android.widget.TextView");
        uVar.f20234e = (TextView) findViewById18;
        View findViewById19 = view2.findViewById(R.id.txt_process);
        l.d(findViewById19, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView12 = (TextView) findViewById19;
        View findViewById20 = view2.findViewById(R.id.home);
        l.d(findViewById20, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView13 = (TextView) findViewById20;
        View findViewById21 = view2.findViewById(R.id.payment);
        l.d(findViewById21, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView14 = (TextView) findViewById21;
        View findViewById22 = view2.findViewById(R.id.documents);
        l.d(findViewById22, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView15 = (TextView) findViewById22;
        View findViewById23 = view2.findViewById(R.id.settings);
        l.d(findViewById23, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView16 = (TextView) findViewById23;
        View findViewById24 = view2.findViewById(R.id.my_virtual_rc);
        l.d(findViewById24, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView17 = (TextView) findViewById24;
        View findViewById25 = view2.findViewById(R.id.my_virtual_dl);
        l.d(findViewById25, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView18 = (TextView) findViewById25;
        View findViewById26 = view2.findViewById(R.id.alerts_title);
        l.d(findViewById26, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView19 = (TextView) findViewById26;
        View findViewById27 = view2.findViewById(R.id.about_nexgen);
        l.d(findViewById27, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView20 = (TextView) findViewById27;
        cm.u uVar2 = new cm.u();
        View findViewById28 = view2.findViewById(R.id.txt_virtual_rc);
        l.d(findViewById28, "null cannot be cast to non-null type android.widget.TextView");
        uVar2.f20234e = (TextView) findViewById28;
        View findViewById29 = view2.findViewById(R.id.txt_virtual_dl);
        l.d(findViewById29, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView21 = (TextView) findViewById29;
        cm.u uVar3 = new cm.u();
        View findViewById30 = view2.findViewById(R.id.txt_shared_rc);
        l.d(findViewById30, "null cannot be cast to non-null type android.widget.TextView");
        uVar3.f20234e = (TextView) findViewById30;
        cm.u uVar4 = new cm.u();
        View findViewById31 = view2.findViewById(R.id.txt_rcv_rc);
        l.d(findViewById31, "null cannot be cast to non-null type android.widget.TextView");
        uVar4.f20234e = (TextView) findViewById31;
        cm.u uVar5 = new cm.u();
        View findViewById32 = view2.findViewById(R.id.txt_rc_search);
        l.d(findViewById32, "null cannot be cast to non-null type android.widget.TextView");
        uVar5.f20234e = (TextView) findViewById32;
        cm.u uVar6 = new cm.u();
        View findViewById33 = view2.findViewById(R.id.txt_dl_search);
        l.d(findViewById33, "null cannot be cast to non-null type android.widget.TextView");
        uVar6.f20234e = (TextView) findViewById33;
        cm.u uVar7 = new cm.u();
        View findViewById34 = view2.findViewById(R.id.txt_dup_rc);
        l.d(findViewById34, "null cannot be cast to non-null type android.widget.TextView");
        uVar7.f20234e = (TextView) findViewById34;
        View findViewById35 = view2.findViewById(R.id.txt_ht);
        l.d(findViewById35, "null cannot be cast to non-null type android.widget.TextView");
        L9((TextView) findViewById35);
        View findViewById36 = view2.findViewById(R.id.txt_too);
        l.d(findViewById36, "null cannot be cast to non-null type android.widget.TextView");
        O9((TextView) findViewById36);
        View findViewById37 = view2.findViewById(R.id.txt_rc_pert);
        l.d(findViewById37, "null cannot be cast to non-null type android.widget.TextView");
        M9((TextView) findViewById37);
        cm.u uVar8 = new cm.u();
        View findViewById38 = view2.findViewById(R.id.txt_coa);
        l.d(findViewById38, "null cannot be cast to non-null type android.widget.TextView");
        uVar8.f20234e = (TextView) findViewById38;
        cm.u uVar9 = new cm.u();
        View findViewById39 = view2.findViewById(R.id.txt_hp_end);
        l.d(findViewById39, "null cannot be cast to non-null type android.widget.TextView");
        uVar9.f20234e = (TextView) findViewById39;
        View findViewById40 = view2.findViewById(R.id.txt_hc);
        l.d(findViewById40, "null cannot be cast to non-null type android.widget.TextView");
        K9((TextView) findViewById40);
        cm.u uVar10 = new cm.u();
        View findViewById41 = view2.findViewById(R.id.txt_noc);
        l.d(findViewById41, "null cannot be cast to non-null type android.widget.TextView");
        uVar10.f20234e = (TextView) findViewById41;
        View findViewById42 = view2.findViewById(R.id.about_licence);
        l.d(findViewById42, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView22 = (TextView) findViewById42;
        cm.u uVar11 = new cm.u();
        View findViewById43 = view2.findViewById(R.id.txt_renewal);
        l.d(findViewById43, "null cannot be cast to non-null type android.widget.TextView");
        uVar11.f20234e = (TextView) findViewById43;
        View findViewById44 = view2.findViewById(R.id.txt_dup_dl);
        l.d(findViewById44, "null cannot be cast to non-null type android.widget.TextView");
        J9((TextView) findViewById44);
        View findViewById45 = view2.findViewById(R.id.txt_coa_dl);
        l.d(findViewById45, "null cannot be cast to non-null type android.widget.TextView");
        H9((TextView) findViewById45);
        cm.u uVar12 = new cm.u();
        cm.u uVar13 = uVar9;
        View findViewById46 = view2.findViewById(R.id.txt_idp);
        l.d(findViewById46, "null cannot be cast to non-null type android.widget.TextView");
        uVar12.f20234e = (TextView) findViewById46;
        View findViewById47 = view2.findViewById(R.id.txt_dl_extract);
        l.d(findViewById47, "null cannot be cast to non-null type android.widget.TextView");
        I9((TextView) findViewById47);
        View findViewById48 = view2.findViewById(R.id.txt_replace_dl);
        l.d(findViewById48, "null cannot be cast to non-null type android.widget.TextView");
        N9((TextView) findViewById48);
        View findViewById49 = view2.findViewById(R.id.txt_renewal2);
        l.d(findViewById49, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView23 = (TextView) findViewById49;
        View findViewById50 = view2.findViewById(R.id.txt_dup_dl2);
        l.d(findViewById50, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView24 = (TextView) findViewById50;
        View findViewById51 = view2.findViewById(R.id.aod);
        l.d(findViewById51, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView25 = (TextView) findViewById51;
        View findViewById52 = view2.findViewById(R.id.txt_idp2);
        l.d(findViewById52, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView26 = (TextView) findViewById52;
        View findViewById53 = view2.findViewById(R.id.txt_idp3);
        l.d(findViewById53, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView27 = (TextView) findViewById53;
        View findViewById54 = view2.findViewById(R.id.txt_dl_extract2);
        l.d(findViewById54, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView28 = (TextView) findViewById54;
        View findViewById55 = view2.findViewById(R.id.txt_dl_extract3);
        l.d(findViewById55, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView29 = (TextView) findViewById55;
        View findViewById56 = view2.findViewById(R.id.txt_replace_dl2);
        l.d(findViewById56, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView30 = (TextView) findViewById56;
        View findViewById57 = view2.findViewById(R.id.virtual_rc);
        l.d(findViewById57, "null cannot be cast to non-null type android.widget.LinearLayout");
        cm.u uVar14 = uVar8;
        ((LinearLayout) findViewById57).setOnClickListener(new d2(this, uVar2));
        View findViewById58 = view2.findViewById(R.id.virtual_dl);
        l.d(findViewById58, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById58).setOnClickListener(new e2(this, uVar));
        View findViewById59 = view2.findViewById(R.id.shared_rc);
        l.d(findViewById59, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById59).setOnClickListener(new f2(this, uVar3));
        View findViewById60 = view2.findViewById(R.id.recived_rc);
        l.d(findViewById60, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById60).setOnClickListener(new g2(this, uVar4));
        View findViewById61 = view2.findViewById(R.id.search_rc);
        l.d(findViewById61, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById61).setOnClickListener(new h2(this, uVar5));
        View findViewById62 = view2.findViewById(R.id.search_dl);
        l.d(findViewById62, "null cannot be cast to non-null type android.widget.LinearLayout");
        ((LinearLayout) findViewById62).setOnClickListener(new i2(this, uVar6));
        View findViewById63 = view2.findViewById(R.id.learning_lic);
        l.d(findViewById63, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById64 = view2.findViewById(R.id.permit_lic);
        l.d(findViewById64, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById65 = view2.findViewById(R.id.renewal_dl);
        l.d(findViewById65, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById66 = view2.findViewById(R.id.duplicate_dl);
        l.d(findViewById66, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout6 = (LinearLayout) findViewById66;
        View findViewById67 = view2.findViewById(R.id.add_lic);
        l.d(findViewById67, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById68 = view2.findViewById(R.id.permit_dl);
        l.d(findViewById68, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById69 = view2.findViewById(R.id.dl_fees_charge);
        l.d(findViewById69, "null cannot be cast to non-null type android.widget.LinearLayout");
        View findViewById70 = view2.findViewById(R.id.duplicate_rc);
        l.d(findViewById70, "null cannot be cast to non-null type android.widget.LinearLayout");
        cm.u uVar15 = uVar10;
        View findViewById71 = view2.findViewById(R.id.no_object_certificate);
        l.d(findViewById71, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout7 = (LinearLayout) findViewById71;
        View findViewById72 = view2.findViewById(R.id.change_of_address_rc);
        l.d(findViewById72, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout8 = (LinearLayout) findViewById72;
        View findViewById73 = view2.findViewById(R.id.hp_rc);
        l.d(findViewById73, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout9 = (LinearLayout) findViewById73;
        View findViewById74 = view2.findViewById(R.id.notification);
        l.d(findViewById74, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout10 = (LinearLayout) findViewById74;
        View findViewById75 = view2.findViewById(R.id.advisory);
        l.d(findViewById75, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout11 = (LinearLayout) findViewById75;
        View findViewById76 = view2.findViewById(R.id.draft_notification);
        l.d(findViewById76, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout12 = (LinearLayout) findViewById76;
        View findViewById77 = view2.findViewById(R.id.allform);
        l.d(findViewById77, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout13 = (LinearLayout) findViewById77;
        View findViewById78 = view2.findViewById(R.id.driving_l);
        l.d(findViewById78, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout14 = (LinearLayout) findViewById78;
        View findViewById79 = view2.findViewById(R.id.motor_vehicle);
        l.d(findViewById79, "null cannot be cast to non-null type android.widget.LinearLayout");
        cm.u uVar16 = new cm.u();
        View findViewById80 = view2.findViewById(R.id.txt_notification);
        l.d(findViewById80, "null cannot be cast to non-null type android.widget.TextView");
        uVar16.f20234e = (TextView) findViewById80;
        ((LinearLayout) findViewById63).setOnClickListener(new j2(this, uVar6));
        ((LinearLayout) findViewById64).setOnClickListener(new l2(this));
        ((LinearLayout) findViewById65).setOnClickListener(new m1(this, uVar11));
        ((LinearLayout) findViewById67).setOnClickListener(new n1(this));
        ((LinearLayout) findViewById68).setOnClickListener(new p1(this, uVar12));
        ((LinearLayout) findViewById69).setOnClickListener(new q1(this));
        ((LinearLayout) findViewById70).setOnClickListener(new r1(this, uVar7));
        linearLayout7.setOnClickListener(new s1(this, uVar15));
        linearLayout8.setOnClickListener(new t1(this, uVar14));
        linearLayout9.setOnClickListener(new u1(this, uVar13));
        linearLayout10.setOnClickListener(new v1(this, uVar16));
        linearLayout11.setOnClickListener(new w1());
        linearLayout12.setOnClickListener(new y1());
        linearLayout13.setOnClickListener(new a2(this));
        linearLayout14.setOnClickListener(new b2(this));
        ((LinearLayout) findViewById79).setOnClickListener(new c2(this));
    }

    public final void a8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8456p2 = linearLayout;
    }

    public final void a9(TextView textView) {
        l.f(textView, "<set-?>");
        this.f8470u1 = textView;
    }

    public final void aa() {
        j q10 = q();
        if (q10 != null) {
            M5().g(q10);
        }
    }

    public void b0(Integer num) {
    }

    public final LinearLayout b4() {
        LinearLayout linearLayout = this.f8456p2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("citizen_linear");
        return null;
    }

    public final LinearLayout b5() {
        LinearLayout linearLayout = this.f8459q2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("other_service_viewmore");
        return null;
    }

    public final void b8(Spinner spinner) {
        l.f(spinner, "<set-?>");
        this.N2 = spinner;
    }

    public final void b9(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.K2 = constraintLayout;
    }

    public final void ba() {
        String a10 = new ld.e(q()).a();
        if (!a10.equals("0")) {
            try {
                Object j10 = new i7.d().j(a10, BannerModel.class);
                l.e(j10, "fromJson(...)");
                BannerModel bannerModel = (BannerModel) j10;
                ArrayList<MparBanner> mparBannerList = bannerModel.getMparBannerList();
                l.c(mparBannerList);
                if (mparBannerList.size() > 0) {
                    j q10 = q();
                    l.c(q10);
                    q5().setSliderAdapter(new ja.g(q10, bannerModel.getMparBannerList(), this));
                    q5().setIndicatorAnimation(xk.e.WORM);
                    q5().setSliderTransformAnimation(com.smarteist.autoimageslider.b.SIMPLETRANSFORMATION);
                    q5().k();
                    return;
                }
                return;
            } catch (Exception unused) {
            }
        }
        q5().setVisibility(8);
    }

    public final Spinner c4() {
        Spinner spinner = this.N2;
        if (spinner != null) {
            return spinner;
        }
        l.v("citizen_spinner");
        return null;
    }

    public final ProgressDialog c5() {
        ProgressDialog progressDialog = this.f8431h1;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final void c8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.R1 = linearLayout;
    }

    public final void c9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.J2 = recyclerView;
    }

    public final void ca() {
        ld.e eVar = new ld.e(q());
        if (eVar.d() == 1) {
            j q10 = q();
            if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
                Toast.makeText(q(), z4().b("label_log_check_internet", e0(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            eVar.h(0);
            U4().setVisibility(8);
            D4().setVisibility(8);
            O5().setVisibility(8);
            P5().setVisibility(8);
            f5().setVisibility(8);
            t4().setVisibility(8);
            N3().setVisibility(8);
            x4().setVisibility(8);
            G4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            F4().setBackgroundResource(R.color.white);
            C4().setBackgroundResource(R.color.white);
            E4().setBackgroundResource(R.color.white);
            y5().setTextColor(Color.parseColor("#FFFFFF"));
            w5().setTextColor(Color.parseColor("#000000"));
            v5().setTextColor(Color.parseColor("#000000"));
            x5().setTextColor(Color.parseColor("#000000"));
            u4().setImageResource(R.drawable.ic_citizen_sentinel);
            w4().setImageResource(R.drawable.ic_transport_selected);
            v4().setImageResource(R.drawable.ic_informational_services);
            TextView textView = null;
            v4().setColorFilter((ColorFilter) null);
            A4().setVisibility(0);
            TextView textView2 = this.f8472v0;
            if (textView2 == null) {
                l.v("txt_process");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            J5().setVisibility(8);
            String f10 = new ld.e(q()).f();
            if (f10.equals("0")) {
                Log.e("State", "1");
                c5().show();
                M5().p();
                return;
            }
            try {
                Object j10 = new i7.d().j(f10, StateMaster.class);
                l.e(j10, "fromJson(...)");
                x9((StateMaster) j10);
            } catch (Exception unused) {
            }
        }
    }

    public final LinearLayout d4() {
        LinearLayout linearLayout = this.R1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("d_ht");
        return null;
    }

    public final LinearLayout d5() {
        LinearLayout linearLayout = this.f8421c2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("rc_partucular");
        return null;
    }

    public final void d8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.S1 = linearLayout;
    }

    public final void d9(TextView textView) {
        l.f(textView, "<set-?>");
        this.I2 = textView;
    }

    public final void da() {
        if (f4().c0() != null) {
            try {
                g5().setVisibility(0);
                ArrayList c02 = f4().c0();
                l.e(c02, "getDLDetailsList(...)");
                g5().setLayoutManager(new LinearLayoutManager(q(), 0, false));
                j q10 = q();
                this.f8480x2 = q10 != null ? new va.c(q10, c02, this) : null;
                g5().setAdapter(this.f8480x2);
                va.c cVar = this.f8480x2;
                if (cVar != null) {
                    cVar.j();
                    return;
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        g5().setVisibility(8);
    }

    public void e(String str) {
        l.f(str, "bannerName");
        if (p.o(str, "Bannner 4", true)) {
            c5().show();
            L4().j(new g(w()).q());
        }
        if (p.o(str, "Bannner 5", true)) {
            c5().show();
            L4().x(new g(w()).q());
        }
        if (p.o(str, "Bannner 6", true)) {
            this.f8474v2 = false;
            j q10 = q();
            if (q10 == null || !com.nic.mparivahan.a.f9624a.a(q10)) {
                Toast.makeText(q(), z4().b("label_log_check_internet", e0(R.string.kindly_check_your_internet_connection)), 0).show();
                return;
            }
            U4().setVisibility(8);
            D4().setVisibility(8);
            O5().setVisibility(8);
            P5().setVisibility(8);
            f5().setVisibility(8);
            t4().setVisibility(8);
            N3().setVisibility(8);
            x4().setVisibility(8);
            G4().setBackgroundResource(R.drawable.corner_rectangle_bg_17);
            F4().setBackgroundResource(R.color.white);
            C4().setBackgroundResource(R.color.white);
            E4().setBackgroundResource(R.color.white);
            H4().setBackgroundResource(R.color.white);
            y5().setTextColor(Color.parseColor("#FFFFFF"));
            w5().setTextColor(Color.parseColor("#000000"));
            v5().setTextColor(Color.parseColor("#000000"));
            x5().setTextColor(Color.parseColor("#000000"));
            z5().setTextColor(Color.parseColor("#000000"));
            u4().setImageResource(R.drawable.dms_docs);
            w4().setImageResource(R.drawable.ic_transport_selected);
            v4().setImageResource(R.drawable.ic_informational_services);
            TextView textView = null;
            v4().setColorFilter((ColorFilter) null);
            u4().setColorFilter((ColorFilter) null);
            ImageView imageView = this.f8442l0;
            if (imageView == null) {
                l.v("citizen_image");
                imageView = null;
            }
            imageView.setColorFilter((ColorFilter) null);
            A4().setVisibility(0);
            TextView textView2 = this.f8472v0;
            if (textView2 == null) {
                l.v("txt_process");
            } else {
                textView = textView2;
            }
            textView.setVisibility(8);
            J5().setVisibility(8);
            String f10 = new ld.e(q()).f();
            if (f10.equals("0")) {
                Log.e("State", "1");
                c5().show();
                M5().p();
                return;
            }
            try {
                Log.e("State", "2");
                Object j10 = new i7.d().j(f10, StateMaster.class);
                l.e(j10, "fromJson(...)");
                x9((StateMaster) j10);
            } catch (Exception unused) {
            }
        }
    }

    public final LinearLayout e4() {
        LinearLayout linearLayout = this.S1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("d_to");
        return null;
    }

    public final RecyclerView e5() {
        RecyclerView recyclerView = this.M0;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("rec_dl_recycler");
        return null;
    }

    public final void e8(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.T0 = databaseHelper;
    }

    public final void e9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8462r2 = linearLayout;
    }

    public void f(String str, Integer num) {
        l.f(str, "rc");
        try {
            lm.k1 unused = g.d(e0.a(q0.b()), (tl.g) null, (f0) null, new d(this, num, str, (tl.d) null), 3, (Object) null);
        } catch (Exception unused2) {
        }
    }

    public final DatabaseHelper f4() {
        DatabaseHelper databaseHelper = this.T0;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final RecyclerView f5() {
        RecyclerView recyclerView = this.L0;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("rec_rc_recycler");
        return null;
    }

    public final void f8(TextView textView) {
        l.f(textView, "<set-?>");
        this.Y0 = textView;
    }

    public final void f9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8459q2 = linearLayout;
    }

    public final LinearLayout g4() {
        LinearLayout linearLayout = this.O1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("dl_abstract");
        return null;
    }

    public final RecyclerView g5() {
        RecyclerView recyclerView = this.O0;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerList");
        return null;
    }

    public final void g8(TextView textView) {
        l.f(textView, "<set-?>");
        this.V0 = textView;
    }

    public final void g9(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f8431h1 = progressDialog;
    }

    public final AppCompatEditText h4() {
        AppCompatEditText appCompatEditText = this.f8464s1;
        if (appCompatEditText != null) {
            return appCompatEditText;
        }
        l.v("dl_bar_edit");
        return null;
    }

    public final RecyclerView h5() {
        RecyclerView recyclerView = this.f8438j2;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView");
        return null;
    }

    public final void h8(TextView textView) {
        l.f(textView, "<set-?>");
        this.X0 = textView;
    }

    public final void h9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8421c2 = linearLayout;
    }

    public final LinearLayout i4() {
        LinearLayout linearLayout = this.D1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("dl_extract");
        return null;
    }

    public final RecyclerView i5() {
        RecyclerView recyclerView = this.f8444l2;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView_Notice");
        return null;
    }

    public final void i8(TextView textView) {
        l.f(textView, "<set-?>");
        this.W0 = textView;
    }

    public final void i9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.M0 = recyclerView;
    }

    public final LinearLayout j4() {
        LinearLayout linearLayout = this.P1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("dl_replacement");
        return null;
    }

    public final RecyclerView j5() {
        RecyclerView recyclerView = this.f8441k2;
        if (recyclerView != null) {
            return recyclerView;
        }
        l.v("recyclerView_vahan");
        return null;
    }

    public final void j8(TextView textView) {
        l.f(textView, "<set-?>");
        this.Z0 = textView;
    }

    public final void j9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.L0 = recyclerView;
    }

    public final LinearLayout k4() {
        LinearLayout linearLayout = this.K1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("dlrenewal");
        return null;
    }

    public final LinearLayout k5() {
        LinearLayout linearLayout = this.f8449n1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("reportTrafficViolationFragment");
        return null;
    }

    public final void k8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.O1 = linearLayout;
    }

    public final void k9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.O0 = recyclerView;
    }

    public final LinearLayout l4() {
        LinearLayout linearLayout = this.f8471u2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("downloadFancyReceipt");
        return null;
    }

    public final LinearLayout l5() {
        LinearLayout linearLayout = this.f8452o1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("report_accident");
        return null;
    }

    public final void l8(AppCompatEditText appCompatEditText) {
        l.f(appCompatEditText, "<set-?>");
        this.f8464s1 = appCompatEditText;
    }

    public final void l9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.f8438j2 = recyclerView;
    }

    public final LinearLayout m4() {
        LinearLayout linearLayout = this.A1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("duplicate_dl");
        return null;
    }

    public final f m5() {
        f fVar = this.H1;
        if (fVar != null) {
            return fVar;
        }
        l.v("sahi_session");
        return null;
    }

    public final void m8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.D1 = linearLayout;
    }

    public final void m9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.f8444l2 = recyclerView;
    }

    public void n(String str, int i10) {
        this.f8481y0 = i10;
        t9(String.valueOf(str));
        if (f4().s0(str) != null) {
            c5().show();
            String s02 = f4().s0(str);
            j q10 = q();
            if (q10 != null) {
                cd.c N4 = N4();
                l.e(s02, "element");
                N4.i(s02, q10);
            }
        }
    }

    public final LinearLayout n4() {
        LinearLayout linearLayout = this.f8419b2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("duplicate_dl_info");
        return null;
    }

    public final LinearLayout n5() {
        LinearLayout linearLayout = this.Z1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("sarthi_linear");
        return null;
    }

    public final void n8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.P1 = linearLayout;
    }

    public final void n9(RecyclerView recyclerView) {
        l.f(recyclerView, "<set-?>");
        this.f8441k2 = recyclerView;
    }

    public final TextView o4() {
        TextView textView = this.U1;
        if (textView != null) {
            return textView;
        }
        l.v("enrolled_state_sarthi");
        return null;
    }

    public final LinearLayout o5() {
        LinearLayout linearLayout = this.F1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("second_row_dlservice");
        return null;
    }

    public final void o8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.K1 = linearLayout;
    }

    public final void o9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8449n1 = linearLayout;
    }

    public final TextView p4() {
        TextView textView = this.T1;
        if (textView != null) {
            return textView;
        }
        l.v("enrolled_state_vahan");
        return null;
    }

    public final g p5() {
        g gVar = this.f8478x0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }

    public final void p8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8471u2 = linearLayout;
    }

    public final void p9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8452o1 = linearLayout;
    }

    public final LinearLayout q4() {
        LinearLayout linearLayout = this.f8468t2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("fancy_no_allocate_status");
        return null;
    }

    public final SliderView q5() {
        SliderView sliderView = this.O2;
        if (sliderView != null) {
            return sliderView;
        }
        l.v("sliderView");
        return null;
    }

    public final void q8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.A1 = linearLayout;
    }

    public final void q9(f fVar) {
        l.f(fVar, "<set-?>");
        this.H1 = fVar;
    }

    public final LinearLayout r4() {
        LinearLayout linearLayout = this.f8465s2;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("fancy_no_avaliable_status");
        return null;
    }

    public final FrameLayout r5() {
        FrameLayout frameLayout = this.f8417a2;
        if (frameLayout != null) {
            return frameLayout;
        }
        l.v("spinner_state_cust");
        return null;
    }

    public final void r8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8419b2 = linearLayout;
    }

    public final void r9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.Z1 = linearLayout;
    }

    public final LinearLayout s4() {
        LinearLayout linearLayout = this.Q1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("hc");
        return null;
    }

    public final Spinner s5() {
        Spinner spinner = this.W1;
        if (spinner != null) {
            return spinner;
        }
        l.v("state_change");
        return null;
    }

    public final void s8(TextView textView) {
        l.f(textView, "<set-?>");
        this.U1 = textView;
    }

    public final void s9(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.F1 = linearLayout;
    }

    public final LinearLayout t4() {
        LinearLayout linearLayout = this.f8420c1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("home_alert_layout");
        return null;
    }

    public final TextView t5() {
        TextView textView = this.V1;
        if (textView != null) {
            return textView;
        }
        l.v("state_change_title");
        return null;
    }

    public final void t8(TextView textView) {
        l.f(textView, "<set-?>");
        this.T1 = textView;
    }

    public final void t9(String str) {
        l.f(str, "<set-?>");
        this.R0 = str;
    }

    public final ImageView u4() {
        ImageView imageView = this.E0;
        if (imageView != null) {
            return imageView;
        }
        l.v("imgCitizen");
        return null;
    }

    public final TextView u5() {
        TextView textView = this.H2;
        if (textView != null) {
            return textView;
        }
        l.v("state_change_title_citizen");
        return null;
    }

    public final void u8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8468t2 = linearLayout;
    }

    public final void u9(g gVar) {
        l.f(gVar, "<set-?>");
        this.f8478x0 = gVar;
    }

    public final ImageView v4() {
        ImageView imageView = this.F0;
        if (imageView != null) {
            return imageView;
        }
        l.v("imgServices");
        return null;
    }

    public final TextView v5() {
        TextView textView = this.I0;
        if (textView != null) {
            return textView;
        }
        l.v("txtCitizen");
        return null;
    }

    public final void v8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8465s2 = linearLayout;
    }

    public final void v9(SliderView sliderView) {
        l.f(sliderView, "<set-?>");
        this.O2 = sliderView;
    }

    public final ImageView w4() {
        ImageView imageView = this.C0;
        if (imageView != null) {
            return imageView;
        }
        l.v("imgTrasnport");
        return null;
    }

    public final TextView w5() {
        TextView textView = this.H0;
        if (textView != null) {
            return textView;
        }
        l.v("txtDocs");
        return null;
    }

    public final void w8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.Q1 = linearLayout;
    }

    public final void w9(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.f8417a2 = frameLayout;
    }

    public final LinearLayout x4() {
        LinearLayout linearLayout = this.f8458q1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("info_layout");
        return null;
    }

    public final TextView x5() {
        TextView textView = this.J0;
        if (textView != null) {
            return textView;
        }
        l.v("txtServices");
        return null;
    }

    public final void x8(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.f8420c1 = linearLayout;
    }

    public final void x9(StateMaster stateMaster) {
        l.f(stateMaster, "it");
        try {
            if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                r5().setVisibility(0);
                c5().dismiss();
                t5().setText(z4().b(v9.f.f17510a.w(), "Following services are allowed for your current state"));
                ArrayList<State> states = stateMaster.getStates();
                l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>");
                Collections.sort(states);
                if (!states.get(0).getStateCode().equals("0")) {
                    states.add(0, new State("Select State", "0", false, false, 1));
                    if (states.size() > 1) {
                        states.add(states.get(1));
                    }
                }
                s5().setAdapter(new q8.a(q(), states));
                String q10 = p5().q();
                int size = states.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (p.o(q10, states.get(i10).getStateCode(), true)) {
                        s5().setSelection(i10);
                        return;
                    }
                }
                return;
            }
            r5().setVisibility(8);
            c5().dismiss();
            ArrayList arrayList = new ArrayList();
            Collections.sort(arrayList);
            arrayList.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList.size() > 1) {
                arrayList.add(arrayList.get(1));
            }
            s5().setAdapter(new q8.a(q(), arrayList));
        } catch (Exception e10) {
            r5().setVisibility(8);
            c5().dismiss();
            e10.printStackTrace();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList2.size() > 1) {
                arrayList2.add(arrayList2.get(1));
            }
            s5().setAdapter(new q8.a(q(), arrayList2));
        }
    }

    public void y(String str, int i10) {
    }

    public final LinearLayout y4() {
        LinearLayout linearLayout = this.C1;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("internationl_permit");
        return null;
    }

    public final TextView y5() {
        TextView textView = this.G0;
        if (textView != null) {
            return textView;
        }
        l.v("txtTrasnport");
        return null;
    }

    public final void y8(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.E0 = imageView;
    }

    public final void y9(StateMaster stateMaster) {
        l.f(stateMaster, "it");
        try {
            if (p.o(stateMaster.getStatusCode(), "MSTR001", true)) {
                c5().dismiss();
                ArrayList<State> states = stateMaster.getStates();
                l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>");
                ArrayList arrayList = new ArrayList();
                Collections.sort(states);
                if (!states.get(0).getStateCode().equals("0")) {
                    states.add(0, new State("Select State", "0", false, false, 1));
                    if (states.size() > 1) {
                        states.add(states.get(1));
                    }
                    int size = states.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (states.get(i10).isSentinal()) {
                            arrayList.add(states.get(i10));
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    u5().setVisibility(0);
                    u5().setText(z4().b(v9.f.f17510a.e(), "Citizen Sentinel service are allowed for current states"));
                    c4().setAdapter(new q8.a(q(), arrayList));
                    String q10 = p5().q();
                    int size2 = arrayList.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (p.o(q10, ((State) arrayList.get(i11)).getStateCode(), true)) {
                            c4().setSelection(i11);
                            return;
                        }
                    }
                    return;
                }
                u5().setText(z4().b("citizenNotavailable", "Currently Citizen Sentinel Service is not available"));
                b4().setVisibility(8);
                FrameLayout frameLayout = this.f8454p0;
                if (frameLayout == null) {
                    l.v("citizenSpinnerLinear");
                    frameLayout = null;
                }
                frameLayout.setVisibility(8);
                return;
            }
            c5().dismiss();
            ArrayList arrayList2 = new ArrayList();
            Collections.sort(arrayList2);
            arrayList2.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList2.size() > 1) {
                arrayList2.add(arrayList2.get(1));
            }
            c4().setAdapter(new q8.a(q(), arrayList2));
        } catch (Exception e10) {
            r5().setVisibility(8);
            c5().dismiss();
            e10.printStackTrace();
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(0, new State("Select State", "0", false, false, 1));
            if (arrayList3.size() > 1) {
                arrayList3.add(arrayList3.get(1));
            }
            c4().setAdapter(new q8.a(q(), arrayList3));
        }
    }

    public final ld.c z4() {
        ld.c cVar = this.f8483y2;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final TextView z5() {
        TextView textView = this.K0;
        if (textView != null) {
            return textView;
        }
        l.v("txt_citizen");
        return null;
    }

    public final void z8(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.D0 = imageView;
    }

    public final void z9(Spinner spinner) {
        l.f(spinner, "<set-?>");
        this.W1 = spinner;
    }
}
