package com.nic.mparivahan.DLServicesAuth.View;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import bm.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.DLServicesAuth.Model.DLResWithODob;
import com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.Dl.Model.DLDocument;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.widget.MyTextView;
import j$.time.LocalDate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ni.d3;
import org.json.JSONObject;
import pl.x;
import z9.a;

public final class DlServicesMainScreen extends oi.g {
    /* access modifiers changed from: private */
    public ld.f J;
    public d3 K;
    public DatabaseHelper L;
    private Calendar M = Calendar.getInstance();
    public ProgressDialog N;
    public ba.b O;
    public DlServiceInt P;
    public DldetobjX Q;
    public EditText R;
    public TextView S;
    private String T;
    public String U;
    public String V;
    public ld.f W;
    public String X;
    public ld.c Y;
    private String Z = "valid";

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8121e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8121e = dlServicesMainScreen;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x007e A[Catch:{ Exception -> 0x0222 }] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00be A[Catch:{ Exception -> 0x0222 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00d0 A[Catch:{ Exception -> 0x0222 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x00f8 A[Catch:{ Exception -> 0x0222 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1 r7) {
            /*
                r6 = this;
                java.lang.String r0 = r7.toString()
                java.lang.String r1 = "dlService_Livedata"
                android.util.Log.d(r1, r0)
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.util.List r1 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                r2 = 0
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r1 = r1.getBioRecGenesis()     // Catch:{ Exception -> 0x0222 }
                r0.D2(r1)     // Catch:{ Exception -> 0x0222 }
                java.util.List r0 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.getBioApplicantCatg()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r1 = "0"
                if (r0 == 0) goto L_0x0065
                int r0 = r0.length()     // Catch:{ Exception -> 0x0222 }
                if (r0 != 0) goto L_0x003e
                goto L_0x0065
            L_0x003e:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ld.f r0 = r0.h2()     // Catch:{ Exception -> 0x0222 }
                java.util.List r3 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.BioObjX r3 = r3.getBioObj()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = r3.getBioApplicantCatg()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r3)     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0222 }
                r0.m(r3)     // Catch:{ Exception -> 0x0222 }
                goto L_0x006e
            L_0x0065:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ld.f r0 = r0.h2()     // Catch:{ Exception -> 0x0222 }
                r0.m(r1)     // Catch:{ Exception -> 0x0222 }
            L_0x006e:
                java.util.List r0 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x0222 }
                int r0 = r0.getErrorcd()     // Catch:{ Exception -> 0x0222 }
                if (r0 == 0) goto L_0x00b6
                java.util.List r0 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x0222 }
                int r0 = r0.getErrorcd()     // Catch:{ Exception -> 0x0222 }
                r3 = 1
                if (r0 != r3) goto L_0x0090
                goto L_0x00b6
            L_0x0090:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                android.app.ProgressDialog r0 = r0.e2()     // Catch:{ Exception -> 0x0222 }
                r0.dismiss()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ld.c r1 = r0.c2()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r2 = "no_details"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                r4 = 2132018516(0x7f140554, float:1.967534E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r1 = r1.b(r2, r3)     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r1)     // Catch:{ Exception -> 0x0222 }
                r0.B2(r1)     // Catch:{ Exception -> 0x0222 }
                goto L_0x024f
            L_0x00b6:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ld.f r0 = r0.J     // Catch:{ Exception -> 0x0222 }
                if (r0 != 0) goto L_0x00c4
                java.lang.String r0 = "sarthiSession"
                cm.l.v(r0)     // Catch:{ Exception -> 0x0222 }
                r0 = 0
            L_0x00c4:
                java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = "204"
                boolean r0 = cm.l.a(r0, r3)     // Catch:{ Exception -> 0x0222 }
                if (r0 == 0) goto L_0x00f8
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                android.app.ProgressDialog r0 = r0.e2()     // Catch:{ Exception -> 0x0222 }
                r0.dismiss()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.util.List r1 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x0222 }
                r0.G2(r1)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.dlservices.ui.mobileupdate.SarathiMobileUpdateActivity r0 = new com.nic.mparivahan.dlservices.ui.mobileupdate.SarathiMobileUpdateActivity     // Catch:{ Exception -> 0x0222 }
                r0.<init>()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r2 = r1.Y1()     // Catch:{ Exception -> 0x0222 }
                r0.N1(r1, r2)     // Catch:{ Exception -> 0x0222 }
                goto L_0x024f
            L_0x00f8:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.i2()     // Catch:{ Exception -> 0x0222 }
                boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x0222 }
                if (r0 == 0) goto L_0x01ed
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DB.DatabaseHelper r0 = r0.X1()     // Catch:{ Exception -> 0x0222 }
                java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x0222 }
                if (r0 == 0) goto L_0x024f
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ni.d3 r0 = r0.V1()     // Catch:{ Exception -> 0x0222 }
                android.widget.LinearLayout r0 = r0.I     // Catch:{ Exception -> 0x0222 }
                r0.setVisibility(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DB.DatabaseHelper r0 = r0.X1()     // Catch:{ Exception -> 0x0222 }
                java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.util.List r3 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r3 = r3.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x0222 }
                r1.G2(r3)     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r1 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r1 = (com.nic.mparivahan.Dl.Model.DLDocument) r1     // Catch:{ Exception -> 0x0222 }
                java.lang.String r1 = r1.getDocnumber()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r1)     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r3 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r3 = (com.nic.mparivahan.Dl.Model.DLDocument) r3     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = r3.getDob()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r3)     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r3 = km.q.B0(r3)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0222 }
                boolean r1 = cm.l.a(r1, r3)     // Catch:{ Exception -> 0x0222 }
                if (r1 == 0) goto L_0x01b9
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ba.b r1 = r1.Z1()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.getDocnumber()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r0)     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r0 = km.q.B0(r0)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r4 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DB.DatabaseHelper r5 = r4.X1()     // Catch:{ Exception -> 0x0222 }
                java.util.ArrayList r5 = r5.c0()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r2 = r5.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r2 = (com.nic.mparivahan.Dl.Model.DLDocument) r2     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r2 = r2.getDldetails()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r2 = r2.getBioDob()     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r2 = r4.S1(r2)     // Catch:{ Exception -> 0x0222 }
                r1.x(r3, r0, r2)     // Catch:{ Exception -> 0x0222 }
                goto L_0x024f
            L_0x01b9:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ba.b r1 = r1.Z1()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r4 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x0222 }
                java.lang.String r4 = r4.getDocnumber()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r4)     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r4 = km.q.B0(r4)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r5 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r0.getDob()     // Catch:{ Exception -> 0x0222 }
                cm.l.c(r0)     // Catch:{ Exception -> 0x0222 }
                java.lang.String r0 = r5.S1(r0)     // Catch:{ Exception -> 0x0222 }
                r1.x(r3, r4, r0)     // Catch:{ Exception -> 0x0222 }
                goto L_0x024f
            L_0x01ed:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                java.util.List r1 = r7.getDldetobj()     // Catch:{ Exception -> 0x0222 }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.Dl.Model.DldetobjX r1 = (com.nic.mparivahan.Dl.Model.DldetobjX) r1     // Catch:{ Exception -> 0x0222 }
                r0.G2(r1)     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                ba.b r0 = r0.Z1()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                android.widget.EditText r2 = r1.b2()     // Catch:{ Exception -> 0x0222 }
                android.text.Editable r2 = r2.getText()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0222 }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r6.f8121e     // Catch:{ Exception -> 0x0222 }
                android.widget.TextView r3 = r3.a2()     // Catch:{ Exception -> 0x0222 }
                java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0222 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0222 }
                r0.x(r1, r2, r3)     // Catch:{ Exception -> 0x0222 }
                goto L_0x024f
            L_0x0222:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r0 = r6.f8121e
                android.app.ProgressDialog r0 = r0.e2()
                r0.dismiss()
                java.lang.String r0 = "it.toString()"
                java.lang.String r7 = r7.toString()
                android.util.Log.d(r0, r7)
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r7 = r6.f8121e
                ld.c r0 = r7.c2()
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r1 = r6.f8121e
                r2 = 2132018238(0x7f14043e, float:1.9674777E38)
                java.lang.String r1 = r1.getString(r2)
                java.lang.String r2 = "kindly_etner_correct_details"
                java.lang.String r0 = r0.b(r2, r1)
                cm.l.c(r0)
                r7.B2(r0)
            L_0x024f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen.a.b(com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8122e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8122e = dlServicesMainScreen;
        }

        public final void b(String str) {
            this.f8122e.e2().dismiss();
            Log.e("dlService_LivedataError", str.toString());
            DlServicesMainScreen dlServicesMainScreen = this.f8122e;
            String b10 = dlServicesMainScreen.c2().b("label_went_wrong", this.f8122e.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            dlServicesMainScreen.B2(b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8123e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8123e = dlServicesMainScreen;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
            r3 = (r3 = r3.get(0)).getEligibleDLSerList();
         */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x0296 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:177:0x02cf A[SYNTHETIC, Splitter:B:177:0x02cf] */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x02df A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x02f3 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0307 A[SYNTHETIC, Splitter:B:188:0x0307] */
        /* JADX WARNING: Removed duplicated region for block: B:211:0x038b A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x039b A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:236:0x0428 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:239:0x0438 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:261:0x04c7 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:264:0x04d7 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:286:0x0566 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:289:0x0576 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:311:0x0607 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:314:0x0617 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:349:0x0714 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:352:0x0724 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:374:0x07b5 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:377:0x07c5 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:399:0x0856 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:402:0x0866 A[Catch:{ Exception -> 0x098f }] */
        /* JADX WARNING: Removed duplicated region for block: B:454:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.DlservicesValidationdto r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.String r1 = "label_unable_details"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                android.app.ProgressDialog r2 = r2.e2()     // Catch:{ Exception -> 0x098f }
                r2.dismiss()     // Catch:{ Exception -> 0x098f }
                java.lang.String r2 = "respooo"
                java.lang.String r3 = r17.toString()     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x098f }
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x098f }
                r2.<init>()     // Catch:{ Exception -> 0x098f }
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                r4 = 0
                r5 = 0
                if (r3 == 0) goto L_0x0039
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0039
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0039
                java.lang.String r3 = r3.get_513()     // Catch:{ Exception -> 0x098f }
                goto L_0x003a
            L_0x0039:
                r3 = r5
            L_0x003a:
                if (r3 == 0) goto L_0x0057
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x0043
                goto L_0x0057
            L_0x0043:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r6 = "check_dl_serv_dupl_dl"
                java.lang.String r7 = "Issue of Duplicate DL"
                java.lang.String r3 = r3.b(r6, r7)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x0057:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0070
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0070
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0070
                java.lang.String r3 = r3.get_514()     // Catch:{ Exception -> 0x098f }
                goto L_0x0071
            L_0x0070:
                r3 = r5
            L_0x0071:
                java.lang.String r6 = "Renewal of DL"
                java.lang.String r7 = "check_dl_serv_renewal_dl"
                if (r3 == 0) goto L_0x008e
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x007e
                goto L_0x008e
            L_0x007e:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = r3.b(r7, r6)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x008e:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00a7
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00a7
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00a7
                java.lang.String r3 = r3.get_515()     // Catch:{ Exception -> 0x098f }
                goto L_0x00a8
            L_0x00a7:
                r3 = r5
            L_0x00a8:
                if (r3 == 0) goto L_0x00c5
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x00b1
                goto L_0x00c5
            L_0x00b1:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r8 = "check_dl_serv_change_addr"
                java.lang.String r9 = "Change of Address in DL"
                java.lang.String r3 = r3.b(r8, r9)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x00c5:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00de
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00de
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x00de
                java.lang.String r3 = r3.get_516()     // Catch:{ Exception -> 0x098f }
                goto L_0x00df
            L_0x00de:
                r3 = r5
            L_0x00df:
                if (r3 == 0) goto L_0x00fc
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x00e8
                goto L_0x00fc
            L_0x00e8:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r8 = "check_dl_serv_replacement_dl"
                java.lang.String r9 = "Replacement of DL"
                java.lang.String r3 = r3.b(r8, r9)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x00fc:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0115
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0115
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0115
                java.lang.String r3 = r3.get_523()     // Catch:{ Exception -> 0x098f }
                goto L_0x0116
            L_0x0115:
                r3 = r5
            L_0x0116:
                if (r3 == 0) goto L_0x0133
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x011f
                goto L_0x0133
            L_0x011f:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r8 = "check_dl_serv_extract_dl"
                java.lang.String r9 = "DL Extract"
                java.lang.String r3 = r3.b(r8, r9)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x0133:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x014c
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x014c
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x014c
                java.lang.String r3 = r3.get_524()     // Catch:{ Exception -> 0x098f }
                goto L_0x014d
            L_0x014c:
                r3 = r5
            L_0x014d:
                if (r3 == 0) goto L_0x016a
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x0156
                goto L_0x016a
            L_0x0156:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r8 = "hill_region_title"
                java.lang.String r9 = "Endorsement to Drive in Hill Region"
                java.lang.String r3 = r3.b(r8, r9)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x016a:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0183
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0183
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0183
                java.lang.String r3 = r3.get_537()     // Catch:{ Exception -> 0x098f }
                goto L_0x0184
            L_0x0183:
                r3 = r5
            L_0x0184:
                java.lang.String r8 = "Re-Validation of Expired DL"
                java.lang.String r9 = "revalidtion_expired_dl"
                if (r3 == 0) goto L_0x01a1
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x0191
                goto L_0x01a1
            L_0x0191:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = r3.b(r9, r8)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x01a1:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01ba
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01ba
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01ba
                java.lang.String r3 = r3.get_526()     // Catch:{ Exception -> 0x098f }
                goto L_0x01bb
            L_0x01ba:
                r3 = r5
            L_0x01bb:
                if (r3 == 0) goto L_0x01d8
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x01c4
                goto L_0x01d8
            L_0x01c4:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "change_name_dl"
                java.lang.String r11 = "Change of Name in DL"
                java.lang.String r3 = r3.b(r10, r11)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x01d8:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01f1
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01f1
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x01f1
                java.lang.String r3 = r3.get_548()     // Catch:{ Exception -> 0x098f }
                goto L_0x01f2
            L_0x01f1:
                r3 = r5
            L_0x01f2:
                if (r3 == 0) goto L_0x020f
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x01fb
                goto L_0x020f
            L_0x01fb:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "change_birth_dl"
                java.lang.String r11 = "Change of Date of Birth in DL"
                java.lang.String r3 = r3.b(r10, r11)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                r2.add(r3)     // Catch:{ Exception -> 0x098f }
            L_0x020f:
                java.lang.String r3 = r17.getStatus_desc()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "getString(...)"
                if (r3 == 0) goto L_0x096e
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x021f
                goto L_0x096e
            L_0x021f:
                java.lang.String r3 = r17.getStatus_desc()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x094e
                java.lang.String r3 = r17.getStatus_code()     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "00"
                r12 = 2
                boolean r3 = km.p.p(r3, r11, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0920
                java.lang.String r3 = r17.getStatus_desc()     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "success"
                boolean r3 = km.p.p(r3, r11, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0920
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0251
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0251
                java.lang.String r3 = r3.getAllowIDPfromIndEmb()     // Catch:{ Exception -> 0x098f }
                goto L_0x0252
            L_0x0251:
                r3 = r5
            L_0x0252:
                java.lang.String r11 = "false"
                r13 = 1
                if (r3 == 0) goto L_0x028d
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x025e
                goto L_0x028d
            L_0x025e:
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0271
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0271
                java.lang.String r3 = r3.getAllowIDPfromIndEmb()     // Catch:{ Exception -> 0x098f }
                goto L_0x0272
            L_0x0271:
                r3 = r5
            L_0x0272:
                java.lang.String r14 = "YES"
                boolean r3 = km.p.o(r3, r14, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0286
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.h2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "true"
            L_0x0282:
                r3.n(r11)     // Catch:{ Exception -> 0x098f }
                goto L_0x0290
            L_0x0286:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
            L_0x0288:
                ld.f r3 = r3.h2()     // Catch:{ Exception -> 0x098f }
                goto L_0x0282
            L_0x028d:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                goto L_0x0288
            L_0x0290:
                java.lang.String r3 = r17.getMsg()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x02c5
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x029d
                goto L_0x02c5
            L_0x029d:
                java.lang.String r3 = r17.getMsg()     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "allowed"
                boolean r3 = km.p.p(r3, r11, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x02c5
                java.lang.String r3 = r17.getMsg()     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "Allowed"
                boolean r3 = km.p.p(r3, r11, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x02b6
                goto L_0x02c5
            L_0x02b6:
                java.lang.String r2 = r17.getMsg()     // Catch:{ Exception -> 0x098f }
                if (r2 == 0) goto L_0x09b1
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.B2(r2)     // Catch:{ Exception -> 0x098f }
                pl.x r1 = pl.x.f30437a     // Catch:{ Exception -> 0x098f }
                goto L_0x09b1
            L_0x02c5:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                java.lang.String r11 = "sarthiSession"
                if (r3 != 0) goto L_0x02d3
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = r5
            L_0x02d3:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r12 = "5"
                boolean r3 = km.p.o(r3, r12, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x02eb
                java.lang.String r3 = "DL Extract CASE"
                java.lang.String r12 = "DL Extract --> Always allowed"
                android.util.Log.e(r3, r12)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
            L_0x02eb:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x02f7
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = r5
            L_0x02f7:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r12 = "526"
                boolean r3 = km.p.o(r3, r12, r13)     // Catch:{ Exception -> 0x098f }
                java.lang.String r12 = "label_ddl_expired"
                java.lang.String r14 = "DL --> Always allowed"
                if (r3 == 0) goto L_0x0383
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r15 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r15 = r15.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r15 = r15.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r5 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r5.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r15, r5)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "CHANGE_NAME"
                if (r3 == 0) goto L_0x0367
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0344
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0344
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0344
                java.lang.String r3 = r3.get_526()     // Catch:{ Exception -> 0x098f }
                goto L_0x0345
            L_0x0344:
                r3 = 0
            L_0x0345:
                if (r3 == 0) goto L_0x0357
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x034e
                goto L_0x0357
            L_0x034e:
                android.util.Log.e(r5, r14)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x0383
            L_0x0357:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r5 = 2132018471(0x7f140527, float:1.967525E38)
                java.lang.String r5 = r3.getString(r5)     // Catch:{ Exception -> 0x098f }
                cm.l.e(r5, r10)     // Catch:{ Exception -> 0x098f }
            L_0x0363:
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x0383
            L_0x0367:
                java.lang.String r3 = " CHANGE_NAME --> NOT allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r15 = 2132017459(0x7f140133, float:1.9673197E38)
                java.lang.String r10 = r10.getString(r15)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r12, r10)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x0363
            L_0x0383:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x038f
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x038f:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "2"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0420
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "DUPLICATE_DL"
                if (r3 == 0) goto L_0x0407
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x03d8
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x03d8
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x03d8
                java.lang.String r3 = r3.get_513()     // Catch:{ Exception -> 0x098f }
                goto L_0x03d9
            L_0x03d8:
                r3 = 0
            L_0x03d9:
                if (r3 == 0) goto L_0x03eb
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x03e2
                goto L_0x03eb
            L_0x03e2:
                android.util.Log.e(r5, r14)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x0420
            L_0x03eb:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_duplicate_dl_not_allowed_"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r15 = 2132017720(0x7f140238, float:1.9673726E38)
                java.lang.String r12 = r12.getString(r15)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x0400:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x0420
            L_0x0407:
                java.lang.String r3 = " DUPLICATE_DL --> NOT allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r15 = 2132017721(0x7f140239, float:1.9673728E38)
                java.lang.String r10 = r10.getString(r15)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r12, r10)     // Catch:{ Exception -> 0x098f }
                goto L_0x0400
            L_0x0420:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x042c
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x042c:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "4"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x04bf
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "SERVICE_IDP_OF_DL"
                if (r3 == 0) goto L_0x04a4
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0475
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0475
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0475
                java.lang.String r3 = r3.get_513()     // Catch:{ Exception -> 0x098f }
                goto L_0x0476
            L_0x0475:
                r3 = 0
            L_0x0476:
                if (r3 == 0) goto L_0x0488
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x047f
                goto L_0x0488
            L_0x047f:
                android.util.Log.e(r5, r14)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x04bf
            L_0x0488:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_idp_not_allowed_"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r15 = 2132018164(0x7f1403f4, float:1.9674627E38)
                java.lang.String r12 = r12.getString(r15)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x049d:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x04bf
            L_0x04a4:
                java.lang.String r3 = "SERVICE_IDP_OF_DL -->  NOT allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_idp_expired"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r15 = 2132018165(0x7f1403f5, float:1.9674629E38)
                java.lang.String r12 = r12.getString(r15)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                goto L_0x049d
            L_0x04bf:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x04cb
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x04cb:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "6"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x055e
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "DL_REPLACEMENT"
                if (r3 == 0) goto L_0x0543
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0514
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0514
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0514
                java.lang.String r3 = r3.get_513()     // Catch:{ Exception -> 0x098f }
                goto L_0x0515
            L_0x0514:
                r3 = 0
            L_0x0515:
                if (r3 == 0) goto L_0x0527
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x051e
                goto L_0x0527
            L_0x051e:
                android.util.Log.e(r5, r14)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x055e
            L_0x0527:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_replace_dl_not_allowed"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132018983(0x7f140727, float:1.9676288E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x053c:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x055e
            L_0x0543:
                java.lang.String r3 = "DL_REPLACEMENT -->   NOT allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_replacement_expired"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132018984(0x7f140728, float:1.967629E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                goto L_0x053c
            L_0x055e:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x056a
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x056a:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "3"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x05ff
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "CHANGE_OF_ADDRESS"
                if (r3 == 0) goto L_0x05e4
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x05b3
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x05b3
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x05b3
                java.lang.String r3 = r3.get_513()     // Catch:{ Exception -> 0x098f }
                goto L_0x05b4
            L_0x05b3:
                r3 = 0
            L_0x05b4:
                if (r3 == 0) goto L_0x05c8
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x05bd
                goto L_0x05c8
            L_0x05bd:
                java.lang.String r3 = "CHANGE_OF_ADDRESS -->    allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x05ff
            L_0x05c8:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_coa_not_allowed"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132017505(0x7f140161, float:1.967329E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x05dd:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x05ff
            L_0x05e4:
                java.lang.String r3 = "CHANGE_OF_ADDRESS -->  NOT  allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_coa_expired"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132017506(0x7f140162, float:1.9673292E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                goto L_0x05dd
            L_0x05ff:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x060b
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x060b:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "1"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x070c
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.S2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "DL_RENEWAL"
                if (r3 == 0) goto L_0x066a
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0654
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0654
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0654
                java.lang.String r3 = r3.get_514()     // Catch:{ Exception -> 0x098f }
                goto L_0x0655
            L_0x0654:
                r3 = 0
            L_0x0655:
                if (r3 == 0) goto L_0x066a
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x065e
                goto L_0x066a
            L_0x065e:
                java.lang.String r3 = "DL_RENEWAL -->    allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x070c
            L_0x066a:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r12 = r12.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r12 = r12.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r12 = r12.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.S2(r10, r12)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x06cd
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x06a5
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x06a5
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x06a5
                java.lang.String r3 = r3.get_537()     // Catch:{ Exception -> 0x098f }
                goto L_0x06a6
            L_0x06a5:
                r3 = 0
            L_0x06a6:
                if (r3 == 0) goto L_0x06cd
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x06af
                goto L_0x06cd
            L_0x06af:
                java.lang.String r3 = "DL_RENEWAL -->    _537  ALLOWED WITH POPUP"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_renewal_not_allowed"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132019140(0x7f1407c4, float:1.9676606E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                r3.M1(r3, r5, r4, r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x070c
            L_0x06cd:
                java.lang.String r3 = "DL_RENEWAL -->    NOT ALLOWED"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                r3.d2(r5, r10)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "label_renewal_expired"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132017654(0x7f1401f6, float:1.9673593E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
            L_0x070c:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x0718
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x0718:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "524"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x07ad
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "DL_HILL_REGION"
                if (r3 == 0) goto L_0x0792
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0761
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0761
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0761
                java.lang.String r3 = r3.get_524()     // Catch:{ Exception -> 0x098f }
                goto L_0x0762
            L_0x0761:
                r3 = 0
            L_0x0762:
                if (r3 == 0) goto L_0x0776
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x076b
                goto L_0x0776
            L_0x076b:
                java.lang.String r3 = "DL_HILL_REGION --> allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x07ad
            L_0x0776:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "LABEL_HG_NOT_ALLOWED"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132018131(0x7f1403d3, float:1.967456E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x078b:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x07ad
            L_0x0792:
                java.lang.String r3 = "DL_HILL_REGION -->  NOT  allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "LABEL_HG_EXPIRED"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132018130(0x7f1403d2, float:1.9674558E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                goto L_0x078b
            L_0x07ad:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x07b9
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x07b9:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "548"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x084e
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.R2(r5, r10)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "DL_DOB_CHANGE"
                if (r3 == 0) goto L_0x0833
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0802
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0802
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0802
                java.lang.String r3 = r3.get_548()     // Catch:{ Exception -> 0x098f }
                goto L_0x0803
            L_0x0802:
                r3 = 0
            L_0x0803:
                if (r3 == 0) goto L_0x0817
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x080c
                goto L_0x0817
            L_0x080c:
                java.lang.String r3 = "DL_DOB_CHANGE --> allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x084e
            L_0x0817:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "LABEL_DOB_NOT_ALLOWED"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132017663(0x7f1401ff, float:1.967361E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
            L_0x082c:
                cm.l.c(r5)     // Catch:{ Exception -> 0x098f }
                r3.B2(r5)     // Catch:{ Exception -> 0x098f }
                goto L_0x084e
            L_0x0833:
                java.lang.String r3 = "DL_DOB_CHANGE -->  NOT  allowed"
                android.util.Log.e(r5, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r5 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = "LABEL_DOB_EXPIRED"
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r12 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r14 = 2132017662(0x7f1401fe, float:1.9673609E38)
                java.lang.String r12 = r12.getString(r14)     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.b(r10, r12)     // Catch:{ Exception -> 0x098f }
                goto L_0x082c
            L_0x084e:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.f r3 = r3.J     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x085a
                cm.l.v(r11)     // Catch:{ Exception -> 0x098f }
                r3 = 0
            L_0x085a:
                java.lang.String r3 = r3.b()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = "950"
                boolean r3 = km.p.o(r3, r5, r13)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x09b1
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r10 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r10 = r10.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r10 = r10.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r10 = r10.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.S2(r5, r10)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08c2
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08a1
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08a1
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08a1
                java.lang.String r3 = r3.get_514()     // Catch:{ Exception -> 0x098f }
                goto L_0x08a2
            L_0x08a1:
                r3 = 0
            L_0x08a2:
                if (r3 == 0) goto L_0x08c2
                int r3 = r3.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x08ab
                goto L_0x08c2
            L_0x08ab:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r4 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r4 = r4.b(r7, r6)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r4)     // Catch:{ Exception -> 0x098f }
                r3.L2(r4)     // Catch:{ Exception -> 0x098f }
            L_0x08bb:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3.Q1(r2)     // Catch:{ Exception -> 0x098f }
                goto L_0x09b1
            L_0x08c2:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r5 = r3.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r5 = r5.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r5 = r5.getDlNtValdtoDt()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r6 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DldetobjX r6 = r6.Y1()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.Dl.Model.DlobjX r6 = r6.getDlobj()     // Catch:{ Exception -> 0x098f }
                java.lang.String r6 = r6.getDlTrValdtoDt()     // Catch:{ Exception -> 0x098f }
                boolean r3 = r3.S2(r5, r6)     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x0918
                java.util.List r3 = r17.getResult()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08fd
                java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$Result r3 = (com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData.Result) r3     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08fd
                com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$EligibleDLSerList r3 = r3.getEligibleDLSerList()     // Catch:{ Exception -> 0x098f }
                if (r3 == 0) goto L_0x08fd
                java.lang.String r5 = r3.get_537()     // Catch:{ Exception -> 0x098f }
                goto L_0x08fe
            L_0x08fd:
                r5 = 0
            L_0x08fe:
                if (r5 == 0) goto L_0x0918
                int r3 = r5.length()     // Catch:{ Exception -> 0x098f }
                if (r3 != 0) goto L_0x0907
                goto L_0x0918
            L_0x0907:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r4 = r3.c2()     // Catch:{ Exception -> 0x098f }
                java.lang.String r4 = r4.b(r9, r8)     // Catch:{ Exception -> 0x098f }
                cm.l.c(r4)     // Catch:{ Exception -> 0x098f }
                r3.L2(r4)     // Catch:{ Exception -> 0x098f }
                goto L_0x08bb
            L_0x0918:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r3 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                java.lang.String r4 = "valid"
                r3.L2(r4)     // Catch:{ Exception -> 0x098f }
                goto L_0x08bb
            L_0x0920:
                java.lang.String r2 = r17.getStatus_code()     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = "01"
                r5 = 0
                boolean r2 = km.p.p(r2, r3, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r2 == 0) goto L_0x09b1
                java.lang.String r2 = r17.getStatus_desc()     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = "failure"
                boolean r2 = km.p.p(r2, r3, r4, r12, r5)     // Catch:{ Exception -> 0x098f }
                if (r2 == 0) goto L_0x09b1
                java.lang.String r2 = "failure CASE"
                java.lang.String r3 = "NOT ALLOW"
                android.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = r17.getReqStatus()     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x098f }
            L_0x094a:
                r2.B2(r3)     // Catch:{ Exception -> 0x098f }
                goto L_0x09b1
            L_0x094e:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                android.app.ProgressDialog r2 = r2.e2()     // Catch:{ Exception -> 0x098f }
                r2.dismiss()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                ld.c r3 = r2.c2()     // Catch:{ Exception -> 0x098f }
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r4 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r4 = r4.getString(r5)     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = r3.b(r1, r4)     // Catch:{ Exception -> 0x098f }
            L_0x096a:
                cm.l.c(r3)     // Catch:{ Exception -> 0x098f }
                goto L_0x094a
            L_0x096e:
                java.lang.String r2 = r17.getReqStatus()     // Catch:{ Exception -> 0x098f }
                if (r2 == 0) goto L_0x0982
                int r2 = r2.length()     // Catch:{ Exception -> 0x098f }
                if (r2 != 0) goto L_0x097b
                goto L_0x0982
            L_0x097b:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                java.lang.String r3 = r17.getReqStatus()     // Catch:{ Exception -> 0x098f }
                goto L_0x096a
            L_0x0982:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e     // Catch:{ Exception -> 0x098f }
                r3 = 2132018516(0x7f140554, float:1.967534E38)
                java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x098f }
                cm.l.e(r3, r10)     // Catch:{ Exception -> 0x098f }
                goto L_0x094a
            L_0x098f:
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e
                android.app.ProgressDialog r2 = r2.e2()
                r2.dismiss()
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r2 = r0.f8123e
                ld.c r3 = r2.c2()
                com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen r4 = r0.f8123e
                r5 = 2132019337(0x7f140889, float:1.9677006E38)
                java.lang.String r4 = r4.getString(r5)
                java.lang.String r1 = r3.b(r1, r4)
                cm.l.c(r1)
                r2.B2(r1)
            L_0x09b1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.DLServicesAuth.View.DlServicesMainScreen.c.b(com.nic.mparivahan.DLServicesAuth.Model.Eligible.DLEligibleMasterData$DlservicesValidationdto):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLEligibleMasterData.DlservicesValidationdto) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8124e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8124e = dlServicesMainScreen;
        }

        public final void b(String str) {
            DlServicesMainScreen dlServicesMainScreen = this.f8124e;
            String b10 = dlServicesMainScreen.c2().b("label_went_wrong", this.f8124e.getString(R.string.unable_to_get_details));
            cm.l.c(b10);
            dlServicesMainScreen.B2(b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8125e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8125e = dlServicesMainScreen;
        }

        public final void b(DLResWithODob dLResWithODob) {
            try {
                Log.d("dlService_dlSerWithODob", dLResWithODob.toString());
                if (dLResWithODob.getErrorcd() == 1) {
                    this.f8125e.Z1().k(this.f8125e, q.B0(dLResWithODob.getDlobj().getDlLicno().toString()).toString(), dLResWithODob.getBioObj().getBioDob().toString());
                    return;
                }
                this.f8125e.e2().dismiss();
                DlServicesMainScreen dlServicesMainScreen = this.f8125e;
                String b10 = dlServicesMainScreen.c2().b("no_details", this.f8125e.getString(R.string.no_Details_are_avail));
                cm.l.c(b10);
                dlServicesMainScreen.B2(b10);
            } catch (Exception unused) {
                this.f8125e.e2().dismiss();
                DlServicesMainScreen dlServicesMainScreen2 = this.f8125e;
                String b11 = dlServicesMainScreen2.c2().b("label_went_wrong", this.f8125e.getString(R.string.unable_to_get_details));
                cm.l.c(b11);
                dlServicesMainScreen2.B2(b11);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLResWithODob) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlServicesMainScreen f8126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlServicesMainScreen dlServicesMainScreen) {
            super(1);
            this.f8126e = dlServicesMainScreen;
        }

        public final void b(String str) {
            DlServicesMainScreen dlServicesMainScreen = this.f8126e;
            String b10 = dlServicesMainScreen.c2().b("label_went_wrong", this.f8126e.getString(R.string.unable_to_get_details));
            cm.l.c(b10);
            dlServicesMainScreen.B2(b10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final g f8127e = new g();

        g() {
            super(1);
        }

        public final void b(String str) {
            cm.l.f(str, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f8128a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f8128a = lVar;
        }

        public final pl.c a() {
            return this.f8128a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8128a.invoke(obj);
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
    public static final void A2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void N1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void O1(Dialog dialog, DlServicesMainScreen dlServicesMainScreen, ArrayList arrayList, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlServicesMainScreen, "this$0");
        cm.l.f(arrayList, "$multiList");
        dialog.dismiss();
        ld.f h22 = dlServicesMainScreen.h2();
        String b10 = dlServicesMainScreen.c2().b("revalidtion_expired_dl", "Re-Validation of Expired DL");
        cm.l.c(b10);
        h22.r(b10, "537");
        dlServicesMainScreen.Q1(arrayList);
    }

    private final void j2() {
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        cm.l.e(A0, "getInstance(...)");
        E2(A0);
        this.J = new ld.f(this);
        v9.e.f17509a.v0(this, V1());
        N2(DlServiceInt.f21675a.a(this));
        MyTextView myTextView = V1().Q;
        ld.f fVar = this.J;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        myTextView.setText(fVar.i());
        F2();
        M2(new ProgressDialog(this));
        e2().setMessage(c2().b("label_challan_please_wait", getString(R.string.please_wait)));
        e2().setCancelable(false);
        e2().setCanceledOnTouchOutside(false);
    }

    private final void k2() {
        Z1().o().g(this, new h(new a(this)));
        Z1().p().g(this, new h(new b(this)));
        Z1().l().g(this, new q0(this));
        Z1().m().g(this, new r0(this));
        Z1().t().g(this, new s0(this));
        Z1().r().g(this, new h(new c(this)));
        Z1().s().g(this, new h(new d(this)));
        Z1().n().g(this, new h(new e(this)));
        Z1().q().g(this, new h(new f(this)));
    }

    /* access modifiers changed from: private */
    public static final void l2(DlServicesMainScreen dlServicesMainScreen, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.e2().dismiss();
        try {
            if (!dlLastRtoDetailsDto.getStatus_code().equals("00") || !dlLastRtoDetailsDto.getStatus_desc().equals("success")) {
                dlServicesMainScreen.e2().dismiss();
                dlServicesMainScreen.B2(dlLastRtoDetailsDto.getReqStatus().toString());
                return;
            }
            List<Result> result = dlLastRtoDetailsDto.getResult();
            if (result != null) {
                String rtoCode = result.get(0).getRtoCode();
                cm.l.c(rtoCode);
                dlServicesMainScreen.O2(rtoCode);
                if (cm.l.a(dlServicesMainScreen.h2().l(), "DL")) {
                    dlServicesMainScreen.Z1().g(dlServicesMainScreen, String.valueOf(result.get(0).getDlno()), String.valueOf(result.get(0).getApplDateOfBirth()), "DL3", "G");
                    return;
                }
                dlServicesMainScreen.Z1().g(dlServicesMainScreen, String.valueOf(result.get(0).getDlno()), String.valueOf(result.get(0).getApplDateOfBirth()), dlServicesMainScreen.g2(), "G");
            }
        } catch (Exception unused) {
            dlServicesMainScreen.e2().dismiss();
            String b10 = dlServicesMainScreen.c2().b("label_went_wrong", dlServicesMainScreen.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            dlServicesMainScreen.B2(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void m2(DlServicesMainScreen dlServicesMainScreen, String str) {
        cm.l.f(dlServicesMainScreen, "this$0");
        try {
            dlServicesMainScreen.e2().dismiss();
            Log.d("respnse", str.toString());
            String string = new JSONObject(str).getString("Result");
            cm.l.e(string, "getString(...)");
            dlServicesMainScreen.B2(string);
        } catch (Exception unused) {
            String b10 = dlServicesMainScreen.c2().b("label_went_wrong", dlServicesMainScreen.getString(R.string.something_please_try_after_some_time));
            cm.l.c(b10);
            dlServicesMainScreen.B2(b10);
        }
    }

    /* access modifiers changed from: private */
    public static final void n2(DlServicesMainScreen dlServicesMainScreen, String str) {
        cm.l.f(dlServicesMainScreen, "this$0");
        String b10 = dlServicesMainScreen.c2().b("label_went_wrong", dlServicesMainScreen.getString(R.string.something_please_try_after_some_time));
        cm.l.c(b10);
        dlServicesMainScreen.B2(b10);
    }

    private final void o2() {
        V1().G.setOnClickListener(new t0(this));
        V1().R.setLayoutManager(new LinearLayoutManager(this, 1, false));
        View findViewById = findViewById(R.id.dl_number);
        cm.l.e(findViewById, "findViewById(...)");
        J2((EditText) findViewById);
        View findViewById2 = findViewById(R.id.dl_dob);
        cm.l.e(findViewById2, "findViewById(...)");
        I2((TextView) findViewById2);
        H2((ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(f2(), this))).a(ba.b.class));
        V1().F.setOnClickListener(new v0(this, new u0(this)));
        V1().A.setOnClickListener(new g0(this));
        if (X1().c0() != null) {
            V1().J.setVisibility(0);
            V1().K.setVisibility(0);
            V1().N.setVisibility(8);
            V1().C.setVisibility(8);
            V1().B.setVisibility(8);
            V1().f25853z.setVisibility(8);
            V1().f25851x.setVisibility(0);
        } else {
            V1().J.setVisibility(8);
            V1().K.setVisibility(0);
            V1().N.setVisibility(0);
            V1().C.setVisibility(0);
            V1().B.setVisibility(0);
            V1().f25853z.setVisibility(0);
            V1().f25851x.setVisibility(8);
        }
        V1().f25852y.setOnClickListener(new h0(this));
        V1().B.setOnClickListener(new i0(this));
        V1().f25851x.setOnClickListener(new j0(this));
        V1().C.setOnClickListener(new k0(this));
    }

    /* access modifiers changed from: private */
    public static final void p2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.V1().C.setVisibility(0);
        dlServicesMainScreen.V1().B.setVisibility(0);
        dlServicesMainScreen.V1().f25851x.setVisibility(8);
        dlServicesMainScreen.V1().I.setVisibility(8);
        dlServicesMainScreen.V1().f25852y.setBackgroundResource(R.drawable.other_new_shape_grey);
        dlServicesMainScreen.V1().A.setBackgroundResource(R.drawable.button_style);
        dlServicesMainScreen.V1().A.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.white));
        dlServicesMainScreen.V1().f25852y.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.black));
        dlServicesMainScreen.V1().N.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void q2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.V1().C.setVisibility(8);
        dlServicesMainScreen.V1().B.setVisibility(8);
        dlServicesMainScreen.V1().f25851x.setVisibility(0);
        if (dlServicesMainScreen.X1().c0() != null) {
            dlServicesMainScreen.V1().f25853z.setVisibility(8);
            dlServicesMainScreen.V1().I.setVisibility(0);
            dlServicesMainScreen.V1().f25852y.setBackgroundResource(R.drawable.button_style);
            dlServicesMainScreen.V1().A.setBackgroundResource(R.drawable.other_new_shape_grey);
            dlServicesMainScreen.V1().f25852y.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.white));
            dlServicesMainScreen.V1().A.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.black));
            dlServicesMainScreen.V1().N.setVisibility(8);
            dlServicesMainScreen.V1().f25851x.setVisibility(0);
            return;
        }
        dlServicesMainScreen.V1().f25853z.setVisibility(8);
        dlServicesMainScreen.V1().f25851x.setVisibility(8);
        dlServicesMainScreen.V1().I.setVisibility(8);
        dlServicesMainScreen.V1().f25852y.setBackgroundResource(R.drawable.button_style);
        dlServicesMainScreen.V1().A.setBackgroundResource(R.drawable.other_new_shape_grey);
        dlServicesMainScreen.V1().f25852y.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.white));
        dlServicesMainScreen.V1().A.setTextColor(androidx.core.content.a.c(dlServicesMainScreen, R.color.black));
        dlServicesMainScreen.V1().N.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void r2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.V1().H.setText("");
        dlServicesMainScreen.V1().F.setText("");
    }

    /* access modifiers changed from: private */
    public static final void s2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void t2(DlServicesMainScreen dlServicesMainScreen, View view) {
        Toast makeText;
        ld.c c22;
        String string;
        String str;
        cm.l.f(dlServicesMainScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlServicesMainScreen)) {
            dlServicesMainScreen.Q2("1");
            Editable text = dlServicesMainScreen.b2().getText();
            cm.l.e(text, "getText(...)");
            if (text.length() == 0) {
                c22 = dlServicesMainScreen.c2();
                string = dlServicesMainScreen.getString(R.string.please_enter_dl_details);
                str = "please_enter_dl_details";
            } else if (dlServicesMainScreen.b2().getText().length() < 10) {
                c22 = dlServicesMainScreen.c2();
                string = dlServicesMainScreen.getString(R.string.validate_message_dl);
                str = "dl_validation_msg";
            } else {
                CharSequence text2 = dlServicesMainScreen.a2().getText();
                cm.l.e(text2, "getText(...)");
                if (text2.length() == 0) {
                    c22 = dlServicesMainScreen.c2();
                    string = dlServicesMainScreen.getString(R.string.please_enter_bd);
                    str = "please_enter_bd";
                } else {
                    try {
                        dlServicesMainScreen.e2().show();
                    } catch (Exception unused) {
                    }
                    ba.b Z1 = dlServicesMainScreen.Z1();
                    String obj = dlServicesMainScreen.b2().getText().toString();
                    String T1 = dlServicesMainScreen.T1(dlServicesMainScreen.a2().getText().toString());
                    cm.l.c(T1);
                    Z1.k(dlServicesMainScreen, obj, T1);
                    return;
                }
            }
            makeText = Toast.makeText(dlServicesMainScreen, c22.b(str, string), 1);
        } else {
            makeText = Toast.makeText(dlServicesMainScreen.getApplicationContext(), dlServicesMainScreen.c2().b("label_log_check_internet", dlServicesMainScreen.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    /* access modifiers changed from: private */
    public static final void u2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlServicesMainScreen)) {
            dlServicesMainScreen.Q2("0");
            try {
                ArrayList c02 = dlServicesMainScreen.X1().c0();
                if (c02 != null) {
                    dlServicesMainScreen.e2().show();
                    String dob = ((DLDocument) c02.get(0)).getDob();
                    if (dob != null) {
                        if (dob.length() != 0) {
                            String docnumber = ((DLDocument) c02.get(0)).getDocnumber();
                            cm.l.c(docnumber);
                            String obj = q.B0(docnumber).toString();
                            String dob2 = ((DLDocument) c02.get(0)).getDob();
                            cm.l.c(dob2);
                            if (cm.l.a(obj, q.B0(dob2).toString())) {
                                ba.b Z1 = dlServicesMainScreen.Z1();
                                String docnumber2 = ((DLDocument) c02.get(0)).getDocnumber();
                                cm.l.c(docnumber2);
                                String obj2 = q.B0(q.B0(docnumber2).toString()).toString();
                                DldetobjX dldetails = ((DLDocument) dlServicesMainScreen.X1().c0().get(0)).getDldetails();
                                cm.l.c(dldetails);
                                Z1.k(dlServicesMainScreen, obj2, dlServicesMainScreen.S1(q.B0(dldetails.getBioObj().getBioDob()).toString()));
                                return;
                            }
                            ba.b Z12 = dlServicesMainScreen.Z1();
                            String docnumber3 = ((DLDocument) c02.get(0)).getDocnumber();
                            cm.l.c(docnumber3);
                            String obj3 = q.B0(docnumber3).toString();
                            String dob3 = ((DLDocument) c02.get(0)).getDob();
                            cm.l.c(dob3);
                            Z12.k(dlServicesMainScreen, obj3, dlServicesMainScreen.S1(dob3));
                            return;
                        }
                    }
                    dlServicesMainScreen.e2().dismiss();
                    String b10 = dlServicesMainScreen.c2().b("label_went_wrong", dlServicesMainScreen.getString(R.string.unable_to_get_details));
                    cm.l.c(b10);
                    dlServicesMainScreen.B2(b10);
                }
            } catch (Exception unused) {
                Toast.makeText(dlServicesMainScreen, "Service temporarily unavailable, Please try again later.", 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void v2(DlServicesMainScreen dlServicesMainScreen, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.M.set(1, i10);
        dlServicesMainScreen.M.set(2, i11);
        dlServicesMainScreen.M.set(5, i12);
        CharSequence format = DateFormat.format("dd", dlServicesMainScreen.M.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", dlServicesMainScreen.M.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", dlServicesMainScreen.M.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        dlServicesMainScreen.T = str3 + '-' + str2 + '-' + str;
        TextView textView = dlServicesMainScreen.V1().F;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void w2(DlServicesMainScreen dlServicesMainScreen, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        dlServicesMainScreen.l1();
        DatePickerDialog datePickerDialog = new DatePickerDialog(dlServicesMainScreen, onDateSetListener, dlServicesMainScreen.M.get(1), dlServicesMainScreen.M.get(2), dlServicesMainScreen.M.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void x2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        dlServicesMainScreen.finish();
    }

    /* access modifiers changed from: private */
    public static final void y2(DlServicesMainScreen dlServicesMainScreen, View view) {
        cm.l.f(dlServicesMainScreen, "this$0");
        ld.f fVar = dlServicesMainScreen.J;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        if (cm.l.a(fVar.b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            Dialog dialog = new Dialog(dlServicesMainScreen);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            cm.l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.service_label_cross);
            cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById2;
            View findViewById3 = dialog.findViewById(R.id.service_label_list);
            cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById5 = dialog.findViewById(R.id.dl_services);
            cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
            textView.setText(dlServicesMainScreen.c2().b("btn_ok", "OK"));
            ((TextView) findViewById5).setText(dlServicesMainScreen.c2().b("title_dl_services", "Driving Licence Services"));
            ((ImageView) findViewById).setOnClickListener(new o0(dialog));
            ((TextView) findViewById4).setText(R.string.multi_string_serial);
            ((TextView) findViewById3).setText(dlServicesMainScreen.c2().b("check_dl_serv_dupl_dl", "Issue of Duplicate DL") + 10 + dlServicesMainScreen.c2().b("check_dl_serv_renewal_dl", "Renewal of DL") + 10 + dlServicesMainScreen.c2().b("check_dl_serv_change_addr", "Change of Address in DL") + 10 + dlServicesMainScreen.c2().b("check_dl_serv_replacement_dl", "Replacement of DL") + 10 + dlServicesMainScreen.c2().b("hill_region_title", "Endorsement to Drive in Hill Region") + 10 + dlServicesMainScreen.c2().b("change_name_dl", "Change of Name in DL") + 10 + dlServicesMainScreen.c2().b("change_birth_dl", "Change of Date of Birth in DL") + 10 + dlServicesMainScreen.c2().b("label_international_driv_permit", "International Driving Permit"));
            textView.setOnClickListener(new p0(dialog));
            Window window2 = dialog.getWindow();
            cm.l.c(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void z2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void B2(String str) {
        cm.l.f(str, "message");
        String b10 = c2().b("nex_parivahan", getString(R.string.app_name));
        cm.l.c(b10);
        String b11 = c2().b("btn_ok", getString(R.string.ok_txt));
        cm.l.c(b11);
        oi.g.n1(this, b10, str, 1, b11, (String) null, g.f8127e, 16, (Object) null);
    }

    public final void C2(d3 d3Var) {
        cm.l.f(d3Var, "<set-?>");
        this.K = d3Var;
    }

    public final void D2(String str) {
        cm.l.f(str, "<set-?>");
        this.X = str;
    }

    public final void E2(DatabaseHelper databaseHelper) {
        cm.l.f(databaseHelper, "<set-?>");
        this.L = databaseHelper;
    }

    public final void F2() {
        if (X1().c0() != null) {
            V1().I.setVisibility(0);
            ArrayList c02 = X1().c0();
            if (c02 != null && c02.size() > 0) {
                V1().E.setText(((DLDocument) c02.get(0)).getDocnumber());
                return;
            }
            return;
        }
        V1().I.setVisibility(8);
    }

    public final void G2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.Q = dldetobjX;
    }

    public final void H2(ba.b bVar) {
        cm.l.f(bVar, "<set-?>");
        this.O = bVar;
    }

    public final void I2(TextView textView) {
        cm.l.f(textView, "<set-?>");
        this.S = textView;
    }

    public final void J2(EditText editText) {
        cm.l.f(editText, "<set-?>");
        this.R = editText;
    }

    public final void K2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final void L2(String str) {
        cm.l.f(str, "<set-?>");
        this.Z = str;
    }

    public final void M1(Context context, String str, int i10, ArrayList arrayList) {
        cm.l.f(context, "context");
        cm.l.f(arrayList, "multiList");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_pop1);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.process);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById4 = dialog.findViewById(R.id.sarathi_popup_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(c2().b("nex_parivahan", "NextGen mParivahan"));
        textView2.setText(c2().b("button_proceed", context.getString(R.string.Proceed)));
        textView.setText(c2().b("button_cancel", context.getString(R.string.cancel)));
        ((TextView) findViewById3).setText(str);
        textView.setOnClickListener(new l0(dialog));
        textView2.setOnClickListener(new m0(dialog, this, arrayList));
        dialog.show();
    }

    public final void M2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.N = progressDialog;
    }

    public final void N2(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.P = dlServiceInt;
    }

    public final void O2(String str) {
        cm.l.f(str, "<set-?>");
        this.U = str;
    }

    public final void P2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.W = fVar;
    }

    public final void Q1(ArrayList arrayList) {
        cm.l.f(arrayList, "multiList");
        Intent intent = new Intent(this, DlServiceListActivity.class);
        intent.putExtra("DL", Y1().getDlobj().getDlLicno());
        Y1().getBioObj().setBioDob(String.valueOf(U1(Y1().getBioObj().getBioDob())));
        intent.putExtra("dob", Y1().getBioObj().getBioDob());
        intent.putExtra("DLDetails", Y1());
        intent.putExtra("bioRecGenesis", W1());
        intent.putExtra("multiList", arrayList);
        intent.putExtra("multiCheck", this.Z);
        startActivity(intent);
    }

    public final void Q2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final String R1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("MMM dd, yyyy").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final boolean R2(String str, String str2) {
        if (str == null || str.length() == 0 || (str2 != null && !p.q(str2))) {
            str = ((str != null && str.length() != 0) || str2 == null || str2.length() == 0) ? (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : z9.a.f18947a.j(str, str2) : str2;
        }
        Log.e("f_validity-> ", String.valueOf(str));
        try {
            a.C0251a aVar = z9.a.f18947a;
            LocalDate parse = LocalDate.parse(aVar.a(String.valueOf(str)));
            cm.l.e(parse, "parse(...)");
            return aVar.d(parse.minusDays(0).toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public final String S1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("yyyy-MM-dd").format(new SimpleDateFormat("dd-MMM-yyyy").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return R1(str);
        }
    }

    public final boolean S2(String str, String str2) {
        if (str == null || str.length() == 0 || (str2 != null && !p.q(str2))) {
            str = ((str != null && str.length() != 0) || str2 == null || str2.length() == 0) ? (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? null : z9.a.f18947a.j(str, str2) : str2;
        }
        Log.e("f_validity-> ", String.valueOf(str));
        try {
            a.C0251a aVar = z9.a.f18947a;
            LocalDate parse = LocalDate.parse(aVar.a(String.valueOf(str)));
            cm.l.e(parse, "parse(...)");
            return aVar.e(parse.minusMonths(12).toString());
        } catch (Exception unused) {
            return false;
        }
    }

    public final String T1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final String U1(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final d3 V1() {
        d3 d3Var = this.K;
        if (d3Var != null) {
            return d3Var;
        }
        cm.l.v("binding");
        return null;
    }

    public final String W1() {
        String str = this.X;
        if (str != null) {
            return str;
        }
        cm.l.v("bioRecGenesis");
        return null;
    }

    public final DatabaseHelper X1() {
        DatabaseHelper databaseHelper = this.L;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        cm.l.v("databaseHelper");
        return null;
    }

    public final DldetobjX Y1() {
        DldetobjX dldetobjX = this.Q;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ba.b Z1() {
        ba.b bVar = this.O;
        if (bVar != null) {
            return bVar;
        }
        cm.l.v("dlServicesViewModel");
        return null;
    }

    public final TextView a2() {
        TextView textView = this.S;
        if (textView != null) {
            return textView;
        }
        cm.l.v("dl_dob");
        return null;
    }

    public final EditText b2() {
        EditText editText = this.R;
        if (editText != null) {
            return editText;
        }
        cm.l.v("dl_number");
        return null;
    }

    public final ld.c c2() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final String d2(String str, String str2) {
        if (str != null && str.length() != 0 && (str2 == null || p.q(str2))) {
            return str.toString();
        }
        if ((str != null && str.length() != 0) || str2 == null || str2.length() == 0) {
            return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "null" : z9.a.f18947a.j(str, str2).toString();
        }
        return str2.toString();
    }

    public final ProgressDialog e2() {
        ProgressDialog progressDialog = this.N;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final DlServiceInt f2() {
        DlServiceInt dlServiceInt = this.P;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final String g2() {
        String str = this.U;
        if (str != null) {
            return str;
        }
        cm.l.v("rto_code");
        return null;
    }

    public final ld.f h2() {
        ld.f fVar = this.W;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sahi_session");
        return null;
    }

    public final String i2() {
        String str = this.V;
        if (str != null) {
            return str;
        }
        cm.l.v("select_Value");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_servcies_main_view_screen);
        cm.l.e(f10, "setContentView(...)");
        C2((d3) f10);
        P2(new ld.f(this));
        K2(new ld.c(this));
        j2();
        o2();
        k2();
        V1().L.f29577d.setOnClickListener(new f0(this));
        V1().L.f29581h.setVisibility(8);
        ld.f fVar = this.J;
        ld.f fVar2 = null;
        if (fVar == null) {
            cm.l.v("sarthiSession");
            fVar = null;
        }
        if (cm.l.a(fVar.b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            TextView textView = V1().L.f29580g;
            String b10 = c2().b("dl_services", getString(R.string.dl_services));
            cm.l.c(b10);
            textView.setText(b10);
            V1().L.f29580g.setPaintFlags(8 | V1().L.f29580g.getPaintFlags());
        } else {
            TextView textView2 = V1().L.f29580g;
            ld.f fVar3 = this.J;
            if (fVar3 == null) {
                cm.l.v("sarthiSession");
            } else {
                fVar2 = fVar3;
            }
            textView2.setText(fVar2.i());
            V1().L.f29579f.setVisibility(8);
        }
        V1().L.f29580g.setOnClickListener(new n0(this));
    }
}
