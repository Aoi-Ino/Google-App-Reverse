package com.nic.mparivahan.VahanServices.VahanMultiService.Confirmation;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.Model.DoorStepReq;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.VahanDoorStep;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft;
import com.nic.mparivahan.VahanServices.VahanMultiService.MultiServiceActivity.MultiServiceFeesDetailsScreen;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.Serializable;
import java.util.ArrayList;
import ld.c;
import ld.g;
import ni.zb;
import qg.a;
import qg.b;
import v9.e;

public final class VahanMultiServiceConfirmationScreen extends d {
    public zb G;
    private boolean H;
    private ArrayList I = new ArrayList();
    private MultiServiceDraft J;
    public String K;
    public String L;
    public NrvDetails M;
    public c N;
    private String O = "M";

    /* access modifiers changed from: private */
    public static final void l1(Dialog dialog, VahanMultiServiceConfirmationScreen vahanMultiServiceConfirmationScreen, View view) {
        l.f(dialog, "$d");
        l.f(vahanMultiServiceConfirmationScreen, "this$0");
        dialog.dismiss();
        vahanMultiServiceConfirmationScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void m1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t1(VahanMultiServiceConfirmationScreen vahanMultiServiceConfirmationScreen, View view) {
        l.f(vahanMultiServiceConfirmationScreen, "this$0");
        vahanMultiServiceConfirmationScreen.k1(vahanMultiServiceConfirmationScreen, "Are you sure you want to leave?");
    }

    /* access modifiers changed from: private */
    public static final void u1(VahanMultiServiceConfirmationScreen vahanMultiServiceConfirmationScreen, View view) {
        l.f(vahanMultiServiceConfirmationScreen, "this$0");
        vahanMultiServiceConfirmationScreen.w1();
    }

    /* access modifiers changed from: private */
    public static final void v1(VahanMultiServiceConfirmationScreen vahanMultiServiceConfirmationScreen, View view) {
        l.f(vahanMultiServiceConfirmationScreen, "this$0");
        try {
            Intent intent = new Intent(vahanMultiServiceConfirmationScreen, MultiServiceFeesDetailsScreen.class);
            intent.putExtra(VContant.MULTI_SELECT_SERVICE_ARRAY, vahanMultiServiceConfirmationScreen.I);
            intent.putExtra(VContant.MULTI_SERVICE_DRAFT_OBJ, vahanMultiServiceConfirmationScreen.J);
            intent.putExtra(VContant.NEXGEN_isFACELESS, vahanMultiServiceConfirmationScreen.H);
            intent.putExtra(VContant.NEXGEN_addahar_name, vahanMultiServiceConfirmationScreen.o1());
            intent.putExtra(VContant.NEXGEN_addahar_address, vahanMultiServiceConfirmationScreen.n1());
            intent.putExtra("RcDetails", vahanMultiServiceConfirmationScreen.s1());
            vahanMultiServiceConfirmationScreen.startActivity(intent);
            vahanMultiServiceConfirmationScreen.finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void w1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final void A1(c cVar) {
        l.f(cVar, "<set-?>");
        this.N = cVar;
    }

    public final void B1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.M = nrvDetails;
    }

    public final void k1(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new a(dialog, this));
        ((TextView) findViewById3).setOnClickListener(new b(dialog));
        dialog.show();
    }

    public final String n1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public void onBackPressed() {
        k1(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        String r12;
        super.onCreate(bundle);
        setContentView((int) R.layout.multiservice_confirmation);
        zb c10 = zb.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        z1(c10);
        setContentView((View) p1().b());
        e.f17509a.p2(this, p1());
        A1(new c(this));
        this.H = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        Serializable serializableExtra = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        B1((NrvDetails) serializableExtra);
        y1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        x1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        Serializable serializableExtra2 = getIntent().getSerializableExtra(VContant.MULTI_SERVICE_DRAFT_OBJ);
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.MultiServiceDraft");
        this.J = (MultiServiceDraft) serializableExtra2;
        this.I = (ArrayList) getIntent().getSerializableExtra(VContant.MULTI_SELECT_SERVICE_ARRAY);
        if (this.H) {
            this.O = "A";
        }
        try {
            g gVar = new g(this);
            MultiServiceDraft multiServiceDraft = this.J;
            l.c(multiServiceDraft);
            String applNo = multiServiceDraft.getApplNo();
            String str = this.O;
            String rc_off_cd = s1().getRc_off_cd();
            l.c(rc_off_cd);
            VahanDoorStep.f20962k.a(this, new DoorStepReq(applNo, str, Integer.parseInt(rc_off_cd), v9.d.f17494a.m(), VContant.Companion.j(this.I), String.valueOf(s1().getRc_regn_no()), String.valueOf(s1().getState_cd()), "DF", Integer.parseInt(gVar.k())));
        } catch (Exception unused) {
        }
        ArrayList arrayList = this.I;
        if (arrayList == null || !arrayList.contains(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE)) {
            textView = p1().f29768d.f28308i;
            r12 = r1(this.I);
        } else {
            textView = p1().f29768d.f28308i;
            r12 = q1().b("toBuyerHeader", "Transfer of Ownership \n(Buyer)");
        }
        textView.setText(r12);
        TextView textView2 = p1().f29766b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Application for ");
        sb2.append(r1(this.I));
        sb2.append(" saved successfully in draft with application no.");
        MultiServiceDraft multiServiceDraft2 = this.J;
        l.c(multiServiceDraft2);
        sb2.append(multiServiceDraft2.getApplNo());
        textView2.setText(sb2.toString());
        uc.a.f17255a.b(p1().f29768d.f28308i.getText().toString(), p1().f29766b.getText().toString(), this);
        p1().f29768d.f28305f.setOnClickListener(new qg.c(this));
        p1().f29768d.f28306g.setOnClickListener(new qg.d(this));
        p1().f29767c.setOnClickListener(new qg.e(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        VUtility.Companion.v(this, q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public final zb p1() {
        zb zbVar = this.G;
        if (zbVar != null) {
            return zbVar;
        }
        l.v("binding");
        return null;
    }

    public final c q1() {
        c cVar = this.N;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final String r1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        l.c(arrayList);
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                l.e(obj, "get(...)");
                arrayList2.add(VContant.Companion.A(this, (String) obj));
            }
        }
        return y.d0(arrayList2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (bm.l) null, 62, (Object) null);
    }

    public final NrvDetails s1() {
        NrvDetails nrvDetails = this.M;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final void x1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void y1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void z1(zb zbVar) {
        l.f(zbVar, "<set-?>");
        this.G = zbVar;
    }
}
