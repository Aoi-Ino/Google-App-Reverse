package com.nic.mparivahan.VahanServices.Nominee;

import android.app.DatePickerDialog;
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
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.g;
import bi.l;
import cm.m;
import cm.u;
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
import com.nic.mparivahan.VahanServices.VahanView.VahanGenerateOTPScreen;
import com.nic.mparivahan.VahanServices.VahanView.VahanProcessWithAdhar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import ld.h;
import ni.kc;
import pl.x;
import vf.k;
import vf.n;
import vf.o;
import vf.p;
import vf.q;
import vf.r;
import vf.s;
import vf.t;
import vf.v;
import vf.w;
import wd.l0;

public final class NomineeMainViewScreen extends androidx.appcompat.app.d implements l0 {
    public kc G;
    public DatabaseHelper H;
    public ProgressDialog I;
    public l J;
    public VahanServiceConnection K;
    public String L;
    private String M = " ";
    public h N;
    public bi.h O;
    public VahanProService P;
    public NrvDetails Q;
    public bi.h R;
    public VahanProService S;
    private HashMap T = new HashMap();
    private String U = "";
    private String V = "NA";
    private String W = "0";
    private String X = "NA";
    public ld.c Y;
    private ArrayList Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    private String f20681a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f20682b0 = "";

    static final class a extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeMainViewScreen f20683e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(NomineeMainViewScreen nomineeMainViewScreen) {
            super(1);
            this.f20683e = nomineeMainViewScreen;
        }

