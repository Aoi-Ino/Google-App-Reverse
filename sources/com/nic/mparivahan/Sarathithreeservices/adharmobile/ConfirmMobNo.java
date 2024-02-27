package com.nic.mparivahan.sarathithreeservices.adharmobile;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanEkyc.Aadarkyc;
import com.nic.mparivahan.dlservices.data.model.mobupdate.DlUpdateMobResponse;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import ld.f;
import ni.k1;
import nk.d;
import nk.e;
import oi.g;
import pl.x;
import t8.c;

public final class ConfirmMobNo extends g {
    public k1 J;
    public f K;
    public ld.c L;
    public Context M;
    private String N;
    private String O;
    private Aadarkyc.DOEkyc P;
    public DldetobjX Q;
    private vj.a R;
    private String S = "";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ConfirmMobNo f22414e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ConfirmMobNo confirmMobNo) {
            super(1);
            this.f22414e = confirmMobNo;
        }

        public final void b(DlUpdateMobResponse dlUpdateMobResponse) {
            try {
                this.f22414e.B1().I.c(false);
                Integer errno = dlUpdateMobResponse.getErrno();
                if (errno != null) {
                    if (errno.intValue() == 1) {
                        this.f22414e.F1().p("U");
                        this.f22414e.F1().q(q.B0(this.f22414e.B1().D.getText().toString()).toString());
                        ConfirmMobNo confirmMobNo = this.f22414e;
                        confirmMobNo.M1(confirmMobNo, String.valueOf(dlUpdateMobResponse.getErrmsg()));
                        return;
                    }
                }
                String errmsg = dlUpdateMobResponse.getErrmsg();
                if (errmsg != null) {
                    this.f22414e.L1(errmsg);
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlUpdateMobResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ConfirmMobNo f22415e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ConfirmMobNo confirmMobNo) {
            super(1);
            this.f22415e = confirmMobNo;
        }

        public final void b(String str) {
            cm.l.f(str, "it");
            this.f22415e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22416a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f22416a = lVar;
        }

        public final pl.c a() {
            return this.f22416a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22416a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public static final void G1(ConfirmMobNo confirmMobNo, View view) {
        cm.l.f(confirmMobNo, "this$0");
        confirmMobNo.finish();
    }

    /* access modifiers changed from: private */
    public static final void H1(ConfirmMobNo confirmMobNo, View view) {
        String str;
        vj.a aVar;
        Context E1;
        ld.c D1;
        String str2;
        String string;
        Context context;
        String b10;
        Context E12;
        ld.c D12;
        String string2;
        ld.c D13;
        cm.l.f(confirmMobNo, "this$0");
        if (confirmMobNo.B1().D.getText().toString().length() > 8) {
            str = confirmMobNo.B1().D.getText().toString().substring(confirmMobNo.B1().D.getText().toString().length() - 4, confirmMobNo.B1().D.getText().toString().length());
            cm.l.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        Log.d("lastFourEnterNo", confirmMobNo.S + 10 + str);
        Log.d("lastFourEnterNo____", confirmMobNo.B1().D.getText() + 10 + q.B0(confirmMobNo.B1().f27069y.getText().toString()).toString());
        try {
            Editable text = confirmMobNo.B1().D.getText();
            cm.l.c(text);
            if (text.length() == 0) {
                context = confirmMobNo.E1();
                D13 = confirmMobNo.D1();
            } else {
                Editable text2 = confirmMobNo.B1().D.getText();
                cm.l.c(text2);
                if (text2.length() < 10) {
                    E12 = confirmMobNo.E1();
                    D12 = confirmMobNo.D1();
                    string2 = confirmMobNo.getString(R.string.enter_mobile_no);
                } else {
                    c.a aVar2 = t8.c.f16582a;
                    if (!aVar2.q(confirmMobNo.B1().D.getText().toString())) {
                        E12 = confirmMobNo.E1();
                        D12 = confirmMobNo.D1();
                        string2 = confirmMobNo.getString(R.string.enter_mobile_no);
                    } else {
                        Editable text3 = confirmMobNo.B1().f27069y.getText();
                        cm.l.c(text3);
                        if (text3.length() == 0) {
                            context = confirmMobNo.E1();
                            D13 = confirmMobNo.D1();
                        } else {
                            Editable text4 = confirmMobNo.B1().f27069y.getText();
                            cm.l.c(text4);
                            if (text4.length() < 10) {
                                E12 = confirmMobNo.E1();
                                D12 = confirmMobNo.D1();
                                string2 = confirmMobNo.getString(R.string.enter_mobile_no);
                            } else if (!aVar2.q(confirmMobNo.B1().f27069y.getText().toString())) {
                                E12 = confirmMobNo.E1();
                                D12 = confirmMobNo.D1();
                                string2 = confirmMobNo.getString(R.string.enter_mobile_no);
                            } else {
                                if (!cm.l.a(q.B0(confirmMobNo.B1().D.getText().toString()).toString(), q.B0(confirmMobNo.B1().f27069y.getText().toString()).toString())) {
                                    E1 = confirmMobNo.E1();
                                    D1 = confirmMobNo.D1();
                                    str2 = "same_mobile_number";
                                    string = confirmMobNo.getString(R.string.same_mobile_number);
                                } else {
                                    Aadarkyc.DOEkyc dOEkyc = confirmMobNo.P;
                                    if (dOEkyc == null) {
                                        cm.l.v("aadharData");
                                        dOEkyc = null;
                                    }
                                    if (dOEkyc.getPhone() != 0 || cm.l.a(str, confirmMobNo.S)) {
                                        Editable text5 = confirmMobNo.B1().H.getText();
                                        cm.l.c(text5);
                                        if (text5.length() == 0) {
                                            E1 = confirmMobNo.E1();
                                            D1 = confirmMobNo.D1();
                                            str2 = "label_dl_serv_enter_reas_manul";
                                            string = confirmMobNo.getString(R.string.enter_Reason);
                                        } else {
                                            confirmMobNo.B1().I.c(true);
                                            String obj = q.B0(confirmMobNo.B1().D.getText().toString()).toString();
                                            vj.a aVar3 = confirmMobNo.R;
                                            if (aVar3 == null) {
                                                cm.l.v("updateMobVm");
                                                aVar = null;
                                            } else {
                                                aVar = aVar3;
                                            }
                                            String bioDob = confirmMobNo.C1().getBioObj().getBioDob();
                                            cm.l.c(bioDob);
                                            String A1 = confirmMobNo.A1(bioDob);
                                            String str3 = confirmMobNo.N;
                                            cm.l.c(str3);
                                            aVar.k(A1, "DL", "0", true, str3, obj);
                                            StringBuilder sb2 = new StringBuilder();
                                            String bioDob2 = confirmMobNo.C1().getBioObj().getBioDob();
                                            cm.l.c(bioDob2);
                                            sb2.append(bioDob2);
                                            sb2.append(10);
                                            String str4 = confirmMobNo.N;
                                            cm.l.c(str4);
                                            sb2.append(str4);
                                            sb2.append(10);
                                            sb2.append(obj);
                                            Log.d("updateMobile", sb2.toString());
                                            return;
                                        }
                                    } else {
                                        E1 = confirmMobNo.E1();
                                        D1 = confirmMobNo.D1();
                                        str2 = "adhar_same_mobile_number";
                                        string = confirmMobNo.getString(R.string.same_mobile_no);
                                    }
                                }
                                b10 = D1.b(str2, string);
                                confirmMobNo.J1(context, b10);
                            }
                        }
                    }
                }
                b10 = D12.b("label_log_entr_vali_mobno", string2);
                confirmMobNo.J1(context, b10);
            }
            b10 = D13.b("label_mb", "Please enter the mobile number");
            confirmMobNo.J1(context, b10);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void I1(ConfirmMobNo confirmMobNo, View view) {
        cm.l.f(confirmMobNo, "this$0");
        confirmMobNo.finish();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N1(ProgressBar progressBar, ConfirmMobNo confirmMobNo, View view) {
        cm.l.f(progressBar, "$pb_otp");
        cm.l.f(confirmMobNo, "this$0");
        progressBar.setVisibility(0);
        if (cm.l.a(confirmMobNo.F1().b(), "204")) {
            Toast.makeText(confirmMobNo.getApplicationContext(), confirmMobNo.D1().b("app_red", "Mobile No. is successfully updated \n App is redirecting to Dashboard"), 1).show();
            Intent intent = new Intent(confirmMobNo, DashBoard.class);
            intent.setFlags(67141632);
            confirmMobNo.startActivity(intent);
        }
        confirmMobNo.finish();
    }

    public final String A1(String str) {
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            String format = simpleDateFormat2.format(parse);
            cm.l.e(format, "format(...)");
            return format;
        } catch (Exception unused) {
            return str;
        }
    }

    public final k1 B1() {
        k1 k1Var = this.J;
        if (k1Var != null) {
            return k1Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final DldetobjX C1() {
        DldetobjX dldetobjX = this.Q;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c D1() {
        ld.c cVar = this.L;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final Context E1() {
        Context context = this.M;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final f F1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void J1(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(D1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(D1().b("btn_ok", "OK"));
        textView.setOnClickListener(new d(dialog));
        dialog.show();
    }

    public final void L1(String str) {
        cm.l.f(str, "message");
        String b10 = D1().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = D1().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        g.n1(this, b10, str, 1, b11, (String) null, new b(this), 16, (Object) null);
    }

    public final void M1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_otp_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pb_otp);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.ProgressBar");
        ProgressBar progressBar = (ProgressBar) findViewById3;
        progressBar.setVisibility(8);
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(D1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(D1().b("btn_ok", "OK"));
        textView.setOnClickListener(new e(progressBar, this));
        dialog.show();
    }

    public final void O1(k1 k1Var) {
        cm.l.f(k1Var, "<set-?>");
        this.J = k1Var;
    }

    public final void P1(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.Q = dldetobjX;
    }

    public final void Q1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.L = cVar;
    }

    public final void R1(Context context) {
        cm.l.f(context, "<set-?>");
        this.M = context;
    }

    public final void S1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k1 x10 = k1.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        O1(x10);
        setContentView(B1().m());
        R1(this);
        Q1(new ld.c(this));
        S1(new f(this));
        B1().S.f25961g.setText(D1().b("label_dl_serv_update_mob", "Update Mobile Number"));
        B1().S.f25959e.setOnClickListener(new nk.a(this));
        try {
            Parcelable parcelableExtra = getIntent().getParcelableExtra("aadharData");
            cm.l.c(parcelableExtra);
            this.P = (Aadarkyc.DOEkyc) parcelableExtra;
            Serializable serializableExtra = getIntent().getSerializableExtra("DLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            P1((DldetobjX) serializableExtra);
            this.O = String.valueOf(getIntent().getStringExtra("dob"));
            this.N = String.valueOf(getIntent().getStringExtra("DL"));
            this.S = String.valueOf(getIntent().getStringExtra("aadhaarLastFourDigitMobileNo"));
        } catch (Exception unused) {
        }
        vj.a aVar = (vj.a) new u0(this).a(vj.a.class);
        this.R = aVar;
        if (aVar == null) {
            cm.l.v("updateMobVm");
            aVar = null;
        }
        aVar.i().g(this, new c(new a(this)));
        B1().I.setOnClickListener(new nk.b(this));
        B1().f27068x.setOnClickListener(new nk.c(this));
    }
}
