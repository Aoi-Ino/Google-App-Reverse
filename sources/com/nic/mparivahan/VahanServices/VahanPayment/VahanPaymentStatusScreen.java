package com.nic.mparivahan.VahanServices.VahanPayment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.PdfViewer.PdfViewActivity;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DownloadFormsActivity;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.VahanlogCapture;
import com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanModel.StateCostForDms;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI;
import com.nic.mparivahan.VahanServices.eSign.ModelEsign.esignModel;
import com.nic.mparivahan.VahanServices.eSign.eSignDMS;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import ni.b9;
import pl.x;
import v9.e;
import vg.k;
import vg.n;
import vg.o;

public final class VahanPaymentStatusScreen extends androidx.appcompat.app.d {
    public bi.h G;
    public VahanProService H;
    public ProgressDialog I;
    public String J;
    /* access modifiers changed from: private */
    public b9 K;
    private String L = "";
    private String M = "";
    private String N = "";
    private boolean O;
    public ld.c P;
    private StateCostForDms Q;
    private String R = "";
    private String S = "";
    public AfterPaymentResponse T;
    public BeforePaymentRequest U;
    private boolean V;
    public String W;
    public NrvDetails X;
    public String Y;
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    private boolean f21167a0;

    /* renamed from: b0  reason: collision with root package name */
    private ArrayList f21168b0 = new ArrayList();

