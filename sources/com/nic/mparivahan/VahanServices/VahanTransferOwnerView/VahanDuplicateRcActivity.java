package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem;
import com.nic.mparivahan.VahanServices.DRcModle.DuprcDto;
import com.nic.mparivahan.VahanServices.DRcModle.VmServiceReasonEntityById;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.DRcModle.duprcDtoRequestModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ni.pd;
import og.a0;
import pl.x;
import v9.d;
import yg.g1;
import yg.h1;
import yg.i1;
import yg.j1;
import yg.k1;
import yg.l1;
import z9.a;

public final class VahanDuplicateRcActivity extends androidx.appcompat.app.d {
    public pd G;
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

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateRcActivity f21237e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
            super(1);
            this.f21237e = vahanDuplicateRcActivity;
        }

        public final void b(DReasonResponse dReasonResponse) {
            this.f21237e.q1().dismiss();
            try {
                if (dReasonResponse.size() > 0) {
                    dReasonResponse.add(0, new DReasonResponseItem("Select Reason", (VmServiceReasonEntityById) null));
                    VahanDuplicateRcActivity vahanDuplicateRcActivity = this.f21237e;
                    cm.l.c(dReasonResponse);
                    this.f21237e.n1().f28085h.setAdapter(new a0(vahanDuplicateRcActivity, dReasonResponse));
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
        final /* synthetic */ VahanDuplicateRcActivity f21238e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
            super(1);
            this.f21238e = vahanDuplicateRcActivity;
        }

        public final void b(String str) {
            this.f21238e.q1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateRcActivity f21239e;

        c(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
            this.f21239e = vahanDuplicateRcActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            LinearLayout linearLayout;
            int i11;
            cm.l.f(view, "view");
            Object selectedItem = this.f21239e.n1().f28085h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (p.o(dReasonResponseItem.getReason_desc(), "OTHER", true) || p.o(dReasonResponseItem.getReason_desc(), "TORN", true)) {
                linearLayout = this.f21239e.n1().f28082e;
                i11 = 8;
            } else {
                linearLayout = this.f21239e.n1().f28082e;
                i11 = 0;
            }
            linearLayout.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateRcActivity f21240e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
            super(1);
            this.f21240e = vahanDuplicateRcActivity;
        }

        public final void b(dulicateRcResponseModle dulicatercresponsemodle) {
            dulicateRcResponseModle dulicatercresponsemodle2;
            this.f21240e.q1().dismiss();
            String appl_no = dulicatercresponsemodle.getAppl_no();
            if (appl_no != null && appl_no.length() != 0) {
                ld.h hVar = new ld.h(this.f21240e);
                cm.l.c(dulicatercresponsemodle);
                if (this.f21240e.v1()) {
                    dulicatercresponsemodle2 = dulicateRcResponseModle.copy$default(dulicatercresponsemodle, (String) null, (Object) null, 0, (DuprcDto) null, (String) null, (String) null, (Object) null, (Object) null, 0, (String) null, 0, (String) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, hVar.a(), 536870911, (Object) null);
                } else {
                    dulicatercresponsemodle2 = dulicateRcResponseModle.copy$default(dulicatercresponsemodle, (String) null, (Object) null, 0, (DuprcDto) null, (String) null, (String) null, (Object) null, (Object) null, 0, (String) null, 0, (String) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, "", 536870911, (Object) null);
                }
                Intent intent = new Intent(this.f21240e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.DUPLICATE_RC_CODE);
                intent.putExtra(VContant.DUPLICATE_RC_CODE, dulicatercresponsemodle2);
                intent.putExtra(VContant.APP_NO, dulicatercresponsemodle.getAppl_no());
                intent.putExtra("state_code", this.f21240e.s1().getState_cd());
                intent.putExtra("rc_number", this.f21240e.r1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.DUPLICATE_RC_PURPOSE_CODE);
                intent.putExtra("off_code", this.f21240e.p1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21240e.v1());
                intent.putExtra("RC", this.f21240e.r1());
                intent.putExtra("RcDetails", this.f21240e.s1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21240e.m1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21240e.l1());
                this.f21240e.startActivity(intent);
                this.f21240e.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((dulicateRcResponseModle) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDuplicateRcActivity f21241e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDuplicateRcActivity vahanDuplicateRcActivity) {
            super(1);
            this.f21241e = vahanDuplicateRcActivity;
        }

        public final void b(String str) {
            this.f21241e.q1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21242a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21242a = lVar;
        }

        public final pl.c a() {
            return this.f21242a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21242a.invoke(obj);
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
    public static final void A1(VahanDuplicateRcActivity vahanDuplicateRcActivity, View view) {
        cm.l.f(vahanDuplicateRcActivity, "this$0");
        VUtility.Companion.v(vahanDuplicateRcActivity, vahanDuplicateRcActivity.o1().b("are_you_sure_you_want_to_leave", vahanDuplicateRcActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void B1(VahanDuplicateRcActivity vahanDuplicateRcActivity, View view) {
        cm.l.f(vahanDuplicateRcActivity, "this$0");
        vahanDuplicateRcActivity.C1();
    }

    private final void C1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(VahanDuplicateRcActivity vahanDuplicateRcActivity, View view) {
        cm.l.f(vahanDuplicateRcActivity, "this$0");
        Intent intent = new Intent(vahanDuplicateRcActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanDuplicateRcActivity.r1());
        intent.putExtra("RcDetails", vahanDuplicateRcActivity.s1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanDuplicateRcActivity.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanDuplicateRcActivity.m1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanDuplicateRcActivity.l1());
        vahanDuplicateRcActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void x1(VahanDuplicateRcActivity vahanDuplicateRcActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(vahanDuplicateRcActivity, "this$0");
        vahanDuplicateRcActivity.P.set(1, i10);
        vahanDuplicateRcActivity.P.set(2, i11);
        vahanDuplicateRcActivity.P.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanDuplicateRcActivity.P.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanDuplicateRcActivity.P.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanDuplicateRcActivity.P.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanDuplicateRcActivity.G1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanDuplicateRcActivity.n1().f28080c.setText(simpleDateFormat.format(vahanDuplicateRcActivity.P.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void y1(VahanDuplicateRcActivity vahanDuplicateRcActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(vahanDuplicateRcActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanDuplicateRcActivity, onDateSetListener, vahanDuplicateRcActivity.P.get(1), vahanDuplicateRcActivity.P.get(2), vahanDuplicateRcActivity.P.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void z1(VahanDuplicateRcActivity vahanDuplicateRcActivity, View view) {
        String b10;
        VahanDuplicateRcActivity vahanDuplicateRcActivity2 = vahanDuplicateRcActivity;
        cm.l.f(vahanDuplicateRcActivity2, "this$0");
        ld.c cVar = new ld.c(vahanDuplicateRcActivity2);
        try {
            String obj = vahanDuplicateRcActivity.n1().f28086i.getText().toString();
            String obj2 = vahanDuplicateRcActivity.n1().f28081d.getText().toString();
            String obj3 = vahanDuplicateRcActivity.n1().f28080c.getText().toString();
            String obj4 = vahanDuplicateRcActivity.n1().f28083f.getText().toString();
            Object selectedItem = vahanDuplicateRcActivity.n1().f28085h.getSelectedItem();
            cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.DRcModle.DReasonResponseItem");
            DReasonResponseItem dReasonResponseItem = (DReasonResponseItem) selectedItem;
            if (vahanDuplicateRcActivity.n1().f28085h.getSelectedItemPosition() == 0) {
                b10 = cVar.b("please_Select_the_reason", vahanDuplicateRcActivity2.getString(R.string.please_Select_the_reason));
            } else if (obj.length() < 3) {
                b10 = cVar.b("please_enter_the_remark", vahanDuplicateRcActivity2.getString(R.string.please_enter_the_remark));
            } else {
                if (obj2.length() < 3) {
                    if (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true)) {
                        b10 = cVar.b("please_enter_the_valid_fir_no", vahanDuplicateRcActivity2.getString(R.string.please_enter_the_valid_fir_no));
                    }
                }
                if (obj3.length() < 3 && (p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) || p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    b10 = cVar.b("please_enter_fir_date", vahanDuplicateRcActivity2.getString(R.string.please_enter_fir_date));
                } else if (obj4.length() >= 3 || (!p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "Lost", true) && !p.o(String.valueOf(dReasonResponseItem.getReason_desc()), "THEFT", true))) {
                    vahanDuplicateRcActivity.q1().show();
                    a.C0251a aVar = z9.a.f18947a;
                    String h10 = aVar.h(obj3);
                    String p12 = vahanDuplicateRcActivity.p1();
                    d.a aVar2 = v9.d.f17494a;
                    String m10 = aVar2.m();
                    int parseInt = Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String h11 = aVar.h(obj3);
                    String valueOf = String.valueOf(dReasonResponseItem.getReason_desc());
                    String r12 = vahanDuplicateRcActivity.r1();
                    String valueOf2 = String.valueOf(vahanDuplicateRcActivity.s1().getState_cd());
                    String rc_vh_class_cd = vahanDuplicateRcActivity.s1().getRc_vh_class_cd();
                    cm.l.c(rc_vh_class_cd);
                    String str = obj3;
                    DuprcDto duprcDto = new DuprcDto("", 0, h10, obj2, 0, " ", 0, " ", "", p12, m10, obj4, obj2, parseInt, h11, " ", 0, valueOf, r12, valueOf2, "", "", "", Integer.parseInt(rc_vh_class_cd));
                    String h12 = aVar.h(str);
                    String p13 = vahanDuplicateRcActivity.p1();
                    String m11 = aVar2.m();
                    int parseInt2 = Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE);
                    String valueOf3 = String.valueOf(dReasonResponseItem.getReason_desc());
                    String r13 = vahanDuplicateRcActivity.r1();
                    String valueOf4 = String.valueOf(vahanDuplicateRcActivity.s1().getState_cd());
                    String rc_vh_class_cd2 = vahanDuplicateRcActivity.s1().getRc_vh_class_cd();
                    cm.l.c(rc_vh_class_cd2);
                    duprcDtoRequestModle duprcdtorequestmodle = r5;
                    duprcDtoRequestModle duprcdtorequestmodle2 = new duprcDtoRequestModle("", 22, duprcDto, h12, obj2, 0, "", 1, "", "", p13, m11, obj4, "", parseInt2, "", "", 0, valueOf3, r13, valueOf4, "", "", "", Integer.parseInt(rc_vh_class_cd2));
                    vahanDuplicateRcActivity.u1().l1(vahanDuplicateRcActivity2, duprcdtorequestmodle);
                    return;
                } else {
                    b10 = cVar.b("please_enter_police_station", vahanDuplicateRcActivity2.getString(R.string.please_enter_police_station));
                }
            }
            Toast.makeText(vahanDuplicateRcActivity2, b10, 0).show();
        } catch (Exception unused) {
        }
    }

    public final void D1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void E1(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void F1(pd pdVar) {
        cm.l.f(pdVar, "<set-?>");
        this.G = pdVar;
    }

    public final void G1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void H1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void J1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void K1(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final void L1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void M1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void N1(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final String l1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String m1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final pd n1() {
        pd pdVar = this.G;
        if (pdVar != null) {
            return pdVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c o1() {
        ld.c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, o1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_duplicate_rc);
        pd c10 = pd.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) n1().b());
        v9.e.f17509a.B2(this, n1());
        M1(VahanProService.f21196b.b(this));
        H1(new ld.c(this));
        J1(new ProgressDialog(this));
        q1().setMessage("Please wait...");
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        N1((h) new u0((x0) this, (u0.b) new g(new wg.d(t1()))).a(h.class));
        I1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.R = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        E1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L1((NrvDetails) serializableExtra);
        if (this.R) {
            n1().f28084g.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.R;
        LinearLayout linearLayout = n1().f28084g.f27159b;
        cm.l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        H1(new ld.c(this));
        TextView textView = n1().f28096s;
        textView.setText(o1().b("vehicle_no", "Vehicle No.:") + ' ' + r1());
        n1().f28097t.setText(o1().b("view_vehicle_details", "View Vehicle Details"));
        n1().f28097t.setPaintFlags(n1().f28097t.getPaintFlags() | 8);
        n1().f28097t.setOnClickListener(new g1(this));
        try {
            q1().show();
            u1().I0(this, VContant.DUPLICATE_RC_PURPOSE_CODE);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        n1().f28080c.setOnClickListener(new i1(this, new h1(this)));
        u1().H().g(this, new f(new a(this)));
        u1().I().g(this, new f(new b(this)));
        n1().f28085h.setOnItemSelectedListener(new c(this));
        n1().f28079b.setOnClickListener(new j1(this));
        u1().J().g(this, new f(new d(this)));
        u1().K().g(this, new f(new e(this)));
        n1().f28088k.f28305f.setOnClickListener(new k1(this));
        n1().f28088k.f28306g.setOnClickListener(new l1(this));
    }

    public final String p1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String r1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails s1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService t1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final h u1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean v1() {
        return this.R;
    }
}
