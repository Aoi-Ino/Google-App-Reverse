package com.nic.mparivahan.VahanServices.VahanMultiService;

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
import androidx.appcompat.app.d;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.GridLayoutManager;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ApiMessage;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.ChanngeOfAdressDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HpaDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.HptDto;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectRequest;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.MultiSelectionResp;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.ServiceList;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.SellerModel.TransferOwnershipDto;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import ld.c;
import ni.bc;
import pg.g;
import v9.e;

public final class VahanMultiSelectionScreen extends d implements a {
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
    public sg.c W;

    /* access modifiers changed from: private */
    public static final void G1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(vahanMultiSelectionScreen, "this$0");
        Intent intent = new Intent(vahanMultiSelectionScreen, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanMultiSelectionScreen.A1());
        intent.putExtra("RcDetails", vahanMultiSelectionScreen.B1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanMultiSelectionScreen.P);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanMultiSelectionScreen.u1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanMultiSelectionScreen.t1());
        vahanMultiSelectionScreen.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(vahanMultiSelectionScreen, "this$0");
        try {
            g.f30363a.e(vahanMultiSelectionScreen, vahanMultiSelectionScreen.v1(vahanMultiSelectionScreen.T));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(VahanMultiSelectionScreen vahanMultiSelectionScreen, MultiSelectionResp multiSelectionResp) {
        l.f(vahanMultiSelectionScreen, "this$0");
        vahanMultiSelectionScreen.z1().dismiss();
        ApiMessage apiMessage = multiSelectionResp.getApiMessage();
        if (apiMessage == null || apiMessage.getStatusCode() != 200) {
            ApiMessage apiMessage2 = multiSelectionResp.getApiMessage();
            vahanMultiSelectionScreen.b2(vahanMultiSelectionScreen, apiMessage2 != null ? apiMessage2.getDeveloperMessage() : null);
        } else if (vahanMultiSelectionScreen.T.size() > 0) {
            try {
                int indexOf = vahanMultiSelectionScreen.T.indexOf(new ServiceList(Integer.parseInt(vahanMultiSelectionScreen.U), false));
                ServiceList serviceList = new ServiceList(Integer.parseInt(vahanMultiSelectionScreen.U), true);
                vahanMultiSelectionScreen.T.remove(indexOf);
                vahanMultiSelectionScreen.T.add(indexOf, serviceList);
                vahanMultiSelectionScreen.D1().j();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(VahanMultiSelectionScreen vahanMultiSelectionScreen, String str) {
        l.f(vahanMultiSelectionScreen, "this$0");
        vahanMultiSelectionScreen.z1().dismiss();
        if (!p.o(str, "Error", true)) {
            str = "Unable to select the service, Try try after sometime!";
        }
        vahanMultiSelectionScreen.b2(vahanMultiSelectionScreen, str);
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        Class<?> cls;
        VahanMultiSelectionScreen vahanMultiSelectionScreen2 = vahanMultiSelectionScreen;
        l.f(vahanMultiSelectionScreen2, "this$0");
        try {
            ArrayList arrayList = new ArrayList();
            int size = vahanMultiSelectionScreen2.T.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((ServiceList) vahanMultiSelectionScreen2.T.get(i10)).getSelectService()) {
                    arrayList.add(String.valueOf(((ServiceList) vahanMultiSelectionScreen2.T.get(i10)).getPurposeCode()));
                }
            }
            if (arrayList.size() > 0) {
                HashSet hashSet = new HashSet(arrayList);
                arrayList.clear();
                arrayList.addAll(hashSet);
                Log.e("Test", vahanMultiSelectionScreen.y1().toString());
                int parseInt = Integer.parseInt(vahanMultiSelectionScreen.y1());
                VContant.Companion companion = VContant.Companion;
                MultiServiceDraft multiServiceDraft = new MultiServiceDraft("", (ChanngeOfAdressDto) null, (Durcdto) null, (HpaDto) null, (HptDto) null, parseInt, (String) null, companion.j(arrayList), vahanMultiSelectionScreen.A1(), vahanMultiSelectionScreen.B1().getState_cd(), (TransferOwnershipDto) null);
                Intent intent = new Intent();
                if (((String) arrayList.get(0)).equals(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.TranferofOwnerShip.");
                    Object obj = arrayList.get(0);
                    l.e(obj, "get(...)");
                    sb2.append(companion.p((String) obj));
                    cls = Class.forName(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.");
                    Object obj2 = arrayList.get(0);
                    l.e(obj2, "get(...)");
                    sb3.append(companion.p((String) obj2));
                    cls = Class.forName(sb3.toString());
                }
                intent.setClass(vahanMultiSelectionScreen2, cls);
                intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, arrayList);
                intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, multiServiceDraft);
                intent.putExtra("RC", vahanMultiSelectionScreen.A1());
                intent.putExtra("RcDetails", vahanMultiSelectionScreen.B1());
                intent.putExtra("off_code", vahanMultiSelectionScreen.y1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, vahanMultiSelectionScreen2.P);
                intent.putExtra(VContant.NEXGEN_addahar_name, vahanMultiSelectionScreen.u1());
                intent.putExtra(VContant.NEXGEN_addahar_address, vahanMultiSelectionScreen.t1());
                vahanMultiSelectionScreen2.startActivity(intent);
                return;
            }
            Log.e("test", "Not working ...");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(vahanMultiSelectionScreen, "this$0");
        vahanMultiSelectionScreen.T.clear();
        vahanMultiSelectionScreen.F1();
        vahanMultiSelectionScreen.D1().j();
    }

    /* access modifiers changed from: private */
    public static final void M1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(vahanMultiSelectionScreen, "this$0");
        vahanMultiSelectionScreen.q1(vahanMultiSelectionScreen, vahanMultiSelectionScreen.x1().b("are_you_sure_you_want_to_leave", vahanMultiSelectionScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(vahanMultiSelectionScreen, "this$0");
        vahanMultiSelectionScreen.O1();
    }

    private final void O1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void s1(Dialog dialog, VahanMultiSelectionScreen vahanMultiSelectionScreen, View view) {
        l.f(dialog, "$d");
        l.f(vahanMultiSelectionScreen, "this$0");
        dialog.dismiss();
        vahanMultiSelectionScreen.finish();
    }

    public final String A1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails B1() {
        NrvDetails nrvDetails = this.H;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final MultiService C1() {
        MultiService multiService = this.S;
        if (multiService != null) {
            return multiService;
        }
        l.v("retrofitService");
        return null;
    }

    public final sg.c D1() {
        sg.c cVar = this.W;
        if (cVar != null) {
            return cVar;
        }
        l.v("selectionAdapter");
        return null;
    }

    public final MultiSelectionViewModel E1() {
        MultiSelectionViewModel multiSelectionViewModel = this.R;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        l.v("viewModel");
        return null;
    }

    public final void F1() {
        this.T.add(new ServiceList(Integer.parseInt(VContant.DUPLICATE_RC_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE), false));
        this.T.add(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        if (B1().getVTHypthEntity() == null) {
            this.T.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE), false));
            this.T.remove(new ServiceList(Integer.parseInt(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE), false));
        }
    }

    public final void G0() {
        F1();
        Z1(new sg.c(this.T, this, this));
        w1().f25562g.setAdapter(D1());
    }

    public final void P1(NrvDetails nrvDetails, ArrayList arrayList) {
        l.f(nrvDetails, "rcdetails");
        l.f(arrayList, "selectedPurCodeList");
        if (arrayList.size() > 0) {
            String rc_off_cd = nrvDetails.getRc_off_cd();
            MultiSelectRequest multiSelectRequest = new MultiSelectRequest("", rc_off_cd != null ? Integer.parseInt(rc_off_cd) : 0, "", arrayList, String.valueOf(nrvDetails.getRc_regn_no()), String.valueOf(nrvDetails.getState_cd()));
            z1().show();
            E1().u(multiSelectRequest);
        }
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
        P1(B1(), arrayList);
    }

    public final void Q1(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void R1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void S1(bc bcVar) {
        l.f(bcVar, "<set-?>");
        this.I = bcVar;
    }

    public final void T1(c cVar) {
        l.f(cVar, "<set-?>");
        this.Q = cVar;
    }

    public final void U1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void V1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.J = progressDialog;
    }

    public final void W1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    public final void X1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.H = nrvDetails;
    }

    public final void Y1(MultiService multiService) {
        l.f(multiService, "<set-?>");
        this.S = multiService;
    }

    public void Z(String str, int i10) {
        l.c(str);
        this.T.set(this.T.indexOf(new ServiceList(Integer.parseInt(str), true)), new ServiceList(Integer.parseInt(str), false));
        D1().j();
    }

    public final void Z1(sg.c cVar) {
        l.f(cVar, "<set-?>");
        this.W = cVar;
    }

    public final void a2(MultiSelectionViewModel multiSelectionViewModel) {
        l.f(multiSelectionViewModel, "<set-?>");
        this.R = multiSelectionViewModel;
    }

    public final void b2(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        c cVar = new c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new a0(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        q1(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.multiservicelayout);
        bc c10 = bc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        S1(c10);
        setContentView((View) w1().b());
        T1(new c(this));
        Y1(MultiService.f21070a.b(this));
        a2((MultiSelectionViewModel) new u0((x0) this, (u0.b) new d(new b(C1()))).a(MultiSelectionViewModel.class));
        V1(new ProgressDialog(this));
        z1().setMessage("Please wait...");
        z1().setCancelable(false);
        z1().setCanceledOnTouchOutside(false);
        W1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        X1((NrvDetails) serializableExtra);
        U1(String.valueOf(getIntent().getStringExtra("off_code")));
        R1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        Q1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        this.P = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        T1(new c(this));
        this.L = B1().getState_cd();
        w1().f25561f.f28304e.setVisibility(0);
        SpannableString spannableString = new SpannableString(A1());
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        e.f17509a.q2(this, w1());
        w1().f25561f.f28304e.setText(spannableString);
        w1().f25562g.setLayoutManager(new GridLayoutManager(this, 3));
        w1().f25561f.f28304e.setOnClickListener(new z(this));
        w1().f25561f.f28308i.setOnClickListener(new b0(this));
        G0();
        E1().n().g(this, new c0(this));
        E1().o().g(this, new d0(this));
        w1().f25559d.setOnClickListener(new e0(this));
        w1().f25558c.setOnClickListener(new f0(this));
        w1().f25561f.f28305f.setOnClickListener(new g0(this));
        w1().f25561f.f28306g.setOnClickListener(new h0(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        q1(this, x1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    public final void q1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new i0(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new j0(dialog));
        dialog.show();
    }

    public final String t1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String u1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public final ArrayList v1(ArrayList arrayList) {
        l.f(arrayList, "serviceListArray");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(String.valueOf(((ServiceList) arrayList.get(i10)).getPurposeCode()));
            }
        }
        return arrayList2;
    }

    public final bc w1() {
        bc bcVar = this.I;
        if (bcVar != null) {
            return bcVar;
        }
        l.v("binding");
        return null;
    }

    public final c x1() {
        c cVar = this.Q;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String y1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("off_code");
        return null;
    }

    public final ProgressDialog z1() {
        ProgressDialog progressDialog = this.J;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }
}
