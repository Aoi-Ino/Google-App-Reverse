package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DuplicateFitness.DuplicateFitnessService;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.CalValidity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.DetailModle.TmConfigurationTempPmt;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.PassangerResultActivity;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.ApiMessage;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.Data;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.SubmitForTempPermit;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.TempSubmitResponse;
import com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.TempDetailsModel;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ka.c;
import ni.fd;
import pl.x;
import yg.m0;
import yg.n0;
import yg.o0;
import yg.p0;
import yg.q0;
import yg.r0;
import yg.s0;
import yg.t0;

public final class TemporaryPermitActivity extends androidx.appcompat.app.d {
    public fd G;
    public bi.h H;
    public VahanProService I;
    public qe.b J;
    public DuplicateFitnessService K;
    public ProgressDialog L;
    public String M;
    public NrvDetails N;
    public String O;
    public String P;
    public String Q;
    private boolean R;
    private Calendar S = Calendar.getInstance();
    public String T;
    public ld.c U;
    private ArrayList V = new ArrayList();
    private ArrayList W = new ArrayList();
    private boolean X;
    private final d.c Y;

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21211e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21211e = temporaryPermitActivity;
        }

        public final void b(String str) {
            this.f21211e.v1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21212e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21212e = temporaryPermitActivity;
        }

        public final void b(TempSubmitResponse tempSubmitResponse) {
            this.f21212e.v1().dismiss();
            c.a aVar = ka.c.f13158a;
            Data data = tempSubmitResponse.getData();
            String str = null;
            if (aVar.m(data != null ? data.getApplNo() : null)) {
                TemporaryPermitActivity temporaryPermitActivity = this.f21212e;
                ApiMessage apiMessage = tempSubmitResponse.getApiMessage();
                if (apiMessage != null) {
                    str = apiMessage.getDeveloperMessage();
                }
                temporaryPermitActivity.V1(temporaryPermitActivity, str);
                return;
            }
            try {
                i7.d dVar = new i7.d();
                Intent intent = new Intent(this.f21212e, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.TEMPERMIT_CODE);
                intent.putExtra(VContant.TEMPERMIT_CODE, (Data) dVar.j(dVar.t(tempSubmitResponse.getData()).toString(), Data.class));
                Data data2 = tempSubmitResponse.getData();
                if (data2 != null) {
                    str = data2.getApplNo();
                }
                intent.putExtra(VContant.APP_NO, str);
                intent.putExtra("state_code", this.f21212e.x1().getState_cd());
                intent.putExtra("rc_number", this.f21212e.w1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.TempPermit_PURPOSE_CODE);
                intent.putExtra("off_code", this.f21212e.u1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21212e.A1());
                intent.putExtra("RC", this.f21212e.w1());
                intent.putExtra("RcDetails", this.f21212e.x1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21212e.o1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21212e.n1());
                this.f21212e.startActivity(intent);
                this.f21212e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TempSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21213e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21213e = temporaryPermitActivity;
        }

        public final void b(String str) {
            this.f21213e.v1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21214e = temporaryPermitActivity;
        }

        public final void b(String str) {
            this.f21214e.v1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class e implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21215e;

        e(TemporaryPermitActivity temporaryPermitActivity) {
            this.f21215e = temporaryPermitActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            re.a aVar;
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (this.f21215e.p1().f26380r.getSelectedItemPosition() != 0) {
                if (p.o(this.f21215e.p1().f26380r.getSelectedItem().toString(), "Days", true)) {
                    ArrayList C = VContant.Companion.C();
                    C.add(0, "Select Days");
                    Context applicationContext = this.f21215e.getApplicationContext();
                    cm.l.e(applicationContext, "getApplicationContext(...)");
                    aVar = new re.a(applicationContext, C);
                } else if (p.o(this.f21215e.p1().f26380r.getSelectedItem().toString(), "Weeks", true)) {
                    ArrayList E = VContant.Companion.E();
                    E.add(0, "Select Weeks");
                    Context applicationContext2 = this.f21215e.getApplicationContext();
                    cm.l.e(applicationContext2, "getApplicationContext(...)");
                    aVar = new re.a(applicationContext2, E);
                } else if (p.o(this.f21215e.p1().f26380r.getSelectedItem().toString(), "Months", true)) {
                    ArrayList D = VContant.Companion.D();
                    D.add(0, "Select Months");
                    Context applicationContext3 = this.f21215e.getApplicationContext();
                    cm.l.e(applicationContext3, "getApplicationContext(...)");
                    aVar = new re.a(applicationContext3, D);
                } else {
                    return;
                }
                this.f21215e.p1().f26379q.setAdapter(aVar);
                this.f21215e.p1().f26367e.setText("");
                this.f21215e.p1().O.setText("");
                this.f21215e.p1().f26374l.setVisibility(8);
                this.f21215e.p1().O.setVisibility(8);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21216e;

        f(TemporaryPermitActivity temporaryPermitActivity) {
            this.f21216e = temporaryPermitActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            this.f21216e.p1().f26367e.setText("");
            this.f21216e.p1().O.setText("");
            this.f21216e.p1().f26374l.setVisibility(8);
            this.f21216e.p1().O.setVisibility(8);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21217e;

        g(TemporaryPermitActivity temporaryPermitActivity) {
            this.f21217e = temporaryPermitActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            View childAt = adapterView != null ? adapterView.getChildAt(0) : null;
            cm.l.d(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(-16777216);
            if (this.f21217e.p1().f26375m.getSelectedItemPosition() != 0) {
                this.f21217e.v1().show();
                qe.b q12 = this.f21217e.q1();
                TemporaryPermitActivity temporaryPermitActivity = this.f21217e;
                q12.h(temporaryPermitActivity, temporaryPermitActivity.p1().f26375m.getSelectedItem().toString(), String.valueOf(this.f21217e.x1().getState_cd()));
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21218e = temporaryPermitActivity;
        }

        public final void b(TempDetailsModel tempDetailsModel) {
            re.b bVar;
            Spinner spinner;
            TmConfigurationTempPmt tmConfigurationTempPmt;
            try {
                this.f21218e.v1().dismiss();
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.ApiMessage apiMessage = tempDetailsModel.getApiMessage();
                if (apiMessage != null && apiMessage.getStatusCode() == 200) {
                    TextView textView = this.f21218e.p1().f26378p;
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data = tempDetailsModel.getData();
                    String str = null;
                    textView.setText(data != null ? data.getAllotmentOffice() : null);
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data2 = tempDetailsModel.getData();
                    ArrayList<String> periodMode = data2 != null ? data2.getPeriodMode() : null;
                    if (periodMode != null) {
                        periodMode.add(0, "Select Period Mode");
                    }
                    this.f21218e.p1().f26380r.setAdapter(new re.b(this.f21218e, periodMode));
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data3 = tempDetailsModel.getData();
                    ArrayList<String> natureOfGoods = data3 != null ? data3.getNatureOfGoods() : null;
                    if (natureOfGoods != null) {
                        natureOfGoods.add(0, "Select Nature of Goods");
                    }
                    this.f21218e.p1().f26375m.setAdapter(new re.b(this.f21218e, natureOfGoods));
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data4 = tempDetailsModel.getData();
                    if ((data4 != null ? data4.getGoodsType() : null) == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(0, "Select Goods");
                        bVar = new re.b(this.f21218e, arrayList);
                        spinner = this.f21218e.p1().f26364b;
                    } else {
                        com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data5 = tempDetailsModel.getData();
                        Object goodsType = data5 != null ? data5.getGoodsType() : null;
                        cm.l.d(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                        ArrayList arrayList2 = (ArrayList) goodsType;
                        arrayList2.add(0, "Select Goods");
                        bVar = new re.b(this.f21218e, arrayList2);
                        spinner = this.f21218e.p1().f26364b;
                    }
                    spinner.setAdapter(bVar);
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data6 = tempDetailsModel.getData();
                    ArrayList<String> purposeOfJourny = data6 != null ? data6.getPurposeOfJourny() : null;
                    if (purposeOfJourny != null) {
                        purposeOfJourny.add(0, "Select Journey");
                    }
                    this.f21218e.p1().f26373k.setAdapter(new re.b(this.f21218e, purposeOfJourny));
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data7 = tempDetailsModel.getData();
                    ArrayList<String> vmServiceType = data7 != null ? data7.getVmServiceType() : null;
                    if (vmServiceType != null) {
                        vmServiceType.add(0, "Select Service Type");
                    }
                    this.f21218e.p1().B.setAdapter(new re.b(this.f21218e, vmServiceType));
                    com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Data data8 = tempDetailsModel.getData();
                    if (!(data8 == null || (tmConfigurationTempPmt = data8.getTmConfigurationTempPmt()) == null)) {
                        str = tmConfigurationTempPmt.getPassengerListTemp();
                    }
                    if (p.o(str, "true", true)) {
                        this.f21218e.Q1(true);
                        this.f21218e.p1().f26365c.setVisibility(0);
                        return;
                    }
                    this.f21218e.Q1(false);
                    this.f21218e.p1().f26365c.setVisibility(8);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TempDetailsModel) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21219e = temporaryPermitActivity;
        }

        public final void b(String str) {
            this.f21219e.v1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21220e = temporaryPermitActivity;
        }

        public final void b(CalValidity calValidity) {
            this.f21220e.v1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                this.f21220e.p1().f26374l.setVisibility(0);
                this.f21220e.p1().O.setVisibility(0);
                this.f21220e.p1().O.setText(VContant.Companion.o(calValidity.getData().getValidUpto()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CalValidity) obj);
            return x.f30437a;
        }
    }

    static final class k extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TemporaryPermitActivity f21221e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(TemporaryPermitActivity temporaryPermitActivity) {
            super(1);
            this.f21221e = temporaryPermitActivity;
        }

        public final void b(CalValidity calValidity) {
            this.f21221e.v1().dismiss();
            if (calValidity.getApiMessage().getStatusCode() == 200) {
                com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.CalculateValidity.Data data = calValidity.getData();
                Object goodsType = data != null ? data.getGoodsType() : null;
                cm.l.d(goodsType, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                ArrayList arrayList = (ArrayList) goodsType;
                arrayList.add(0, "Select Goods");
                this.f21221e.p1().f26364b.setAdapter(new re.b(this.f21221e, arrayList));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CalValidity) obj);
            return x.f30437a;
        }
    }

    static final class l implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21222a;

        l(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21222a = lVar;
        }

        public final pl.c a() {
            return this.f21222a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21222a.invoke(obj);
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

    public TemporaryPermitActivity() {
        d.c y02 = y0(new e.d(), new m0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.Y = y02;
    }

    /* access modifiers changed from: private */
    public static final void B1(TemporaryPermitActivity temporaryPermitActivity, View view) {
        cm.l.f(temporaryPermitActivity, "this$0");
        Intent intent = new Intent(temporaryPermitActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", temporaryPermitActivity.w1());
        intent.putExtra("RcDetails", temporaryPermitActivity.x1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, temporaryPermitActivity.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, temporaryPermitActivity.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, temporaryPermitActivity.n1());
        temporaryPermitActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C1(TemporaryPermitActivity temporaryPermitActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(temporaryPermitActivity, "this$0");
        temporaryPermitActivity.S.set(1, i10);
        temporaryPermitActivity.S.set(2, i11);
        temporaryPermitActivity.S.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", temporaryPermitActivity.S.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", temporaryPermitActivity.S.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", temporaryPermitActivity.S.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        temporaryPermitActivity.M1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        temporaryPermitActivity.p1().f26367e.setText(simpleDateFormat.format(temporaryPermitActivity.S.getTime()));
        temporaryPermitActivity.v1().show();
        temporaryPermitActivity.q1().g(temporaryPermitActivity, String.valueOf(temporaryPermitActivity.x1().getState_cd()), temporaryPermitActivity.s1(), temporaryPermitActivity.p1().f26380r.getSelectedItem().toString(), temporaryPermitActivity.p1().f26379q.getSelectedItem().toString());
    }

    /* access modifiers changed from: private */
    public static final void D1(TemporaryPermitActivity temporaryPermitActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        String b10;
        cm.l.f(temporaryPermitActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        try {
            if (temporaryPermitActivity.p1().f26380r.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempPeriodMode", temporaryPermitActivity.getString(R.string.pls_select_temp_period_mode));
            } else if (temporaryPermitActivity.p1().f26379q.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("please_select_the_period", temporaryPermitActivity.getString(R.string.please_select_the_period));
            } else {
                DatePickerDialog datePickerDialog = new DatePickerDialog(temporaryPermitActivity, onDateSetListener, temporaryPermitActivity.S.get(1), temporaryPermitActivity.S.get(2), temporaryPermitActivity.S.get(5));
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis());
                datePickerDialog.show();
                datePickerDialog.getButton(-2).setTextColor(-16777216);
                datePickerDialog.getButton(-1).setTextColor(-65536);
                return;
            }
            Toast.makeText(temporaryPermitActivity, b10, 1).show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(TemporaryPermitActivity temporaryPermitActivity, View view) {
        String b10;
        TemporaryPermitActivity temporaryPermitActivity2 = temporaryPermitActivity;
        cm.l.f(temporaryPermitActivity2, "this$0");
        new ld.c(temporaryPermitActivity2);
        try {
            if (temporaryPermitActivity.p1().f26380r.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempPeriodMode", temporaryPermitActivity2.getString(R.string.pls_select_temp_period_mode));
            } else if (temporaryPermitActivity.p1().f26379q.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("please_select_the_period", temporaryPermitActivity2.getString(R.string.please_select_the_period));
            } else if (temporaryPermitActivity.p1().f26367e.getText().length() <= 0) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempValidFromDate", temporaryPermitActivity2.getString(R.string.please_select_form_date));
            } else if (temporaryPermitActivity.p1().E.getText().length() <= 3) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempTravelFrom", temporaryPermitActivity2.getString(R.string.please_enter_travel_from));
            } else if (temporaryPermitActivity.p1().G.getText().length() <= 3) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempTravelUpto", temporaryPermitActivity2.getString(R.string.please_enter_travel_upto));
            } else if (temporaryPermitActivity.p1().f26375m.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempNatureOfGoods", temporaryPermitActivity2.getString(R.string.please_select_nature_good));
            } else if (temporaryPermitActivity.p1().f26364b.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempGoods", temporaryPermitActivity2.getString(R.string.please_select_goods));
            } else if (p.o(temporaryPermitActivity.p1().f26364b.getSelectedItem().toString(), "other", true) && temporaryPermitActivity.p1().f26371i.getText().toString().length() < 3) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempGoodsDetails", temporaryPermitActivity2.getString(R.string.please_enter_goods_details));
            } else if (temporaryPermitActivity.p1().f26388z.length() < 4) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempRouteDesc", temporaryPermitActivity2.getString(R.string.please_enter_valid_route_desc));
            } else if (temporaryPermitActivity.p1().f26373k.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempPurposeJouener", temporaryPermitActivity2.getString(R.string.please_select_purpose_of_journey));
            } else if (temporaryPermitActivity.p1().f26386x.getText().length() < 1) {
                b10 = temporaryPermitActivity.t1().b("pls_enterTempRouteLength", temporaryPermitActivity2.getString(R.string.please_enter_route_length));
            } else if (temporaryPermitActivity.p1().B.getSelectedItemPosition() == 0) {
                b10 = temporaryPermitActivity.t1().b("pls_SelectTempServiceType", temporaryPermitActivity2.getString(R.string.please_select_service_type));
            } else if (!temporaryPermitActivity2.X || temporaryPermitActivity2.W.size() >= 1) {
                temporaryPermitActivity.v1().show();
                String obj = temporaryPermitActivity.p1().f26378p.getText().toString();
                String obj2 = temporaryPermitActivity.p1().f26371i.getText().toString();
                String obj3 = temporaryPermitActivity.p1().f26375m.getSelectedItem().toString();
                String obj4 = temporaryPermitActivity.p1().f26364b.getSelectedItem().toString();
                String m10 = v9.d.f17494a.m();
                String rc_off_cd = temporaryPermitActivity.x1().getRc_off_cd();
                Integer valueOf = rc_off_cd != null ? Integer.valueOf(Integer.parseInt(rc_off_cd)) : null;
                String obj5 = temporaryPermitActivity.p1().f26371i.getText().toString();
                int parseInt = Integer.parseInt(temporaryPermitActivity.p1().f26379q.getSelectedItem().toString());
                VContant.Companion companion = VContant.Companion;
                SubmitForTempPermit submitForTempPermit = new SubmitForTempPermit(obj, "", obj2, obj3, obj4, "", m10, valueOf, obj5, parseInt, companion.v(temporaryPermitActivity.p1().f26380r.getSelectedItem().toString()), Integer.parseInt(VContant.TempPermit_PURPOSE_CODE), temporaryPermitActivity.p1().f26373k.getSelectedItem().toString(), String.valueOf(temporaryPermitActivity.x1().getRc_regn_no()), temporaryPermitActivity.p1().f26388z.getText().toString(), String.valueOf(temporaryPermitActivity.x1().getState_cd()), temporaryPermitActivity.p1().E.getText().toString(), temporaryPermitActivity.p1().G.getText().toString(), temporaryPermitActivity2.W, String.valueOf(companion.n(temporaryPermitActivity.p1().f26367e.getText().toString())), temporaryPermitActivity.p1().O.getText().toString());
                i7.d dVar = new i7.d();
                qe.b q12 = temporaryPermitActivity.q1();
                String t10 = dVar.t(submitForTempPermit);
                cm.l.e(t10, "toJson(...)");
                q12.i(temporaryPermitActivity2, t10);
                return;
            } else {
                b10 = temporaryPermitActivity.t1().b("pls_AddTempPassenger", temporaryPermitActivity2.getString(R.string.please_add_passanger));
            }
            Toast.makeText(temporaryPermitActivity2, b10, 1).show();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(TemporaryPermitActivity temporaryPermitActivity, View view) {
        cm.l.f(temporaryPermitActivity, "this$0");
        Intent intent = new Intent(temporaryPermitActivity, PassangerResultActivity.class);
        intent.putExtra("PassagerList", temporaryPermitActivity.W);
        intent.putExtra("SeatingCap", String.valueOf(temporaryPermitActivity.x1().getSeat_cap()));
        temporaryPermitActivity.Y.a(intent);
    }

    /* access modifiers changed from: private */
    public static final void G1(TemporaryPermitActivity temporaryPermitActivity, View view) {
        cm.l.f(temporaryPermitActivity, "this$0");
        VUtility.Companion.v(temporaryPermitActivity, temporaryPermitActivity.t1().b("are_you_sure_you_want_to_leave", temporaryPermitActivity.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(TemporaryPermitActivity temporaryPermitActivity, d.a aVar) {
        cm.l.f(temporaryPermitActivity, "this$0");
        Log.e("Calling result...", "Running..");
        if (aVar.d() == 78) {
            Intent c10 = aVar.c();
            Serializable serializableExtra = c10 != null ? c10.getSerializableExtra("input") : null;
            cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DuplicateFitness.TempPermitModel.Submit.VaSplPassengerdto> }");
            ArrayList arrayList = (ArrayList) serializableExtra;
            temporaryPermitActivity.W = arrayList;
            if (arrayList.size() > 0) {
                temporaryPermitActivity.p1().f26365c.setText("View & Edit Passanger List");
            }
        }
    }

    public final boolean A1() {
        return this.R;
    }

    public final void H1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void I1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void J1(fd fdVar) {
        cm.l.f(fdVar, "<set-?>");
        this.G = fdVar;
    }

    public final void K1(qe.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.J = bVar;
    }

    public final void L1(DuplicateFitnessService duplicateFitnessService) {
        cm.l.f(duplicateFitnessService, "<set-?>");
        this.K = duplicateFitnessService;
    }

    public final void M1(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void N1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void O1(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void P1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void Q1(boolean z10) {
        this.X = z10;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void S1(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.N = nrvDetails;
    }

    public final void T1(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void U1(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final void V1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new t0(dialog));
        dialog.show();
    }

    public final String n1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, t1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.temporary_permit_activity);
        fd c10 = fd.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        J1(c10);
        setContentView((View) p1().b());
        T1(VahanProService.f21196b.b(this));
        L1(DuplicateFitnessService.f20591a.b(this));
        N1(new ld.c(this));
        v9.e.f17509a.Q2(this, p1());
        P1(new ProgressDialog(this));
        v1().setMessage(t1().b("label_challan_please_wait", getString(R.string.loading_msg)));
        v1().setCancelable(false);
        v1().setCanceledOnTouchOutside(false);
        U1((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(z1()))).a(bi.h.class));
        K1((qe.b) new u0((x0) this, (u0.b) new qe.a(new pe.a(r1()))).a(qe.b.class));
        O1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.R = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        I1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        R1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        S1((NrvDetails) serializableExtra);
        N1(new ld.c(this));
        p1().D.f28308i.setText(VContant.Companion.I(this, VContant.TempPermit_PURPOSE_CODE));
        TextView textView = p1().P;
        textView.setText(t1().b("vehicle_no", "Vehicle No.:") + ' ' + w1());
        p1().Q.setText(t1().b("view_vehicle_details", "View Vehicle Details"));
        p1().Q.setPaintFlags(p1().Q.getPaintFlags() | 8);
        p1().Q.setOnClickListener(new n0(this));
        try {
            v1().show();
            q1().H(this, w1(), x1().getState_cd(), x1().getRc_off_cd());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        o0 o0Var = new o0(this);
        p1().f26380r.setOnItemSelectedListener(new e(this));
        p1().f26379q.setOnItemSelectedListener(new f(this));
        p1().f26375m.setOnItemSelectedListener(new g(this));
        p1().f26367e.setOnClickListener(new p0(this, o0Var));
        q1().D().g(this, new l(new h(this)));
        q1().E().g(this, new l(new i(this)));
        q1().j().g(this, new l(new j(this)));
        q1().r().g(this, new l(new k(this)));
        q1().s().g(this, new l(new a(this)));
        p1().f26366d.setOnClickListener(new q0(this));
        p1().f26365c.setOnClickListener(new r0(this));
        q1().F().g(this, new l(new b(this)));
        q1().G().g(this, new l(new c(this)));
        q1().o().g(this, new l(new d(this)));
        p1().D.f28305f.setOnClickListener(new s0(this));
    }

    public final fd p1() {
        fd fdVar = this.G;
        if (fdVar != null) {
            return fdVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final qe.b q1() {
        qe.b bVar = this.J;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("fitnessDraftViewModle");
        return null;
    }

    public final DuplicateFitnessService r1() {
        DuplicateFitnessService duplicateFitnessService = this.K;
        if (duplicateFitnessService != null) {
            return duplicateFitnessService;
        }
        cm.l.v("fitnessService");
        return null;
    }

    public final String s1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final String u1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final ProgressDialog v1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String w1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails x1() {
        NrvDetails nrvDetails = this.N;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService z1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }
}
