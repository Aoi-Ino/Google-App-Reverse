package com.nic.mparivahan.VahanServices.VahanMultiService;

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
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
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
import com.nic.mparivahan.VahanServices.SlotAppointmentBookingActivity;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanLog.DocUpdateLogs;
import com.nic.mparivahan.VahanServices.VahanLog.VahanLogUpdateDoc;
import com.nic.mparivahan.VahanServices.VahanModel.FinalRequestSubmitResponse;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.SlotUserDataModel;
import com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import com.nic.mparivahan.VahanServices.VahanView.VahanFaceLessConfirmation;
import com.nic.mparivahan.VahanServices.VahanView.VahanVehicleDetailsService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import le.c;
import ni.ud;
import og.o;
import pl.x;
import v9.d;

public final class VahanMultiDmsAPI extends androidx.appcompat.app.d implements o.a, c.a {

    /* renamed from: p0  reason: collision with root package name */
    public static final a f21099p0 = new a((cm.g) null);
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
    public MultiServiceBeforePaymentRequest Q;
    public ud R;
    private String S;
    public o T;
    private ArrayList U;
    private int V = -1;
    private Bitmap W;
    public le.c X;
    private List Y;
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f21100a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private boolean f21101b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f21102c0;

    /* renamed from: d0  reason: collision with root package name */
    public NrvDetails f21103d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f21104e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f21105f0;

    /* renamed from: g0  reason: collision with root package name */
    private String f21106g0 = " ";

    /* renamed from: h0  reason: collision with root package name */
    private double f21107h0;

    /* renamed from: i0  reason: collision with root package name */
    private String f21108i0 = " ";

    /* renamed from: j0  reason: collision with root package name */
    public ld.c f21109j0;

    /* renamed from: k0  reason: collision with root package name */
    public MultiSelectionViewModel f21110k0;

    /* renamed from: l0  reason: collision with root package name */
    public MultiService f21111l0;

    /* renamed from: m0  reason: collision with root package name */
    private ArrayList f21112m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    private d.c f21113n0;

