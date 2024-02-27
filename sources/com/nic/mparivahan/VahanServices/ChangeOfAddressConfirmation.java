package com.nic.mparivahan.VahanServices;

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
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.SaveVahanlog;
import com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import java.io.Serializable;
import ld.c;
import ni.f0;
import v9.e;
import wd.b;
import wd.f;

public final class ChangeOfAddressConfirmation extends d {
    public f0 G;
    public String H;
    public ChaangeOfAddressStatus I;
    public String J;
    public String K;
    public String L;
    public String M;
    private boolean N;
    public c O;
    public String P;
    public String Q;
    public NrvDetails R;

    /* access modifiers changed from: private */
    public static final void A1(ChangeOfAddressConfirmation changeOfAddressConfirmation, View view) {
        l.f(changeOfAddressConfirmation, "this$0");
        Intent intent = new Intent(changeOfAddressConfirmation, FeesDetailsScreen.class);
        intent.putExtra(VContant.NEXGEN_INTENT_CODE, VContant.CHANGE_OF_ADDRESS_CODE);
        intent.putExtra(VContant.APP_NO, changeOfAddressConfirmation.p1());
        intent.putExtra("state_code", changeOfAddressConfirmation.x1());
        intent.putExtra("rc_number", changeOfAddressConfirmation.v1());
        intent.putExtra(VContant.PURPOSE_CODE, changeOfAddressConfirmation.u1());
        intent.putExtra("COV", changeOfAddressConfirmation.r1());
        intent.putExtra("off_code", changeOfAddressConfirmation.t1());
        intent.putExtra(VContant.SERVICE_NAME, "Change of Address in RC");
        intent.putExtra(VContant.NEXGEN_isFACELESS, changeOfAddressConfirmation.N);
        intent.putExtra("RC", changeOfAddressConfirmation.v1());
        intent.putExtra("RcDetails", changeOfAddressConfirmation.w1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, changeOfAddressConfirmation.N);
        intent.putExtra(VContant.NEXGEN_addahar_name, changeOfAddressConfirmation.o1());
        intent.putExtra(VContant.NEXGEN_addahar_address, changeOfAddressConfirmation.n1());
        changeOfAddressConfirmation.startActivity(intent);
        changeOfAddressConfirmation.finish();
    }

    private final void B1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void l1(Dialog dialog, ChangeOfAddressConfirmation changeOfAddressConfirmation, View view) {
        l.f(dialog, "$d");
        l.f(changeOfAddressConfirmation, "this$0");
        dialog.dismiss();
        changeOfAddressConfirmation.finish();
    }

    /* access modifiers changed from: private */
    public static final void m1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void y1(ChangeOfAddressConfirmation changeOfAddressConfirmation, View view) {
        l.f(changeOfAddressConfirmation, "this$0");
        changeOfAddressConfirmation.k1(changeOfAddressConfirmation, changeOfAddressConfirmation.s1().b("are_you_sure_you_want_to_leave", changeOfAddressConfirmation.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void z1(ChangeOfAddressConfirmation changeOfAddressConfirmation, View view) {
        l.f(changeOfAddressConfirmation, "this$0");
        changeOfAddressConfirmation.B1();
    }

    public final void C1(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final void D1(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void E1(String str) {
        l.f(str, "<set-?>");
        this.H = str;
    }

    public final void F1(f0 f0Var) {
        l.f(f0Var, "<set-?>");
        this.G = f0Var;
    }

    public final void G1(ChaangeOfAddressStatus chaangeOfAddressStatus) {
        l.f(chaangeOfAddressStatus, "<set-?>");
        this.I = chaangeOfAddressStatus;
    }

    public final void H1(c cVar) {
        l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void I1(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void J1(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void K1(String str) {
        l.f(str, "<set-?>");
        this.K = str;
    }

    public final void L1(NrvDetails nrvDetails) {
        l.f(nrvDetails, "<set-?>");
        this.R = nrvDetails;
    }

    public final void M1(String str) {
        l.f(str, "<set-?>");
        this.J = str;
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        c cVar = new c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new b(dialog, this));
        textView2.setOnClickListener(new wd.c(dialog));
        dialog.show();
    }

    public final String n1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("aadhar_address");
        return null;
    }

    public final String o1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("aadhar_name");
        return null;
    }

    public void onBackPressed() {
        k1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_change_of_address_confirmation);
        f0 c10 = f0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        F1(c10);
        setContentView((View) q1().b());
        e.f17509a.U(this, q1());
        E1(String.valueOf(getIntent().getStringExtra(VContant.APP_NO)));
        Serializable serializableExtra = getIntent().getSerializableExtra("COV");
        l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.ChaangeOfAddressStatus");
        G1((ChaangeOfAddressStatus) serializableExtra);
        M1(String.valueOf(getIntent().getStringExtra("state_code")));
        K1(String.valueOf(getIntent().getStringExtra("rc_number")));
        J1(String.valueOf(getIntent().getStringExtra(VContant.PURPOSE_CODE)));
        I1(String.valueOf(getIntent().getStringExtra("off_code")));
        this.N = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        D1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        C1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        K1(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        L1((NrvDetails) serializableExtra2);
        H1(new c(this));
        q1().f26173d.f28308i.setText(VContant.Companion.I(this, u1()));
        q1().f26173d.f28305f.setOnClickListener(new wd.d(this));
        q1().f26173d.f28306g.setOnClickListener(new wd.e(this));
        TextView textView = q1().f26171b;
        textView.setText(s1().b("change_of_Address_Confirm", "Application for Change of Address In RC saved successfully in draft with application no.") + ' ' + p1());
        q1().f26172c.setOnClickListener(new f(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        k1(this, s1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
        return true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            SaveVahanlog.a aVar = SaveVahanlog.f20959k;
            NrvDetails w12 = w1();
            boolean z10 = this.N;
            String p12 = p1();
            String u12 = u1();
            String substring = v1().substring(0, 4);
            l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            aVar.a(this, w12, z10, p12, u12, substring);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String p1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        l.v("application");
        return null;
    }

    public final f0 q1() {
        f0 f0Var = this.G;
        if (f0Var != null) {
            return f0Var;
        }
        l.v("binding");
        return null;
    }

    public final ChaangeOfAddressStatus r1() {
        ChaangeOfAddressStatus chaangeOfAddressStatus = this.I;
        if (chaangeOfAddressStatus != null) {
            return chaangeOfAddressStatus;
        }
        l.v("confirm_details");
        return null;
    }

    public final c s1() {
        c cVar = this.O;
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

    public final String u1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String v1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        l.v("rc_number");
        return null;
    }

    public final NrvDetails w1() {
        NrvDetails nrvDetails = this.R;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        l.v("rcdetails");
        return null;
    }

    public final String x1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        l.v("state_code");
        return null;
    }
}
