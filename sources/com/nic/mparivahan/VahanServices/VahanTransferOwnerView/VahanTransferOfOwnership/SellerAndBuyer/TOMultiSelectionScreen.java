package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import bh.f;
import bh.g;
import bh.h;
import bh.i;
import bh.j;
import bh.k;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiService;
import com.nic.mparivahan.VahanServices.VahanMultiService.a;
import com.nic.mparivahan.VahanServices.VahanMultiService.b;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.AddNomineeDtoX;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.MultiServiceDraftTO;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import ld.c;
import ni.bc;
import sg.e;

public final class TOMultiSelectionScreen extends d implements a {
    public String G;
    public NrvDetails H;
    public bc I;
    public ProgressDialog J;
    private Calendar K = Calendar.getInstance();
    private String L;
    public String M;
    public String N;
    public String O;
    private boolean P;
    public c Q;
    public MultiSelectionViewModel R;
    public MultiService S;
    private final ArrayList T = new ArrayList();
    private String U = "0";
    private int V;
    public e W;

    /* access modifiers changed from: private */
    public static final void A1(TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        l.f(tOMultiSelectionScreen, "this$0");
        Intent intent = new Intent(tOMultiSelectionScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", tOMultiSelectionScreen.v1());
        intent.putExtra("RcDetails", tOMultiSelectionScreen.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, tOMultiSelectionScreen.P);
        intent.putExtra(VContant.NEXGEN_addahar_name, tOMultiSelectionScreen.q1());
        intent.putExtra(VContant.NEXGEN_addahar_address, tOMultiSelectionScreen.p1());
        tOMultiSelectionScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void B1(TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        TOMultiSelectionScreen tOMultiSelectionScreen2 = tOMultiSelectionScreen;
        l.f(tOMultiSelectionScreen2, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            int size = tOMultiSelectionScreen2.T.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((ServiceList) tOMultiSelectionScreen2.T.get(i10)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) tOMultiSelectionScreen2.T.get(i10)).getPurposeCode()));
                }
            }
            if (arrayList.size() > 0) {
                if (tOMultiSelectionScreen.w1().getVTHypthEntity() != null) {
                    if (!arrayList.contains(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE)) {
                        if (arrayList.contains(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE)) {
                        }
                    }
                    int parseInt = Integer.parseInt(tOMultiSelectionScreen.t1());
                    VContant.Companion companion = VContant.Companion;
                    MultiServiceDraftTO multiServiceDraftTO = new MultiServiceDraftTO("", "", (ii.a) null, "", (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, (HptDto) null, parseInt, (String) null, companion.j(arrayList), tOMultiSelectionScreen.v1(), tOMultiSelectionScreen.w1().getState_cd(), "", (TransferOwnershipDto) null, (AddNomineeDtoX) null);
                    Intent intent = new Intent();
                    String str = VContant.NEXGEN_addahar_address;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.");
                    Object obj = arrayList.get(0);
                    l.e(obj, "get(...)");
                    sb2.append(companion.q((String) obj, "S"));
                    intent.setClass(tOMultiSelectionScreen2, Class.forName(sb2.toString()));
                    intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                    intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO);
                    intent.putExtra("RC", tOMultiSelectionScreen.v1());
                    intent.putExtra("RcDetails", tOMultiSelectionScreen.w1());
                    intent.putExtra("off_code", tOMultiSelectionScreen.t1());
                    intent.putExtra(VContant.NEXGEN_isFACELESS, tOMultiSelectionScreen2.P);
                    intent.putExtra(VContant.NEXGEN_addahar_name, tOMultiSelectionScreen.q1());
                    intent.putExtra(str, tOMultiSelectionScreen.p1());
                    tOMultiSelectionScreen2.startActivity(intent);
                    return;
                }
            }
            String str2 = VContant.NEXGEN_addahar_address;
            if (arrayList.size() <= 0 || tOMultiSelectionScreen.w1().getVTHypthEntity() != null) {
                Toast.makeText(tOMultiSelectionScreen2, "As the Vehicle is Hypothicated Please select either HPT OR HPC", 1).show();
                return;
            }
            int parseInt2 = Integer.parseInt(tOMultiSelectionScreen.t1());
            VContant.Companion companion2 = VContant.Companion;
            MultiServiceDraftTO multiServiceDraftTO2 = new MultiServiceDraftTO("", "", (ii.a) null, "", (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, (HptDto) null, parseInt2, (String) null, companion2.j(arrayList), tOMultiSelectionScreen.v1(), tOMultiSelectionScreen.w1().getState_cd(), "", (TransferOwnershipDto) null, (AddNomineeDtoX) null);
            Intent intent2 = new Intent();
            String str3 = str2;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerView.");
            Object obj2 = arrayList.get(0);
            l.e(obj2, "get(...)");
            sb3.append(companion2.q((String) obj2, "S"));
            intent2.setClass(tOMultiSelectionScreen2, Class.forName(sb3.toString()));
            intent2.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
            intent2.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraftTO2);
            intent2.putExtra("RC", tOMultiSelectionScreen.v1());
            intent2.putExtra("RcDetails", tOMultiSelectionScreen.w1());
            intent2.putExtra("off_code", tOMultiSelectionScreen.t1());
            intent2.putExtra(VContant.NEXGEN_isFACELESS, tOMultiSelectionScreen2.P);
            intent2.putExtra(VContant.NEXGEN_addahar_name, tOMultiSelectionScreen.q1());
            intent2.putExtra(str3, tOMultiSelectionScreen.p1());
            tOMultiSelectionScreen2.startActivity(intent2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void C1(TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        l.f(tOMultiSelectionScreen, "this$0");
        tOMultiSelectionScreen.T.clear();
        tOMultiSelectionScreen.z1();
        tOMultiSelectionScreen.y1().j();
    }

    /* access modifiers changed from: private */
    public static final void D1(TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        l.f(tOMultiSelectionScreen, "this$0");
        tOMultiSelectionScreen.m1(tOMultiSelectionScreen, tOMultiSelectionScreen.s1().b("are_you_sure_you_want_to_leave", tOMultiSelectionScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void E1(TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        l.f(tOMultiSelectionScreen, "this$0");
        tOMultiSelectionScreen.F1();
    }

    private final void F1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void n1(Dialog dialog, TOMultiSelectionScreen tOMultiSelectionScreen, View view) {
        l.f(dialog, "$d");
        l.f(tOMultiSelectionScreen, "this$0");
        dialog.dismiss();
        tOMultiSelectionScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void o1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void G0() {
        z1();
        P1(new e(this.T, this, this));
        r1().f25562g.setAdapter(y1());
    }

    public final void G1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void I1(bc bcVar) {
        l.f(bcVar, "<set-?>");
        this.I = bcVar;
    }

    public final void J1(c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void K1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void L1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void N1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void O1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.S = multiService;
    }

    public final void P1(e eVar) {
        l.f(eVar, "<set-?>");
        this.W = eVar;
    }

    public void Q(String str, int i10) {
        l.c(str);
        this.U = str;
        this.V = i10;
        ArrayList arrayList = new ArrayList();
        if (this.T.size() > 0) {
            int size = this.T.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (((ServiceList) this.T.get(i11)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) this.T.get(i11)).getPurposeCode()));
                }
            }
            if (arrayList.size() == 0) {
                arrayList.add(this.U);
            }
            arrayList.add(this.U);
            HashSet hashSet = new HashSet(arrayList);
            arrayList.clear();
            arrayList.addAll(hashSet);
        } else {
            arrayList.add(this.U);
        }
        int indexOf = this.T.indexOf(new ServiceList(Integer.parseInt(this.U), false));
        ServiceList serviceList = new ServiceList(Integer.parseInt(this.U), true);
        this.T.remove(indexOf);
        this.T.add(indexOf, serviceList);
        y1().j();
    }

    public final void Q1(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.R = multiSelectionViewModel;
    }

    public void Z(String str, int i10) {
        l.c(str);
        this.T.set(this.T.indexOf(new ServiceList(Integer.parseInt(str), true)), new ServiceList(Integer.parseInt(str), false));
        y1().j();
    }

    public final void m1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new j(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new k(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        m1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.multiservicelayout);
        bc c10 = bc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        I1(c10);
        setContentView((View) r1().b());
        J1(new c(this));
        O1(MultiService.f21070a.b(this));
        Q1((MultiSelectionViewModel) new u0((x0) this, (u0.b) new com.nic.mparivahan.VahanServices.VahanMultiService.d(new b(x1()))).a(MultiSelectionViewModel.class));
        L1(new ProgressDialog(this));
        u1().setMessage("Please wait...");
        u1().setCancelable(false);
        u1().setCanceledOnTouchOutside(false);
        M1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        N1((NrvDetails) serializableExtra);
        K1(String.valueOf(getIntent().getStringExtra("off_code")));
        H1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        G1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.P = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        J1(new c(this));
        this.L = w1().getState_cd();
        r1().f25561f.f28304e.setVisibility(0);
        SpannableString spannableString = new SpannableString(v1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString("Transfer of Ownership \n(Seller)");
        spannableString2.setSpan(new UnderlineSpan(), 0, spannableString2.length(), 0);
        r1().f25561f.f28308i.setText(String.valueOf(s1().b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        r1().f25561f.f28304e.setText(spannableString);
        r1().f25562g.setLayoutManager(new GridLayoutManager(this, 3));
        r1().f25561f.f28304e.setOnClickListener(new bh.e(this));
        G0();
        r1().f25559d.setOnClickListener(new f(this));
        r1().f25558c.setOnClickListener(new g(this));
        r1().f25561f.f28305f.setOnClickListener(new h(this));
        r1().f25561f.f28306g.setOnClickListener(new i(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        m1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final String p1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String q1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final bc r1() {
        bc bcVar = this.I;
        if (bcVar != null) {
            return bcVar;
        }
        l.v("binding");
        return null;
    }

    public final c s1() {
        c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String t1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog u1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String v1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final MultiService x1() {
        MultiService multiService = this.S;
        if (multiService != null) {
            return multiService;
        }
        l.v("retrofitService");
        return null;
    }

    public final e y1() {
        e eVar = this.W;
        if (eVar != null) {
            return eVar;
        }
        l.v("selectionAdapter");
        return null;
    }

    public final void z1() {
        this.T.add(new ServiceList(Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE), true));
        if (w1().getVTHypthEntity() != null) {
            Log.e("rcdetails", String.valueOf(w1().getVTHypthEntity()));
            return;
        }
        Log.e("rcdetails", String.valueOf(w1().getVTHypthEntity()));
        this.T.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.T.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
    }
}
