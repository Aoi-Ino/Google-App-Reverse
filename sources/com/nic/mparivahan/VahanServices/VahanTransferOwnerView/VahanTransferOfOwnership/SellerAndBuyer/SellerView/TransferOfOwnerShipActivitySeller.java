package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.AadhaarVerification.ToGenerateOTPScreenForResult;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.AddNomineeDtoX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.Data;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.SellerResponse;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.TOPurposeResponseData;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.ToCommonModel2;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import fh.f0;
import fh.g0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import ni.kd;
import pl.x;
import t8.c;
import v9.d;

public final class TransferOfOwnerShipActivitySeller extends androidx.appcompat.app.d {
    public kd G;
    public qh.a H;
    public TOCommonService I;
    public uh.a J;
    public TOPurposeService K;
    private Calendar L = Calendar.getInstance();
    public String M;
    private boolean N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public NrvDetails U;
    public String V;
    public String W;
    public ld.c X;
    public ProgressDialog Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f21382a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f21383b0;

    /* renamed from: c0  reason: collision with root package name */
    public MultiSelectionViewModel f21384c0;

    /* renamed from: d0  reason: collision with root package name */
    public MultiService f21385d0;

    /* renamed from: e0  reason: collision with root package name */
    private HashMap f21386e0 = new HashMap();

    /* renamed from: f0  reason: collision with root package name */
    private ArrayList f21387f0 = new ArrayList();

    /* renamed from: g0  reason: collision with root package name */
    private MultiServiceDraftTO f21388g0;

    /* renamed from: h0  reason: collision with root package name */
    private MultiServiceDraftTO f21389h0;

