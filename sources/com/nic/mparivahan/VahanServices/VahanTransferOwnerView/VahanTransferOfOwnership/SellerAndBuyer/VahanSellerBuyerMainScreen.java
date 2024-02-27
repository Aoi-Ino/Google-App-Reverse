package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bh.n;
import bh.o;
import bh.p;
import bh.q;
import bh.r;
import bh.s;
import bh.t;
import bh.u;
import bh.v;
import bh.w;
import bh.y;
import bh.z;
import bi.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerBuyerToGenerateOTPScreen;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer.AadhaarOtpValidation.SellerValidationWithAadhaar;
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;
import java.util.ArrayList;
import java.util.HashMap;
import ni.a9;
import og.f0;
import pl.x;
import wd.l0;

public final class VahanSellerBuyerMainScreen extends androidx.appcompat.app.d implements l0 {
    public a9 G;
    public DatabaseHelper H;
    public ArrayList I;
    public f0 J;
    public ProgressDialog K;
    public l L;
    public VahanServiceConnection M;
    public String N;
    public String O;
    private String P = " ";
    private String Q = " ";
    public ld.h R;
    public bi.h S;
    public VahanProService T;
    public NrvDetails U;
    public bi.h V;
    public VahanProService W;
    private HashMap X = new HashMap();
    private String Y = "";
    private String Z = "NA";

    /* renamed from: a0  reason: collision with root package name */
    private String f21400a0 = "0";

    /* renamed from: b0  reason: collision with root package name */
    private String f21401b0 = "NA";

    /* renamed from: c0  reason: collision with root package name */
    public ld.c f21402c0;