    /* renamed from: c0  reason: collision with root package name */
    private boolean f21169c0 = true;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21170e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21170e = vahanPaymentStatusScreen;
        }

        public final void b(esignModel esignmodel) {
            this.f21170e.B1().dismiss();
            if (!ka.c.f13158a.m(esignmodel.getData())) {
                Intent intent = new Intent(this.f21170e, eSignDMS.class);
                intent.putExtra("state_code", this.f21170e.D1().getState_cd());
                b9 q12 = this.f21170e.K;
                if (q12 == null) {
                    cm.l.v("binding");
                    q12 = null;
                }
                intent.putExtra(VContant.APP_NO, q12.f25495e.getText().toString());
                intent.putExtra("rc_number", this.f21170e.D1().getRegn_no());
                intent.putExtra(VContant.PURPOSE_CODE, this.f21170e.D1().getPur_cd());
                intent.putExtra("off_code", this.f21170e.D1().getOff_cd());
                intent.putExtra(VContant.FINAL_SUBMIT, this.f21170e.C1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21170e.I1());
                intent.putExtra("RC", this.f21170e.E1());
                intent.putExtra("RcDetails", this.f21170e.F1());
                intent.putExtra("vahlogReptDate", this.f21170e.D1().getRcpt_dt());
                intent.putExtra("vahlogFeeAmt", this.f21170e.D1().getRcpt_amt());
                intent.putExtra("vahlogReptNo", this.f21170e.D1().getRcpt_NO());
                intent.putExtra("URL", q.B0(esignmodel.getData()).toString());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21170e.x1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21170e.w1());
                this.f21170e.startActivity(intent);
                this.f21170e.finish();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((esignModel) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21171e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21171e = vahanPaymentStatusScreen;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21171e.B1().isShowing()) {
                    this.f21171e.B1().dismiss();
                }
                Intent intent = new Intent(this.f21171e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21171e.D1().getPur_cd());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putExtra("RC", this.f21171e.E1());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RcDetails", this.f21171e.F1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21171e.I1());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21171e.x1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21171e.w1());
                this.f21171e.startActivity(intent);
                this.f21171e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
                if (this.f21171e.B1().isShowing()) {
                    this.f21171e.B1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21172e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21172e = vahanPaymentStatusScreen;
        }

        public final void b(String str) {
            try {
                if (this.f21172e.B1().isShowing()) {
                    this.f21172e.B1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanPaymentStatusScreen vahanPaymentStatusScreen = this.f21172e;
                    Toast.makeText(vahanPaymentStatusScreen, vahanPaymentStatusScreen.getString(R.string.no_internet), 0).show();
                    return;
                }
                this.f21172e.Q1(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21173e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21173e = vahanPaymentStatusScreen;
        }

        public final void b(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            Class<DashBoard> cls = DashBoard.class;
            if (finalRequestSubmitResponse != null) {
                try {
                    if (!finalRequestSubmitResponse.getApplication_status()) {
                        if (this.f21173e.B1().isShowing()) {
                            this.f21173e.B1().dismiss();
                        }
                        Intent intent = new Intent(this.f21173e, cls);
                        intent.addFlags(67108864);
                        this.f21173e.startActivity(intent);
                    } else if (!this.f21173e.z1()) {
                        Intent intent2 = new Intent(this.f21173e, cls);
                        intent2.addFlags(67108864);
                        this.f21173e.startActivity(intent2);
                    } else {
                        bi.h H1 = this.f21173e.H1();
                        VahanPaymentStatusScreen vahanPaymentStatusScreen = this.f21173e;
                        b9 q12 = vahanPaymentStatusScreen.K;
                        if (q12 == null) {
                            cm.l.v("binding");
                            q12 = null;
                        }
                        H1.l(vahanPaymentStatusScreen, q12.f25495e.getText().toString());
                        return;
                    }
                } catch (Exception unused) {
                    if (this.f21173e.B1().isShowing()) {
                        this.f21173e.B1().dismiss();
                    }
                    Intent intent3 = new Intent(this.f21173e, cls);
                    intent3.addFlags(67108864);
                    this.f21173e.startActivity(intent3);
                    this.f21173e.finish();
                    return;
                }
            } else {
                if (this.f21173e.B1().isShowing()) {
                    this.f21173e.B1().dismiss();
                }
                Intent intent4 = new Intent(this.f21173e, cls);
                intent4.addFlags(67108864);
                this.f21173e.startActivity(intent4);
            }
            this.f21173e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FinalRequestSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21174e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21174e = vahanPaymentStatusScreen;
        }

        public final void b(String str) {
            if (this.f21174e.B1().isShowing()) {
                this.f21174e.B1().dismiss();
            }
            Intent intent = new Intent(this.f21174e, DashBoard.class);
            intent.addFlags(67108864);
            this.f21174e.startActivity(intent);
            this.f21174e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21175e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21175e = vahanPaymentStatusScreen;
        }

        public final void b(AfterPaymentResponse afterPaymentResponse) {
            try {
                VahanPaymentStatusScreen vahanPaymentStatusScreen = this.f21175e;
                cm.l.c(afterPaymentResponse);
                vahanPaymentStatusScreen.e2(afterPaymentResponse);
                if (!this.f21175e.I1()) {
                    if (cm.l.a(this.f21175e.D1().getFacelesstransaction(), Boolean.TRUE)) {
                        this.f21175e.Z1(true);
                    } else {
                        this.f21175e.Z1(false);
                    }
                }
                this.f21175e.W1(afterPaymentResponse);
                VahanlogCapture.a aVar = VahanlogCapture.f20974k;
                VahanPaymentStatusScreen vahanPaymentStatusScreen2 = this.f21175e;
                aVar.a(vahanPaymentStatusScreen2, vahanPaymentStatusScreen2.D1(), 1);
                bi.h H1 = this.f21175e.H1();
                VahanPaymentStatusScreen vahanPaymentStatusScreen3 = this.f21175e;
                H1.g1(vahanPaymentStatusScreen3, String.valueOf(vahanPaymentStatusScreen3.D1().getState_cd()));
            } catch (Exception e10) {
                this.f21175e.B1().dismiss();
                e10.printStackTrace();
                b9 q12 = this.f21175e.K;
                if (q12 == null) {
                    cm.l.v("binding");
                    q12 = null;
                }
                q12.f25502l.setVisibility(8);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((AfterPaymentResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21176e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21176e = vahanPaymentStatusScreen;
        }

        public final void b(String str) {
            this.f21176e.B1().dismiss();
            b9 q12 = this.f21176e.K;
            if (q12 == null) {
                cm.l.v("binding");
                q12 = null;
            }
            q12.f25502l.setVisibility(8);
            if (p.o(str.toString(), "Error", true)) {
                VahanPaymentStatusScreen vahanPaymentStatusScreen = this.f21176e;
                vahanPaymentStatusScreen.l2(vahanPaymentStatusScreen, "unable to process request, please try again");
                return;
            }
            VahanPaymentStatusScreen vahanPaymentStatusScreen2 = this.f21176e;
            vahanPaymentStatusScreen2.l2(vahanPaymentStatusScreen2, str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21177e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21177e = vahanPaymentStatusScreen;
        }

        public final void b(StateCostForDms stateCostForDms) {
            StateCostForDms stateCostForDms2 = stateCostForDms;
            try {
                this.f21177e.B1().dismiss();
                if (stateCostForDms2 != null) {
                    this.f21177e.i2(stateCostForDms2);
                    List l02 = q.l0(stateCostForDms.getPur_cd(), new String[]{","}, false, 0, 6, (Object) null);
                    List l03 = q.l0(stateCostForDms.getBook_app(), new String[]{","}, false, 0, 6, (Object) null);
                    b9 b9Var = null;
                    if (stateCostForDms.getUpload_doc()) {
                        if (y.R(l02, this.f21177e.D1().getPur_cd())) {
                            this.f21177e.X1(stateCostForDms.getUpload_doc());
                            if (p.p(this.f21177e.D1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, (Object) null)) {
                                ld.c cVar = new ld.c(this.f21177e);
                                this.f21177e.X1(false);
                                b9 q12 = this.f21177e.K;
                                if (q12 == null) {
                                    cm.l.v("binding");
                                    q12 = null;
                                }
                                q12.f25499i.setText(cVar.b("label_home", "Home"));
                                b9 q13 = this.f21177e.K;
                                if (q13 == null) {
                                    cm.l.v("binding");
                                    q13 = null;
                                }
                                q13.f25497g.setText(cVar.b("print_rc_particular", "Print RC Particular Certificate"));
                                if (!ka.c.f13158a.m(stateCostForDms.getPur_cd())) {
                                    List l04 = q.l0(stateCostForDms.getPur_cd(), new String[]{","}, false, 0, 6, (Object) null);
                                    int size = l04.size();
                                    for (int i10 = 0; i10 < size; i10++) {
                                        if (q.B0(((String) l04.get(i10)).toString()).toString().equals(VContant.RCPARTICULAR_PURPOSE_CODE)) {
                                            ld.c cVar2 = new ld.c(this.f21177e);
                                            this.f21177e.X1(true);
                                            b9 q14 = this.f21177e.K;
                                            if (q14 == null) {
                                                cm.l.v("binding");
                                                q14 = null;
                                            }
                                            q14.f25497g.setVisibility(8);
                                            b9 q15 = this.f21177e.K;
                                            if (q15 == null) {
                                                cm.l.v("binding");
                                                q15 = null;
                                            }
                                            q15.f25499i.setText(cVar2.b("btn_dl_serv_next", "Next"));
                                            b9 q16 = this.f21177e.K;
                                            if (q16 == null) {
                                                cm.l.v("binding");
                                            } else {
                                                b9Var = q16;
                                            }
                                            b9Var.f25497g.setText(cVar2.b("print_rc_particular", "Print RC Particular Certificate"));
                                            return;
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (p.p(this.f21177e.D1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, (Object) null)) {
                        ld.c cVar3 = new ld.c(this.f21177e);
                        this.f21177e.X1(false);
                        b9 q17 = this.f21177e.K;
                        if (q17 == null) {
                            cm.l.v("binding");
                            q17 = null;
                        }
                        q17.f25499i.setText(cVar3.b("label_home", "Home"));
                        b9 q18 = this.f21177e.K;
                        if (q18 == null) {
                            cm.l.v("binding");
                            q18 = null;
                        }
                        q18.f25497g.setText(cVar3.b("print_rc_particular", "Print RC Particular Certificate"));
                    }
                    if (this.f21177e.I1() || !y.R(l03, this.f21177e.D1().getPur_cd())) {
                        this.f21177e.a2(false);
                        b9 q19 = this.f21177e.K;
                        if (q19 == null) {
                            cm.l.v("binding");
                        } else {
                            b9Var = q19;
                        }
                        b9Var.f25499i.setText("Home");
                        this.f21177e.k2();
                        return;
                    }
                    this.f21177e.a2(true);
                    return;
                }
                this.f21177e.B1().dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
                this.f21177e.B1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((StateCostForDms) obj);
            return x.f30437a;
        }
    }

    static final class i extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanPaymentStatusScreen f21178e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(VahanPaymentStatusScreen vahanPaymentStatusScreen) {
            super(1);
            this.f21178e = vahanPaymentStatusScreen;
        }

        public final void b(String str) {
            this.f21178e.B1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class j implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21179a;

        j(l lVar) {
            cm.l.f(lVar, "function");
            this.f21179a = lVar;
        }

        public final pl.c a() {
            return this.f21179a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21179a.invoke(obj);
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
    public static final void J1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        vahanPaymentStatusScreen.t1(vahanPaymentStatusScreen, vahanPaymentStatusScreen.A1().b("are_you_sure_you_want_to_leave", vahanPaymentStatusScreen.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void K1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        vahanPaymentStatusScreen.P1();
    }

    /* access modifiers changed from: private */
    public static final void L1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        vahanPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void M1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        b9 b9Var = vahanPaymentStatusScreen.K;
        b9 b9Var2 = null;
        if (b9Var == null) {
            cm.l.v("binding");
            b9Var = null;
        }
        String obj = b9Var.f25495e.getText().toString();
        if (obj.length() > 0) {
            Intent intent = new Intent(vahanPaymentStatusScreen, PdfViewActivity.class);
            intent.putExtra("url", hc.a.f12073a.i() + "printreciept/" + vahanPaymentStatusScreen.L + '/' + vahanPaymentStatusScreen.M + '/' + obj + '/' + vahanPaymentStatusScreen.R + '/' + vahanPaymentStatusScreen.S);
            intent.putExtra("formType", "Fee Receipt");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vahanPaymentStatusScreen.R);
            sb2.append('_');
            b9 b9Var3 = vahanPaymentStatusScreen.K;
            if (b9Var3 == null) {
                cm.l.v("binding");
            } else {
                b9Var2 = b9Var3;
            }
            sb2.append(b9Var2.f25495e.getText());
            intent.putExtra("applNo", sb2.toString());
            vahanPaymentStatusScreen.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        String str;
        List list;
        String book_app;
        VahanPaymentStatusScreen vahanPaymentStatusScreen2 = vahanPaymentStatusScreen;
        cm.l.f(vahanPaymentStatusScreen2, "this$0");
        try {
            if (vahanPaymentStatusScreen2.O) {
                boolean z10 = vahanPaymentStatusScreen2.V;
                String str2 = VContant.NEXGEN_addahar_address;
                Class<VahanDmsAPI> cls = VahanDmsAPI.class;
                if (z10) {
                    try {
                        Intent intent = new Intent(vahanPaymentStatusScreen2, cls);
                        intent.putExtra("state_code", vahanPaymentStatusScreen.D1().getState_cd());
                        b9 b9Var = vahanPaymentStatusScreen2.K;
                        if (b9Var == null) {
                            cm.l.v("binding");
                            b9Var = null;
                        }
                        intent.putExtra(VContant.APP_NO, b9Var.f25495e.getText().toString());
                        intent.putExtra("rc_number", vahanPaymentStatusScreen.D1().getRegn_no());
                        intent.putExtra(VContant.PURPOSE_CODE, vahanPaymentStatusScreen.D1().getPur_cd());
                        intent.putExtra("off_code", vahanPaymentStatusScreen.D1().getOff_cd());
                        intent.putExtra(VContant.FINAL_SUBMIT, vahanPaymentStatusScreen.C1());
                        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanPaymentStatusScreen2.V);
                        intent.putExtra("RC", vahanPaymentStatusScreen.E1());
                        intent.putExtra("RcDetails", vahanPaymentStatusScreen.F1());
                        intent.putExtra("vahlogReptDate", vahanPaymentStatusScreen.D1().getRcpt_dt());
                        intent.putExtra("vahlogFeeAmt", vahanPaymentStatusScreen.D1().getRcpt_amt());
                        intent.putExtra("vahlogReptNo", vahanPaymentStatusScreen.D1().getRcpt_NO());
                        intent.putExtra(VContant.NEXGEN_addahar_name, vahanPaymentStatusScreen.x1());
                        intent.putExtra(str2, vahanPaymentStatusScreen.w1());
                        vahanPaymentStatusScreen2.startActivity(intent);
                        vahanPaymentStatusScreen.finish();
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else {
                    StateCostForDms stateCostForDms = vahanPaymentStatusScreen2.Q;
                    if (stateCostForDms != null) {
                        if (stateCostForDms == null || (book_app = stateCostForDms.getBook_app()) == null) {
                            str = VContant.NEXGEN_addahar_name;
                            list = null;
                        } else {
                            str = VContant.NEXGEN_addahar_name;
                            list = q.l0(book_app, new String[]{","}, false, 0, 6, (Object) null);
                        }
                        cm.l.c(list);
                        if (!y.R(list, vahanPaymentStatusScreen.D1().getPur_cd())) {
                            vahanPaymentStatusScreen2.V = true;
                        }
                    } else {
                        str = VContant.NEXGEN_addahar_name;
                    }
                    Intent intent2 = new Intent(vahanPaymentStatusScreen2, cls);
                    intent2.putExtra("state_code", vahanPaymentStatusScreen.D1().getState_cd());
                    b9 b9Var2 = vahanPaymentStatusScreen2.K;
                    if (b9Var2 == null) {
                        cm.l.v("binding");
                        b9Var2 = null;
                    }
                    intent2.putExtra(VContant.APP_NO, b9Var2.f25495e.getText().toString());
                    intent2.putExtra("rc_number", vahanPaymentStatusScreen.D1().getRegn_no());
                    intent2.putExtra(VContant.PURPOSE_CODE, vahanPaymentStatusScreen.D1().getPur_cd());
                    intent2.putExtra("off_code", vahanPaymentStatusScreen.D1().getOff_cd());
                    intent2.putExtra(VContant.FINAL_SUBMIT, vahanPaymentStatusScreen.C1());
                    intent2.putExtra(VContant.NEXGEN_isFACELESS, vahanPaymentStatusScreen2.V);
                    intent2.putExtra("RC", vahanPaymentStatusScreen.E1());
                    intent2.putExtra("RcDetails", vahanPaymentStatusScreen.F1());
                    intent2.putExtra("vahlogReptDate", vahanPaymentStatusScreen.D1().getRcpt_dt());
                    intent2.putExtra("vahlogFeeAmt", vahanPaymentStatusScreen.D1().getRcpt_amt());
                    intent2.putExtra("vahlogReptNo", vahanPaymentStatusScreen.D1().getRcpt_NO());
                    intent2.putExtra(str, vahanPaymentStatusScreen.x1());
                    intent2.putExtra(str2, vahanPaymentStatusScreen.w1());
                    vahanPaymentStatusScreen2.startActivity(intent2);
                }
            } else if (p.p(vahanPaymentStatusScreen.D1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, (Object) null)) {
                Intent intent3 = new Intent(vahanPaymentStatusScreen2, DashBoard.class);
                intent3.addFlags(67108864);
                vahanPaymentStatusScreen2.startActivity(intent3);
            } else {
                if (vahanPaymentStatusScreen2.V || !vahanPaymentStatusScreen2.f21169c0) {
                    vahanPaymentStatusScreen.B1().show();
                } else {
                    vahanPaymentStatusScreen.B1().show();
                }
                vahanPaymentStatusScreen.T1();
                return;
            }
            vahanPaymentStatusScreen.finish();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        b9 b9Var = null;
        if (p.p(vahanPaymentStatusScreen.D1().getPur_cd(), VContant.RCPARTICULAR_PURPOSE_CODE, false, 2, (Object) null)) {
            b9 b9Var2 = vahanPaymentStatusScreen.K;
            if (b9Var2 == null) {
                cm.l.v("binding");
                b9Var2 = null;
            }
            String obj = b9Var2.f25495e.getText().toString();
            String rcpt_NO = vahanPaymentStatusScreen.D1().getRcpt_NO();
            String str = "https://vahan.parivahan.gov.in/vahancapi-common/getVehicleParticularDobj/" + vahanPaymentStatusScreen.M + '/' + vahanPaymentStatusScreen.R + '/' + obj + '/' + vahanPaymentStatusScreen.S + '/' + (rcpt_NO != null ? q.B0(rcpt_NO).toString() : null) + '/' + vahanPaymentStatusScreen.L;
            Intent intent = new Intent(vahanPaymentStatusScreen, PdfViewActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("formType", "RC Particular Certificate");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vahanPaymentStatusScreen.R);
            sb2.append('_');
            b9 b9Var3 = vahanPaymentStatusScreen.K;
            if (b9Var3 == null) {
                cm.l.v("binding");
            } else {
                b9Var = b9Var3;
            }
            sb2.append(b9Var.f25495e.getText());
            intent.putExtra("applNo", sb2.toString());
            vahanPaymentStatusScreen.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent(vahanPaymentStatusScreen, DownloadFormsActivity.class);
        intent2.putExtra("state_code", vahanPaymentStatusScreen.D1().getState_cd());
        intent2.putExtra("off_code", vahanPaymentStatusScreen.D1().getOff_cd());
        intent2.putExtra("rc_number", vahanPaymentStatusScreen.D1().getRegn_no());
        intent2.putExtra("appl_no", vahanPaymentStatusScreen.D1().getAppl_no());
        vahanPaymentStatusScreen.startActivity(intent2);
    }

    private final void P1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void Q1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText("Ok");
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new n(dialog));
        textView2.setOnClickListener(new o(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x032f A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008c A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bd A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e6 A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f0 A[Catch:{ Exception -> 0x0385 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0127 A[Catch:{ Exception -> 0x0385 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W1(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse r12) {
        /*
            r11 = this;
            java.lang.String r0 = "payment_failed"
            java.lang.String r1 = "payment_pending"
            java.lang.String r2 = "lbl_Payment_Success"
            ni.b9 r3 = r11.K
            java.lang.String r4 = "binding"
            r5 = 0
            if (r3 != 0) goto L_0x0011
            cm.l.v(r4)
            r3 = r5
        L_0x0011:
            android.widget.LinearLayout r3 = r3.f25502l
            r6 = 0
            r3.setVisibility(r6)
            r3 = 2132019106(0x7f1407a2, float:1.9676538E38)
            r7 = 1
            r8 = 8
            if (r12 == 0) goto L_0x0033
            java.lang.String r9 = r12.getRegn_no()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x0033
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x002d
            r9 = r7
            goto L_0x002e
        L_0x002d:
            r9 = r6
        L_0x002e:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0385 }
            goto L_0x0034
        L_0x0033:
            r9 = r5
        L_0x0034:
            cm.l.c(r9)     // Catch:{ Exception -> 0x0385 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x0054
            java.lang.String r9 = r12.getRegn_no()     // Catch:{ Exception -> 0x0385 }
            r11.R = r9     // Catch:{ Exception -> 0x0385 }
            ni.b9 r9 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r9 != 0) goto L_0x004b
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r9 = r5
        L_0x004b:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f25508r     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = r12.getRegn_no()     // Catch:{ Exception -> 0x0385 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0385 }
        L_0x0054:
            java.lang.String r9 = r12.getAppl_no()     // Catch:{ Exception -> 0x0385 }
            cm.l.c(r9)     // Catch:{ Exception -> 0x0385 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x0072
            ni.b9 r9 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r9 != 0) goto L_0x0069
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r9 = r5
        L_0x0069:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f25495e     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = r12.getAppl_no()     // Catch:{ Exception -> 0x0385 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0385 }
        L_0x0072:
            java.lang.String r9 = r12.getRcpt_NO()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x0099
            java.lang.String r9 = r12.getRcpt_NO()     // Catch:{ Exception -> 0x0385 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x0099
            java.lang.String r9 = r12.getRcpt_NO()     // Catch:{ Exception -> 0x0385 }
            r11.N = r9     // Catch:{ Exception -> 0x0385 }
            ni.b9 r9 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r9 != 0) goto L_0x0090
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r9 = r5
        L_0x0090:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f25505o     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = r12.getRcpt_NO()     // Catch:{ Exception -> 0x0385 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0385 }
        L_0x0099:
            java.lang.String r9 = r12.getOwner_name()     // Catch:{ Exception -> 0x0385 }
            cm.l.c(r9)     // Catch:{ Exception -> 0x0385 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x00b7
            ni.b9 r9 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r9 != 0) goto L_0x00ae
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r9 = r5
        L_0x00ae:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f25501k     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = r12.getOwner_name()     // Catch:{ Exception -> 0x0385 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0385 }
        L_0x00b7:
            java.lang.Double r9 = r12.getRcpt_amt()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x00d2
            ni.b9 r9 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r9 != 0) goto L_0x00c5
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r9 = r5
        L_0x00c5:
            androidx.appcompat.widget.AppCompatTextView r9 = r9.f25493c     // Catch:{ Exception -> 0x0385 }
            java.lang.Double r10 = r12.getRcpt_amt()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0385 }
            r9.setText(r10)     // Catch:{ Exception -> 0x0385 }
        L_0x00d2:
            java.lang.String r9 = r12.getState_cd()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x00e6
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x00e0
            r9 = r7
            goto L_0x00e1
        L_0x00e0:
            r9 = r6
        L_0x00e1:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ Exception -> 0x0385 }
            goto L_0x00e7
        L_0x00e6:
            r9 = r5
        L_0x00e7:
            cm.l.c(r9)     // Catch:{ Exception -> 0x0385 }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x00f6
            java.lang.String r9 = r12.getState_cd()     // Catch:{ Exception -> 0x0385 }
            r11.L = r9     // Catch:{ Exception -> 0x0385 }
        L_0x00f6:
            java.lang.String r9 = r12.getOff_cd()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x0108
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x0108
            java.lang.String r9 = r12.getOff_cd()     // Catch:{ Exception -> 0x0385 }
            r11.M = r9     // Catch:{ Exception -> 0x0385 }
        L_0x0108:
            java.lang.String r9 = r12.getPur_cd()     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x011a
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x011a
            java.lang.String r9 = r12.getPur_cd()     // Catch:{ Exception -> 0x0385 }
            r11.S = r9     // Catch:{ Exception -> 0x0385 }
        L_0x011a:
            java.lang.String r9 = r12.getStatus()     // Catch:{ Exception -> 0x0385 }
            cm.l.c(r9)     // Catch:{ Exception -> 0x0385 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0385 }
            if (r9 <= 0) goto L_0x032f
            java.lang.String r9 = r12.getStatus()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r10 = "S"
            boolean r9 = km.p.o(r9, r10, r7)     // Catch:{ Exception -> 0x0385 }
            if (r9 == 0) goto L_0x01c5
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x013b
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x013b:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r6)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0148
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0148:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r0 = 2131231561(0x7f080349, float:1.8079206E38)
            r12.setImageResource(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0158
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0158:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            ld.c r0 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            r1 = 2132018669(0x7f1405ed, float:1.9675651E38)
            java.lang.String r6 = r11.getString(r1)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r0 = r0.b(r2, r6)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0176
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0176:
            androidx.appcompat.widget.AppCompatTextView r12 = r12.f25510t     // Catch:{ Exception -> 0x0385 }
            ld.c r0 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r0 = r0.b(r2, r1)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x018f
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x018f:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            r0 = 2131099810(0x7f0600a2, float:1.7811984E38)
            int r0 = androidx.core.content.a.c(r11, r0)     // Catch:{ Exception -> 0x0385 }
            r12.setTextColor(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x01a5
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x01a5:
            com.nic.mparivahan.MyTextView r12 = r12.f25496f     // Catch:{ Exception -> 0x0385 }
            ld.c r0 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r1 = "btn_Download_Fee_Receipt"
            java.lang.String r2 = "Download Fee Receipt"
            java.lang.String r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x01be
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x01be:
            com.nic.mparivahan.MyTextView r12 = r12.f25511u     // Catch:{ Exception -> 0x0385 }
        L_0x01c0:
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            goto L_0x03dd
        L_0x01c5:
            java.lang.String r2 = r12.getStatus()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r9 = "P"
            boolean r2 = km.p.o(r2, r9, r7)     // Catch:{ Exception -> 0x0385 }
            if (r2 == 0) goto L_0x027b
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x01d9
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x01d9:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r6)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x01e6
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x01e6:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r0 = 2131231338(0x7f08026a, float:1.8078754E38)
            r12.setImageResource(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x01f6
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x01f6:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            ld.c r0 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            r2 = 2132018664(0x7f1405e8, float:1.9675641E38)
            java.lang.String r7 = r11.getString(r2)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r0 = r0.b(r1, r7)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0214
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0214:
            androidx.appcompat.widget.AppCompatTextView r12 = r12.f25510t     // Catch:{ Exception -> 0x0385 }
            ld.c r0 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r2 = r11.getString(r2)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x022d
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x022d:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            r0 = 2131099703(0x7f060037, float:1.7811767E38)
            int r0 = androidx.core.content.a.c(r11, r0)     // Catch:{ Exception -> 0x0385 }
            r12.setTextColor(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0243
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0243:
            com.nic.mparivahan.MyTextView r12 = r12.f25496f     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0250
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0250:
            com.nic.mparivahan.MyTextView r12 = r12.f25499i     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x025d
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x025d:
            com.nic.mparivahan.MyTextView r12 = r12.f25511u     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r6)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x026a
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x026a:
            com.nic.mparivahan.MyTextView r12 = r12.f25497g     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0277
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0277:
            android.widget.RelativeLayout r12 = r12.f25506p     // Catch:{ Exception -> 0x0385 }
            goto L_0x01c0
        L_0x027b:
            java.lang.String r12 = r12.getStatus()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r1 = "F"
            boolean r12 = km.p.o(r12, r1, r7)     // Catch:{ Exception -> 0x0385 }
            if (r12 == 0) goto L_0x03dd
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x028f
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x028f:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r6)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x029c
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x029c:
            androidx.appcompat.widget.AppCompatImageView r12 = r12.f25503m     // Catch:{ Exception -> 0x0385 }
            r1 = 2131231382(0x7f080296, float:1.8078843E38)
            r12.setImageResource(r1)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x02ac
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x02ac:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            ld.c r1 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            r2 = 2132018660(0x7f1405e4, float:1.9675633E38)
            java.lang.String r7 = r11.getString(r2)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r1 = r1.b(r0, r7)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r1)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x02ca
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x02ca:
            androidx.appcompat.widget.AppCompatTextView r12 = r12.f25510t     // Catch:{ Exception -> 0x0385 }
            ld.c r1 = r11.A1()     // Catch:{ Exception -> 0x0385 }
            java.lang.String r2 = r11.getString(r2)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r0 = r1.b(r0, r2)     // Catch:{ Exception -> 0x0385 }
            r12.setText(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x02e3
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x02e3:
            ni.qd r12 = r12.f25509s     // Catch:{ Exception -> 0x0385 }
            android.widget.TextView r12 = r12.f28308i     // Catch:{ Exception -> 0x0385 }
            r0 = 2131100500(0x7f060354, float:1.7813383E38)
            int r0 = androidx.core.content.a.c(r11, r0)     // Catch:{ Exception -> 0x0385 }
            r12.setTextColor(r0)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x02f9
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x02f9:
            com.nic.mparivahan.MyTextView r12 = r12.f25496f     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0306
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0306:
            com.nic.mparivahan.MyTextView r12 = r12.f25499i     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0313
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0313:
            com.nic.mparivahan.MyTextView r12 = r12.f25511u     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r6)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0320
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0320:
            com.nic.mparivahan.MyTextView r12 = r12.f25497g     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0277
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
            goto L_0x0277
        L_0x032f:
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0337
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0337:
            com.nic.mparivahan.MyTextView r12 = r12.f25496f     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0344
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0344:
            com.nic.mparivahan.MyTextView r12 = r12.f25499i     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0351
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0351:
            com.nic.mparivahan.MyTextView r12 = r12.f25511u     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x035e
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x035e:
            com.nic.mparivahan.MyTextView r12 = r12.f25497g     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x036b
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x036b:
            android.widget.RelativeLayout r12 = r12.f25506p     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            ni.b9 r12 = r11.K     // Catch:{ Exception -> 0x0385 }
            if (r12 != 0) goto L_0x0378
            cm.l.v(r4)     // Catch:{ Exception -> 0x0385 }
            r12 = r5
        L_0x0378:
            android.widget.LinearLayout r12 = r12.f25498h     // Catch:{ Exception -> 0x0385 }
            r12.setVisibility(r8)     // Catch:{ Exception -> 0x0385 }
            java.lang.String r12 = r11.getString(r3)     // Catch:{ Exception -> 0x0385 }
            r11.l2(r11, r12)     // Catch:{ Exception -> 0x0385 }
            goto L_0x03dd
        L_0x0385:
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x038d
            cm.l.v(r4)
            r12 = r5
        L_0x038d:
            ni.qd r12 = r12.f25509s
            android.widget.TextView r12 = r12.f28308i
            r12.setVisibility(r8)
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x039c
            cm.l.v(r4)
            r12 = r5
        L_0x039c:
            com.nic.mparivahan.MyTextView r12 = r12.f25496f
            r12.setVisibility(r8)
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x03a9
            cm.l.v(r4)
            r12 = r5
        L_0x03a9:
            com.nic.mparivahan.MyTextView r12 = r12.f25499i
            r12.setVisibility(r8)
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x03b6
            cm.l.v(r4)
            r12 = r5
        L_0x03b6:
            com.nic.mparivahan.MyTextView r12 = r12.f25511u
            r12.setVisibility(r8)
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x03c3
            cm.l.v(r4)
            r12 = r5
        L_0x03c3:
            com.nic.mparivahan.MyTextView r12 = r12.f25497g
            r12.setVisibility(r8)
            ni.b9 r12 = r11.K
            if (r12 != 0) goto L_0x03d0
            cm.l.v(r4)
            goto L_0x03d1
        L_0x03d0:
            r5 = r12
        L_0x03d1:
            android.widget.RelativeLayout r12 = r5.f25506p
            r12.setVisibility(r8)
            java.lang.String r12 = r11.getString(r3)
            r11.l2(r11, r12)
        L_0x03dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanPayment.VahanPaymentStatusScreen.W1(com.nic.mparivahan.VahanServices.VahanModel.AfterPaymentResponse):void");
    }

    /* access modifiers changed from: private */
    public static final void m2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void u1(Dialog dialog, VahanPaymentStatusScreen vahanPaymentStatusScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanPaymentStatusScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(vahanPaymentStatusScreen, DashBoard.class);
        new ld.e(vahanPaymentStatusScreen).h(1);
        intent.addFlags(67108864);
        vahanPaymentStatusScreen.startActivity(intent);
        vahanPaymentStatusScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void v1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final ld.c A1() {
        ld.c cVar = this.P;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }

    public final ProgressDialog B1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final BeforePaymentRequest C1() {
        BeforePaymentRequest beforePaymentRequest = this.U;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        cm.l.v("paymentRequest");
        return null;
    }

    public final AfterPaymentResponse D1() {
        AfterPaymentResponse afterPaymentResponse = this.T;
        if (afterPaymentResponse != null) {
            return afterPaymentResponse;
        }
        cm.l.v("payment_response");
        return null;
    }

    public final String E1() {
        String str = this.W;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final NrvDetails F1() {
        NrvDetails nrvDetails = this.X;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService G1() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final bi.h H1() {
        bi.h hVar = this.G;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final boolean I1() {
        return this.V;
    }

    public final void T1() {
        String aadharauth = C1().getAadharauth();
        b9 b9Var = this.K;
        if (b9Var == null) {
            cm.l.v("binding");
            b9Var = null;
        }
        BeforePaymentRequestfinal beforePaymentRequestfinal = r0;
        BeforePaymentRequestfinal beforePaymentRequestfinal2 = new BeforePaymentRequestfinal(aadharauth, b9Var.f25495e.getText().toString(), C1().getChanngeOfAdressDto(), C1().getComp_cd(), C1().getDurcdto(), C1().getFir_dt(), C1().getFir_no(), C1().getHpaDto(), C1().getHptDto(), C1().getIdv(), String.valueOf(C1().getIns_from()), C1().getIns_type(), String.valueOf(C1().getIns_upto()), C1().getMsg().toString(), C1().getNocDto(), C1().getOff_cd().toString(), C1().getOp_dt().toString(), C1().getPolice_station().toString(), C1().getPolicy_no().toString(), C1().getPur_cd().toString(), String.valueOf(D1().getRcpt_dt()), String.valueOf(D1().getRcpt_NO()), String.valueOf(D1().getRcpt_amt()), C1().getReason(), C1().getRegn_no().toString(), C1().getState_cd().toString(), C1().getState_header().toString(), C1().getStatus().toString(), C1().getTax_mode().toString(), C1().getVh_class());
        H1().o1(beforePaymentRequestfinal);
    }

    public final void U1(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void V1(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }

    public final void X1(boolean z10) {
        this.O = z10;
    }

    public final void Y1(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final void Z1(boolean z10) {
        this.V = z10;
    }

    public final void a2(boolean z10) {
        this.f21169c0 = z10;
    }

    public final void b2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.P = cVar;
    }

    public final void c2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void d2(BeforePaymentRequest beforePaymentRequest) {
        cm.l.f(beforePaymentRequest, "<set-?>");
        this.U = beforePaymentRequest;
    }

    public final void e2(AfterPaymentResponse afterPaymentResponse) {
        cm.l.f(afterPaymentResponse, "<set-?>");
        this.T = afterPaymentResponse;
    }

    public final void f2(String str) {
        cm.l.f(str, "<set-?>");
        this.W = str;
    }

    public final void g2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.X = nrvDetails;
    }

    public final void h2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final void i2(StateCostForDms stateCostForDms) {
        this.Q = stateCostForDms;
    }

    public final void j2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.G = hVar;
    }

    public final void k2() {
        String aadharauth = C1().getAadharauth();
        b9 b9Var = this.K;
        if (b9Var == null) {
            cm.l.v("binding");
            b9Var = null;
        }
        BeforePaymentRequestfinal beforePaymentRequestfinal = r0;
        BeforePaymentRequestfinal beforePaymentRequestfinal2 = new BeforePaymentRequestfinal(aadharauth, b9Var.f25495e.getText().toString(), C1().getChanngeOfAdressDto(), C1().getComp_cd(), C1().getDurcdto(), C1().getFir_dt(), C1().getFir_no(), C1().getHpaDto(), C1().getHptDto(), C1().getIdv(), String.valueOf(C1().getIns_from()), C1().getIns_type(), String.valueOf(C1().getIns_upto()), C1().getMsg().toString(), C1().getNocDto(), C1().getOff_cd().toString(), C1().getOp_dt().toString(), C1().getPolice_station().toString(), C1().getPolicy_no().toString(), C1().getPur_cd().toString(), String.valueOf(D1().getRcpt_dt()), String.valueOf(D1().getRcpt_NO()), String.valueOf(D1().getRcpt_amt()), C1().getReason(), C1().getRegn_no().toString(), C1().getState_cd().toString(), C1().getState_header().toString(), C1().getStatus().toString(), C1().getTax_mode().toString(), C1().getVh_class());
        H1().p1(beforePaymentRequestfinal);
    }

    public final void l2(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new vg.f(dialog));
        dialog.show();
    }

    public void onBackPressed() {
        t1(this, A1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vahan_payment_status_screen);
        b9 c10 = b9.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        this.K = c10;
        b9 b9Var = null;
        if (c10 == null) {
            cm.l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        getWindow().addFlags(128);
        e.a aVar = v9.e.f17509a;
        b9 b9Var2 = this.K;
        if (b9Var2 == null) {
            cm.l.v("binding");
            b9Var2 = null;
        }
        aVar.i2(this, b9Var2);
        b2(new ld.c(this));
        h2(VahanProService.f21196b.b(this));
        Y1(String.valueOf(getIntent().getStringExtra("EncString")));
        Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
        cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
        d2((BeforePaymentRequest) serializableExtra);
        this.V = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
        V1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
        U1(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
        f2(String.valueOf(getIntent().getStringExtra("RC")));
        Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
        cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
        g2((NrvDetails) serializableExtra2);
        this.f21167a0 = getIntent().getBooleanExtra("isPaymentPending", false);
        c2(new ProgressDialog(this));
        B1().setMessage("Please wait...");
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        j2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(G1()))).a(bi.h.class));
        B1().show();
        H1().p(this, y1());
        H1().w0().g(this, new j(new f(this)));
        H1().x0().g(this, new j(new g(this)));
        b9 b9Var3 = this.K;
        if (b9Var3 == null) {
            cm.l.v("binding");
            b9Var3 = null;
        }
        b9Var3.f25509s.f28305f.setOnClickListener(new vg.h(this));
        b9 b9Var4 = this.K;
        if (b9Var4 == null) {
            cm.l.v("binding");
            b9Var4 = null;
        }
        b9Var4.f25509s.f28306g.setOnClickListener(new vg.i(this));
        b9 b9Var5 = this.K;
        if (b9Var5 == null) {
            cm.l.v("binding");
            b9Var5 = null;
        }
        b9Var5.f25511u.setOnClickListener(new vg.j(this));
        b9 b9Var6 = this.K;
        if (b9Var6 == null) {
            cm.l.v("binding");
            b9Var6 = null;
        }
        b9Var6.f25496f.setOnClickListener(new k(this));
        b9 b9Var7 = this.K;
        if (b9Var7 == null) {
            cm.l.v("binding");
            b9Var7 = null;
        }
        b9Var7.f25499i.setOnClickListener(new vg.l(this));
        H1().g0().g(this, new j(new h(this)));
        H1().h0().g(this, new j(new i(this)));
        H1().N().g(this, new j(new a(this)));
        H1().T0().g(this, new j(new b(this)));
        H1().S0().g(this, new j(new c(this)));
        H1().Q().g(this, new j(new d(this)));
        H1().R().g(this, new j(new e(this)));
        b9 b9Var8 = this.K;
        if (b9Var8 == null) {
            cm.l.v("binding");
        } else {
            b9Var = b9Var8;
        }
        b9Var.f25497g.setOnClickListener(new vg.m(this));
    }

    public final void t1(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ld.c cVar = new ld.c(this);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new vg.e(dialog, this));
        textView2.setOnClickListener(new vg.g(dialog));
        dialog.show();
    }

    public final String w1() {
        String str = this.Z;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final String x1() {
        String str = this.Y;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final String y1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("enc_string");
        return null;
    }

    public final boolean z1() {
        return this.f21169c0;
    }
}
