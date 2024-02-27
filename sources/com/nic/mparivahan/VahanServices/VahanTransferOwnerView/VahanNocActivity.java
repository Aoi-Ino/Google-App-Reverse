package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.h;
import cm.l;
import cm.u;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HPTRequestParamModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptDetailsModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HptTerResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftRequestParam;
import com.nic.mparivahan.VahanServices.VahanModel.NocDraftResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModle;
import com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModle;
import com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanCommonConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.function.Predicate;
import ld.c;
import ni.vd;
import og.b0;
import og.y;
import og.z;
import v9.e;
import yg.a2;
import yg.b2;
import yg.c2;
import yg.d2;
import yg.e2;
import yg.f2;
import yg.m1;
import yg.n1;
import yg.o1;
import yg.p1;
import yg.q1;
import yg.r1;
import yg.s1;
import yg.t1;
import yg.u1;
import yg.v1;
import yg.w1;
import yg.x1;
import yg.y1;
import yg.z1;
import z9.a;

public final class VahanNocActivity extends d {
    public vd G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    public String K;
    public NrvDetails L;
    public ImageView M;
    private Calendar N = Calendar.getInstance();
    public String O;
    public HptDetailsModle P;
    private String Q = "0";
    private boolean R;
    private boolean S;
    public String T;
    public String U;
    private String V = " ";
    public c W;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanNocActivity f21243e;

