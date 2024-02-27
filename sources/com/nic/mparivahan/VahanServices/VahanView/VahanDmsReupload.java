package com.nic.mparivahan.VahanServices.VahanView;

import ai.a2;
import ai.b2;
import ai.c2;
import ai.d2;
import ai.e2;
import ai.f2;
import ai.g2;
import ai.h2;
import ai.i2;
import ai.s1;
import ai.t1;
import ai.u1;
import ai.v1;
import ai.w1;
import ai.x1;
import ai.y1;
import ai.z1;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.DMS.DInterface.DMSService;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsFileDetail;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUpdateRequest;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadReq;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.DmsUploadRes;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UpdateDocResponse;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.Uploaded;
import com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse;
import com.nic.mparivahan.VahanServices.DRcModle.DMSViewDocModle;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanModel.NrvDetails;
import com.nic.mparivahan.VahanServices.VahanModel.OwnerDetailPuccPermit;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import com.nic.mparivahan.VahanServices.VahanUtils.VUtility;
import java.util.ArrayList;
import java.util.List;
import le.k;
import ni.nd;
import og.w;
import pl.x;

public final class VahanDmsReupload extends androidx.appcompat.app.d implements w.a {

    /* renamed from: f0  reason: collision with root package name */
    public static final a f21498f0 = new a((cm.g) null);
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
    public nd Q;
    private String R;
    public w S;
    private ArrayList T;
    private int U = -1;
    private Bitmap V;
    public k W;
    private List X;
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public NrvDetails f21499a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f21500b0;

    /* renamed from: c0  reason: collision with root package name */
    public bi.h f21501c0;

    /* renamed from: d0  reason: collision with root package name */
    public VahanProService f21502d0;

