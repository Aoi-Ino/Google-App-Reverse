package com.nic.mparivahan.VahanServices.VahanView;

import ai.a1;
import ai.b1;
import ai.c1;
import ai.d1;
import ai.e1;
import ai.f1;
import ai.g1;
import ai.h1;
import ai.i1;
import ai.j1;
import ai.k1;
import ai.l1;
import ai.m1;
import ai.n1;
import ai.o1;
import ai.p1;
import ai.q1;
import ai.r1;
import ai.x0;
import ai.y0;
import ai.z0;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.m;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsFileDetail;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle;
import com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle;
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanLog.VahanLogUpdateDoc;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequestfinal;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.c;
import le.c;
import ni.md;
import og.o;
import pl.x;
import v9.d;

public final class VahanDmsAPI extends androidx.appcompat.app.d implements o.a, c.a {

    /* renamed from: m0  reason: collision with root package name */
    public static final a f21478m0 = new a((cm.g) null);
    public ProgressDialog G;
    public VahanProService H;
    public bi.h I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public je.c O;
    public DMSService P;
    public BeforePaymentRequest Q;
    public md R;
    private String S;
    public o T;
    private ArrayList U;
    private int V = -1;
    private Bitmap W;
    public le.c X;
    private List Y;
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f21479a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private boolean f21480b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21481c0;

    /* renamed from: d0  reason: collision with root package name */
    public NrvDetails f21482d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f21483e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f21484f0;

    /* renamed from: g0  reason: collision with root package name */
    private String f21485g0 = " ";

    /* renamed from: h0  reason: collision with root package name */
    private double f21486h0;

    /* renamed from: i0  reason: collision with root package name */
    private String f21487i0 = " ";

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f21488j0;

    /* renamed from: k0  reason: collision with root package name */
    private d.c f21489k0;