        public final void b(String str) {
            this.f20683e.B1().dismiss();
            NomineeMainViewScreen nomineeMainViewScreen = this.f20683e;
            nomineeMainViewScreen.p2(nomineeMainViewScreen, nomineeMainViewScreen.z1().b("record_error_msg", this.f20683e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeMainViewScreen f20684e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(NomineeMainViewScreen nomineeMainViewScreen) {
            super(1);
            this.f20684e = nomineeMainViewScreen;
        }

        public final void b(GetStateCode getStateCode) {
            if (getStateCode != null) {
                try {
                    if (!ka.c.f13158a.m(getStateCode.getStateCd())) {
                        String valueOf = String.valueOf(this.f20684e.y1().f27172h.getText());
                        this.f20684e.g2(valueOf);
                        if (valueOf.length() > 0) {
                            String valueOf2 = String.valueOf(this.f20684e.y1().f27167c.getText());
                            bi.h J1 = this.f20684e.J1();
                            NomineeMainViewScreen nomineeMainViewScreen = this.f20684e;
                            String stateCd = getStateCode.getStateCd();
                            String y10 = VContant.Companion.y(this.f20684e.H1());
                            String substring = valueOf2.substring(valueOf2.length() - 5, valueOf2.length());
                            cm.l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            J1.A0(nomineeMainViewScreen, valueOf, stateCd, y10, substring);
                            return;
                        }
                        return;
                    }
                    this.f20684e.B1().dismiss();
                    NomineeMainViewScreen nomineeMainViewScreen2 = this.f20684e;
                    nomineeMainViewScreen2.p2(nomineeMainViewScreen2, nomineeMainViewScreen2.z1().b("record_error_msg", this.f20684e.getString(R.string.service_unavable_please_try)));
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f20684e.B1().dismiss();
                }
            } else {
                this.f20684e.B1().dismiss();
                NomineeMainViewScreen nomineeMainViewScreen3 = this.f20684e;
                nomineeMainViewScreen3.p2(nomineeMainViewScreen3, nomineeMainViewScreen3.z1().b("record_error_msg", this.f20684e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetStateCode) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeMainViewScreen f20685e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(NomineeMainViewScreen nomineeMainViewScreen) {
            super(1);
            this.f20685e = nomineeMainViewScreen;
        }

        public final void b(String str) {
            this.f20685e.B1().dismiss();
            if (p.o(str, "Error", true)) {
                NomineeMainViewScreen nomineeMainViewScreen = this.f20685e;
                nomineeMainViewScreen.p2(nomineeMainViewScreen, nomineeMainViewScreen.z1().b("record_error_msg", this.f20685e.getString(R.string.service_unavable_please_try)));
                return;
            }
            NomineeMainViewScreen nomineeMainViewScreen2 = this.f20685e;
            nomineeMainViewScreen2.p2(nomineeMainViewScreen2, str.toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeMainViewScreen f20686e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(NomineeMainViewScreen nomineeMainViewScreen) {
            super(1);
            this.f20686e = nomineeMainViewScreen;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x00e6 A[Catch:{ Exception -> 0x0044 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x010d A[Catch:{ Exception -> 0x0044 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit r6) {
            /*
                r5 = this;
                java.lang.String r0 = r6.getRegn_no()     // Catch:{ Exception -> 0x0044 }
                if (r0 == 0) goto L_0x0210
                int r0 = r0.length()     // Catch:{ Exception -> 0x0044 }
                if (r0 != 0) goto L_0x000e
                goto L_0x0210
            L_0x000e:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r1 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x0044 }
                cm.l.c(r6)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r1.c(r6)     // Catch:{ Exception -> 0x0044 }
                r0.d2(r1)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r6.getState_name()     // Catch:{ Exception -> 0x0044 }
                if (r0 == 0) goto L_0x0047
                int r0 = r0.length()     // Catch:{ Exception -> 0x0044 }
                if (r0 != 0) goto L_0x0029
                goto L_0x0047
            L_0x0029:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.lang.Integer r1 = r6.getOff_cd()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0044 }
                r0.e2(r1)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.lang.Long r6 = r6.getMobile_no()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0044 }
                r0.c2(r6)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0054
            L_0x0044:
                r6 = move-exception
                goto L_0x0236
            L_0x0047:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.lang.Integer r6 = r6.getOff_cd()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0044 }
                r0.e2(r6)     // Catch:{ Exception -> 0x0044 }
            L_0x0054:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r6 = r6.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.getRc_regn_no()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.add(r0)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r6 = r6.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.getRc_chasi_no()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.add(r0)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r6 = r6.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.getRc_eng_no()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.add(r0)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r6 = r6.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.getRc_regn_dt()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.add(r0)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r6 = r6.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.getRc_fit_upto()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.add(r0)     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanUtils.VUtility$a r6 = com.nic.mparivahan.VahanServices.VahanUtils.VUtility.Companion     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r0 = r0.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r1 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ni.kc r1 = r1.y1()     // Catch:{ Exception -> 0x0044 }
                androidx.appcompat.widget.AppCompatEditText r1 = r1.f27172h     // Catch:{ Exception -> 0x0044 }
                android.text.Editable r1 = r1.getText()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0044 }
                boolean r0 = r6.r0(r0, r1)     // Catch:{ Exception -> 0x0044 }
                r1 = 1
                if (r0 != 0) goto L_0x010d
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = "please_enter_valid_reg"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r3 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r4 = 2132018777(0x7f140659, float:1.967587E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0044 }
                android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)     // Catch:{ Exception -> 0x0044 }
            L_0x0108:
                r6.show()     // Catch:{ Exception -> 0x0044 }
                goto L_0x0242
            L_0x010d:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r0 = r0.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r2 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ni.kc r2 = r2.y1()     // Catch:{ Exception -> 0x0044 }
                androidx.appcompat.widget.AppCompatEditText r2 = r2.f27167c     // Catch:{ Exception -> 0x0044 }
                android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0044 }
                boolean r0 = r6.r0(r0, r2)     // Catch:{ Exception -> 0x0044 }
                if (r0 != 0) goto L_0x014c
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = "please_enter_valid_chaissis_no"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r3 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r4 = 2132018768(0x7f140650, float:1.9675852E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0044 }
                android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0108
            L_0x014c:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r0 = r0.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r2 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ni.kc r2 = r2.y1()     // Catch:{ Exception -> 0x0044 }
                androidx.appcompat.widget.AppCompatEditText r2 = r2.f27169e     // Catch:{ Exception -> 0x0044 }
                android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x0044 }
                boolean r0 = r6.r0(r0, r2)     // Catch:{ Exception -> 0x0044 }
                if (r0 != 0) goto L_0x018c
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = "please_enter_valid_engine_no"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r3 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r4 = 2132018770(0x7f140652, float:1.9675856E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0044 }
                android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0108
            L_0x018c:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r0 = r0.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r2 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = r2.D1()     // Catch:{ Exception -> 0x0044 }
                boolean r0 = r6.r0(r0, r2)     // Catch:{ Exception -> 0x0044 }
                if (r0 != 0) goto L_0x01c2
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = "please_enter_valid_reg_date"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r3 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r4 = 2132018778(0x7f14065a, float:1.9675872E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0044 }
                android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0108
            L_0x01c2:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.util.ArrayList r0 = r0.C1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r2 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = r2.E1()     // Catch:{ Exception -> 0x0044 }
                boolean r6 = r6.r0(r0, r2)     // Catch:{ Exception -> 0x0044 }
                if (r6 != 0) goto L_0x01f8
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r2 = "please_enter_valid_reg_upto_date"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r3 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r4 = 2132018779(0x7f14065b, float:1.9675874E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r2, r3)     // Catch:{ Exception -> 0x0044 }
                android.widget.Toast r6 = android.widget.Toast.makeText(r6, r0, r1)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0108
            L_0x01f8:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                bi.h r6 = r6.L1()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r1 = r0.A1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r1 = r1.getState_cd()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0044 }
                r6.i(r0, r1)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0242
            L_0x0210:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                android.app.ProgressDialog r6 = r6.B1()     // Catch:{ Exception -> 0x0044 }
                r6.dismiss()     // Catch:{ Exception -> 0x0044 }
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r6 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                ld.c r0 = r6.z1()     // Catch:{ Exception -> 0x0044 }
                java.lang.String r1 = "no_details_found"
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r2 = r5.f20686e     // Catch:{ Exception -> 0x0044 }
                r3 = 2132018525(0x7f14055d, float:1.967536E38)
                java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = r0.b(r1, r2)     // Catch:{ Exception -> 0x0044 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0044 }
                r6.s1(r6, r0)     // Catch:{ Exception -> 0x0044 }
                goto L_0x0242
            L_0x0236:
                com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen r0 = r5.f20686e
                android.app.ProgressDialog r0 = r0.B1()
                r0.dismiss()
                r6.printStackTrace()
            L_0x0242:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.Nominee.NomineeMainViewScreen.d.b(com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ NomineeMainViewScreen f20687e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(NomineeMainViewScreen nomineeMainViewScreen) {
            super(1);
            this.f20687e = nomineeMainViewScreen;
        }

        public final void b(String str) {
            this.f20687e.B1().dismiss();
            NomineeMainViewScreen nomineeMainViewScreen = this.f20687e;
            nomineeMainViewScreen.p2(nomineeMainViewScreen, nomineeMainViewScreen.z1().b("record_error_msg", this.f20687e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f20688a;

        f(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f20688a = lVar;
        }

        public final pl.c a() {
            return this.f20688a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f20688a.invoke(obj);
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
    public static final void M1(NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        nomineeMainViewScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void N1(NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        if (nomineeMainViewScreen.r2()) {
            nomineeMainViewScreen.U = String.valueOf(nomineeMainViewScreen.y1().f27172h.getText());
            nomineeMainViewScreen.B1().show();
            nomineeMainViewScreen.J1().n(nomineeMainViewScreen, String.valueOf(nomineeMainViewScreen.y1().f27172h.getText()));
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        nomineeMainViewScreen.T1();
    }

    /* access modifiers changed from: private */
    public static final void P1(NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        nomineeMainViewScreen.W1();
    }

    /* access modifiers changed from: private */
    public static final void Q1(NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        nomineeMainViewScreen.U1();
    }

    /* access modifiers changed from: private */
    public static final void R1(NomineeMainViewScreen nomineeMainViewScreen, vahanOnlineCheck vahanonlinecheck) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        try {
            nomineeMainViewScreen.B1().dismiss();
            nomineeMainViewScreen.o2(vahanonlinecheck.getService_auth_mode().toString());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public static final void S1(NomineeMainViewScreen nomineeMainViewScreen, String str) {
        cm.l.f(nomineeMainViewScreen, "this$0");
        nomineeMainViewScreen.B1().dismiss();
        nomineeMainViewScreen.p2(nomineeMainViewScreen, nomineeMainViewScreen.z1().b("record_error_msg", nomineeMainViewScreen.getString(R.string.service_unavable_please_try)));
    }

    private final void T1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void U1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new vf.m(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void V1(u uVar, u uVar2, NomineeMainViewScreen nomineeMainViewScreen, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(nomineeMainViewScreen, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        nomineeMainViewScreen.f20681a0 = sb4.toString();
        AppCompatTextView appCompatTextView = nomineeMainViewScreen.y1().f27173i;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatTextView.setText(sb5.toString());
    }

    private final void W1() {
        Calendar instance = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new n(new u(), new u(), this), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.show();
        datePickerDialog.getButton(-1).setTextColor(androidx.core.content.a.c(this, R.color.black));
        datePickerDialog.getButton(-2).setTextColor(androidx.core.content.a.c(this, R.color.red_new));
    }

    /* access modifiers changed from: private */
    public static final void X1(u uVar, u uVar2, NomineeMainViewScreen nomineeMainViewScreen, DatePicker datePicker, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        cm.l.f(uVar, "$dayStartString");
        cm.l.f(uVar2, "$dayStartMonth");
        cm.l.f(nomineeMainViewScreen, "this$0");
        if (String.valueOf(i12).length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('0');
            sb2.append(i12);
            str = sb2.toString();
        } else {
            str = String.valueOf(i12);
        }
        uVar.f20234e = str;
        int i13 = i11 + 1;
        if (String.valueOf(i13).length() < 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('0');
            sb3.append(i13);
            str2 = sb3.toString();
        } else {
            str2 = String.valueOf(i13);
        }
        uVar2.f20234e = str2;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(i10);
        sb4.append('-');
        Object obj = uVar2.f20234e;
        String str6 = null;
        if (obj == null) {
            cm.l.v("dayStartMonth");
            str3 = null;
        } else {
            str3 = (String) obj;
        }
        sb4.append(str3);
        sb4.append('-');
        Object obj2 = uVar.f20234e;
        if (obj2 == null) {
            cm.l.v("dayStartString");
            str4 = null;
        } else {
            str4 = (String) obj2;
        }
        sb4.append(str4);
        nomineeMainViewScreen.f20682b0 = sb4.toString();
        AppCompatTextView appCompatTextView = nomineeMainViewScreen.y1().f27177m;
        StringBuilder sb5 = new StringBuilder();
        Object obj3 = uVar.f20234e;
        if (obj3 == null) {
            cm.l.v("dayStartString");
            str5 = null;
        } else {
            str5 = (String) obj3;
        }
        sb5.append(str5);
        sb5.append('-');
        Object obj4 = uVar2.f20234e;
        if (obj4 == null) {
            cm.l.v("dayStartMonth");
        } else {
            str6 = (String) obj4;
        }
        sb5.append(str6);
        sb5.append('-');
        sb5.append(i10);
        appCompatTextView.setText(sb5.toString());
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean r2() {
        View view;
        AppCompatEditText appCompatEditText;
        String b10;
        AppCompatEditText appCompatEditText2;
        String b11;
        AppCompatEditText appCompatEditText3;
        String b12;
        Editable text = y1().f27172h.getText();
        if (text != null && text.length() == 0) {
            appCompatEditText3 = y1().f27172h;
            b12 = z1().b("PLEASE_ENTER_REG", getString(R.string.please_enter_reg_no));
        } else if (String.valueOf(y1().f27172h.getText()).length() < 4) {
            appCompatEditText3 = y1().f27172h;
            b12 = z1().b("label_challan_rc_validation", "Please enter vehicle number.Minimum 4 & maximum 10 character with no special character");
        } else {
            Editable text2 = y1().f27167c.getText();
            if (text2 != null && text2.length() == 0) {
                appCompatEditText2 = y1().f27167c;
                b11 = z1().b("PLEASE_ENTER_CHASSI", getString(R.string.please_enter_chassis_no));
            } else if (String.valueOf(y1().f27167c.getText()).length() < 5) {
                appCompatEditText2 = y1().f27167c;
                b11 = z1().b("INVALID_CHASSI", getString(R.string.invalid_chassis_no));
            } else {
                Editable text3 = y1().f27169e.getText();
                if (text3 != null && text3.length() == 0) {
                    appCompatEditText = y1().f27169e;
                    b10 = z1().b("label_challan_enter_engine_no", getString(R.string.invalid_chassis_no));
                } else if (String.valueOf(y1().f27169e.getText()).length() < 5) {
                    appCompatEditText = y1().f27169e;
                    b10 = z1().b("INVALID_ENGINE", getString(R.string.invalid_engine_no));
                } else {
                    CharSequence text4 = y1().f27173i.getText();
                    if (text4 == null || text4.length() != 0) {
                        CharSequence text5 = y1().f27177m.getText();
                        if (text5 == null || text5.length() != 0) {
                            return true;
                        }
                        y1().f27177m.setError(z1().b("REG_UPTO", getString(R.string.please_enter_reg_upto)));
                        view = y1().f27177m;
                        view.requestFocus();
                        return false;
                    }
                    y1().f27173i.setError(z1().b("REG_DATE", getString(R.string.please_enter_reg_date)));
                    view = y1().f27173i;
                    view.requestFocus();
                    return false;
                }
                appCompatEditText.setError(b10);
                view = y1().f27169e;
                view.requestFocus();
                return false;
            }
            appCompatEditText2.setError(b11);
            view = y1().f27167c;
            view.requestFocus();
            return false;
        }
        appCompatEditText3.setError(b12);
        view = y1().f27172h;
        view.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public static final void t1(Dialog dialog, View view) {
        cm.l.f(dialog, "$dialog");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void v1(Dialog dialog, Context context, String str, NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(nomineeMainViewScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanProcessWithAdhar.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", nomineeMainViewScreen.T);
        intent.putExtra("RcDetails", nomineeMainViewScreen.A1());
        intent.putExtra("off_code", nomineeMainViewScreen.W);
        context.startActivity(intent);
        nomineeMainViewScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void w1(Dialog dialog, Context context, String str, NomineeMainViewScreen nomineeMainViewScreen, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(context, "$context");
        cm.l.f(str, "$rc_number");
        cm.l.f(nomineeMainViewScreen, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(context, VahanGenerateOTPScreen.class);
        intent.putExtra("RC", str);
        intent.putExtra("map", nomineeMainViewScreen.T);
        intent.putExtra("Mobile_no", nomineeMainViewScreen.V);
        intent.putExtra("RcDetails", nomineeMainViewScreen.A1());
        intent.putExtra("off_code", nomineeMainViewScreen.W);
        context.startActivity(intent);
        nomineeMainViewScreen.finish();
    }

    public final NrvDetails A1() {
        NrvDetails nrvDetails = this.Q;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("nrvDetails");
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

    public final ArrayList C1() {
        return this.Z;
    }

    public final String D1() {
        return this.f20681a0;
    }

    public final String E1() {
        return this.f20682b0;
    }

    public final VahanServiceConnection F1() {
        VahanServiceConnection vahanServiceConnection = this.K;
        if (vahanServiceConnection != null) {
            return vahanServiceConnection;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final VahanProService G1() {
        VahanProService vahanProService = this.S;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("retrofitServiceAddMob");
        return null;
    }

    public final h H1() {
        h hVar = this.N;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("session");
        return null;
    }

    public final VahanProService I1() {
        VahanProService vahanProService = this.P;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h J1() {
        bi.h hVar = this.O;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public final l K1() {
        l lVar = this.J;
        if (lVar != null) {
            return lVar;
        }
        cm.l.v("viewModel");
        return null;
    }

    public final bi.h L1() {
        bi.h hVar = this.R;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("viewModelAddMob");
        return null;
    }

    public final void Y1(kc kcVar) {
        cm.l.f(kcVar, "<set-?>");
        this.G = kcVar;
    }

    public final void Z1(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public void a0(String str, int i10, String str2) {
        if (str != null) {
            Z1("rcnumber");
            this.M = str;
            B1().show();
            J1().n(this, str);
        }
    }

    public final void a2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.H = databaseHelper;
    }

    public final void b2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final void c2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void d2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.Q = nrvDetails;
    }

    public final void e2(String str) {
        this.W = str;
    }

    public final void f2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void g2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void h2(VahanServiceConnection vahanServiceConnection) {
        cm.l.f(vahanServiceConnection, "<set-?>");
        this.K = vahanServiceConnection;
    }

    public final void i2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.S = vahanProService;
    }

    public final void j2(h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.N = hVar;
    }

    public final void k2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.P = vahanProService;
    }

    public final void l2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.O = hVar;
    }

    public final void m2(l lVar) {
        cm.l.f(lVar, "<set-?>");
        this.J = lVar;
    }

    public final void n2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.R = hVar;
    }

    public final void o2(String str) {
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
                                str3 = this.U;
                                u1(this, str3);
                                return;
                            }
                        }
                        if (arrayList2.contains(q.B0(x1(this.T)).toString()) && arrayList3.contains(q.B0(x1(this.T)).toString())) {
                            Log.e("condition--> ", "condition-->2");
                            str3 = this.U;
                            u1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && arrayList3.contains(q.B0(x1(this.T)).toString())) {
                            Log.e("condition--> ", "condition-->3");
                            str3 = this.U;
                            u1(this, str3);
                            return;
                        } else if (arrayList2.contains(q.B0(x1(this.T)).toString()) && arrayList3.contains("0")) {
                            Log.e("condition--> ", "condition-->4");
                            str3 = this.U;
                            u1(this, str3);
                            return;
                        } else if (arrayList2.contains("0") && !arrayList3.contains(q.B0(x1(this.T)).toString())) {
                            Log.e("condition--> ", "condition-->5");
                            Intent intent2 = new Intent(this, cls2);
                            intent2.putExtra("RC", this.U);
                            intent2.putExtra("map", this.T);
                            intent2.putExtra("RcDetails", A1());
                            intent2.putExtra("off_code", this.W);
                            startActivity(intent2);
                            return;
                        } else if (arrayList2.contains(q.B0(x1(this.T)).toString()) || !arrayList3.contains("0")) {
                            Class<VahanGenerateOTPScreen> cls4 = cls3;
                            String str5 = str4;
                            Log.e("condition--> ", "condition-->7");
                            p2(this, z1().b("record_error_msg", getString(R.string.service_unavable_please_try)));
                            return;
                        } else {
                            Log.e("condition--> ", "condition-->6");
                            cls = cls3;
                            intent = new Intent(this, cls);
                            intent.putExtra("RC", this.U);
                            intent.putExtra("map", this.T);
                            str2 = str4;
                            try {
                                intent.putExtra(str2, this.V);
                                intent.putExtra("RcDetails", A1());
                                intent.putExtra("off_code", this.W);
                            } catch (Exception e10) {
                                e = e10;
                                e.printStackTrace();
                                e.printStackTrace();
                                Log.e("Error", x.f30437a.toString());
                                Intent intent3 = new Intent(this, cls);
                                intent3.putExtra("RC", this.U);
                                intent3.putExtra("map", this.T);
                                intent3.putExtra(str2, this.V);
                                intent3.putExtra("RcDetails", A1());
                                intent3.putExtra("off_code", this.W);
                                startActivity(intent3);
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        cls = cls3;
                        str2 = str4;
                        e.printStackTrace();
                        e.printStackTrace();
                        Log.e("Error", x.f30437a.toString());
                        Intent intent32 = new Intent(this, cls);
                        intent32.putExtra("RC", this.U);
                        intent32.putExtra("map", this.T);
                        intent32.putExtra(str2, this.V);
                        intent32.putExtra("RcDetails", A1());
                        intent32.putExtra("off_code", this.W);
                        startActivity(intent32);
                    }
                } else {
                    String str6 = str4;
                    if (q.F(obj2.toString(), "A", false, 2, (Object) null)) {
                        intent = new Intent(this, cls2);
                        intent.putExtra("RC", this.U);
                        intent.putExtra("map", this.T);
                        intent.putExtra("RcDetails", A1());
                        intent.putExtra("off_code", this.W);
                    } else {
                        intent = new Intent(this, cls);
                        intent.putExtra("RC", this.U);
                        intent.putExtra("map", this.T);
                        intent.putExtra(str6, this.V);
                        intent.putExtra("RcDetails", A1());
                        intent.putExtra("off_code", this.W);
                    }
                }
                startActivity(intent);
            } catch (Exception e12) {
                e = e12;
                str2 = str4;
                e.printStackTrace();
                e.printStackTrace();
                Log.e("Error", x.f30437a.toString());
                Intent intent322 = new Intent(this, cls);
                intent322.putExtra("RC", this.U);
                intent322.putExtra("map", this.T);
                intent322.putExtra(str2, this.V);
                intent322.putExtra("RcDetails", A1());
                intent322.putExtra("off_code", this.W);
                startActivity(intent322);
            }
        } catch (Exception e13) {
            e = e13;
            str2 = "Mobile_no";
            e.printStackTrace();
            e.printStackTrace();
            Log.e("Error", x.f30437a.toString());
            Intent intent3222 = new Intent(this, cls);
            intent3222.putExtra("RC", this.U);
            intent3222.putExtra("map", this.T);
            intent3222.putExtra(str2, this.V);
            intent3222.putExtra("RcDetails", A1());
            intent3222.putExtra("off_code", this.W);
            startActivity(intent3222);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.nomines_layout);
        kc c10 = kc.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        Y1(c10);
        setContentView((View) y1().b());
        v9.e.f17509a.x1(this, y1());
        getWindow().addFlags(128);
        b2(new ld.c(this));
        if (getIntent() != null) {
            this.X = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        VahanProService.a aVar = VahanProService.f21196b;
        k2(aVar.b(this));
        i2(aVar.b(this));
        h2(VahanServiceConnection.f21199a.b(this));
        Class<bi.h> cls = bi.h.class;
        n2((bi.h) new u0((x0) this, (u0.b) new g(new wg.d(G1()))).a(cls));
        m2((l) new u0((x0) this, (u0.b) new bi.m(new wg.e(F1()))).a(l.class));
        l2((bi.h) new u0((x0) this, (u0.b) new g(new wg.d(I1()))).a(cls));
        ld.c cVar = new ld.c(this);
        f2(new ProgressDialog(this));
        B1().setMessage(cVar.b("label_challan_please_wait", "Please wait..."));
        B1().setCancelable(false);
        B1().setCanceledOnTouchOutside(false);
        j2(new h(this));
        y1().f27178n.f28308i.setText(VContant.Companion.l(this, H1()));
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        a2(A0);
        try {
            if (p.o(H1().c(), VContant.COMPOUND_FEE_CODE, true)) {
                this.T.put(VContant.COMPOUND_FEE, VContant.COMPOUND_FEE_CODE);
            }
            if (p.o(H1().c(), VContant.Nominee_CODE, true)) {
                this.T.put(VContant.Nominee_Addition, VContant.Nominee_CODE);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        y1().f27178n.f28305f.setOnClickListener(new k(this));
        y1().f27171g.setOnClickListener(new o(this));
        y1().f27178n.f28306g.setOnClickListener(new p(this));
        J1().e0().g(this, new f(new b(this)));
        J1().f0().g(this, new f(new c(this)));
        y1().f27177m.setOnClickListener(new q(this));
        y1().f27173i.setOnClickListener(new r(this));
        J1().D0().g(this, new f(new d(this)));
        J1().C0().g(this, new f(new e(this)));
        K1().g().g(this, new f(new a(this)));
        L1().Z0().g(this, new s(this));
        L1().a1().g(this, new t(this));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            NaxpToKenService.f9438k.a(this);
        } catch (Exception unused) {
        }
    }

    public final void p2(Context context, String str) {
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
        textView.setOnClickListener(new w(dialog));
        dialog.show();
    }

    public final void s1(Context context, String str) {
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
        textView.setOnClickListener(new vf.l(dialog));
        dialog.show();
    }

    public final void u1(Context context, String str) {
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
        textView.setOnClickListener(new vf.u(dialog, context, str, this));
        textView2.setOnClickListener(new v(dialog, context, str, this));
        dialog.show();
    }

    public final String x1(HashMap hashMap) {
        cm.l.f(hashMap, "serviceSelection_HashMap");
        if (hashMap.containsKey(VContant.DUPLICATE_RC)) {
            return VContant.DUPLICATE_RC_PURPOSE_CODE;
        }
        if (hashMap.containsKey(VContant.TRANFER_OF_OWNERSHIP)) {
            return "500";
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
        return hashMap.containsKey(VContant.PERMIT_RENEWAL) ? VContant.RC_PERMIT_RENEWAL_PURPOSE_CODE : "500";
    }

    public final kc y1() {
        kc kcVar = this.G;
        if (kcVar != null) {
            return kcVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final ld.c z1() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageSession");
        return null;
    }
}