    /* renamed from: e0  reason: collision with root package name */
    private d.c f21503e0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21504e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21504e = vahanDmsReupload;
        }

        public final void b(String str) {
            this.f21504e.G1().dismiss();
            this.f21504e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21505e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21505e = vahanDmsReupload;
        }

        public final void b(String str) {
            this.f21505e.G1().dismiss();
            this.f21505e.finish();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21506e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21506e = vahanDmsReupload;
        }

        public final void b(OwnerDetailPuccPermit ownerDetailPuccPermit) {
            try {
                String regn_no = ownerDetailPuccPermit.getRegn_no();
                if (regn_no != null) {
                    if (regn_no.length() != 0) {
                        VahanDmsReupload vahanDmsReupload = this.f21506e;
                        VContant.Companion companion = VContant.Companion;
                        cm.l.c(ownerDetailPuccPermit);
                        vahanDmsReupload.x2(companion.c(ownerDetailPuccPermit));
                        je.c D1 = this.f21506e.D1();
                        String z12 = this.f21506e.z1();
                        String I1 = this.f21506e.I1();
                        String M1 = this.f21506e.M1();
                        Integer vehTypeAsInt = this.f21506e.K1().getVehTypeAsInt();
                        cm.l.c(vehTypeAsInt);
                        D1.g(z12, I1, M1, vehTypeAsInt.intValue(), 10, this.f21506e.K1());
                        return;
                    }
                }
                this.f21506e.G1().dismiss();
            } catch (Exception e10) {
                this.f21506e.G1().dismiss();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((OwnerDetailPuccPermit) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21507e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21507e = vahanDmsReupload;
        }

        public final void b(String str) {
            this.f21507e.G1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21508e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21508e = vahanDmsReupload;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00cd A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d6 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e0 A[Catch:{ Exception -> 0x0040 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x011a A[Catch:{ Exception -> 0x0040 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse r8) {
            /*
                r7 = this;
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r0 = r7.f21508e
                android.app.ProgressDialog r0 = r0.G1()
                r0.dismiss()
                r0 = 2132019106(0x7f1407a2, float:1.9676538E38)
                r1 = 8
                java.lang.String r2 = r8.getStatusCode()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = "V001"
                r4 = 1
                boolean r2 = km.p.o(r2, r3, r4)     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0126
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27692h     // Catch:{ Exception -> 0x0040 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27693i     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r4 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                r5 = 0
                if (r4 == 0) goto L_0x0043
                java.util.List r4 = r4.getNonUploadedList()     // Catch:{ Exception -> 0x0040 }
                goto L_0x0044
            L_0x0040:
                r8 = move-exception
                goto L_0x0164
            L_0x0043:
                r4 = r5
            L_0x0044:
                java.lang.String r6 = "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded>{ kotlin.collections.TypeAliasesKt.ArrayList<com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded> }"
                cm.l.d(r4, r6)     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ Exception -> 0x0040 }
                r2.t2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.F1()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0087
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                if (r2 != 0) goto L_0x0087
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
                if (r2 <= 0) goto L_0x0087
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f27700p     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00c1
            L_0x0087:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r2 = r2.F1()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x0098
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x0099
            L_0x0098:
                r2 = r5
            L_0x0099:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x00c1
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                og.w r4 = new og.w     // Catch:{ Exception -> 0x0040 }
                java.util.ArrayList r6 = r2.F1()     // Catch:{ Exception -> 0x0040 }
                r4.<init>(r2, r2, r6)     // Catch:{ Exception -> 0x0040 }
                r2.n2(r4)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r2 = r2.f27700p     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r4 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                og.w r4 = r4.y1()     // Catch:{ Exception -> 0x0040 }
                r2.setAdapter(r4)     // Catch:{ Exception -> 0x0040 }
            L_0x00c1:
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r2 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00d6
                java.util.List r2 = r2.getUploadedList()     // Catch:{ Exception -> 0x0040 }
                if (r2 == 0) goto L_0x00d6
                int r2 = r2.size()     // Catch:{ Exception -> 0x0040 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x00d7
            L_0x00d6:
                r2 = r5
            L_0x00d7:
                cm.l.c(r2)     // Catch:{ Exception -> 0x0040 }
                int r2 = r2.intValue()     // Catch:{ Exception -> 0x0040 }
                if (r2 <= 0) goto L_0x011a
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r2 = r2.f27701q     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.DMS.DmsModle.UploadDataDto r8 = r8.getUploadDataDto()     // Catch:{ Exception -> 0x0040 }
                if (r8 == 0) goto L_0x00f7
                java.util.List r5 = r8.getUploadedList()     // Catch:{ Exception -> 0x0040 }
            L_0x00f7:
                r2.C2(r5)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                le.k r2 = new le.k     // Catch:{ Exception -> 0x0040 }
                java.util.List r3 = r8.O1()     // Catch:{ Exception -> 0x0040 }
                r2.<init>(r8, r8, r3)     // Catch:{ Exception -> 0x0040 }
                r8.B2(r2)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r8 = r8.A1()     // Catch:{ Exception -> 0x0040 }
                androidx.recyclerview.widget.RecyclerView r8 = r8.f27702r     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                le.k r2 = r2.N1()     // Catch:{ Exception -> 0x0040 }
                r8.setAdapter(r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x017b
            L_0x011a:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r8 = r8.A1()     // Catch:{ Exception -> 0x0040 }
                androidx.cardview.widget.CardView r8 = r8.f27701q     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                goto L_0x017b
            L_0x0126:
                ka.c$a r2 = ka.c.f13158a     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0040 }
                boolean r2 = r2.m(r3)     // Catch:{ Exception -> 0x0040 }
                if (r2 != 0) goto L_0x014f
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r2 = r2.A1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r2 = r2.f27692h     // Catch:{ Exception -> 0x0040 }
                r2.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r2 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = r8.getStatusDesc()     // Catch:{ Exception -> 0x0040 }
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0040 }
                r2.J2(r2, r8)     // Catch:{ Exception -> 0x0040 }
                goto L_0x017b
            L_0x014f:
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                ni.nd r8 = r8.A1()     // Catch:{ Exception -> 0x0040 }
                android.widget.FrameLayout r8 = r8.f27692h     // Catch:{ Exception -> 0x0040 }
                r8.setVisibility(r1)     // Catch:{ Exception -> 0x0040 }
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e     // Catch:{ Exception -> 0x0040 }
                java.lang.String r2 = r8.getString(r0)     // Catch:{ Exception -> 0x0040 }
                r8.J2(r8, r2)     // Catch:{ Exception -> 0x0040 }
                goto L_0x017b
            L_0x0164:
                r8.printStackTrace()
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e
                ni.nd r8 = r8.A1()
                android.widget.FrameLayout r8 = r8.f27692h
                r8.setVisibility(r1)
                com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload r8 = r7.f21508e
                java.lang.String r0 = r8.getString(r0)
                r8.J2(r8, r0)
            L_0x017b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload.f.b(com.nic.mparivahan.VahanServices.DMS.DmsModle.VahanDmsModleResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((VahanDmsModleResponse) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VahanDmsReupload f21509e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(VahanDmsReupload vahanDmsReupload) {
            super(1);
            this.f21509e = vahanDmsReupload;
        }

        public final void b(String str) {
            this.f21509e.G1().dismiss();
            this.f21509e.A1().f27692h.setVisibility(8);
            VahanDmsReupload vahanDmsReupload = this.f21509e;
            vahanDmsReupload.J2(vahanDmsReupload, vahanDmsReupload.getString(R.string.service_unavable_please_try));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21510a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f21510a = lVar;
        }

        public final pl.c a() {
            return this.f21510a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21510a.invoke(obj);
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

    public VahanDmsReupload() {
        d.c y02 = y0(new e.d(), new u1(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21503e0 = y02;
    }

    private final String E1(Uri uri, String str) {
        ContentResolver contentResolver = getContentResolver();
        cm.l.c(uri);
        Cursor query = contentResolver.query(uri, (String[]) null, str, (String[]) null, (String) null);
        String str2 = null;
        if (query != null) {
            if (query.moveToFirst()) {
                str2 = query.getString(query.getColumnIndex("_data"));
            }
            query.close();
        }
        cm.l.c(str2);
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void F2(android.os.Bundle r4) {
        /*
            r3 = this;
            java.lang.String r0 = "data"
            java.lang.Object r4 = r4.get(r0)
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            r3.V = r4
            java.util.ArrayList r4 = r3.T
            r0 = 0
            if (r4 == 0) goto L_0x0018
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x0019
        L_0x0018:
            r4 = r0
        L_0x0019:
            if (r4 != 0) goto L_0x001c
            goto L_0x0021
        L_0x001c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.setAttached(r1)
        L_0x0021:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x002e
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x002f
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 != 0) goto L_0x0032
            goto L_0x0037
        L_0x0032:
            android.graphics.Bitmap r1 = r3.V
            r4.setBitmap(r1)
        L_0x0037:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x0044
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            java.lang.String r1 = r3.Y
            r4.setCatId(r1)
        L_0x004d:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x005a
            int r0 = r3.U
            java.lang.Object r4 = r4.get(r0)
            r0 = r4
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
        L_0x005a:
            if (r0 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            java.lang.String r4 = r3.Z
            r0.setSubId(r4)
        L_0x0062:
            int r4 = r3.U
            java.lang.String r0 = r3.Z
            java.lang.String r1 = r3.Y
            android.graphics.Bitmap r2 = r3.V
            r3.e(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload.F2(android.os.Bundle):void");
    }

    private final void G2(Bundle bundle) {
        Bitmap bitmap = (Bitmap) bundle.get("data");
        this.V = bitmap;
        if (this.f21500b0 != null) {
            G1().show();
            String z12 = z1();
            String str = this.f21500b0;
            cm.l.c(str);
            cm.l.c(bitmap);
            D1().s(new DmsUpdateRequest(z12, str, z1() + "" + System.currentTimeMillis() + ".jpg", com.nic.mparivahan.dlservices.utilities.e.f(bitmap), M1()));
        }
    }

    /* access modifiers changed from: private */
    public static final void H1(VahanDmsReupload vahanDmsReupload, d.a aVar) {
        cm.l.f(vahanDmsReupload, "this$0");
        if (aVar.d() == -1) {
            Intent c10 = aVar.c();
            String str = null;
            Bundle extras = c10 != null ? c10.getExtras() : null;
            String str2 = vahanDmsReupload.R;
            if (str2 == null) {
                cm.l.v("imgType");
            } else {
                str = str2;
            }
            switch (str.hashCode()) {
                case -827012528:
                    if (str.equals("signature_Update") && c10 != null) {
                        vahanDmsReupload.S1(c10);
                        return;
                    }
                    return;
                case 106642994:
                    if (str.equals("photo") && extras != null) {
                        vahanDmsReupload.F2(extras);
                        return;
                    }
                    return;
                case 955443094:
                    if (str.equals("photo_Update") && extras != null) {
                        vahanDmsReupload.G2(extras);
                        return;
                    }
                    return;
                case 1073584312:
                    if (str.equals("signature") && c10 != null) {
                        vahanDmsReupload.R1(c10);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void I2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void K2(Dialog dialog, VahanDmsReupload vahanDmsReupload, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(vahanDmsReupload, "this$0");
        dialog.dismiss();
        vahanDmsReupload.finish();
    }

    private final void R1(Intent intent) {
        cm.l.c(intent);
        Uri data = intent.getData();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(intent);
        sb2.append(" & ");
        String str = this.R;
        String str2 = null;
        if (str == null) {
            cm.l.v("imgType");
            str = null;
        }
        sb2.append(str);
        sb2.append("& ");
        sb2.append(data);
        Log.v("data", sb2.toString());
        if (DocumentsContract.isDocumentUri(this, data)) {
            String documentId = DocumentsContract.getDocumentId(data);
            cm.l.c(data);
            if (cm.l.a("com.android.providers.media.documents", data.getAuthority())) {
                cm.l.c(documentId);
                str2 = E1(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + ((String) q.l0(documentId, new String[]{":"}, false, 0, 6, (Object) null).get(1)));
            } else if (cm.l.a("com.android.providers.downloads.documents", data.getAuthority())) {
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId);
                cm.l.e(valueOf, "valueOf(...)");
                Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                cm.l.e(withAppendedId, "withAppendedId(...)");
                str2 = E1(withAppendedId, (String) null);
            }
        } else {
            cm.l.c(data);
            if (p.o("content", data.getScheme(), true)) {
                str2 = E1(data, (String) null);
            } else if (p.o("file", data.getScheme(), true)) {
                str2 = data.getPath();
            }
        }
        l2(str2);
    }

    private final void S1(Intent intent) {
        cm.l.c(intent);
        Uri data = intent.getData();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(intent);
        sb2.append(" & ");
        String str = this.R;
        String str2 = null;
        if (str == null) {
            cm.l.v("imgType");
            str = null;
        }
        sb2.append(str);
        sb2.append("& ");
        sb2.append(data);
        Log.v("data", sb2.toString());
        if (DocumentsContract.isDocumentUri(this, data)) {
            String documentId = DocumentsContract.getDocumentId(data);
            cm.l.c(data);
            if (cm.l.a("com.android.providers.media.documents", data.getAuthority())) {
                cm.l.c(documentId);
                str2 = E1(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=" + ((String) q.l0(documentId, new String[]{":"}, false, 0, 6, (Object) null).get(1)));
            } else if (cm.l.a("com.android.providers.downloads.documents", data.getAuthority())) {
                Uri parse = Uri.parse("content://downloads/public_downloads");
                Long valueOf = Long.valueOf(documentId);
                cm.l.e(valueOf, "valueOf(...)");
                Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                cm.l.e(withAppendedId, "withAppendedId(...)");
                str2 = E1(withAppendedId, (String) null);
            }
        } else {
            cm.l.c(data);
            if (p.o("content", data.getScheme(), true)) {
                str2 = E1(data, (String) null);
            } else if (p.o("file", data.getScheme(), true)) {
                str2 = data.getPath();
            }
        }
        m2(str2);
    }

    /* access modifiers changed from: private */
    public static final void T1(VahanDmsReupload vahanDmsReupload, u uVar, View view) {
        cm.l.f(vahanDmsReupload, "this$0");
        cm.l.f(uVar, "$languageSession");
        VUtility.Companion.v(vahanDmsReupload, ((ld.c) uVar.f20234e).b("are_you_sure_you_want_to_leave", vahanDmsReupload.getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: private */
    public static final void U1(VahanDmsReupload vahanDmsReupload, View view) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().show();
        vahanDmsReupload.Q1().j(vahanDmsReupload, vahanDmsReupload.z1(), vahanDmsReupload.M1());
    }

    /* access modifiers changed from: private */
    public static final void V1(VahanDmsReupload vahanDmsReupload, String str) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
        vahanDmsReupload.h2(vahanDmsReupload, "Unable to update the document, Please try after sometime");
    }

    /* access modifiers changed from: private */
    public static final void W1(VahanDmsReupload vahanDmsReupload, View view) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.A1().f27702r.setVisibility(vahanDmsReupload.A1().f27702r.getVisibility() == 0 ? 8 : 0);
    }

    /* access modifiers changed from: private */
    public static final void X1(VahanDmsReupload vahanDmsReupload, DmsUploadRes dmsUploadRes) {
        cm.l.f(vahanDmsReupload, "this$0");
        try {
            if (p.o(dmsUploadRes.getStatusCode(), "V001", true)) {
                je.c D1 = vahanDmsReupload.D1();
                String z12 = vahanDmsReupload.z1();
                String I1 = vahanDmsReupload.I1();
                String M1 = vahanDmsReupload.M1();
                Integer vehTypeAsInt = vahanDmsReupload.K1().getVehTypeAsInt();
                cm.l.c(vehTypeAsInt);
                D1.p(z12, I1, M1, vehTypeAsInt.intValue(), 10, vahanDmsReupload.K1());
                vahanDmsReupload.j2(vahanDmsReupload, "Documents has been Successfully Uploaded!");
                return;
            }
            vahanDmsReupload.G1().dismiss();
            vahanDmsReupload.f2(vahanDmsReupload);
        } catch (Exception unused) {
            vahanDmsReupload.G1().dismiss();
            vahanDmsReupload.f2(vahanDmsReupload);
        }
    }

    /* access modifiers changed from: private */
    public static final void Y1(VahanDmsReupload vahanDmsReupload, String str) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
        vahanDmsReupload.f2(vahanDmsReupload);
    }

    /* access modifiers changed from: private */
    public static final void Z1(VahanDmsReupload vahanDmsReupload, VahanDmsModleResponse vahanDmsModleResponse) {
        List<Uploaded> uploadedList;
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
        if (p.o(vahanDmsModleResponse.getStatusCode(), "V001", true)) {
            ArrayList arrayList = vahanDmsReupload.T;
            if (arrayList != null) {
                arrayList.clear();
            }
            UploadDataDto uploadDataDto = vahanDmsModleResponse.getUploadDataDto();
            ArrayList arrayList2 = (ArrayList) (uploadDataDto != null ? uploadDataDto.getNonUploadedList() : null);
            vahanDmsReupload.T = arrayList2;
            Integer valueOf = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
            cm.l.c(valueOf);
            if (valueOf.intValue() > 0) {
                vahanDmsReupload.A1().f27700p.setAdapter((RecyclerView.h) null);
                vahanDmsReupload.n2(new w(vahanDmsReupload, vahanDmsReupload, vahanDmsReupload.T));
                vahanDmsReupload.A1().f27700p.setAdapter(vahanDmsReupload.y1());
            } else {
                ArrayList arrayList3 = vahanDmsReupload.T;
                if (arrayList3 != null) {
                    arrayList3.clear();
                }
                vahanDmsReupload.A1().f27700p.setAdapter((RecyclerView.h) null);
            }
            vahanDmsReupload.y1().j();
            UploadDataDto uploadDataDto2 = vahanDmsModleResponse.getUploadDataDto();
            Integer valueOf2 = (uploadDataDto2 == null || (uploadedList = uploadDataDto2.getUploadedList()) == null) ? null : Integer.valueOf(uploadedList.size());
            cm.l.c(valueOf2);
            if (valueOf2.intValue() > 0) {
                try {
                    vahanDmsReupload.A1().f27701q.setVisibility(0);
                    UploadDataDto uploadDataDto3 = vahanDmsModleResponse.getUploadDataDto();
                    vahanDmsReupload.X = uploadDataDto3 != null ? uploadDataDto3.getUploadedList() : null;
                    vahanDmsReupload.A1().f27702r.setAdapter((RecyclerView.h) null);
                    vahanDmsReupload.B2(new k(vahanDmsReupload, vahanDmsReupload, vahanDmsReupload.X));
                    vahanDmsReupload.A1().f27702r.setAdapter(vahanDmsReupload.N1());
                    vahanDmsReupload.N1().j();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void a2(VahanDmsReupload vahanDmsReupload, String str) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b2(VahanDmsReupload vahanDmsReupload, DMSViewDocModle dMSViewDocModle) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
        if (p.o(dMSViewDocModle.getStatusCode(), "V001", true)) {
            vahanDmsReupload.H2(vahanDmsReupload, dMSViewDocModle.getFileContent());
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(VahanDmsReupload vahanDmsReupload, String str) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
    }

    /* access modifiers changed from: private */
    public static final void d2(VahanDmsReupload vahanDmsReupload, UpdateDocResponse updateDocResponse) {
        cm.l.f(vahanDmsReupload, "this$0");
        vahanDmsReupload.G1().dismiss();
        vahanDmsReupload.h2(vahanDmsReupload, p.o(updateDocResponse.getStatusCode(), "V001", true) ? "Documents has been updated Successfully!" : updateDocResponse.getStatusDesc());
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void i2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void k2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l2(java.lang.String r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x006b
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r4)
            r3.V = r4
            java.util.ArrayList r4 = r3.T
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            if (r4 != 0) goto L_0x001a
            goto L_0x001f
        L_0x001a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.setAttached(r1)
        L_0x001f:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x002c
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            goto L_0x0035
        L_0x0030:
            android.graphics.Bitmap r1 = r3.V
            r4.setBitmap(r1)
        L_0x0035:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x0042
            int r1 = r3.U
            java.lang.Object r4 = r4.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r4 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r4
            goto L_0x0043
        L_0x0042:
            r4 = r0
        L_0x0043:
            if (r4 != 0) goto L_0x0046
            goto L_0x004b
        L_0x0046:
            java.lang.String r1 = r3.Y
            r4.setCatId(r1)
        L_0x004b:
            java.util.ArrayList r4 = r3.T
            if (r4 == 0) goto L_0x0058
            int r0 = r3.U
            java.lang.Object r4 = r4.get(r0)
            r0 = r4
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            goto L_0x0060
        L_0x005b:
            java.lang.String r4 = r3.Z
            r0.setSubId(r4)
        L_0x0060:
            int r4 = r3.U
            java.lang.String r0 = r3.Z
            java.lang.String r1 = r3.Y
            android.graphics.Bitmap r2 = r3.V
            r3.e(r4, r0, r1, r2)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload.l2(java.lang.String):void");
    }

    private final void m2(String str) {
        if (str != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            this.V = decodeFile;
            if (this.f21500b0 != null) {
                G1().show();
                String z12 = z1();
                String str2 = this.f21500b0;
                cm.l.c(str2);
                cm.l.c(decodeFile);
                D1().s(new DmsUpdateRequest(z12, str2, z1() + "" + System.currentTimeMillis() + ".jpg", com.nic.mparivahan.dlservices.utilities.e.f(decodeFile), M1()));
            }
        }
    }

    private final Bitmap w1(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    private final void x1() {
        if (checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == -1) {
            requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 5001);
        }
    }

    public final nd A1() {
        nd ndVar = this.Q;
        if (ndVar != null) {
            return ndVar;
        }
        cm.l.v("binding");
        return null;
    }

    public final void A2(String str) {
        cm.l.f(str, "<set-?>");
        this.J = str;
    }

    public final String B1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        cm.l.v("chassiNo");
        return null;
    }

    public final void B2(k kVar) {
        cm.l.f(kVar, "<set-?>");
        this.W = kVar;
    }

    public final DMSService C1() {
        DMSService dMSService = this.P;
        if (dMSService != null) {
            return dMSService;
        }
        cm.l.v("dmsService");
        return null;
    }

    public final void C2(List list) {
        this.X = list;
    }

    public final je.c D1() {
        je.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("dmsViewModle");
        return null;
    }

    public final void D2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.f21502d0 = vahanProService;
    }

    public final void E2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.f21501c0 = hVar;
    }

    public final ArrayList F1() {
        return this.T;
    }

    public final ProgressDialog G1() {
        ProgressDialog progressDialog = this.G;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final void H2(Context context, String str) {
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
        ((ImageView) findViewById2).setImageBitmap(w1(str));
        ((TextView) findViewById).setOnClickListener(new v1(dialog));
        dialog.show();
    }

    public final String I1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        cm.l.v(VContant.PURPOSE_CODE);
        return null;
    }

    public final String J1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        cm.l.v("rc_no");
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new z1(dialog, this));
        dialog.show();
    }

    public final NrvDetails K1() {
        NrvDetails nrvDetails = this.f21499a0;
        if (nrvDetails != null) {
            return nrvDetails;
        }
        cm.l.v("rcdetails");
        return null;
    }

    public final VahanProService L1() {
        VahanProService vahanProService = this.H;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("slotService");
        return null;
    }

    public final String M1() {
        String str = this.J;
        if (str != null) {
            return str;
        }
        cm.l.v("state_code");
        return null;
    }

    public final k N1() {
        k kVar = this.W;
        if (kVar != null) {
            return kVar;
        }
        cm.l.v("uploaded_adapter");
        return null;
    }

    public final List O1() {
        return this.X;
    }

    public final VahanProService P1() {
        VahanProService vahanProService = this.f21502d0;
        if (vahanProService != null) {
            return vahanProService;
        }
        cm.l.v("vahanService");
        return null;
    }

    public final bi.h Q1() {
        bi.h hVar = this.f21501c0;
        if (hVar != null) {
            return hVar;
        }
        cm.l.v("vahanViewModle");
        return null;
    }

    public void a(int i10) {
    }

    public void d(int i10, String str, String str2) {
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            Log.e("calling1", String.valueOf(i10));
            this.R = "signature";
            this.U = i10;
            this.Y = str;
            this.Z = str2;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f21503e0.a(intent);
        }
    }

    public void e(int i10, String str, String str2, Bitmap bitmap) {
        cm.l.f(str, "sub_id");
        cm.l.f(str2, "cat_id");
        G1().show();
        this.U = i10;
        cm.l.c(bitmap);
        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
        D1().t(new DmsUploadReq(q.B0(z1()).toString(), p.d(new DmsFileDetail(f10, str2, str, "file_" + System.currentTimeMillis() + ".jpg", false)), q.B0(M1()).toString()));
    }

    public void e2(String str, int i10) {
        cm.l.f(str, "doc_number");
        this.f21500b0 = str;
        if (i10 == 1 && com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.R = "signature_Update";
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            this.f21503e0.a(intent);
        }
        if (i10 == 2 && com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            this.R = "photo_Update";
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.f21503e0.a(getIntent());
        }
    }

    public final void f2(Context context) {
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
        ((TextView) findViewById2).setOnClickListener(new y1(dialog));
        dialog.show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(int r3) {
        /*
            r2 = this;
            java.util.ArrayList r3 = r2.T
            r0 = 0
            if (r3 == 0) goto L_0x000e
            int r1 = r2.U
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r3 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r3.setAttached(r1)
        L_0x0017:
            java.util.ArrayList r3 = r2.T
            if (r3 == 0) goto L_0x0024
            int r1 = r2.U
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0025
        L_0x0024:
            r3 = r0
        L_0x0025:
            if (r3 != 0) goto L_0x0028
            goto L_0x002b
        L_0x0028:
            r3.setBitmap(r0)
        L_0x002b:
            java.util.ArrayList r3 = r2.T
            if (r3 == 0) goto L_0x0038
            int r1 = r2.U
            java.lang.Object r3 = r3.get(r1)
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r3 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r3
            goto L_0x0039
        L_0x0038:
            r3 = r0
        L_0x0039:
            java.lang.String r1 = ""
            if (r3 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r3.setSubId(r1)
        L_0x0041:
            java.util.ArrayList r3 = r2.T
            if (r3 == 0) goto L_0x004e
            int r0 = r2.U
            java.lang.Object r3 = r3.get(r0)
            r0 = r3
            com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded r0 = (com.nic.mparivahan.VahanServices.DMS.DmsModle.NonUploaded) r0
        L_0x004e:
            if (r0 != 0) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            r0.setCatId(r1)
        L_0x0054:
            og.w r3 = r2.y1()
            r3.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.VahanServices.VahanView.VahanDmsReupload.g(int):void");
    }

    public void h(int i10, String str, String str2) {
        cm.l.f(str, "cat_id");
        cm.l.f(str2, "sub_id");
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            this.R = "photo";
            this.U = i10;
            this.Y = str;
            this.Z = str2;
            setIntent(new Intent("android.media.action.IMAGE_CAPTURE"));
            this.f21503e0.a(getIntent());
        }
    }

    public final void h2(Context context, String str) {
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
        ((TextView) findViewById2).setOnClickListener(new w1(dialog));
        dialog.show();
    }

    public final void j2(Context context, String str) {
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
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new x1(dialog));
        dialog.show();
    }

    public final void n2(w wVar) {
        cm.l.f(wVar, "<set-?>");
        this.S = wVar;
    }

    public final void o2(String str) {
        cm.l.f(str, "<set-?>");
        this.K = str;
    }

    public void onBackPressed() {
        VUtility.Companion.v(this, new ld.c(this).b("are_you_sure_you_want_to_leave", getString(R.string.are_you_sure_you_want_to_leave)));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_dms_activity_reupload);
        nd c10 = nd.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        p2(c10);
        setContentView((View) A1().b());
        VahanProService.a aVar = VahanProService.f21196b;
        y2(aVar.b(this));
        r2(DMSService.f20571a.b(this));
        D2(aVar.b(this));
        u uVar = new u();
        uVar.f20234e = new ld.c(this);
        x1();
        u2(new ProgressDialog(this));
        G1().setMessage(((ld.c) uVar.f20234e).b("label_challan_please_wait", getString(R.string.please_wait)));
        G1().setCancelable(false);
        G1().setCanceledOnTouchOutside(false);
        A1().f27689e.f25959e.setOnClickListener(new s1(this, uVar));
        Class<bi.h> cls = bi.h.class;
        z2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(L1()))).a(cls));
        E2((bi.h) new u0((x0) this, (u0.b) new bi.g(new wg.d(P1()))).a(cls));
        s2((je.c) new u0((x0) this, (u0.b) new je.b(new je.a(C1()))).a(je.c.class));
        A1().f27700p.setLayoutManager(new LinearLayoutManager(this));
        A1().f27702r.setLayoutManager(new LinearLayoutManager(this));
        try {
            String stringExtra = getIntent().getStringExtra("state_code");
            cm.l.c(stringExtra);
            A2(stringExtra);
            String stringExtra2 = getIntent().getStringExtra(VContant.APP_NO);
            cm.l.c(stringExtra2);
            o2(stringExtra2);
            String stringExtra3 = getIntent().getStringExtra("rc_number");
            cm.l.c(stringExtra3);
            w2(stringExtra3);
            String stringExtra4 = getIntent().getStringExtra(VContant.PURPOSE_CODE);
            cm.l.c(stringExtra4);
            v2(stringExtra4);
            String stringExtra5 = getIntent().getStringExtra("chassiNo");
            cm.l.c(stringExtra5);
            q2(stringExtra5);
            TextView textView = A1().f27703s;
            textView.setText("Vehicle No. : " + J1());
            TextView textView2 = A1().f27686b;
            textView2.setText("Application No. " + z1());
            A1().f27694j.setText(VContant.Companion.I(this, I1()));
            G1().show();
            Q1().A0(this, J1(), M1(), I1(), B1());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        A1().f27696l.setOnClickListener(new b2(this));
        Q1().y().g(this, new h(new b(this)));
        Q1().z().g(this, new h(new c(this)));
        A1().f27701q.setOnClickListener(new c2(this));
        Q1().D0().g(this, new h(new d(this)));
        Q1().C0().g(this, new h(new e(this)));
        D1().h().g(this, new h(new f(this)));
        D1().i().g(this, new h(new g(this)));
        D1().j().g(this, new d2(this));
        D1().k().g(this, new e2(this));
        D1().l().g(this, new f2(this));
        D1().m().g(this, new g2(this));
        D1().q().g(this, new h2(this));
        D1().r().g(this, new i2(this));
        D1().n().g(this, new t1(this));
        D1().o().g(this, new a2(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 5001) {
            if ((!(iArr.length == 0)) && iArr[0] != 0) {
                Toast.makeText(this, "Please grant permission to proceed", 0).show();
                x1();
            }
        }
    }

    public void p(String str) {
        cm.l.f(str, "doc_number");
        try {
            G1().show();
            Log.e("Print --OBJ--> ", str);
            List l02 = q.l0(str, new String[]{"/"}, false, 0, 6, (Object) null);
            D1().u(q.B0((String) l02.get(0)).toString(), q.B0((String) l02.get(2)).toString(), q.B0((String) l02.get(1)).toString());
        } catch (Exception e10) {
            G1().dismiss();
            e10.printStackTrace();
        }
    }

    public final void p2(nd ndVar) {
        cm.l.f(ndVar, "<set-?>");
        this.Q = ndVar;
    }

    public final void q2(String str) {
        cm.l.f(str, "<set-?>");
        this.N = str;
    }

    public final void r2(DMSService dMSService) {
        cm.l.f(dMSService, "<set-?>");
        this.P = dMSService;
    }

    public final void s2(je.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void t2(ArrayList arrayList) {
        this.T = arrayList;
    }

    public final void u2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.G = progressDialog;
    }

    public final void v2(String str) {
        cm.l.f(str, "<set-?>");
        this.M = str;
    }

    public final void w2(String str) {
        cm.l.f(str, "<set-?>");
        this.L = str;
    }

    public final void x2(NrvDetails nrvDetails) {
        cm.l.f(nrvDetails, "<set-?>");
        this.f21499a0 = nrvDetails;
    }

    public final w y1() {
        w wVar = this.S;
        if (wVar != null) {
            return wVar;
        }
        cm.l.v("adapter");
        return null;
    }

    public final void y2(VahanProService vahanProService) {
        cm.l.f(vahanProService, "<set-?>");
        this.H = vahanProService;
    }

    public final String z1() {
        String str = this.K;
        if (str != null) {
            return str;
        }
        cm.l.v("appl_no");
        return null;
    }

    public final void z2(bi.h hVar) {
        cm.l.f(hVar, "<set-?>");
        this.I = hVar;
    }
}