    /* renamed from: i0  reason: collision with root package name */
    private final d.c f21390i0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21391e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            super(1);
            this.f21391e = transferOfOwnerShipActivitySeller;
        }

        public final void b(SellerResponse sellerResponse) {
            Integer statusCode;
            this.f21391e.z1().dismiss();
            ApiMessage apiMessage = sellerResponse.getApiMessage();
            String str = null;
            if (apiMessage == null || (statusCode = apiMessage.getStatusCode()) == null || statusCode.intValue() != 200) {
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller = this.f21391e;
                ApiMessage apiMessage2 = sellerResponse.getApiMessage();
                if (apiMessage2 != null) {
                    str = apiMessage2.getDeveloperMessage();
                }
                transferOfOwnerShipActivitySeller.m2(transferOfOwnerShipActivitySeller, str);
                return;
            }
            try {
                SaveVahanlog.a aVar = SaveVahanlog.f20959k;
                TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller2 = this.f21391e;
                NrvDetails C1 = transferOfOwnerShipActivitySeller2.C1();
                boolean I1 = this.f21391e.I1();
                Data data = sellerResponse.getData();
                String valueOf = String.valueOf(data != null ? data.getApplNo() : null);
                String substring = this.f21391e.B1().substring(0, 4);
                cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                aVar.a(transferOfOwnerShipActivitySeller2, C1, I1, valueOf, VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE, substring);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            Intent intent = new Intent(this.f21391e, TransferOfOwnerShipConfirmationScreen.class);
            Data data2 = sellerResponse.getData();
            if (data2 != null) {
                str = data2.getApplNo();
            }
            intent.putExtra(VContant.APP_NO, str);
            intent.putExtra("RcDetails", this.f21391e.C1());
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, this.f21391e.v1());
            this.f21391e.startActivity(intent);
            this.f21391e.finishAffinity();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SellerResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21392e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            super(1);
            this.f21392e = transferOfOwnerShipActivitySeller;
        }

        public final void b(String str) {
            this.f21392e.z1().dismiss();
            boolean o10 = p.o(str, "error", true);
            TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller = this.f21392e;
            transferOfOwnerShipActivitySeller.m2(transferOfOwnerShipActivitySeller, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21393e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            super(1);
            this.f21393e = transferOfOwnerShipActivitySeller;
        }

        public final void b(ToCommonModel2 toCommonModel2) {
            this.f21393e.z1().dismiss();
            try {
                Integer rc_owner_srNo = this.f21393e.C1().getRc_owner_srNo();
                this.f21393e.p1().f27183d.setText(String.valueOf(rc_owner_srNo != null ? Integer.valueOf(rc_owner_srNo.intValue() + 1) : null));
                ArrayList<OwnerCatagory> ownerCatagory = toCommonModel2.getData().getOwnerCatagory();
                ownerCatagory.add(0, new OwnerCatagory(0, "Select Owner Category"));
                this.f21393e.p1().f27189j.setAdapter(new hh.a(this.f21393e, ownerCatagory));
                ArrayList<OwnerShipType> ownerShipType = toCommonModel2.getData().getOwnerShipType();
                ownerShipType.add(0, new OwnerShipType("Select Ownership Type", 0));
                this.f21393e.p1().f27194o.setAdapter(new hh.b(this.f21393e, ownerShipType));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ToCommonModel2) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21394e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            super(1);
            this.f21394e = transferOfOwnerShipActivitySeller;
        }

        public final void b(String str) {
            this.f21394e.z1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21395e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            super(1);
            this.f21395e = transferOfOwnerShipActivitySeller;
        }

        public final void b(TOPurposeResponseData tOPurposeResponseData) {
            try {
                ArrayList<com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data> data = tOPurposeResponseData.getData();
                if (data != null) {
                    data.add(0, new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeResponseData.Data(0, "Select Purpose", "0"));
                }
                this.f21395e.p1().f27198s.setAdapter(new rh.a(this.f21395e, data));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((TOPurposeResponseData) obj);
            return x.f30437a;
        }
    }

    public static final class f implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21396e;

        f(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            this.f21396e = transferOfOwnerShipActivitySeller;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21396e.d2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
            Log.e("whichPurpose", this.f21396e.A1());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class g implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21397e;

        g(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            this.f21397e = transferOfOwnerShipActivitySeller;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21397e.b2(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
            Log.e("whichPurpose2", this.f21397e.y1());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class h implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TransferOfOwnerShipActivitySeller f21398e;

        h(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller) {
            this.f21398e = transferOfOwnerShipActivitySeller;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21398e.Y1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21399a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f21399a = lVar;
        }

        public final pl.c a() {
            return this.f21399a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21399a.invoke(obj);
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

    public TransferOfOwnerShipActivitySeller() {
        d.c y02 = y0(new e.d(), new f0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21390i0 = y02;
    }

    /* access modifiers changed from: private */
    public static final void J1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, d.a aVar) {
        i7.d dVar;
        TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller2 = transferOfOwnerShipActivitySeller;
        cm.l.f(transferOfOwnerShipActivitySeller2, "this$0");
        Log.e("Test", "Working...");
        if (aVar.d() == -1) {
            Integer num = null;
            if (transferOfOwnerShipActivitySeller2.N) {
                Object selectedItem = transferOfOwnerShipActivitySeller.p1().f27194o.getSelectedItem();
                cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
                OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
                Object selectedItem2 = transferOfOwnerShipActivitySeller.p1().f27189j.getSelectedItem();
                cm.l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
                OwnerCatagory ownerCatagory = (OwnerCatagory) selectedItem2;
                String r12 = transferOfOwnerShipActivitySeller.r1();
                String valueOf = String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd());
                String obj = transferOfOwnerShipActivitySeller.p1().f27181b.getText().toString();
                String obj2 = transferOfOwnerShipActivitySeller.p1().f27185f.getText().toString();
                String obj3 = transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString();
                d.a aVar2 = v9.d.f17494a;
                String m10 = aVar2.m();
                int parseInt = Integer.parseInt(transferOfOwnerShipActivitySeller.x1());
                String m11 = aVar2.m();
                int catgCode = ownerCatagory.getCatgCode();
                String catgDescription = ownerCatagory.getCatgDescription();
                int owCode = ownerShipType.getOwCode();
                String codeDescription = ownerShipType.getCodeDescription();
                String obj4 = transferOfOwnerShipActivitySeller.p1().f27191l.getText().toString();
                Integer rc_owner_srNo = transferOfOwnerShipActivitySeller.C1().getRc_owner_srNo();
                if (rc_owner_srNo != null) {
                    num = Integer.valueOf(rc_owner_srNo.intValue() + 1);
                }
                cm.l.c(num);
                TransferOwnershipDto transferOwnershipDto = new TransferOwnershipDto(" ", "A", r12, "", "", "", 0, 0, valueOf, obj, obj2, " ", false, obj3, m10, parseInt, m11, catgCode, catgDescription, owCode, codeDescription, " ", obj4, num.intValue(), transferOfOwnerShipActivitySeller.p1().f27196q.getText().toString(), "", "", "", 0, 0, "", Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), "SALE", transferOfOwnerShipActivitySeller.C1().getRc_regn_no(), Long.parseLong(transferOfOwnerShipActivitySeller.p1().f27205z.getText().toString()), transferOfOwnerShipActivitySeller.p1().B.getText().toString(), "", String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd()), aVar2.m());
                MultiServiceDraftTO multiServiceDraftTO = transferOfOwnerShipActivitySeller2.f21388g0;
                cm.l.c(multiServiceDraftTO);
                transferOfOwnerShipActivitySeller2.f21389h0 = MultiServiceDraftTO.copy$default(multiServiceDraftTO, (String) null, "A", (ii.a) null, transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString(), (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd()), "S", transferOwnershipDto, (AddNomineeDtoX) null, 36853, (Object) null);
                dVar = new i7.d();
            } else {
                Object selectedItem3 = transferOfOwnerShipActivitySeller.p1().f27194o.getSelectedItem();
                cm.l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
                OwnerShipType ownerShipType2 = (OwnerShipType) selectedItem3;
                Object selectedItem4 = transferOfOwnerShipActivitySeller.p1().f27189j.getSelectedItem();
                cm.l.d(selectedItem4, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
                OwnerCatagory ownerCatagory2 = (OwnerCatagory) selectedItem4;
                String r13 = transferOfOwnerShipActivitySeller.r1();
                String valueOf2 = String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd());
                String obj5 = transferOfOwnerShipActivitySeller.p1().f27181b.getText().toString();
                String obj6 = transferOfOwnerShipActivitySeller.p1().f27185f.getText().toString();
                String obj7 = transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString();
                d.a aVar3 = v9.d.f17494a;
                String m12 = aVar3.m();
                int parseInt2 = Integer.parseInt(transferOfOwnerShipActivitySeller.x1());
                String m13 = aVar3.m();
                int catgCode2 = ownerCatagory2.getCatgCode();
                String catgDescription2 = ownerCatagory2.getCatgDescription();
                int owCode2 = ownerShipType2.getOwCode();
                String codeDescription2 = ownerShipType2.getCodeDescription();
                String obj8 = transferOfOwnerShipActivitySeller.p1().f27191l.getText().toString();
                Integer rc_owner_srNo2 = transferOfOwnerShipActivitySeller.C1().getRc_owner_srNo();
                if (rc_owner_srNo2 != null) {
                    num = Integer.valueOf(rc_owner_srNo2.intValue() + 1);
                }
                cm.l.c(num);
                TransferOwnershipDto transferOwnershipDto2 = new TransferOwnershipDto(" ", "M", r13, "", "", "", 0, 0, valueOf2, obj5, obj6, " ", false, obj7, m12, parseInt2, m13, catgCode2, catgDescription2, owCode2, codeDescription2, " ", obj8, num.intValue(), transferOfOwnerShipActivitySeller.p1().f27196q.getText().toString(), "", "", "", 0, 0, "", Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), "SALE", transferOfOwnerShipActivitySeller.C1().getRc_regn_no(), Long.parseLong(transferOfOwnerShipActivitySeller.p1().f27205z.getText().toString()), transferOfOwnerShipActivitySeller.p1().B.getText().toString(), "", String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd()), aVar3.m());
                MultiServiceDraftTO multiServiceDraftTO2 = transferOfOwnerShipActivitySeller2.f21388g0;
                cm.l.c(multiServiceDraftTO2);
                transferOfOwnerShipActivitySeller2.f21389h0 = MultiServiceDraftTO.copy$default(multiServiceDraftTO2, (String) null, "M", (ii.a) null, transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString(), (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, (HptDto) null, 0, (String) null, (ArrayList) null, (String) null, String.valueOf(transferOfOwnerShipActivitySeller.C1().getState_cd()), "S", transferOwnershipDto2, (AddNomineeDtoX) null, 36853, (Object) null);
                dVar = new i7.d();
            }
            String t10 = dVar.t(transferOfOwnerShipActivitySeller2.f21389h0);
            transferOfOwnerShipActivitySeller.z1().show();
            MultiSelectionViewModel F1 = transferOfOwnerShipActivitySeller.F1();
            cm.l.c(t10);
            F1.w(t10, transferOfOwnerShipActivitySeller2.N);
        }
    }

    /* access modifiers changed from: private */
    public static final void K1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, View view) {
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        Intent intent = new Intent(transferOfOwnerShipActivitySeller, VahanVehicleDetailsService.class);
        intent.putExtra("RC", transferOfOwnerShipActivitySeller.B1());
        intent.putExtra("RcDetails", transferOfOwnerShipActivitySeller.C1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, transferOfOwnerShipActivitySeller.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, transferOfOwnerShipActivitySeller.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, transferOfOwnerShipActivitySeller.n1());
        transferOfOwnerShipActivitySeller.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void L1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        transferOfOwnerShipActivitySeller.L.set(1, i10);
        transferOfOwnerShipActivitySeller.L.set(2, i11);
        transferOfOwnerShipActivitySeller.L.set(5, i12);
        new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        CharSequence format = DateFormat.format("dd", transferOfOwnerShipActivitySeller.L.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        CharSequence format2 = DateFormat.format("MM", transferOfOwnerShipActivitySeller.L.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        CharSequence format3 = DateFormat.format("yyyy", transferOfOwnerShipActivitySeller.L.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        transferOfOwnerShipActivitySeller.V1(((String) format3) + '-' + ((String) format2) + '-' + ((String) format));
        transferOfOwnerShipActivitySeller.p1().B.setText(transferOfOwnerShipActivitySeller.s1().toString());
    }

    /* access modifiers changed from: private */
    public static final void M1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListenerNominee");
        DatePickerDialog datePickerDialog = new DatePickerDialog(transferOfOwnerShipActivitySeller, onDateSetListener, transferOfOwnerShipActivitySeller.L.get(1), transferOfOwnerShipActivitySeller.L.get(2), transferOfOwnerShipActivitySeller.L.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void N1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, View view) {
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        VUtility.Companion.v(transferOfOwnerShipActivitySeller, transferOfOwnerShipActivitySeller.t1().b("are_you_sure_you_want_to_leave", transferOfOwnerShipActivitySeller.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void O1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, View view) {
        Intent intent;
        ld.c t12;
        String string;
        String str;
        Toast makeText;
        ld.c t13;
        String str2;
        String string2;
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        Object selectedItem = transferOfOwnerShipActivitySeller.p1().f27194o.getSelectedItem();
        cm.l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerShipType");
        OwnerShipType ownerShipType = (OwnerShipType) selectedItem;
        Object selectedItem2 = transferOfOwnerShipActivitySeller.p1().f27189j.getSelectedItem();
        cm.l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.ToCommonModel2.OwnerCatagory");
        OwnerCatagory ownerCatagory = (OwnerCatagory) selectedItem2;
        if (transferOfOwnerShipActivitySeller.p1().f27198s.getSelectedItemPosition() == 0) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.to_validation_purpose);
            str2 = "to_validation_purpose";
        } else if (transferOfOwnerShipActivitySeller.p1().f27194o.getSelectedItemPosition() == 0) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.to_validation_ownershipType);
            str2 = "to_validation_ownershipType";
        } else if (transferOfOwnerShipActivitySeller.p1().f27189j.getSelectedItemPosition() == 0) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.to_validation_newOwnerCat);
            str2 = "to_validation_newOwnerCat";
        } else if (transferOfOwnerShipActivitySeller.p1().f27191l.getText().length() < 2) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.to_validation_newOwnerName);
            str2 = "to_validation_newOwnerName";
        } else if (transferOfOwnerShipActivitySeller.p1().f27185f.getText().length() == 0 && p.o(ownerShipType.getCodeDescription(), "INDIVIDUAL", true)) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.please_enter_father_husband_name);
            str2 = "please_enter_father_husband_name";
        } else if (transferOfOwnerShipActivitySeller.p1().f27205z.getText().length() < 1) {
            t13 = transferOfOwnerShipActivitySeller.t1();
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.to_validation_saleAmount);
            str2 = "to_validation_saleAmount";
        } else {
            if (c.d(transferOfOwnerShipActivitySeller.p1().f27205z.getText().toString().charAt(0), '0', true)) {
                t13 = transferOfOwnerShipActivitySeller.t1();
                str2 = "please_enter_valid_sale_amount";
            } else if (transferOfOwnerShipActivitySeller.p1().B.getText().length() < 2) {
                t13 = transferOfOwnerShipActivitySeller.t1();
                str2 = "to_validation_saleDate";
            } else {
                c.a aVar = t8.c.f16582a;
                if (!aVar.q(transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString())) {
                    t12 = transferOfOwnerShipActivitySeller.t1();
                    string = transferOfOwnerShipActivitySeller.getString(R.string.please_enter_the_valid);
                    str = "label_log_entr_vali_mobno";
                } else if (transferOfOwnerShipActivitySeller.p1().f27181b.length() <= 0 || aVar.r(transferOfOwnerShipActivitySeller.p1().f27181b.getText().toString())) {
                    Class<ToGenerateOTPScreenForResult> cls = ToGenerateOTPScreenForResult.class;
                    if (transferOfOwnerShipActivitySeller.N) {
                        transferOfOwnerShipActivitySeller.f21386e0.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
                        intent = new Intent(transferOfOwnerShipActivitySeller, cls);
                    } else {
                        intent = new Intent(transferOfOwnerShipActivitySeller, cls);
                    }
                    intent.putExtra("stateCd", transferOfOwnerShipActivitySeller.C1().getState_cd());
                    intent.putExtra("off_code", transferOfOwnerShipActivitySeller.w1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, transferOfOwnerShipActivitySeller.N);
                    intent.putExtra("RcDetails", transferOfOwnerShipActivitySeller.C1());
                    intent.putExtra(VContant.NEXGEN_addahar_name, transferOfOwnerShipActivitySeller.o1());
                    intent.putExtra(VContant.NEXGEN_addahar_address, transferOfOwnerShipActivitySeller.n1());
                    intent.putExtra("MobNo", transferOfOwnerShipActivitySeller.p1().f27187h.getText().toString());
                    intent.putExtra("ServiceName", "Transfer of OwnerShip (Seller)");
                    transferOfOwnerShipActivitySeller.f21390i0.a(intent);
                    return;
                } else {
                    t12 = transferOfOwnerShipActivitySeller.t1();
                    string = transferOfOwnerShipActivitySeller.getString(R.string.label_log_entr_valid_email);
                    str = "label_log_entr_valid_email";
                }
                makeText = Toast.makeText(transferOfOwnerShipActivitySeller, t12.b(str, string), 1);
                makeText.show();
            }
            string2 = transferOfOwnerShipActivitySeller.getString(R.string.please_enter_valid_sale_amount);
        }
        makeText = Toast.makeText(transferOfOwnerShipActivitySeller, t13.b(str2, string2), 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void P1(TransferOfOwnerShipActivitySeller transferOfOwnerShipActivitySeller, View view) {
        cm.l.f(transferOfOwnerShipActivitySeller, "this$0");
        transferOfOwnerShipActivitySeller.p1().f27191l.setText("");
        transferOfOwnerShipActivitySeller.p1().f27185f.setText("");
        transferOfOwnerShipActivitySeller.p1().f27205z.setText("");
        transferOfOwnerShipActivitySeller.p1().f27196q.setText("");
        transferOfOwnerShipActivitySeller.p1().f27181b.setText("");
        transferOfOwnerShipActivitySeller.p1().f27187h.setText("");
    }

    /* access modifiers changed from: private */
    public static final void n2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("purposeGet");
        return null;
    }

    public final String B1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails C1() {
        NrvDetails nrvDetails = this.U;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final TOPurposeService D1() {
        TOPurposeService tOPurposeService = this.K;
        if (tOPurposeService != null) {
            return tOPurposeService;
        }
        cm.l.v("retrofitServicePurposeTO");
        return null;
    }

    public final TOCommonService E1() {
        TOCommonService tOCommonService = this.I;
        if (tOCommonService != null) {
            return tOCommonService;
        }
        cm.l.v("retrofitServiceTO");
        return null;
    }

    public final MultiSelectionViewModel F1() {
        MultiSelectionViewModel multiSelectionViewModel = this.f21384c0;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        cm.l.v("viewModelMulti");
        return null;
    }

    public final uh.a G1() {
        uh.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModelPurposeTO");
        return null;
    }

    public final qh.a H1() {
        qh.a aVar = this.H;
        if (aVar != null) {
            return aVar;
        }
        cm.l.v("viewModelTO");
        return null;
    }

    public final boolean I1() {
        return this.N;
    }

    public final void Q1(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void R1(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void S1(kd kdVar) {
        cm.l.f(kdVar, "<set-?>");
        this.G = kdVar;
    }

    public final void T1(String str) {
        cm.l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.R = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void W1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void X1(MultiService multiService) {
        cm.l.f(multiService, "<set-?>");
        this.f21385d0 = multiService;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.f21383b0 = str;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.P = str;
    }

    public final void a2(String str) {
        cm.l.f(str, "<set-?>");
        this.T = str;
    }

    public final void b2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21382a0 = str;
    }

    public final void c2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.Y = progressDialog;
    }

    public final void d2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void e2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public final void f2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.U = nrvDetails;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.S = str;
    }

    public final void h2(TOPurposeService tOPurposeService) {
        cm.l.f(tOPurposeService, "<set-?>");
        this.K = tOPurposeService;
    }

    public final void i2(TOCommonService tOCommonService) {
        cm.l.f(tOCommonService, "<set-?>");
        this.I = tOCommonService;
    }

    public final void j2(MultiSelectionViewModel multiSelectionViewModel) {
        cm.l.f(multiSelectionViewModel, "<set-?>");
        this.f21384c0 = multiSelectionViewModel;
    }

    public final void k2(uh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void l2(qh.a aVar) {
        cm.l.f(aVar, "<set-?>");
        this.H = aVar;
    }

    public final void m2(Context context, String str) {
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
        textView.setOnClickListener(new g0(dialog));
        dialog.show();
    }

    public final String n1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.V;
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
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|3|4|5|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0236 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            ni.kd r5 = ni.kd.c(r5)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r5, r0)
            r4.S1(r5)
            ni.kd r5 = r4.p1()
            android.widget.ScrollView r5 = r5.b()
            r4.setContentView((android.view.View) r5)
            android.view.Window r5 = r4.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r5.addFlags(r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService$a r5 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiService.f21070a
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r5 = r5.b(r4)
            r4.X1(r5)
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            com.nic.mparivahan.VahanServices.VahanMultiService.d r0 = new com.nic.mparivahan.VahanServices.VahanMultiService.d
            com.nic.mparivahan.VahanServices.VahanMultiService.b r1 = new com.nic.mparivahan.VahanServices.VahanMultiService.b
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r2 = r4.u1()
            r1.<init>(r2)
            r0.<init>(r1)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel> r0 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel.class
            androidx.lifecycle.t0 r5 = r5.a(r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = (com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel) r5
            r4.j2(r5)
            v9.e$a r5 = v9.e.f17509a
            ni.kd r0 = r4.p1()
            r5.m2(r4, r0)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService$a r5 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService.f21425a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService r5 = r5.b(r4)
            r4.i2(r5)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService$a r5 = com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService.f21428a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService r5 = r5.b(r4)
            r4.h2(r5)
            ld.c r5 = new ld.c
            r5.<init>(r4)
            r4.W1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "off_code"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.Z1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "aadhaarName"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.R1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "aadhaarAddress"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.Q1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "RC"
            java.lang.String r5 = r5.getStringExtra(r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.e2(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "RcDetails"
            java.io.Serializable r5 = r5.getSerializableExtra(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r5, r0)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r5
            r4.f2(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "Face_Less_Staus"
            r1 = 0
            boolean r5 = r5.getBooleanExtra(r0, r1)
            r4.N = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "MULTIDRAFT"
            java.io.Serializable r5 = r5.getSerializableExtra(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO"
            cm.l.d(r5, r0)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r5 = (com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO) r5
            r4.f21388g0 = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "MULTIARRAY"
            java.io.Serializable r5 = r5.getSerializableExtra(r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.f21387f0 = r5
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = r4.C1()
            java.lang.String r5 = r5.getRc_chasi_no()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.T1(r5)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = r4.C1()
            java.lang.String r5 = r5.getRc_off_cd()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.a2(r5)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = r4.C1()
            java.lang.String r5 = r5.getRc_regn_no()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.g2(r5)
            java.lang.String r5 = r4.q1()
            java.lang.String r0 = r4.q1()
            int r0 = r0.length()
            int r0 = r0 + -5
            java.lang.String r5 = r5.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            cm.l.e(r5, r0)
            r4.U1(r5)
            ld.c r5 = new ld.c
            r5.<init>(r4)
            r4.W1(r5)
            ni.kd r5 = r4.p1()
            ni.qd r5 = r5.D
            android.widget.TextView r5 = r5.f28308i
            ld.c r0 = r4.t1()
            java.lang.String r2 = "toSellerHeader"
            java.lang.String r3 = "Transfer of Ownership \n(Seller)"
            java.lang.String r0 = r0.b(r2, r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.setText(r0)
            ni.kd r5 = r4.p1()
            ni.qd r5 = r5.D
            android.widget.TextView r5 = r5.f28304e
            r5.setVisibility(r1)
            ni.kd r5 = r4.p1()
            ni.qd r5 = r5.D
            android.widget.TextView r5 = r5.f28304e
            java.lang.String r0 = r4.B1()
            r5.setText(r0)
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r0 = r4.B1()
            r5.<init>(r0)
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r2 = r5.length()
            r5.setSpan(r0, r1, r2, r1)
            ni.kd r0 = r4.p1()
            ni.qd r0 = r0.D
            android.widget.TextView r0 = r0.f28304e
            r0.setText(r5)
            ni.kd r5 = r4.p1()
            ni.qd r5 = r5.D
            android.widget.TextView r5 = r5.f28304e
            fh.z r0 = new fh.z
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            android.app.ProgressDialog r5 = new android.app.ProgressDialog
            r5.<init>(r4)
            r4.c2(r5)
            android.app.ProgressDialog r5 = r4.z1()
            ld.c r0 = r4.t1()
            r2 = 2132018281(0x7f140469, float:1.9674864E38)
            java.lang.String r2 = r4.getString(r2)
            java.lang.String r3 = "label_challan_please_wait"
            java.lang.String r0 = r0.b(r3, r2)
            r5.setMessage(r0)
            android.app.ProgressDialog r5 = r4.z1()
            r5.setCancelable(r1)
            android.app.ProgressDialog r5 = r4.z1()
            r5.setCanceledOnTouchOutside(r1)
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            oh.b r0 = new oh.b
            oh.a r1 = new oh.a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOCommonService.TOCommonService r2 = r4.E1()
            r1.<init>(r2)
            r0.<init>(r1)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<qh.a> r0 = qh.a.class
            androidx.lifecycle.t0 r5 = r5.a(r0)
            qh.a r5 = (qh.a) r5
            r4.l2(r5)
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            th.b r0 = new th.b
            sh.a r1 = new sh.a
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOPurposeData.TOPurposeService.TOPurposeService r2 = r4.D1()
            r1.<init>(r2)
            r0.<init>(r1)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<uh.a> r0 = uh.a.class
            androidx.lifecycle.t0 r5 = r5.a(r0)
            uh.a r5 = (uh.a) r5
            r4.k2(r5)
            fh.a0 r5 = new fh.a0
            r5.<init>(r4)
            ni.kd r0 = r4.p1()
            android.widget.TextView r0 = r0.B
            fh.b0 r1 = new fh.b0
            r1.<init>(r4, r5)
            r0.setOnClickListener(r1)
            android.app.ProgressDialog r5 = r4.z1()     // Catch:{ Exception -> 0x0236 }
            r5.show()     // Catch:{ Exception -> 0x0236 }
            qh.a r5 = r4.H1()     // Catch:{ Exception -> 0x0236 }
            r5.g()     // Catch:{ Exception -> 0x0236 }
        L_0x0236:
            uh.a r5 = r4.G1()     // Catch:{ Exception -> 0x0249 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r4.C1()     // Catch:{ Exception -> 0x0249 }
            java.lang.String r0 = r0.getState_cd()     // Catch:{ Exception -> 0x0249 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0249 }
            r5.g(r0)     // Catch:{ Exception -> 0x0249 }
        L_0x0249:
            ni.kd r5 = r4.p1()
            ni.qd r5 = r5.D
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f28305f
            fh.c0 r0 = new fh.c0
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            qh.a r5 = r4.H1()
            androidx.lifecycle.a0 r5 = r5.i()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$c r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$c
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i
            r1.<init>(r0)
            r5.g(r4, r1)
            qh.a r5 = r4.H1()
            androidx.lifecycle.a0 r5 = r5.h()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$d r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$d
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i
            r1.<init>(r0)
            r5.g(r4, r1)
            uh.a r5 = r4.G1()
            androidx.lifecycle.a0 r5 = r5.h()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$e r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$e
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i
            r1.<init>(r0)
            r5.g(r4, r1)
            ni.kd r5 = r4.p1()
            android.widget.Spinner r5 = r5.f27198s
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$f r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$f
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
            ni.kd r5 = r4.p1()
            android.widget.Spinner r5 = r5.f27194o
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$g r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$g
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
            ni.kd r5 = r4.p1()
            android.widget.Spinner r5 = r5.f27189j
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$h r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$h
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
            ni.kd r5 = r4.p1()
            android.widget.TextView r5 = r5.f27193n
            fh.d0 r0 = new fh.d0
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            ni.kd r5 = r4.p1()
            android.widget.TextView r5 = r5.f27201v
            fh.e0 r0 = new fh.e0
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.F1()
            androidx.lifecycle.a0 r5 = r5.s()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$a r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$a
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i
            r1.<init>(r0)
            r5.g(r4, r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r5 = r4.F1()
            androidx.lifecycle.a0 r5 = r5.t()
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$b r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$b
            r0.<init>(r4)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i r1 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller$i
            r1.<init>(r0)
            r5.g(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.TransferOfOwnerShipActivitySeller.onCreate(android.os.Bundle):void");
    }

    public final kd p1() {
        kd kdVar = this.G;
        if (kdVar != null) {
            return kdVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final String q1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        cm.l.v("chasis_no");
        return null;
    }

    public final String r1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        cm.l.v("chasis_no5");
        return null;
    }

    public final String s1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v("formated_date");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final MultiService u1() {
        MultiService multiService = this.f21385d0;
        if (multiService != null) {
            return multiService;
        }
        cm.l.v("multiService");
        return null;
    }

    public final ArrayList v1() {
        return this.f21387f0;
    }

    public final String w1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        cm.l.v("off_code");
        return null;
    }

    public final String x1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        cm.l.v("office_code");
        return null;
    }

    public final String y1() {
        String str = this.f21382a0;
        if (str != null) {
            return str;
        }
        cm.l.v("ownershipTypeGet");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.Y;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }
}
