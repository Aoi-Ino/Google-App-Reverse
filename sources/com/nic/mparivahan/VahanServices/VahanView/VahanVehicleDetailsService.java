package com.nic.mparivahan.VahanServices.VahanView;

import ai.e6;
import ai.f6;
import ai.g6;
import ai.h6;
import ai.i6;
import ai.j6;
import ai.k6;
import ai.l6;
import ai.m6;
import ai.n6;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.Serializable;
import ka.c;
import ni.ab;
import v9.e;

public final class VahanVehicleDetailsService extends d {
    public String G;
    public NrvDetails H;
    public ab I;
    public h J;
    public VahanProService K;
    public ProgressDialog L;
    private String M = "0";
    private boolean N;
    public String O;
    public String P;

    /* access modifiers changed from: private */
    public static final void A1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        vahanVehicleDetailsService.B1();
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void F1() {
        s1().f25274a0.setOnClickListener(new i6(this));
        s1().G0.setOnClickListener(new j6(this));
        s1().f25284f0.setOnClickListener(new k6(this));
        s1().f25306q0.setOnClickListener(new l6(this));
        s1().B.setOnClickListener(new m6(this));
        s1().f25299n.setOnClickListener(new n6(this));
    }

    /* access modifiers changed from: private */
    public static final void G1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().I.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().I.setVisibility(8);
            vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().I.setVisibility(0);
            vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().L.setVisibility(8);
        vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().J.setVisibility(8);
        vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().K.setVisibility(8);
        vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().H.setVisibility(8);
        vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().G.setVisibility(8);
        vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().L.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().L.setVisibility(8);
            vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().L.setVisibility(0);
            vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().I.setVisibility(8);
        vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().J.setVisibility(8);
        vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().K.setVisibility(8);
        vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().H.setVisibility(8);
        vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().G.setVisibility(8);
        vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().J.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().J.setVisibility(8);
            vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().J.setVisibility(0);
            vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().I.setVisibility(8);
        vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().L.setVisibility(8);
        vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().K.setVisibility(8);
        vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().H.setVisibility(8);
        vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().G.setVisibility(8);
        vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().K.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().K.setVisibility(8);
            vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().K.setVisibility(0);
            vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().I.setVisibility(8);
        vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().L.setVisibility(8);
        vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().J.setVisibility(8);
        vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().H.setVisibility(8);
        vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().G.setVisibility(8);
        vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().H.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().H.setVisibility(8);
            vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().H.setVisibility(0);
            vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().I.setVisibility(8);
        vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().L.setVisibility(8);
        vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().J.setVisibility(8);
        vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().K.setVisibility(8);
        vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().G.setVisibility(8);
        vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        if (vahanVehicleDetailsService.s1().G.getVisibility() == 0) {
            vahanVehicleDetailsService.s1().G.setVisibility(8);
            vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanVehicleDetailsService.s1().G.setVisibility(0);
            vahanVehicleDetailsService.s1().f25283f.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanVehicleDetailsService.s1().I.setVisibility(8);
        vahanVehicleDetailsService.s1().f25293k.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().L.setVisibility(8);
        vahanVehicleDetailsService.s1().f25291j.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().J.setVisibility(8);
        vahanVehicleDetailsService.s1().f25287h.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().K.setVisibility(8);
        vahanVehicleDetailsService.s1().f25289i.setImageResource(R.drawable.ic_arrow_down);
        vahanVehicleDetailsService.s1().H.setVisibility(8);
        vahanVehicleDetailsService.s1().f25285g.setImageResource(R.drawable.ic_arrow_down);
    }

