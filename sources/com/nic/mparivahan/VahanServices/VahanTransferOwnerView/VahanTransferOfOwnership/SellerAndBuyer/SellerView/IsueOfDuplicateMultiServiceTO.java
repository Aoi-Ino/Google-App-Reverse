package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.VmServiceReasonEntityById;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.AddNomineeDtoX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import fh.s;
import fh.t;
import fh.u;
import fh.v;
import fh.w;
import fh.y;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ni.ib;
import og.a0;
import pg.g;
import pl.x;
import v9.e;
import z9.a;

public final class IsueOfDuplicateMultiServiceTO extends androidx.appcompat.app.d {
    public ib G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public String K;
    public NrvDetails L;
    public String M;
    public String N;
    public String O;
    private Calendar P = Calendar.getInstance();
    public String Q;
    private boolean R;
    public ld.c S;
    private ArrayList T = new ArrayList();
    private MultiServiceDraftTO U;
    public MultiSelectionViewModel V;
    public MultiService W;
    private MultiServiceDraftTO X;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiServiceTO f21378e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO) {
            super(1);
            this.f21378e = isueOfDuplicateMultiServiceTO;
        }

        public final void b(DReasonResponse dReasonResponse) {
            this.f21378e.s1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", (VmServiceReasonEntityById) null));
                    IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO = this.f21378e;
                    cm.l.c(dReasonResponse);
                    this.f21378e.o1().f26832h.setAdapter(new a0(isueOfDuplicateMultiServiceTO, dReasonResponse));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DReasonResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiServiceTO f21379e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO) {
            super(1);
            this.f21379e = isueOfDuplicateMultiServiceTO;
        }

        public final void b(String str) {
            this.f21379e.s1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ IsueOfDuplicateMultiServiceTO f21380e;

        c(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO) {
            this.f21380e = isueOfDuplicateMultiServiceTO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            LinearLayout linearLayout;
            int i11;
            cm.l.f(view, "view");
            Object selectedItem = this.f21380e.o1().f26832h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (p.o(dReasonResponseItem.getReason_desc(), "OTHER", true) || p.o(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                linearLayout = this.f21380e.o1().f26829e;
                i11 = 8;
            } else {
                linearLayout = this.f21380e.o1().f26829e;
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21381a;

        d(l lVar) {
            cm.l.f(lVar, "function");
            this.f21381a = lVar;
        }

        public final pl.c a() {
            return this.f21381a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21381a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(isueOfDuplicateMultiServiceTO, onDateSetListener, isueOfDuplicateMultiServiceTO.P.get(1), isueOfDuplicateMultiServiceTO.P.get(2), isueOfDuplicateMultiServiceTO.P.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void B1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, View view) {
        Toast makeText;
        IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO2 = isueOfDuplicateMultiServiceTO;
        cm.l.f(isueOfDuplicateMultiServiceTO2, "this$0");
        ld.c cVar = new ld.c(isueOfDuplicateMultiServiceTO2);
        try {
            String obj = isueOfDuplicateMultiServiceTO.o1().f26833i.getText().toString();
            String obj2 = isueOfDuplicateMultiServiceTO.o1().f26828d.getText().toString();
            String obj3 = isueOfDuplicateMultiServiceTO.o1().f26827c.getText().toString();
            String obj4 = isueOfDuplicateMultiServiceTO.o1().f26830f.getText().toString();
            Object selectedItem = isueOfDuplicateMultiServiceTO.o1().f26832h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (isueOfDuplicateMultiServiceTO.o1().f26832h.getSelectedItemPosition() == 0) {
                makeText = Toast.makeText(isueOfDuplicateMultiServiceTO2, cVar.b("please_Select_the_reason", isueOfDuplicateMultiServiceTO2.getString(R.string.please_Select_the_reason)), 0);
            } else if (obj.length() < 3) {
                makeText = Toast.makeText(isueOfDuplicateMultiServiceTO2, cVar.b("please_enter_the_remark", isueOfDuplicateMultiServiceTO2.getString(R.string.please_enter_the_remark)), 0);
            } else {
                if (obj2.length() < 3) {
                    if (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true)) {
                        makeText = Toast.makeText(isueOfDuplicateMultiServiceTO2, cVar.b("please_enter_the_valid_fir_no", isueOfDuplicateMultiServiceTO2.getString(R.string.please_enter_the_valid_fir_no)), 0);
                    }
                }
                if (obj3.length() < 3 && (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    makeText = Toast.makeText(isueOfDuplicateMultiServiceTO2, cVar.b("please_enter_fir_date", isueOfDuplicateMultiServiceTO2.getString(R.string.please_enter_fir_date)), 0);
                } else if (obj4.length() >= 3 || (!p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) && !p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    a.C0251a aVar = z9.a.f18947a;
                    String h10 = aVar.h(obj3);
                    int parseInt = Integer.parseInt(isueOfDuplicateMultiServiceTO.r1());
                    String m10 = v9.d.f17494a.m();
                    int parseInt2 = Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String h11 = aVar.h(obj3);
                    String valueOf = String.valueOf(dReasonResponseItem.getReason_desc());
                    String t12 = isueOfDuplicateMultiServiceTO.t1();
                    String valueOf2 = String.valueOf(isueOfDuplicateMultiServiceTO.u1().getState_cd());
                    String rc_vh_class_cd = isueOfDuplicateMultiServiceTO.u1().getRc_vh_class_cd();
                    cm.l.c(rc_vh_class_cd);
                    Durcdto durcdto = new Durcdto("", 0, h10, obj2, 0, " ", 0, " ", "", parseInt, m10, obj4, obj2, parseInt2, h11, " ", 0, valueOf, t12, valueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
                    MultiServiceDraftTO multiServiceDraftTO = isueOfDuplicateMultiServiceTO2.U;
                    cm.l.c(multiServiceDraftTO);
                    isueOfDuplicateMultiServiceTO2.X = MultiServiceDraftTO.copy$default(multiServiceDraftTO, (String) null, (String) null, (ii.a) null, (String) null, (ChanngeOfAdressDto) null, durcdto, (HpaDto) null, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (TransferOwnershipDto) null, (AddNomineeDtoX) null, 65503, (Object) null);
                    Intent intent = new Intent();
                    intent.setClass(isueOfDuplicateMultiServiceTO2, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView." + VContant.Companion.s(VContant.DUPLICATE_RC_PURPOSE_CODE, isueOfDuplicateMultiServiceTO2.T, "S")));
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, isueOfDuplicateMultiServiceTO2.T);
                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, isueOfDuplicateMultiServiceTO2.X);
                    intent.putExtra("RC", isueOfDuplicateMultiServiceTO.t1());
                    intent.putExtra("RcDetails", isueOfDuplicateMultiServiceTO.u1());
                    intent.putExtra("off_code", isueOfDuplicateMultiServiceTO.r1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, isueOfDuplicateMultiServiceTO2.R);
                    intent.putExtra(VContant.NEXGEN_addahar_name, isueOfDuplicateMultiServiceTO.n1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, isueOfDuplicateMultiServiceTO.m1());
                    isueOfDuplicateMultiServiceTO2.startActivity(intent);
                    isueOfDuplicateMultiServiceTO.finish();
                    return;
                } else {
                    makeText = Toast.makeText(isueOfDuplicateMultiServiceTO2, cVar.b("please_enter_police_station", isueOfDuplicateMultiServiceTO2.getString(R.string.please_enter_police_station)), 0);
                }
            }
            makeText.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, View view) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        VUtility.Companion.v(isueOfDuplicateMultiServiceTO, isueOfDuplicateMultiServiceTO.p1().b("are_you_sure_you_want_to_leave", isueOfDuplicateMultiServiceTO.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void D1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, View view) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        isueOfDuplicateMultiServiceTO.E1();
    }

    private final void E1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void x1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, View view) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        Intent intent = new Intent(isueOfDuplicateMultiServiceTO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", isueOfDuplicateMultiServiceTO.t1());
        intent.putExtra("RcDetails", isueOfDuplicateMultiServiceTO.u1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, isueOfDuplicateMultiServiceTO.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, isueOfDuplicateMultiServiceTO.n1());
        intent.putExtra(VContant.NEXGEN_addahar_address, isueOfDuplicateMultiServiceTO.m1());
        isueOfDuplicateMultiServiceTO.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void y1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, View view) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        try {
            g.f30363a.e(isueOfDuplicateMultiServiceTO, isueOfDuplicateMultiServiceTO.T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void z1(IsueOfDuplicateMultiServiceTO isueOfDuplicateMultiServiceTO, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(isueOfDuplicateMultiServiceTO, "this$0");
        isueOfDuplicateMultiServiceTO.P.set(1, i10);
        isueOfDuplicateMultiServiceTO.P.set(2, i11);
        isueOfDuplicateMultiServiceTO.P.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", isueOfDuplicateMultiServiceTO.P.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", isueOfDuplicateMultiServiceTO.P.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", isueOfDuplicateMultiServiceTO.P.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        isueOfDuplicateMultiServiceTO.I1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        isueOfDuplicateMultiServiceTO.o1().f26827c.setText(simpleDateFormat.format(isueOfDuplicateMultiServiceTO.P.getTime()));
    }

    public final void F1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void H1(ib ibVar) {
        cm.l.f(ibVar, "<set-?>");
        this.G = ibVar;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void J1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void K1(MultiService multiService) {
        cm.l.f(multiService, "<set-?>");
        this.W = multiService;
    }

    public final void L1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void N1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void O1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void P1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void Q1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void R1(MultiSelectionViewModel multiSelectionViewModel) {
        cm.l.f(multiSelectionViewModel, "<set-?>");
        this.V = multiSelectionViewModel;
    }

    public final String m1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String n1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final ib o1() {
        ib ibVar = this.G;
        if (ibVar != null) {
            return ibVar;
        }
        cm.l.v("binding");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, p1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        String valueOf;
        super.onCreate(bundle);
        setContentView((int) R.layout.issueofduplicate_rc_multi);
        ib c10 = ib.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        H1(c10);
        setContentView((View) o1().b());
        getWindow().addFlags(128);
        e.f17509a.C2(this, o1());
        P1(VahanProService.f21196b.b(this));
        J1(new ld.c(this));
        M1(new ProgressDialog(this));
        s1().setMessage("Please wait...");
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        Q1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(v1()))).a(h.class));
        K1(MultiService.f21070a.b(this));
        R1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(q1()))).a(MultiSelectionViewModel.class));
        L1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.R = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        F1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        N1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        O1((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.U = (MultiServiceDraftTO) serializableExtra2;
        ArrayList arrayList = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        this.T = arrayList;
        cm.l.c(arrayList);
        if (arrayList.size() <= 1) {
            J1(new ld.c(this));
            textView = o1().f26836l.f28308i;
            valueOf = p1().b("issue_of_duplicate_rc", getString(R.string.vahan_duplicate_rc));
        } else {
            textView = o1().f26836l.f28308i;
            valueOf = String.valueOf(p1().b("toSellerHeader", "Transfer of Ownership \n(Seller)"));
        }
        textView.setText(valueOf);
        if (this.R) {
            o1().f26831g.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.R;
        LinearLayout linearLayout = o1().f26831g.f27159b;
        cm.l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        J1(new ld.c(this));
        o1().f26836l.f28304e.setVisibility(0);
        o1().f26836l.f28304e.setText(t1());
        SpannableString spannableString = new SpannableString(t1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        o1().f26836l.f28304e.setText(spannableString);
        o1().f26845u.setText(p1().b("view_vehicle_details", "View Vehicle Details"));
        o1().f26845u.setPaintFlags(o1().f26845u.getPaintFlags() | 8);
        o1().f26836l.f28304e.setOnClickListener(new s(this));
        o1().f26836l.f28308i.setOnClickListener(new t(this));
        try {
            s1().show();
            w1().I0(this, VContant.DUPLICATE_RC_PURPOSE_CODE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        o1().f26827c.setOnClickListener(new v(this, new u(this)));
        w1().H().g(this, new d(new a(this)));
        w1().I().g(this, new d(new b(this)));
        o1().f26832h.setOnItemSelectedListener(new c(this));
        o1().f26826b.setOnClickListener(new w(this));
        o1().f26836l.f28305f.setOnClickListener(new fh.x(this));
        o1().f26836l.f28306g.setOnClickListener(new y(this));
    }

    public final ld.c p1() {
        ld.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final MultiService q1() {
        MultiService multiService = this.W;
        if (multiService != null) {
            return multiService;
        }
        cm.l.v("multiService");
        return null;
    }

    public final String r1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String t1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails u1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService v1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h w1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }
}
