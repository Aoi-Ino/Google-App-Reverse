package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.AddNomineeDtoX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import fh.i;
import fh.j;
import fh.k;
import fh.m;
import fh.n;
import fh.o;
import fh.p;
import fh.q;
import fh.r;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ld.c;
import ni.cb;
import pg.g;
import v9.e;
import z9.a;

public final class HypothecationTerminationActivityMultiServiceTO extends d {
    public ProgressDialog G;
    public h H;
    public VahanProService I;
    public cb J;
    public String K;
    public String L;
    public NrvDetails M;
    private Calendar N = Calendar.getInstance();
    public String O;
    public HptDetailsModle P;
    private boolean Q;
    public String R;
    public String S;
    public c T;
    public c U;
    private ArrayList V = new ArrayList();
    private MultiServiceDraftTO W;
    private MultiServiceDraftTO X;
    public MultiSelectionViewModel Y;
    public MultiService Z;

    /* access modifiers changed from: private */
    public static final void C1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        try {
            g.f30363a.e(hypothecationTerminationActivityMultiServiceTO, hypothecationTerminationActivityMultiServiceTO.V);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        Intent intent = new Intent(hypothecationTerminationActivityMultiServiceTO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationTerminationActivityMultiServiceTO.y1());
        intent.putExtra("RcDetails", hypothecationTerminationActivityMultiServiceTO.z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivityMultiServiceTO.Q);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivityMultiServiceTO.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivityMultiServiceTO.p1());
        hypothecationTerminationActivityMultiServiceTO.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        hypothecationTerminationActivityMultiServiceTO.N.set(1, i10);
        hypothecationTerminationActivityMultiServiceTO.N.set(2, i11);
        hypothecationTerminationActivityMultiServiceTO.N.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationTerminationActivityMultiServiceTO.N.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationTerminationActivityMultiServiceTO.N.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationTerminationActivityMultiServiceTO.N.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationTerminationActivityMultiServiceTO.P1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationTerminationActivityMultiServiceTO.r1().f25743h.setText(simpleDateFormat.format(hypothecationTerminationActivityMultiServiceTO.N.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationTerminationActivityMultiServiceTO, onDateSetListener, hypothecationTerminationActivityMultiServiceTO.N.get(1), hypothecationTerminationActivityMultiServiceTO.N.get(2), hypothecationTerminationActivityMultiServiceTO.N.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, HptDetailsModle hptDetailsModle) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        hypothecationTerminationActivityMultiServiceTO.x1().dismiss();
        try {
            l.c(hptDetailsModle);
            hypothecationTerminationActivityMultiServiceTO.Q1(hptDetailsModle);
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            String valueOf5 = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            c.a aVar = ka.c.f13158a;
            if (!aVar.m(str)) {
                if (!aVar.m(valueOf)) {
                    if (valueOf.length() == 0) {
                        hypothecationTerminationActivityMultiServiceTO.r1().f25747l.setText("--");
                    } else {
                        hypothecationTerminationActivityMultiServiceTO.r1().f25747l.setText(valueOf);
                    }
                    if (valueOf2.length() != 0) {
                        AppCompatTextView appCompatTextView = hypothecationTerminationActivityMultiServiceTO.r1().f25745j;
                        appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
                    }
                    if (valueOf5.length() != 0) {
                        hypothecationTerminationActivityMultiServiceTO.r1().f25742g.setText(a.f18947a.f(valueOf5));
                    }
                    if (str == null) {
                        return;
                    }
                    if (str.length() != 0) {
                        hypothecationTerminationActivityMultiServiceTO.r1().f25759x.setText(str.toString());
                        return;
                    }
                    return;
                }
            }
            String b10 = hypothecationTerminationActivityMultiServiceTO.u1().b("unable_to_process_your_request", hypothecationTerminationActivityMultiServiceTO.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivityMultiServiceTO.b2(hypothecationTerminationActivityMultiServiceTO, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, String str) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        hypothecationTerminationActivityMultiServiceTO.x1().dismiss();
        try {
            String b10 = hypothecationTerminationActivityMultiServiceTO.u1().b("unable_to_process_your_request", hypothecationTerminationActivityMultiServiceTO.getString(R.string.unable_to_process_your_request));
            l.c(b10);
            hypothecationTerminationActivityMultiServiceTO.b2(hypothecationTerminationActivityMultiServiceTO, b10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO2 = hypothecationTerminationActivityMultiServiceTO;
        l.f(hypothecationTerminationActivityMultiServiceTO2, "this$0");
        if (hypothecationTerminationActivityMultiServiceTO.r1().f25743h.getText().length() < 2) {
            Toast.makeText(hypothecationTerminationActivityMultiServiceTO2, hypothecationTerminationActivityMultiServiceTO.t1().b("please_select_date", hypothecationTerminationActivityMultiServiceTO2.getString(R.string.please_select_date)), 0).show();
            return;
        }
        try {
            String valueOf = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFncr_add1());
            String valueOf2 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFncr_add2());
            String valueOf3 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFncr_add3());
            String fncr_district = hypothecationTerminationActivityMultiServiceTO.s1().getFncr_district();
            l.c(fncr_district);
            int parseInt = Integer.parseInt(fncr_district);
            String valueOf4 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFncr_district());
            String valueOf5 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFncr_name());
            String fncr_pincode = hypothecationTerminationActivityMultiServiceTO.s1().getFncr_pincode();
            Integer valueOf6 = Integer.valueOf(fncr_pincode != null ? Integer.parseInt(fncr_pincode) : 1);
            String fncr_state = hypothecationTerminationActivityMultiServiceTO.s1().getFncr_state();
            String fncr_state2 = hypothecationTerminationActivityMultiServiceTO.s1().getFncr_state();
            String valueOf7 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.s1().getFrom_dt());
            String hp_type = hypothecationTerminationActivityMultiServiceTO.s1().getHp_type();
            int parseInt2 = Integer.parseInt(hypothecationTerminationActivityMultiServiceTO.w1());
            String m10 = v9.d.f17494a.m();
            int parseInt3 = Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
            String y12 = hypothecationTerminationActivityMultiServiceTO.y1();
            Integer rc_owner_srNo = hypothecationTerminationActivityMultiServiceTO.z1().getRc_owner_srNo();
            int intValue = rc_owner_srNo != null ? rc_owner_srNo.intValue() : 1;
            String valueOf8 = String.valueOf(hypothecationTerminationActivityMultiServiceTO.z1().getState_cd());
            a.C0251a aVar = a.f18947a;
            HptDto hptDto = new HptDto(" ", valueOf, valueOf2, valueOf3, parseInt, valueOf4, valueOf5, valueOf6, fncr_state, fncr_state2, 0, "0", 0, "0", valueOf7, " ", hp_type, " ", parseInt2, m10, parseInt3, y12, intValue, valueOf8, aVar.h(hypothecationTerminationActivityMultiServiceTO.r1().f25743h.getText().toString()), " ", aVar.h(hypothecationTerminationActivityMultiServiceTO.r1().f25743h.getText().toString()), " ");
            MultiServiceDraftTO multiServiceDraftTO = hypothecationTerminationActivityMultiServiceTO2.W;
            l.c(multiServiceDraftTO);
            hypothecationTerminationActivityMultiServiceTO2.X = MultiServiceDraftTO.copy$default(multiServiceDraftTO, (String) null, (String) null, (ii.a) null, (String) null, (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (TransferOwnershipDto) null, (AddNomineeDtoX) null, 65407, (Object) null);
            Intent intent = new Intent();
            intent.setClass(hypothecationTerminationActivityMultiServiceTO2, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.Companion.s(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, hypothecationTerminationActivityMultiServiceTO2.V, "S")));
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationTerminationActivityMultiServiceTO2.V);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationTerminationActivityMultiServiceTO2.X);
            intent.putExtra("RC", hypothecationTerminationActivityMultiServiceTO.y1());
            intent.putExtra("RcDetails", hypothecationTerminationActivityMultiServiceTO.z1());
            intent.putExtra("off_code", hypothecationTerminationActivityMultiServiceTO.w1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationTerminationActivityMultiServiceTO2.Q);
            intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationTerminationActivityMultiServiceTO.q1());
            intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationTerminationActivityMultiServiceTO.p1());
            hypothecationTerminationActivityMultiServiceTO2.startActivity(intent);
            hypothecationTerminationActivityMultiServiceTO.finish();
        } catch (Exception e10) {
            try {
                e10.printStackTrace();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        VUtility.Companion.v(hypothecationTerminationActivityMultiServiceTO, hypothecationTerminationActivityMultiServiceTO.t1().b("are_you_sure_you_want_to_leave", hypothecationTerminationActivityMultiServiceTO.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        hypothecationTerminationActivityMultiServiceTO.L1();
    }

    private final void L1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, HypothecationTerminationActivityMultiServiceTO hypothecationTerminationActivityMultiServiceTO, View view) {
        l.f(dialog, "$dialog");
        l.f(hypothecationTerminationActivityMultiServiceTO, "this$0");
        dialog.dismiss();
        hypothecationTerminationActivityMultiServiceTO.finish();
    }

    public final VahanProService A1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h B1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final void N1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void O1(cb cbVar) {
        l.f(cbVar, "<set-?>");
        this.J = cbVar;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void Q1(HptDetailsModle hptDetailsModle) {
        l.f(hptDetailsModle, "<set-?>");
        this.P = hptDetailsModle;
    }

    public final void R1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void S1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void T1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.Z = multiService;
    }

    public final void U1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void X1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void Y1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void Z1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void a2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.Y = multiSelectionViewModel;
    }

    public final void b2(Context context, String str) {
        l.f(context, "context");
        l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new r(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, new ld.c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        String valueOf;
        super.onCreate(bundle);
        setContentView((int) R.layout.hpttermination_multi_service);
        cb c10 = cb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        O1(c10);
        setContentView((View) r1().b());
        getWindow().addFlags(128);
        S1(new ld.c(this));
        R1(new ld.c(this));
        e.f17509a.X0(this, r1());
        Y1(VahanProService.f21196b.b(this));
        V1(new ProgressDialog(this));
        x1().setMessage("Please wait...");
        x1().setCancelable(false);
        x1().setCanceledOnTouchOutside(false);
        Z1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(A1()))).a(h.class));
        T1(MultiService.f21070a.b(this));
        a2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(v1()))).a(MultiSelectionViewModel.class));
        W1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        X1((NrvDetails) serializableExtra);
        N1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        M1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.W = (MultiServiceDraftTO) serializableExtra2;
        this.V = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        r1().f25758w.f28304e.setVisibility(0);
        r1().f25758w.f28304e.setText(y1());
        SpannableString spannableString = new SpannableString(y1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        r1().f25758w.f28304e.setText(spannableString);
        ArrayList arrayList = this.V;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            R1(new ld.c(this));
            textView = r1().f25758w.f28308i;
            valueOf = t1().b("hypothecation_termination", getString(R.string.vahan_hypothecation_termination));
        } else {
            textView = r1().f25758w.f28308i;
            valueOf = String.valueOf(t1().b("toSellerHeader", "Transfer of Ownership \n(Seller)"));
        }
        textView.setText(valueOf);
        r1().f25758w.f28308i.setOnClickListener(new i(this));
        TextView textView2 = r1().I;
        textView2.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + y1());
        r1().J.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        r1().J.setPaintFlags(r1().J.getPaintFlags() | 8);
        r1().f25758w.f28304e.setOnClickListener(new j(this));
        U1(String.valueOf(z1().getRc_off_cd()));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.Q = booleanExtra;
        if (booleanExtra) {
            r1().f25754s.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.Q;
        LinearLayout linearLayout = r1().f25754s.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        try {
            x1().show();
            B1().i0(this, y1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        r1().f25743h.setOnClickListener(new fh.l(this, new k(this)));
        B1().j0().g(this, new m(this));
        B1().k0().g(this, new n(this));
        r1().f25739d.setOnClickListener(new o(this));
        r1().f25758w.f28305f.setOnClickListener(new p(this));
        r1().f25758w.f28306g.setOnClickListener(new q(this));
    }

    public final String p1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final cb r1() {
        cb cbVar = this.J;
        if (cbVar != null) {
            return cbVar;
        }
        l.v("binding");
        return null;
    }

    public final HptDetailsModle s1() {
        HptDetailsModle hptDetailsModle = this.P;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        l.v("htpmodle");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final ld.c u1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final MultiService v1() {
        MultiService multiService = this.Z;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String w1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog x1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String y1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails z1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }
}
