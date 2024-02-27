package com.nic.mparivahan.VahanServices.VahanView;

import ai.a4;
import ai.b4;
import ai.o3;
import ai.p3;
import ai.q3;
import ai.r3;
import ai.s3;
import ai.t3;
import ai.u3;
import ai.v3;
import ai.w3;
import ai.x3;
import ai.y3;
import ai.z3;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bi.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PushNotification.NaxpToKenService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.GetStateCode;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerIdentification;
import com.nic.mparivahan.VahanServices.VahanModel.vahanOnlineCheck;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanService.VahanServiceConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ni.a9;
import og.f0;
import pg.g;
import pl.x;
import wd.l0;

public final class VahanMainViewScreen extends androidx.appcompat.app.d implements l0 {
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
    public ld.h Q;
    public bi.h R;
    public VahanProService S;
    public NrvDetails T;
    public bi.h U;
    public VahanProService V;
    private HashMap W = new HashMap();
    private String X = "";
    private String Y = "NA";
    private String Z = "0";

    /* renamed from: a0  reason: collision with root package name */
    private String f21550a0 = "NA";

    /* renamed from: b0  reason: collision with root package name */
    public ld.c f21551b0;

    /* renamed from: c0  reason: collision with root package name */
    private ArrayList f21552c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public je.c f21553d0;

    /* renamed from: e0  reason: collision with root package name */
    public DMSService f21554e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f21555f0 = " ";

