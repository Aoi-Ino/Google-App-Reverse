package com.nic.mparivahan.Citizen.Activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.lifecycle.b0;
import androidx.lifecycle.t;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.nic.mparivahan.Account.Model.State;
import com.nic.mparivahan.Account.Model.StateMaster;
import com.nic.mparivahan.Citizen.Interfaces.OffenceInterface;
import com.nic.mparivahan.Citizen.Models.GetOffenceList;
import com.nic.mparivahan.Citizen.Models.GetStated;
import com.nic.mparivahan.Citizen.Models.MparOffence;
import com.nic.mparivahan.Citizen.Models.Name;
import com.nic.mparivahan.Citizen.Models.SubmitOffenceReport;
import com.nic.mparivahan.Citizen.Models.VerifyVehicleResponseModel;
import com.nic.mparivahan.Citizen.Models.Vhclass;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import d9.h1;
import d9.i1;
import d9.j1;
import d9.k1;
import d9.l1;
import d9.m1;
import d9.n1;
import d9.o1;
import d9.p1;
import d9.q1;
import d9.r1;
import d9.s1;
import d9.t1;
import d9.u1;
import d9.v1;
import d9.w1;
import d9.x1;
import d9.y1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import ka.c;
import lm.d0;
import lm.f0;
import ni.q7;
import pl.q;
import pl.x;
import v9.e;

public final class TrafficReportVioActivity extends androidx.appcompat.app.d {

    /* renamed from: l0  reason: collision with root package name */
    public static final a f7789l0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public q7 G;
    public k9.b H;
    public OffenceInterface I;
    public ld.g J;
    public String K;
    public EditText L;
    public TextView M;
    public Context N;
    private ArrayList O = new ArrayList();
    private int P;
    private int Q;
    public ArrayList R;
    public String S;
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private boolean Y;
    public ld.c Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f7790a0 = "NA";

    /* renamed from: b0  reason: collision with root package name */
    private String f7791b0 = "";
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public final List f7792c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    private String f7793d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    public bi.h f7794e0;

    /* renamed from: f0  reason: collision with root package name */
    public VahanProService f7795f0;

    /* renamed from: g0  reason: collision with root package name */
    private boolean f7796g0;

    /* renamed from: h0  reason: collision with root package name */
    private Dialog f7797h0;

    /* renamed from: i0  reason: collision with root package name */
    private final TextWatcher f7798i0 = new p(this);

    /* renamed from: j0  reason: collision with root package name */
    private d.c f7799j0;