    /* renamed from: l0  reason: collision with root package name */
    private d.c f21490l0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21491e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21491e = vahanDmsAPI;
        }

        public final void b(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            VahanDmsAPI vahanDmsAPI;
            ld.c Q1;
            if (finalRequestSubmitResponse != null) {
                try {
                    if (!finalRequestSubmitResponse.getApplication_status()) {
                        if (this.f21491e.T1().isShowing()) {
                            this.f21491e.T1().dismiss();
                        }
                        vahanDmsAPI = this.f21491e;
                        Q1 = vahanDmsAPI.Q1();
                    } else if (this.f21491e.g2()) {
                        Intent intent = new Intent(this.f21491e, VahanFaceLessConfirmation.class);
                        intent.putExtra("state_code", this.f21491e.c2());
                        intent.putExtra("rc_number", this.f21491e.X1());
                        intent.putExtra(VContant.APP_NO, this.f21491e.L1());
                        intent.putExtra(VContant.PURPOSE_CODE, this.f21491e.W1());
                        this.f21491e.startActivity(intent);
                        this.f21491e.finish();
                        return;
                    } else {
                        this.f21491e.E1();
                        return;
                    }
                } catch (Exception unused) {
                    if (this.f21491e.T1().isShowing()) {
                        this.f21491e.T1().dismiss();
                        VahanDmsAPI vahanDmsAPI2 = this.f21491e;
                        vahanDmsAPI2.A2(vahanDmsAPI2, vahanDmsAPI2.Q1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                        return;
                    }
                    return;
                }
            } else {
                if (this.f21491e.T1().isShowing()) {
                    this.f21491e.T1().dismiss();
                }
                vahanDmsAPI = this.f21491e;
                Q1 = vahanDmsAPI.Q1();
            }
            vahanDmsAPI.A2(vahanDmsAPI, Q1.b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FinalRequestSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21492e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21492e = vahanDmsAPI;
        }

        public final void b(String str) {
            if (this.f21492e.T1().isShowing()) {
                this.f21492e.T1().dismiss();
                VahanDmsAPI vahanDmsAPI = this.f21492e;
                vahanDmsAPI.A2(vahanDmsAPI, vahanDmsAPI.Q1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21493e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21493e = vahanDmsAPI;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21493e.T1().isShowing()) {
                    this.f21493e.T1().dismiss();
                }
                Intent intent = new Intent(this.f21493e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21493e.W1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f21493e.Y1());
                intent.putExtra("RcDetails", this.f21493e.Z1());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21493e.g2());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21493e.J1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21493e.I1());
                this.f21493e.startActivity(intent);
                this.f21493e.finish();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SlotUserDataModel) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21494e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21494e = vahanDmsAPI;
        }

        public final void b(String str) {
            try {
                if (this.f21494e.T1().isShowing()) {
                    this.f21494e.T1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanDmsAPI vahanDmsAPI = this.f21494e;
                    Toast.makeText(vahanDmsAPI, vahanDmsAPI.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        VahanDmsAPI vahanDmsAPI2 = this.f21494e;
                        vahanDmsAPI2.t2(vahanDmsAPI2, str);
                        return;
                    }
                }
                VahanDmsAPI vahanDmsAPI3 = this.f21494e;
                vahanDmsAPI3.t2(vahanDmsAPI3, vahanDmsAPI3.getString(R.string.service_unavable_please_try));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21495e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21495e = vahanDmsAPI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ec A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0130 A[Catch:{ Exception -> 0x0040 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r8) {
            /*
                r7 = this;
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r0 = r7.f21495e
                android.app.ProgressDialog r0 = r0.T1()
                r0.dismiss()
                r0 = 2132019106(0x7f1407a2, float:1.9676538E38)
                r1 = 8
                java.lang.String r2 = r8.getStatusCode()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = "V001"
                r4 = 1
                boolean r2 = km.p.o(r2, r3, r4)     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x013c
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27487h     // Catch:{ Exception -> 0x0040 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27489j     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r4 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                r5 = 0
                if (r4 == 0) goto L_0x0043
                java.util.List r4 = r4.getNonUploadedList()     // Catch:{ Exception -> 0x0040 }
                goto L_0x0044
            L_0x0040:
                r8 = move-exception
                goto L_0x017a
            L_0x0043:
                r4 = r5
            L_0x0044:
                java.lang.String r6 = "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded> }"
                cm.l.d(r4, r6)     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ Exception -> 0x0040 }
                r2.N2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.R1()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x009d
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                if (r2 != 0) goto L_0x009d
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r2 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0071
                java.util.List r2 = r2.getUploadedList()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0071
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0072
            L_0x0071:
                r2 = r5
            L_0x0072:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x009d
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f27497r     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.TextView r2 = r2.f27488i     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.TextView r2 = r2.f27495p     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00d7
            L_0x009d:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.R1()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00ae
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00af
            L_0x00ae:
                r2 = r5
            L_0x00af:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x00d7
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                og.o r4 = new og.o     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r6 = r2.R1()     // Catch:{ Exception -> 0x0040 }
                r4.<init>(r2, r2, r6)     // Catch:{ Exception -> 0x0040 }
                r2.H2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f27497r     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r4 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                og.o r4 = r4.K1()     // Catch:{ Exception -> 0x0040 }
                r2.setAdapter(r4)     // Catch:{ Exception -> 0x0040 }
            L_0x00d7:
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r2 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00ec
                java.util.List r2 = r2.getUploadedList()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00ec
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00ed
            L_0x00ec:
                r2 = r5
            L_0x00ed:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x0130
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r2 = r2.f27498s     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r8 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r8 == 0) goto L_0x010d
                java.util.List r5 = r8.getUploadedList()     // Catch:{ Exception -> 0x0040 }
            L_0x010d:
                r2.Z2(r5)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                le.c r2 = new le.c     // Catch:{ Exception -> 0x0040 }
                java.util.List r3 = r8.e2()     // Catch:{ Exception -> 0x0040 }
                r2.<init>(r8, r8, r3)     // Catch:{ Exception -> 0x0040 }
                r8.Y2(r2)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r8 = r8.f27499t     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                le.c r2 = r2.d2()     // Catch:{ Exception -> 0x0040 }
                r8.setAdapter(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0191
            L_0x0130:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r8 = r8.f27498s     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0191
            L_0x013c:
                ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0040 }
                boolean r2 = r2.m(r3)     // Catch:{ Exception -> 0x0040 }
                if (r2 != 0) goto L_0x0165
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27487h     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r2 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0040 }
                r2.e3(r2, r8)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0191
            L_0x0165:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                ni.md r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r8 = r8.f27487h     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r2 = r8.getString(r0)     // Catch:{ Exception -> 0x0040 }
                r8.e3(r8, r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0191
            L_0x017a:
                r8.printStackTrace()
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e
                ni.md r8 = r8.M1()
                android.widget.FrameLayout r8 = r8.f27487h
                r8.setVisibility(r1)
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r8 = r7.f21495e
                java.lang.String r0 = r8.getString(r0)
                r8.e3(r8, r0)
            L_0x0191:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.f.b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanDmsModleResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsAPI f21496e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanDmsAPI vahanDmsAPI) {
            super(1);
            this.f21496e = vahanDmsAPI;
        }

        public final void b(String str) {
            this.f21496e.T1().dismiss();
            this.f21496e.M1().f27487h.setVisibility(8);
            VahanDmsAPI vahanDmsAPI = this.f21496e;
            vahanDmsAPI.e3(vahanDmsAPI, vahanDmsAPI.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21497a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f21497a = lVar;
        }

        public final pl.c a() {
            return this.f21497a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21497a.invoke(obj);
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

    public VahanDmsAPI() {
        d.c y02 = y0(new e.d(), new x0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21489k0 = y02;
        d.c y03 = y0(new e.b(), new i1(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f21490l0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void B2(Dialog dialog, VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanDmsAPI, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(vahanDmsAPI, VahanDmsAPI.class);
        intent.putExtra("state_code", vahanDmsAPI.c2());
        intent.putExtra(VContant.APP_NO, vahanDmsAPI.L1());
        intent.putExtra("rc_number", vahanDmsAPI.X1());
        intent.putExtra(VContant.PURPOSE_CODE, vahanDmsAPI.W1());
        intent.putExtra("off_code", vahanDmsAPI.S1());
        intent.putExtra(VContant.FINAL_SUBMIT, vahanDmsAPI.U1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanDmsAPI.f21480b0);
        intent.putExtra("RC", vahanDmsAPI.Y1());
        intent.putExtra("RcDetails", vahanDmsAPI.Z1());
        intent.putExtra("vahlogReptDate", vahanDmsAPI.f21485g0);
        intent.putExtra("vahlogFeeAmt", vahanDmsAPI.f21486h0);
        intent.putExtra("vahlogReptNo", vahanDmsAPI.f21487i0);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanDmsAPI.J1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanDmsAPI.I1());
        vahanDmsAPI.startActivity(intent);
        vahanDmsAPI.finish();
    }

    /* access modifiers changed from: private */
    public static final void D2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void E1() {
        try {
            b2().l(this, L1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void E2(android.graphics.Bitmap r3) {
        /*
            r2 = this;
            java.lang.String r0 = "calling"
            if (r3 == 0) goto L_0x006d
            java.lang.String r1 = "2"
            android.util.Log.e(r0, r1)
            r2.W = r3
            java.util.ArrayList r3 = r2.U
            r0 = 0
            if (r3 == 0) goto L_0x0019
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x001a
        L_0x0019:
            r3 = r0
        L_0x001a:
            if (r3 != 0) goto L_0x001d
            goto L_0x0022
        L_0x001d:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.setAttached(r1)
        L_0x0022:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x002f
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            if (r3 != 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            android.graphics.Bitmap r1 = r2.W
            r3.setBitmap(r1)
        L_0x0038:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x0045
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0046
        L_0x0045:
            r3 = r0
        L_0x0046:
            if (r3 != 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            java.lang.String r1 = r2.Z
            r3.setCatId(r1)
        L_0x004e:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x005b
            int r0 = r2.V
            java.lang.Object r3 = r3.get(r0)
            r0 = r3
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
        L_0x005b:
            if (r0 != 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.lang.String r3 = r2.f21479a0
            r0.setSubId(r3)
        L_0x0063:
            og.o r3 = r2.K1()
            int r0 = r2.V
            r3.k(r0)
            goto L_0x0072
        L_0x006d:
            java.lang.String r3 = "3"
            android.util.Log.e(r0, r3)
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.E2(android.graphics.Bitmap):void");
    }

    private final Bitmap F1(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    private final void G1() {
        if (Build.VERSION.SDK_INT < 31 && checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P1(com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r5, r0)
            if (r6 == 0) goto L_0x00fb
            java.lang.String r0 = com.nic.mparivahan.dlservices.utilities.e.q(r5, r6)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = com.nic.mparivahan.dlservices.utilities.e.r(r5, r6)     // Catch:{ Exception -> 0x00fb }
            java.util.ArrayList r2 = r5.H1()     // Catch:{ Exception -> 0x00fb }
            java.lang.CharSequence r3 = km.q.B0(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00fb }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x00fb }
            if (r2 == 0) goto L_0x00e7
            java.lang.CharSequence r1 = km.q.B0(r1)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r2 = "pdf"
            r3 = 1
            boolean r1 = km.p.o(r1, r2, r3)     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x00d8
            java.lang.String r6 = com.nic.mparivahan.dlservices.utilities.e.a(r5, r6)     // Catch:{ Exception -> 0x00fb }
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            r2 = 0
            if (r1 == 0) goto L_0x0044
            int r4 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x0045
        L_0x0044:
            r1 = r2
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00fb }
            r1.setAttached(r4)     // Catch:{ Exception -> 0x00fb }
        L_0x004d:
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x005a
            int r4 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x005b
        L_0x005a:
            r1 = r2
        L_0x005b:
            if (r1 != 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            android.graphics.Bitmap r4 = r5.W     // Catch:{ Exception -> 0x00fb }
            r1.setBitmap(r4)     // Catch:{ Exception -> 0x00fb }
        L_0x0063:
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x0070
            int r4 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x0071
        L_0x0070:
            r1 = r2
        L_0x0071:
            if (r1 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            java.lang.String r4 = r5.Z     // Catch:{ Exception -> 0x00fb }
            r1.setCatId(r4)     // Catch:{ Exception -> 0x00fb }
        L_0x0079:
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x0086
            int r4 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x0087
        L_0x0086:
            r1 = r2
        L_0x0087:
            if (r1 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            java.lang.String r4 = r5.f21479a0     // Catch:{ Exception -> 0x00fb }
            r1.setSubId(r4)     // Catch:{ Exception -> 0x00fb }
        L_0x008f:
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x009c
            int r4 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x009d
        L_0x009c:
            r1 = r2
        L_0x009d:
            if (r1 != 0) goto L_0x00a0
            goto L_0x00a7
        L_0x00a0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00fb }
            r1.setDocType(r3)     // Catch:{ Exception -> 0x00fb }
        L_0x00a7:
            java.util.ArrayList r1 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x00b4
            int r3 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x00fb }
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1     // Catch:{ Exception -> 0x00fb }
            goto L_0x00b5
        L_0x00b4:
            r1 = r2
        L_0x00b5:
            if (r1 != 0) goto L_0x00b8
            goto L_0x00bb
        L_0x00b8:
            r1.setDocBase64(r6)     // Catch:{ Exception -> 0x00fb }
        L_0x00bb:
            java.util.ArrayList r6 = r5.U     // Catch:{ Exception -> 0x00fb }
            if (r6 == 0) goto L_0x00c8
            int r1 = r5.V     // Catch:{ Exception -> 0x00fb }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ Exception -> 0x00fb }
            r2 = r6
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r2 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r2     // Catch:{ Exception -> 0x00fb }
        L_0x00c8:
            if (r2 != 0) goto L_0x00cb
            goto L_0x00ce
        L_0x00cb:
            r2.setFile_name(r0)     // Catch:{ Exception -> 0x00fb }
        L_0x00ce:
            og.o r6 = r5.K1()     // Catch:{ Exception -> 0x00fb }
            int r5 = r5.V     // Catch:{ Exception -> 0x00fb }
            r6.k(r5)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00d8:
            android.content.ContentResolver r0 = r5.getContentResolver()     // Catch:{ Exception -> 0x00fb }
            android.graphics.Bitmap r6 = android.provider.MediaStore.Images.Media.getBitmap(r0, r6)     // Catch:{ Exception -> 0x00fb }
            cm.l.c(r6)     // Catch:{ Exception -> 0x00fb }
            r5.f2(r6)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00e7:
            ld.c r6 = r5.Q1()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r0 = "upload_file_types"
            java.lang.String r1 = "You can only upload file types (JPEG/JPG/PDF) and Maximum File Size is 200KB."
            java.lang.String r6 = r6.b(r0, r1)     // Catch:{ Exception -> 0x00fb }
            r0 = 0
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r0)     // Catch:{ Exception -> 0x00fb }
            r5.show()     // Catch:{ Exception -> 0x00fb }
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.P1(com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI, android.net.Uri):void");
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanDmsAPI vahanDmsAPI, d.a aVar) {
        cm.l.f(vahanDmsAPI, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = null;
            Bundle extras = c10 != null ? c10.getExtras() : null;
            String str2 = vahanDmsAPI.S;
            if (str2 == null) {
                cm.l.v("imgType");
            } else {
                str = str2;
            }
            if (cm.l.a(str, "photo") && extras != null) {
                vahanDmsAPI.a3(extras);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a3(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = "data"
            java.lang.Object r3 = r3.get(r0)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            r2.W = r3
            java.util.ArrayList r3 = r2.U
            r0 = 0
            if (r3 == 0) goto L_0x0018
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0019
        L_0x0018:
            r3 = r0
        L_0x0019:
            if (r3 != 0) goto L_0x001c
            goto L_0x0021
        L_0x001c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.setAttached(r1)
        L_0x0021:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x002e
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x002f
        L_0x002e:
            r3 = r0
        L_0x002f:
            if (r3 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            android.graphics.Bitmap r1 = r2.W
            r3.setBitmap(r1)
        L_0x0037:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x0044
            int r1 = r2.V
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0045
        L_0x0044:
            r3 = r0
        L_0x0045:
            if (r3 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            java.lang.String r1 = r2.Z
            r3.setCatId(r1)
        L_0x004d:
            java.util.ArrayList r3 = r2.U
            if (r3 == 0) goto L_0x005a
            int r0 = r2.V
            java.lang.Object r3 = r3.get(r0)
            r0 = r3
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            java.lang.String r3 = r2.f21479a0
            r0.setSubId(r3)
        L_0x0062:
            og.o r3 = r2.K1()
            int r0 = r2.V
            r3.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.a3(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public static final void c3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void d3(ArrayList arrayList) {
        DmsFileDetail dmsFileDetail;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        cm.l.c(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cm.l.a(((NonUploaded) arrayList2.get(i10)).isAttached(), Boolean.TRUE) && !(((NonUploaded) arrayList2.get(i10)).getBitmap() == null && ((NonUploaded) arrayList2.get(i10)).getDocBase64() == null)) {
                Integer docType = ((NonUploaded) arrayList2.get(i10)).getDocType();
                if (docType == null || docType.intValue() != 1 || ((NonUploaded) arrayList2.get(i10)).getDocBase64() == null) {
                    Bitmap bitmap = ((NonUploaded) arrayList2.get(i10)).getBitmap();
                    cm.l.c(bitmap);
                    String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                    String catId = ((NonUploaded) arrayList2.get(i10)).getCatId();
                    cm.l.c(catId);
                    String subId = ((NonUploaded) arrayList2.get(i10)).getSubId();
                    cm.l.c(subId);
                    dmsFileDetail = new DmsFileDetail(f10, catId, subId, "file_" + System.currentTimeMillis() + i10 + ".jpg", false);
                } else {
                    String docBase64 = ((NonUploaded) arrayList2.get(i10)).getDocBase64();
                    cm.l.c(docBase64);
                    String catId2 = ((NonUploaded) arrayList2.get(i10)).getCatId();
                    cm.l.c(catId2);
                    String subId2 = ((NonUploaded) arrayList2.get(i10)).getSubId();
                    cm.l.c(subId2);
                    dmsFileDetail = new DmsFileDetail(docBase64, catId2, subId2, "file_" + System.currentTimeMillis() + i10 + ".pdf", false);
                }
                arrayList3.addAll(p.d(dmsFileDetail));
            }
        }
        Log.v("List Size", String.valueOf(arrayList3.size()));
        DmsUploadReq dmsUploadReq = new DmsUploadReq(q.B0(L1()).toString(), arrayList3, q.B0(c2()).toString());
        M1().f27495p.setEnabled(false);
        O1().t(dmsUploadReq);
    }

    private final void f2(Bitmap bitmap) {
        Log.e("calling", "2");
        E2(bitmap);
    }

    /* access modifiers changed from: private */
    public static final void f3(Dialog dialog, VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanDmsAPI, "this$0");
        dialog.dismiss();
        vahanDmsAPI.finish();
    }

    /* access modifiers changed from: private */
    public static final void h2(VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(vahanDmsAPI, "this$0");
        VUtility.Companion.v(vahanDmsAPI, vahanDmsAPI.Q1().b("are_you_sure_you_want_to_leave", vahanDmsAPI.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void i2(VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(vahanDmsAPI, "this$0");
        Intent intent = new Intent(vahanDmsAPI, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanDmsAPI.Y1());
        intent.putExtra("RcDetails", vahanDmsAPI.Z1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanDmsAPI.f21480b0);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanDmsAPI.J1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanDmsAPI.I1());
        vahanDmsAPI.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanDmsAPI vahanDmsAPI, View view) {
        VahanDmsAPI vahanDmsAPI2 = vahanDmsAPI;
        cm.l.f(vahanDmsAPI2, "this$0");
        if (vahanDmsAPI2.D1(vahanDmsAPI2.U)) {
            vahanDmsAPI2.y2(vahanDmsAPI2, vahanDmsAPI.Q1().b("doc_mandatory", "Please Upload all the mandatory documents"));
            return;
        }
        try {
            String.valueOf(System.currentTimeMillis());
            String str = vahanDmsAPI2.f21485g0;
            String str2 = vahanDmsAPI2.f21487i0;
            double d10 = vahanDmsAPI2.f21486h0;
            String L1 = vahanDmsAPI.L1();
            String Y1 = vahanDmsAPI.Y1();
            d.a aVar = v9.d.f17494a;
            VahanLogUpdateDoc.f20968k.a(vahanDmsAPI2, new DocUpdateLogs(str, str, str2, d10, L1, Y1, aVar.m(), aVar.m()));
        } catch (Exception e10) {
            e10.toString();
        }
        vahanDmsAPI.T1().show();
        BeforePaymentRequestfinal beforePaymentRequestfinal = r2;
        BeforePaymentRequestfinal beforePaymentRequestfinal2 = new BeforePaymentRequestfinal(vahanDmsAPI.U1().getAadharauth(), vahanDmsAPI.L1(), vahanDmsAPI.U1().getChanngeOfAdressDto(), vahanDmsAPI.U1().getComp_cd(), vahanDmsAPI.U1().getDurcdto(), vahanDmsAPI.U1().getFir_dt(), vahanDmsAPI.U1().getFir_no(), vahanDmsAPI.U1().getHpaDto(), vahanDmsAPI.U1().getHptDto(), vahanDmsAPI.U1().getIdv(), String.valueOf(vahanDmsAPI.U1().getIns_from()), vahanDmsAPI.U1().getIns_type(), String.valueOf(vahanDmsAPI.U1().getIns_upto()), vahanDmsAPI.U1().getMsg().toString(), vahanDmsAPI.U1().getNocDto(), vahanDmsAPI.U1().getOff_cd().toString(), vahanDmsAPI.U1().getOp_dt().toString(), vahanDmsAPI.U1().getPolice_station().toString(), vahanDmsAPI.U1().getPolicy_no().toString(), vahanDmsAPI.U1().getPur_cd().toString(), vahanDmsAPI2.f21485g0, vahanDmsAPI2.f21487i0, String.valueOf(vahanDmsAPI2.f21486h0), vahanDmsAPI.U1().getReason(), vahanDmsAPI.U1().getRegn_no().toString(), vahanDmsAPI.U1().getState_cd().toString(), vahanDmsAPI.U1().getState_header().toString(), vahanDmsAPI.U1().getStatus().toString(), vahanDmsAPI.U1().getTax_mode().toString(), vahanDmsAPI.U1().getVh_class());
        vahanDmsAPI.b2().o1(beforePaymentRequestfinal);
    }

    /* access modifiers changed from: private */
    public static final void k2(VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.M1().f27499t.setVisibility(vahanDmsAPI.M1().f27499t.getVisibility() == 0 ? 8 : 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r10 = r17.O1();
        r11 = r17.L1();
        r12 = r17.W1();
        r13 = r17.c2();
        r0 = r17.Z1().getVehTypeAsInt();
        cm.l.c(r0);
        r10.p(r11, r12, r13, r0.intValue(), 10, r17.Z1());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x006e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l2(com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI r17, com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes r18) {
        /*
            r1 = r17
            java.lang.String r2 = "Error"
            java.lang.String r0 = "V001"
            java.lang.String r3 = "this$0"
            cm.l.f(r1, r3)
            ni.md r3 = r17.M1()
            android.widget.TextView r3 = r3.f27495p
            r4 = 1
            r3.setEnabled(r4)
            java.lang.String r3 = r18.getStatusCode()     // Catch:{ Exception -> 0x0097 }
            boolean r3 = km.p.o(r3, r0, r4)     // Catch:{ Exception -> 0x0097 }
            if (r3 == 0) goto L_0x00d1
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r0 = r17.W1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r3 = "3"
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x0097 }
            if (r0 == 0) goto L_0x0099
            je.c r3 = r17.O1()     // Catch:{ Exception -> 0x006e }
            java.lang.String r4 = r17.L1()     // Catch:{ Exception -> 0x006e }
            java.lang.String r5 = r17.W1()     // Catch:{ Exception -> 0x006e }
            java.lang.String r6 = r17.c2()     // Catch:{ Exception -> 0x006e }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r17.Z1()     // Catch:{ Exception -> 0x006e }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x006e }
            cm.l.c(r0)     // Catch:{ Exception -> 0x006e }
            int r7 = r0.intValue()     // Catch:{ Exception -> 0x006e }
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r0 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x006e }
            com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest r8 = r17.U1()     // Catch:{ Exception -> 0x006e }
            com.nic.mparivahan.VahanServices.DRcModle.dulicateRcResponseModle r8 = r8.getDurcdto()     // Catch:{ Exception -> 0x006e }
            if (r8 == 0) goto L_0x005e
            java.lang.String r8 = r8.getReason()     // Catch:{ Exception -> 0x006e }
            goto L_0x005f
        L_0x005e:
            r8 = 0
        L_0x005f:
            cm.l.c(r8)     // Catch:{ Exception -> 0x006e }
            int r8 = r0.z(r8)     // Catch:{ Exception -> 0x006e }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r9 = r17.Z1()     // Catch:{ Exception -> 0x006e }
            r3.p(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x006e }
            goto L_0x00c1
        L_0x006e:
            je.c r10 = r17.O1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r11 = r17.L1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r12 = r17.W1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r13 = r17.c2()     // Catch:{ Exception -> 0x0097 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r17.Z1()     // Catch:{ Exception -> 0x0097 }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x0097 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0097 }
            int r14 = r0.intValue()     // Catch:{ Exception -> 0x0097 }
            r15 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r16 = r17.Z1()     // Catch:{ Exception -> 0x0097 }
            r10.p(r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0097 }
            goto L_0x00c1
        L_0x0097:
            r0 = move-exception
            goto L_0x00e3
        L_0x0099:
            je.c r3 = r17.O1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r4 = r17.L1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r5 = r17.W1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = r17.c2()     // Catch:{ Exception -> 0x0097 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r17.Z1()     // Catch:{ Exception -> 0x0097 }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x0097 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x0097 }
            int r7 = r0.intValue()     // Catch:{ Exception -> 0x0097 }
            r8 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r9 = r17.Z1()     // Catch:{ Exception -> 0x0097 }
            r3.p(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0097 }
        L_0x00c1:
            ld.c r0 = r17.Q1()     // Catch:{ Exception -> 0x0097 }
            java.lang.String r3 = "doc_uploaded_successfully"
            java.lang.String r4 = "Documents has been Successfully Uploaded!"
            java.lang.String r0 = r0.b(r3, r4)     // Catch:{ Exception -> 0x0097 }
            r1.C2(r1, r0)     // Catch:{ Exception -> 0x0097 }
            goto L_0x00f9
        L_0x00d1:
            java.lang.String r0 = "Error1"
            java.lang.String r3 = "erro"
            android.util.Log.e(r0, r3)     // Catch:{ Exception -> 0x0097 }
            android.app.ProgressDialog r0 = r17.T1()     // Catch:{ Exception -> 0x0097 }
            r0.dismiss()     // Catch:{ Exception -> 0x0097 }
            r1.w2(r1)     // Catch:{ Exception -> 0x0097 }
            goto L_0x00f9
        L_0x00e3:
            r0.printStackTrace()
            pl.x r0 = pl.x.f30437a
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            android.app.ProgressDialog r0 = r17.T1()
            r0.dismiss()
            r1.w2(r1)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.l2(com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI, com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes):void");
    }

    /* access modifiers changed from: private */
    public static final void m2(VahanDmsAPI vahanDmsAPI, String str) {
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.M1().f27495p.setEnabled(true);
        vahanDmsAPI.T1().dismiss();
        vahanDmsAPI.w2(vahanDmsAPI);
    }

    /* access modifiers changed from: private */
    public static final void n2(VahanDmsAPI vahanDmsAPI, VahanDmsModleResponse vahanDmsModleResponse) {
        List<Uploaded> uploadedList;
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.T1().dismiss();
        if (p.o(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
            ArrayList arrayList = vahanDmsAPI.U;
            if (arrayList != null) {
                arrayList.clear();
            }
            UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
            ArrayList arrayList2 = (ArrayList) (uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null);
            vahanDmsAPI.U = arrayList2;
            Integer valueOf = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
            cm.l.c(valueOf);
            if (valueOf.intValue() > 0) {
                vahanDmsAPI.M1().f27497r.setAdapter((RecyclerView.h) null);
                vahanDmsAPI.H2(new o(vahanDmsAPI, vahanDmsAPI, vahanDmsAPI.U));
                vahanDmsAPI.M1().f27497r.setAdapter(vahanDmsAPI.K1());
            } else {
                ArrayList arrayList3 = vahanDmsAPI.U;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                vahanDmsAPI.M1().f27497r.setAdapter((RecyclerView.h) null);
            }
            vahanDmsAPI.K1().j();
            UploadDataDto uploadDataDto2 = vahanDmsModleResponse.getUploadDataDto();
            Integer valueOf2 = (uploadDataDto2 == null || (uploadedList = uploadDataDto2.getUploadedList()) == null) ? null : Integer.valueOf(uploadedList.size());
            cm.l.c(valueOf2);
            if (valueOf2.intValue() > 0) {
                try {
                    vahanDmsAPI.M1().f27498s.setVisibility(0);
                    UploadDataDto uploadDataDto3 = vahanDmsModleResponse.getUploadDataDto();
                    vahanDmsAPI.Y = uploadDataDto3 != null ? uploadDataDto3.getUploadedList() : null;
                    vahanDmsAPI.M1().f27499t.setAdapter((RecyclerView.h) null);
                    vahanDmsAPI.Y2(new le.c(vahanDmsAPI, vahanDmsAPI, vahanDmsAPI.Y));
                    vahanDmsAPI.M1().f27499t.setAdapter(vahanDmsAPI.d2());
                    vahanDmsAPI.d2().j();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (vahanDmsAPI.D1(vahanDmsAPI.U)) {
                vahanDmsAPI.M1().f27488i.setVisibility(8);
                vahanDmsAPI.M1().f27495p.setVisibility(0);
                return;
            }
            vahanDmsAPI.M1().f27488i.setVisibility(0);
            vahanDmsAPI.M1().f27495p.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void o2(VahanDmsAPI vahanDmsAPI, String str) {
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.T1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p2(VahanDmsAPI vahanDmsAPI, DMSViewDocModle dMSViewDocModle) {
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.T1().dismiss();
        if (!p.o(dMSViewDocModle.getStatusCode(), "V001", true)) {
            return;
        }
        if (p.o(dMSViewDocModle.getFileExt(), ".pdf", true)) {
            try {
                vahanDmsAPI.s2(dMSViewDocModle.getFileName(), dMSViewDocModle.getFileContent());
            } catch (Exception unused) {
            }
        } else {
            vahanDmsAPI.b3(vahanDmsAPI, dMSViewDocModle.getFileContent());
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(VahanDmsAPI vahanDmsAPI, String str) {
        cm.l.f(vahanDmsAPI, "this$0");
        vahanDmsAPI.T1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r2(VahanDmsAPI vahanDmsAPI, View view) {
        cm.l.f(vahanDmsAPI, "this$0");
        if (vahanDmsAPI.C1(vahanDmsAPI.U)) {
            vahanDmsAPI.T1().show();
            try {
                vahanDmsAPI.d3(vahanDmsAPI.U);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            vahanDmsAPI.y2(vahanDmsAPI, vahanDmsAPI.Q1().b("doc_mandatory", "Please Upload all the mandatory documents"));
        }
    }

    /* access modifiers changed from: private */
    public final void t2(Context context, String str) {
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
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        textView2.setVisibility(8);
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById4).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        textView2.setText(cVar.b("vahan_btn_cancel", context.getString(R.string.cancel)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new h1(dialog));
        textView2.setOnClickListener(new j1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void u2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void v2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void x2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void z2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final void A2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validate_pop_up_for_document);
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
        ((TextView) findViewById2).setOnClickListener(new e1(dialog, this));
        dialog.show();
    }

    public final boolean C1(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (cm.l.a(((NonUploaded) it.next()).isAttached(), Boolean.TRUE)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void C2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        textView.setText(new ld.c(context).b("btn_ok", context.getString(R.string.ok_txt)));
        textView.setOnClickListener(new d1(dialog));
        dialog.show();
    }

    public final boolean D1(ArrayList arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (p.o(String.valueOf(((NonUploaded) it.next()).getMandatory()), "Y", true)) {
                    Log.e("check", "y");
                    return true;
                }
            }
        }
        return false;
    }

    public final void F2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21484f0 = str;
    }

    public final void G2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21483e0 = str;
    }

    public final ArrayList H1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("JPEG");
        arrayList.add("JPG");
        arrayList.add("PDF");
        arrayList.add("jpeg");
        arrayList.add("jpg");
        arrayList.add("pdf");
        arrayList.add("PNG");
        arrayList.add("png");
        return arrayList;
    }

    public final void H2(o oVar) {
        cm.l.f(oVar, "<set-?>");
        this.T = oVar;
    }

    public final String I1() {
        String str = this.f21484f0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final String J1() {
        String str = this.f21483e0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final void J2(md mdVar) {
        cm.l.f(mdVar, "<set-?>");
        this.R = mdVar;
    }

    public final o K1() {
        o oVar = this.T;
        if (oVar != null) {
            return oVar;
        }
        cm.l.v("adapter");
        return null;
    }

    public final void K2(DMSService dMSService) {
        cm.l.f(dMSService, "<set-?>");
        this.P = dMSService;
    }

    public final String L1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("appl_no");
        return null;
    }

    public final void L2(je.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final md M1() {
        md mdVar = this.R;
        if (mdVar != null) {
            return mdVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final void M2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21488j0 = cVar;
    }

    public final DMSService N1() {
        DMSService dMSService = this.P;
        if (dMSService != null) {
            return dMSService;
        }
        cm.l.v("dmsService");
        return null;
    }

    public final void N2(ArrayList arrayList) {
        this.U = arrayList;
    }

    public final je.c O1() {
        je.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("dmsViewModle");
        return null;
    }

    public final void O2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void P2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final ld.c Q1() {
        ld.c cVar = this.f21488j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final void Q2(BeforePaymentRequest beforePaymentRequest) {
        cm.l.f(beforePaymentRequest, "<set-?>");
        this.Q = beforePaymentRequest;
    }

    public final ArrayList R1() {
        return this.U;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final String S1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("offCd");
        return null;
    }

    public final void S2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final ProgressDialog T1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void T2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21481c0 = str;
    }

    public final BeforePaymentRequest U1() {
        BeforePaymentRequest beforePaymentRequest = this.Q;
        if (beforePaymentRequest != null) {
            return beforePaymentRequest;
        }
        cm.l.v("paymentRequest");
        return null;
    }

    public final void U2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21482d0 = nrvDetails;
    }

    public final void V2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final String W1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final void W2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.I = hVar;
    }

    public final String X1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_no");
        return null;
    }

    public final void X2(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final String Y1() {
        String str = this.f21481c0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final void Y2(le.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final NrvDetails Z1() {
        NrvDetails nrvDetails = this.f21482d0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final void Z2(List list) {
        this.Y = list;
    }

    public void a(int i10) {
    }

    public final VahanProService a2() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final bi.h b2() {
        bi.h hVar = this.I;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final void b3(Context context, String str) {
        cm.l.f(str, "base64");
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.show_dms_doc);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.images_upload);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        ((ImageView) findViewById2).setImageBitmap(F1(str));
        ((TextView) findViewById).setOnClickListener(new b1(dialog));
        dialog.show();
    }

    public final String c2() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public void d(int i10, String str, String str2) {
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.S = "signature";
            this.V = i10;
            this.Z = str;
            this.f21479a0 = str2;
            new Intent("android.intent.action.GET_CONTENT").setType("*/*");
            this.f21490l0.a("*/*");
        }
    }

    public final le.c d2() {
        le.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("uploaded_adapter");
        return null;
    }

    public void e(int i10, String str, String str2, Bitmap bitmap) {
        cm.l.f(str, "sub_id");
        cm.l.f(str2, "cat_id");
        T1().show();
        this.V = i10;
        cm.l.c(bitmap);
        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        O1().t(new DmsUploadReq(q.B0(L1()).toString(), p.d(new DmsFileDetail(f10, str2, str, "file_" + System.currentTimeMillis() + ".jpg", false)), q.B0(c2()).toString()));
    }

    public final List e2() {
        return this.Y;
    }

    public final void e3(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new f1(dialog, this));
        dialog.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.U
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.Object r0 = r0.get(r4)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            goto L_0x000d
        L_0x000c:
            r0 = r1
        L_0x000d:
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.setAttached(r2)
        L_0x0015:
            java.util.ArrayList r0 = r3.U
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.get(r4)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            goto L_0x0021
        L_0x0020:
            r0 = r1
        L_0x0021:
            if (r0 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r0.setBitmap(r1)
        L_0x0027:
            java.util.ArrayList r0 = r3.U
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r0.get(r4)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
            goto L_0x0033
        L_0x0032:
            r0 = r1
        L_0x0033:
            java.lang.String r2 = ""
            if (r0 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r0.setSubId(r2)
        L_0x003b:
            java.util.ArrayList r0 = r3.U
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r0.get(r4)
            r1 = r0
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r1 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r1
        L_0x0046:
            if (r1 != 0) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r1.setCatId(r2)
        L_0x004c:
            og.o r0 = r3.K1()
            r0.k(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsAPI.g(int):void");
    }

    public final boolean g2() {
        return this.f21480b0;
    }

    public void h(int i10, String str, String str2) {
        Intent intent;
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
            this.S = "photo";
            this.V = i10;
            this.Z = str;
            this.f21479a0 = str2;
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            this.S = "photo";
            this.V = i10;
            this.Z = str;
            this.f21479a0 = str2;
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } else {
            return;
        }
        setIntent(intent);
        this.f21489k0.a(getIntent());
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, Q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        je.c O1;
        String L1;
        String W1;
        String c22;
        int intValue;
        int i10;
        NrvDetails Z1;
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_dms_activity);
        md c10 = md.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        J2(c10);
        setContentView((View) M1().b());
        v9.e.f17509a.c2(this, M1());
        M2(new ld.c(this));
        V2(VahanProService.f21196b.b(this));
        K2(DMSService.f20571a.b(this));
        G1();
        P2(new ProgressDialog(this));
        T1().setMessage("Please wait...");
        T1().setCancelable(false);
        T1().setCanceledOnTouchOutside(false);
        M1().f27484e.f25959e.setOnClickListener(new k1(this));
        W2((bi.h) new u0((androidx.lifecycle.x0) this, (u0.b) new bi.g(new wg.d(a2()))).a(bi.h.class));
        L2((je.c) new u0((androidx.lifecycle.x0) this, (u0.b) new je.b(new je.a(N1()))).a(je.c.class));
        M1().f27497r.setLayoutManager(new LinearLayoutManager(this));
        M1().f27499t.setLayoutManager(new LinearLayoutManager(this));
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            cm.l.c(stringExtra);
            X2(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            cm.l.c(stringExtra2);
            I2(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            cm.l.c(stringExtra3);
            S2(stringExtra3);
            String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            cm.l.c(stringExtra4);
            R2(stringExtra4);
            String stringExtra5 = getIntent().getStringExtra("off_code");
            cm.l.c(stringExtra5);
            O2(stringExtra5);
            Serializable serializableExtra = getIntent().getSerializableExtra(VContant.FINAL_SUBMIT);
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanPaymentModel.BeforePaymentRequest");
            Q2((BeforePaymentRequest) serializableExtra);
            TextView textView = M1().f27500u;
            textView.setText(Q1().b("vehicle_no", "Vehicle No. :") + ' ' + X1());
            TextView textView2 = M1().f27481b;
            textView2.setText(Q1().b("vahan_application_no", "Application No.") + ' ' + L1());
            this.f21480b0 = getIntent().getBooleanExtra(VContant.NEXGEN_isFACELESS, false);
            G2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_name)));
            F2(String.valueOf(getIntent().getStringExtra(VContant.NEXGEN_addahar_address)));
            T2(String.valueOf(getIntent().getStringExtra("RC")));
            Serializable serializableExtra2 = getIntent().getSerializableExtra("RcDetails");
            cm.l.d(serializableExtra2, "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails");
            U2((NrvDetails) serializableExtra2);
            this.f21485g0 = String.valueOf(getIntent().getStringExtra("vahlogReptDate"));
            this.f21486h0 = getIntent().getDoubleExtra("vahlogFeeAmt", 0.0d);
            this.f21487i0 = String.valueOf(getIntent().getStringExtra("vahlogReptNo"));
            TextView textView3 = M1().f27484e.f25961g;
            VContant.Companion companion = VContant.Companion;
            textView3.setText(companion.I(this, W1()));
            M1().f27501v.setText(Q1().b("view_vehicle_details", "View Vehicle Details"));
            M1().f27501v.setPaintFlags(M1().f27501v.getPaintFlags() | 8);
            M1().f27501v.setOnClickListener(new m1(this));
            if (this.f21480b0) {
                M1().f27482c.f27883e.setWeightSum(3.0f);
            }
            boolean z10 = this.f21480b0;
            LinearLayout linearLayout = M1().f27482c.f27880b;
            cm.l.e(linearLayout, "appMent");
            companion.J(z10, linearLayout);
            M1().f27488i.setVisibility(8);
            M1().f27490k.setWeightSum(1.0f);
            T1().show();
            if (p.o(W1(), VContant.DUPLICATE_RC_PURPOSE_CODE, true)) {
                try {
                    c.a aVar = ka.c.f13158a;
                    dulicateRcResponseModle durcdto = U1().getDurcdto();
                    String str = null;
                    String reason = durcdto != null ? durcdto.getReason() : null;
                    cm.l.c(reason);
                    if (!aVar.m(String.valueOf(companion.z(reason)))) {
                        je.c O12 = O1();
                        String L12 = L1();
                        String W12 = W1();
                        String c23 = c2();
                        Integer vehTypeAsInt = Z1().getVehTypeAsInt();
                        cm.l.c(vehTypeAsInt);
                        int intValue2 = vehTypeAsInt.intValue();
                        dulicateRcResponseModle durcdto2 = U1().getDurcdto();
                        if (durcdto2 != null) {
                            str = durcdto2.getReason();
                        }
                        cm.l.c(str);
                        O12.g(L12, W12, c23, intValue2, companion.z(str), Z1());
                    } else {
                        je.c O13 = O1();
                        String L13 = L1();
                        String W13 = W1();
                        String c24 = c2();
                        Integer vehTypeAsInt2 = Z1().getVehTypeAsInt();
                        cm.l.c(vehTypeAsInt2);
                        O13.g(L13, W13, c24, vehTypeAsInt2.intValue(), 0, Z1());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    O1 = O1();
                    L1 = L1();
                    W1 = W1();
                    c22 = c2();
                    Integer vehTypeAsInt3 = Z1().getVehTypeAsInt();
                    cm.l.c(vehTypeAsInt3);
                    intValue = vehTypeAsInt3.intValue();
                    i10 = 0;
                    Z1 = Z1();
                }
                M1().f27498s.setOnClickListener(new n1(this));
                O1().h().g(this, new h(new f(this)));
                O1().i().g(this, new h(new g(this)));
                O1().j().g(this, new o1(this));
                O1().k().g(this, new p1(this));
                O1().l().g(this, new q1(this));
                O1().m().g(this, new r1(this));
                O1().q().g(this, new y0(this));
                O1().r().g(this, new z0(this));
                M1().f27495p.setOnClickListener(new a1(this));
                M1().f27488i.setOnClickListener(new l1(this));
                b2().Q().g(this, new h(new b(this)));
                b2().R().g(this, new h(new c(this)));
                b2().T0().g(this, new h(new d(this)));
                b2().S0().g(this, new h(new e(this)));
            }
            O1 = O1();
            L1 = L1();
            W1 = W1();
            c22 = c2();
            Integer vehTypeAsInt4 = Z1().getVehTypeAsInt();
            cm.l.c(vehTypeAsInt4);
            intValue = vehTypeAsInt4.intValue();
            i10 = 10;
            Z1 = Z1();
            O1.g(L1, W1, c22, intValue, i10, Z1);
            M1().f27498s.setOnClickListener(new n1(this));
            O1().h().g(this, new h(new f(this)));
            O1().i().g(this, new h(new g(this)));
            O1().j().g(this, new o1(this));
            O1().k().g(this, new p1(this));
            O1().l().g(this, new q1(this));
            O1().m().g(this, new r1(this));
            O1().q().g(this, new y0(this));
            O1().r().g(this, new z0(this));
            M1().f27495p.setOnClickListener(new a1(this));
            M1().f27488i.setOnClickListener(new l1(this));
            b2().Q().g(this, new h(new b(this)));
            b2().R().g(this, new h(new c(this)));
            b2().T0().g(this, new h(new d(this)));
            b2().S0().g(this, new h(new e(this)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 5001) {
            if ((!(iArr.length == 0)) && iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
                G1();
            }
        }
    }

    public void p(String str) {
        cm.l.f(str, "doc_number");
        try {
            T1().show();
            List l02 = q.l0(str, new String[]{"/"}, false, 0, 6, (Object) null);
            O1().u(q.B0((String) l02.get(0)).toString(), q.B0((String) l02.get(2)).toString(), q.B0((String) l02.get(1)).toString());
        } catch (Exception e10) {
            T1().dismiss();
            e10.printStackTrace();
        }
    }

    public final void s2(String str, String str2) {
        cm.l.f(str, "file_name");
        cm.l.f(str2, "base64Pdf");
        String str3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str3 + str);
        if (!file2.exists()) {
            byte[] decode = Base64.decode(str2, 0);
            cm.l.e(decode, "decode(...)");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(decode);
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + str));
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void w2(Context context) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.close_doc_upload);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById2).setOnClickListener(new c1(dialog));
        dialog.show();
    }

    public final void y2(Context context, String str) {
        cm.l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.validate_pop_up_for_document);
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
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new g1(dialog));
        dialog.show();
    }
}
