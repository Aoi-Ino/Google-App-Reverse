package com.nic.mparivahan.LLServices.editlearnerlicence.Activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.LLServices.editlearnerlicence.Service.EditLearnerServices;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import java.util.ArrayList;
import ld.c;
import ld.f;
import ni.ra;
import pl.x;
import ub.a0;
import ub.c0;
import ub.d0;
import ub.e0;
import ub.f0;
import ub.g0;
import ub.h0;
import v9.e;
import vb.e;
import vb.g;
import vb.j;

public final class SelectedCovDetailsScreen extends d implements CompoundButton.OnCheckedChangeListener {
    private String A0 = "";
    private String B0 = "";
    private String C0 = "";
    private String D0 = "";
    private String E0 = "";
    private String F0 = "";
    private ra G;
    private String G0 = "";
    /* access modifiers changed from: private */
    public ProgressDialog H;
    private String H0 = "";
    private c I;
    private String I0 = "";
    private wb.b J;
    private String J0 = "";
    private EditLearnerServices K;
    private String K0 = "";
    private ArrayList L = new ArrayList();
    private String L0 = "";
    private ArrayList M = new ArrayList();
    private String M0 = "";
    private boolean N;
    private int N0;
    private String O = "";
    private int O0;
    private String P = "";
    public c P0;
    private String Q = "";
    public f Q0;
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private boolean V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private ArrayList Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    private String f9222a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f9223b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f9224c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f9225d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f9226e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f9227f0 = "";

    /* renamed from: g0  reason: collision with root package name */
    private String f9228g0 = "";

    /* renamed from: h0  reason: collision with root package name */
    private String f9229h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    private String f9230i0 = "";

    /* renamed from: j0  reason: collision with root package name */
    private String f9231j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private String f9232k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    private String f9233l0 = "";

    /* renamed from: m0  reason: collision with root package name */
    private String f9234m0 = "";

    /* renamed from: n0  reason: collision with root package name */
    private String f9235n0 = "";

    /* renamed from: o0  reason: collision with root package name */
    private String f9236o0 = "";

    /* renamed from: p0  reason: collision with root package name */
    private String f9237p0 = "";

    /* renamed from: q0  reason: collision with root package name */
    private String f9238q0 = "";

    /* renamed from: r0  reason: collision with root package name */
    private String f9239r0 = "";

    /* renamed from: s0  reason: collision with root package name */
    private String f9240s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    private String f9241t0 = "";

    /* renamed from: u0  reason: collision with root package name */
    private String f9242u0 = "";

    /* renamed from: v0  reason: collision with root package name */
    private String f9243v0 = "";

    /* renamed from: w0  reason: collision with root package name */
    private String f9244w0 = "";

    /* renamed from: x0  reason: collision with root package name */
    private String f9245x0 = "";

    /* renamed from: y0  reason: collision with root package name */
    private String f9246y0 = "";

    /* renamed from: z0  reason: collision with root package name */
    private String f9247z0 = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SelectedCovDetailsScreen f9248e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(SelectedCovDetailsScreen selectedCovDetailsScreen) {
            super(1);
            this.f9248e = selectedCovDetailsScreen;
        }