    /* renamed from: g0  reason: collision with root package name */
    private String f21556g0 = " ";

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21557e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21557e = vahanMainViewScreen;
        }

        public final void b(String str) {
            if (str != null) {
                try {
                    if (p.o(str, "200", true)) {
                        VahanMainViewScreen vahanMainViewScreen = this.f21557e;
                        vahanMainViewScreen.z2(String.valueOf(vahanMainViewScreen.K1().getRc_regn_no()));
                        this.f21557e.K1().getRc_chasi_no();
                        if (!ka.c.f13158a.m(this.f21557e.H1())) {
                            VahanMainViewScreen vahanMainViewScreen2 = this.f21557e;
                            vahanMainViewScreen2.u2(vahanMainViewScreen2.H1());
                        }
                        VahanMainViewScreen vahanMainViewScreen3 = this.f21557e;
                        vahanMainViewScreen3.x2(String.valueOf(vahanMainViewScreen3.K1().getRc_off_cd()));
                        if (VContant.Companion.y(this.f21557e.T1()).equals(VContant.Tax_PURPOSE_CODE)) {
                            this.f21557e.M1().dismiss();
                            Intent intent = new Intent(this.f21557e, VahanGenerateOTPScreen.class);
                            intent.putExtra("RC", this.f21557e.P1());
                            intent.putExtra("map", this.f21557e.S1());
                            intent.putExtra("Mobile_no", this.f21557e.I1());
                            intent.putExtra("RcDetails", this.f21557e.K1());
                            intent.putExtra("off_code", this.f21557e.L1());
                            this.f21557e.startActivity(intent);
                            return;
                        }
                        bi.h Y1 = this.f21557e.Y1();
                        VahanMainViewScreen vahanMainViewScreen4 = this.f21557e;
                        Y1.i(vahanMainViewScreen4, String.valueOf(vahanMainViewScreen4.K1().getState_cd()));
                        return;
                    }
                    this.f21557e.M1().dismiss();
                    VahanMainViewScreen vahanMainViewScreen5 = this.f21557e;
                    vahanMainViewScreen5.J2(vahanMainViewScreen5, vahanMainViewScreen5.G1().b("record_error_msg", this.f21557e.getString(R.string.service_unavable_please_try)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f21557e.M1().dismiss();
                }
            } else {
                this.f21557e.M1().dismiss();
                VahanMainViewScreen vahanMainViewScreen6 = this.f21557e;
                vahanMainViewScreen6.J2(vahanMainViewScreen6, vahanMainViewScreen6.G1().b("record_error_msg", this.f21557e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21558e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21558e = vahanMainViewScreen;
        }

        public final void b(String str) {
            this.f21558e.M1().dismiss();
            VahanMainViewScreen vahanMainViewScreen = this.f21558e;
            vahanMainViewScreen.J2(vahanMainViewScreen, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21559e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21559e = vahanMainViewScreen;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            VahanMainViewScreen vahanMainViewScreen;
            String str;
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanMainViewScreen vahanMainViewScreen2 = this.f21559e;
                        OwnerIdentification ownerIdentification = ownerDetailPuccPermit.getOwnerIdentification();
                        CharSequence charSequence = null;
                        vahanMainViewScreen2.t2(String.valueOf(ownerIdentification != null ? ownerIdentification.getMobile_no() : null));
                        VahanMainViewScreen vahanMainViewScreen3 = this.f21559e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanMainViewScreen3.w2(companion.c(ownerDetailPuccPermit));
                        if (cm.l.a(this.f21559e.C1(), "rcnumber")) {
                            String rc_chasi_no = this.f21559e.K1().getRc_chasi_no();
                            if (rc_chasi_no != null) {
                                String rc_chasi_no2 = this.f21559e.K1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no2);
                                String rc_chasi_no3 = this.f21559e.K1().getRc_chasi_no();
                                cm.l.c(rc_chasi_no3);
                                charSequence = rc_chasi_no.subSequence(rc_chasi_no2.length() - 5, rc_chasi_no3.length());
                            }
                            bi.h W1 = this.f21559e.W1();
                            VahanMainViewScreen vahanMainViewScreen4 = this.f21559e;
                            W1.q1(vahanMainViewScreen4, String.valueOf(vahanMainViewScreen4.K1().getRc_regn_no()), String.valueOf(charSequence), String.valueOf(this.f21559e.K1().getState_cd()), companion.y(this.f21559e.T1()));
                            return;
                        }
                        String rc_chasi_no4 = this.f21559e.K1().getRc_chasi_no();
                        if (rc_chasi_no4 != null) {
                            String rc_chasi_no5 = this.f21559e.K1().getRc_chasi_no();
                            cm.l.c(rc_chasi_no5);
                            String rc_chasi_no6 = this.f21559e.K1().getRc_chasi_no();
                            cm.l.c(rc_chasi_no6);
                            charSequence = rc_chasi_no4.subSequence(rc_chasi_no5.length() - 5, rc_chasi_no6.length());
                        }
                        if (p.o(this.f21559e.B1(), String.valueOf(charSequence), true)) {
                            bi.h W12 = this.f21559e.W1();
                            VahanMainViewScreen vahanMainViewScreen5 = this.f21559e;
                            W12.q1(vahanMainViewScreen5, String.valueOf(vahanMainViewScreen5.K1().getRc_regn_no()), this.f21559e.B1(), String.valueOf(this.f21559e.K1().getState_cd()), companion.y(this.f21559e.T1()));
                            return;
                        }
                        this.f21559e.M1().dismiss();
                        vahanMainViewScreen = this.f21559e;
                        str = "Please enter the valid chassis number";
                        vahanMainViewScreen.t1(vahanMainViewScreen, str);
                    }
                }
                this.f21559e.M1().dismiss();
                vahanMainViewScreen = this.f21559e;
                str = "No details found";
                vahanMainViewScreen.t1(vahanMainViewScreen, str);
            } catch (Exception e10) {
                this.f21559e.M1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21560e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21560e = vahanMainViewScreen;
        }

        public final void b(String str) {
            this.f21560e.M1().dismiss();
            if (p.o(str, "error", true)) {
                VahanMainViewScreen vahanMainViewScreen = this.f21560e;
                vahanMainViewScreen.J2(vahanMainViewScreen, vahanMainViewScreen.G1().b("record_error_msg", this.f21560e.getString(R.string.service_unavable_please_try)));
                return;
            }
            VahanMainViewScreen vahanMainViewScreen2 = this.f21560e;
            vahanMainViewScreen2.J2(vahanMainViewScreen2, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21561e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21561e = vahanMainViewScreen;
        }

        public final void b(String str) {
            this.f21561e.M1().dismiss();
            VahanMainViewScreen vahanMainViewScreen = this.f21561e;
            vahanMainViewScreen.J2(vahanMainViewScreen, vahanMainViewScreen.G1().b("record_error_msg", this.f21561e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21562e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21562e = vahanMainViewScreen;
        }

        public final void b(VahanDmsModleResponse vahanDmsModleResponse) {
            try {
                if (p.o(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
                    UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
                    List<NonUploaded> nonUploadedList = uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null;
                    cm.l.d(nonUploadedList, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded>");
                    ArrayList arrayList = (ArrayList) nonUploadedList;
                    if (arrayList.size() > 0) {
                        this.f21562e.M1().dismiss();
                        g.a aVar = pg.g.f30363a;
                        VahanMainViewScreen vahanMainViewScreen = this.f21562e;
                        aVar.h(vahanMainViewScreen, arrayList, vahanMainViewScreen.Y1());
                        return;
                    }
                    bi.h Y1 = this.f21562e.Y1();
                    VahanMainViewScreen vahanMainViewScreen2 = this.f21562e;
                    Y1.i(vahanMainViewScreen2, String.valueOf(vahanMainViewScreen2.K1().getState_cd()));
                }
            } catch (Exception unused) {
                bi.h Y12 = this.f21562e.Y1();
                VahanMainViewScreen vahanMainViewScreen3 = this.f21562e;
                Y12.i(vahanMainViewScreen3, String.valueOf(vahanMainViewScreen3.K1().getState_cd()));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanDmsModleResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21563e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21563e = vahanMainViewScreen;
        }

        public final void b(String str) {
            try {
                bi.h Y1 = this.f21563e.Y1();
                VahanMainViewScreen vahanMainViewScreen = this.f21563e;
                Y1.i(vahanMainViewScreen, String.valueOf(vahanMainViewScreen.K1().getState_cd()));
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21564e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21564e = vahanMainViewScreen;
        }

        public final void b(GetStateCode getStateCode) {
            VahanMainViewScreen vahanMainViewScreen;
            String b10;
            String valueOf;
            bi.h W1;
            VahanMainViewScreen vahanMainViewScreen2;
            String stateCd;
            String y10;
            String O1;
            if (getStateCode != null) {
                try {
                    if (!ka.c.f13158a.m(getStateCode.getStateCd())) {
                        if (p.o(this.f21564e.U1(), getStateCode.getStateCd(), true)) {
                            valueOf = String.valueOf(this.f21564e.A1().f25264s.getText());
                            if (valueOf.length() > 0) {
                                W1 = this.f21564e.W1();
                                vahanMainViewScreen2 = this.f21564e;
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21564e.T1());
                                O1 = String.valueOf(this.f21564e.A1().f25251f.getText());
                            } else if (this.f21564e.N1().length() > 0) {
                                W1 = this.f21564e.W1();
                                vahanMainViewScreen2 = this.f21564e;
                                valueOf = vahanMainViewScreen2.N1();
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21564e.T1());
                                O1 = this.f21564e.O1();
                            } else {
                                return;
                            }
                        } else if (p.o(this.f21564e.U1(), "OD", true)) {
                            valueOf = String.valueOf(this.f21564e.A1().f25264s.getText());
                            if (valueOf.length() > 0) {
                                W1 = this.f21564e.W1();
                                vahanMainViewScreen2 = this.f21564e;
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21564e.T1());
                                O1 = String.valueOf(this.f21564e.A1().f25251f.getText());
                            } else if (this.f21564e.N1().length() > 0) {
                                W1 = this.f21564e.W1();
                                vahanMainViewScreen2 = this.f21564e;
                                valueOf = vahanMainViewScreen2.N1();
                                stateCd = getStateCode.getStateCd();
                                y10 = VContant.Companion.y(this.f21564e.T1());
                                O1 = this.f21564e.O1();
                            } else {
                                return;
                            }
                        } else {
                            this.f21564e.M1().dismiss();
                            vahanMainViewScreen = this.f21564e;
                            b10 = this.f21564e.G1().b("validstate", "Please enter valid RC number of ") + ' ' + VContant.Companion.k(this.f21564e.U1()) + ' ' + this.f21564e.G1().b("vahan_state", "State");
                        }
                        W1.A0(vahanMainViewScreen2, valueOf, stateCd, y10, O1);
                        return;
                    }
                    this.f21564e.M1().dismiss();
                    vahanMainViewScreen = this.f21564e;
                    b10 = vahanMainViewScreen.G1().b("record_error_msg", this.f21564e.getString(R.string.service_unavable_please_try));
                    vahanMainViewScreen.J2(vahanMainViewScreen, b10);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f21564e.M1().dismiss();
                }
            } else {
                this.f21564e.M1().dismiss();
                VahanMainViewScreen vahanMainViewScreen3 = this.f21564e;
                vahanMainViewScreen3.J2(vahanMainViewScreen3, vahanMainViewScreen3.G1().b("record_error_msg", this.f21564e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStateCode) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMainViewScreen f21565e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VahanMainViewScreen vahanMainViewScreen) {
            super(1);
            this.f21565e = vahanMainViewScreen;
        }

        public final void b(String str) {
            this.f21565e.M1().dismiss();
            if (p.o(str, "Error", true)) {
                VahanMainViewScreen vahanMainViewScreen = this.f21565e;
                vahanMainViewScreen.J2(vahanMainViewScreen, vahanMainViewScreen.G1().b("record_error_msg", this.f21565e.getString(R.string.service_unavable_please_try)));
                return;
            }
            VahanMainViewScreen vahanMainViewScreen2 = this.f21565e;
            vahanMainViewScreen2.J2(vahanMainViewScreen2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f21566a;

        j(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f21566a = lVar;
        }

        public final pl.c a() {
            return this.f21566a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21566a.invoke(obj);
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
    public static final void K2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        try {
            pg.g.f30363a.e(vahanMainViewScreen, vahanMainViewScreen.f21552c0);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.k2();
    }

    /* access modifiers changed from: private */
    public static final void e2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.A1().f25248c.setBackgroundResource(R.drawable.other_new_shape_grey);
        vahanMainViewScreen.A1().f25249d.setBackgroundResource(R.drawable.button_style);
        vahanMainViewScreen.A1().f25249d.setTextColor(androidx.core.content.a.c(vahanMainViewScreen, R.color.white));
        vahanMainViewScreen.A1().f25248c.setTextColor(androidx.core.content.a.c(vahanMainViewScreen, R.color.black));
        vahanMainViewScreen.A1().f25265t.setVisibility(8);
        vahanMainViewScreen.A1().f25256k.setVisibility(0);
        vahanMainViewScreen.A1().f25247b.setVisibility(8);
        vahanMainViewScreen.A1().f25259n.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void f2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.A1().f25248c.setBackgroundResource(R.drawable.button_style);
        vahanMainViewScreen.A1().f25249d.setBackgroundResource(R.drawable.other_new_shape_grey);
        vahanMainViewScreen.A1().f25248c.setTextColor(androidx.core.content.a.c(vahanMainViewScreen, R.color.white));
        vahanMainViewScreen.A1().f25249d.setTextColor(androidx.core.content.a.c(vahanMainViewScreen, R.color.black));
        vahanMainViewScreen.A1().f25265t.setVisibility(0);
        vahanMainViewScreen.A1().f25256k.setVisibility(8);
        vahanMainViewScreen.A1().f25247b.setVisibility(0);
        vahanMainViewScreen.A1().f25259n.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void g2(VahanMainViewScreen vahanMainViewScreen, View view) {
        ld.c G1;
        String str;
        String str2;
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.o2("submit");
        String valueOf = String.valueOf(vahanMainViewScreen.A1().f25264s.getText());
        vahanMainViewScreen.n2(String.valueOf(vahanMainViewScreen.A1().f25251f.getText()));
        if (valueOf.length() < 4) {
            G1 = vahanMainViewScreen.G1();
            str = "validRc";
            str2 = "Please enter valid RC number";
        } else if (vahanMainViewScreen.B1().length() < 5) {
            G1 = vahanMainViewScreen.G1();
            str = "validchassi";
            str2 = "Please enter valid chassis number";
        } else {
            vahanMainViewScreen.M1().show();
            vahanMainViewScreen.W1().n(vahanMainViewScreen, valueOf);
            return;
        }
        Toast.makeText(vahanMainViewScreen, G1.b(str, str2), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void h2(VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(vahanMainViewScreen, "this$0");
        if (String.valueOf(vahanMainViewScreen.A1().f25251f.getText()).length() > 0) {
            Editable text = vahanMainViewScreen.A1().f25251f.getText();
            cm.l.c(text);
            text.clear();
        }
        if (String.valueOf(vahanMainViewScreen.A1().f25264s.getText()).length() > 0) {
            Editable text2 = vahanMainViewScreen.A1().f25264s.getText();
            cm.l.c(text2);
            text2.clear();
        }
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanMainViewScreen vahanMainViewScreen, vahanOnlineCheck vahanonlinecheck) {
        cm.l.f(vahanMainViewScreen, "this$0");
        try {
            vahanMainViewScreen.M1().dismiss();
            vahanMainViewScreen.I2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanMainViewScreen vahanMainViewScreen, String str) {
        cm.l.f(vahanMainViewScreen, "this$0");
        vahanMainViewScreen.M1().dismiss();
        vahanMainViewScreen.J2(vahanMainViewScreen, vahanMainViewScreen.G1().b("record_error_msg", vahanMainViewScreen.getString(R.string.service_unavable_please_try)));
    }

    private final void k2() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void w1(Dialog dialog, Context context, String str, VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(vahanMainViewScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanProcessWithAdhar.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanMainViewScreen.W);
        intent.putExtra("RcDetails", vahanMainViewScreen.K1());
        intent.putExtra("off_code", vahanMainViewScreen.Z);
        context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void x1(Dialog dialog, Context context, String str, VahanMainViewScreen vahanMainViewScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(vahanMainViewScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanGenerateOTPScreen.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", vahanMainViewScreen.W);
        intent.putExtra("Mobile_no", vahanMainViewScreen.Y);
        intent.putExtra("RcDetails", vahanMainViewScreen.K1());
        intent.putExtra("off_code", vahanMainViewScreen.Z);
        context.startActivity(intent);
    }

    public final a9 A1() {
        a9 a9Var = this.G;
        if (a9Var != null) {
            return a9Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final void A2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.M = vahanServiceConnection;
    }

    public final String B1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("chassi_number");
        return null;
    }

    public final void B2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.V = vahanProService;
    }

    public final String C1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        cm.l.v("clickvalue");
        return null;
    }

    public final void C2(ld.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.Q = hVar;
    }

    public final DatabaseHelper D1() {
        DatabaseHelper databaseHelper = this.H;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final void D2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.S = vahanProService;
    }

    public final DMSService E1() {
        DMSService dMSService = this.f21554e0;
        if (dMSService != null) {
            return dMSService;
        }
        cm.l.v("dmsService");
        return null;
    }

    public final void E2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.R = hVar;
    }

    public final je.c F1() {
        je.c cVar = this.f21553d0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("dmsViewModle");
        return null;
    }

    public final void F2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.L = lVar;
    }

    public final ld.c G1() {
        ld.c cVar = this.f21551b0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void G2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.U = hVar;
    }

    public final String H1() {
        return this.f21556g0;
    }

    public final void H2() {
        ArrayList E0 = D1().E0();
        cm.l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        l2(E0);
        if (z1().size() > 0) {
            try {
                f0 f0Var = new f0(z1(), this, this);
                cm.l.c(f0Var);
                v2(f0Var);
                A1().f25265t.setAdapter(J1());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            A1().f25252g.setVisibility(0);
            A1().f25265t.setVisibility(8);
            A1().f25262q.setVisibility(8);
            A1().f25256k.setVisibility(0);
            A1().f25247b.setVisibility(8);
            A1().f25259n.setVisibility(0);
        }
    }

    public final String I1() {
        return this.Y;
    }

    public final void I2(String str) {
        String str2;
        Intent intent;
        String str3;
        Class<VahanGenerateOTPScreen> cls = VahanGenerateOTPScreen.class;
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
                Class<VahanProcessWithAdhar> cls2 = VahanProcessWithAdhar.class;
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
                    Class<VahanGenerateOTPScreen> cls3 = cls;
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
                                str3 = this.X;
                                v1(this, str3);
                                return;
                            }
                        }
                        if (arrayList2.contains(q.B0(y1(this.W)).toString()) && arrayList3.contains(q.B0(y1(this.W)).toString())) {
                            Log.e("condition--> ", "condition-->2");
                            str3 = this.X;
                            v1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && arrayList3.contains(q.B0(y1(this.W)).toString())) {
                            Log.e("condition--> ", "condition-->3");
                            str3 = this.X;
                            v1(this, str3);
                            return;
                        } else if (arrayList2.contains(q.B0(y1(this.W)).toString()) && arrayList3.contains("0")) {
                            Log.e("condition--> ", "condition-->4");
                            str3 = this.X;
                            v1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && !arrayList3.contains(q.B0(y1(this.W)).toString())) {
                            Log.e("condition--> ", "condition-->5");
                            Intent intent2 = new Intent(this, cls2);
                            intent2.putExtra("RC", this.X);
                            intent2.putExtra("map", this.W);
                            intent2.putExtra("RcDetails", K1());
                            intent2.putExtra("off_code", this.Z);
                            startActivity(intent2);
                            return;
                        } else if (arrayList2.contains(q.B0(y1(this.W)).toString()) || !arrayList3.contains("0")) {
                            Class<VahanGenerateOTPScreen> cls4 = cls3;
                            String str5 = str4;
                            Log.e("condition--> ", "condition-->7");
                            J2(this, getString(R.string.service_unavable_please_try));
                            return;
                        } else {
                            Log.e("condition--> ", "condition-->6");
                            cls = cls3;
                            intent = new Intent(this, cls);
                            intent.putExtra("RC", this.X);
                            intent.putExtra("map", this.W);
                            str2 = str4;
                            try {
                                intent.putExtra(str2, this.Y);
                                intent.putExtra("RcDetails", K1());
                                intent.putExtra("off_code", this.Z);
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                                Intent intent3 = new Intent(this, cls);
                                intent3.putExtra("RC", this.X);
                                intent3.putExtra("map", this.W);
                                intent3.putExtra(str2, this.Y);
                                intent3.putExtra("RcDetails", K1());
                                intent3.putExtra("off_code", this.Z);
                                startActivity(intent3);
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cls = cls3;
                        str2 = str4;
                        e.printStackTrace();
                        Intent intent32 = new Intent(this, cls);
                        intent32.putExtra("RC", this.X);
                        intent32.putExtra("map", this.W);
                        intent32.putExtra(str2, this.Y);
                        intent32.putExtra("RcDetails", K1());
                        intent32.putExtra("off_code", this.Z);
                        startActivity(intent32);
                    }
                } else {
                    String str6 = str4;
                    if (q.F(obj2.toString(), "A", false, 2, (Object) null)) {
                        intent = new Intent(this, cls2);
                        intent.putExtra("RC", this.X);
                        intent.putExtra("map", this.W);
                        intent.putExtra("RcDetails", K1());
                        intent.putExtra("off_code", this.Z);
                    } else {
                        intent = new Intent(this, cls);
                        intent.putExtra("RC", this.X);
                        intent.putExtra("map", this.W);
                        intent.putExtra(str6, this.Y);
                        intent.putExtra("RcDetails", K1());
                        intent.putExtra("off_code", this.Z);
                    }
                }
                startActivity(intent);
            } catch (Exception e12) {
                e = e12;
                str2 = str4;
                e.printStackTrace();
                Intent intent322 = new Intent(this, cls);
                intent322.putExtra("RC", this.X);
                intent322.putExtra("map", this.W);
                intent322.putExtra(str2, this.Y);
                intent322.putExtra("RcDetails", K1());
                intent322.putExtra("off_code", this.Z);
                startActivity(intent322);
            }
        } catch (Exception e13) {
            e = e13;
            str2 = "Mobile_no";
            e.printStackTrace();
            Intent intent3222 = new Intent(this, cls);
            intent3222.putExtra("RC", this.X);
            intent3222.putExtra("map", this.W);
            intent3222.putExtra(str2, this.Y);
            intent3222.putExtra("RcDetails", K1());
            intent3222.putExtra("off_code", this.Z);
            startActivity(intent3222);
        }
    }

    public final f0 J1() {
        f0 f0Var = this.J;
        if (f0Var != null) {
            return f0Var;
        }
        cm.l.v("myRcAdapter");
        return null;
    }

    public final void J2(Context context, String str) {
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
        textView.setOnClickListener(new s3(dialog));
        dialog.show();
    }

    public final NrvDetails K1() {
        NrvDetails nrvDetails = this.T;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
        return null;
    }

    public final String L1() {
        return this.Z;
    }

    public final ProgressDialog M1() {
        ProgressDialog progressDialog = this.K;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final String N1() {
        return this.P;
    }

    public final String O1() {
        return this.f21555f0;
    }

    public final String P1() {
        return this.X;
    }

    public final VahanServiceConnection Q1() {
        VahanServiceConnection vahanServiceConnection = this.M;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService R1() {
        VahanProService vahanProService = this.V;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceAddMob");
        return null;
    }

    public final HashMap S1() {
        return this.W;
    }

    public final ld.h T1() {
        ld.h hVar = this.Q;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("session");
        return null;
    }

    public final String U1() {
        return this.f21550a0;
    }

    public final VahanProService V1() {
        VahanProService vahanProService = this.S;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h W1() {
        bi.h hVar = this.R;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final l X1() {
        l lVar = this.L;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final bi.h Y1() {
        bi.h hVar = this.U;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelAddMob");
        return null;
    }

    public final void Z1() {
        ArrayList arrayList = this.f21552c0;
        if (arrayList != null) {
            arrayList.add(VContant.DUPLICATE_RC_PURPOSE_CODE);
        }
        ArrayList arrayList2 = this.f21552c0;
        if (arrayList2 != null) {
            arrayList2.add(VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE);
        }
        ArrayList arrayList3 = this.f21552c0;
        if (arrayList3 != null) {
            arrayList3.add(VContant.HYPOTHICATION_TERMINATION_PURPOSE_CODE);
        }
        ArrayList arrayList4 = this.f21552c0;
        if (arrayList4 != null) {
            arrayList4.add(VContant.HYPOTHECATION_ADDITION_PURPOSE_CODE);
        }
        ArrayList arrayList5 = this.f21552c0;
        if (arrayList5 != null) {
            arrayList5.add(VContant.HYPOTHECATION_CONTINUATION_PURPOSE_CODE);
        }
    }

    public void a0(String str, int i10, String str2) {
        if (str != null) {
            o2("rcnumber");
            this.P = str;
            this.f21555f0 = String.valueOf(str2);
            M1().show();
            W1().n(this, str);
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str = VContant.COMPOUND_FEE_CODE;
        String str2 = VContant.PERMIT_RENEWAL_CODE;
        String str3 = VContant.NP_CODE;
        String str4 = VContant.TEMPERMIT_CODE;
        super.onCreate(bundle);
        String str5 = VContant.PAY_TAX_ASS_CODE;
        setContentView((int) R.layout.activity_vahan_main_view_screen);
        a9 c10 = a9.c(getLayoutInflater());
        String str6 = VContant.RC_RELEASE_CODE;
        cm.l.e(c10, "inflate(...)");
        m2(c10);
        setContentView((View) A1().b());
        getWindow().addFlags(128);
        v9.e.f17509a.F2(this, A1());
        new ld.h(this).f(" ");
        s2(new ld.c(this));
        if (getIntent() != null) {
            this.f21550a0 = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        VahanProService.a aVar = VahanProService.f21196b;
        D2(aVar.b(this));
        B2(aVar.b(this));
        A2(VahanServiceConnection.f21199a.b(this));
        String str7 = VContant.PAY_TAX_CODE;
        String str8 = VContant.DUPLICATE_PERMIT_CODE;
        Class<bi.h> cls = bi.h.class;
        G2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(R1()))).a(cls));
        String str9 = VContant.RC_SURRENDER_RC_CODE;
        F2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(Q1()))).a(l.class));
        E2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(V1()))).a(cls));
        q2(DMSService.f20571a.b(this));
        r2((je.c) new u0((x0) this, (u0.b) new je.b(new je.a(E1()))).a(je.c.class));
        ld.c cVar = new ld.c(this);
        y2(new ProgressDialog(this));
        M1().setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        M1().setCancelable(false);
        M1().setCanceledOnTouchOutside(false);
        C2(new ld.h(this));
        A1().f25260o.f28308i.setText(VContant.Companion.l(this, T1()));
        Z1();
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        p2(A0);
        try {
            if (p.o(T1().c(), VContant.DUPLICATE_RC_CODE, true)) {
                this.W.put(VContant.DUPLICATE_RC, VContant.DUPLICATE_RC_CODE);
            }
            if (p.o(T1().c(), VContant.HYPOTHECATION_ADDITION_CODE, true)) {
                this.W.put(VContant.HYPOTHECATION_ADDITION, VContant.HYPOTHECATION_ADDITION_CODE);
            }
            if (p.o(T1().c(), VContant.HYPOTHECATION_CONTINUATION_CODE, true)) {
                this.W.put(VContant.HYPOTHECATION_CONTINUATION, VContant.HYPOTHECATION_CONTINUATION_CODE);
            }
            if (p.o(T1().c(), VContant.HYPOTHICATION_TERMINATION_CODE, true)) {
                this.W.put(VContant.HYPOTHICATION_TERMINATION, VContant.HYPOTHICATION_TERMINATION_CODE);
            }
            if (p.o(T1().c(), VContant.CHANGE_OF_ADDRESS_CODE, true)) {
                this.W.put(VContant.CHANGE_OF_ADDRESS, VContant.CHANGE_OF_ADDRESS_CODE);
            }
            if (p.o(T1().c(), VContant.TRANFER_OF_OWNERSHIP_CODE, true)) {
                this.W.put(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
            }
            if (p.o(T1().c(), VContant.RCPARTICULAR_CODE, true)) {
                this.W.put(VContant.RCPARTICULAR, VContant.RCPARTICULAR_CODE);
            }
            if (p.o(T1().c(), VContant.NOC_CODE, true)) {
                this.W.put(VContant.NOC, VContant.NOC_CODE);
            }
            if (p.o(T1().c(), VContant.DUPLICATE_FITNESS_CODE, true)) {
                this.W.put(VContant.DUPLICATE_FITNESS, VContant.DUPLICATE_FITNESS_CODE);
            }
            if (p.o(T1().c(), VContant.RC_CANCELLATION_CODE, true)) {
                this.W.put(VContant.RC_CANCALATION, VContant.RC_CANCELLATION_CODE);
            }
            String str10 = str9;
            if (p.o(T1().c(), str10, true)) {
                this.W.put(VContant.RC_SURRENDER, str10);
            }
            String str11 = str8;
            if (p.o(T1().c(), str11, true)) {
                this.W.put(VContant.DUPLICATE_PERMIT, str11);
            }
            String str12 = str7;
            if (p.o(T1().c(), str12, true)) {
                this.W.put(VContant.PAY_TAX, str12);
            }
            String str13 = str6;
            if (p.o(T1().c(), str13, true)) {
                this.W.put(VContant.RC_RELEASE, str13);
            }
            String str14 = str5;
            if (p.o(T1().c(), str14, true)) {
                this.W.put(VContant.PAY_TAXASS, str14);
            }
            String str15 = str4;
            if (p.o(T1().c(), str15, true)) {
                this.W.put(VContant.Temp_Permit, str15);
            }
            String str16 = str3;
            if (p.o(T1().c(), str16, true)) {
                this.W.put(VContant.NP_Permit, str16);
            }
            String str17 = str2;
            if (p.o(T1().c(), str17, true)) {
                this.W.put(VContant.PERMIT_RENEWAL, str17);
            }
            String str18 = str;
            if (p.o(T1().c(), str18, true)) {
                this.W.put(VContant.COMPOUND_FEE, str18);
            }
            if (p.o(T1().c(), VContant.MISELL_CODE, true)) {
                this.W.put(VContant.MISELL_PAYMENT, VContant.MISELL_CODE);
            }
            if (p.o(T1().c(), VContant.ALTERATION_CODE, true)) {
                this.W.put(VContant.ALTERATION, VContant.ALTERATION_CODE);
            }
            if (p.o(T1().c(), VContant.UPDATE_MOBILE_CODE, true)) {
                this.W.put(VContant.UPDATE_MOBILE, VContant.UPDATE_MOBILE_CODE);
            }
            if (p.o(T1().c(), VContant.MULTI_SELECT_SERVICE_CODE, true)) {
                this.W.put(VContant.MULTI_SELECT_SERVICE, VContant.MULTI_SELECT_SERVICE_CODE);
            }
            if (this.W.containsKey(VContant.MULTI_SELECT_SERVICE)) {
                A1().f25260o.f28304e.setVisibility(8);
                SpannableString spannableString = new SpannableString(cVar.b("rcServices", getString(R.string.rc_service)));
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
                A1().f25260o.f28308i.setText(spannableString);
            }
            A1().f25260o.f28308i.setOnClickListener(new o3(this));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        A1().f25265t.setLayoutManager(new LinearLayoutManager(this, 1, false));
        H2();
        A1().f25260o.f28305f.setOnClickListener(new t3(this));
        A1().f25247b.setOnClickListener(new u3(this));
        A1().f25260o.f28306g.setOnClickListener(new v3(this));
        A1().f25249d.setOnClickListener(new w3(this));
        A1().f25248c.setOnClickListener(new x3(this));
        A1().f25258m.setOnClickListener(new y3(this));
        W1().e0().g(this, new j(new h(this)));
        W1().f0().g(this, new j(new i(this)));
        W1().e1().g(this, new j(new a(this)));
        W1().f1().g(this, new j(new b(this)));
        W1().D0().g(this, new j(new c(this)));
        W1().C0().g(this, new j(new d(this)));
        X1().g().g(this, new j(new e(this)));
        A1().f25257l.setOnClickListener(new z3(this));
        Y1().Z0().g(this, new a4(this));
        Y1().a1().g(this, new b4(this));
        F1().h().g(this, new j(new f(this)));
        F1().i().g(this, new j(new g(this)));
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

    public final void q2(DMSService dMSService) {
        cm.l.f(dMSService, "<set-?>");
        this.f21554e0 = dMSService;
    }

    public final void r2(je.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21553d0 = cVar;
    }

    public final void s2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21551b0 = cVar;
    }

    public final void t1(Context context, String str) {
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
        textView.setOnClickListener(new p3(dialog));
        dialog.show();
    }

    public final void t2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21556g0 = str;
    }

    public final void u2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void v1(Context context, String str) {
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
        textView.setOnClickListener(new q3(dialog, context, str, this));
        textView2.setOnClickListener(new r3(dialog, context, str, this));
        dialog.show();
    }

    public final void v2(f0 f0Var) {
        cm.l.f(f0Var, "<set-?>");
        this.J = f0Var;
    }

    public final void w2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.T = nrvDetails;
    }

    public final void x2(String str) {
        this.Z = str;
    }

    public final String y1(HashMap hashMap) {
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
        if (hashMap.containsKey(VContant.ALTERATION)) {
            return VContant.ALTERATION_PURPOSE_CODE;
        }
        return hashMap.containsKey(VContant.MULTI_SELECT_SERVICE) ? VContant.MULTISERVICE_PURPOSE_CODE : "500";
    }

    public final void y2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.K = progressDialog;
    }

    public final ArrayList z1() {
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("arrayList");
        return null;
    }

    public final void z2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }
}