    private final void p1(String str, NrvDetails nrvDetails) {
        Log.e("nrvDetails", nrvDetails.toString());
        String rc_owner_name = nrvDetails.getRc_owner_name();
        String str2 = null;
        if (rc_owner_name == null || rc_owner_name.length() == 0) {
            s1().f25280d0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView = s1().f25280d0;
            String rc_owner_name2 = nrvDetails.getRc_owner_name();
            if (rc_owner_name2 == null) {
                rc_owner_name2 = null;
            }
            appCompatTextView.setText(rc_owner_name2);
        }
        String rc_f_name = nrvDetails.getRc_f_name();
        if (rc_f_name == null || rc_f_name.length() == 0) {
            s1().C0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView2 = s1().C0;
            String rc_f_name2 = nrvDetails.getRc_f_name();
            if (rc_f_name2 == null) {
                rc_f_name2 = null;
            }
            appCompatTextView2.setText(rc_f_name2);
        }
        String rc_regn_no = nrvDetails.getRc_regn_no();
        if (rc_regn_no == null || rc_regn_no.length() == 0) {
            s1().H0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView3 = s1().H0;
            String rc_vh_class_desc = nrvDetails.getRc_vh_class_desc();
            if (rc_vh_class_desc == null) {
                rc_vh_class_desc = null;
            }
            appCompatTextView3.setText(rc_vh_class_desc);
        }
        String rc_vch_catg_desc = nrvDetails.getRc_vch_catg_desc();
        if (rc_vch_catg_desc == null || rc_vch_catg_desc.length() == 0) {
            s1().D0.setText("NA");
        } else {
            s1().D0.setText(nrvDetails.getRc_vch_catg_desc().toString());
        }
        String rc_maker_desc = nrvDetails.getRc_maker_desc();
        if (rc_maker_desc == null || rc_maker_desc.length() == 0) {
            s1().M.setText("NA");
        } else {
            s1().M.setText(nrvDetails.getRc_maker_desc().toString());
        }
        String rc_maker_model = nrvDetails.getRc_maker_model();
        if (rc_maker_model == null || rc_maker_model.length() == 0) {
            s1().O.setText("NA");
        } else {
            s1().O.setText(nrvDetails.getRc_maker_model().toString());
        }
        String rc_regn_dt = nrvDetails.getRc_regn_dt();
        if (rc_regn_dt == null || rc_regn_dt.length() == 0) {
            s1().f25316v0.setText("NA");
        } else {
            s1().f25316v0.setText(nrvDetails.getRc_regn_dt().toString());
        }
        String rc_fuel_desc = nrvDetails.getRc_fuel_desc();
        if (rc_fuel_desc == null || rc_fuel_desc.length() == 0) {
            s1().f25309s.setText("NA");
        } else {
            s1().f25309s.setText(nrvDetails.getRc_fuel_desc().toString());
        }
        String rc_norms_desc = nrvDetails.getRc_norms_desc();
        if (rc_norms_desc == null || rc_norms_desc.length() == 0) {
            s1().Y.setText("NA");
        } else {
            s1().Y.setText(nrvDetails.getRc_norms_desc().toString());
        }
        c.a aVar = c.f13158a;
        if (!aVar.m(String.valueOf(nrvDetails.getRc_tax_upto()))) {
            s1().K0.setText(String.valueOf(nrvDetails.getRc_tax_upto()));
        } else {
            s1().K0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_no()))) {
            s1().f25292j0.setText(String.valueOf(nrvDetails.getRc_permit_no()));
        } else {
            s1().f25292j0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_issue_dt()))) {
            s1().f25288h0.setText(String.valueOf(nrvDetails.getRc_permit_issue_dt()));
        } else {
            s1().f25288h0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_type()))) {
            s1().f25296l0.setText(String.valueOf(nrvDetails.getRc_permit_type()));
        } else {
            s1().f25296l0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_valid_from()))) {
            s1().f25302o0.setText(String.valueOf(nrvDetails.getRc_permit_valid_from()));
        } else {
            s1().f25302o0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_valid_upto()))) {
            s1().f25298m0.setText(String.valueOf(nrvDetails.getRc_permit_valid_upto()));
        } else {
            s1().f25298m0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_np_no()))) {
            s1().T.setText(String.valueOf(nrvDetails.getRc_np_no()));
        } else {
            s1().T.setText("NA");
        }
        String rc_np_issued_by = nrvDetails.getRc_np_issued_by();
        if (rc_np_issued_by == null || rc_np_issued_by.length() == 0) {
            s1().R.setText("NA");
        } else {
            s1().R.setText(nrvDetails.getRc_np_issued_by().toString());
        }
        String rc_np_upto = nrvDetails.getRc_np_upto();
        if (rc_np_upto == null || rc_np_upto.length() == 0) {
            s1().U.setText("NA");
        } else {
            s1().U.setText(nrvDetails.getRc_np_upto().toString());
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_pucc_no()))) {
            s1().f25308r0.setText(String.valueOf(nrvDetails.getRc_pucc_no()));
        } else {
            s1().f25308r0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_pucc_upto()))) {
            s1().f25312t0.setText(String.valueOf(nrvDetails.getRc_pucc_upto()));
        } else {
            s1().f25312t0.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_policy_no())) {
            AppCompatTextView appCompatTextView4 = s1().D;
            String rc_insurance_policy_no = nrvDetails.getRc_insurance_policy_no();
            if (rc_insurance_policy_no == null) {
                rc_insurance_policy_no = null;
            }
            appCompatTextView4.setText(rc_insurance_policy_no);
        } else {
            s1().D.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_comp())) {
            AppCompatTextView appCompatTextView5 = s1().f25323z;
            String rc_insurance_comp = nrvDetails.getRc_insurance_comp();
            if (rc_insurance_comp == null) {
                rc_insurance_comp = null;
            }
            appCompatTextView5.setText(rc_insurance_comp);
        } else {
            s1().f25323z.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_upto())) {
            AppCompatTextView appCompatTextView6 = s1().F;
            String rc_insurance_upto = nrvDetails.getRc_insurance_upto();
            if (rc_insurance_upto == null) {
                rc_insurance_upto = null;
            }
            appCompatTextView6.setText(rc_insurance_upto);
        } else {
            s1().F.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_financer())) {
            AppCompatTextView appCompatTextView7 = s1().f25301o;
            String rc_financer = nrvDetails.getRc_financer();
            if (rc_financer == null) {
                rc_financer = null;
            }
            appCompatTextView7.setText(rc_financer);
        } else {
            s1().f25301o.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_fit_upto())) {
            AppCompatTextView appCompatTextView8 = s1().f25305q;
            String rc_fit_upto = nrvDetails.getRc_fit_upto();
            if (rc_fit_upto != null) {
                str2 = rc_fit_upto;
            }
            appCompatTextView8.setText(str2);
            return;
        }
        s1().f25305q.setText("NA");
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        vahanVehicleDetailsService.finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        vahanVehicleDetailsService.finish();
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanVehicleDetailsService vahanVehicleDetailsService, View view) {
        l.f(vahanVehicleDetailsService, "this$0");
        vahanVehicleDetailsService.finish();
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void E1(ab abVar) {
        l.f(abVar, "<set-?>");
        this.I = abVar;
    }

    public final void M1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void N1() {
        AppCompatTextView appCompatTextView;
        String rc_permit_issue_dt;
        String rc_permit_type;
        String rc_permit_valid_from;
        String rc_permit_valid_upto;
        String rc_np_no;
        String rc_np_issued_by;
        String rc_np_upto;
        String rc_permit_no = v1().getRc_permit_no();
        if ((rc_permit_no == null || rc_permit_no.length() == 0) && (((rc_permit_issue_dt = v1().getRc_permit_issue_dt()) == null || rc_permit_issue_dt.length() == 0) && (((rc_permit_type = v1().getRc_permit_type()) == null || rc_permit_type.length() == 0) && (((rc_permit_valid_from = v1().getRc_permit_valid_from()) == null || rc_permit_valid_from.length() == 0) && (((rc_permit_valid_upto = v1().getRc_permit_valid_upto()) == null || rc_permit_valid_upto.length() == 0) && (((rc_np_no = v1().getRc_np_no()) == null || rc_np_no.length() == 0) && (((rc_np_issued_by = v1().getRc_np_issued_by()) == null || rc_np_issued_by.length() == 0) && ((rc_np_upto = v1().getRc_np_upto()) == null || rc_np_upto.length() == 0)))))))) {
            s1().f25282e0.setVisibility(8);
            return;
        }
        String rc_permit_no2 = v1().getRc_permit_no();
        String str = "NA";
        if (rc_permit_no2 == null || rc_permit_no2.length() == 0) {
            s1().f25292j0.setText(str);
        } else {
            s1().f25292j0.setText(String.valueOf(v1().getRc_permit_no()));
        }
        String rc_permit_issue_dt2 = v1().getRc_permit_issue_dt();
        if (rc_permit_issue_dt2 == null || rc_permit_issue_dt2.length() == 0) {
            s1().f25288h0.setText(str);
        } else {
            s1().f25288h0.setText(String.valueOf(v1().getRc_permit_issue_dt()));
        }
        String rc_permit_type2 = v1().getRc_permit_type();
        if (rc_permit_type2 == null || rc_permit_type2.length() == 0) {
            s1().f25296l0.setText(str);
        } else {
            s1().f25296l0.setText(String.valueOf(v1().getRc_permit_type()));
        }
        String rc_permit_valid_from2 = v1().getRc_permit_valid_from();
        if (rc_permit_valid_from2 == null || rc_permit_valid_from2.length() == 0) {
            s1().f25302o0.setText(str);
        } else {
            s1().f25302o0.setText(String.valueOf(v1().getRc_permit_valid_from()));
        }
        String rc_permit_valid_upto2 = v1().getRc_permit_valid_upto();
        if (rc_permit_valid_upto2 == null || rc_permit_valid_upto2.length() == 0) {
            s1().f25298m0.setText(str);
        } else {
            s1().f25298m0.setText(String.valueOf(v1().getRc_permit_valid_upto()));
        }
        String rc_np_no2 = v1().getRc_np_no();
        if (rc_np_no2 == null || rc_np_no2.length() == 0) {
            s1().T.setText(str);
        } else {
            s1().T.setText(String.valueOf(v1().getRc_np_no()));
        }
        String rc_np_issued_by2 = v1().getRc_np_issued_by();
        if (rc_np_issued_by2 == null || rc_np_issued_by2.length() == 0) {
            s1().R.setText(str);
        } else {
            s1().R.setText(String.valueOf(v1().getRc_np_issued_by()));
        }
        String rc_np_upto2 = v1().getRc_np_upto();
        if (rc_np_upto2 == null || rc_np_upto2.length() == 0) {
            appCompatTextView = s1().U;
        } else {
            appCompatTextView = s1().U;
            str = String.valueOf(v1().getRc_np_upto());
        }
        appCompatTextView.setText(str);
    }

    public final void O1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void P1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void Q1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.K = vahanProService;
    }

    public final void R1(h hVar) {
        l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        AppCompatTextView appCompatTextView;
        String q12;
        super.onCreate(bundle);
        setContentView((int) R.layout.fragment_vehicle_details);
        ab c10 = ab.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        E1(c10);
        setContentView((View) s1().b());
        e.f17509a.T2(this, s1());
        Q1(VahanProService.f21196b.b(this));
        M1(new ProgressDialog(this));
        t1().setMessage("Please wait...");
        t1().setCancelable(false);
        t1().setCanceledOnTouchOutside(false);
        R1((h) new u0((x0) this, (u0.b) new g(new wg.d(w1()))).a(h.class));
        O1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        P1((NrvDetails) serializableExtra);
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        ld.c cVar = new ld.c(this);
        TextView textView = s1().J0;
        textView.setText(cVar.b("vehicle_no", "Vehicle No.:") + ' ' + u1());
        s1().f25322y0.f28308i.setText(cVar.b("vehicle_details", "Vehicle Details"));
        s1().f25277c.setOnClickListener(new e6(this));
        try {
            this.M = v1().getRc_off_cd();
            p1(u1(), v1());
            N1();
            if (!r1().equals("NA") || !q1().equals("NA")) {
                if (!r1().equals("NA") || q1().equals("NA")) {
                    s1().B0.setText(r1());
                    appCompatTextView = s1().f25324z0;
                    q12 = q1();
                } else {
                    s1().f25278c0.setVisibility(8);
                    s1().B0.setVisibility(8);
                    appCompatTextView = s1().f25324z0;
                    q12 = q1();
                }
                appCompatTextView.setText(q12);
                F1();
                s1().X.setOnClickListener(new f6(this));
                s1().f25322y0.f28305f.setOnClickListener(new g6(this));
                s1().f25322y0.f28306g.setOnClickListener(new h6(this));
            }
            s1().f25281e.setVisibility(8);
            F1();
            s1().X.setOnClickListener(new f6(this));
            s1().f25322y0.f28305f.setOnClickListener(new g6(this));
            s1().f25322y0.f28306g.setOnClickListener(new h6(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String q1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String r1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final ab s1() {
        ab abVar = this.I;
        if (abVar != null) {
            return abVar;
        }
        l.v("binding");
        return null;
    }

    public final ProgressDialog t1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String u1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails v1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService w1() {
        VahanProService vahanProService = this.K;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }
}