        public final void b(e eVar) {
            ProgressDialog n12 = this.f9248e.H;
            ProgressDialog progressDialog = null;
            if (n12 == null) {
                cm.l.v("pDialog");
                n12 = null;
            }
            n12.dismiss();
            try {
                throw null;
            } catch (Exception e10) {
                e10.printStackTrace();
                ProgressDialog n13 = this.f9248e.H;
                if (n13 == null) {
                    cm.l.v("pDialog");
                    n13 = null;
                }
                if (n13.isShowing()) {
                    ProgressDialog n14 = this.f9248e.H;
                    if (n14 == null) {
                        cm.l.v("pDialog");
                    } else {
                        progressDialog = n14;
                    }
                    progressDialog.dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((e) null);
            return x.f30437a;
        }
    }

    static final class b implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9249a;

        b(l lVar) {
            cm.l.f(lVar, "function");
            this.f9249a = lVar;
        }

        public final pl.c a() {
            return this.f9249a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9249a.invoke(obj);
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

    private final void C1(int i10, String str, CompoundButton compoundButton) {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_alert_unselect_vehicle_class);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View findViewById = dialog.findViewById(R.id.tv_title);
            cm.l.d(findViewById, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView = (MyTextView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.confirmTv);
            cm.l.d(findViewById2, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView2 = (MyTextView) findViewById2;
            myTextView2.setText(q1().b("button_proceed", getString(R.string.proceed)));
            View findViewById3 = dialog.findViewById(R.id.cancelTv);
            cm.l.d(findViewById3, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView3 = (MyTextView) findViewById3;
            myTextView3.setText(q1().b("button_cancel", getString(R.string.cancel)));
            View findViewById4 = dialog.findViewById(R.id.msgTv);
            cm.l.d(findViewById4, "null cannot be cast to non-null type com.nic.mparivahan.MyTextView");
            MyTextView myTextView4 = (MyTextView) findViewById4;
            if (this.M.size() > 1) {
                myTextView4.setText(q1().b("sure_to_deselect", "Are you sure you want to deselect the vehicle class?"));
                myTextView2.setVisibility(0);
            } else {
                myTextView4.setText(q1().b("cant_deselect_all_vehicle", "You can't deselect all vehicle class."));
                myTextView2.setVisibility(8);
            }
            myTextView3.setOnClickListener(new a0(dialog));
            myTextView2.setOnClickListener(new ub.b0(dialog, this, i10, str, compoundButton));
            c cVar = this.I;
            if (cVar == null) {
                cm.l.v("session");
                cVar = null;
            }
            myTextView.setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
            dialog.show();
            Window window = dialog.getWindow();
            cm.l.c(window);
            window.setLayout(-1, -2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E1(Dialog dialog, SelectedCovDetailsScreen selectedCovDetailsScreen, int i10, String str, CompoundButton compoundButton, View view) {
        cm.l.f(dialog, "$dialog");
        cm.l.f(selectedCovDetailsScreen, "this$0");
        cm.l.f(str, "$text");
        cm.l.f(compoundButton, "$buttonView");
        dialog.dismiss();
        selectedCovDetailsScreen.s1(i10, str, compoundButton);
    }

    private final void F1() {
        try {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.dialog_show_vehicle_info);
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
            View findViewById = dialog.findViewById(R.id.txtVehicleExplanation);
            cm.l.e(findViewById, "findViewById(...)");
            ((TextView) findViewById).setText(q1().b("ll_info_explanation", getString(R.string.vehicle_explaination)));
            View findViewById2 = dialog.findViewById(R.id.txtVehicleExplanation1);
            cm.l.e(findViewById2, "findViewById(...)");
            ((TextView) findViewById2).setText(q1().b("ll_info_non_transport", getString(R.string.non_transport_explaination)));
            View findViewById3 = dialog.findViewById(R.id.txtVehicleExplanation2);
            cm.l.e(findViewById3, "findViewById(...)");
            ((TextView) findViewById3).setText(q1().b("ll_info_transport", getString(R.string.transport_explaination)));
            View findViewById4 = dialog.findViewById(R.id.txtVehicleExplanation3);
            cm.l.e(findViewById4, "findViewById(...)");
            ((TextView) findViewById4).setText(q1().b("ll_info_light_motor", getString(R.string.light_vehicle_explaination)));
            View findViewById5 = dialog.findViewById(R.id.txtVehicleExplanation4);
            cm.l.e(findViewById5, "findViewById(...)");
            ((TextView) findViewById5).setText(q1().b("ll_info_medium_motor", getString(R.string.medium_vehicle_explaination)));
            View findViewById6 = dialog.findViewById(R.id.txtVehicleExplanation5);
            cm.l.e(findViewById6, "findViewById(...)");
            ((TextView) findViewById6).setText(q1().b("ll_info_heavy_motor", getString(R.string.heavy_vehicle_explaination)));
            View findViewById7 = dialog.findViewById(R.id.closeIv);
            cm.l.e(findViewById7, "findViewById(...)");
            ((ImageView) findViewById7).setOnClickListener(new h0(dialog));
            dialog.show();
            Window window = dialog.getWindow();
            cm.l.c(window);
            window.setLayout(-1, -2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void o1() {
        wb.b bVar;
        wb.b bVar2;
        try {
            ProgressDialog progressDialog = this.H;
            if (progressDialog == null) {
                cm.l.v("pDialog");
                progressDialog = null;
            }
            progressDialog.show();
            if (this.Z.size() > 0) {
                try {
                    wb.b bVar3 = this.J;
                    if (bVar3 == null) {
                        cm.l.v("editLearnerVM");
                        bVar2 = null;
                    } else {
                        bVar2 = bVar3;
                    }
                    bVar2.g(this.O, this.R, this.Q, this.f9222a0, this.f9223b0, this.f9224c0, this.f9225d0, this.f9226e0, this.f9227f0, this.f9228g0, this.f9229h0, "", this.f9230i0, this.f9231j0, this.f9232k0, this.f9233l0, this.f9234m0, this.f9235n0, this.f9236o0, this.f9238q0, this.f9237p0, this.f9239r0, this.f9240s0, this.f9241t0, this.S, this.A0, this.f9247z0, this.f9246y0, String.valueOf(this.N0), this.f9245x0, this.f9242u0, this.f9243v0, this.f9244w0, this.B0, this.I0, this.H0, this.G0, String.valueOf(this.O0), this.F0, this.C0, this.D0, this.E0, this.J0, this.M0, this.L0, this.T, "", ((g) this.Z.get(0)).e(), ((g) this.Z.get(0)).d(), this.X, this.Y, "", this.M, String.valueOf(this.N), String.valueOf(this.V), this.W, this.U, ((g) this.Z.get(0)).c());
                } catch (Exception e10) {
                    e = e10;
                    e.printStackTrace();
                }
            } else {
                wb.b bVar4 = this.J;
                if (bVar4 == null) {
                    cm.l.v("editLearnerVM");
                    bVar = null;
                } else {
                    bVar = bVar4;
                }
                bVar.g(this.O, this.R, this.Q, this.f9222a0, this.f9223b0, this.f9224c0, this.f9225d0, this.f9226e0, this.f9227f0, this.f9228g0, this.f9229h0, "", this.f9230i0, this.f9231j0, this.f9232k0, this.f9233l0, this.f9234m0, this.f9235n0, this.f9236o0, this.f9238q0, this.f9237p0, this.f9239r0, this.f9240s0, this.f9241t0, this.S, this.A0, this.f9247z0, this.f9246y0, String.valueOf(this.N0), this.f9245x0, this.f9242u0, this.f9243v0, this.f9244w0, this.B0, this.I0, this.H0, this.G0, String.valueOf(this.O0), this.F0, this.C0, this.D0, this.E0, this.J0, this.M0, this.L0, this.T, "", "", "", this.X, this.Y, "", this.M, String.valueOf(this.N), String.valueOf(this.V), this.W, this.U, "");
            }
        } catch (Exception e11) {
            e = e11;
            e.printStackTrace();
        }
    }

    private final void p1() {
        this.N = getIntent().getBooleanExtra("willingToDonate", false);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("covDetails");
        cm.l.c(parcelableArrayListExtra);
        this.L = parcelableArrayListExtra;
        ArrayList parcelableArrayListExtra2 = getIntent().getParcelableArrayListExtra("selectedCovDetails");
        cm.l.c(parcelableArrayListExtra2);
        this.M = parcelableArrayListExtra2;
        String stringExtra = getIntent().getStringExtra("licenseFromState");
        cm.l.c(stringExtra);
        this.O = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("licenceFromRTO");
        cm.l.c(stringExtra2);
        this.P = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("jurisdiction");
        cm.l.c(stringExtra3);
        this.Q = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("licenceFromRTOCode");
        cm.l.c(stringExtra4);
        this.R = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("applicationNo");
        cm.l.c(stringExtra5);
        this.S = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("reference");
        cm.l.c(stringExtra6);
        this.T = stringExtra6;
        String stringExtra7 = getIntent().getStringExtra("applDate");
        cm.l.c(stringExtra7);
        this.U = stringExtra7;
        this.V = getIntent().getBooleanExtra("allowNewAddr", false);
        String stringExtra8 = getIntent().getStringExtra("applCatg");
        cm.l.c(stringExtra8);
        this.W = stringExtra8;
        String stringExtra9 = getIntent().getStringExtra("bioId");
        cm.l.c(stringExtra9);
        this.X = stringExtra9;
        String stringExtra10 = getIntent().getStringExtra("allClassOfVehicles");
        cm.l.c(stringExtra10);
        this.Y = stringExtra10;
        ArrayList parcelableArrayListExtra3 = getIntent().getParcelableArrayListExtra("llRefDetails");
        cm.l.c(parcelableArrayListExtra3);
        this.Z = parcelableArrayListExtra3;
        String stringExtra11 = getIntent().getStringExtra("applicantFName");
        cm.l.c(stringExtra11);
        this.f9222a0 = stringExtra11;
        String stringExtra12 = getIntent().getStringExtra("applicantMName");
        cm.l.c(stringExtra12);
        this.f9223b0 = stringExtra12;
        String stringExtra13 = getIntent().getStringExtra("applicantLName");
        cm.l.c(stringExtra13);
        this.f9224c0 = stringExtra13;
        String stringExtra14 = getIntent().getStringExtra("fullName");
        cm.l.c(stringExtra14);
        this.f9225d0 = stringExtra14;
        String stringExtra15 = getIntent().getStringExtra("relationship");
        cm.l.c(stringExtra15);
        this.f9226e0 = stringExtra15;
        String stringExtra16 = getIntent().getStringExtra("relationFName");
        cm.l.c(stringExtra16);
        this.f9227f0 = stringExtra16;
        String stringExtra17 = getIntent().getStringExtra("relationMName");
        cm.l.c(stringExtra17);
        this.f9228g0 = stringExtra17;
        String stringExtra18 = getIntent().getStringExtra("relationLName");
        cm.l.c(stringExtra18);
        this.f9229h0 = stringExtra18;
        String stringExtra19 = getIntent().getStringExtra("gender");
        cm.l.c(stringExtra19);
        this.f9230i0 = stringExtra19;
        String stringExtra20 = getIntent().getStringExtra("dob");
        cm.l.c(stringExtra20);
        this.f9231j0 = stringExtra20;
        String stringExtra21 = getIntent().getStringExtra("placeOfBirth");
        cm.l.c(stringExtra21);
        this.f9232k0 = stringExtra21;
        String stringExtra22 = getIntent().getStringExtra("country");
        cm.l.c(stringExtra22);
        this.f9233l0 = stringExtra22;
        String stringExtra23 = getIntent().getStringExtra("educationQualification");
        cm.l.c(stringExtra23);
        this.f9234m0 = stringExtra23;
        String stringExtra24 = getIntent().getStringExtra("bloodGroup");
        cm.l.c(stringExtra24);
        this.f9235n0 = stringExtra24;
        String stringExtra25 = getIntent().getStringExtra("mobileNo");
        cm.l.c(stringExtra25);
        this.f9236o0 = stringExtra25;
        String stringExtra26 = getIntent().getStringExtra("emailId");
        cm.l.c(stringExtra26);
        this.f9237p0 = stringExtra26;
        String stringExtra27 = getIntent().getStringExtra("applicantMobileNo");
        cm.l.c(stringExtra27);
        this.f9238q0 = stringExtra27;
        String stringExtra28 = getIntent().getStringExtra("emergencyContactNo");
        cm.l.c(stringExtra28);
        this.f9239r0 = stringExtra28;
        String stringExtra29 = getIntent().getStringExtra("identificationMark1");
        cm.l.c(stringExtra29);
        this.f9240s0 = stringExtra29;
        String stringExtra30 = getIntent().getStringExtra("identificationMark2");
        cm.l.c(stringExtra30);
        this.f9241t0 = stringExtra30;
        String stringExtra31 = getIntent().getStringExtra("presHouseNo");
        cm.l.c(stringExtra31);
        this.f9242u0 = stringExtra31;
        String stringExtra32 = getIntent().getStringExtra("presStreet");
        cm.l.c(stringExtra32);
        this.f9243v0 = stringExtra32;
        String stringExtra33 = getIntent().getStringExtra("presLocation");
        cm.l.c(stringExtra33);
        this.f9244w0 = stringExtra33;
        String stringExtra34 = getIntent().getStringExtra("presVillageOrTown");
        cm.l.c(stringExtra34);
        this.f9245x0 = stringExtra34;
        String stringExtra35 = getIntent().getStringExtra("presSubDistrict");
        cm.l.c(stringExtra35);
        this.f9246y0 = stringExtra35;
        Log.e("Pre Sub Dist", stringExtra35);
        String stringExtra36 = getIntent().getStringExtra("presDistrict");
        cm.l.c(stringExtra36);
        this.f9247z0 = stringExtra36;
        this.N0 = getIntent().getIntExtra("presVillTown", 0);
        String stringExtra37 = getIntent().getStringExtra("presState");
        cm.l.c(stringExtra37);
        this.A0 = stringExtra37;
        String stringExtra38 = getIntent().getStringExtra("presPincode");
        cm.l.c(stringExtra38);
        this.B0 = stringExtra38;
        String stringExtra39 = getIntent().getStringExtra("perHouseNo");
        cm.l.c(stringExtra39);
        this.C0 = stringExtra39;
        String stringExtra40 = getIntent().getStringExtra("perStreet");
        cm.l.c(stringExtra40);
        this.D0 = stringExtra40;
        String stringExtra41 = getIntent().getStringExtra("perLocation");
        cm.l.c(stringExtra41);
        this.E0 = stringExtra41;
        String stringExtra42 = getIntent().getStringExtra("permVillageOrTown");
        cm.l.c(stringExtra42);
        this.F0 = stringExtra42;
        String stringExtra43 = getIntent().getStringExtra("perSubDistrict");
        cm.l.c(stringExtra43);
        this.G0 = stringExtra43;
        String stringExtra44 = getIntent().getStringExtra("perDistrict");
        cm.l.c(stringExtra44);
        this.H0 = stringExtra44;
        String stringExtra45 = getIntent().getStringExtra("perState");
        cm.l.c(stringExtra45);
        this.I0 = stringExtra45;
        String stringExtra46 = getIntent().getStringExtra("perPinCode");
        cm.l.c(stringExtra46);
        this.J0 = stringExtra46;
        String stringExtra47 = getIntent().getStringExtra("stayMonths");
        cm.l.c(stringExtra47);
        this.L0 = stringExtra47;
        String stringExtra48 = getIntent().getStringExtra("stayYears");
        cm.l.c(stringExtra48);
        this.M0 = stringExtra48;
        this.O0 = getIntent().getIntExtra("premVillTown", 0);
        z1();
        ra raVar = null;
        if (!this.N) {
            ra raVar2 = this.G;
            if (raVar2 == null) {
                cm.l.v("binding");
                raVar2 = null;
            }
            raVar2.B.setChecked(true);
            ra raVar3 = this.G;
            if (raVar3 == null) {
                cm.l.v("binding");
            } else {
                raVar = raVar3;
            }
            raVar.L.setChecked(false);
            return;
        }
        ra raVar4 = this.G;
        if (raVar4 == null) {
            cm.l.v("binding");
            raVar4 = null;
        }
        raVar4.B.setChecked(false);
        ra raVar5 = this.G;
        if (raVar5 == null) {
            cm.l.v("binding");
        } else {
            raVar = raVar5;
        }
        raVar.L.setChecked(true);
    }

    private final void s1(int i10, String str, CompoundButton compoundButton) {
        int size = this.L.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (((vb.b) this.L.get(i12)).d() == i10) {
                this.L.remove(i12);
            }
        }
        if (this.M.size() > 1) {
            int size2 = this.M.size();
            while (true) {
                if (i11 >= size2) {
                    break;
                } else if (((j) this.M.get(i11)).c() == i10) {
                    this.M.remove(i11);
                    this.L.add(new vb.b(i10, str));
                    break;
                } else {
                    i11++;
                }
            }
        }
        ra raVar = this.G;
        ra raVar2 = null;
        if (raVar == null) {
            cm.l.v("binding");
            raVar = null;
        }
        raVar.D.removeAllViews();
        ra raVar3 = this.G;
        if (raVar3 == null) {
            cm.l.v("binding");
        } else {
            raVar2 = raVar3;
        }
        raVar2.f28430x.removeAllViews();
        z1();
    }

    private final void t1() {
        this.I = new c(this);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.H = progressDialog;
        c cVar = this.I;
        ra raVar = null;
        if (cVar == null) {
            cm.l.v("session");
            cVar = null;
        }
        progressDialog.setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        ProgressDialog progressDialog2 = this.H;
        if (progressDialog2 == null) {
            cm.l.v("pDialog");
            progressDialog2 = null;
        }
        progressDialog2.setCancelable(false);
        ProgressDialog progressDialog3 = this.H;
        if (progressDialog3 == null) {
            cm.l.v("pDialog");
            progressDialog3 = null;
        }
        progressDialog3.setCanceledOnTouchOutside(false);
        ra raVar2 = this.G;
        if (raVar2 == null) {
            cm.l.v("binding");
            raVar2 = null;
        }
        raVar2.f28432z.f28448b.setOnClickListener(new c0(this));
        ra raVar3 = this.G;
        if (raVar3 == null) {
            cm.l.v("binding");
            raVar3 = null;
        }
        raVar3.f28432z.f28452f.setText(r1().i());
        ra raVar4 = this.G;
        if (raVar4 == null) {
            cm.l.v("binding");
            raVar4 = null;
        }
        raVar4.f28431y.setOnClickListener(new d0(this));
        ra raVar5 = this.G;
        if (raVar5 == null) {
            cm.l.v("binding");
            raVar5 = null;
        }
        raVar5.A.setOnClickListener(new e0(this));
        ra raVar6 = this.G;
        if (raVar6 == null) {
            cm.l.v("binding");
            raVar6 = null;
        }
        raVar6.K.setOnCheckedChangeListener(new f0(this));
        ra raVar7 = this.G;
        if (raVar7 == null) {
            cm.l.v("binding");
        } else {
            raVar = raVar7;
        }
        raVar.f28429w.setOnClickListener(new g0(this));
    }

    /* access modifiers changed from: private */
    public static final void u1(SelectedCovDetailsScreen selectedCovDetailsScreen, View view) {
        cm.l.f(selectedCovDetailsScreen, "this$0");
        selectedCovDetailsScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(SelectedCovDetailsScreen selectedCovDetailsScreen, View view) {
        cm.l.f(selectedCovDetailsScreen, "this$0");
        selectedCovDetailsScreen.F1();
    }

    /* access modifiers changed from: private */
    public static final void w1(SelectedCovDetailsScreen selectedCovDetailsScreen, View view) {
        cm.l.f(selectedCovDetailsScreen, "this$0");
        ra raVar = selectedCovDetailsScreen.G;
        if (raVar == null) {
            cm.l.v("binding");
            raVar = null;
        }
        if (raVar.F.isChecked()) {
            selectedCovDetailsScreen.o1();
        } else {
            Toast.makeText(selectedCovDetailsScreen, "Please select term & Condition", 0).show();
        }
    }

    /* access modifiers changed from: private */
    public static final void x1(SelectedCovDetailsScreen selectedCovDetailsScreen, RadioGroup radioGroup, int i10) {
        boolean z10;
        cm.l.f(selectedCovDetailsScreen, "this$0");
        View findViewById = selectedCovDetailsScreen.findViewById(i10);
        cm.l.e(findViewById, "findViewById(...)");
        RadioButton radioButton = (RadioButton) findViewById;
        if (cm.l.a(radioButton.getText(), "Yes")) {
            z10 = true;
        } else if (cm.l.a(radioButton.getText(), "No")) {
            z10 = false;
        } else {
            return;
        }
        selectedCovDetailsScreen.N = z10;
    }

    /* access modifiers changed from: private */
    public static final void y1(SelectedCovDetailsScreen selectedCovDetailsScreen, View view) {
        cm.l.f(selectedCovDetailsScreen, "this$0");
        selectedCovDetailsScreen.startActivity(new Intent(selectedCovDetailsScreen, EditLearnerAppScreen.class));
        selectedCovDetailsScreen.finish();
    }

    private final void z1() {
        int size = this.L.size();
        int i10 = 0;
        while (true) {
            ra raVar = null;
            if (i10 >= size) {
                break;
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            TextView textView = new TextView(this);
            textView.setPadding(16, 5, 16, 5);
            textView.setTextColor(getColor(R.color.black));
            textView.setTextSize(16.0f);
            textView.setId(((vb.b) this.L.get(i10)).d());
            textView.setText(((vb.b) this.L.get(i10)).c());
            linearLayout.addView(textView);
            ra raVar2 = this.G;
            if (raVar2 == null) {
                cm.l.v("binding");
            } else {
                raVar = raVar2;
            }
            raVar.f28430x.addView(linearLayout);
            i10++;
        }
        int size2 = this.M.size();
        for (int i11 = 0; i11 < size2; i11++) {
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.setOrientation(1);
            CheckBox checkBox = new CheckBox(this);
            checkBox.setId(((j) this.M.get(i11)).c());
            checkBox.setText(((j) this.M.get(i11)).d());
            checkBox.setChecked(true);
            checkBox.setEnabled(this.M.size() != 1);
            if (this.M.size() == 1) {
                checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            } else {
                checkBox.setOnCheckedChangeListener(this);
            }
            linearLayout2.addView(checkBox);
            ra raVar3 = this.G;
            if (raVar3 == null) {
                cm.l.v("binding");
                raVar3 = null;
            }
            raVar3.D.addView(linearLayout2);
        }
    }

    public final void A1(c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P0 = cVar;
    }

    public final void B1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Q0 = fVar;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (!z10 && this.M.size() > 1) {
            cm.l.c(compoundButton);
            C1(compoundButton.getId(), compoundButton.getText().toString(), compoundButton);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ra x10 = ra.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        wb.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        this.K = EditLearnerServices.f9250a.a(this);
        e.a aVar = v9.e.f17509a;
        ra raVar = this.G;
        if (raVar == null) {
            cm.l.v("binding");
            raVar = null;
        }
        aVar.I0(this, raVar);
        A1(new c(this));
        B1(new f(this));
        EditLearnerServices editLearnerServices = this.K;
        if (editLearnerServices == null) {
            cm.l.v("service");
            editLearnerServices = null;
        }
        this.J = (wb.b) new u0((x0) this, (u0.b) new xb.a(new wb.a(editLearnerServices))).a(wb.b.class);
        p1();
        t1();
        wb.b bVar2 = this.J;
        if (bVar2 == null) {
            cm.l.v("editLearnerVM");
        } else {
            bVar = bVar2;
        }
        bVar.k().g(this, new b(new a(this)));
    }

    public final c q1() {
        c cVar = this.P0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final f r1() {
        f fVar = this.Q0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }
}