    /* renamed from: k0  reason: collision with root package name */
    private d.c f7800k0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7801e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7801e = trafficReportVioActivity;
        }

        public final void b(GetStated getStated) {
            q7 q7Var = null;
            try {
                q7 y12 = this.f7801e.G;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28197v.setVisibility(8);
                if (p.o(getStated.getStatusCode(), "MSTR001", true)) {
                    this.f7801e.S2(getStated.getStates());
                    ArrayList e22 = this.f7801e.e2();
                    String string = this.f7801e.getResources().getString(R.string.select_state);
                    cm.l.e(string, "getString(...)");
                    e22.add(0, new Name(string, "0", false));
                    TrafficReportVioActivity trafficReportVioActivity = this.f7801e;
                    ArrayList N1 = trafficReportVioActivity.N1(trafficReportVioActivity, trafficReportVioActivity.e2());
                    e9.c cVar = new e9.c(this.f7801e, N1);
                    q7 y13 = this.f7801e.G;
                    if (y13 == null) {
                        cm.l.v("binding");
                        y13 = null;
                    }
                    y13.f28196u.setAdapter((SpinnerAdapter) cVar);
                    q7 y14 = this.f7801e.G;
                    if (y14 == null) {
                        cm.l.v("binding");
                        y14 = null;
                    }
                    AppCompatSpinner appCompatSpinner = y14.f28196u;
                    TrafficReportVioActivity trafficReportVioActivity2 = this.f7801e;
                    appCompatSpinner.setSelection(trafficReportVioActivity2.a2(trafficReportVioActivity2.d2(), N1));
                    q7 y15 = this.f7801e.G;
                    if (y15 == null) {
                        cm.l.v("binding");
                        y15 = null;
                    }
                    y15.f28196u.setEnabled(false);
                    return;
                }
                q7 y16 = this.f7801e.G;
                if (y16 == null) {
                    cm.l.v("binding");
                    y16 = null;
                }
                y16.f28197v.setVisibility(8);
            } catch (Exception e10) {
                q7 y17 = this.f7801e.G;
                if (y17 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var = y17;
                }
                q7Var.f28197v.setVisibility(8);
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStated) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7802e = trafficReportVioActivity;
        }

        public final void b(String str) {
            q7 y12 = this.f7802e.G;
            if (y12 == null) {
                cm.l.v("binding");
                y12 = null;
            }
            y12.f28197v.setVisibility(8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7803e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7803e = trafficReportVioActivity;
        }

        public final void b(VerifyVehicleResponseModel verifyVehicleResponseModel) {
            TrafficReportVioActivity trafficReportVioActivity;
            q7 q7Var = null;
            try {
                if (p.o(verifyVehicleResponseModel.getStatusCode(), "NP001", true)) {
                    q7 y12 = this.f7803e.G;
                    if (y12 == null) {
                        cm.l.v("binding");
                        y12 = null;
                    }
                    y12.f28197v.setVisibility(8);
                    this.f7803e.O2(true);
                    trafficReportVioActivity = this.f7803e;
                } else if (p.o(verifyVehicleResponseModel.getStatusCode(), "NR005", true)) {
                    q7 y13 = this.f7803e.G;
                    if (y13 == null) {
                        cm.l.v("binding");
                        y13 = null;
                    }
                    y13.f28179d.setEnabled(true);
                    q7 y14 = this.f7803e.G;
                    if (y14 == null) {
                        cm.l.v("binding");
                        y14 = null;
                    }
                    y14.f28179d.setAlpha(1.0f);
                    q7 y15 = this.f7803e.G;
                    if (y15 == null) {
                        cm.l.v("binding");
                        y15 = null;
                    }
                    y15.f28197v.setVisibility(8);
                    this.f7803e.O2(false);
                    return;
                } else {
                    q7 y16 = this.f7803e.G;
                    if (y16 == null) {
                        cm.l.v("binding");
                        y16 = null;
                    }
                    y16.f28179d.setEnabled(true);
                    q7 y17 = this.f7803e.G;
                    if (y17 == null) {
                        cm.l.v("binding");
                        y17 = null;
                    }
                    y17.f28179d.setAlpha(1.0f);
                    q7 y18 = this.f7803e.G;
                    if (y18 == null) {
                        cm.l.v("binding");
                        y18 = null;
                    }
                    y18.f28197v.setVisibility(8);
                    this.f7803e.O2(false);
                    trafficReportVioActivity = this.f7803e;
                }
                trafficReportVioActivity.b3();
            } catch (Exception e10) {
                e10.printStackTrace();
                q7 y19 = this.f7803e.G;
                if (y19 == null) {
                    cm.l.v("binding");
                    y19 = null;
                }
                y19.f28179d.setEnabled(true);
                q7 y110 = this.f7803e.G;
                if (y110 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var = y110;
                }
                q7Var.f28179d.setAlpha(1.0f);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VerifyVehicleResponseModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7804e = trafficReportVioActivity;
        }

        public final void b(String str) {
            q7 y12 = this.f7804e.G;
            q7 q7Var = null;
            if (y12 == null) {
                cm.l.v("binding");
                y12 = null;
            }
            y12.f28197v.setVisibility(8);
            this.f7804e.O2(false);
            q7 y13 = this.f7804e.G;
            if (y13 == null) {
                cm.l.v("binding");
                y13 = null;
            }
            y13.f28179d.setEnabled(true);
            q7 y14 = this.f7804e.G;
            if (y14 == null) {
                cm.l.v("binding");
            } else {
                q7Var = y14;
            }
            q7Var.f28179d.setAlpha(1.0f);
            this.f7804e.b3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7805e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7805e = trafficReportVioActivity;
        }

        public final void b(Vhclass vhclass) {
            q7 q7Var = null;
            try {
                this.f7805e.P2(false);
                q7 y12 = this.f7805e.G;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28197v.setVisibility(8);
                if (vhclass.getApiMessage().getStatusCode() == 200) {
                    new ArrayList();
                    ArrayList m22 = this.f7805e.m2(String.valueOf(vhclass.getData().getVhClass()), this.f7805e.Z1());
                    if (m22.size() > 0) {
                        m22.add(0, new MparOffence("Select Violation", 0, 0, "0"));
                        e9.e eVar = new e9.e(this.f7805e, m22);
                        q7 y13 = this.f7805e.G;
                        if (y13 == null) {
                            cm.l.v("binding");
                            y13 = null;
                        }
                        y13.f28177b.setAdapter((SpinnerAdapter) eVar);
                        return;
                    }
                    m22.add(0, new MparOffence("Select Violation", 0, 0, "0"));
                    e9.e eVar2 = new e9.e(this.f7805e, m22);
                    q7 y14 = this.f7805e.G;
                    if (y14 == null) {
                        cm.l.v("binding");
                        y14 = null;
                    }
                    y14.f28177b.setAdapter((SpinnerAdapter) eVar2);
                    ld.c cVar = new ld.c(this.f7805e);
                    TrafficReportVioActivity trafficReportVioActivity = this.f7805e;
                    trafficReportVioActivity.y2(cVar.b("noOffence", trafficReportVioActivity.getString(R.string.no_offence)));
                    return;
                }
                q7 y15 = this.f7805e.G;
                if (y15 == null) {
                    cm.l.v("binding");
                    y15 = null;
                }
                y15.f28184i.setText("");
            } catch (Exception e10) {
                q7 y16 = this.f7805e.G;
                if (y16 == null) {
                    cm.l.v("binding");
                    y16 = null;
                }
                y16.f28184i.setText("");
                q7 y17 = this.f7805e.G;
                if (y17 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var = y17;
                }
                q7Var.f28197v.setVisibility(8);
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Vhclass) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7806e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7806e = trafficReportVioActivity;
        }

        public final void b(String str) {
            this.f7806e.P2(false);
            q7 y12 = this.f7806e.G;
            q7 q7Var = null;
            if (y12 == null) {
                cm.l.v("binding");
                y12 = null;
            }
            y12.f28197v.setVisibility(8);
            if (p.o(str, "error", true)) {
                q7 y13 = this.f7806e.G;
                if (y13 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var = y13;
                }
                q7Var.f28184i.setText("");
                this.f7806e.y2("Vehicle Details not found!");
                return;
            }
            q7 y14 = this.f7806e.G;
            if (y14 == null) {
                cm.l.v("binding");
            } else {
                q7Var = y14;
            }
            q7Var.f28184i.setText("");
            this.f7806e.y2(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7807e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7807e = trafficReportVioActivity;
        }

        public final void b(GetOffenceList getOffenceList) {
            try {
                q7 y12 = this.f7807e.G;
                q7 q7Var = null;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28197v.setVisibility(8);
                if (p.o(getOffenceList.getStatusCode(), "MSTR001", true)) {
                    this.f7807e.N2(getOffenceList.getMparOffenceList());
                    this.f7807e.Z1().add(0, new MparOffence("Select Violation", 0, 0, "0"));
                    TrafficReportVioActivity trafficReportVioActivity = this.f7807e;
                    e9.e eVar = new e9.e(trafficReportVioActivity, trafficReportVioActivity.Z1());
                    q7 y13 = this.f7807e.G;
                    if (y13 == null) {
                        cm.l.v("binding");
                    } else {
                        q7Var = y13;
                    }
                    q7Var.f28177b.setAdapter((SpinnerAdapter) eVar);
                    return;
                }
                q7 y14 = this.f7807e.G;
                if (y14 == null) {
                    cm.l.v("binding");
                    y14 = null;
                }
                y14.f28179d.setAlpha(0.5f);
                q7 y15 = this.f7807e.G;
                if (y15 == null) {
                    cm.l.v("binding");
                    y15 = null;
                }
                y15.f28179d.setEnabled(false);
                q7 y16 = this.f7807e.G;
                if (y16 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var = y16;
                }
                q7Var.f28184i.setEnabled(false);
                this.f7807e.w2(this.f7807e.b2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + ' ' + this.f7807e.d2() + ' ' + this.f7807e.b2().b("vahan_state", "State"));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetOffenceList) obj);
            return x.f30437a;
        }
    }

    public static final class i implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7808e;

        i(TrafficReportVioActivity trafficReportVioActivity) {
            this.f7808e = trafficReportVioActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            try {
                this.f7808e.K2(i10);
                if (this.f7808e.Z1().size() > 0) {
                    q7 y12 = this.f7808e.G;
                    if (y12 == null) {
                        cm.l.v("binding");
                        y12 = null;
                    }
                    if (y12.f28177b.getSelectedItemPosition() > 0) {
                        TrafficReportVioActivity trafficReportVioActivity = this.f7808e;
                        trafficReportVioActivity.M2(((MparOffence) trafficReportVioActivity.Z1().get(i10)).getOffenceChallanId());
                    }
                }
            } catch (Exception unused) {
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class j implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7809e;

        j(TrafficReportVioActivity trafficReportVioActivity) {
            this.f7809e = trafficReportVioActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            q7 q7Var = null;
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            q7 y12 = this.f7809e.G;
            if (y12 == null) {
                cm.l.v("binding");
            } else {
                q7Var = y12;
            }
            Object selectedItem = q7Var.f28196u.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.Citizen.Models.Name");
            Name name = (Name) selectedItem;
            TrafficReportVioActivity trafficReportVioActivity = this.f7809e;
            String str = "Select State";
            if (!p.o(name.getName(), str, true)) {
                str = name.getStateCode();
            }
            trafficReportVioActivity.T2(str);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class k extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7810e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7810e = trafficReportVioActivity;
        }

        public final void b(SubmitOffenceReport submitOffenceReport) {
            try {
                q7 y12 = this.f7810e.G;
                q7 q7Var = null;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28179d.setEnabled(true);
                q7 y13 = this.f7810e.G;
                if (y13 == null) {
                    cm.l.v("binding");
                    y13 = null;
                }
                y13.f28179d.setAlpha(1.0f);
                q7 y14 = this.f7810e.G;
                if (y14 == null) {
                    cm.l.v("binding");
                    y14 = null;
                }
                y14.f28197v.setVisibility(8);
                if (cm.l.a(submitOffenceReport.getStatusCode(), "TRV001")) {
                    q7 y15 = this.f7810e.G;
                    if (y15 == null) {
                        cm.l.v("binding");
                    } else {
                        q7Var = y15;
                    }
                    q7Var.f28177b.setSelection(0);
                    this.f7810e.A2("Your complaint has been registered successfully");
                    return;
                }
                this.f7810e.y2(submitOffenceReport.getStatusDesc());
            } catch (Exception unused) {
                this.f7810e.y2("Something went wrong, Please try after some time!");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitOffenceReport) obj);
            return x.f30437a;
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7811e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(TrafficReportVioActivity trafficReportVioActivity) {
            super(1);
            this.f7811e = trafficReportVioActivity;
        }

        public final void b(String str) {
            q7 y12 = this.f7811e.G;
            q7 q7Var = null;
            if (y12 == null) {
                cm.l.v("binding");
                y12 = null;
            }
            y12.f28179d.setEnabled(true);
            q7 y13 = this.f7811e.G;
            if (y13 == null) {
                cm.l.v("binding");
                y13 = null;
            }
            y13.f28179d.setAlpha(1.0f);
            q7 y14 = this.f7811e.G;
            if (y14 == null) {
                cm.l.v("binding");
            } else {
                q7Var = y14;
            }
            q7Var.f28197v.setVisibility(8);
            this.f7811e.y2("Something went wrong, Please try after some time!");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class m extends kotlin.coroutines.jvm.internal.l implements bm.p {

        /* renamed from: f  reason: collision with root package name */
        int f7812f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7813g;

        public static final class a implements v1.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ TrafficReportVioActivity f7814a;

            a(TrafficReportVioActivity trafficReportVioActivity) {
                this.f7814a = trafficReportVioActivity;
            }

            public void a(int i10) {
                Log.wtf("TAG", "compression has been cancelled");
            }

            public void b(int i10, float f10) {
                q7 y12 = this.f7814a.G;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28197v.setVisibility(0);
            }

            public void c(int i10, long j10, String str) {
                q7 y12 = this.f7814a.G;
                if (y12 == null) {
                    cm.l.v("binding");
                    y12 = null;
                }
                y12.f28187l.setBackgroundResource(R.drawable.video_uploaded);
                TrafficReportVioActivity trafficReportVioActivity = this.f7814a;
                trafficReportVioActivity.M1((Uri) trafficReportVioActivity.f7792c0.get(i10));
            }

            public void d(int i10) {
            }

            public void e(int i10, String str) {
                cm.l.f(str, "failureMessage");
                Log.wtf("failureMessage", str);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(TrafficReportVioActivity trafficReportVioActivity, tl.d dVar) {
            super(2, dVar);
            this.f7813g = trafficReportVioActivity;
        }

        /* renamed from: b */
        public final Object h(d0 d0Var, tl.d dVar) {
            return ((m) create(d0Var, dVar)).invokeSuspend(x.f30437a);
        }

        public final tl.d create(Object obj, tl.d dVar) {
            return new m(this.f7813g, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.c();
            if (this.f7812f == 0) {
                q.b(obj);
                Context applicationContext = this.f7813g.getApplicationContext();
                cm.l.e(applicationContext, "getApplicationContext(...)");
                List A1 = this.f7813g.f7792c0;
                x1.d dVar = new x1.d(x1.c.movies, "mparivahan-citizen-videos");
                v1.e eVar = v1.e.LOW;
                Iterable<Uri> A12 = this.f7813g.f7792c0;
                ArrayList arrayList = new ArrayList(r.s(A12, 10));
                for (Uri pathSegments : A12) {
                    List<String> pathSegments2 = pathSegments.getPathSegments();
                    cm.l.e(pathSegments2, "getPathSegments(...)");
                    arrayList.add((String) y.e0(pathSegments2));
                }
                v1.d.j(applicationContext, A1, false, dVar, (x1.a) null, new x1.b(eVar, true, (Integer) null, false, false, (Double) null, (Double) null, arrayList, f.j.K0, (cm.g) null), new a(this.f7813g), 16, (Object) null);
                return x.f30437a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class n implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7815a;

        n(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f7815a = lVar;
        }

        public final pl.c a() {
            return this.f7815a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7815a.invoke(obj);
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

    public static final class o extends i4.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7816a;

        o(TrafficReportVioActivity trafficReportVioActivity) {
            this.f7816a = trafficReportVioActivity;
        }

        public void b(LocationResult locationResult) {
            cm.l.f(locationResult, "locationResult");
            super.b(locationResult);
            for (Location location : locationResult.c()) {
                this.f7816a.U1(location.getLatitude(), location.getLongitude());
            }
        }
    }

    public static final class p implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TrafficReportVioActivity f7817e;

        p(TrafficReportVioActivity trafficReportVioActivity) {
            this.f7817e = trafficReportVioActivity;
        }

        public void afterTextChanged(Editable editable) {
            cm.l.f(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            cm.l.f(charSequence, "s");
            this.f7817e.P2(false);
        }
    }

    public TrafficReportVioActivity() {
        d.c y02 = y0(new e.d(), new i1(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f7799j0 = y02;
        d.c y03 = y0(new e.d(), new j1(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f7800k0 = y03;
    }

    /* access modifiers changed from: private */
    public final void A2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new k1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void B2(Dialog dialog, TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(trafficReportVioActivity, "this$0");
        dialog.dismiss();
        q7 q7Var = trafficReportVioActivity.G;
        q7 q7Var2 = null;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        q7Var.f28184i.setText("");
        q7 q7Var3 = trafficReportVioActivity.G;
        if (q7Var3 == null) {
            cm.l.v("binding");
            q7Var3 = null;
        }
        q7Var3.f28196u.setPrompt("Select State");
        q7 q7Var4 = trafficReportVioActivity.G;
        if (q7Var4 == null) {
            cm.l.v("binding");
            q7Var4 = null;
        }
        q7Var4.f28196u.setSelection(0);
        q7 q7Var5 = trafficReportVioActivity.G;
        if (q7Var5 == null) {
            cm.l.v("binding");
        } else {
            q7Var2 = q7Var5;
        }
        q7Var2.f28180e.setText("");
    }

    private final void C2() {
        q7 q7Var = this.G;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        q7Var.f28187l.setBackgroundResource(R.drawable.video_uploaded);
        lm.k1 unused = g.d(t.a(this), (tl.g) null, (f0) null, new m(this, (tl.d) null), 3, (Object) null);
    }

    private final void D2() {
        Intent intent = cm.l.a(Environment.getExternalStorageState(), "mounted") ? new Intent("android.intent.action.PICK", MediaStore.Video.Media.EXTERNAL_CONTENT_URI) : new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        intent.setType("video/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.sizeLimit", 8388608);
        intent.putExtra("return-data", true);
        this.f7800k0.a(intent);
    }

    private final void F1() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.enable_gps_location);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_allow);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new o1(dialog));
        ((TextView) findViewById).setOnClickListener(new p1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void G2() {
        i4.b a10 = i4.e.a(this);
        cm.l.e(a10, "getFusedLocationProviderClient(...)");
        LocationRequest q10 = new LocationRequest().p(600000).o(600000).q(100);
        cm.l.e(q10, "setPriority(...)");
        if (androidx.core.content.a.a(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || androidx.core.content.a.a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            a10.a(q10, new o(this), Looper.myLooper());
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(Dialog dialog, TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(trafficReportVioActivity, "this$0");
        dialog.dismiss();
        trafficReportVioActivity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    private final void J1() {
        try {
            this.T = "gallery";
            this.f7799j0.a(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI));
        } catch (Exception unused) {
        }
    }

    private final void K1() {
        this.U = "";
        this.V = "";
        q7 q7Var = this.G;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        q7Var.f28186k.setBackgroundResource(R.drawable.ic_photo_add);
    }

    private final void L1() {
        this.W = "";
        this.X = "";
        q7 q7Var = this.G;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        q7Var.f28187l.setImageResource(R.drawable.ic_video_add);
    }

    /* access modifiers changed from: private */
    public final void M1(Uri uri) {
        try {
            InputStream openInputStream = getContentResolver().openInputStream(uri);
            cm.l.c(openInputStream);
            byte[] O1 = O1(openInputStream);
            cm.l.c(O1);
            String encodeToString = Base64.encodeToString(O1, 0);
            cm.l.e(encodeToString, "encodeToString(...)");
            this.W = encodeToString;
            this.W = p.w(p.w(encodeToString, "\n", "", false, 4, (Object) null), "\r", "", false, 4, (Object) null);
        } catch (Exception e10) {
            e10.printStackTrace();
            Log.d("error", "onActivityResult: " + e10);
        }
    }

    private final String S1(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        cm.l.e(contentResolver, "getContentResolver(...)");
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        cm.l.e(singleton, "getSingleton(...)");
        cm.l.c(uri);
        return singleton.getExtensionFromMimeType(contentResolver.getType(uri));
    }

    /* access modifiers changed from: private */
    public static final void T1(TrafficReportVioActivity trafficReportVioActivity, d.a aVar) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = trafficReportVioActivity.T;
            if (cm.l.a(str, "camera")) {
                if (c10 != null) {
                    trafficReportVioActivity.W2(c10);
                }
            } else if (cm.l.a(str, "gallery") && c10 != null) {
                trafficReportVioActivity.n2(c10);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.f7793d0 = r8.f7790a0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x006a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U1(double r9, double r11) {
        /*
            r8 = this;
            java.lang.String r0 = "getString(...)"
            r1 = 2132018286(0x7f14046e, float:1.9674874E38)
            android.location.Geocoder r2 = new android.location.Geocoder     // Catch:{ Exception -> 0x0092 }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0092 }
            r2.<init>(r8, r3)     // Catch:{ Exception -> 0x0092 }
            r7 = 1
            r3 = r9
            r5 = r11
            java.util.List r9 = r2.getFromLocation(r3, r5, r7)     // Catch:{ Exception -> 0x0092 }
            cm.l.c(r9)     // Catch:{ Exception -> 0x0092 }
            r10 = 0
            java.lang.Object r11 = r9.get(r10)     // Catch:{ Exception -> 0x0092 }
            android.location.Address r11 = (android.location.Address) r11     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = r11.getAdminArea()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r12 = "getAdminArea(...)"
            cm.l.e(r11, r12)     // Catch:{ Exception -> 0x0092 }
            r8.f7790a0 = r11     // Catch:{ Exception -> 0x0092 }
            java.lang.String r12 = "OD"
            r2 = 1
            boolean r11 = km.p.o(r11, r12, r2)     // Catch:{ Exception -> 0x006a }
            if (r11 != 0) goto L_0x0047
            java.lang.String r11 = r8.f7790a0     // Catch:{ Exception -> 0x006a }
            java.lang.String r12 = "OR"
            boolean r11 = km.p.o(r11, r12, r2)     // Catch:{ Exception -> 0x006a }
            if (r11 != 0) goto L_0x0047
            java.lang.String r11 = r8.f7790a0     // Catch:{ Exception -> 0x006a }
            java.lang.String r12 = "odisha"
            boolean r11 = km.p.o(r11, r12, r2)     // Catch:{ Exception -> 0x006a }
            if (r11 == 0) goto L_0x0058
        L_0x0047:
            ni.q7 r11 = r8.G     // Catch:{ Exception -> 0x006a }
            if (r11 != 0) goto L_0x0051
            java.lang.String r11 = "binding"
            cm.l.v(r11)     // Catch:{ Exception -> 0x006a }
            r11 = 0
        L_0x0051:
            android.widget.LinearLayout r11 = r11.f28188m     // Catch:{ Exception -> 0x006a }
            r12 = 8
            r11.setVisibility(r12)     // Catch:{ Exception -> 0x006a }
        L_0x0058:
            java.lang.Object r11 = r9.get(r10)     // Catch:{ Exception -> 0x006a }
            android.location.Address r11 = (android.location.Address) r11     // Catch:{ Exception -> 0x006a }
            java.lang.String r11 = r11.getSubLocality()     // Catch:{ Exception -> 0x006a }
            java.lang.String r12 = "getSubLocality(...)"
            cm.l.e(r11, r12)     // Catch:{ Exception -> 0x006a }
            r8.f7793d0 = r11     // Catch:{ Exception -> 0x006a }
            goto L_0x006e
        L_0x006a:
            java.lang.String r11 = r8.f7790a0     // Catch:{ Exception -> 0x0092 }
            r8.f7793d0 = r11     // Catch:{ Exception -> 0x0092 }
        L_0x006e:
            ka.c$a r11 = ka.c.f13158a     // Catch:{ Exception -> 0x0092 }
            android.widget.EditText r12 = r8.Q1()     // Catch:{ Exception -> 0x0092 }
            android.text.Editable r12 = r12.getText()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0092 }
            boolean r11 = r11.m(r12)     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x0094
            k9.b r11 = r8.X1()     // Catch:{ Exception -> 0x0092 }
            v9.d$a r12 = v9.d.f17494a     // Catch:{ Exception -> 0x0092 }
            java.lang.String r2 = r8.f7790a0     // Catch:{ Exception -> 0x0092 }
            java.lang.String r12 = r12.x(r2)     // Catch:{ Exception -> 0x0092 }
            r11.W(r12)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0094
        L_0x0092:
            r9 = move-exception
            goto L_0x00c7
        L_0x0094:
            boolean r11 = r9.isEmpty()     // Catch:{ Exception -> 0x0092 }
            if (r11 == 0) goto L_0x00a9
            android.content.res.Resources r9 = r8.getResources()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r9 = r9.getString(r1)     // Catch:{ Exception -> 0x0092 }
            cm.l.e(r9, r0)     // Catch:{ Exception -> 0x0092 }
            r8.L2(r9)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00d8
        L_0x00a9:
            java.lang.Object r9 = r9.get(r10)     // Catch:{ Exception -> 0x0092 }
            android.location.Address r9 = (android.location.Address) r9     // Catch:{ Exception -> 0x0092 }
            java.lang.String r9 = r9.getAddressLine(r10)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r10 = "getAddressLine(...)"
            cm.l.e(r9, r10)     // Catch:{ Exception -> 0x0092 }
            r8.L2(r9)     // Catch:{ Exception -> 0x0092 }
            android.widget.EditText r9 = r8.Q1()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r10 = r8.Y1()     // Catch:{ Exception -> 0x0092 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0092 }
            goto L_0x00d8
        L_0x00c7:
            android.content.res.Resources r10 = r8.getResources()
            java.lang.String r10 = r10.getString(r1)
            cm.l.e(r10, r0)
            r8.L2(r10)
            r9.printStackTrace()
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity.U1(double, double):void");
    }

    private final void W2(Intent intent) {
        Bundle extras = intent.getExtras();
        q7 q7Var = null;
        Bitmap bitmap = (Bitmap) (extras != null ? extras.get("data") : null);
        cm.l.c(bitmap);
        this.U = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        q7 q7Var2 = this.G;
        if (q7Var2 == null) {
            cm.l.v("binding");
        } else {
            q7Var = q7Var2;
        }
        q7Var.f28186k.setBackgroundResource(R.drawable.uploaded_img);
        this.V = "img_" + System.currentTimeMillis() + ".jpg";
    }

    private final void X2() {
        String[] strArr;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        if (this.U.length() > 0) {
            if (p.o(this.f7790a0, "odisha", true)) {
                strArr = new String[]{"Capture photo from camera", "Remove photo"};
                builder.setItems((CharSequence[]) strArr, new h1(this));
                builder.show();
            }
        } else if (p.o(this.f7790a0, "odisha", true)) {
            strArr = new String[]{"Capture photo from camera"};
            builder.setItems((CharSequence[]) strArr, new h1(this));
            builder.show();
        }
        strArr = new String[]{"Select photo from gallery", "Capture photo from camera", "Remove photo"};
        builder.setItems((CharSequence[]) strArr, new h1(this));
        builder.show();
    }

    /* access modifiers changed from: private */
    public static final void Y2(TrafficReportVioActivity trafficReportVioActivity, DialogInterface dialogInterface, int i10) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (p.o(trafficReportVioActivity.f7790a0, "odisha", true)) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            trafficReportVioActivity.c3();
            return;
        } else if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            }
            trafficReportVioActivity.c3();
            return;
        } else {
            trafficReportVioActivity.J1();
            return;
        }
        trafficReportVioActivity.K1();
    }

    private final void Z2() {
        String[] strArr;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("mParivahan");
        if (this.W.length() > 0) {
            if (p.o(this.f7790a0, "odisha", true) || p.o(this.f7790a0, "Delhi", true)) {
                strArr = new String[]{"Capture video from camera", "Remove video"};
                builder.setItems((CharSequence[]) strArr, new q1(this));
                builder.show();
            }
        } else if (p.o(this.f7790a0, "odisha", true) || p.o(this.f7790a0, "Delhi", true)) {
            strArr = new String[]{"Capture video from camera"};
            builder.setItems((CharSequence[]) strArr, new q1(this));
            builder.show();
        }
        strArr = new String[]{"Select video from gallery", "Capture video from camera", "Remove video"};
        builder.setItems((CharSequence[]) strArr, new q1(this));
        builder.show();
    }

    /* access modifiers changed from: private */
    public static final void a3(TrafficReportVioActivity trafficReportVioActivity, DialogInterface dialogInterface, int i10) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (p.o(trafficReportVioActivity.f7790a0, "odisha", true) || p.o(trafficReportVioActivity.f7790a0, "Delhi", true)) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    return;
                }
            }
            trafficReportVioActivity.d3();
            return;
        } else if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
            }
            trafficReportVioActivity.d3();
            return;
        } else {
            trafficReportVioActivity.D2();
            return;
        }
        trafficReportVioActivity.L1();
    }

    /* access modifiers changed from: private */
    public final void b3() {
        k9.b X1;
        String k10;
        String str;
        String str2;
        String valueOf;
        String obj;
        String valueOf2;
        int i10;
        String valueOf3;
        String obj2;
        String f22;
        String n10;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z10;
        String l10;
        String e10;
        try {
            String string = Settings.Secure.getString(V1().getContentResolver(), "android_id");
            Object systemService = getSystemService("location");
            cm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                j9.a aVar = new j9.a(this);
                if (Y1() != null) {
                    q7 q7Var = null;
                    if (cm.l.a(Y1(), getResources().getString(R.string.location_not_find))) {
                        q7 q7Var2 = this.G;
                        if (q7Var2 == null) {
                            cm.l.v("binding");
                            q7Var2 = null;
                        }
                        q7Var2.f28197v.setVisibility(0);
                        X1 = X1();
                        k10 = c2().k();
                        str = "1";
                        str2 = this.f7793d0;
                        valueOf = String.valueOf(aVar.f12765j);
                        obj = Q1().getText().toString();
                        valueOf2 = String.valueOf(aVar.f12766k);
                        i10 = this.Q;
                        q7 q7Var3 = this.G;
                        if (q7Var3 == null) {
                            cm.l.v("binding");
                            q7Var3 = null;
                        }
                        valueOf3 = String.valueOf(q7Var3.f28184i.getText());
                        q7 q7Var4 = this.G;
                        if (q7Var4 == null) {
                            cm.l.v("binding");
                        } else {
                            q7Var = q7Var4;
                        }
                        obj2 = q7Var.f28180e.getText().toString();
                        f22 = f2();
                        n10 = c2().n();
                        String str7 = this.U;
                        str3 = this.V;
                        str4 = this.W;
                        str5 = str7;
                        str6 = this.X;
                        z10 = this.Y;
                        l10 = c2().l();
                        cm.l.c(string);
                        e10 = c2().e();
                    } else {
                        q7 q7Var5 = this.G;
                        if (q7Var5 == null) {
                            cm.l.v("binding");
                            q7Var5 = null;
                        }
                        q7Var5.f28197v.setVisibility(0);
                        X1 = X1();
                        k10 = c2().k();
                        str = "1";
                        str2 = this.f7793d0;
                        valueOf = String.valueOf(aVar.f12765j);
                        obj = Q1().getText().toString();
                        valueOf2 = String.valueOf(aVar.f12766k);
                        i10 = this.Q;
                        q7 q7Var6 = this.G;
                        if (q7Var6 == null) {
                            cm.l.v("binding");
                            q7Var6 = null;
                        }
                        valueOf3 = String.valueOf(q7Var6.f28184i.getText());
                        q7 q7Var7 = this.G;
                        if (q7Var7 == null) {
                            cm.l.v("binding");
                        } else {
                            q7Var = q7Var7;
                        }
                        obj2 = q7Var.f28180e.getText().toString();
                        f22 = f2();
                        n10 = c2().n();
                        String str8 = this.U;
                        str3 = this.V;
                        str4 = this.W;
                        str5 = str8;
                        str6 = this.X;
                        z10 = this.Y;
                        l10 = c2().l();
                        cm.l.c(string);
                        e10 = c2().e();
                    }
                    String str9 = str4;
                    X1.a0(k10, str, str2, valueOf, obj, valueOf2, i10, valueOf3, obj2, f22, n10, str5, str3, str9, str6, z10, l10, string, e10);
                    return;
                }
            }
            F1();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private final void c3() {
        d.c cVar;
        Intent intent;
        try {
            if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
                this.T = "camera";
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                cVar = this.f7799j0;
                intent = getIntent();
            } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
                this.T = "camera";
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                cVar = this.f7799j0;
                intent = getIntent();
            } else {
                return;
            }
            cVar.a(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void d3() {
        Intent intent;
        this.f7791b0 = "videoType";
        this.T = "";
        if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
        } else {
            return;
        }
        setIntent(intent);
        getIntent().putExtra("return-data", true);
        getIntent().putExtra("android.intent.extra.videoQuality", 1);
        getIntent().putExtra("android.intent.extra.durationLimit", 40);
        this.f7800k0.a(getIntent());
    }

    /* access modifiers changed from: private */
    public static final void h2(Calendar calendar, TrafficReportVioActivity trafficReportVioActivity, TimePicker timePicker, int i10, int i11) {
        cm.l.f(trafficReportVioActivity, "this$0");
        calendar.set(11, i10);
        calendar.set(12, i11);
        trafficReportVioActivity.R1().setText(new SimpleDateFormat("HH:mm", Locale.US).format(calendar.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void l2(TrafficReportVioActivity trafficReportVioActivity, d.a aVar) {
        Long l10;
        cm.l.f(trafficReportVioActivity, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            q7 q7Var = null;
            Uri data = c10 != null ? c10.getData() : null;
            if (data != null) {
                try {
                    l10 = Long.valueOf(trafficReportVioActivity.k2(data));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            } else {
                l10 = null;
            }
            if (com.nic.mparivahan.dlservices.utilities.d.d(l10)) {
                cm.l.c(l10);
                if (((int) l10.longValue()) <= 8000000) {
                    trafficReportVioActivity.M1(data);
                    q7 q7Var2 = trafficReportVioActivity.G;
                    if (q7Var2 == null) {
                        cm.l.v("binding");
                    } else {
                        q7Var = q7Var2;
                    }
                    q7Var.f28187l.setBackgroundResource(R.drawable.video_uploaded);
                    StringBuilder sb2 = new StringBuilder();
                    String lastPathSegment = data.getLastPathSegment();
                    cm.l.c(lastPathSegment);
                    sb2.append(lastPathSegment);
                    sb2.append('.');
                    sb2.append(trafficReportVioActivity.S1(data));
                    trafficReportVioActivity.X = sb2.toString();
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            cm.l.c(data);
            String lastPathSegment2 = data.getLastPathSegment();
            cm.l.c(lastPathSegment2);
            sb3.append(lastPathSegment2);
            sb3.append('.');
            sb3.append(trafficReportVioActivity.S1(data));
            trafficReportVioActivity.X = sb3.toString();
            ClipData clipData = c10.getClipData();
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i10 = 0; i10 < itemCount; i10++) {
                    ClipData.Item itemAt = clipData.getItemAt(i10);
                    List list = trafficReportVioActivity.f7792c0;
                    Uri uri = itemAt.getUri();
                    cm.l.e(uri, "getUri(...)");
                    list.add(uri);
                }
            } else if (c10.getData() != null) {
                Uri data2 = c10.getData();
                List list2 = trafficReportVioActivity.f7792c0;
                cm.l.c(data2);
                list2.add(data2);
            } else {
                return;
            }
            trafficReportVioActivity.C2();
        }
    }

    private final void n2(Intent intent) {
        Bitmap bitmap;
        Uri data = intent.getData();
        try {
            if (Build.VERSION.SDK_INT > 27) {
                ContentResolver contentResolver = getContentResolver();
                cm.l.c(data);
                ImageDecoder.Source a10 = ImageDecoder.createSource(contentResolver, data);
                cm.l.e(a10, "createSource(...)");
                bitmap = ImageDecoder.decodeBitmap(a10);
            } else {
                bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), data);
            }
            cm.l.c(bitmap);
            q7 q7Var = this.G;
            String str = null;
            if (q7Var == null) {
                cm.l.v("binding");
                q7Var = null;
            }
            q7Var.f28186k.setBackgroundResource(R.drawable.uploaded_img);
            this.U = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
            StringBuilder sb2 = new StringBuilder();
            if (data != null) {
                str = data.getLastPathSegment();
            }
            cm.l.c(str);
            sb2.append(str);
            sb2.append('.');
            sb2.append(S1(data));
            this.V = sb2.toString();
        } catch (IOException e10) {
            e10.printStackTrace();
            Toast.makeText(this, "Failed!", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void o2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        trafficReportVioActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void p2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        trafficReportVioActivity.startActivity(new Intent(trafficReportVioActivity, TrafficHistoryActivity.class));
        trafficReportVioActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void q2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        trafficReportVioActivity.startActivity(new Intent(trafficReportVioActivity, TrafficDashboardActivity.class));
        trafficReportVioActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void r2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        String b10;
        cm.l.f(trafficReportVioActivity, "this$0");
        try {
            if (trafficReportVioActivity.P != 0) {
                q7 q7Var = trafficReportVioActivity.G;
                q7 q7Var2 = null;
                if (q7Var == null) {
                    cm.l.v("binding");
                    q7Var = null;
                }
                Editable text = q7Var.f28184i.getText();
                cm.l.c(text);
                if (text.length() != 0) {
                    q7 q7Var3 = trafficReportVioActivity.G;
                    if (q7Var3 == null) {
                        cm.l.v("binding");
                        q7Var3 = null;
                    }
                    Editable text2 = q7Var3.f28184i.getText();
                    cm.l.c(text2);
                    if (text2.length() > 4) {
                        q7 q7Var4 = trafficReportVioActivity.G;
                        if (q7Var4 == null) {
                            cm.l.v("binding");
                            q7Var4 = null;
                        }
                        if (!new km.f("[a-zA-Z0-9]*").a(String.valueOf(q7Var4.f28184i.getText()))) {
                            q7 q7Var5 = trafficReportVioActivity.G;
                            if (q7Var5 == null) {
                                cm.l.v("binding");
                            } else {
                                q7Var2 = q7Var5;
                            }
                            q7Var2.f28184i.requestFocus();
                            b10 = trafficReportVioActivity.b2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character");
                        } else {
                            Editable text3 = trafficReportVioActivity.Q1().getText();
                            cm.l.e(text3, "getText(...)");
                            if (text3.length() == 0) {
                                trafficReportVioActivity.Q1().requestFocus();
                                trafficReportVioActivity.F1();
                                return;
                            } else if (cm.l.a(trafficReportVioActivity.f2(), trafficReportVioActivity.getResources().getString(R.string.select_state))) {
                                b10 = trafficReportVioActivity.b2().b("label_log_sel_state", "Please select state");
                            } else {
                                q7 q7Var6 = trafficReportVioActivity.G;
                                if (q7Var6 == null) {
                                    cm.l.v("binding");
                                    q7Var6 = null;
                                }
                                Editable text4 = q7Var6.f28180e.getText();
                                cm.l.e(text4, "getText(...)");
                                if (text4.length() == 0) {
                                    b10 = trafficReportVioActivity.b2().b("enter_comments", "Please enter comments");
                                } else {
                                    c.a aVar = ka.c.f13158a;
                                    if (aVar.m(trafficReportVioActivity.V) && trafficReportVioActivity.I1(trafficReportVioActivity.f7790a0)) {
                                        b10 = trafficReportVioActivity.b2().b("attachImage", "Please attach a Image");
                                    } else if (aVar.m(trafficReportVioActivity.X)) {
                                        b10 = trafficReportVioActivity.b2().b("attachVideo", "Please attach a Video");
                                    } else if (trafficReportVioActivity.P1(trafficReportVioActivity).contains(trafficReportVioActivity.f7790a0)) {
                                        q7 q7Var7 = trafficReportVioActivity.G;
                                        if (q7Var7 == null) {
                                            cm.l.v("binding");
                                            q7Var7 = null;
                                        }
                                        q7Var7.f28179d.setEnabled(false);
                                        q7 q7Var8 = trafficReportVioActivity.G;
                                        if (q7Var8 == null) {
                                            cm.l.v("binding");
                                            q7Var8 = null;
                                        }
                                        q7Var8.f28179d.setAlpha(0.5f);
                                        String string = Settings.Secure.getString(trafficReportVioActivity.V1().getContentResolver(), "android_id");
                                        q7 q7Var9 = trafficReportVioActivity.G;
                                        if (q7Var9 == null) {
                                            cm.l.v("binding");
                                            q7Var9 = null;
                                        }
                                        q7Var9.f28197v.setVisibility(0);
                                        k9.b X1 = trafficReportVioActivity.X1();
                                        q7 q7Var10 = trafficReportVioActivity.G;
                                        if (q7Var10 == null) {
                                            cm.l.v("binding");
                                        } else {
                                            q7Var2 = q7Var10;
                                        }
                                        String valueOf = String.valueOf(q7Var2.f28184i.getText());
                                        long parseLong = Long.parseLong(trafficReportVioActivity.c2().k());
                                        String l10 = trafficReportVioActivity.c2().l();
                                        cm.l.c(string);
                                        X1.b0(valueOf, parseLong, l10, string, trafficReportVioActivity.c2().e());
                                        return;
                                    } else {
                                        b10 = trafficReportVioActivity.b2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + trafficReportVioActivity.f7790a0;
                                    }
                                }
                            }
                        }
                    }
                }
                q7 q7Var11 = trafficReportVioActivity.G;
                if (q7Var11 == null) {
                    cm.l.v("binding");
                } else {
                    q7Var2 = q7Var11;
                }
                q7Var2.f28184i.requestFocus();
                b10 = trafficReportVioActivity.b2().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 characters with no special character");
            } else if (trafficReportVioActivity.O.size() > 1) {
                b10 = "Please select violation type";
            } else {
                b10 = trafficReportVioActivity.b2().b("trafficRep_availMsg", "Report traffic violation service is not available in ") + ' ' + trafficReportVioActivity.f7790a0 + ' ' + trafficReportVioActivity.b2().b("vahan_state", "State");
            }
            trafficReportVioActivity.y2(b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void s2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || trafficReportVioActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            trafficReportVioActivity.Z2();
        } else {
            trafficReportVioActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10003);
        }
    }

    /* access modifiers changed from: private */
    public static final void t2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (Build.VERSION.SDK_INT >= 31 || trafficReportVioActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != -1) {
            trafficReportVioActivity.X2();
        } else {
            trafficReportVioActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10001);
        }
    }

    /* access modifiers changed from: private */
    public static final boolean u2(TrafficReportVioActivity trafficReportVioActivity, TextView textView, int i10, KeyEvent keyEvent) {
        cm.l.f(trafficReportVioActivity, "this$0");
        if (i10 != 6) {
            return false;
        }
        q7 q7Var = trafficReportVioActivity.G;
        q7 q7Var2 = null;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        if (String.valueOf(q7Var.f28184i.getText()).length() > 3) {
            Log.e("calling", "2");
            Object systemService = trafficReportVioActivity.getSystemService("input_method");
            cm.l.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            trafficReportVioActivity.f7796g0 = false;
            q7 q7Var3 = trafficReportVioActivity.G;
            if (q7Var3 == null) {
                cm.l.v("binding");
                q7Var3 = null;
            }
            q7Var3.f28197v.setVisibility(0);
            bi.h j22 = trafficReportVioActivity.j2();
            q7 q7Var4 = trafficReportVioActivity.G;
            if (q7Var4 == null) {
                cm.l.v("binding");
                q7Var4 = null;
            }
            String valueOf = String.valueOf(q7Var4.f28184i.getText());
            q7 q7Var5 = trafficReportVioActivity.G;
            if (q7Var5 == null) {
                cm.l.v("binding");
            } else {
                q7Var2 = q7Var5;
            }
            String substring = String.valueOf(q7Var2.f28184i.getText()).substring(0, 2);
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            j22.B(trafficReportVioActivity, valueOf, substring);
        } else {
            Object systemService2 = trafficReportVioActivity.getSystemService("input_method");
            cm.l.d(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService2).hideSoftInputFromWindow(textView.getWindowToken(), 0);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void v2(TrafficReportVioActivity trafficReportVioActivity) {
        cm.l.f(trafficReportVioActivity, "this$0");
        Rect rect = new Rect();
        q7 q7Var = trafficReportVioActivity.G;
        q7 q7Var2 = null;
        if (q7Var == null) {
            cm.l.v("binding");
            q7Var = null;
        }
        q7Var.f28195t.getWindowVisibleDisplayFrame(rect);
        q7 q7Var3 = trafficReportVioActivity.G;
        if (q7Var3 == null) {
            cm.l.v("binding");
            q7Var3 = null;
        }
        int height = q7Var3.f28195t.getRootView().getHeight();
        if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
            trafficReportVioActivity.f7796g0 = true;
            return;
        }
        q7 q7Var4 = trafficReportVioActivity.G;
        if (q7Var4 == null) {
            cm.l.v("binding");
            q7Var4 = null;
        }
        Editable text = q7Var4.f28184i.getText();
        cm.l.c(text);
        if (text.length() <= 3) {
            return;
        }
        if (!com.nic.mparivahan.a.f9624a.a(trafficReportVioActivity)) {
            Toast.makeText(trafficReportVioActivity, new ld.c(trafficReportVioActivity).b("label_log_check_internet", trafficReportVioActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
        } else if (trafficReportVioActivity.f7796g0) {
            trafficReportVioActivity.f7796g0 = false;
            q7 q7Var5 = trafficReportVioActivity.G;
            if (q7Var5 == null) {
                cm.l.v("binding");
                q7Var5 = null;
            }
            q7Var5.f28197v.setVisibility(0);
            bi.h j22 = trafficReportVioActivity.j2();
            q7 q7Var6 = trafficReportVioActivity.G;
            if (q7Var6 == null) {
                cm.l.v("binding");
                q7Var6 = null;
            }
            String valueOf = String.valueOf(q7Var6.f28184i.getText());
            q7 q7Var7 = trafficReportVioActivity.G;
            if (q7Var7 == null) {
                cm.l.v("binding");
            } else {
                q7Var2 = q7Var7;
            }
            String substring = String.valueOf(q7Var2.f28184i.getText()).substring(0, 2);
            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            j22.B(trafficReportVioActivity, valueOf, substring);
        }
    }

    /* access modifiers changed from: private */
    public final void w2(String str) {
        Dialog dialog;
        Dialog dialog2 = this.f7797h0;
        TextView textView = null;
        Boolean valueOf = dialog2 != null ? Boolean.valueOf(dialog2.isShowing()) : null;
        cm.l.c(valueOf);
        if (valueOf.booleanValue() && (dialog = this.f7797h0) != null) {
            dialog.dismiss();
        }
        Dialog dialog3 = this.f7797h0;
        if (dialog3 != null) {
            dialog3.setContentView(R.layout.msg_dialog);
        }
        Dialog dialog4 = this.f7797h0;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.f7797h0;
        TextView textView2 = dialog5 != null ? (TextView) dialog5.findViewById(R.id.pop_up_msg) : null;
        cm.l.d(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog6 = this.f7797h0;
        if (dialog6 != null) {
            textView = (TextView) dialog6.findViewById(R.id.pop_up_close);
        }
        cm.l.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setText(str);
        textView.setOnClickListener(new l1(this));
        Dialog dialog7 = this.f7797h0;
        if (dialog7 != null) {
            dialog7.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void x2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        Dialog dialog = trafficReportVioActivity.f7797h0;
        if (dialog != null) {
            dialog.dismiss();
        }
        trafficReportVioActivity.startActivity(new Intent(trafficReportVioActivity, TrafficDashboardActivity.class));
        trafficReportVioActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void y2(String str) {
        Dialog dialog;
        Dialog dialog2 = this.f7797h0;
        TextView textView = null;
        Boolean valueOf = dialog2 != null ? Boolean.valueOf(dialog2.isShowing()) : null;
        cm.l.c(valueOf);
        if (valueOf.booleanValue() && (dialog = this.f7797h0) != null) {
            dialog.dismiss();
        }
        Dialog dialog3 = this.f7797h0;
        if (dialog3 != null) {
            dialog3.setContentView(R.layout.msg_dialog);
        }
        Dialog dialog4 = this.f7797h0;
        Window window = dialog4 != null ? dialog4.getWindow() : null;
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog5 = this.f7797h0;
        TextView textView2 = dialog5 != null ? (TextView) dialog5.findViewById(R.id.pop_up_msg) : null;
        cm.l.d(textView2, "null cannot be cast to non-null type android.widget.TextView");
        Dialog dialog6 = this.f7797h0;
        if (dialog6 != null) {
            textView = (TextView) dialog6.findViewById(R.id.pop_up_close);
        }
        cm.l.d(textView, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setText(str);
        textView.setOnClickListener(new m1(this));
        Dialog dialog7 = this.f7797h0;
        if (dialog7 != null) {
            dialog7.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(TrafficReportVioActivity trafficReportVioActivity, View view) {
        cm.l.f(trafficReportVioActivity, "this$0");
        Dialog dialog = trafficReportVioActivity.f7797h0;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void E2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.L = editText;
    }

    public final void F2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final void H2(Context context) {
        cm.l.f(context, "<set-?>");
        this.N = context;
    }

    public final boolean I1(String str) {
        cm.l.f(str, "stateName");
        return !p.o(str, "OD", true) && !p.o(str, "OR", true) && !p.o(str, "odisha", true);
    }

    public final void I2(OffenceInterface offenceInterface) {
        cm.l.f(offenceInterface, "<set-?>");
        this.I = offenceInterface;
    }

    public final void J2(k9.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void K2(int i10) {
        this.P = i10;
    }

    public final void L2(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void M2(int i10) {
        this.Q = i10;
    }

    public final ArrayList N1(Context context, ArrayList arrayList) {
        cm.l.f(context, "context");
        cm.l.f(arrayList, "arrayList");
        ArrayList arrayList2 = new ArrayList();
        try {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((Name) arrayList.get(i10)).isSentinal()) {
                    arrayList2.add(arrayList.get(i10));
                }
            }
        } catch (Exception unused) {
        }
        return arrayList2.size() > 0 ? arrayList2 : arrayList;
    }

    public final void N2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.O = arrayList;
    }

    public final byte[] O1(InputStream inputStream) {
        cm.l.f(inputStream, "inputStream");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public final void O2(boolean z10) {
        this.Y = z10;
    }

    public final ArrayList P1(Context context) {
        cm.l.f(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            Object j10 = new i7.d().j(new ld.e(context).f().toString(), StateMaster.class);
            cm.l.e(j10, "fromJson(...)");
            ArrayList<State> states = ((StateMaster) j10).getStates();
            cm.l.d(states, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.Account.Model.State>");
            int size = states.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (states.get(i10).isSentinal()) {
                    arrayList.add(states.get(i10).getName());
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public final void P2(boolean z10) {
        this.f7796g0 = z10;
    }

    public final EditText Q1() {
        EditText editText = this.L;
        if (editText != null) {
            return editText;
        }
        cm.l.v("evLocation");
        return null;
    }

    public final void Q2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Z = cVar;
    }

    public final TextView R1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        cm.l.v("evTime");
        return null;
    }

    public final void R2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.J = gVar;
    }

    public final void S2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.R = arrayList;
    }

    public final void T2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void U2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f7795f0 = vahanProService;
    }

    public final Context V1() {
        Context context = this.N;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final void V2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f7794e0 = hVar;
    }

    public final OffenceInterface W1() {
        OffenceInterface offenceInterface = this.I;
        if (offenceInterface != null) {
            return offenceInterface;
        }
        cm.l.v("mOffenceInterface");
        return null;
    }

    public final k9.b X1() {
        k9.b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("mOffenceViewModel");
        return null;
    }

    public final String Y1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("myLocation");
        return null;
    }

    public final ArrayList Z1() {
        return this.O;
    }

    public final int a2(String str, ArrayList arrayList) {
        cm.l.f(str, "state");
        cm.l.f(arrayList, "arrayList");
        try {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (p.o(((Name) arrayList.get(i10)).getName(), str, true)) {
                    return i10;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public final ld.c b2() {
        ld.c cVar = this.Z;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("session");
        return null;
    }

    public final ld.g c2() {
        ld.g gVar = this.J;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("sessionManager");
        return null;
    }

    public final String d2() {
        return this.f7790a0;
    }

    public final ArrayList e2() {
        ArrayList arrayList = this.R;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("stateList");
        return null;
    }

    public final String f2() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        cm.l.v("stateValue");
        return null;
    }

    public final void g2(TextView textView, Context context) {
        cm.l.f(textView, "textView");
        cm.l.f(context, "context");
        new n1(Calendar.getInstance(), this);
    }

    public final VahanProService i2() {
        VahanProService vahanProService = this.f7795f0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h j2() {
        bi.h hVar = this.f7794e0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        zl.b.a(r8, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long k2(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = "contentUri"
            cm.l.f(r8, r0)
            android.content.ContentResolver r1 = r7.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r8
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            cm.l.c(r8)     // Catch:{ all -> 0x0034 }
            java.lang.String r0 = "_size"
            int r0 = r8.getColumnIndex(r0)     // Catch:{ all -> 0x0034 }
            r8.moveToFirst()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = "SIze"
            long r2 = r8.getLong(r0)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0034 }
            android.util.Log.v(r1, r2)     // Catch:{ all -> 0x0034 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x0034 }
            r2 = 0
            zl.b.a(r8, r2)
            return r0
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            zl.b.a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Citizen.Activities.TrafficReportVioActivity.k2(android.net.Uri):long");
    }

    public final ArrayList m2(String str, ArrayList arrayList) {
        cm.l.f(str, "classId");
        cm.l.f(arrayList, "offencesList");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (q.l0(((MparOffence) arrayList.get(i10)).getOffenceVchCatg(), new String[]{","}, false, 0, 6, (Object) null).contains(str)) {
                    arrayList2.add(arrayList.get(i10));
                }
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q7 c10 = q7.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.G = c10;
        q7 q7Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        try {
            U2(VahanProService.f21196b.b(this));
            V2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(i2()))).a(bi.h.class));
            ArrayList arrayList = new ArrayList();
            arrayList.add(0, new MparOffence("Select Violation", 0, 0, "0"));
            e9.e eVar = new e9.e(this, arrayList);
            q7 q7Var2 = this.G;
            if (q7Var2 == null) {
                cm.l.v("binding");
                q7Var2 = null;
            }
            q7Var2.f28177b.setAdapter((SpinnerAdapter) eVar);
            Object systemService = getSystemService("location");
            cm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            if (((LocationManager) systemService).isProviderEnabled("gps")) {
                G2();
            } else {
                F1();
            }
        } catch (Exception unused) {
        }
        this.f7797h0 = new Dialog(this);
        q7 q7Var3 = this.G;
        if (q7Var3 == null) {
            cm.l.v("binding");
            q7Var3 = null;
        }
        q7Var3.f28180e.addTextChangedListener(this.f7798i0);
        Q2(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        q7 q7Var4 = this.G;
        if (q7Var4 == null) {
            cm.l.v("binding");
            q7Var4 = null;
        }
        aVar.i(this, q7Var4);
        q7 q7Var5 = this.G;
        if (q7Var5 == null) {
            cm.l.v("binding");
            q7Var5 = null;
        }
        q7Var5.f28185j.f25961g.setText(b2().b("report_traffic_violation", "Report Traffic Violation"));
        q7 q7Var6 = this.G;
        if (q7Var6 == null) {
            cm.l.v("binding");
            q7Var6 = null;
        }
        q7Var6.f28185j.f25959e.setOnClickListener(new r1(this));
        H2(this);
        R2(new ld.g(this));
        I2(OffenceInterface.f7826a.b(this));
        View findViewById = findViewById(R.id.ev_location);
        cm.l.e(findViewById, "findViewById(...)");
        E2((EditText) findViewById);
        View findViewById2 = findViewById(R.id.ev_time_picker);
        cm.l.e(findViewById2, "findViewById(...)");
        F2((TextView) findViewById2);
        q7 q7Var7 = this.G;
        if (q7Var7 == null) {
            cm.l.v("binding");
            q7Var7 = null;
        }
        q7Var7.f28189n.setOnClickListener(new s1(this));
        q7 q7Var8 = this.G;
        if (q7Var8 == null) {
            cm.l.v("binding");
            q7Var8 = null;
        }
        q7Var8.f28190o.setOnClickListener(new t1(this));
        q7 q7Var9 = this.G;
        if (q7Var9 == null) {
            cm.l.v("binding");
            q7Var9 = null;
        }
        q7Var9.f28181f.setText(new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis())));
        R1().setText(new SimpleDateFormat("HH:mm").format(Long.valueOf(System.currentTimeMillis())));
        g2(R1(), V1());
        J2((k9.b) new u0((x0) this, (u0.b) new k9.a(new i9.a(W1()))).a(k9.b.class));
        q7 q7Var10 = this.G;
        if (q7Var10 == null) {
            cm.l.v("binding");
            q7Var10 = null;
        }
        q7Var10.f28197v.setVisibility(0);
        X1().N().g(this, new n(new h(this)));
        q7 q7Var11 = this.G;
        if (q7Var11 == null) {
            cm.l.v("binding");
            q7Var11 = null;
        }
        q7Var11.f28177b.setOnItemSelectedListener(new i(this));
        q7 q7Var12 = this.G;
        if (q7Var12 == null) {
            cm.l.v("binding");
            q7Var12 = null;
        }
        q7Var12.f28196u.setOnItemSelectedListener(new j(this));
        q7 q7Var13 = this.G;
        if (q7Var13 == null) {
            cm.l.v("binding");
            q7Var13 = null;
        }
        q7Var13.f28179d.setOnClickListener(new u1(this));
        X1().M().g(this, new n(new k(this)));
        X1().q().g(this, new n(new l(this)));
        P1(this).size();
        X1().R("1");
        X1().z().g(this, new n(new b(this)));
        X1().r().g(this, new n(new c(this)));
        q7 q7Var14 = this.G;
        if (q7Var14 == null) {
            cm.l.v("binding");
            q7Var14 = null;
        }
        q7Var14.f28187l.setOnClickListener(new v1(this));
        q7 q7Var15 = this.G;
        if (q7Var15 == null) {
            cm.l.v("binding");
            q7Var15 = null;
        }
        q7Var15.f28186k.setOnClickListener(new w1(this));
        X1().T().g(this, new n(new d(this)));
        X1().t().g(this, new n(new e(this)));
        q7 q7Var16 = this.G;
        if (q7Var16 == null) {
            cm.l.v("binding");
            q7Var16 = null;
        }
        q7Var16.f28184i.setOnEditorActionListener(new x1(this));
        j2().G0().g(this, new n(new f(this)));
        j2().H0().g(this, new n(new g(this)));
        q7 q7Var17 = this.G;
        if (q7Var17 == null) {
            cm.l.v("binding");
        } else {
            q7Var = q7Var17;
        }
        q7Var.f28195t.getViewTreeObserver().addOnGlobalLayoutListener(new y1(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        Toast makeText;
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 != 222) {
            if (i10 == 10001) {
                if ((!(iArr.length == 0)) && iArr[0] == 0) {
                    X2();
                    return;
                }
            } else if (i10 == 10003) {
                if ((!(iArr.length == 0)) && iArr[0] == 0) {
                    Z2();
                    return;
                }
            } else {
                return;
            }
            makeText = Toast.makeText(this, "Permission denied", 0);
        } else {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                makeText = Toast.makeText(this, getString(R.string.enable_manual_setting), 0);
            } else {
                setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
                this.f7799j0.a(getIntent());
                return;
            }
        }
        makeText.show();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Object systemService = getSystemService("location");
        cm.l.d(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        if (((LocationManager) systemService).isProviderEnabled("gps")) {
            G2();
        }
    }
}