    /* renamed from: o0  reason: collision with root package name */
    private d.c f21114o0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiDmsAPI f21115e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21115e = vahanMultiDmsAPI;
        }

        public final void b(FinalRequestSubmitResponse finalRequestSubmitResponse) {
            VahanMultiDmsAPI vahanMultiDmsAPI;
            ld.c Q1;
            if (finalRequestSubmitResponse != null) {
                try {
                    if (!finalRequestSubmitResponse.getApplication_status()) {
                        if (this.f21115e.U1().isShowing()) {
                            this.f21115e.U1().dismiss();
                        }
                        vahanMultiDmsAPI = this.f21115e;
                        Q1 = vahanMultiDmsAPI.Q1();
                    } else if (this.f21115e.i2()) {
                        Intent intent = new Intent(this.f21115e, VahanFaceLessConfirmation.class);
                        intent.putExtra("state_code", this.f21115e.d2());
                        intent.putExtra("rc_number", this.f21115e.Y1());
                        intent.putExtra(VContant.APP_NO, this.f21115e.L1());
                        intent.putExtra(VContant.PURPOSE_CODE, this.f21115e.X1());
                        this.f21115e.startActivity(intent);
                        this.f21115e.finish();
                        return;
                    } else {
                        this.f21115e.E1();
                        return;
                    }
                } catch (Exception unused) {
                    if (this.f21115e.U1().isShowing()) {
                        this.f21115e.U1().dismiss();
                        VahanMultiDmsAPI vahanMultiDmsAPI2 = this.f21115e;
                        vahanMultiDmsAPI2.C2(vahanMultiDmsAPI2, vahanMultiDmsAPI2.Q1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
                        return;
                    }
                    return;
                }
            } else {
                if (this.f21115e.U1().isShowing()) {
                    this.f21115e.U1().dismiss();
                }
                vahanMultiDmsAPI = this.f21115e;
                Q1 = vahanMultiDmsAPI.Q1();
            }
            vahanMultiDmsAPI.C2(vahanMultiDmsAPI, Q1.b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FinalRequestSubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiDmsAPI f21116e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21116e = vahanMultiDmsAPI;
        }

        public final void b(String str) {
            if (this.f21116e.U1().isShowing()) {
                this.f21116e.U1().dismiss();
                VahanMultiDmsAPI vahanMultiDmsAPI = this.f21116e;
                vahanMultiDmsAPI.C2(vahanMultiDmsAPI, vahanMultiDmsAPI.Q1().b("Final_Submission", "Please Upload all the Required Documents then You will be able to do Final Submission of Application."));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiDmsAPI f21117e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21117e = vahanMultiDmsAPI;
        }

        public final void b(SlotUserDataModel slotUserDataModel) {
            try {
                if (this.f21117e.U1().isShowing()) {
                    this.f21117e.U1().dismiss();
                }
                Intent intent = new Intent(this.f21117e, SlotAppointmentBookingActivity.class);
                intent.putExtra("appl_no", slotUserDataModel.getAppl_no());
                intent.putExtra("stateCd", slotUserDataModel.getState_cd());
                intent.putExtra("purCd", this.f21117e.X1());
                intent.putExtra("offCd", slotUserDataModel.getOff_cd());
                intent.putExtra("rcNo", slotUserDataModel.getRegn_no());
                intent.putExtra("vehicleClass", slotUserDataModel.getOwner_dobj().getVh_class());
                intent.putExtra("vehicleCat", slotUserDataModel.getOwner_dobj().getVch_catg());
                intent.putExtra("ownerName", slotUserDataModel.getOwner_dobj().getOwner_name());
                intent.putExtra("vehicleClassDes", slotUserDataModel.getOwner_dobj().getVh_class_desc());
                intent.putStringArrayListExtra("availableDates", slotUserDataModel.getAvailableDates());
                intent.putStringArrayListExtra("alreadyBookedDates", slotUserDataModel.getAlreadyBookedDates());
                intent.putStringArrayListExtra("holidayDeclareDates", slotUserDataModel.getHolidayDeclareDates());
                intent.putExtra("RC", this.f21117e.Z1());
                intent.putExtra("RcDetails", this.f21117e.a2());
                intent.putExtra(VContant.NEXGEN_isFACELESS, this.f21117e.i2());
                intent.putExtra(VContant.NEXGEN_addahar_name, this.f21117e.J1());
                intent.putExtra(VContant.NEXGEN_addahar_address, this.f21117e.I1());
                this.f21117e.startActivity(intent);
                this.f21117e.finish();
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
        final /* synthetic */ VahanMultiDmsAPI f21118e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21118e = vahanMultiDmsAPI;
        }

        public final void b(String str) {
            try {
                if (this.f21118e.U1().isShowing()) {
                    this.f21118e.U1().dismiss();
                }
                if (p.o(str, "Internet Issue", true)) {
                    VahanMultiDmsAPI vahanMultiDmsAPI = this.f21118e;
                    Toast.makeText(vahanMultiDmsAPI, vahanMultiDmsAPI.getString(R.string.no_internet), 0).show();
                    return;
                }
                if (str != null) {
                    if (!p.q(str)) {
                        VahanMultiDmsAPI vahanMultiDmsAPI2 = this.f21118e;
                        vahanMultiDmsAPI2.v2(vahanMultiDmsAPI2, str);
                        return;
                    }
                }
                VahanMultiDmsAPI vahanMultiDmsAPI3 = this.f21118e;
                vahanMultiDmsAPI3.v2(vahanMultiDmsAPI3, vahanMultiDmsAPI3.getString(R.string.service_unavable_please_try));
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
        final /* synthetic */ VahanMultiDmsAPI f21119e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21119e = vahanMultiDmsAPI;
        }

        /* JADX WARNING: Removed duplicated region for block: B:38:0x00f0 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0103 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x013d A[Catch:{ Exception -> 0x0040 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r8) {
            /*
                r7 = this;
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r0 = r7.f21119e
                android.app.ProgressDialog r0 = r0.U1()
                r0.dismiss()
                r0 = 2132019106(0x7f1407a2, float:1.9676538E38)
                r1 = 8
                java.lang.String r2 = r8.getStatusCode()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = "V001"
                r4 = 1
                boolean r2 = km.p.o(r2, r3, r4)     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0149
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f28897g     // Catch:{ Exception -> 0x0040 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f28899i     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r4 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                r5 = 0
                if (r4 == 0) goto L_0x0043
                java.util.List r4 = r4.getNonUploadedList()     // Catch:{ Exception -> 0x0040 }
                goto L_0x0044
            L_0x0040:
                r8 = move-exception
                goto L_0x0187
            L_0x0043:
                r4 = r5
            L_0x0044:
                java.lang.String r6 = "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded> }"
                cm.l.d(r4, r6)     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ Exception -> 0x0040 }
                r2.Q2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.S1()     // Catch:{ Exception -> 0x0040 }
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
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f28908r     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.TextView r2 = r2.f28898h     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.TextView r2 = r2.f28906p     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00e4
            L_0x009d:
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.S1()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00ae
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00af
            L_0x00ae:
                r2 = r5
            L_0x00af:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r4 = "StatusCODE--> "
                if (r2 <= 0) goto L_0x00df
                java.lang.String r2 = "2"
                android.util.Log.e(r4, r2)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                og.o r4 = new og.o     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r6 = r2.S1()     // Catch:{ Exception -> 0x0040 }
                r4.<init>(r2, r2, r6)     // Catch:{ Exception -> 0x0040 }
                r2.J2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f28908r     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r4 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                og.o r4 = r4.K1()     // Catch:{ Exception -> 0x0040 }
                r2.setAdapter(r4)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00e4
            L_0x00df:
                java.lang.String r2 = "Blank"
                android.util.Log.e(r4, r2)     // Catch:{ Exception -> 0x0040 }
            L_0x00e4:
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r2 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00f9
                java.util.List r2 = r2.getUploadedList()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00f9
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00fa
            L_0x00f9:
                r2 = r5
            L_0x00fa:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x013d
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r2 = r2.f28909s     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r8 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r8 == 0) goto L_0x011a
                java.util.List r5 = r8.getUploadedList()     // Catch:{ Exception -> 0x0040 }
            L_0x011a:
                r2.c3(r5)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                le.c r2 = new le.c     // Catch:{ Exception -> 0x0040 }
                java.util.List r3 = r8.f2()     // Catch:{ Exception -> 0x0040 }
                r2.<init>(r8, r8, r3)     // Catch:{ Exception -> 0x0040 }
                r8.b3(r2)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r8 = r8.f28910t     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                le.c r2 = r2.e2()     // Catch:{ Exception -> 0x0040 }
                r8.setAdapter(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x019e
            L_0x013d:
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r8 = r8.f28909s     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x019e
            L_0x0149:
                ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0040 }
                boolean r2 = r2.m(r3)     // Catch:{ Exception -> 0x0040 }
                if (r2 != 0) goto L_0x0172
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r2 = r2.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f28897g     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r2 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0040 }
                r2.i3(r2, r8)     // Catch:{ Exception -> 0x0040 }
                goto L_0x019e
            L_0x0172:
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                ni.ud r8 = r8.M1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r8 = r8.f28897g     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r2 = r8.getString(r0)     // Catch:{ Exception -> 0x0040 }
                r8.i3(r8, r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x019e
            L_0x0187:
                r8.printStackTrace()
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e
                ni.ud r8 = r8.M1()
                android.widget.FrameLayout r8 = r8.f28897g
                r8.setVisibility(r1)
                com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r8 = r7.f21119e
                java.lang.String r0 = r8.getString(r0)
                r8.i3(r8, r0)
            L_0x019e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.f.b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanDmsModleResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanMultiDmsAPI f21120e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanMultiDmsAPI vahanMultiDmsAPI) {
            super(1);
            this.f21120e = vahanMultiDmsAPI;
        }

        public final void b(String str) {
            this.f21120e.U1().dismiss();
            this.f21120e.M1().f28897g.setVisibility(8);
            VahanMultiDmsAPI vahanMultiDmsAPI = this.f21120e;
            vahanMultiDmsAPI.i3(vahanMultiDmsAPI, vahanMultiDmsAPI.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21121a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f21121a = lVar;
        }

        public final pl.c a() {
            return this.f21121a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21121a.invoke(obj);
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

    public VahanMultiDmsAPI() {
        d.c y02 = y0(new e.d(), new g(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21113n0 = y02;
        d.c y03 = y0(new e.b(), new h(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f21114o0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void B2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void D2(Dialog dialog, VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanMultiDmsAPI, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(vahanMultiDmsAPI, VahanMultiDmsAPI.class);
        intent.putExtra("state_code", vahanMultiDmsAPI.d2());
        intent.putExtra(VContant.APP_NO, vahanMultiDmsAPI.L1());
        intent.putExtra("rc_number", vahanMultiDmsAPI.Y1());
        intent.putExtra(VContant.PURPOSE_CODE, vahanMultiDmsAPI.X1());
        intent.putExtra("off_code", vahanMultiDmsAPI.T1());
        intent.putExtra(VContant.FINAL_SUBMIT, vahanMultiDmsAPI.V1());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanMultiDmsAPI.f21101b0);
        intent.putExtra("RC", vahanMultiDmsAPI.Z1());
        intent.putExtra("RcDetails", vahanMultiDmsAPI.a2());
        intent.putExtra("vahlogReptDate", vahanMultiDmsAPI.f21106g0);
        intent.putExtra("vahlogFeeAmt", vahanMultiDmsAPI.f21107h0);
        intent.putExtra("vahlogReptNo", vahanMultiDmsAPI.f21108i0);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanMultiDmsAPI.J1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanMultiDmsAPI.I1());
        vahanMultiDmsAPI.startActivity(intent);
        vahanMultiDmsAPI.finish();
    }

    /* access modifiers changed from: private */
    public final void E1() {
        try {
            c2().l(this, L1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final Bitmap F1(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* access modifiers changed from: private */
    public static final void F2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void G1() {
        if (Build.VERSION.SDK_INT < 31 && checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void G2(android.graphics.Bitmap r3) {
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
            java.lang.String r3 = r2.f21100a0
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.G2(android.graphics.Bitmap):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void P1(com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r5, android.net.Uri r6) {
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
            java.lang.String r4 = r5.f21100a0     // Catch:{ Exception -> 0x00fb }
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
            r5.h2(r6)     // Catch:{ Exception -> 0x00fb }
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.P1(com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI, android.net.Uri):void");
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanMultiDmsAPI vahanMultiDmsAPI, d.a aVar) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = null;
            Bundle extras = c10 != null ? c10.getExtras() : null;
            String str2 = vahanMultiDmsAPI.S;
            if (str2 == null) {
                cm.l.v("imgType");
            } else {
                str = str2;
            }
            if (cm.l.a(str, "photo") && extras != null) {
                vahanMultiDmsAPI.e3(extras);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e3(android.os.Bundle r3) {
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
            java.lang.String r3 = r2.f21100a0
            r0.setSubId(r3)
        L_0x0062:
            og.o r3 = r2.K1()
            int r0 = r2.V
            r3.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.e3(android.os.Bundle):void");
    }

    /* access modifiers changed from: private */
    public static final void g3(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void h2(Bitmap bitmap) {
        Log.e("calling", "2");
        G2(bitmap);
    }

    private final void h3(ArrayList arrayList) {
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
        DmsUploadReq dmsUploadReq = new DmsUploadReq(q.B0(L1()).toString(), arrayList3, q.B0(d2()).toString());
        M1().f28906p.setEnabled(false);
        O1().t(dmsUploadReq);
    }

    /* access modifiers changed from: private */
    public static final void j2(VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        VUtility.Companion.v(vahanMultiDmsAPI, vahanMultiDmsAPI.Q1().b("are_you_sure_you_want_to_leave", vahanMultiDmsAPI.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void j3(Dialog dialog, VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanMultiDmsAPI, "this$0");
        dialog.dismiss();
        vahanMultiDmsAPI.finish();
    }

    /* access modifiers changed from: private */
    public static final void k2(VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        Intent intent = new Intent(vahanMultiDmsAPI, VahanVehicleDetailsService.class);
        intent.putExtra("RC", vahanMultiDmsAPI.Z1());
        intent.putExtra("RcDetails", vahanMultiDmsAPI.a2());
        intent.putExtra(VContant.NEXGEN_isFACELESS, vahanMultiDmsAPI.f21101b0);
        intent.putExtra(VContant.NEXGEN_addahar_name, vahanMultiDmsAPI.J1());
        intent.putExtra(VContant.NEXGEN_addahar_address, vahanMultiDmsAPI.I1());
        vahanMultiDmsAPI.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void l2(VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        if (vahanMultiDmsAPI.D1(vahanMultiDmsAPI.U)) {
            vahanMultiDmsAPI.A2(vahanMultiDmsAPI, vahanMultiDmsAPI.Q1().b("doc_mandatory", "Please Upload all the mandatory documents"));
            return;
        }
        try {
            String.valueOf(System.currentTimeMillis());
            String str = vahanMultiDmsAPI.f21106g0;
            String str2 = vahanMultiDmsAPI.f21108i0;
            double d10 = vahanMultiDmsAPI.f21107h0;
            String L1 = vahanMultiDmsAPI.L1();
            String Z1 = vahanMultiDmsAPI.Z1();
            d.a aVar = v9.d.f17494a;
            VahanLogUpdateDoc.f20968k.a(vahanMultiDmsAPI, new DocUpdateLogs(str, str, str2, d10, L1, Z1, aVar.m(), aVar.m()));
        } catch (Exception e10) {
            e10.toString();
        }
        vahanMultiDmsAPI.U1().show();
        vahanMultiDmsAPI.g2().x(vahanMultiDmsAPI.V1());
    }

    /* access modifiers changed from: private */
    public static final void m2(VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.M1().f28910t.setVisibility(vahanMultiDmsAPI.M1().f28910t.getVisibility() == 0 ? 8 : 0);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r7 = r14.O1();
        r8 = r14.L1();
        r9 = r14.X1();
        r10 = r14.d2();
        r15 = r14.a2().getVehTypeAsInt();
        cm.l.c(r15);
        r7.p(r8, r9, r10, r15.intValue(), 10, r14.a2());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n2(com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI r14, com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes r15) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r14, r0)
            ni.ud r0 = r14.M1()
            android.widget.TextView r0 = r0.f28906p
            r1 = 1
            r0.setEnabled(r1)
            java.lang.String r15 = r15.getStatusCode()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "V001"
            boolean r15 = km.p.o(r15, r0, r1)     // Catch:{ Exception -> 0x0090 }
            if (r15 == 0) goto L_0x00ca
            java.lang.String r15 = r14.X1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "3"
            boolean r15 = r15.equals(r0)     // Catch:{ Exception -> 0x0090 }
            if (r15 == 0) goto L_0x0092
            je.c r0 = r14.O1()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r1 = r14.L1()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r2 = r14.X1()     // Catch:{ Exception -> 0x0067 }
            java.lang.String r3 = r14.d2()     // Catch:{ Exception -> 0x0067 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r15 = r14.a2()     // Catch:{ Exception -> 0x0067 }
            java.lang.Integer r15 = r15.getVehTypeAsInt()     // Catch:{ Exception -> 0x0067 }
            cm.l.c(r15)     // Catch:{ Exception -> 0x0067 }
            int r4 = r15.intValue()     // Catch:{ Exception -> 0x0067 }
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r15 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x0067 }
            com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest r5 = r14.V1()     // Catch:{ Exception -> 0x0067 }
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto r5 = r5.getDurcdto()     // Catch:{ Exception -> 0x0067 }
            if (r5 == 0) goto L_0x0057
            java.lang.String r5 = r5.getReason()     // Catch:{ Exception -> 0x0067 }
            goto L_0x0058
        L_0x0057:
            r5 = 0
        L_0x0058:
            cm.l.c(r5)     // Catch:{ Exception -> 0x0067 }
            int r5 = r15.z(r5)     // Catch:{ Exception -> 0x0067 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r14.a2()     // Catch:{ Exception -> 0x0067 }
            r0.p(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0067 }
            goto L_0x00ba
        L_0x0067:
            je.c r7 = r14.O1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r8 = r14.L1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r9 = r14.X1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r10 = r14.d2()     // Catch:{ Exception -> 0x0090 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r15 = r14.a2()     // Catch:{ Exception -> 0x0090 }
            java.lang.Integer r15 = r15.getVehTypeAsInt()     // Catch:{ Exception -> 0x0090 }
            cm.l.c(r15)     // Catch:{ Exception -> 0x0090 }
            int r11 = r15.intValue()     // Catch:{ Exception -> 0x0090 }
            r12 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r13 = r14.a2()     // Catch:{ Exception -> 0x0090 }
            r7.p(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00ba
        L_0x0090:
            r15 = move-exception
            goto L_0x00dc
        L_0x0092:
            je.c r0 = r14.O1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r1 = r14.L1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = r14.X1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = r14.d2()     // Catch:{ Exception -> 0x0090 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r15 = r14.a2()     // Catch:{ Exception -> 0x0090 }
            java.lang.Integer r15 = r15.getVehTypeAsInt()     // Catch:{ Exception -> 0x0090 }
            cm.l.c(r15)     // Catch:{ Exception -> 0x0090 }
            int r4 = r15.intValue()     // Catch:{ Exception -> 0x0090 }
            r5 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r6 = r14.a2()     // Catch:{ Exception -> 0x0090 }
            r0.p(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0090 }
        L_0x00ba:
            ld.c r15 = r14.Q1()     // Catch:{ Exception -> 0x0090 }
            java.lang.String r0 = "doc_uploaded_successfully"
            java.lang.String r1 = "Documents has been Successfully Uploaded!"
            java.lang.String r15 = r15.b(r0, r1)     // Catch:{ Exception -> 0x0090 }
            r14.E2(r14, r15)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00f4
        L_0x00ca:
            java.lang.String r15 = "Error1"
            java.lang.String r0 = "erro"
            android.util.Log.e(r15, r0)     // Catch:{ Exception -> 0x0090 }
            android.app.ProgressDialog r15 = r14.U1()     // Catch:{ Exception -> 0x0090 }
            r15.dismiss()     // Catch:{ Exception -> 0x0090 }
            r14.y2(r14)     // Catch:{ Exception -> 0x0090 }
            goto L_0x00f4
        L_0x00dc:
            r15.printStackTrace()
            pl.x r15 = pl.x.f30437a
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "Error"
            android.util.Log.e(r0, r15)
            android.app.ProgressDialog r15 = r14.U1()
            r15.dismiss()
            r14.y2(r14)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.n2(com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI, com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes):void");
    }

    /* access modifiers changed from: private */
    public static final void o2(VahanMultiDmsAPI vahanMultiDmsAPI, String str) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.M1().f28906p.setEnabled(true);
        vahanMultiDmsAPI.U1().dismiss();
        vahanMultiDmsAPI.y2(vahanMultiDmsAPI);
    }

    /* access modifiers changed from: private */
    public static final void p2(VahanMultiDmsAPI vahanMultiDmsAPI, VahanDmsModleResponse vahanDmsModleResponse) {
        List<Uploaded> uploadedList;
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.U1().dismiss();
        if (p.o(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
            ArrayList arrayList = vahanMultiDmsAPI.U;
            if (arrayList != null) {
                arrayList.clear();
            }
            UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
            ArrayList arrayList2 = (ArrayList) (uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null);
            vahanMultiDmsAPI.U = arrayList2;
            Integer valueOf = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
            cm.l.c(valueOf);
            if (valueOf.intValue() > 0) {
                vahanMultiDmsAPI.M1().f28908r.setAdapter((RecyclerView.h) null);
                vahanMultiDmsAPI.J2(new o(vahanMultiDmsAPI, vahanMultiDmsAPI, vahanMultiDmsAPI.U));
                vahanMultiDmsAPI.M1().f28908r.setAdapter(vahanMultiDmsAPI.K1());
            } else {
                ArrayList arrayList3 = vahanMultiDmsAPI.U;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                vahanMultiDmsAPI.M1().f28908r.setAdapter((RecyclerView.h) null);
            }
            vahanMultiDmsAPI.K1().j();
            UploadDataDto uploadDataDto2 = vahanDmsModleResponse.getUploadDataDto();
            Integer valueOf2 = (uploadDataDto2 == null || (uploadedList = uploadDataDto2.getUploadedList()) == null) ? null : Integer.valueOf(uploadedList.size());
            cm.l.c(valueOf2);
            if (valueOf2.intValue() > 0) {
                try {
                    vahanMultiDmsAPI.M1().f28909s.setVisibility(0);
                    UploadDataDto uploadDataDto3 = vahanDmsModleResponse.getUploadDataDto();
                    vahanMultiDmsAPI.Y = uploadDataDto3 != null ? uploadDataDto3.getUploadedList() : null;
                    vahanMultiDmsAPI.M1().f28910t.setAdapter((RecyclerView.h) null);
                    vahanMultiDmsAPI.b3(new le.c(vahanMultiDmsAPI, vahanMultiDmsAPI, vahanMultiDmsAPI.Y));
                    vahanMultiDmsAPI.M1().f28910t.setAdapter(vahanMultiDmsAPI.e2());
                    vahanMultiDmsAPI.e2().j();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            if (vahanMultiDmsAPI.D1(vahanMultiDmsAPI.U)) {
                vahanMultiDmsAPI.M1().f28898h.setVisibility(8);
                vahanMultiDmsAPI.M1().f28906p.setVisibility(0);
                return;
            }
            vahanMultiDmsAPI.M1().f28898h.setVisibility(0);
            vahanMultiDmsAPI.M1().f28906p.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public static final void q2(VahanMultiDmsAPI vahanMultiDmsAPI, String str) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.U1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void r2(VahanMultiDmsAPI vahanMultiDmsAPI, DMSViewDocModle dMSViewDocModle) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.U1().dismiss();
        if (!p.o(dMSViewDocModle.getStatusCode(), "V001", true)) {
            return;
        }
        if (p.o(dMSViewDocModle.getFileExt(), ".pdf", true)) {
            try {
                vahanMultiDmsAPI.u2(dMSViewDocModle.getFileName(), dMSViewDocModle.getFileContent());
            } catch (Exception unused) {
            }
        } else {
            vahanMultiDmsAPI.f3(vahanMultiDmsAPI, dMSViewDocModle.getFileContent());
        }
    }

    /* access modifiers changed from: private */
    public static final void s2(VahanMultiDmsAPI vahanMultiDmsAPI, String str) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        vahanMultiDmsAPI.U1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void t2(VahanMultiDmsAPI vahanMultiDmsAPI, View view) {
        cm.l.f(vahanMultiDmsAPI, "this$0");
        if (vahanMultiDmsAPI.C1(vahanMultiDmsAPI.U)) {
            vahanMultiDmsAPI.U1().show();
            try {
                vahanMultiDmsAPI.h3(vahanMultiDmsAPI.U);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            vahanMultiDmsAPI.A2(vahanMultiDmsAPI, vahanMultiDmsAPI.Q1().b("doc_mandatory", "Please Upload all the mandatory documents"));
        }
    }

    /* access modifiers changed from: private */
    public final void v2(Context context, String str) {
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
        textView.setOnClickListener(new n(dialog));
        textView2.setOnClickListener(new o(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void w2(Dialog dialog, View view) {
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
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ld.c cVar = new ld.c(context);
        ((TextView) findViewById3).setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(cVar.b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new k(dialog));
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
        ((TextView) findViewById2).setOnClickListener(new l(dialog, this));
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

    public final void E2(Context context, String str) {
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
        textView.setOnClickListener(new q(dialog));
        dialog.show();
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

    public final void H2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21105f0 = str;
    }

    public final String I1() {
        String str = this.f21105f0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_address");
        return null;
    }

    public final void I2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21104e0 = str;
    }

    public final String J1() {
        String str = this.f21104e0;
        if (str != null) {
            return str;
        }
        cm.l.v("aadhar_name");
        return null;
    }

    public final void J2(o oVar) {
        cm.l.f(oVar, "<set-?>");
        this.T = oVar;
    }

    public final o K1() {
        o oVar = this.T;
        if (oVar != null) {
            return oVar;
        }
        cm.l.v("adapter");
        return null;
    }

    public final void K2(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public final String L1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("appl_no");
        return null;
    }

    public final void L2(ud udVar) {
        cm.l.f(udVar, "<set-?>");
        this.R = udVar;
    }

    public final ud M1() {
        ud udVar = this.R;
        if (udVar != null) {
            return udVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final void M2(DMSService dMSService) {
        cm.l.f(dMSService, "<set-?>");
        this.P = dMSService;
    }

    public final DMSService N1() {
        DMSService dMSService = this.P;
        if (dMSService != null) {
            return dMSService;
        }
        cm.l.v("dmsService");
        return null;
    }

    public final void N2(je.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final je.c O1() {
        je.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("dmsViewModle");
        return null;
    }

    public final void O2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21109j0 = cVar;
    }

    public final void P2(MultiService multiService) {
        cm.l.f(multiService, "<set-?>");
        this.f21111l0 = multiService;
    }

    public final ld.c Q1() {
        ld.c cVar = this.f21109j0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("languageKeySession");
        return null;
    }

    public final void Q2(ArrayList arrayList) {
        this.U = arrayList;
    }

    public final MultiService R1() {
        MultiService multiService = this.f21111l0;
        if (multiService != null) {
            return multiService;
        }
        cm.l.v("multiService");
        return null;
    }

    public final void R2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final ArrayList S1() {
        return this.U;
    }

    public final void S2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final String T1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("offCd");
        return null;
    }

    public final void T2(MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest) {
        cm.l.f(multiServiceBeforePaymentRequest, "<set-?>");
        this.Q = multiServiceBeforePaymentRequest;
    }

    public final ProgressDialog U1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void U2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final MultiServiceBeforePaymentRequest V1() {
        MultiServiceBeforePaymentRequest multiServiceBeforePaymentRequest = this.Q;
        if (multiServiceBeforePaymentRequest != null) {
            return multiServiceBeforePaymentRequest;
        }
        cm.l.v("paymentRequest");
        return null;
    }

    public final void V2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void W2(String str) {
        cm.l.f(str, "<set-?>");
        this.f21102c0 = str;
    }

    public final String X1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final void X2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21103d0 = nrvDetails;
    }

    public final String Y1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_no");
        return null;
    }

    public final void Y2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final String Z1() {
        String str = this.f21102c0;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_number");
        return null;
    }

    public final void Z2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.I = hVar;
    }

    public void a(int i10) {
    }

    public final NrvDetails a2() {
        NrvDetails nrvDetails = this.f21103d0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final void a3(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final VahanProService b2() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final void b3(le.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final bi.h c2() {
        bi.h hVar = this.I;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("slotViewModel");
        return null;
    }

    public final void c3(List list) {
        this.Y = list;
    }

    public void d(int i10, String str, String str2) {
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.S = "signature";
            this.V = i10;
            this.Z = str;
            this.f21100a0 = str2;
            new Intent("android.intent.action.GET_CONTENT").setType("*/*");
            this.f21114o0.a("*/*");
        }
    }

    public final String d2() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final void d3(MultiSelectionViewModel multiSelectionViewModel) {
        cm.l.f(multiSelectionViewModel, "<set-?>");
        this.f21110k0 = multiSelectionViewModel;
    }

    public void e(int i10, String str, String str2, Bitmap bitmap) {
        cm.l.f(str, "sub_id");
        cm.l.f(str2, "cat_id");
        U1().show();
        this.V = i10;
        cm.l.c(bitmap);
        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        O1().t(new DmsUploadReq(q.B0(L1()).toString(), p.d(new DmsFileDetail(f10, str2, str, "file_" + System.currentTimeMillis() + ".jpg", false)), q.B0(d2()).toString()));
    }

    public final le.c e2() {
        le.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("uploaded_adapter");
        return null;
    }

    public final List f2() {
        return this.Y;
    }

    public final void f3(Context context, String str) {
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
        ((TextView) findViewById).setOnClickListener(new j(dialog));
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.g(int):void");
    }

    public final MultiSelectionViewModel g2() {
        MultiSelectionViewModel multiSelectionViewModel = this.f21110k0;
        if (multiSelectionViewModel != null) {
            return multiSelectionViewModel;
        }
        cm.l.v("viewModelMulti");
        return null;
    }

    public void h(int i10, String str, String str2) {
        Intent intent;
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
            this.S = "photo";
            this.V = i10;
            this.Z = str;
            this.f21100a0 = str2;
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            this.S = "photo";
            this.V = i10;
            this.Z = str;
            this.f21100a0 = str2;
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
        } else {
            return;
        }
        setIntent(intent);
        this.f21113n0.a(getIntent());
    }

    public final boolean i2() {
        return this.f21101b0;
    }

    public final void i3(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new i(dialog, this));
        dialog.show();
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, Q1().b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2 = O1();
        r3 = L1();
        r4 = X1();
        r5 = d2();
        r0 = a2().getVehTypeAsInt();
        cm.l.c(r0);
        r2.g(r3, r4, r5, r0.intValue(), 10, a2());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x03e4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r1 = r21
            super.onCreate(r22)
            r0 = 2131559073(0x7f0d02a1, float:1.874348E38)
            r1.setContentView((int) r0)
            android.view.LayoutInflater r0 = r21.getLayoutInflater()
            ni.ud r0 = ni.ud.c(r0)
            java.lang.String r2 = "inflate(...)"
            cm.l.e(r0, r2)
            r1.L2(r0)
            ni.ud r0 = r21.M1()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r0.b()
            r1.setContentView((android.view.View) r0)
            v9.e$a r0 = v9.e.f17509a
            ni.ud r2 = r21.M1()
            r0.d2(r1, r2)
            ld.c r0 = new ld.c
            r0.<init>(r1)
            r1.O2(r0)
            com.nic.mparivahan.VahanServices.VahanService.VahanProService$a r0 = com.nic.mparivahan.VahanServices.VahanService.VahanProService.f21196b
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r0 = r0.b(r1)
            r1.Y2(r0)
            com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService$a r0 = com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService.f20571a
            com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService r0 = r0.b(r1)
            r1.M2(r0)
            r21.G1()
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r1)
            r1.S2(r0)
            android.app.ProgressDialog r0 = r21.U1()
            java.lang.String r2 = "Please wait..."
            r0.setMessage(r2)
            android.app.ProgressDialog r0 = r21.U1()
            r2 = 0
            r0.setCancelable(r2)
            android.app.ProgressDialog r0 = r21.U1()
            r0.setCanceledOnTouchOutside(r2)
            ni.ud r0 = r21.M1()
            ni.qd r0 = r0.f28905o
            androidx.appcompat.widget.AppCompatImageView r0 = r0.f28305f
            com.nic.mparivahan.VahanServices.VahanMultiService.e r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.e
            r3.<init>(r1)
            r0.setOnClickListener(r3)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            bi.g r3 = new bi.g
            wg.d r4 = new wg.d
            com.nic.mparivahan.VahanServices.VahanService.VahanProService r5 = r21.b2()
            r4.<init>(r5)
            r3.<init>(r4)
            r0.<init>((androidx.lifecycle.x0) r1, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<bi.h> r3 = bi.h.class
            androidx.lifecycle.t0 r0 = r0.a(r3)
            bi.h r0 = (bi.h) r0
            r1.Z2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            je.b r3 = new je.b
            je.a r4 = new je.a
            com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService r5 = r21.N1()
            r4.<init>(r5)
            r3.<init>(r4)
            r0.<init>((androidx.lifecycle.x0) r1, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<je.c> r3 = je.c.class
            androidx.lifecycle.t0 r0 = r0.a(r3)
            je.c r0 = (je.c) r0
            r1.N2(r0)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService$a r0 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiService.f21070a
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r0 = r0.b(r1)
            r1.P2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            com.nic.mparivahan.VahanServices.VahanMultiService.d r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.d
            com.nic.mparivahan.VahanServices.VahanMultiService.b r4 = new com.nic.mparivahan.VahanServices.VahanMultiService.b
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiService r5 = r21.R1()
            r4.<init>(r5)
            r3.<init>(r4)
            r0.<init>((androidx.lifecycle.x0) r1, (androidx.lifecycle.u0.b) r3)
            java.lang.Class<com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel> r3 = com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel.class
            androidx.lifecycle.t0 r0 = r0.a(r3)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = (com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel) r0
            r1.d3(r0)
            ni.ud r0 = r21.M1()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f28908r
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r1)
            r0.setLayoutManager(r3)
            ni.ud r0 = r21.M1()
            androidx.recyclerview.widget.RecyclerView r0 = r0.f28910t
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r1)
            r0.setLayoutManager(r3)
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "state_code"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            r1.a3(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "App_no"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            r1.K2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "rc_number"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            r1.V2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "purpose_code"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            r1.U2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "off_code"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            r1.R2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "Final_Submit"
            java.io.Serializable r0 = r0.getSerializableExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest"
            cm.l.d(r0, r3)     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest r0 = (com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest) r0     // Catch:{ Exception -> 0x027c }
            r1.T2(r0)     // Catch:{ Exception -> 0x027c }
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28911u     // Catch:{ Exception -> 0x027c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027c }
            r3.<init>()     // Catch:{ Exception -> 0x027c }
            ld.c r4 = r21.Q1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = "vehicle_no"
            java.lang.String r6 = "Vehicle No. :"
            java.lang.String r4 = r4.b(r5, r6)     // Catch:{ Exception -> 0x027c }
            r3.append(r4)     // Catch:{ Exception -> 0x027c }
            r4 = 32
            r3.append(r4)     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = r21.Y1()     // Catch:{ Exception -> 0x027c }
            r3.append(r5)     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x027c }
            r0.setText(r3)     // Catch:{ Exception -> 0x027c }
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28892b     // Catch:{ Exception -> 0x027c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x027c }
            r3.<init>()     // Catch:{ Exception -> 0x027c }
            ld.c r5 = r21.Q1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r6 = "vahan_application_no"
            java.lang.String r7 = "Application No."
            java.lang.String r5 = r5.b(r6, r7)     // Catch:{ Exception -> 0x027c }
            r3.append(r5)     // Catch:{ Exception -> 0x027c }
            r3.append(r4)     // Catch:{ Exception -> 0x027c }
            java.lang.String r4 = r21.L1()     // Catch:{ Exception -> 0x027c }
            r3.append(r4)     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x027c }
            r0.setText(r3)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "MULTIARRAY"
            java.io.Serializable r0 = r0.getSerializableExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x027c }
            r1.f21112m0 = r0     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "Face_Less_Staus"
            boolean r0 = r0.getBooleanExtra(r3, r2)     // Catch:{ Exception -> 0x027c }
            r1.f21101b0 = r0     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "aadhaarName"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x027c }
            r1.I2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "aadhaarAddress"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x027c }
            r1.H2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "RC"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x027c }
            r1.W2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "RcDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "null cannot be cast to non-null type com.nic.mparivahan.VahanServices.VahanModel.NrvDetails"
            cm.l.d(r0, r3)     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = (com.nic.mparivahan.VahanServices.VahanModel.NrvDetails) r0     // Catch:{ Exception -> 0x027c }
            r1.X2(r0)     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "vahlogReptDate"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x027c }
            r1.f21106g0 = r0     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "vahlogFeeAmt"
            r4 = 0
            double r3 = r0.getDoubleExtra(r3, r4)     // Catch:{ Exception -> 0x027c }
            r1.f21107h0 = r3     // Catch:{ Exception -> 0x027c }
            android.content.Intent r0 = r21.getIntent()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = "vahlogReptNo"
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x027c }
            r1.f21108i0 = r0     // Catch:{ Exception -> 0x027c }
            java.util.ArrayList r0 = r1.f21112m0     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x027c }
            r3 = 1
            if (r0 > r3) goto L_0x027f
            ld.c r0 = new ld.c     // Catch:{ Exception -> 0x027c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x027c }
            r1.O2(r0)     // Catch:{ Exception -> 0x027c }
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r0 = r0.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28308i     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r3 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x027c }
            java.util.ArrayList r4 = r1.f21112m0     // Catch:{ Exception -> 0x027c }
            cm.l.c(r4)     // Catch:{ Exception -> 0x027c }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = "get(...)"
            cm.l.e(r4, r5)     // Catch:{ Exception -> 0x027c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r3.I(r1, r4)     // Catch:{ Exception -> 0x027c }
            r0.setText(r3)     // Catch:{ Exception -> 0x027c }
            goto L_0x02ac
        L_0x027c:
            r0 = move-exception
            goto L_0x0436
        L_0x027f:
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ Exception -> 0x027c }
            ld.c r3 = r21.Q1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r4 = "rcServices"
            r5 = 2132018902(0x7f1406d6, float:1.9676124E38)
            java.lang.String r5 = r1.getString(r5)     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x027c }
            r0.<init>(r3)     // Catch:{ Exception -> 0x027c }
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan     // Catch:{ Exception -> 0x027c }
            r3.<init>()     // Catch:{ Exception -> 0x027c }
            int r4 = r0.length()     // Catch:{ Exception -> 0x027c }
            r0.setSpan(r3, r2, r4, r2)     // Catch:{ Exception -> 0x027c }
            ni.ud r3 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r3 = r3.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r3 = r3.f28308i     // Catch:{ Exception -> 0x027c }
            r3.setText(r0)     // Catch:{ Exception -> 0x027c }
        L_0x02ac:
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r0 = r0.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28304e     // Catch:{ Exception -> 0x027c }
            r0.setVisibility(r2)     // Catch:{ Exception -> 0x027c }
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r0 = r0.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28304e     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r21.Z1()     // Catch:{ Exception -> 0x027c }
            r0.setText(r3)     // Catch:{ Exception -> 0x027c }
            android.text.SpannableString r0 = new android.text.SpannableString     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r21.Z1()     // Catch:{ Exception -> 0x027c }
            r0.<init>(r3)     // Catch:{ Exception -> 0x027c }
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan     // Catch:{ Exception -> 0x027c }
            r3.<init>()     // Catch:{ Exception -> 0x027c }
            int r4 = r0.length()     // Catch:{ Exception -> 0x027c }
            r0.setSpan(r3, r2, r4, r2)     // Catch:{ Exception -> 0x027c }
            ni.ud r3 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r3 = r3.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r3 = r3.f28304e     // Catch:{ Exception -> 0x027c }
            r3.setText(r0)     // Catch:{ Exception -> 0x027c }
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.qd r0 = r0.f28905o     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r0 = r0.f28304e     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanMultiService.r r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.r     // Catch:{ Exception -> 0x027c }
            r3.<init>(r1)     // Catch:{ Exception -> 0x027c }
            r0.setOnClickListener(r3)     // Catch:{ Exception -> 0x027c }
            boolean r0 = r1.f21101b0     // Catch:{ Exception -> 0x027c }
            if (r0 == 0) goto L_0x0307
            ni.ud r0 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.od r0 = r0.f28893c     // Catch:{ Exception -> 0x027c }
            android.widget.LinearLayout r0 = r0.f27883e     // Catch:{ Exception -> 0x027c }
            r3 = 1077936128(0x40400000, float:3.0)
            r0.setWeightSum(r3)     // Catch:{ Exception -> 0x027c }
        L_0x0307:
            com.nic.mparivahan.VahanServices.VahanConst.VContant$Companion r0 = com.nic.mparivahan.VahanServices.VahanConst.VContant.Companion     // Catch:{ Exception -> 0x027c }
            boolean r3 = r1.f21101b0     // Catch:{ Exception -> 0x027c }
            ni.ud r4 = r21.M1()     // Catch:{ Exception -> 0x027c }
            ni.od r4 = r4.f28893c     // Catch:{ Exception -> 0x027c }
            android.widget.LinearLayout r4 = r4.f27880b     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = "appMent"
            cm.l.e(r4, r5)     // Catch:{ Exception -> 0x027c }
            r0.J(r3, r4)     // Catch:{ Exception -> 0x027c }
            ni.ud r3 = r21.M1()     // Catch:{ Exception -> 0x027c }
            android.widget.TextView r3 = r3.f28898h     // Catch:{ Exception -> 0x027c }
            r4 = 8
            r3.setVisibility(r4)     // Catch:{ Exception -> 0x027c }
            ni.ud r3 = r21.M1()     // Catch:{ Exception -> 0x027c }
            android.widget.LinearLayout r3 = r3.f28900j     // Catch:{ Exception -> 0x027c }
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setWeightSum(r4)     // Catch:{ Exception -> 0x027c }
            android.app.ProgressDialog r3 = r21.U1()     // Catch:{ Exception -> 0x027c }
            r3.show()     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest r3 = r21.V1()     // Catch:{ Exception -> 0x027c }
            java.util.ArrayList r4 = r3.getPurCodList()     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 62
            r12 = 0
            java.lang.String r3 = ql.y.d0(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x027c }
            r1.U2(r3)     // Catch:{ Exception -> 0x027c }
            java.lang.String r4 = "3"
            r5 = 2
            r6 = 0
            boolean r2 = km.q.F(r3, r4, r2, r5, r6)     // Catch:{ Exception -> 0x027c }
            if (r2 == 0) goto L_0x040d
            ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest r3 = r21.V1()     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto r3 = r3.getDurcdto()     // Catch:{ Exception -> 0x03e4 }
            if (r3 == 0) goto L_0x036c
            java.lang.String r3 = r3.getReason()     // Catch:{ Exception -> 0x03e4 }
            goto L_0x036d
        L_0x036c:
            r3 = r6
        L_0x036d:
            cm.l.c(r3)     // Catch:{ Exception -> 0x03e4 }
            int r3 = r0.z(r3)     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x03e4 }
            boolean r2 = r2.m(r3)     // Catch:{ Exception -> 0x03e4 }
            if (r2 != 0) goto L_0x03bb
            je.c r7 = r21.O1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r8 = r21.L1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r9 = r21.X1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r10 = r21.d2()     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r2 = r21.a2()     // Catch:{ Exception -> 0x03e4 }
            java.lang.Integer r2 = r2.getVehTypeAsInt()     // Catch:{ Exception -> 0x03e4 }
            cm.l.c(r2)     // Catch:{ Exception -> 0x03e4 }
            int r11 = r2.intValue()     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanMultiService.BeforePaymentModel.MultiServiceBeforePaymentRequest r2 = r21.V1()     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanMultiService.Model.DraftModel.Durcdto r2 = r2.getDurcdto()     // Catch:{ Exception -> 0x03e4 }
            if (r2 == 0) goto L_0x03ab
            java.lang.String r6 = r2.getReason()     // Catch:{ Exception -> 0x03e4 }
        L_0x03ab:
            cm.l.c(r6)     // Catch:{ Exception -> 0x03e4 }
            int r12 = r0.z(r6)     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r13 = r21.a2()     // Catch:{ Exception -> 0x03e4 }
            r7.g(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x03e4 }
            goto L_0x0439
        L_0x03bb:
            je.c r14 = r21.O1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r15 = r21.L1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r16 = r21.X1()     // Catch:{ Exception -> 0x03e4 }
            java.lang.String r17 = r21.d2()     // Catch:{ Exception -> 0x03e4 }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r21.a2()     // Catch:{ Exception -> 0x03e4 }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x03e4 }
            cm.l.c(r0)     // Catch:{ Exception -> 0x03e4 }
            int r18 = r0.intValue()     // Catch:{ Exception -> 0x03e4 }
            r19 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r20 = r21.a2()     // Catch:{ Exception -> 0x03e4 }
            r14.g(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x03e4 }
            goto L_0x0439
        L_0x03e4:
            je.c r2 = r21.O1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r3 = r21.L1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r4 = r21.X1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r5 = r21.d2()     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r21.a2()     // Catch:{ Exception -> 0x027c }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            int r6 = r0.intValue()     // Catch:{ Exception -> 0x027c }
            r7 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r8 = r21.a2()     // Catch:{ Exception -> 0x027c }
            r2.g(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x027c }
            goto L_0x0439
        L_0x040d:
            je.c r9 = r21.O1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r10 = r21.L1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r11 = r21.X1()     // Catch:{ Exception -> 0x027c }
            java.lang.String r12 = r21.d2()     // Catch:{ Exception -> 0x027c }
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r0 = r21.a2()     // Catch:{ Exception -> 0x027c }
            java.lang.Integer r0 = r0.getVehTypeAsInt()     // Catch:{ Exception -> 0x027c }
            cm.l.c(r0)     // Catch:{ Exception -> 0x027c }
            int r13 = r0.intValue()     // Catch:{ Exception -> 0x027c }
            r14 = 10
            com.nic.mparivahan.VahanServices.VahanModel.NrvDetails r15 = r21.a2()     // Catch:{ Exception -> 0x027c }
            r9.g(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x027c }
            goto L_0x0439
        L_0x0436:
            r0.printStackTrace()
        L_0x0439:
            ni.ud r0 = r21.M1()
            androidx.cardview.widget.CardView r0 = r0.f28909s
            com.nic.mparivahan.VahanServices.VahanMultiService.s r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.s
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.h()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$f r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$f
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.i()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$g r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$g
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.j()
            com.nic.mparivahan.VahanServices.VahanMultiService.t r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.t
            r2.<init>(r1)
            r0.g(r1, r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.k()
            com.nic.mparivahan.VahanServices.VahanMultiService.u r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.u
            r2.<init>(r1)
            r0.g(r1, r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.l()
            com.nic.mparivahan.VahanServices.VahanMultiService.v r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.v
            r2.<init>(r1)
            r0.g(r1, r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.m()
            com.nic.mparivahan.VahanServices.VahanMultiService.w r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.w
            r2.<init>(r1)
            r0.g(r1, r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.q()
            com.nic.mparivahan.VahanServices.VahanMultiService.x r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.x
            r2.<init>(r1)
            r0.g(r1, r2)
            je.c r0 = r21.O1()
            androidx.lifecycle.a0 r0 = r0.r()
            com.nic.mparivahan.VahanServices.VahanMultiService.y r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.y
            r2.<init>(r1)
            r0.g(r1, r2)
            ni.ud r0 = r21.M1()
            android.widget.TextView r0 = r0.f28906p
            com.nic.mparivahan.VahanServices.VahanMultiService.f r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.f
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            ni.ud r0 = r21.M1()
            android.widget.TextView r0 = r0.f28898h
            com.nic.mparivahan.VahanServices.VahanMultiService.p r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.p
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r21.g2()
            androidx.lifecycle.a0 r0 = r0.j()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$b r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$b
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            com.nic.mparivahan.VahanServices.VahanMultiService.MultiSelectionViewModel r0 = r21.g2()
            androidx.lifecycle.a0 r0 = r0.k()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$c r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$c
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            bi.h r0 = r21.c2()
            androidx.lifecycle.a0 r0 = r0.T0()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$d r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$d
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            bi.h r0 = r21.c2()
            androidx.lifecycle.a0 r0 = r0.S0()
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$e r2 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$e
            r2.<init>(r1)
            com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h r3 = new com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI$h
            r3.<init>(r2)
            r0.g(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanMultiService.VahanMultiDmsAPI.onCreate(android.os.Bundle):void");
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
            U1().show();
            List l02 = q.l0(str, new String[]{"/"}, false, 0, 6, (Object) null);
            O1().u(q.B0((String) l02.get(0)).toString(), q.B0((String) l02.get(2)).toString(), q.B0((String) l02.get(1)).toString());
        } catch (Exception e10) {
            U1().dismiss();
            e10.printStackTrace();
        }
    }

    public final void u2(String str, String str2) {
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

    public final void y2(Context context) {
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
        ((TextView) findViewById2).setOnClickListener(new m(dialog));
        dialog.show();
    }
}