        a(VahanNocActivity vahanNocActivity) {
            this.f21243e = vahanNocActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21243e.E1().A.getSelectedItemPosition() != 0) {
                this.f21243e.I1().show();
                Object selectedItem = this.f21243e.E1().A.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21243e.M1().J0(((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanNocActivity f21244e;

        b(VahanNocActivity vahanNocActivity) {
            this.f21244e = vahanNocActivity;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            MyTextView myTextView;
            int i11;
            l.f(view, "view");
            Object selectedItem = this.f21244e.E1().f29113y.getSelectedItem();
            l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
            if (((NocReasonModleItem) selectedItem).getCode() == 4) {
                myTextView = this.f21244e.E1().H;
                i11 = 8;
            } else {
                myTextView = this.f21244e.E1().H;
                i11 = 0;
            }
            myTextView.setVisibility(i11);
            this.f21244e.E1().G.setVisibility(i11);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final boolean A1(u uVar, String str, String str2) {
        l.f(uVar, "$subList");
        l.f(str, "$statecode");
        l.f(str2, "a");
        return ((String) ((VahanStateModleSubList) uVar.f20234e).get(0)).toString().equals(str);
    }

    private final int H1(List list, Predicate predicate) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            if (predicate.test(listIterator.next())) {
                return nextIndex;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanNocActivity vahanNocActivity, View view) {
        l.f(vahanNocActivity, "this$0");
        Intent intent = new Intent(vahanNocActivity, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanNocActivity.J1());
        intent.putExtra("RcDetails", vahanNocActivity.K1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanNocActivity.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanNocActivity.C1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanNocActivity.B1());
        vahanNocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanNocActivity vahanNocActivity, View view) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void P1(VahanNocActivity vahanNocActivity, RtoNameModle rtoNameModle) {
        VahanNocActivity vahanNocActivity2 = vahanNocActivity;
        RtoNameModle rtoNameModle2 = rtoNameModle;
        l.f(vahanNocActivity2, "this$0");
        vahanNocActivity.I1().dismiss();
        try {
            u uVar = new u();
            uVar.f20234e = String.valueOf(vahanNocActivity.K1().getRc_off_cd());
            RtoNameModleItem rtoNameModleItem = new RtoNameModleItem("0", "0", "0", "0", "0", "0", "Select Authority", "0", "0", "0", "0", "0", "0");
            l.c(rtoNameModle);
            rtoNameModle2.add(0, rtoNameModleItem);
            try {
                if (vahanNocActivity2.H1(rtoNameModle2, new u1(vahanNocActivity2)) > -1) {
                    rtoNameModle2.remove(vahanNocActivity2.H1(rtoNameModle2, new v1(uVar)));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            vahanNocActivity.E1().f29090b.setAdapter(new z(vahanNocActivity2, rtoNameModle2));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final boolean Q1(u uVar, RtoNameModleItem rtoNameModleItem) {
        l.f(uVar, "$String");
        l.f(rtoNameModleItem, "a");
        return rtoNameModleItem.getOff_cd().equals(uVar.f20234e);
    }

    /* access modifiers changed from: private */
    public static final boolean R1(VahanNocActivity vahanNocActivity, RtoNameModleItem rtoNameModleItem) {
        l.f(vahanNocActivity, "this$0");
        l.f(rtoNameModleItem, "a");
        String state_cd = rtoNameModleItem.getState_cd();
        String state_cd2 = vahanNocActivity.K1().getState_cd();
        return state_cd.equals(state_cd2 != null ? q.B0(state_cd2).toString() : null);
    }

    /* access modifiers changed from: private */
    public static final void S1(VahanNocActivity vahanNocActivity, CompoundButton compoundButton, boolean z10) {
        l.f(vahanNocActivity, "this$0");
        if (z10) {
            vahanNocActivity.E1().B.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanNocActivity vahanNocActivity, CompoundButton compoundButton, boolean z10) {
        l.f(vahanNocActivity, "this$0");
        if (z10) {
            vahanNocActivity.E1().B.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(VahanNocActivity vahanNocActivity, View view) {
        c G1;
        String string;
        String str;
        VahanNocActivity vahanNocActivity2 = vahanNocActivity;
        l.f(vahanNocActivity2, "this$0");
        Object selectedItem = vahanNocActivity.E1().f29113y.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
        NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) selectedItem;
        if (vahanNocActivity2.R && !vahanNocActivity.E1().f29094f.isChecked() && !vahanNocActivity.E1().E.isChecked()) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_Select_hypothentication_option);
            str = "please_Select_hypothentication_option";
        } else if (vahanNocActivity.E1().f29113y.getSelectedItemPosition() == 0) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_select_noc_reason);
            str = "please_select_noc_reason";
        } else if (vahanNocActivity.E1().A.getSelectedItemPosition() == 0) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_select_the_state);
            str = "please_select_the_state";
        } else if (vahanNocActivity.E1().f29090b.getSelectedItemPosition() == 0) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_select_authority);
            str = "please_select_authority";
        } else if (vahanNocActivity.E1().f29112x.getText().length() < 3) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_select_ncrb_no);
            str = "please_select_ncrb_no";
        } else if (vahanNocActivity.E1().G.getText().length() == 0 && nocReasonModleItem.getCode() != 4) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_enter_name);
            str = "please_enter_name";
        } else if (vahanNocActivity.E1().G.getText().length() < 3 && nocReasonModleItem.getCode() != 4) {
            G1 = vahanNocActivity.G1();
            string = vahanNocActivity2.getString(R.string.please_enter_valid_name);
            str = "please_enter_valid_name";
        } else if (!vahanNocActivity2.R || !vahanNocActivity.E1().E.isChecked()) {
            VahanNocActivity vahanNocActivity3 = vahanNocActivity2;
            Object selectedItem2 = vahanNocActivity.E1().f29113y.getSelectedItem();
            l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
            NocReasonModleItem nocReasonModleItem2 = (NocReasonModleItem) selectedItem2;
            String obj = vahanNocActivity.E1().f29112x.getText().toString();
            Object selectedItem3 = vahanNocActivity.E1().A.getSelectedItem();
            l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem3;
            Object selectedItem4 = vahanNocActivity.E1().f29090b.getSelectedItem();
            l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
            RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) selectedItem4;
            String obj2 = nocReasonModleItem2.getCode() == 4 ? " " : vahanNocActivity.E1().G.getText().toString();
            vahanNocActivity.I1().show();
            vahanNocActivity.M1().m1(new NocDraftRequestParam(" ", " ", v9.d.f17494a.m(), obj, obj2, true, " ", String.valueOf(vahanNocActivity3.Q), Integer.parseInt(rtoNameModleItem.getOff_cd()), nocReasonModleItem2.getCode(), vahanNocActivity.J1(), rtoNameModleItem.getOff_name(), String.valueOf(vahanNocActivity.K1().getState_cd()), rtoNameModleItem.getState_cd()));
            return;
        } else {
            try {
                if (vahanNocActivity.E1().f29098j.getText().length() < 2) {
                    Toast.makeText(vahanNocActivity2, vahanNocActivity.G1().b("please_select_date", vahanNocActivity2.getString(R.string.please_select_date)), 0).show();
                    return;
                }
                vahanNocActivity.I1().show();
                String fncr_add1 = vahanNocActivity.F1().getFncr_add1();
                String fncr_add2 = vahanNocActivity.F1().getFncr_add2();
                String fncr_add3 = vahanNocActivity.F1().getFncr_add3();
                String fncr_district = vahanNocActivity.F1().getFncr_district();
                String fncr_district2 = vahanNocActivity.F1().getFncr_district();
                String fncr_name = vahanNocActivity.F1().getFncr_name();
                String fncr_pincode = vahanNocActivity.F1().getFncr_pincode();
                String fncr_state = vahanNocActivity.F1().getFncr_state();
                String rc_c_state = vahanNocActivity.K1().getRc_c_state();
                String from_dt = vahanNocActivity.F1().getFrom_dt();
                String hp_type = vahanNocActivity.F1().getHp_type();
                String str2 = vahanNocActivity2.Q;
                String m10 = v9.d.f17494a.m();
                String J1 = vahanNocActivity.J1();
                String state_cd = vahanNocActivity.K1().getState_cd();
                String str3 = str2;
                a.C0251a aVar = z9.a.f18947a;
                vahanNocActivity.M1().n1(vahanNocActivity, new HPTRequestParamModle(" ", fncr_add1, fncr_add2, fncr_add3, fncr_district, fncr_district2, fncr_name, fncr_pincode, fncr_state, rc_c_state, "0", "0", "0", "0", from_dt, " ", hp_type, " ", str3, m10, VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE, J1, "1", state_cd, aVar.h(vahanNocActivity.E1().f29098j.getText().toString()), "NA", aVar.h(vahanNocActivity.E1().f29098j.getText().toString()), "NA"));
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Toast.makeText(vahanNocActivity2, G1.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanNocActivity vahanNocActivity, HptTerResponse hptTerResponse) {
        VahanNocActivity vahanNocActivity2 = vahanNocActivity;
        l.f(vahanNocActivity2, "this$0");
        try {
            String appl_no = hptTerResponse.getAppl_no();
            if (appl_no == null || appl_no.length() == 0) {
                vahanNocActivity.I1().dismiss();
                return;
            }
            try {
                Object selectedItem = vahanNocActivity.E1().f29113y.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NocReasonModleItem");
                NocReasonModleItem nocReasonModleItem = (NocReasonModleItem) selectedItem;
                String obj = vahanNocActivity.E1().f29112x.getText().toString();
                Object selectedItem2 = vahanNocActivity.E1().A.getSelectedItem();
                l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem2;
                Object selectedItem3 = vahanNocActivity.E1().f29090b.getSelectedItem();
                l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.RtoNameModleItem");
                RtoNameModleItem rtoNameModleItem = (RtoNameModleItem) selectedItem3;
                String obj2 = nocReasonModleItem.getCode() == 4 ? " " : vahanNocActivity.E1().G.getText().toString();
                String valueOf = String.valueOf(vahanNocActivity2.Q);
                int parseInt = Integer.parseInt(rtoNameModleItem.getOff_cd());
                int code = nocReasonModleItem.getCode();
                String J1 = vahanNocActivity.J1();
                String off_name = rtoNameModleItem.getOff_name();
                String valueOf2 = String.valueOf(vahanNocActivity.K1().getState_cd());
                String state_cd = rtoNameModleItem.getState_cd();
                NocDraftRequestParam nocDraftRequestParam = r3;
                NocDraftRequestParam nocDraftRequestParam2 = new NocDraftRequestParam(" ", " ", "", obj, obj2, true, "", valueOf, parseInt, code, J1, off_name, valueOf2, state_cd);
                vahanNocActivity.M1().m1(nocDraftRequestParam);
            } catch (Exception e10) {
                vahanNocActivity.I1().dismiss();
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            vahanNocActivity.I1().dismiss();
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanNocActivity vahanNocActivity, String str) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void X1(VahanNocActivity vahanNocActivity, NocDraftResponse nocDraftResponse) {
        NocDraftResponse nocDraftResponse2;
        VahanNocActivity vahanNocActivity2 = vahanNocActivity;
        l.f(vahanNocActivity2, "this$0");
        vahanNocActivity.I1().dismiss();
        try {
            String appl_no = nocDraftResponse.getAppl_no();
            if (appl_no == null) {
                return;
            }
            if (appl_no.length() != 0) {
                ld.h hVar = new ld.h(vahanNocActivity2);
                l.c(nocDraftResponse);
                if (vahanNocActivity2.S) {
                    nocDraftResponse2 = NocDraftResponse.copy$default(nocDraftResponse, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, hVar.a(), 16383, (Object) null);
                } else {
                    nocDraftResponse2 = NocDraftResponse.copy$default(nocDraftResponse, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, " ", 16383, (Object) null);
                }
                Intent intent = new Intent(vahanNocActivity2, VahanCommonConfirmationScreen.class);
                intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.NOC_CODE);
                intent.putExtra(VContant.NOC_CODE, nocDraftResponse2);
                intent.putExtra(VContant.APP_NO, nocDraftResponse.getAppl_no());
                intent.putExtra("state_code", vahanNocActivity.K1().getState_cd());
                intent.putExtra("rc_number", vahanNocActivity.J1());
                intent.putExtra(VContant.PURPOSE_CODE, VContant.NOC_PURPOSE_CODE);
                intent.putExtra("off_code", vahanNocActivity2.Q);
                intent.putExtra(VContant.NEXGEN_isFACELESS, vahanNocActivity2.S);
                intent.putExtra("RC", vahanNocActivity.J1());
                intent.putExtra("RcDetails", vahanNocActivity.K1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, vahanNocActivity2.S);
                intent.putExtra(VContant.NEXGEN_addahar_name, vahanNocActivity.C1());
                intent.putExtra(VContant.NEXGEN_addahar_address, vahanNocActivity.B1());
                vahanNocActivity2.startActivity(intent);
                vahanNocActivity.finish();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void Y1(VahanNocActivity vahanNocActivity, String str) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanNocActivity vahanNocActivity, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.N.set(1, i10);
        vahanNocActivity.N.set(2, i11);
        vahanNocActivity.N.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", vahanNocActivity.N.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", vahanNocActivity.N.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", vahanNocActivity.N.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        vahanNocActivity.k2(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        vahanNocActivity.E1().f29098j.setText(simpleDateFormat.format(vahanNocActivity.N.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanNocActivity vahanNocActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(vahanNocActivity, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(vahanNocActivity, onDateSetListener, vahanNocActivity.N.get(1), vahanNocActivity.N.get(2), vahanNocActivity.N.get(5));
        datePickerDialog.getDatePicker().setMinDate(VContant.Companion.m(vahanNocActivity.V));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanNocActivity vahanNocActivity, NocReasonModle nocReasonModle) {
        l.f(vahanNocActivity, "this$0");
        try {
            if (nocReasonModle.size() > 0) {
                NocReasonModleItem nocReasonModleItem = new NocReasonModleItem(0, "Select Reason");
                l.c(nocReasonModle);
                nocReasonModle.add(0, nocReasonModleItem);
                vahanNocActivity.E1().f29113y.setAdapter(new y(vahanNocActivity, nocReasonModle));
                vahanNocActivity.M1().V0(vahanNocActivity);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            vahanNocActivity.I1().dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanNocActivity vahanNocActivity, String str) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanNocActivity vahanNocActivity, VahanStateModle vahanStateModle) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            int z12 = vahanNocActivity.z1(vahanStateModle, String.valueOf(vahanNocActivity.K1().getState_cd()));
            if (z12 > -1) {
                vahanStateModle.remove(z12);
            }
            vahanNocActivity.E1().A.setAdapter(new b0(vahanNocActivity, vahanStateModle));
            try {
                vahanNocActivity.I1().show();
                vahanNocActivity.M1().i0(vahanNocActivity, vahanNocActivity.J1());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanNocActivity vahanNocActivity, HptDetailsModle hptDetailsModle) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
        try {
            l.c(hptDetailsModle);
            vahanNocActivity.l2(hptDetailsModle);
            vahanNocActivity.R = true;
            String valueOf = String.valueOf(hptDetailsModle.getFncr_name());
            String valueOf2 = String.valueOf(hptDetailsModle.getFncr_add1());
            String valueOf3 = String.valueOf(hptDetailsModle.getFncr_add2());
            String valueOf4 = String.valueOf(hptDetailsModle.getFncr_add3());
            vahanNocActivity.V = String.valueOf(hptDetailsModle.getFrom_dt());
            String str = hptDetailsModle.getHp_type().toString();
            if (valueOf.length() == 0) {
                vahanNocActivity.E1().f29102n.setText("--");
            } else {
                vahanNocActivity.E1().f29102n.setText(valueOf);
            }
            if (valueOf2.length() != 0) {
                AppCompatTextView appCompatTextView = vahanNocActivity.E1().f29100l;
                appCompatTextView.setText(valueOf2 + valueOf3 + valueOf4);
            }
            String str2 = vahanNocActivity.V;
            if (str2 != null) {
                if (str2.length() != 0) {
                    vahanNocActivity.E1().f29097i.setText(z9.a.f18947a.f(vahanNocActivity.V));
                }
            }
            if (str == null) {
                return;
            }
            if (str.length() != 0) {
                vahanNocActivity.E1().I.setText(str.toString());
            }
        } catch (Exception e10) {
            vahanNocActivity.R = false;
            e10.printStackTrace();
            vahanNocActivity.E1().f29109u.setVisibility(8);
            vahanNocActivity.E1().f29105q.setVisibility(8);
            vahanNocActivity.E1().f29106r.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanNocActivity vahanNocActivity, String str) {
        l.f(vahanNocActivity, "this$0");
        vahanNocActivity.I1().dismiss();
        vahanNocActivity.E1().f29109u.setVisibility(8);
        vahanNocActivity.E1().f29105q.setVisibility(8);
        vahanNocActivity.E1().f29106r.setVisibility(8);
        vahanNocActivity.R = false;
    }

    public final String B1() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String C1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final ImageView D1() {
        ImageView imageView = this.M;
        if (imageView != null) {
            return imageView;
        }
        l.v("back_image");
        return null;
    }

    public final vd E1() {
        vd vdVar = this.G;
        if (vdVar != null) {
            return vdVar;
        }
        l.v("binding");
        return null;
    }

    public final HptDetailsModle F1() {
        HptDetailsModle hptDetailsModle = this.P;
        if (hptDetailsModle != null) {
            return hptDetailsModle;
        }
        l.v("htpmodle");
        return null;
    }

    public final c G1() {
        c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final ProgressDialog I1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String J1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails K1() {
        NrvDetails nrvDetails = this.L;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService L1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final h M1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void g2(String str) {
        l.f(str, "<set-?>");
        this.U = str;
    }

    public final void h2(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void i2(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.M = imageView;
    }

    public final void j2(vd vdVar) {
        l.f(vdVar, "<set-?>");
        this.G = vdVar;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void l2(HptDetailsModle hptDetailsModle) {
        l.f(hptDetailsModle, "<set-?>");
        this.P = hptDetailsModle;
    }

    public final void m2(c cVar) {
        l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void n2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void o2(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_noc);
        vd c10 = vd.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        j2(c10);
        setContentView((View) E1().b());
        e.f17509a.H2(this, E1());
        q2(VahanProService.f21196b.b(this));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        i2((ImageView) findViewById);
        o2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        p2((NrvDetails) serializableExtra);
        h2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        g2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        m2(new c(this));
        TextView textView = E1().X;
        textView.setText(G1().b("vehicle_no", "Vehicle No.:") + ' ' + J1());
        E1().Y.setText(G1().b("view_vehicle_details", "View Vehicle Details"));
        E1().Y.setPaintFlags(E1().Y.getPaintFlags() | 8);
        E1().Y.setOnClickListener(new m1(this));
        this.Q = String.valueOf(getIntent().getStringExtra("off_code"));
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.S = booleanExtra;
        VContant.Companion companion = VContant.Companion;
        LinearLayout linearLayout = E1().f29114z.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(booleanExtra, linearLayout);
        n2(new ProgressDialog(this));
        I1().setMessage("Please wait...");
        I1().setCancelable(false);
        I1().setCanceledOnTouchOutside(false);
        r2((h) new u0((x0) this, (u0.b) new g(new wg.d(L1()))).a(h.class));
        D1().setOnClickListener(new e2(this));
        try {
            I1().show();
            M1().p0();
        } catch (Exception unused) {
        }
        E1().f29113y.setOnItemSelectedListener(new b(this));
        E1().f29098j.setOnClickListener(new n1(this, new f2(this)));
        M1().b0().g(this, new o1(this));
        M1().c0().g(this, new p1(this));
        M1().U0().g(this, new q1(this));
        M1().j0().g(this, new r1(this));
        M1().k0().g(this, new s1(this));
        Spinner spinner = E1().A;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        M1().d0().g(this, new t1(this));
        E1().f29094f.setOnCheckedChangeListener(new x1(this));
        E1().E.setOnCheckedChangeListener(new y1(this));
        E1().f29093e.setOnClickListener(new z1(this));
        M1().l0().g(this, new a2(this));
        M1().m0().g(this, new b2(this));
        M1().q0().g(this, new c2(this));
        M1().r0().g(this, new d2(this));
    }

    public final void p2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.L = nrvDetails;
    }

    public final void q2(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void r2(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final int z1(VahanStateModle vahanStateModle, String str) {
        l.f(vahanStateModle, "state_list");
        l.f(str, "statecode");
        int size = vahanStateModle.size();
        int i10 = 0;
        while (i10 < size) {
            try {
                u uVar = new u();
                Object obj = vahanStateModle.get(i10);
                l.e(obj, "get(...)");
                uVar.f20234e = obj;
                if (H1((List) obj, new w1(uVar, str)) > -1) {
                    return i10;
                }
                i10++;
            } catch (Exception unused) {
            }
        }
        return -1;
    }
}