    /* renamed from: d0  reason: collision with root package name */
    private ArrayList f21403d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    private String f21404e0 = " ";

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21405e = vahanSellerBuyerMainScreen;
        }

        public final void b(String str) {
            this.f21405e.L1().dismiss();
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen = this.f21405e;
            vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21406e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21406e = vahanSellerBuyerMainScreen;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen;
            String str;
            bi.h V1;
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen2;
            String valueOf;
            String C1;
            String valueOf2;
            String y10;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen3 = this.f21406e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanSellerBuyerMainScreen3.t2(companion.c(ownerDetailPuccPermit));
                        CharSequence charSequence = null;
                        if (cm.l.a(this.f21406e.D1(), "rcnumber")) {
                            String rc_chasi_no = this.f21406e.J1().getRc_chasi_no();
                            if (rc_chasi_no != null) {
                                String rc_chasi_no2 = this.f21406e.J1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no2);
                                String rc_chasi_no3 = this.f21406e.J1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no3);
                                charSequence = rc_chasi_no.subSequence(rc_chasi_no2.length() - 5, rc_chasi_no3.length());
                            }
                            V1 = this.f21406e.V1();
                            vahanSellerBuyerMainScreen2 = this.f21406e;
                            valueOf = String.valueOf(vahanSellerBuyerMainScreen2.J1().getRc_regn_no());
                            C1 = String.valueOf(charSequence);
                            valueOf2 = String.valueOf(this.f21406e.J1().getState_cd());
                            y10 = companion.y(this.f21406e.S1());
                        } else {
                            String rc_chasi_no4 = this.f21406e.J1().getRc_chasi_no();
                            if (rc_chasi_no4 != null) {
                                String rc_chasi_no5 = this.f21406e.J1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no5);
                                String rc_chasi_no6 = this.f21406e.J1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no6);
                                charSequence = rc_chasi_no4.subSequence(rc_chasi_no5.length() - 5, rc_chasi_no6.length());
                            }
                            if (p.o(this.f21406e.C1(), String.valueOf(charSequence), true)) {
                                V1 = this.f21406e.V1();
                                vahanSellerBuyerMainScreen2 = this.f21406e;
                                valueOf = String.valueOf(vahanSellerBuyerMainScreen2.J1().getRc_regn_no());
                                C1 = this.f21406e.C1();
                                valueOf2 = String.valueOf(this.f21406e.J1().getState_cd());
                                y10 = companion.y(this.f21406e.S1());
                            } else {
                                this.f21406e.L1().dismiss();
                                vahanSellerBuyerMainScreen = this.f21406e;
                                str = "Please enter the valid chassis number ";
                                vahanSellerBuyerMainScreen.u1(vahanSellerBuyerMainScreen, str);
                            }
                        }
                        V1.q1(vahanSellerBuyerMainScreen2, valueOf, C1, valueOf2, y10);
                        return;
                    }
                }
                this.f21406e.L1().dismiss();
                vahanSellerBuyerMainScreen = this.f21406e;
                str = "No details found";
                vahanSellerBuyerMainScreen.u1(vahanSellerBuyerMainScreen, str);
            } catch (Exception e10) {
                this.f21406e.L1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21407e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21407e = vahanSellerBuyerMainScreen;
        }

        public final void b(String str) {
            this.f21407e.L1().dismiss();
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen = this.f21407e;
            vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, vahanSellerBuyerMainScreen.F1().b("record_error_msg", this.f21407e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21408e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21408e = vahanSellerBuyerMainScreen;
        }

        public final void b(String str) {
            this.f21408e.L1().dismiss();
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen = this.f21408e;
            vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, vahanSellerBuyerMainScreen.F1().b("record_error_msg", this.f21408e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21409e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21409e = vahanSellerBuyerMainScreen;
        }

        public final void b(GetStateCode getStateCode) {
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen;
            String b10;
            String valueOf;
            bi.h V1;
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen2;
            String stateCd;
            String y10;
            String N1;
            if (getStateCode != null) {
                try {
                    if (!ka.c.f13158a.m(getStateCode.getStateCd())) {
                        if (p.o(this.f21409e.T1(), getStateCode.getStateCd(), true)) {
                            valueOf = String.valueOf(this.f21409e.B1().f25264s.getText());
                            if (valueOf.length() > 0) {
                                V1 = this.f21409e.V1();
                                vahanSellerBuyerMainScreen2 = this.f21409e;
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21409e.S1());
                                N1 = String.valueOf(this.f21409e.B1().f25251f.getText());
                            } else if (this.f21409e.M1().length() > 0) {
                                V1 = this.f21409e.V1();
                                vahanSellerBuyerMainScreen2 = this.f21409e;
                                valueOf = vahanSellerBuyerMainScreen2.M1();
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21409e.S1());
                                N1 = this.f21409e.N1();
                            } else {
                                return;
                            }
                        } else if (p.o(this.f21409e.T1(), "OD", true)) {
                            valueOf = String.valueOf(this.f21409e.B1().f25264s.getText());
                            if (valueOf.length() > 0) {
                                V1 = this.f21409e.V1();
                                vahanSellerBuyerMainScreen2 = this.f21409e;
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21409e.S1());
                                N1 = String.valueOf(this.f21409e.B1().f25251f.getText());
                            } else if (this.f21409e.M1().length() > 0) {
                                V1 = this.f21409e.V1();
                                vahanSellerBuyerMainScreen2 = this.f21409e;
                                valueOf = vahanSellerBuyerMainScreen2.M1();
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21409e.S1());
                                N1 = this.f21409e.N1();
                            } else {
                                return;
                            }
                        } else {
                            this.f21409e.L1().dismiss();
                            vahanSellerBuyerMainScreen = this.f21409e;
                            b10 = this.f21409e.F1().b("validstate", "Please enter valid RC number of ") + ' ' + VContant.Companion.k(this.f21409e.T1()) + ' ' + this.f21409e.F1().b("vahan_state", "State");
                        }
                        V1.A0(vahanSellerBuyerMainScreen2, valueOf, stateCd, y10, N1);
                        return;
                    }
                    this.f21409e.L1().dismiss();
                    vahanSellerBuyerMainScreen = this.f21409e;
                    b10 = vahanSellerBuyerMainScreen.F1().b("record_error_msg", this.f21409e.getString(R.string.service_unavable_please_try));
                    vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, b10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f21409e.L1().dismiss();
                }
            } else {
                this.f21409e.L1().dismiss();
                VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen3 = this.f21409e;
                vahanSellerBuyerMainScreen3.G2(vahanSellerBuyerMainScreen3, vahanSellerBuyerMainScreen3.F1().b("record_error_msg", this.f21409e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStateCode) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21410e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21410e = vahanSellerBuyerMainScreen;
        }

        public final void b(String str) {
            this.f21410e.L1().dismiss();
            if (p.o(str, "Error", true)) {
                VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen = this.f21410e;
                vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, vahanSellerBuyerMainScreen.F1().b("record_error_msg", this.f21410e.getString(R.string.service_unavable_please_try)));
                return;
            }
            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen2 = this.f21410e;
            vahanSellerBuyerMainScreen2.G2(vahanSellerBuyerMainScreen2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanSellerBuyerMainScreen f21411e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen) {
            super(1);
            this.f21411e = vahanSellerBuyerMainScreen;
        }

        public final void b(String str) {
            if (str != null) {
                try {
                    if (p.o(str, "200", true)) {
                        VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen = this.f21411e;
                        vahanSellerBuyerMainScreen.w2(String.valueOf(vahanSellerBuyerMainScreen.J1().getRc_regn_no()));
                        this.f21411e.J1().getRc_chasi_no();
                        if (!ka.c.f13158a.m(this.f21411e.G1())) {
                            VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen2 = this.f21411e;
                            vahanSellerBuyerMainScreen2.r2(vahanSellerBuyerMainScreen2.G1());
                        }
                        VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen3 = this.f21411e;
                        vahanSellerBuyerMainScreen3.u2(String.valueOf(vahanSellerBuyerMainScreen3.J1().getRc_off_cd()));
                        if (VContant.Companion.y(this.f21411e.S1()).equals(VContant.Tax_PURPOSE_CODE)) {
                            this.f21411e.L1().dismiss();
                            Intent intent = new Intent(this.f21411e, VahanGenerateOTPScreen.class);
                            intent.putExtra("RC", this.f21411e.O1());
                            intent.putExtra("map", this.f21411e.R1());
                            intent.putExtra("Mobile_no", this.f21411e.H1());
                            intent.putExtra("RcDetails", this.f21411e.J1());
                            intent.putExtra("off_code", this.f21411e.K1());
                            this.f21411e.startActivity(intent);
                            return;
                        }
                        bi.h X1 = this.f21411e.X1();
                        VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen4 = this.f21411e;
                        X1.i(vahanSellerBuyerMainScreen4, String.valueOf(vahanSellerBuyerMainScreen4.J1().getState_cd()));
                        return;
                    }
                    this.f21411e.L1().dismiss();
                    VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen5 = this.f21411e;
                    vahanSellerBuyerMainScreen5.G2(vahanSellerBuyerMainScreen5, vahanSellerBuyerMainScreen5.F1().b("record_error_msg", this.f21411e.getString(R.string.service_unavable_please_try)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f21411e.L1().dismiss();
                }
            } else {
                this.f21411e.L1().dismiss();
                VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen6 = this.f21411e;
                vahanSellerBuyerMainScreen6.G2(vahanSellerBuyerMainScreen6, vahanSellerBuyerMainScreen6.F1().b("record_error_msg", this.f21411e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21412a;

        h(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21412a = lVar;
        }

        public final pl.c a() {
            return this.f21412a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21412a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, String str) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.L1().dismiss();
        vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, vahanSellerBuyerMainScreen.F1().b("record_error_msg", vahanSellerBuyerMainScreen.getString(R.string.service_unavable_please_try)));
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.k2();
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.B1().f25248c.setBackgroundResource(R.drawable.other_new_shape_grey);
        vahanSellerBuyerMainScreen.B1().f25249d.setBackgroundResource(R.drawable.button_style);
        vahanSellerBuyerMainScreen.B1().f25249d.setTextColor(androidx.core.content.a.c(vahanSellerBuyerMainScreen, R.color.white));
        vahanSellerBuyerMainScreen.B1().f25248c.setTextColor(androidx.core.content.a.c(vahanSellerBuyerMainScreen, R.color.black));
        vahanSellerBuyerMainScreen.B1().f25265t.setVisibility(8);
        vahanSellerBuyerMainScreen.B1().f25256k.setVisibility(0);
        vahanSellerBuyerMainScreen.B1().f25247b.setVisibility(8);
        vahanSellerBuyerMainScreen.B1().f25259n.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.B1().f25248c.setBackgroundResource(R.drawable.button_style);
        vahanSellerBuyerMainScreen.B1().f25249d.setBackgroundResource(R.drawable.other_new_shape_grey);
        vahanSellerBuyerMainScreen.B1().f25248c.setTextColor(androidx.core.content.a.c(vahanSellerBuyerMainScreen, R.color.white));
        vahanSellerBuyerMainScreen.B1().f25249d.setTextColor(androidx.core.content.a.c(vahanSellerBuyerMainScreen, R.color.black));
        vahanSellerBuyerMainScreen.B1().f25265t.setVisibility(0);
        vahanSellerBuyerMainScreen.B1().f25256k.setVisibility(8);
        vahanSellerBuyerMainScreen.B1().f25247b.setVisibility(0);
        vahanSellerBuyerMainScreen.B1().f25259n.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        ld.c F1;
        String str;
        String str2;
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.o2("submit");
        String valueOf = String.valueOf(vahanSellerBuyerMainScreen.B1().f25264s.getText());
        vahanSellerBuyerMainScreen.n2(String.valueOf(vahanSellerBuyerMainScreen.B1().f25251f.getText()));
        if (valueOf.length() < 4) {
            F1 = vahanSellerBuyerMainScreen.F1();
            str = "validRc";
            str2 = "Please enter valid RC number";
        } else if (vahanSellerBuyerMainScreen.C1().length() < 5) {
            F1 = vahanSellerBuyerMainScreen.F1();
            str = "validchassi";
            str2 = "Please enter valid chassis number";
        } else {
            vahanSellerBuyerMainScreen.L1().show();
            vahanSellerBuyerMainScreen.V1().n(vahanSellerBuyerMainScreen, valueOf);
            return;
        }
        Toast.makeText(vahanSellerBuyerMainScreen, F1.b(str, str2), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void g2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        if (String.valueOf(vahanSellerBuyerMainScreen.B1().f25251f.getText()).length() > 0) {
            Editable text = vahanSellerBuyerMainScreen.B1().f25251f.getText();
            cm.l.c(text);
            text.clear();
        }
        if (String.valueOf(vahanSellerBuyerMainScreen.B1().f25264s.getText()).length() > 0) {
            Editable text2 = vahanSellerBuyerMainScreen.B1().f25264s.getText();
            cm.l.c(text2);
            text2.clear();
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, vahanOnlineCheck vahanonlinecheck) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        try {
            vahanSellerBuyerMainScreen.L1().dismiss();
            vahanSellerBuyerMainScreen.F2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, String str) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        vahanSellerBuyerMainScreen.L1().dismiss();
        vahanSellerBuyerMainScreen.G2(vahanSellerBuyerMainScreen, vahanSellerBuyerMainScreen.F1().b("record_error_msg", vahanSellerBuyerMainScreen.getString(R.string.service_unavable_please_try)));
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, String str) {
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        try {
            if (!ka.c.f13158a.m(str)) {
                vahanSellerBuyerMainScreen.f21400a0 = String.valueOf(vahanSellerBuyerMainScreen.J1().getRc_off_cd());
                vahanSellerBuyerMainScreen.Z = str.toString();
                vahanSellerBuyerMainScreen.X1().i(vahanSellerBuyerMainScreen, String.valueOf(vahanSellerBuyerMainScreen.J1().getState_cd()));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void k2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void x1(Dialog dialog, Context context, String str, VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, SellerValidationWithAadhaar.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanSellerBuyerMainScreen.X);
        intent.putExtra("RcDetails", vahanSellerBuyerMainScreen.J1());
        intent.putExtra("off_code", vahanSellerBuyerMainScreen.f21400a0);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void y1(Dialog dialog, Context context, String str, VahanSellerBuyerMainScreen vahanSellerBuyerMainScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(vahanSellerBuyerMainScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, SellerBuyerToGenerateOTPScreen.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanSellerBuyerMainScreen.X);
        intent.putExtra("Mobile_no", vahanSellerBuyerMainScreen.Z);
        intent.putExtra("RcDetails", vahanSellerBuyerMainScreen.J1());
        intent.putExtra("off_code", vahanSellerBuyerMainScreen.f21400a0);
        context.startActivity(intent);
    }

    public final ArrayList A1() {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final void A2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.T = vahanProService;
    }

    public final a9 B1() {
        a9 a9Var = this.G;
        if (a9Var != null) {
            return a9Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void B2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.S = hVar;
    }

    public final String C1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("chassi_number");
        return null;
    }

    public final void C2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.L = lVar;
    }

    public final String D1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("clickvalue");
        return null;
    }

    public final void D2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.V = hVar;
    }

    public final DatabaseHelper E1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final void E2() {
        ArrayList E0 = E1().E0();
        cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        l2(E0);
        if (A1().size() > 0) {
            try {
                f0 f0Var = new f0(A1(), this, this);
                cm.l.c(f0Var);
                s2(f0Var);
                B1().f25265t.setAdapter(I1());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            B1().f25252g.setVisibility(0);
            B1().f25265t.setVisibility(8);
            B1().f25262q.setVisibility(8);
            B1().f25256k.setVisibility(0);
            B1().f25247b.setVisibility(8);
            B1().f25259n.setVisibility(0);
        }
    }

    public final ld.c F1() {
        ld.c cVar = this.f21402c0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void F2(String str) {
        String str2;
        Intent intent;
        String str3;
        Class<SellerBuyerToGenerateOTPScreen> cls = SellerBuyerToGenerateOTPScreen.class;
        cm.l.f(str, "check_string");
        try {
            String obj = q.B0(p.v(str, '<', ' ', false, 4, (Object) null)).toString();
            String obj2 = q.B0(p.v(obj, '>', ' ', false, 4, (Object) null)).toString();
            String str4 = "Mobile_no";
            try {
                Iterable<String> l02 = q.l0(obj2, new String[]{"&"}, false, 0, 6, (Object) null);
                ArrayList arrayList = new ArrayList(r.s(l02, 10));
                for (String B0 : l02) {
                    arrayList.add(q.B0(B0).toString());
                }
                Class<SellerValidationWithAadhaar> cls2 = SellerValidationWithAadhaar.class;
                if (arrayList.size() > 1) {
                    String obj3 = q.B0((String) arrayList.get(0)).toString();
                    String obj4 = q.B0((String) arrayList.get(1)).toString();
                    Log.e("Step1", obj.toString());
                    Log.e("Step2", obj2.toString());
                    Log.e("step41", obj3);
                    Log.e("step42", obj4);
                    String obj5 = q.B0(new km.f("\\s").b(p.v(obj3, '(', ' ', false, 4, (Object) null), "")).toString();
                    String obj6 = q.B0(new km.f("\\s").b(p.v(obj5, ')', ' ', false, 4, (Object) null), "")).toString();
                    String obj7 = q.B0(new km.f("\\s").b(p.v(obj4, '(', ' ', false, 4, (Object) null), "")).toString();
                    String obj8 = q.B0(new km.f("\\s").b(p.v(obj7, ')', ' ', false, 4, (Object) null), "")).toString();
                    Iterable<String> l03 = q.l0(obj6, new String[]{","}, false, 0, 6, (Object) null);
                    Class<SellerBuyerToGenerateOTPScreen> cls3 = cls;
                    try {
                        ArrayList arrayList2 = new ArrayList(r.s(l03, 10));
                        for (String B02 : l03) {
                            arrayList2.add(q.B0(B02).toString());
                        }
                        Iterable<String> l04 = q.l0(obj8, new String[]{","}, false, 0, 6, (Object) null);
                        ArrayList arrayList3 = new ArrayList(r.s(l04, 10));
                        for (String B03 : l04) {
                            arrayList3.add(q.B0(B03).toString());
                        }
                        Log.e("step43", obj5);
                        Log.e("step5", obj6);
                        Log.e("stepM4", obj7);
                        Log.e("stepM5", obj8);
                        if (arrayList2.contains("0")) {
                            if (arrayList3.contains("0")) {
                                Log.e("condition--> ", "condition-->1");
                                str3 = this.Y;
                                w1(this, str3);
                                return;
                            }
                        }
                        if (arrayList2.contains(q.B0(z1(this.X)).toString()) && arrayList3.contains(q.B0(z1(this.X)).toString())) {
                            Log.e("condition--> ", "condition-->2");
                            str3 = this.Y;
                            w1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && arrayList3.contains(q.B0(z1(this.X)).toString())) {
                            Log.e("condition--> ", "condition-->3");
                            str3 = this.Y;
                            w1(this, str3);
                            return;
                        } else if (arrayList2.contains(q.B0(z1(this.X)).toString()) && arrayList3.contains("0")) {
                            Log.e("condition--> ", "condition-->4");
                            str3 = this.Y;
                            w1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && !arrayList3.contains(q.B0(z1(this.X)).toString())) {
                            Log.e("condition--> ", "condition-->5");
                            Intent intent2 = new Intent(this, cls2);
                            intent2.putExtra("RC", this.Y);
                            intent2.putExtra("map", this.X);
                            intent2.putExtra("RcDetails", J1());
                            intent2.putExtra("off_code", this.f21400a0);
                            startActivity(intent2);
                            return;
                        } else if (arrayList2.contains(q.B0(z1(this.X)).toString()) || !arrayList3.contains("0")) {
                            Class<SellerBuyerToGenerateOTPScreen> cls4 = cls3;
                            String str5 = str4;
                            Log.e("condition--> ", "condition-->7");
                            G2(this, getString(R.string.service_unavable_please_try));
                            return;
                        } else {
                            Log.e("condition--> ", "condition-->6");
                            cls = cls3;
                            intent = new Intent(this, cls);
                            intent.putExtra("RC", this.Y);
                            intent.putExtra("map", this.X);
                            str2 = str4;
                            try {
                                intent.putExtra(str2, this.Z);
                                intent.putExtra("RcDetails", J1());
                                intent.putExtra("off_code", this.f21400a0);
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                                Intent intent3 = new Intent(this, cls);
                                intent3.putExtra("RC", this.Y);
                                intent3.putExtra("map", this.X);
                                intent3.putExtra(str2, this.Z);
                                intent3.putExtra("RcDetails", J1());
                                intent3.putExtra("off_code", this.f21400a0);
                                startActivity(intent3);
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cls = cls3;
                        str2 = str4;
                        e.printStackTrace();
                        Intent intent32 = new Intent(this, cls);
                        intent32.putExtra("RC", this.Y);
                        intent32.putExtra("map", this.X);
                        intent32.putExtra(str2, this.Z);
                        intent32.putExtra("RcDetails", J1());
                        intent32.putExtra("off_code", this.f21400a0);
                        startActivity(intent32);
                    }
                } else {
                    String str6 = str4;
                    if (q.F(obj2.toString(), "A", false, 2, (Object) null)) {
                        intent = new Intent(this, cls2);
                        intent.putExtra("RC", this.Y);
                        intent.putExtra("map", this.X);
                        intent.putExtra("RcDetails", J1());
                        intent.putExtra("off_code", this.f21400a0);
                    } else {
                        intent = new Intent(this, cls);
                        intent.putExtra("RC", this.Y);
                        intent.putExtra("map", this.X);
                        intent.putExtra(str6, this.Z);
                        intent.putExtra("RcDetails", J1());
                        intent.putExtra("off_code", this.f21400a0);
                    }
                }
                startActivity(intent);
            } catch (Exception e12) {
                e = e12;
                str2 = str4;
                e.printStackTrace();
                Intent intent322 = new Intent(this, cls);
                intent322.putExtra("RC", this.Y);
                intent322.putExtra("map", this.X);
                intent322.putExtra(str2, this.Z);
                intent322.putExtra("RcDetails", J1());
                intent322.putExtra("off_code", this.f21400a0);
                startActivity(intent322);
            }
        } catch (Exception e13) {
            e = e13;
            str2 = "Mobile_no";
            e.printStackTrace();
            Intent intent3222 = new Intent(this, cls);
            intent3222.putExtra("RC", this.Y);
            intent3222.putExtra("map", this.X);
            intent3222.putExtra(str2, this.Z);
            intent3222.putExtra("RcDetails", J1());
            intent3222.putExtra("off_code", this.f21400a0);
            startActivity(intent3222);
        }
    }

    public final String G1() {
        return this.f21404e0;
    }

    public final void G2(Context context, String str) {
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
        textView.setOnClickListener(new q(dialog));
        dialog.show();
    }

    public final String H1() {
        return this.Z;
    }

    public final f0 I1() {
        f0 f0Var = this.J;
        if (f0Var != null) {
            return f0Var;
        }
        cm.l.v("myRcAdapter");
        return null;
    }

    public final NrvDetails J1() {
        NrvDetails nrvDetails = this.U;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final String K1() {
        return this.f21400a0;
    }

    public final ProgressDialog L1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String M1() {
        return this.P;
    }

    public final String N1() {
        return this.Q;
    }

    public final String O1() {
        return this.Y;
    }

    public final VahanServiceConnection P1() {
        VahanServiceConnection vahanServiceConnection = this.M;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService Q1() {
        VahanProService vahanProService = this.W;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceAddMob");
        return null;
    }

    public final HashMap R1() {
        return this.X;
    }

    public final ld.h S1() {
        ld.h hVar = this.R;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String T1() {
        return this.f21401b0;
    }

    public final VahanProService U1() {
        VahanProService vahanProService = this.T;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h V1() {
        bi.h hVar = this.S;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final l W1() {
        l lVar = this.L;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final bi.h X1() {
        bi.h hVar = this.V;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelAddMob");
        return null;
    }

    public final void Y1() {
        ArrayList arrayList = this.f21403d0;
        if (arrayList != null) {
            arrayList.add(VContant.DUPLICATE_RC_PURPOSE_CODE);
        }
        ArrayList arrayList2 = this.f21403d0;
        if (arrayList2 != null) {
            arrayList2.add(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
        }
        ArrayList arrayList3 = this.f21403d0;
        if (arrayList3 != null) {
            arrayList3.add(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        }
        ArrayList arrayList4 = this.f21403d0;
        if (arrayList4 != null) {
            arrayList4.add(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
        }
        ArrayList arrayList5 = this.f21403d0;
        if (arrayList5 != null) {
            arrayList5.add(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
        }
        ArrayList arrayList6 = this.f21403d0;
        if (arrayList6 != null) {
            arrayList6.add(VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE);
        }
    }

    public void a0(String str, int i10, String str2) {
        if (str != null) {
            o2("rcnumber");
            this.P = str;
            this.Q = String.valueOf(str2);
            L1().show();
            V1().n(this, str);
        }
    }

    public final void l2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.I = arrayList;
    }

    public final void m2(a9 a9Var) {
        cm.l.f(a9Var, "<set-?>");
        this.G = a9Var;
    }

    public final void n2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void o2(String str) {
        cm.l.f(str, "<set-?>");
        this.O = str;
    }

    public void onBackPressed() {
        if (L1().isShowing()) {
            L1().dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_main_view_screen);
        a9 c10 = a9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        m2(c10);
        setContentView((View) B1().b());
        getWindow().addFlags(128);
        v9.e.f17509a.G2(this, B1());
        new ld.h(this).f(" ");
        q2(new ld.c(this));
        if (getIntent() != null) {
            this.f21401b0 = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        VahanProService.a aVar = VahanProService.f21196b;
        A2(aVar.b(this));
        y2(aVar.b(this));
        x2(VahanServiceConnection.f21199a.b(this));
        Class<bi.h> cls = bi.h.class;
        D2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(Q1()))).a(cls));
        C2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(P1()))).a(l.class));
        B2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(U1()))).a(cls));
        ld.c cVar = new ld.c(this);
        v2(new ProgressDialog(this));
        L1().setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        L1().setCancelable(false);
        L1().setCanceledOnTouchOutside(false);
        z2(new ld.h(this));
        B1().f25260o.f28308i.setText(String.valueOf(cVar.b("toSellerHeader", "Transfer of Ownership \n(Seller)")));
        Y1();
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        p2(A0);
        try {
            if (p.o(S1().c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                this.X.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        B1().f25265t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        E2();
        B1().f25260o.f28305f.setOnClickListener(new bh.l(this));
        B1().f25247b.setOnClickListener(new s(this));
        B1().f25260o.f28306g.setOnClickListener(new t(this));
        B1().f25249d.setOnClickListener(new u(this));
        B1().f25248c.setOnClickListener(new v(this));
        B1().f25258m.setOnClickListener(new w(this));
        V1().e0().g(this, new h(new e(this)));
        V1().f0().g(this, new h(new f(this)));
        V1().e1().g(this, new h(new g(this)));
        V1().f1().g(this, new h(new a(this)));
        V1().D0().g(this, new h(new b(this)));
        V1().C0().g(this, new h(new c(this)));
        W1().g().g(this, new h(new d(this)));
        B1().f25257l.setOnClickListener(new bh.x(this));
        X1().Z0().g(this, new y(this));
        X1().a1().g(this, new z(this));
        X1().s0().g(this, new bh.m(this));
        X1().t0().g(this, new r(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.f9438k.a(this);
        } catch (Exception unused) {
        }
    }

    public final void p2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void q2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21402c0 = cVar;
    }

    public final void r2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void s2(f0 f0Var) {
        cm.l.f(f0Var, "<set-?>");
        this.J = f0Var;
    }

    public final void t2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.U = nrvDetails;
    }

    public final void u1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "title");
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.mvvm_number_dialog);
        View findViewById = dialog.findViewById(R.id.txt_dialog);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        View findViewById2 = dialog.findViewById(R.id.f19013ok);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(new ld.c(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new n(dialog));
        dialog.show();
    }

    public final void u2(String str) {
        this.f21400a0 = str;
    }

    public final void v2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final void w1(Context context, String str) {
        cm.l.f(context, "context");
        cm.l.f(str, "rc_number");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.vahan_process_diloge);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setCancelable(true);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.process_with_Adhar);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.process_with_mobile);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        ld.c cVar = new ld.c(this);
        textView.setText(cVar.b("proceed_with_adhar", "Proceed with Aadhaar/VID"));
        textView2.setText(cVar.b("proceed_with_mobile", "Proceed with Mobile No."));
        textView.setOnClickListener(new o(dialog, context, str, this));
        textView2.setOnClickListener(new p(dialog, context, str, this));
        dialog.show();
    }

    public final void w2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void x2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.M = vahanServiceConnection;
    }

    public final void y2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.W = vahanProService;
    }

    public final String z1(HashMap hashMap) {
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            return VContant.DUPLICATE_RC_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            return VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.CHANGE_OF_ADDRESS)) {
            return VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHICATION_TERMINATION)) {
            return VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_CONTINUATION)) {
            return VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.HYPOTHECATION_ADDITION)) {
            return VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.RCPARTICULAR)) {
            return VContant.RCPARTICULAR_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.NOC) || hashMap.containsKey(VContant.NOC)) {
            return VContant.NOC_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.DUPLICATE_FITNESS)) {
            return VContant.DUPLICATE_FITNESS_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.RC_CANCALATION)) {
            return VContant.RC_CACELLATION_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.RC_SURRENDER)) {
            return VContant.RC_SURRENDER_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            return VContant.TRANFER_OF_OWNERSHIP_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.PERMIT_RENEWAL)) {
            return VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE;
        }
        return hashMap.containsKey(VContant.ALTERATION) ? VContant.ALTERATION_PURPOSE_CODE : "500";
    }

    public final void z2(ld.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.R = hVar;
    }
}
