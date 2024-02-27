package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import bi.h;
import cm.l;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModle;
import com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import og.g;

public final class AadhaarAddressTO extends d {
    public ni.a G;
    public h H;
    public VahanProService I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    public String L;
    public String M;
    public String N;
    public NrvDetails O;
    private DoAadhaarResponse P;
    public String Q;
    public String R;
    private boolean S;
    public ld.c T;
    private ArrayList U = new ArrayList();
    private MultiServiceDraftTO V;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AadhaarAddressTO f21356e;

        a(AadhaarAddressTO aadhaarAddressTO) {
            this.f21356e = aadhaarAddressTO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            this.f21356e.J1(String.valueOf(adapterView != null ? adapterView.getItemAtPosition(i10) : null));
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AadhaarAddressTO f21357e;

        b(AadhaarAddressTO aadhaarAddressTO) {
            this.f21357e = aadhaarAddressTO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21357e.p1().f25146e.getSelectedItemPosition() != 0) {
                this.f21357e.s1().show();
                Object selectedItem = this.f21357e.p1().f25146e.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21357e.x1().h1(this.f21357e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class c implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AadhaarAddressTO f21358e;

        c(AadhaarAddressTO aadhaarAddressTO) {
            this.f21358e = aadhaarAddressTO;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f21358e.p1().f25163v.getSelectedItemPosition() != 0) {
                this.f21358e.s1().show();
                Object selectedItem = this.f21358e.p1().f25163v.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
                this.f21358e.x1().i1(this.f21358e, ((String) ((VahanStateModleSubList) selectedItem).get(0)).toString());
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* access modifiers changed from: private */
    public static final void A1(AadhaarAddressTO aadhaarAddressTO, View view) {
        ld.c q12;
        String string;
        String str;
        l.f(aadhaarAddressTO, "this$0");
        if (aadhaarAddressTO.p1().f25149h.getText().length() < 2) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_enter_house_no_street_name);
            str = "please_enter_house_no_street_name";
        } else if (aadhaarAddressTO.p1().f25147f.getText().length() < 2) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_enter_current_village_town_city);
            str = "please_enter_current_village_town_city";
        } else if (aadhaarAddressTO.p1().f25144c.getText().length() < 2) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_enter_current_landmark_police_station);
            str = "please_enter_current_landmark_police_station";
        } else if (aadhaarAddressTO.p1().f25145d.getText().length() < 2) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_enter_current_pin_code);
            str = "please_enter_current_pin_code";
        } else if (aadhaarAddressTO.p1().f25146e.getSelectedItemPosition() == 0) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_select_current_state);
            str = "select_state";
        } else if (aadhaarAddressTO.p1().f25143b.getSelectedItemPosition() == 0) {
            q12 = aadhaarAddressTO.q1();
            string = aadhaarAddressTO.getString(R.string.please_select_current_district);
            str = "select_district";
        } else {
            Object selectedItem = aadhaarAddressTO.p1().f25143b.getSelectedItem();
            l.d(selectedItem, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.DistictModleItem");
            String obj = aadhaarAddressTO.p1().f25154m.getText().toString();
            Object selectedItem2 = aadhaarAddressTO.p1().f25146e.getSelectedItem();
            l.d(selectedItem2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
            Object selectedItem3 = aadhaarAddressTO.p1().f25163v.getSelectedItem();
            l.d(selectedItem3, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList");
            yh.a aVar = new yh.a(aadhaarAddressTO);
            ni.a p12 = aadhaarAddressTO.p1();
            aVar.f(p12, ((String) ((VahanStateModleSubList) selectedItem2).get(0)).toString(), ((String) ((VahanStateModleSubList) selectedItem3).get(0)).toString(), String.valueOf(((DistictModleItem) selectedItem).getDist_cd()), obj);
            Intent intent = new Intent(aadhaarAddressTO, NomineeAndInsuranceDetailTOBuyer.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, aadhaarAddressTO.U);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, aadhaarAddressTO.V);
            intent.putExtra("off_code", aadhaarAddressTO.r1());
            intent.putExtra(VContant.NEXGEN_isFACELESS, aadhaarAddressTO.S);
            intent.putExtra("RcDetails", aadhaarAddressTO.t1());
            intent.putExtra(VContant.NEXGEN_addahar_name, aadhaarAddressTO.o1());
            intent.putExtra(VContant.NEXGEN_addahar_address, aadhaarAddressTO.n1());
            aadhaarAddressTO.startActivity(intent);
            return;
        }
        Toast.makeText(aadhaarAddressTO, q12.b(str, string), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void B1(AadhaarAddressTO aadhaarAddressTO, View view) {
        l.f(aadhaarAddressTO, "this$0");
        aadhaarAddressTO.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0080, code lost:
        r1 = r1.getDOEkyc();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void C1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO r4, com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle r5) {
        /*
            java.lang.String r0 = "Select State"
            java.lang.String r1 = "this$0"
            cm.l.f(r4, r1)
            android.app.ProgressDialog r1 = r4.s1()
            r1.dismiss()
            com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList r1 = new com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList     // Catch:{ Exception -> 0x00b5 }
            r1.<init>()     // Catch:{ Exception -> 0x00b5 }
            r1.clear()     // Catch:{ Exception -> 0x00b5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00b5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00b5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00b5 }
            r1.add(r0)     // Catch:{ Exception -> 0x00b5 }
            cm.l.c(r5)     // Catch:{ Exception -> 0x00b5 }
            r0 = 0
            r5.add(r0, r1)     // Catch:{ Exception -> 0x00b5 }
            og.b0 r1 = new og.b0     // Catch:{ Exception -> 0x00b5 }
            r1.<init>(r4, r5)     // Catch:{ Exception -> 0x00b5 }
            ni.a r2 = r4.p1()     // Catch:{ Exception -> 0x00b5 }
            android.widget.Spinner r2 = r2.f25146e     // Catch:{ Exception -> 0x00b5 }
            r2.setAdapter(r1)     // Catch:{ Exception -> 0x00b5 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r4.t1()     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r1.getState_cd()     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x008b }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008b }
            int r1 = r4.v1(r1, r5)     // Catch:{ Exception -> 0x008b }
            ni.a r2 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r2 = r2.f25146e     // Catch:{ Exception -> 0x008b }
            r2.setSelection(r1)     // Catch:{ Exception -> 0x008b }
            ni.a r2 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r2 = r2.f25146e     // Catch:{ Exception -> 0x008b }
            r2.setEnabled(r0)     // Catch:{ Exception -> 0x008b }
            og.b0 r2 = new og.b0     // Catch:{ Exception -> 0x008b }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x008b }
            ni.a r3 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r3 = r3.f25163v     // Catch:{ Exception -> 0x008b }
            r3.setAdapter(r2)     // Catch:{ Exception -> 0x008b }
            ni.a r2 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r2 = r2.f25163v     // Catch:{ Exception -> 0x008b }
            r2.setSelection(r1)     // Catch:{ Exception -> 0x008b }
            boolean r1 = r4.S     // Catch:{ Exception -> 0x008b }
            if (r1 != 0) goto L_0x00b9
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r1 = r4.P     // Catch:{ Exception -> 0x008b }
            if (r1 == 0) goto L_0x008d
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r1 = r1.getDOEkyc()     // Catch:{ Exception -> 0x008b }
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r1.getState()     // Catch:{ Exception -> 0x008b }
            goto L_0x008e
        L_0x008b:
            r4 = move-exception
            goto L_0x00b1
        L_0x008d:
            r1 = 0
        L_0x008e:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x008b }
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x008b }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x008b }
            int r5 = r4.w1(r1, r5)     // Catch:{ Exception -> 0x008b }
            ni.a r1 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r1 = r1.f25163v     // Catch:{ Exception -> 0x008b }
            r1.setSelection(r5)     // Catch:{ Exception -> 0x008b }
            ni.a r4 = r4.p1()     // Catch:{ Exception -> 0x008b }
            android.widget.Spinner r4 = r4.f25163v     // Catch:{ Exception -> 0x008b }
            r4.setEnabled(r0)     // Catch:{ Exception -> 0x008b }
            goto L_0x00b9
        L_0x00b1:
            r4.printStackTrace()     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r4 = move-exception
            r4.printStackTrace()
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO.C1(com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO, com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle):void");
    }

    /* access modifiers changed from: private */
    public static final void D1(AadhaarAddressTO aadhaarAddressTO, String str) {
        l.f(aadhaarAddressTO, "this$0");
        aadhaarAddressTO.s1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void E1(AadhaarAddressTO aadhaarAddressTO, DistictModle distictModle) {
        l.f(aadhaarAddressTO, "this$0");
        aadhaarAddressTO.s1().dismiss();
        try {
            DistictModleItem distictModleItem = new DistictModleItem("Select District", 0, "Select District");
            l.c(distictModle);
            distictModle.add(0, distictModleItem);
            aadhaarAddressTO.p1().f25143b.setAdapter(new g(aadhaarAddressTO, distictModle));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(AadhaarAddressTO aadhaarAddressTO, String str) {
        l.f(aadhaarAddressTO, "this$0");
        aadhaarAddressTO.s1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(AadhaarAddressTO aadhaarAddressTO, View view) {
        l.f(aadhaarAddressTO, "this$0");
        Intent intent = new Intent(aadhaarAddressTO, VahanVehicleDetailsService.class);
        intent.putExtra("RC", aadhaarAddressTO.t1().getRc_regn_no());
        intent.putExtra("RcDetails", aadhaarAddressTO.t1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, aadhaarAddressTO.S);
        intent.putExtra(VContant.NEXGEN_addahar_name, aadhaarAddressTO.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, aadhaarAddressTO.n1());
        aadhaarAddressTO.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void z1(AadhaarAddressTO aadhaarAddressTO, View view) {
        l.f(aadhaarAddressTO, "this$0");
        aadhaarAddressTO.finish();
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void I1(ni.a aVar) {
        l.f(aVar, "<set-?>");
        this.G = aVar;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void K1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.T = cVar;
    }

    public final void L1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void M1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void N1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.O = nrvDetails;
    }

    public final void O1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.I = vahanProService;
    }

    public final void P1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void Q1(h hVar) {
        l.f(hVar, "<set-?>");
        this.H = hVar;
    }

    public final String n1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0275, code lost:
        if (r0 != null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x019c, code lost:
        r0 = r0.getDOEkyc();
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x026b A[SYNTHETIC, Splitter:B:68:0x026b] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0291 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0292 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x02a6 A[Catch:{ Exception -> 0x01a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02af A[Catch:{ Exception -> 0x01a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            android.view.LayoutInflater r5 = r4.getLayoutInflater()
            ni.a r5 = ni.a.c(r5)
            java.lang.String r0 = "inflate(...)"
            cm.l.e(r5, r0)
            r4.I1(r5)
            ni.a r5 = r4.p1()
            android.widget.ScrollView r5 = r5.b()
            r4.setContentView((android.view.View) r5)
            ld.c r5 = new ld.c
            r5.<init>(r4)
            r4.K1(r5)
            ld.h r5 = new ld.h
            r5.<init>(r4)
            boolean r5 = r5.b()
            if (r5 == 0) goto L_0x003e
            ni.a r5 = r4.p1()
            ni.kb r5 = r5.B
            android.widget.LinearLayout r5 = r5.f27162e
            r0 = 1077936128(0x40400000, float:3.0)
            r5.setWeightSum(r0)
        L_0x003e:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r5 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion
            boolean r0 = r4.S
            ni.a r1 = r4.p1()
            ni.kb r1 = r1.B
            android.widget.LinearLayout r1 = r1.f27159b
            java.lang.String r2 = "appMent"
            cm.l.e(r1, r2)
            r5.J(r0, r1)
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r5 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r5 = r5.b(r4)
            r4.O1(r5)
            android.app.ProgressDialog r5 = new android.app.ProgressDialog
            r5.<init>(r4)
            r4.M1(r5)
            android.app.ProgressDialog r5 = r4.s1()
            ld.c r0 = r4.q1()
            r1 = 2132018281(0x7f140469, float:1.9674864E38)
            java.lang.String r1 = r4.getString(r1)
            java.lang.String r2 = "label_challan_please_wait"
            java.lang.String r0 = r0.b(r2, r1)
            r5.setMessage(r0)
            android.app.ProgressDialog r5 = r4.s1()
            r0 = 0
            r5.setCancelable(r0)
            android.app.ProgressDialog r5 = r4.s1()
            r5.setCanceledOnTouchOutside(r0)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "stateCd"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.P1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "off_code"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.L1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "aadhaarName"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.H1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "aadhaarAddress"
            java.lang.String r5 = r5.getStringExtra(r1)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r4.G1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "RcDetails"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r5, r1)
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r5 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r5
            r4.N1(r5)
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "AadhaarDetails"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r5 = (com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse) r5
            r4.P = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "Face_Less_Staus"
            boolean r5 = r5.getBooleanExtra(r1, r0)
            r4.S = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "MULTIDRAFT"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO"
            cm.l.d(r5, r1)
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO r5 = (com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO) r5
            r4.V = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r1 = "MULTIARRAY"
            java.io.Serializable r5 = r5.getSerializableExtra(r1)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.U = r5
            ni.a r5 = r4.p1()
            ni.qd r5 = r5.F
            android.widget.TextView r5 = r5.f28308i
            ld.c r1 = r4.q1()
            java.lang.String r2 = "toBuyerHeader"
            java.lang.String r3 = "Transfer of Ownership \n(Buyer)"
            java.lang.String r1 = r1.b(r2, r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r5.setText(r1)
            ni.a r5 = r4.p1()
            ni.qd r5 = r5.F
            android.widget.TextView r5 = r5.f28304e
            r5.setVisibility(r0)
            ni.a r5 = r4.p1()
            ni.qd r5 = r5.F
            android.widget.TextView r5 = r5.f28304e
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r4.t1()
            java.lang.String r1 = r1.getRc_regn_no()
            r5.setText(r1)
            android.text.SpannableString r5 = new android.text.SpannableString
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r4.t1()
            java.lang.String r1 = r1.getRc_regn_no()
            r5.<init>(r1)
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r2 = r5.length()
            r5.setSpan(r1, r0, r2, r0)
            ni.a r0 = r4.p1()
            ni.qd r0 = r0.F
            android.widget.TextView r0 = r0.f28304e
            r0.setText(r5)
            ni.a r5 = r4.p1()
            ni.qd r5 = r5.F
            android.widget.TextView r5 = r5.f28304e
            dh.a r0 = new dh.a
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.CheckBox r5 = r5.C     // Catch:{ Exception -> 0x01a7 }
            r0 = 8
            r5.setVisibility(r0)     // Catch:{ Exception -> 0x01a7 }
            ka.c$a r5 = ka.c.f13158a     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            r1 = 0
            if (r0 == 0) goto L_0x01aa
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = r0.getHouse()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01ab
        L_0x01a7:
            r5 = move-exception
            goto L_0x02d3
        L_0x01aa:
            r0 = r1
        L_0x01ab:
            boolean r0 = r5.m(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0205
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x01c0
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = r0.getStreet()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01c1
        L_0x01c0:
            r0 = r1
        L_0x01c1:
            boolean r0 = r5.m(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0205
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25156o     // Catch:{ Exception -> 0x01a7 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
            r0.<init>()     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r2 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r2 == 0) goto L_0x01e1
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r2 = r2.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r2 == 0) goto L_0x01e1
            java.lang.String r2 = r2.getHouse()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01e2
        L_0x01e1:
            r2 = r1
        L_0x01e2:
            r0.append(r2)     // Catch:{ Exception -> 0x01a7 }
            r2 = 32
            r0.append(r2)     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r2 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r2 == 0) goto L_0x01f9
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r2 = r2.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r2 == 0) goto L_0x01f9
            java.lang.String r2 = r2.getStreet()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x01fa
        L_0x01f9:
            r2 = r1
        L_0x01fa:
            r0.append(r2)     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01a7 }
        L_0x0201:
            r5.setText(r0)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x025f
        L_0x0205:
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0214
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = r0.getHouse()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0215
        L_0x0214:
            r0 = r1
        L_0x0215:
            boolean r0 = r5.m(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0232
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25156o     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0230
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0230
            java.lang.String r0 = r0.getStreet()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0201
        L_0x0230:
            r0 = r1
            goto L_0x0201
        L_0x0232:
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0241
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = r0.getStreet()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0242
        L_0x0241:
            r0 = r1
        L_0x0242:
            boolean r5 = r5.m(r0)     // Catch:{ Exception -> 0x01a7 }
            if (r5 == 0) goto L_0x025f
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25156o     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x025d
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = r0.getHouse()     // Catch:{ Exception -> 0x01a7 }
            goto L_0x0201
        L_0x025d:
            r0 = r1
            goto L_0x0201
        L_0x025f:
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25164w     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            java.lang.String r2 = " "
            if (r0 == 0) goto L_0x0277
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = r0.getVillageTownCity()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0278
        L_0x0277:
            r0 = r2
        L_0x0278:
            r5.setText(r0)     // Catch:{ Exception -> 0x01a7 }
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25158q     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0293
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x0293
            java.lang.String r0 = r0.getLandMark()     // Catch:{ Exception -> 0x01a7 }
            if (r0 != 0) goto L_0x0292
            goto L_0x0293
        L_0x0292:
            r2 = r0
        L_0x0293:
            r5.setText(r2)     // Catch:{ Exception -> 0x01a7 }
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.TextView r5 = r5.f25155n     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x02af
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x02af
            int r0 = r0.getPincode()     // Catch:{ Exception -> 0x01a7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x02b0
        L_0x02af:
            r0 = r1
        L_0x02b0:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x01a7 }
            r5.setText(r0)     // Catch:{ Exception -> 0x01a7 }
            ni.a r5 = r4.p1()     // Catch:{ Exception -> 0x01a7 }
            android.widget.EditText r5 = r5.f25154m     // Catch:{ Exception -> 0x01a7 }
            com.nic.mparivahan.VahanEkyc.AadharModle.DoAadhaarResponse r0 = r4.P     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x02cb
            com.nic.mparivahan.VahanEkyc.Wrapper.EkycResponse.DOEkyc r0 = r0.getDOEkyc()     // Catch:{ Exception -> 0x01a7 }
            if (r0 == 0) goto L_0x02cb
            java.lang.String r1 = r0.getDist()     // Catch:{ Exception -> 0x01a7 }
        L_0x02cb:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x01a7 }
            r5.setText(r0)     // Catch:{ Exception -> 0x01a7 }
            goto L_0x02d6
        L_0x02d3:
            r5.printStackTrace()
        L_0x02d6:
            androidx.lifecycle.u0 r5 = new androidx.lifecycle.u0
            bi.g r0 = new bi.g
            wg.d r1 = new wg.d
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r2 = r4.u1()
            r1.<init>(r2)
            r0.<init>(r1)
            r5.<init>((androidx.lifecycle.x0) r4, (androidx.lifecycle.u0.b) r0)
            java.lang.Class<bi.h> r0 = bi.h.class
            androidx.lifecycle.t0 r5 = r5.a(r0)
            bi.h r5 = (bi.h) r5
            r4.Q1(r5)
            ni.a r5 = r4.p1()
            ni.qd r5 = r5.F
            androidx.appcompat.widget.AppCompatImageView r5 = r5.f28305f
            dh.b r0 = new dh.b
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            ni.a r5 = r4.p1()
            android.widget.TextView r5 = r5.f25153l
            dh.c r0 = new dh.c
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            ni.a r5 = r4.p1()
            android.widget.TextView r5 = r5.A
            dh.d r0 = new dh.d
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            android.app.ProgressDialog r5 = r4.s1()     // Catch:{ Exception -> 0x032e }
            r5.show()     // Catch:{ Exception -> 0x032e }
            bi.h r5 = r4.x1()     // Catch:{ Exception -> 0x032e }
            r5.V0(r4)     // Catch:{ Exception -> 0x032e }
        L_0x032e:
            ni.a r5 = r4.p1()
            android.widget.Spinner r5 = r5.f25146e
            if (r5 != 0) goto L_0x0337
            goto L_0x033f
        L_0x0337:
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$b r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$b
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
        L_0x033f:
            ni.a r5 = r4.p1()
            android.widget.Spinner r5 = r5.f25163v
            if (r5 != 0) goto L_0x0348
            goto L_0x0350
        L_0x0348:
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$c r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$c
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
        L_0x0350:
            bi.h r5 = r4.x1()
            androidx.lifecycle.a0 r5 = r5.U0()
            dh.e r0 = new dh.e
            r0.<init>(r4)
            r5.g(r4, r0)
            bi.h r5 = r4.x1()
            androidx.lifecycle.a0 r5 = r5.W0()
            dh.f r0 = new dh.f
            r0.<init>(r4)
            r5.g(r4, r0)
            bi.h r5 = r4.x1()
            androidx.lifecycle.a0 r5 = r5.D()
            dh.g r0 = new dh.g
            r0.<init>(r4)
            r5.g(r4, r0)
            bi.h r5 = r4.x1()
            androidx.lifecycle.a0 r5 = r5.E()
            dh.h r0 = new dh.h
            r0.<init>(r4)
            r5.g(r4, r0)
            ni.a r5 = r4.p1()
            android.widget.Spinner r5 = r5.f25143b
            com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$a r0 = new com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO$a
            r0.<init>(r4)
            r5.setOnItemSelectedListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.BuyerView.TOBuyer.AadhaarAddressTO.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final ni.a p1() {
        ni.a aVar = this.G;
        if (aVar != null) {
            return aVar;
        }
        l.v("binding");
        return null;
    }

    public final ld.c q1() {
        ld.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageSession");
        return null;
    }

    public final String r1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final NrvDetails t1() {
        NrvDetails nrvDetails = this.O;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final VahanProService u1() {
        VahanProService vahanProService = this.I;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final int v1(String str, VahanStateModle vahanStateModle) {
        l.f(str, "State_code");
        l.f(vahanStateModle, "list");
        Iterator it = vahanStateModle.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (q.B0(((String) vahanStateModleSubList.get(0)).toString()).toString().equals(str)) {
                return vahanStateModle.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final int w1(String str, VahanStateModle vahanStateModle) {
        l.f(str, "State_code");
        l.f(vahanStateModle, "list");
        Iterator it = vahanStateModle.iterator();
        while (it.hasNext()) {
            VahanStateModleSubList vahanStateModleSubList = (VahanStateModleSubList) it.next();
            if (q.B0(((String) vahanStateModleSubList.get(1)).toString()).toString().equals(str)) {
                return vahanStateModle.indexOf((Object) vahanStateModleSubList);
            }
        }
        return 0;
    }

    public final h x1() {
        h hVar = this.H;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
