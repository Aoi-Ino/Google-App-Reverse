package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.HPA.Network.HServices;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModel.HtpTypeModle;
import com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.AddNomineeDtoX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import dh.a0;
import dh.c0;
import dh.d0;
import dh.e0;
import dh.f0;
import dh.t;
import dh.u;
import dh.v;
import dh.w;
import dh.y;
import dh.z;
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
import v9.d;

public final class HypothecationAdditionActivityMultiServiceTO extends d {
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
    private MultiServiceDraftTO U;
    public MultiSelectionViewModel V;
    public MultiService W;
    private MultiServiceDraftTO X;
    private DoAadhaarResponse Y;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HypothecationAdditionActivityMultiServiceTO f21363e;

        a(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO) {
            this.f21363e = hypothecationAdditionActivityMultiServiceTO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21363e.u1().f26130p.getSelectedItemPosition() != 0) {
                this.f21363e.y1().show();
                Object selectedItem = this.f21363e.u1().f26130p.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21363e.C1().q(((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, View view) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        try {
            g.f30363a.e(hypothecationAdditionActivityMultiServiceTO, hypothecationAdditionActivityMultiServiceTO.T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void E1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, View view) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        Intent intent = new Intent(hypothecationAdditionActivityMultiServiceTO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", hypothecationAdditionActivityMultiServiceTO.z1());
        intent.putExtra("RcDetails", hypothecationAdditionActivityMultiServiceTO.A1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivityMultiServiceTO.R);
        intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivityMultiServiceTO.t1());
        intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivityMultiServiceTO.s1());
        hypothecationAdditionActivityMultiServiceTO.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void F1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, DatePicker datePicker, int i10, int i11, int i12) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.K.set(1, i10);
        hypothecationAdditionActivityMultiServiceTO.K.set(2, i11);
        hypothecationAdditionActivityMultiServiceTO.K.set(5, i12);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", hypothecationAdditionActivityMultiServiceTO.K.getTime());
        l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", hypothecationAdditionActivityMultiServiceTO.K.getTime());
        l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", hypothecationAdditionActivityMultiServiceTO.K.getTime());
        l.d(format3, "null cannot be cast to non-null type kotlin.String");
        hypothecationAdditionActivityMultiServiceTO.U1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        hypothecationAdditionActivityMultiServiceTO.u1().f26120f.setText(simpleDateFormat.format(hypothecationAdditionActivityMultiServiceTO.K.getTime()));
    }

    /* access modifiers changed from: private */
    public static final void G1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(hypothecationAdditionActivityMultiServiceTO, onDateSetListener, hypothecationAdditionActivityMultiServiceTO.K.get(1), hypothecationAdditionActivityMultiServiceTO.K.get(2), hypothecationAdditionActivityMultiServiceTO.K.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void H1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, View view) {
        c v12;
        String string;
        String str;
        HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO2 = hypothecationAdditionActivityMultiServiceTO;
        l.f(hypothecationAdditionActivityMultiServiceTO2, "this$0");
        String obj = hypothecationAdditionActivityMultiServiceTO.u1().f26122h.getText().toString();
        String obj2 = hypothecationAdditionActivityMultiServiceTO.u1().f26123i.getText().toString();
        String obj3 = hypothecationAdditionActivityMultiServiceTO.u1().C.getText().toString();
        String obj4 = hypothecationAdditionActivityMultiServiceTO.u1().f26126l.getText().toString();
        String obj5 = hypothecationAdditionActivityMultiServiceTO.u1().f26118d.getText().toString();
        String obj6 = hypothecationAdditionActivityMultiServiceTO.u1().f26120f.getText().toString();
        Object selectedItem = hypothecationAdditionActivityMultiServiceTO.u1().f26130p.getSelectedItem();
        l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
        VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) selectedItem;
        if (hypothecationAdditionActivityMultiServiceTO.u1().f26125k.getSelectedItemPosition() == 0) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_enter_hypothentication_type);
            str = "please_enter_hypothentication_type";
        } else if (obj.length() < 2) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_enter_the_financer_name);
            str = "please_enter_the_financer_name";
        } else if (obj2.length() < 2) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_enter_valid_house_no);
            str = "please_enter_valid_house_no";
        } else if (obj3.length() < 3) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_enter_village_town_city);
            str = "please_enter_village_town_city";
        } else if (hypothecationAdditionActivityMultiServiceTO.u1().f26130p.getSelectedItemPosition() == 0) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_select_the_state);
            str = "please_select_the_state";
        } else if (hypothecationAdditionActivityMultiServiceTO.u1().f26117c.getSelectedItemPosition() == 0) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_select_district);
            str = "please_select_district";
        } else if (obj5.length() < 6) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_enter_valid_pincode);
            str = "please_enter_valid_pincode";
        } else if (hypothecationAdditionActivityMultiServiceTO.u1().f26120f.getText().length() < 2) {
            v12 = hypothecationAdditionActivityMultiServiceTO.v1();
            string = hypothecationAdditionActivityMultiServiceTO2.getString(R.string.please_select_date);
            str = "please_select_date";
        } else {
            try {
                d.a aVar = v9.d.f17494a;
                aVar.m();
                Object selectedItem2 = hypothecationAdditionActivityMultiServiceTO.u1().f26125k.getSelectedItem();
                l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.HPTModel.HTPModleItem");
                Object selectedItem3 = hypothecationAdditionActivityMultiServiceTO.u1().f26117c.getSelectedItem();
                l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
                int dist_cd = ((DistictModleItem) selectedItem3).getDist_cd();
                int parseInt = Integer.parseInt(obj5);
                String str2 = ((String) vahanStateModleSubList.get(0)).toString();
                String h10 = z9.a.f18947a.h(obj6);
                String str3 = ((HTPModleItem) selectedItem2).getHp_type_cd().toString();
                int parseInt2 = Integer.parseInt(hypothecationAdditionActivityMultiServiceTO.x1());
                String m10 = aVar.m();
                int parseInt3 = Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
                String z12 = hypothecationAdditionActivityMultiServiceTO.z1();
                Integer rc_owner_srNo = hypothecationAdditionActivityMultiServiceTO.A1().getRc_owner_srNo();
                HpaDto hpaDto = new HpaDto("", obj2, obj3, obj4, dist_cd, obj, parseInt, str2, h10, str3, parseInt2, m10, parseInt3, z12, rc_owner_srNo != null ? rc_owner_srNo.intValue() : 0, String.valueOf(hypothecationAdditionActivityMultiServiceTO.A1().getState_cd()));
                MultiServiceDraftTO multiServiceDraftTO = hypothecationAdditionActivityMultiServiceTO2.U;
                l.c(multiServiceDraftTO);
                hypothecationAdditionActivityMultiServiceTO2.X = MultiServiceDraftTO.copy$default(multiServiceDraftTO, (String) null, (String) null, (ii.a) null, (String) null, (ChanngeOfAdressDto) null, (Durcdto) null, hpaDto, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, (String) null, (String) null, (TransferOwnershipDto) null, (AddNomineeDtoX) null, 65471, (Object) null);
                VContant.Companion companion = VContant.Companion;
                if (!p.o(companion.r(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiServiceTO2.T), VContant.REDIRECT, true)) {
                    Intent intent = new Intent();
                    intent.setClass(hypothecationAdditionActivityMultiServiceTO2, Class.forName("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer." + companion.s(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE, hypothecationAdditionActivityMultiServiceTO2.T, "B")));
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, hypothecationAdditionActivityMultiServiceTO2.T);
                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, hypothecationAdditionActivityMultiServiceTO2.X);
                    intent.putExtra("RC", hypothecationAdditionActivityMultiServiceTO.z1());
                    intent.putExtra("RcDetails", hypothecationAdditionActivityMultiServiceTO.A1());
                    intent.putExtra("off_code", hypothecationAdditionActivityMultiServiceTO.x1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, hypothecationAdditionActivityMultiServiceTO2.R);
                    intent.putExtra(VContant.NEXGEN_addahar_name, hypothecationAdditionActivityMultiServiceTO.t1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, hypothecationAdditionActivityMultiServiceTO.s1());
                    if (hypothecationAdditionActivityMultiServiceTO2.R) {
                        intent.putExtra("AadhaarDetails", hypothecationAdditionActivityMultiServiceTO2.Y);
                    }
                    hypothecationAdditionActivityMultiServiceTO2.startActivity(intent);
                    hypothecationAdditionActivityMultiServiceTO.finish();
                    return;
                }
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Toast.makeText(hypothecationAdditionActivityMultiServiceTO2, v12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void I1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, View view) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        VUtility.Companion.v(hypothecationAdditionActivityMultiServiceTO, hypothecationAdditionActivityMultiServiceTO.v1().b("are_you_sure_you_want_to_leave", hypothecationAdditionActivityMultiServiceTO.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void J1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, View view) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.Q1();
    }

    /* access modifiers changed from: private */
    public static final void K1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, VahanStateModle vahanStateModle) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            hypothecationAdditionActivityMultiServiceTO.u1().f26130p.setAdapter(new b0(hypothecationAdditionActivityMultiServiceTO, vahanStateModle));
            hypothecationAdditionActivityMultiServiceTO.y1().show();
            hypothecationAdditionActivityMultiServiceTO.C1().m();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, String str) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void M1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, DistictModle distictModle) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            hypothecationAdditionActivityMultiServiceTO.u1().f26117c.setAdapter(new og.g(hypothecationAdditionActivityMultiServiceTO, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, String str) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void O1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, HtpTypeModle htpTypeModle) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
        try {
            l.c(htpTypeModle);
            htpTypeModle.add(0, new HTPModleItem("0", "Select Type"));
            hypothecationAdditionActivityMultiServiceTO.u1().f26125k.setAdapter(new x(hypothecationAdditionActivityMultiServiceTO, htpTypeModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(HypothecationAdditionActivityMultiServiceTO hypothecationAdditionActivityMultiServiceTO, String str) {
        l.f(hypothecationAdditionActivityMultiServiceTO, "this$0");
        hypothecationAdditionActivityMultiServiceTO.y1().dismiss();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, new HTPModleItem("0", "Select Type"));
        hypothecationAdditionActivityMultiServiceTO.u1().f26125k.setAdapter(new x(hypothecationAdditionActivityMultiServiceTO, arrayList));
    }

    private final void Q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final HServices B1() {
        HServices hServices = this.I;
        if (hServices != null) {
            return hServices;
        }
        l.v("retrofitService");
        return null;
    }

    public final b C1() {
        b bVar = this.H;
        if (bVar != null) {
            return bVar;
        }
        l.v("viewModel");
        return null;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void S1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void T1(eb ebVar) {
        l.f(ebVar, "<set-?>");
        this.G = ebVar;
    }

    public final void U1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void V1(c cVar) {
        l.f(cVar, "<set-?>");
        this.S = cVar;
    }

    public final void W1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.W = multiService;
    }

    public final void X1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void Y1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void Z1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void a2(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void b2(HServices hServices) {
        l.f(hServices, "<set-?>");
        this.I = hServices;
    }

    public final void c2(b bVar) {
        l.f(bVar, "<set-?>");
        this.H = bVar;
    }

    public final void d2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.V = multiSelectionViewModel;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, v1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        String valueOf;
        super.onCreate(bundle);
        setContentView((int) R.layout.hyptaddition_multi);
        eb c10 = eb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        T1(c10);
        setContentView((View) u1().b());
        getWindow().addFlags(128);
        V1(new c(this));
        Y1(new ProgressDialog(this));
        y1().setMessage("Please wait...");
        y1().setCancelable(false);
        y1().setCanceledOnTouchOutside(false);
        b2(HServices.f20664a.b(this));
        c2((b) new u0((x0) this, (u0.b) new of.a(new qf.a(B1()))).a(b.class));
        W1(MultiService.f21070a.b(this));
        d2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new com.nic.mparivahan.VahanServices.VahanMultiService.b(w1()))).a(MultiSelectionViewModel.class));
        X1(String.valueOf(getIntent().getStringExtra("off_code")));
        S1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        R1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Z1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra);
        this.R = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO");
        this.U = (MultiServiceDraftTO) serializableExtra2;
        this.T = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        try {
            if (this.R) {
                DoAadhaarResponse doAadhaarResponse = (DoAadhaarResponse) getIntent().getSerializableExtra("AadhaarDetails");
                this.Y = doAadhaarResponse;
                Log.e("getAddharrdetails-Addition", String.valueOf(doAadhaarResponse));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        u1().f26133s.f28304e.setVisibility(0);
        u1().f26133s.f28304e.setText(z1());
        SpannableString spannableString = new SpannableString(z1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        u1().f26133s.f28304e.setText(spannableString);
        c cVar = new c(this);
        ArrayList arrayList = this.T;
        l.c(arrayList);
        if (arrayList.size() <= 1) {
            textView = u1().f26133s.f28308i;
            valueOf = cVar.b("hypothecation_addition", getString(R.string.vahan_hypothecation_addition));
        } else {
            textView = u1().f26133s.f28308i;
            valueOf = String.valueOf(cVar.b("toBuyerHeader", "Transfer of Ownership \n(Buyer)"));
        }
        textView.setText(valueOf);
        u1().f26133s.f28308i.setOnClickListener(new t(this));
        if (this.R) {
            u1().f26129o.f27162e.setWeightSum(3.0f);
        }
        VContant.Companion companion = VContant.Companion;
        boolean z10 = this.R;
        LinearLayout linearLayout = u1().f26129o.f27159b;
        l.e(linearLayout, "appMent");
        companion.J(z10, linearLayout);
        Serializable serializableExtra3 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        a2((NrvDetails) serializableExtra3);
        TextView textView2 = u1().A;
        textView2.setText(v1().b("vehicle_no", "Vehicle No.:") + ' ' + z1());
        u1().B.setText(v1().b("view_vehicle_details", "View Vehicle Details"));
        u1().B.setPaintFlags(u1().B.getPaintFlags() | 8);
        u1().f26133s.f28304e.setOnClickListener(new a0(this));
        u1().f26133s.f28305f.setOnClickListener(new dh.b0(this));
        u1().f26133s.f28306g.setOnClickListener(new c0(this));
        try {
            y1().show();
            C1().o();
        } catch (Exception unused) {
        }
        C1().n().g(this, new d0(this));
        C1().p().g(this, new e0(this));
        C1().g().g(this, new f0(this));
        C1().h().g(this, new u(this));
        C1().i().g(this, new v(this));
        C1().j().g(this, new w(this));
        Spinner spinner = u1().f26130p;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new a(this));
        }
        u1().f26120f.setOnClickListener(new y(this, new dh.x(this)));
        u1().f26116b.setOnClickListener(new z(this));
    }

    public final String s1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String t1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final eb u1() {
        eb ebVar = this.G;
        if (ebVar != null) {
            return ebVar;
        }
        l.v("binding");
        return null;
    }

    public final c v1() {
        c cVar = this.S;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final MultiService w1() {
        MultiService multiService = this.W;
        if (multiService != null) {
            return multiService;
        }
        l.v("multiService");
        return null;
    }

    public final String x1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog y1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String z1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }
}
