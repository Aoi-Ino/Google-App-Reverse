package com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.core.content.res.h;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation.VahanMultiServiceConfirmationScreen;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.Data;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftResponse.DraftResponse;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import ld.c;
import ni.eb;
import of.b;
import og.b0;
import og.x;
import pg.g;
import tg.a0;
import tg.c0;
import tg.d0;
import tg.e0;
import tg.f0;
import tg.g0;
import tg.h0;
import tg.i0;
import tg.u;
import tg.v;
import tg.w;
import tg.y;
import tg.z;
import v9.d;
import v9.e;

public final class HypothecationAdditionActivityMultiService extends d {
    public eb G;
    public b H;
    public HServices I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    public String L;
    public String M;
    public String N;
    public NrvDetails O;
    public String P;
    public String Q;
    private boolean R;
    public c S;
    private ArrayList T = new ArrayList();
    private MultiServiceDraft U;
    public MultiSelectionViewModel V;
    public MultiService W;
    private MultiServiceDraft X;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HypothecationAdditionActivityMultiService f21076e;

        a(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService) {
            this.f21076e = hypothecationAdditionActivityMultiService;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21076e.w1().f26130p.getSelectedItemPosition() != 0) {
                this.f21076e.A1().show();
                Object selectedItem = this.f21076e.w1().f26130p.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21076e.E1().q(((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, View view) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        try {
            g.f30363a.e(hypothecationAdditionActivityMultiService, hypothecationAdditionActivityMultiService.T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, View view) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        Intent intent = new Intent(hypothecationAdditionActivityMultiService, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationAdditionActivityMultiService.B1());
        intent.putExtra("RcDetails", hypothecationAdditionActivityMultiService.C1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivityMultiService.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivityMultiService.v1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivityMultiService.u1());
        hypothecationAdditionActivityMultiService.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.K.set(1, i10);
        hypothecationAdditionActivityMultiService.K.set(2, i11);
        hypothecationAdditionActivityMultiService.K.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationAdditionActivityMultiService.K.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationAdditionActivityMultiService.K.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationAdditionActivityMultiService.K.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationAdditionActivityMultiService.Z1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationAdditionActivityMultiService.w1().f26120f.setText(simpleDateFormat.format(hypothecationAdditionActivityMultiService.K.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationAdditionActivityMultiService, onDateSetListener, hypothecationAdditionActivityMultiService.K.get(1), hypothecationAdditionActivityMultiService.K.get(2), hypothecationAdditionActivityMultiService.K.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, View view) {
        Class<?> cls;
        c x12;
        String string;
        String str;
        HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService2 = hypothecationAdditionActivityMultiService;
        l.f(hypothecationAdditionActivityMultiService2, "this$0");
        String obj = hypothecationAdditionActivityMultiService.w1().f26122h.getText().toString();
        String obj2 = hypothecationAdditionActivityMultiService.w1().f26123i.getText().toString();
        String obj3 = hypothecationAdditionActivityMultiService.w1().C.getText().toString();
        String obj4 = hypothecationAdditionActivityMultiService.w1().f26126l.getText().toString();
        String obj5 = hypothecationAdditionActivityMultiService.w1().f26118d.getText().toString();
        String obj6 = hypothecationAdditionActivityMultiService.w1().f26120f.getText().toString();
        Object selectedItem = hypothecationAdditionActivityMultiService.w1().f26130p.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (hypothecationAdditionActivityMultiService.w1().f26125k.getSelectedItemPosition() == 0) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_enter_hypothentication_type);
            str = "please_enter_hypothentication_type";
        } else if (obj.length() < 2) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_enter_the_financer_name);
            str = "please_enter_the_financer_name";
        } else if (obj2.length() < 2) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_enter_valid_house_no);
            str = "please_enter_valid_house_no";
        } else if (obj3.length() < 3) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_enter_village_town_city);
            str = "please_enter_village_town_city";
        } else if (hypothecationAdditionActivityMultiService.w1().f26130p.getSelectedItemPosition() == 0) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_select_the_state);
            str = "please_select_the_state";
        } else if (hypothecationAdditionActivityMultiService.w1().f26117c.getSelectedItemPosition() == 0) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_select_district);
            str = "please_select_district";
        } else if (obj5.length() < 6) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_enter_valid_pincode);
            str = "please_enter_valid_pincode";
        } else if (hypothecationAdditionActivityMultiService.w1().f26120f.getText().length() < 2) {
            x12 = hypothecationAdditionActivityMultiService.x1();
            string = hypothecationAdditionActivityMultiService2.getString(R.string.please_select_date);
            str = "please_select_date";
        } else {
            try {
                d.a aVar = v9.d.f17494a;
                aVar.m();
                Object selectedItem2 = hypothecationAdditionActivityMultiService.w1().f26125k.getSelectedItem();
                l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
                Object selectedItem3 = hypothecationAdditionActivityMultiService.w1().f26117c.getSelectedItem();
                l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
                int parseInt = Integer.parseInt(obj5);
                String str2 = ((String) vahanStateModleSubList.get(0)).toString();
                String h10 = z9.a.f18947a.h(obj6);
                String str3 = ((HTPModleItem) selectedItem2).getHp_type_cd().toString();
                int parseInt2 = Integer.parseInt(hypothecationAdditionActivityMultiService.z1());
                String m10 = aVar.m();
                int parseInt3 = Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                String B1 = hypothecationAdditionActivityMultiService.B1();
                Integer rc_owner_srNo = hypothecationAdditionActivityMultiService.C1().getRc_owner_srNo();
                HpaDto hpaDto = new HpaDto("", obj2, obj3, obj4, dist_cd, obj, parseInt, str2, h10, str3, parseInt2, m10, parseInt3, B1, rc_owner_srNo != null ? rc_owner_srNo.intValue() : 0, String.valueOf(hypothecationAdditionActivityMultiService.C1().getState_cd()));
                MultiServiceDraft multiServiceDraft = hypothecationAdditionActivityMultiService2.U;
                l.c(multiServiceDraft);
                hypothecationAdditionActivityMultiService2.X = MultiServiceDraft.copy$default(multiServiceDraft, (String) null, (ChanngeOfAdressDto) null, (Durcdto) null, hpaDto, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2039, (Object) null);
                VContant.Companion companion = VContant.Companion;
                if (p.o(companion.r(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiService2.T), VContant.REDIRECT, true)) {
                    hypothecationAdditionActivityMultiService.A1().show();
                    MultiSelectionViewModel F1 = hypothecationAdditionActivityMultiService.F1();
                    MultiServiceDraft multiServiceDraft2 = hypothecationAdditionActivityMultiService2.X;
                    l.c(multiServiceDraft2);
                    F1.v(multiServiceDraft2);
                    return;
                }
                Intent intent = new Intent();
                if (companion.u(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiService2.T)) {
                    cls = Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip." + companion.r(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiService2.T));
                } else {
                    cls = Class.forName("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity." + companion.r(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiService2.T));
                }
                intent.setClass(hypothecationAdditionActivityMultiService2, cls);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationAdditionActivityMultiService2.T);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationAdditionActivityMultiService2.X);
                intent.putExtra("RC", hypothecationAdditionActivityMultiService.B1());
                intent.putExtra("RcDetails", hypothecationAdditionActivityMultiService.C1());
                intent.putExtra("off_code", hypothecationAdditionActivityMultiService.z1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivityMultiService2.R);
                intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivityMultiService.v1());
                intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivityMultiService.u1());
                hypothecationAdditionActivityMultiService2.startActivity(intent);
                hypothecationAdditionActivityMultiService.finish();
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Toast.makeText(hypothecationAdditionActivityMultiService2, x12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void L1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, DraftResponse draftResponse) {
        HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService2 = hypothecationAdditionActivityMultiService;
        l.f(hypothecationAdditionActivityMultiService2, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        ApiMessage apiMessage = draftResponse.getApiMessage();
        if (apiMessage != null && apiMessage.getStatusCode() == 200) {
            Data data = draftResponse.getData();
            MultiServiceDraft multiServiceDraft = null;
            String valueOf = String.valueOf(data != null ? data.getApplNo() : null);
            Data data2 = draftResponse.getData();
            if (data2 != null) {
                data2.getTransferOwnershipDto();
            }
            Data data3 = draftResponse.getData();
            ChanngeOfAdressDto channgeOfAdressDto = data3 != null ? data3.getChanngeOfAdressDto() : null;
            Data data4 = draftResponse.getData();
            HpaDto hpaDto = data4 != null ? data4.getHpaDto() : null;
            Data data5 = draftResponse.getData();
            HptDto hptDto = data5 != null ? data5.getHptDto() : null;
            Data data6 = draftResponse.getData();
            Durcdto durcdto = data6 != null ? data6.getDurcdto() : null;
            MultiServiceDraft multiServiceDraft2 = hypothecationAdditionActivityMultiService2.U;
            if (multiServiceDraft2 != null) {
                multiServiceDraft = MultiServiceDraft.copy$default(multiServiceDraft2, valueOf, channgeOfAdressDto, durcdto, hpaDto, hptDto, 0, (String) null, (ArrayList) null, (String) null, (String) null, (TransferOwnershipDto) null, 2016, (Object) null);
            }
            Intent intent = new Intent(hypothecationAdditionActivityMultiService2, VahanMultiServiceConfirmationScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationAdditionActivityMultiService2.T);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
            intent.putExtra("RcDetails", hypothecationAdditionActivityMultiService.C1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivityMultiService2.R);
            intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivityMultiService.v1());
            intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivityMultiService.u1());
            hypothecationAdditionActivityMultiService2.startActivity(intent);
            hypothecationAdditionActivityMultiService.finish();
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, String str) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        VContant.Companion.K(hypothecationAdditionActivityMultiService, str);
    }

    /* access modifiers changed from: private */
    public static final void N1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, View view) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        VUtility.Companion.v(hypothecationAdditionActivityMultiService, hypothecationAdditionActivityMultiService.x1().b("are_you_sure_you_want_to_leave", hypothecationAdditionActivityMultiService.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void O1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, View view) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.V1();
    }

    /* access modifiers changed from: private */
    public static final void P1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, VahanStateModle vahanStateModle) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            hypothecationAdditionActivityMultiService.w1().f26130p.setAdapter(new b0(hypothecationAdditionActivityMultiService, vahanStateModle));
            hypothecationAdditionActivityMultiService.A1().show();
            hypothecationAdditionActivityMultiService.E1().m();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, String str) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void R1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, DistictModle distictModle) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            hypothecationAdditionActivityMultiService.w1().f26117c.setAdapter(new og.g(hypothecationAdditionActivityMultiService, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void S1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, String str) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void T1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, HtpTypeModle htpTypeModle) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        try {
            l.c(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            hypothecationAdditionActivityMultiService.w1().f26125k.setAdapter(new x(hypothecationAdditionActivityMultiService, htpTypeModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(HypothecationAdditionActivityMultiService hypothecationAdditionActivityMultiService, String str) {
        l.f(hypothecationAdditionActivityMultiService, "this$0");
        hypothecationAdditionActivityMultiService.A1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        hypothecationAdditionActivityMultiService.w1().f26125k.setAdapter(new x(hypothecationAdditionActivityMultiService, arrayList));
    }

    private final void V1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final ProgressDialog A1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String B1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails C1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final HServices D1() {
        HServices hServices = this.I;
        if (hServices != null) {
            return hServices;
        }
        l.v("retrofitService");
        return null;
    }

    public final b E1() {
        b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        l.v("viewModel");
        return null;
    }

    public final MultiSelectionViewModel F1() {
        MultiSelectionViewModel multiSelectionViewModel = this.V;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModelMulti");
        return null;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void X1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void Y1(eb ebVar) {
        l.f(ebVar, "<set-?>");
        this.G = ebVar;
    }

    public final void Z1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void a2(c cVar) {
        l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void b2(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.W = multiService;
    }

    public final void c2(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void d2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void e2(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void f2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void g2(HServices hServices) {
        l.f(hServices, "<set-?>");
        this.I = hServices;
    }

    public final void h2(String str, ArrayList arrayList) {
        l.f(str, "purCode");
        try {
            l.c(arrayList);
            int indexOf = arrayList.indexOf(str);
            if (arrayList.size() == 4) {
                w1().f26132r.f29783b.setVisibility(0);
                TextView textView = w1().f26132r.f29785d;
                VContant.Companion companion = VContant.Companion;
                Object obj = arrayList.get(0);
                l.e(obj, "get(...)");
                textView.setText(companion.B(this, (String) obj));
                TextView textView2 = w1().f26132r.f29787f;
                Object obj2 = arrayList.get(1);
                l.e(obj2, "get(...)");
                textView2.setText(companion.B(this, (String) obj2));
                TextView textView3 = w1().f26132r.f29792k;
                Object obj3 = arrayList.get(2);
                l.e(obj3, "get(...)");
                textView3.setText(companion.B(this, (String) obj3));
                TextView textView4 = w1().f26132r.f29795n;
                Object obj4 = arrayList.get(3);
                l.e(obj4, "get(...)");
                textView4.setText(companion.B(this, (String) obj4));
                if (indexOf == 3) {
                    w1().f26132r.f29784c.setChecked(true);
                    w1().f26132r.f29786e.setChecked(true);
                    w1().f26132r.f29789h.setChecked(true);
                    w1().f26132r.f29794m.setChecked(false);
                }
                if (indexOf == 2) {
                    w1().f26132r.f29784c.setChecked(true);
                    w1().f26132r.f29786e.setChecked(true);
                    w1().f26132r.f29789h.setChecked(false);
                    w1().f26132r.f29794m.setCheckMarkDrawable(h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 1) {
                    w1().f26132r.f29784c.setChecked(true);
                    w1().f26132r.f29786e.setChecked(false);
                    Drawable e10 = h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().f26132r.f29789h.setCheckMarkDrawable(e10);
                    w1().f26132r.f29794m.setCheckMarkDrawable(e10);
                }
                if (indexOf == 0) {
                    w1().f26132r.f29784c.setChecked(false);
                    Drawable e11 = h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().f26132r.f29786e.setCheckMarkDrawable(e11);
                    w1().f26132r.f29789h.setCheckMarkDrawable(e11);
                    w1().f26132r.f29794m.setCheckMarkDrawable(e11);
                }
            }
            if (arrayList.size() == 3) {
                w1().f26132r.f29802u.setVisibility(0);
                TextView textView5 = w1().f26132r.f29807z;
                VContant.Companion companion2 = VContant.Companion;
                Object obj5 = arrayList.get(2);
                l.e(obj5, "get(...)");
                textView5.setText(companion2.B(this, (String) obj5));
                TextView textView6 = w1().f26132r.f29804w;
                Object obj6 = arrayList.get(1);
                l.e(obj6, "get(...)");
                textView6.setText(companion2.B(this, (String) obj6));
                TextView textView7 = w1().f26132r.f29791j;
                Object obj7 = arrayList.get(0);
                l.e(obj7, "get(...)");
                textView7.setText(companion2.B(this, (String) obj7));
                if (indexOf == 2) {
                    w1().f26132r.f29790i.setChecked(true);
                    w1().f26132r.f29803v.setChecked(true);
                    w1().f26132r.f29806y.setChecked(false);
                }
                if (indexOf == 1) {
                    w1().f26132r.f29790i.setChecked(true);
                    w1().f26132r.f29803v.setChecked(false);
                    w1().f26132r.f29806y.setCheckMarkDrawable(h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
                if (indexOf == 0) {
                    w1().f26132r.f29790i.setChecked(false);
                    Drawable e12 = h.e(getResources(), R.drawable.checkbox_multiservice, getTheme());
                    w1().f26132r.f29803v.setCheckMarkDrawable(e12);
                    w1().f26132r.f29806y.setCheckMarkDrawable(e12);
                }
            }
            if (arrayList.size() == 2) {
                w1().f26132r.A.setVisibility(0);
                TextView textView8 = w1().f26132r.f29801t;
                VContant.Companion companion3 = VContant.Companion;
                Object obj8 = arrayList.get(1);
                l.e(obj8, "get(...)");
                textView8.setText(companion3.B(this, (String) obj8));
                TextView textView9 = w1().f26132r.f29799r;
                Object obj9 = arrayList.get(0);
                l.e(obj9, "get(...)");
                textView9.setText(companion3.B(this, (String) obj9));
                if (indexOf == 1) {
                    w1().f26132r.f29798q.setChecked(true);
                    w1().f26132r.f29800s.setChecked(false);
                }
                if (indexOf == 0) {
                    w1().f26132r.f29798q.setChecked(false);
                    w1().f26132r.f29800s.setCheckMarkDrawable(h.e(getResources(), R.drawable.checkbox_multiservice, getTheme()));
                }
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    public final void i2(b bVar) {
        l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void j2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.V = multiSelectionViewModel;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.hyptaddition_multi);
        eb c10 = eb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        Y1(c10);
        setContentView((View) w1().b());
        e.f17509a.o2(this, w1());
        a2(new c(this));
        d2(new ProgressDialog(this));
        A1().setMessage("Please wait...");
        A1().setCancelable(false);
        A1().setCanceledOnTouchOutside(false);
        g2(HServices.f20664a.b(this));
        i2((b) new u0((x0) this, (u0.b) new of.a(new qf.a(D1()))).a(b.class));
        b2(MultiService.f21070a.b(this));
        j2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(y1()))).a(MultiSelectionViewModel.class));
        e2(String.valueOf(getIntent().getStringExtra("RC")));
        c2(String.valueOf(getIntent().getStringExtra("off_code")));
        X1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        W1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        e2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        f2((NrvDetails) serializableExtra);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.U = (MultiServiceDraft) serializableExtra2;
        this.T = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        w1().f26133s.f28304e.setVisibility(0);
        w1().f26133s.f28304e.setText(B1());
        SpannableString spannableString = new SpannableString(B1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        w1().f26133s.f28304e.setText(spannableString);
        ArrayList arrayList = this.T;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            w1().f26133s.f28308i.setText(new c(this).b("hypothecation_addition", getString(R.string.vahan_hypothecation_addition)));
        } else {
            SpannableString spannableString2 = new SpannableString(new c(this).b("rcServices", getString(R.string.rc_service)));
            spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
            w1().f26133s.f28308i.setText(spannableString2);
        }
        w1().f26133s.f28308i.setOnClickListener(new u(this));
        h2(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, this.T);
        if (this.R) {
            w1().f26129o.f27162e.setWeightSum(3.0f);
        }
        boolean booleanExtra = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        this.R = booleanExtra;
        VContant.Companion companion = VContant.Companion;
        LinearLayout linearLayout = w1().f26129o.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(booleanExtra, linearLayout);
        Serializable serializableExtra3 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        f2((NrvDetails) serializableExtra3);
        TextView textView = w1().A;
        textView.setText(x1().b("vehicle_no", "Vehicle No.:") + ' ' + B1());
        w1().B.setText(x1().b("view_vehicle_details", "View Vehicle Details"));
        w1().B.setPaintFlags(w1().B.getPaintFlags() | 8);
        w1().f26133s.f28304e.setOnClickListener(new f0(this));
        w1().f26133s.f28305f.setOnClickListener(new g0(this));
        w1().f26133s.f28306g.setOnClickListener(new h0(this));
        try {
            A1().show();
            E1().o();
        } catch (Exception unused) {
        }
        E1().n().g(this, new i0(this));
        E1().p().g(this, new v(this));
        E1().g().g(this, new w(this));
        E1().h().g(this, new tg.x(this));
        E1().i().g(this, new y(this));
        E1().j().g(this, new z(this));
        Spinner spinner = w1().f26130p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        w1().f26120f.setOnClickListener(new tg.b0(this, new a0(this)));
        w1().f26116b.setOnClickListener(new c0(this));
        F1().l().g(this, new d0(this));
        F1().m().g(this, new e0(this));
    }

    public final String u1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String v1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final eb w1() {
        eb ebVar = this.G;
        if (ebVar != null) {
            return ebVar;
        }
        l.v("binding");
        return null;
    }

    public final c x1() {
        c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final MultiService y1() {
        MultiService multiService = this.W;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String z1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }
}
