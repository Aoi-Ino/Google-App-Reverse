package com.nic.mparivahan.VahanServices.VahanView;

import ai.g0;
import ai.h0;
import ai.i0;
import ai.j0;
import ai.k0;
import ai.l0;
import ai.m0;
import ai.n0;
import ai.o0;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.FeesDetailsScreen;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.io.Serializable;
import ka.c;
import ni.pc;
import v9.e;

public final class VahanDetailsForRcParticulara extends d {
    public String G;
    public NrvDetails H;
    public pc I;
    public h J;
    public VahanProService K;
    public ProgressDialog L;
    private String M = "0";
    private boolean N;
    public String O;
    public String P;

    private final void D1() {
        r1().f28029b0.setOnClickListener(new j0(this));
        r1().I0.setOnClickListener(new k0(this));
        r1().f28039g0.setOnClickListener(new l0(this));
        r1().f28061r0.setOnClickListener(new m0(this));
        r1().B.setOnClickListener(new n0(this));
        r1().f28052n.setOnClickListener(new o0(this));
    }

    /* access modifiers changed from: private */
    public static final void E1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().I.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().I.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().I.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().L.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().J.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().K.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().H.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().G.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void F1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().L.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().L.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().L.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().I.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().J.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().K.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().H.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().G.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void G1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().J.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().J.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().J.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().I.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().L.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().K.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().H.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().G.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().K.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().K.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().K.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().I.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().L.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().J.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().H.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().G.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().H.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().H.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().H.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().I.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().L.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().J.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().K.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().G.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        if (vahanDetailsForRcParticulara.r1().G.getVisibility() == 0) {
            vahanDetailsForRcParticulara.r1().G.setVisibility(8);
            vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_down);
        } else {
            vahanDetailsForRcParticulara.r1().G.setVisibility(0);
            vahanDetailsForRcParticulara.r1().f28036f.setImageResource(R.drawable.ic_arrow_up);
        }
        vahanDetailsForRcParticulara.r1().I.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28046k.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().L.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28044j.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().J.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28040h.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().K.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28042i.setImageResource(R.drawable.ic_arrow_down);
        vahanDetailsForRcParticulara.r1().H.setVisibility(8);
        vahanDetailsForRcParticulara.r1().f28038g.setImageResource(R.drawable.ic_arrow_down);
    }

    private final void o1(String str, NrvDetails nrvDetails) {
        String rc_owner_name = nrvDetails.getRc_owner_name();
        String str2 = null;
        if (rc_owner_name == null || rc_owner_name.length() == 0) {
            r1().f28035e0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView = r1().f28035e0;
            String rc_owner_name2 = nrvDetails.getRc_owner_name();
            if (rc_owner_name2 == null) {
                rc_owner_name2 = null;
            }
            appCompatTextView.setText(rc_owner_name2);
        }
        String rc_f_name = nrvDetails.getRc_f_name();
        if (rc_f_name == null || rc_f_name.length() == 0) {
            r1().E0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView2 = r1().E0;
            String rc_f_name2 = nrvDetails.getRc_f_name();
            if (rc_f_name2 == null) {
                rc_f_name2 = null;
            }
            appCompatTextView2.setText(rc_f_name2);
        }
        String rc_regn_no = nrvDetails.getRc_regn_no();
        if (rc_regn_no == null || rc_regn_no.length() == 0) {
            r1().J0.setText("NA");
        } else {
            AppCompatTextView appCompatTextView3 = r1().J0;
            String rc_vh_class_desc = nrvDetails.getRc_vh_class_desc();
            if (rc_vh_class_desc == null) {
                rc_vh_class_desc = null;
            }
            appCompatTextView3.setText(rc_vh_class_desc);
        }
        String rc_vch_catg_desc = nrvDetails.getRc_vch_catg_desc();
        if (rc_vch_catg_desc == null || rc_vch_catg_desc.length() == 0) {
            r1().F0.setText("NA");
        } else {
            r1().F0.setText(nrvDetails.getRc_vch_catg_desc().toString());
        }
        String rc_maker_desc = nrvDetails.getRc_maker_desc();
        if (rc_maker_desc == null || rc_maker_desc.length() == 0) {
            r1().M.setText("NA");
        } else {
            r1().M.setText(nrvDetails.getRc_maker_desc().toString());
        }
        String rc_maker_model = nrvDetails.getRc_maker_model();
        if (rc_maker_model == null || rc_maker_model.length() == 0) {
            r1().O.setText("NA");
        } else {
            r1().O.setText(nrvDetails.getRc_maker_model().toString());
        }
        String rc_regn_dt = nrvDetails.getRc_regn_dt();
        if (rc_regn_dt == null || rc_regn_dt.length() == 0) {
            r1().f28073x0.setText("NA");
        } else {
            r1().f28073x0.setText(nrvDetails.getRc_regn_dt().toString());
        }
        String rc_fuel_desc = nrvDetails.getRc_fuel_desc();
        if (rc_fuel_desc == null || rc_fuel_desc.length() == 0) {
            r1().f28062s.setText("NA");
        } else {
            r1().f28062s.setText(nrvDetails.getRc_fuel_desc().toString());
        }
        String rc_norms_desc = nrvDetails.getRc_norms_desc();
        if (rc_norms_desc == null || rc_norms_desc.length() == 0) {
            r1().Z.setText("NA");
        } else {
            r1().Z.setText(nrvDetails.getRc_norms_desc().toString());
        }
        c.a aVar = c.f13158a;
        if (!aVar.m(String.valueOf(nrvDetails.getRc_tax_upto()))) {
            r1().L0.setText(String.valueOf(nrvDetails.getRc_tax_upto()));
        } else {
            r1().L0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_no()))) {
            r1().f28047k0.setText(String.valueOf(nrvDetails.getRc_permit_no()));
        } else {
            r1().f28047k0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_issue_dt()))) {
            r1().f28043i0.setText(String.valueOf(nrvDetails.getRc_permit_issue_dt()));
        } else {
            r1().f28043i0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_type()))) {
            r1().f28051m0.setText(String.valueOf(nrvDetails.getRc_permit_type()));
        } else {
            r1().f28051m0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_valid_from()))) {
            r1().f28057p0.setText(String.valueOf(nrvDetails.getRc_permit_valid_from()));
        } else {
            r1().f28057p0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_permit_valid_upto()))) {
            r1().f28053n0.setText(String.valueOf(nrvDetails.getRc_permit_valid_upto()));
        } else {
            r1().f28053n0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_np_no()))) {
            r1().T.setText(String.valueOf(nrvDetails.getRc_np_no()));
        } else {
            r1().T.setText("NA");
        }
        String rc_np_issued_by = nrvDetails.getRc_np_issued_by();
        if (rc_np_issued_by == null || rc_np_issued_by.length() == 0) {
            r1().R.setText("NA");
        } else {
            r1().R.setText(nrvDetails.getRc_np_issued_by().toString());
        }
        String rc_np_upto = nrvDetails.getRc_np_upto();
        if (rc_np_upto == null || rc_np_upto.length() == 0) {
            r1().U.setText("NA");
        } else {
            r1().U.setText(nrvDetails.getRc_np_upto().toString());
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_pucc_no()))) {
            r1().f28065t0.setText(String.valueOf(nrvDetails.getRc_pucc_no()));
        } else {
            r1().f28065t0.setText("NA");
        }
        if (!aVar.m(String.valueOf(nrvDetails.getRc_pucc_upto()))) {
            r1().f28069v0.setText(String.valueOf(nrvDetails.getRc_pucc_upto()));
        } else {
            r1().f28069v0.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_policy_no())) {
            AppCompatTextView appCompatTextView4 = r1().D;
            String rc_insurance_policy_no = nrvDetails.getRc_insurance_policy_no();
            if (rc_insurance_policy_no == null) {
                rc_insurance_policy_no = null;
            }
            appCompatTextView4.setText(rc_insurance_policy_no);
        } else {
            r1().D.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_comp())) {
            AppCompatTextView appCompatTextView5 = r1().f28076z;
            String rc_insurance_comp = nrvDetails.getRc_insurance_comp();
            if (rc_insurance_comp == null) {
                rc_insurance_comp = null;
            }
            appCompatTextView5.setText(rc_insurance_comp);
        } else {
            r1().f28076z.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_insurance_upto())) {
            AppCompatTextView appCompatTextView6 = r1().F;
            String rc_insurance_upto = nrvDetails.getRc_insurance_upto();
            if (rc_insurance_upto == null) {
                rc_insurance_upto = null;
            }
            appCompatTextView6.setText(rc_insurance_upto);
        } else {
            r1().F.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_financer())) {
            AppCompatTextView appCompatTextView7 = r1().f28054o;
            String rc_financer = nrvDetails.getRc_financer();
            if (rc_financer == null) {
                rc_financer = null;
            }
            appCompatTextView7.setText(rc_financer);
        } else {
            r1().f28054o.setText("NA");
        }
        if (!aVar.m(nrvDetails.getRc_fit_upto())) {
            AppCompatTextView appCompatTextView8 = r1().f28058q;
            String rc_fit_upto = nrvDetails.getRc_fit_upto();
            if (rc_fit_upto != null) {
                str2 = rc_fit_upto;
            }
            appCompatTextView8.setText(str2);
            return;
        }
        r1().f28058q.setText("NA");
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        vahanDetailsForRcParticulara.setIntent(new Intent(vahanDetailsForRcParticulara, FeesDetailsScreen.class));
        vahanDetailsForRcParticulara.getIntent().putExtra(VContant.NEXGEN_INTENT_CODE, VContant.RCPARTICULAR_CODE);
        vahanDetailsForRcParticulara.getIntent().putExtra(VContant.PURPOSE_CODE, VContant.RCPARTICULAR_PURPOSE_CODE);
        vahanDetailsForRcParticulara.getIntent().putExtra("state_code", vahanDetailsForRcParticulara.u1().getState_cd());
        Intent intent = vahanDetailsForRcParticulara.getIntent();
        if (intent != null) {
            intent.putExtra("rc_number", vahanDetailsForRcParticulara.t1());
        }
        Intent intent2 = vahanDetailsForRcParticulara.getIntent();
        if (intent2 != null) {
            intent2.putExtra("RC", vahanDetailsForRcParticulara.t1());
        }
        Intent intent3 = vahanDetailsForRcParticulara.getIntent();
        if (intent3 != null) {
            intent3.putExtra("RcDetails", vahanDetailsForRcParticulara.u1());
        }
        vahanDetailsForRcParticulara.getIntent().putExtra(VContant.SERVICE_NAME, "RC Particulars against Fee");
        Intent intent4 = vahanDetailsForRcParticulara.getIntent();
        if (intent4 != null) {
            intent4.putExtra("off_code", vahanDetailsForRcParticulara.M);
        }
        Intent intent5 = vahanDetailsForRcParticulara.getIntent();
        if (intent5 != null) {
            intent5.putExtra(VContant.NEXGEN_isFACELESS, vahanDetailsForRcParticulara.N);
        }
        Intent intent6 = vahanDetailsForRcParticulara.getIntent();
        if (intent6 != null) {
            intent6.putExtra(VContant.NEXGEN_addahar_name, vahanDetailsForRcParticulara.q1());
        }
        Intent intent7 = vahanDetailsForRcParticulara.getIntent();
        if (intent7 != null) {
            intent7.putExtra(VContant.NEXGEN_addahar_address, vahanDetailsForRcParticulara.p1());
        }
        vahanDetailsForRcParticulara.startActivity(vahanDetailsForRcParticulara.getIntent());
        vahanDetailsForRcParticulara.finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        vahanDetailsForRcParticulara.finish();
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanDetailsForRcParticulara vahanDetailsForRcParticulara, View view) {
        l.f(vahanDetailsForRcParticulara, "this$0");
        vahanDetailsForRcParticulara.z1();
    }

    private final void z1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void B1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void C1(pc pcVar) {
        l.f(pcVar, "<set-?>");
        this.I = pcVar;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void L1() {
        AppCompatTextView appCompatTextView;
        String rc_permit_issue_dt;
        String rc_permit_type;
        String rc_permit_valid_from;
        String rc_permit_valid_upto;
        String rc_np_no;
        String rc_np_issued_by;
        String rc_np_upto;
        String rc_permit_no = u1().getRc_permit_no();
        if ((rc_permit_no == null || rc_permit_no.length() == 0) && (((rc_permit_issue_dt = u1().getRc_permit_issue_dt()) == null || rc_permit_issue_dt.length() == 0) && (((rc_permit_type = u1().getRc_permit_type()) == null || rc_permit_type.length() == 0) && (((rc_permit_valid_from = u1().getRc_permit_valid_from()) == null || rc_permit_valid_from.length() == 0) && (((rc_permit_valid_upto = u1().getRc_permit_valid_upto()) == null || rc_permit_valid_upto.length() == 0) && (((rc_np_no = u1().getRc_np_no()) == null || rc_np_no.length() == 0) && (((rc_np_issued_by = u1().getRc_np_issued_by()) == null || rc_np_issued_by.length() == 0) && ((rc_np_upto = u1().getRc_np_upto()) == null || rc_np_upto.length() == 0)))))))) {
            r1().f28037f0.setVisibility(8);
            return;
        }
        String rc_permit_no2 = u1().getRc_permit_no();
        String str = "NA";
        if (rc_permit_no2 == null || rc_permit_no2.length() == 0) {
            r1().f28047k0.setText(str);
        } else {
            r1().f28047k0.setText(String.valueOf(u1().getRc_permit_no()));
        }
        String rc_permit_issue_dt2 = u1().getRc_permit_issue_dt();
        if (rc_permit_issue_dt2 == null || rc_permit_issue_dt2.length() == 0) {
            r1().f28043i0.setText(str);
        } else {
            r1().f28043i0.setText(String.valueOf(u1().getRc_permit_issue_dt()));
        }
        String rc_permit_type2 = u1().getRc_permit_type();
        if (rc_permit_type2 == null || rc_permit_type2.length() == 0) {
            r1().f28051m0.setText(str);
        } else {
            r1().f28051m0.setText(String.valueOf(u1().getRc_permit_type()));
        }
        String rc_permit_valid_from2 = u1().getRc_permit_valid_from();
        if (rc_permit_valid_from2 == null || rc_permit_valid_from2.length() == 0) {
            r1().f28057p0.setText(str);
        } else {
            r1().f28057p0.setText(String.valueOf(u1().getRc_permit_valid_from()));
        }
        String rc_permit_valid_upto2 = u1().getRc_permit_valid_upto();
        if (rc_permit_valid_upto2 == null || rc_permit_valid_upto2.length() == 0) {
            r1().f28053n0.setText(str);
        } else {
            r1().f28053n0.setText(String.valueOf(u1().getRc_permit_valid_upto()));
        }
        String rc_np_no2 = u1().getRc_np_no();
        if (rc_np_no2 == null || rc_np_no2.length() == 0) {
            r1().T.setText(str);
        } else {
            r1().T.setText(String.valueOf(u1().getRc_np_no()));
        }
        String rc_np_issued_by2 = u1().getRc_np_issued_by();
        if (rc_np_issued_by2 == null || rc_np_issued_by2.length() == 0) {
            r1().R.setText(str);
        } else {
            r1().R.setText(String.valueOf(u1().getRc_np_issued_by()));
        }
        String rc_np_upto2 = u1().getRc_np_upto();
        if (rc_np_upto2 == null || rc_np_upto2.length() == 0) {
            appCompatTextView = r1().U;
        } else {
            appCompatTextView = r1().U;
            str = String.valueOf(u1().getRc_np_upto());
        }
        appCompatTextView.setText(str);
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void N1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void O1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.K = vahanProService;
    }

    public final void P1(h hVar) {
        l.f(hVar, "<set-?>");
        this.J = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        AppCompatTextView appCompatTextView;
        String p12;
        super.onCreate(bundle);
        setContentView((int) R.layout.rc_partucalar_layout);
        pc c10 = pc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        C1(c10);
        setContentView((View) r1().b());
        e.a aVar = e.f17509a;
        aVar.x2(this, r1());
        O1(VahanProService.f21196b.b(this));
        K1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        P1((h) new u0((x0) this, (u0.b) new g(new wg.d(v1()))).a(h.class));
        M1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        B1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        A1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        r1().K0.setText("Vehicle Details");
        r1().A0.f28308i.setText(aVar.O(this, "RC Particulars against Fee"));
        if (u1() != null) {
            try {
                this.M = String.valueOf(u1().getRc_off_cd());
                o1(t1(), u1());
                L1();
                if (!q1().equals("NA") || !p1().equals("NA")) {
                    if (!q1().equals("NA") || p1().equals("NA")) {
                        r1().D0.setText(q1());
                        appCompatTextView = r1().B0;
                        p12 = p1();
                    } else {
                        r1().f28033d0.setVisibility(8);
                        r1().D0.setVisibility(8);
                        appCompatTextView = r1().B0;
                        p12 = p1();
                    }
                    appCompatTextView.setText(p12);
                } else {
                    r1().f28034e.setVisibility(8);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        D1();
        r1().Y.setOnClickListener(new g0(this));
        r1().A0.f28305f.setOnClickListener(new h0(this));
        r1().A0.f28306g.setOnClickListener(new i0(this));
    }

    public final String p1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final pc r1() {
        pc pcVar = this.I;
        if (pcVar != null) {
            return pcVar;
        }
        l.v("binding");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService v1() {
        VahanProService vahanProService = this.K;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }
}
