package com.nic.mparivahan.ClServices.View;

import android.app.Application;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.ClServices.View.a;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedDocBeanItem;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadDocResponse;
import com.nic.mparivahan.dlservices.data.model.temp.InsertedUploadResponseMessage;
import com.nic.mparivahan.dlservices.data.model.temp.ResponseBean;
import com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse;
import com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ni.p0;
import nj.q;
import p9.a1;
import p9.b1;
import p9.c1;
import p9.d1;
import p9.q0;
import p9.r0;
import p9.s0;
import p9.u0;
import p9.v0;
import p9.w0;
import p9.x0;
import p9.y0;
import p9.z0;
import pl.x;
import t2.a;

public final class ClDocumentsUpload extends androidx.appcompat.app.d implements a.C0110a {
    /* access modifiers changed from: private */
    public p0 G;
    /* access modifiers changed from: private */
    public q H;
    private a I;
    /* access modifiers changed from: private */
    public String J;
    /* access modifiers changed from: private */
    public String K;
    /* access modifiers changed from: private */
    public String L;
    /* access modifiers changed from: private */
    public String M;
    /* access modifiers changed from: private */
    public String N;
    public String[] O;
    /* access modifiers changed from: private */
    public ArrayList P = new ArrayList();
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f7868a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    public ld.g f7869b0;

    /* renamed from: c0  reason: collision with root package name */
    private t0 f7870c0;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public ArrayList f7871d0 = new ArrayList();

    /* renamed from: e0  reason: collision with root package name */
    public ld.c f7872e0;

    /* renamed from: f0  reason: collision with root package name */
    public ld.f f7873f0;

    /* renamed from: g0  reason: collision with root package name */
    private int f7874g0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public final d.c f7875h0;

    /* renamed from: i0  reason: collision with root package name */
    private d.c f7876i0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7877e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7877e = clDocumentsUpload;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            r1 = (r1 = r1.getTransReq()).get(0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse r8) {
            /*
                r7 = this;
                com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage r0 = r8.getResponseMessage()     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x019d
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x000e
                goto L_0x019d
            L_0x000e:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x019d }
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 != r1) goto L_0x019d
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r1 = r8.getResponseBody()     // Catch:{ Exception -> 0x019d }
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0033
                java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x019d }
                if (r1 == 0) goto L_0x0033
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.dlservices.ui.acknow.TransReqItem r1 = (com.nic.mparivahan.dlservices.ui.acknow.TransReqItem) r1     // Catch:{ Exception -> 0x019d }
                if (r1 == 0) goto L_0x0033
                java.lang.Integer r1 = r1.getTrTrCd()     // Catch:{ Exception -> 0x019d }
                goto L_0x0034
            L_0x0033:
                r1 = r3
            L_0x0034:
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x019d }
                r0.N = r1     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r0 = r8.getResponseBody()     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0046
                com.nic.mparivahan.dlservices.ui.acknow.OlaMast r0 = r0.getOlaMast()     // Catch:{ Exception -> 0x019d }
                goto L_0x0047
            L_0x0046:
                r0 = r3
            L_0x0047:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r1 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0050
                java.lang.String r4 = r0.getOmOfficecd()     // Catch:{ Exception -> 0x019d }
                goto L_0x0051
            L_0x0050:
                r4 = r3
            L_0x0051:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x019d }
                r1.M = r4     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r1 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0061
                java.lang.String r0 = r0.getOmStCode()     // Catch:{ Exception -> 0x019d }
                goto L_0x0062
            L_0x0061:
                r0 = r3
            L_0x0062:
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x019d }
                r1.L = r0     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ni.p0 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "mBinding"
                if (r0 != 0) goto L_0x0077
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0077:
                android.widget.TextView r0 = r0.f27914y     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r4 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r4 = r4.J     // Catch:{ Exception -> 0x019d }
                java.lang.String r5 = "mApplNo"
                if (r4 != 0) goto L_0x0087
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x0087:
                r0.setText(r4)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ni.p0 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x0096
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0096:
                android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r4 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r4 = r4.K     // Catch:{ Exception -> 0x019d }
                if (r4 != 0) goto L_0x00a6
                java.lang.String r4 = "mApplDob"
                cm.l.v(r4)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x00a6:
                r0.setText(r4)     // Catch:{ Exception -> 0x019d }
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x019d }
                java.lang.String r4 = "dd-MM-yyyy"
                java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x019d }
                r0.<init>(r4, r6)     // Catch:{ Exception -> 0x019d }
                java.util.Date r4 = new java.util.Date     // Catch:{ Exception -> 0x019d }
                r4.<init>()     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = r0.format(r4)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r4 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ni.p0 r4 = r4.G     // Catch:{ Exception -> 0x019d }
                if (r4 != 0) goto L_0x00c9
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x00c9:
                android.widget.TextView r4 = r4.B     // Catch:{ Exception -> 0x019d }
                r4.setText(r0)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ni.p0 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x00da
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x00da:
                android.widget.TextView r0 = r0.E     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r4 = r8.getResponseBody()     // Catch:{ Exception -> 0x019d }
                if (r4 == 0) goto L_0x00e7
                java.lang.String r4 = r4.getApdFullName()     // Catch:{ Exception -> 0x019d }
                goto L_0x00e8
            L_0x00e7:
                r4 = r3
            L_0x00e8:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x019d }
                r0.setText(r4)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ni.p0 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x00fb
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x00fb:
                android.widget.TextView r0 = r0.D     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r8 = r8.getResponseBody()     // Catch:{ Exception -> 0x019d }
                if (r8 == 0) goto L_0x0108
                java.lang.String r8 = r8.getApdSwdFullName()     // Catch:{ Exception -> 0x019d }
                goto L_0x0109
            L_0x0108:
                r8 = r3
            L_0x0109:
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x019d }
                r0.setText(r8)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r8 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.J     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x011c
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x011c:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r8 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.L     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = "mApplStateCd"
                if (r8 != 0) goto L_0x0130
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x0130:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.a$a r8 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r1 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                boolean r8 = r8.a(r1)     // Catch:{ Exception -> 0x019d }
                if (r8 == 0) goto L_0x017b
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r8 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                nj.q r8 = r8.H     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x014e
                java.lang.String r8 = "viewModel"
                cm.l.v(r8)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x014e:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r1 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = r1.J     // Catch:{ Exception -> 0x019d }
                if (r1 != 0) goto L_0x015a
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r1 = r3
            L_0x015a:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r2 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x019d }
                if (r2 != 0) goto L_0x0166
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r2 = r3
            L_0x0166:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = r0.N     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x0174
                java.lang.String r0 = "serviceCode"
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                goto L_0x0175
            L_0x0174:
                r3 = r0
            L_0x0175:
                java.lang.String r0 = "A"
                r8.m(r1, r2, r3, r0)     // Catch:{ Exception -> 0x019d }
                goto L_0x019d
            L_0x017b:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r8 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                ld.c r0 = r0.P1()     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "label_log_check_internet"
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r3 = r7.f7877e     // Catch:{ Exception -> 0x019d }
                r4 = 2132018237(0x7f14043d, float:1.9674775E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = r0.b(r1, r3)     // Catch:{ Exception -> 0x019d }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)     // Catch:{ Exception -> 0x019d }
                r8.show()     // Catch:{ Exception -> 0x019d }
            L_0x019d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClDocumentsUpload.a.b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7878e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7878e = clDocumentsUpload;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                            this.f7878e.B2(uploadDocListResponse.getDocumentList());
                        }
                    }
                }
                q C1 = this.f7878e.H;
                String str = null;
                if (C1 == null) {
                    cm.l.v("viewModel");
                    C1 = null;
                }
                String x12 = this.f7878e.J;
                if (x12 == null) {
                    cm.l.v("mApplNo");
                    x12 = null;
                }
                String y12 = this.f7878e.L;
                if (y12 == null) {
                    cm.l.v("mApplStateCd");
                    y12 = null;
                }
                String A1 = this.f7878e.N;
                if (A1 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = A1;
                }
                C1.i(x12, y12, str);
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7879e = clDocumentsUpload;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                String str = null;
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            List<DocumentListItem> documentList = uploadDocListResponse.getDocumentList();
                            if (documentList == null || !(!documentList.isEmpty())) {
                                q C1 = this.f7879e.H;
                                if (C1 == null) {
                                    cm.l.v("viewModel");
                                    C1 = null;
                                }
                                String x12 = this.f7879e.J;
                                if (x12 == null) {
                                    cm.l.v("mApplNo");
                                    x12 = null;
                                }
                                String y12 = this.f7879e.L;
                                if (y12 == null) {
                                    cm.l.v("mApplStateCd");
                                } else {
                                    str = y12;
                                }
                                C1.p(x12, str);
                                return;
                            }
                            Collection dCodes = uploadDocListResponse.getDCodes();
                            if (dCodes != null) {
                                if (!dCodes.isEmpty()) {
                                    for (Integer add : uploadDocListResponse.getDCodes()) {
                                        this.f7879e.f7871d0.add(add);
                                    }
                                }
                            }
                            this.f7879e.M1(uploadDocListResponse.getDocumentList());
                            return;
                        }
                    }
                }
                p0 z12 = this.f7879e.G;
                if (z12 == null) {
                    cm.l.v("mBinding");
                    z12 = null;
                }
                z12.U.setVisibility(8);
                ClDocumentsUpload clDocumentsUpload = this.f7879e;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                if (responseBean2 != null) {
                    str = responseBean2.getDeveloperMessage();
                }
                clDocumentsUpload.l2(str);
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7880e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7880e = clDocumentsUpload;
        }

        public final void b(InsertedUploadDocResponse insertedUploadDocResponse) {
            try {
                InsertedUploadResponseMessage responseMessage = insertedUploadDocResponse.getResponseMessage();
                if (responseMessage != null) {
                    Integer statusCode = responseMessage.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            List<InsertedDocBeanItem> insertedDocBean = insertedUploadDocResponse.getInsertedDocBean();
                            if (insertedDocBean == null || !(!insertedDocBean.isEmpty())) {
                                this.f7880e.v2();
                                return;
                            } else {
                                this.f7880e.X1(insertedUploadDocResponse.getInsertedDocBean());
                                return;
                            }
                        }
                    }
                }
                ClDocumentsUpload clDocumentsUpload = this.f7880e;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                clDocumentsUpload.l2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InsertedUploadDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7881e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7881e = clDocumentsUpload;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
            r0 = r5.getResponses();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse r5) {
            /*
                r4 = this;
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                ni.p0 r0 = r0.G     // Catch:{ Exception -> 0x00b8 }
                r1 = 0
                if (r0 != 0) goto L_0x000f
                java.lang.String r0 = "mBinding"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00b8 }
                r0 = r1
            L_0x000f:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.U     // Catch:{ Exception -> 0x00b8 }
                r2 = 0
                r0.c(r2)     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x009d
                java.lang.Integer r0 = r5.getStatusCode()     // Catch:{ Exception -> 0x00b8 }
                if (r0 != 0) goto L_0x001f
                goto L_0x009d
            L_0x001f:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x00b8 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r0 != r3) goto L_0x009d
                if (r5 == 0) goto L_0x0036
                java.util.List r0 = r5.getResponses()     // Catch:{ Exception -> 0x00b8 }
                if (r0 == 0) goto L_0x0036
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00b8 }
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r0     // Catch:{ Exception -> 0x00b8 }
                goto L_0x0037
            L_0x0036:
                r0 = r1
            L_0x0037:
                cm.l.c(r0)     // Catch:{ Exception -> 0x00b8 }
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x00b8 }
                if (r0 != 0) goto L_0x0041
                goto L_0x009d
            L_0x0041:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x00b8 }
                if (r0 != r3) goto L_0x009d
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r5 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00b8 }
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x005e
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r5 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                r5.clear()     // Catch:{ Exception -> 0x00b8 }
            L_0x005e:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r5 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                nj.q r5 = r5.H     // Catch:{ Exception -> 0x00b8 }
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x00b8 }
                r5 = r1
            L_0x006c:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r0 = r0.J     // Catch:{ Exception -> 0x00b8 }
                if (r0 != 0) goto L_0x007a
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00b8 }
                r0 = r1
            L_0x007a:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r2 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x00b8 }
                if (r2 != 0) goto L_0x0088
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x00b8 }
                r2 = r1
            L_0x0088:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r3 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r3 = r3.N     // Catch:{ Exception -> 0x00b8 }
                if (r3 != 0) goto L_0x0096
                java.lang.String r3 = "serviceCode"
                cm.l.v(r3)     // Catch:{ Exception -> 0x00b8 }
                goto L_0x0097
            L_0x0096:
                r1 = r3
            L_0x0097:
                java.lang.String r3 = "A"
                r5.m(r0, r2, r1, r3)     // Catch:{ Exception -> 0x00b8 }
                goto L_0x00b8
            L_0x009d:
                com.nic.mparivahan.ClServices.View.ClDocumentsUpload r0 = r4.f7881e     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.util.List r5 = r5.getResponses()     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00b8 }
                r1 = r5
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r1     // Catch:{ Exception -> 0x00b8 }
            L_0x00ae:
                cm.l.c(r1)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r5 = r1.getDeveloperMessage()     // Catch:{ Exception -> 0x00b8 }
                r0.l2(r5)     // Catch:{ Exception -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClDocumentsUpload.e.b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadedDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7882e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7882e = clDocumentsUpload;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                p0 z12 = this.f7882e.G;
                if (z12 == null) {
                    cm.l.v("mBinding");
                    z12 = null;
                }
                z12.L.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f7882e.u2(applStatusDetailsItem.getApplFlowStatusList());
                }
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7883e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7883e = clDocumentsUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f7883e.f7875h0.a(intent);
            this.f7883e.s2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClDocumentsUpload f7884e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ClDocumentsUpload clDocumentsUpload) {
            super(1);
            this.f7884e = clDocumentsUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f7884e.f7875h0.a(intent);
            this.f7884e.s2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f7885a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f7885a = lVar;
        }

        public final pl.c a() {
            return this.f7885a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7885a.invoke(obj);
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

    public ClDocumentsUpload() {
        d.c y02 = y0(new e.d(), new w0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f7875h0 = y02;
        d.c y03 = y0(new e.b(), new x0(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f7876i0 = y03;
    }

    private final void A2() {
        try {
            Intent intent = new Intent(this, ClSots.class);
            String str = this.J;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.U);
            String str4 = this.M;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("fatherName", this.W);
            intent.putExtra("clName", this.V);
            intent.putExtra("clPhoto", this.T);
            intent.putExtra("address", this.X).toString();
            intent.putExtra("issuing_authority", this.Z).toString();
            intent.putExtra("validity", this.f7868a0).toString();
            intent.putExtra("cl_Status", this.Y).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void B2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            String str = null;
            if (documentListItem != null) {
                String str2 = this.J;
                if (str2 == null) {
                    cm.l.v("mApplNo");
                    str2 = null;
                }
                documentListItem.setApplication_no(str2);
            }
            if (documentListItem != null) {
                String str3 = this.L;
                if (str3 == null) {
                    cm.l.v("mApplStateCd");
                    str3 = null;
                }
                documentListItem.setStateCode(str3);
            }
            if (documentListItem != null) {
                String str4 = this.N;
                if (str4 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = str4;
                }
                documentListItem.setTransationCode(str);
            }
            this.P.add(documentListItem);
        }
    }

    /* access modifiers changed from: private */
    public final void M1(List list) {
        String str;
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            for (DocumentListItem documentListItem2 : this.P) {
                if (cm.l.a(documentListItem != null ? documentListItem.getId() : null, documentListItem2 != null ? documentListItem2.getId() : null)) {
                    z10 = true;
                }
            }
            if (!z10) {
                if (documentListItem != null) {
                    String str2 = this.J;
                    if (str2 == null) {
                        cm.l.v("mApplNo");
                        str2 = null;
                    }
                    documentListItem.setApplication_no(str2);
                }
                if (documentListItem != null) {
                    String str3 = this.L;
                    if (str3 == null) {
                        cm.l.v("mApplStateCd");
                        str3 = null;
                    }
                    documentListItem.setStateCode(str3);
                }
                if (documentListItem != null) {
                    String str4 = this.N;
                    if (str4 == null) {
                        cm.l.v("serviceCode");
                    } else {
                        str = str4;
                    }
                    documentListItem.setTransationCode(str);
                }
                this.P.add(documentListItem);
            }
        }
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            q qVar = this.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str5 = this.J;
            if (str5 == null) {
                cm.l.v("mApplNo");
                str5 = null;
            }
            String str6 = this.L;
            if (str6 == null) {
                cm.l.v("mApplStateCd");
            } else {
                str = str6;
            }
            qVar.p(str5, str);
            return;
        }
        Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void O1(ClDocumentsUpload clDocumentsUpload, Uri uri) {
        cm.l.f(clDocumentsUpload, "this$0");
        if (uri != null) {
            try {
                String q10 = com.nic.mparivahan.dlservices.utilities.e.q(clDocumentsUpload, uri);
                String r10 = com.nic.mparivahan.dlservices.utilities.e.r(clDocumentsUpload, uri);
                if (clDocumentsUpload.N1().contains(q.B0(r10).toString())) {
                    DocumentListItem documentListItem = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                    if (documentListItem != null) {
                        documentListItem.setBrowseStatus(true);
                    }
                    DocumentListItem documentListItem2 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                    if (documentListItem2 != null) {
                        documentListItem2.setURI(uri);
                    }
                    DocumentListItem documentListItem3 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                    if (documentListItem3 != null) {
                        documentListItem3.setFileNmae(q10);
                    }
                    boolean o10 = p.o(q.B0(r10).toString(), "pdf", true);
                    a aVar = null;
                    if (o10) {
                        String a10 = com.nic.mparivahan.dlservices.utilities.e.a(clDocumentsUpload, uri);
                        Log.e("log", a10);
                        DocumentListItem documentListItem4 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                        if (documentListItem4 != null) {
                            documentListItem4.setFileToUpload(a10);
                        }
                        DocumentListItem documentListItem5 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                        Log.e("log2", String.valueOf(documentListItem5 != null ? documentListItem5.getFileToUpload() : null));
                    } else {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(clDocumentsUpload.getContentResolver(), uri);
                        cm.l.c(bitmap);
                        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                        DocumentListItem documentListItem6 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                        if (documentListItem6 != null) {
                            documentListItem6.setFileToUpload(f10);
                        }
                    }
                    a aVar2 = clDocumentsUpload.I;
                    if (aVar2 == null) {
                        cm.l.v("adapter");
                    } else {
                        aVar = aVar2;
                    }
                    aVar.k(clDocumentsUpload.f7874g0);
                    return;
                }
                clDocumentsUpload.l2(clDocumentsUpload.P1().b("upload_file_types", clDocumentsUpload.getString(R.string.you_can_upload)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void S1(java.util.ArrayList r7) {
        /*
            r6 = this;
            java.util.Iterator r7 = r7.iterator()
            r0 = 1
            r1 = r0
        L_0x0006:
            boolean r2 = r7.hasNext()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.Object r2 = r7.next()
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r2 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r2
            if (r2 == 0) goto L_0x001d
            boolean r5 = r2.isDocInsertedStatus()
            if (r5 != r0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            if (r2 == 0) goto L_0x0024
            java.lang.String r4 = r2.getRemarks()
        L_0x0024:
            if (r4 == 0) goto L_0x0006
            r1 = r3
            goto L_0x0006
        L_0x0028:
            if (r1 == 0) goto L_0x0092
            ld.c r7 = r6.P1()
            r0 = 2132017671(0x7f140207, float:1.9673627E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.n2(r6, r7)
            nj.q r7 = r6.H
            if (r7 != 0) goto L_0x0048
            java.lang.String r7 = "viewModel"
            cm.l.v(r7)
            r7 = r4
        L_0x0048:
            java.lang.String r0 = r6.J
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "mApplNo"
            cm.l.v(r0)
            r0 = r4
        L_0x0052:
            java.lang.String r1 = r6.N
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = "serviceCode"
            cm.l.v(r1)
            r1 = r4
        L_0x005c:
            java.lang.String r2 = r6.L
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "mApplStateCd"
            cm.l.v(r2)
            r2 = r4
        L_0x0066:
            java.lang.String r5 = r6.M
            if (r5 != 0) goto L_0x0070
            java.lang.String r5 = "lastEndorseRTOCode"
            cm.l.v(r5)
            r5 = r4
        L_0x0070:
            r7.r(r0, r1, r2, r5)
            ni.p0 r7 = r6.G
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L_0x007d
            cm.l.v(r0)
            r7 = r4
        L_0x007d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.U
            r1 = 8
            r7.setVisibility(r1)
            ni.p0 r7 = r6.G
            if (r7 != 0) goto L_0x008c
            cm.l.v(r0)
            goto L_0x008d
        L_0x008c:
            r4 = r7
        L_0x008d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r4.L
            r7.setVisibility(r3)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ClDocumentsUpload.S1(java.util.ArrayList):void");
    }

    private final void T1() {
        p0 p0Var = null;
        if (getIntent() != null) {
            try {
                Bundle extras = getIntent().getExtras();
                this.J = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
                Bundle extras2 = getIntent().getExtras();
                this.K = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
                Bundle extras3 = getIntent().getExtras();
                this.M = String.valueOf(extras3 != null ? extras3.get("lastEndorseRTOCode") : null);
                this.Q = String.valueOf(getIntent().getStringExtra("DL"));
                this.R = String.valueOf(getIntent().getStringExtra("dob"));
                this.S = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.U = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("clName");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.V = stringExtra2;
                String stringExtra3 = getIntent().getStringExtra("fatherName");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.W = stringExtra3;
                this.X = String.valueOf(getIntent().getStringExtra("address"));
                this.Z = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.f7868a0 = String.valueOf(getIntent().getStringExtra("validity"));
                this.Y = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra4 = getIntent().getStringExtra("clPhoto");
                cm.l.d(stringExtra4, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra4;
                p0 p0Var2 = this.G;
                if (p0Var2 == null) {
                    cm.l.v("mBinding");
                    p0Var2 = null;
                }
                p0Var2.F.f25961g.setText(R1().i());
                p0 p0Var3 = this.G;
                if (p0Var3 == null) {
                    cm.l.v("mBinding");
                    p0Var3 = null;
                }
                p0Var3.A.setText("CL No. : " + this.Q);
            } catch (Exception unused) {
            }
        }
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            q qVar = this.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str = this.J;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            String str2 = this.K;
            if (str2 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            }
            qVar.g(str, str2);
        } else {
            Toast.makeText(getApplicationContext(), P1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        q qVar2 = this.H;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.n().g(this, new i(new a(this)));
        p0 p0Var4 = this.G;
        if (p0Var4 == null) {
            cm.l.v("mBinding");
            p0Var4 = null;
        }
        p0Var4.V.setLayoutManager(new LinearLayoutManager(this));
        p0 p0Var5 = this.G;
        if (p0Var5 == null) {
            cm.l.v("mBinding");
            p0Var5 = null;
        }
        p0Var5.V.setHasFixedSize(true);
        p0 p0Var6 = this.G;
        if (p0Var6 == null) {
            cm.l.v("mBinding");
            p0Var6 = null;
        }
        p0Var6.f27912w.setOnClickListener(new p9.t0(this));
        p0 p0Var7 = this.G;
        if (p0Var7 == null) {
            cm.l.v("mBinding");
        } else {
            p0Var = p0Var7;
        }
        p0Var.f27913x.setOnClickListener(new u0(this));
    }

    /* access modifiers changed from: private */
    public static final void U1(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        p0 p0Var = clDocumentsUpload.G;
        p0 p0Var2 = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.f27912w.setVisibility(8);
        p0 p0Var3 = clDocumentsUpload.G;
        if (p0Var3 == null) {
            cm.l.v("mBinding");
            p0Var3 = null;
        }
        p0Var3.f27913x.setVisibility(0);
        p0 p0Var4 = clDocumentsUpload.G;
        if (p0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            p0Var2 = p0Var4;
        }
        p0Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void V1(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        p0 p0Var = clDocumentsUpload.G;
        p0 p0Var2 = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.f27913x.setVisibility(8);
        p0 p0Var3 = clDocumentsUpload.G;
        if (p0Var3 == null) {
            cm.l.v("mBinding");
            p0Var3 = null;
        }
        p0Var3.f27912w.setVisibility(0);
        p0 p0Var4 = clDocumentsUpload.G;
        if (p0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            p0Var2 = p0Var4;
        }
        p0Var2.H.setVisibility(8);
    }

    private final void W1() {
        p0 p0Var = this.G;
        q qVar = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.K.o();
        q qVar2 = this.H;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.k().g(this, new i(new b(this)));
        q qVar3 = this.H;
        if (qVar3 == null) {
            cm.l.v("viewModel");
            qVar3 = null;
        }
        qVar3.j().g(this, new i(new c(this)));
        q qVar4 = this.H;
        if (qVar4 == null) {
            cm.l.v("viewModel");
            qVar4 = null;
        }
        qVar4.l().g(this, new i(new d(this)));
        q qVar5 = this.H;
        if (qVar5 == null) {
            cm.l.v("viewModel");
            qVar5 = null;
        }
        qVar5.q().g(this, new i(new e(this)));
        q qVar6 = this.H;
        if (qVar6 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar6;
        }
        qVar.o().g(this, new i(new f(this)));
    }

    /* access modifiers changed from: private */
    public final void X1(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) it.next();
                    String remarks = insertedDocBeanItem != null ? insertedDocBeanItem.getRemarks() : null;
                    if (remarks == null || remarks.length() == 0) {
                        for (DocumentListItem documentListItem : this.P) {
                            if (!(documentListItem == null || insertedDocBeanItem == null)) {
                                try {
                                    if (p.o(documentListItem.getId(), String.valueOf(insertedDocBeanItem.getDocCode()), true)) {
                                        documentListItem.setProofCode(String.valueOf(insertedDocBeanItem.getProofCode()));
                                        documentListItem.setDocCode(String.valueOf(insertedDocBeanItem.getDocCode()));
                                        documentListItem.setDocName(insertedDocBeanItem.getDocName());
                                        documentListItem.setProofName(insertedDocBeanItem.getProofName());
                                        documentListItem.setFileNmae(insertedDocBeanItem.getFileNmae());
                                        documentListItem.setDocURL(insertedDocBeanItem.getDocURL());
                                        documentListItem.setDocNo(insertedDocBeanItem.getDocNo());
                                        documentListItem.setIssueAuthDesg(insertedDocBeanItem.getIssueAuthDesg());
                                        documentListItem.setIssueDate(insertedDocBeanItem.getIssueDate());
                                        documentListItem.setContactNo(insertedDocBeanItem.getContactNo());
                                        documentListItem.setDocInsertedStatus(true);
                                        documentListItem.setReuploaded(insertedDocBeanItem.getReuploaded());
                                        documentListItem.setVerifyStatus(insertedDocBeanItem.getVerifyStatus());
                                        documentListItem.setDocStatus(insertedDocBeanItem.getDocStatus());
                                        documentListItem.setPutUpCase(insertedDocBeanItem.getPutUpCase());
                                        documentListItem.setRemarks(insertedDocBeanItem.getRemarks());
                                        documentListItem.setDocseqNo(String.valueOf(insertedDocBeanItem.getDocseqNo()));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                return;
            }
        }
        S1(this.P);
        v2();
    }

    private final boolean Y1() {
        for (DocumentListItem documentListItem : this.P) {
            if (documentListItem != null && documentListItem.isBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void Z1() {
        p0 p0Var = this.G;
        p0 p0Var2 = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.U.setOnClickListener(new c1(this));
        p0 p0Var3 = this.G;
        if (p0Var3 == null) {
            cm.l.v("mBinding");
            p0Var3 = null;
        }
        p0Var3.F.f25959e.setOnClickListener(new d1(this));
        p0 p0Var4 = this.G;
        if (p0Var4 == null) {
            cm.l.v("mBinding");
            p0Var4 = null;
        }
        p0Var4.F.f25957c.setOnClickListener(new r0());
        p0 p0Var5 = this.G;
        if (p0Var5 == null) {
            cm.l.v("mBinding");
        } else {
            p0Var2 = p0Var5;
        }
        p0Var2.L.setOnClickListener(new s0(this));
    }

    /* access modifiers changed from: private */
    public static final void a2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        if (!(!clDocumentsUpload.P.isEmpty()) || !clDocumentsUpload.Y1()) {
            clDocumentsUpload.l2(clDocumentsUpload.P1().b("label_attach_document", clDocumentsUpload.getString(R.string.attach_doc)));
            return;
        }
        p0 p0Var = clDocumentsUpload.G;
        String str = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.U.c(true);
        if (com.nic.mparivahan.a.f9624a.a(clDocumentsUpload)) {
            q qVar = clDocumentsUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = clDocumentsUpload.M;
            if (str2 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str = str2;
            }
            qVar.s(str, clDocumentsUpload.P);
            return;
        }
        Toast.makeText(clDocumentsUpload.getApplicationContext(), clDocumentsUpload.P1().b("label_log_check_internet", clDocumentsUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void b2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        clDocumentsUpload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void c2(View view) {
    }

    /* access modifiers changed from: private */
    public static final void d2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(clDocumentsUpload)) {
            p0 p0Var = clDocumentsUpload.G;
            String str = null;
            if (p0Var == null) {
                cm.l.v("mBinding");
                p0Var = null;
            }
            p0Var.L.c(true);
            q qVar = clDocumentsUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = clDocumentsUpload.J;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            String str3 = clDocumentsUpload.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str = str3;
            }
            qVar.h(str2, str);
            return;
        }
        Toast.makeText(clDocumentsUpload.getApplicationContext(), clDocumentsUpload.P1().b("label_log_check_internet", clDocumentsUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    private final void e2() {
        try {
            p0 p0Var = this.G;
            p0 p0Var2 = null;
            if (p0Var == null) {
                cm.l.v("mBinding");
                p0Var = null;
            }
            p0Var.I.f29580g.setText(R1().i());
            p0 p0Var3 = this.G;
            if (p0Var3 == null) {
                cm.l.v("mBinding");
                p0Var3 = null;
            }
            TextView textView = p0Var3.I.f29581h;
            p0 p0Var4 = this.G;
            if (p0Var4 == null) {
                cm.l.v("mBinding");
                p0Var4 = null;
            }
            textView.setPaintFlags(p0Var4.I.f29581h.getPaintFlags() | 8);
            if (cm.l.a(R1().b(), "551")) {
                p0 p0Var5 = this.G;
                if (p0Var5 == null) {
                    cm.l.v("mBinding");
                    p0Var5 = null;
                }
                p0Var5.I.f29581h.setVisibility(8);
            } else {
                p0 p0Var6 = this.G;
                if (p0Var6 == null) {
                    cm.l.v("mBinding");
                    p0Var6 = null;
                }
                p0Var6.I.f29581h.setVisibility(0);
            }
            p0 p0Var7 = this.G;
            if (p0Var7 == null) {
                cm.l.v("mBinding");
                p0Var7 = null;
            }
            p0Var7.I.f29581h.setText(q.B0(String.valueOf(this.Q)).toString());
            p0 p0Var8 = this.G;
            if (p0Var8 == null) {
                cm.l.v("mBinding");
            } else {
                p0Var2 = p0Var8;
            }
            p0Var2.I.f29581h.setOnClickListener(new y0(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void f2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        if (!cm.l.a(clDocumentsUpload.R1().b(), "551")) {
            try {
                Intent intent = new Intent(clDocumentsUpload, ClDetailsTop.class);
                intent.putExtra("dlValue", clDocumentsUpload.Q);
                intent.putExtra("dobValue", clDocumentsUpload.R);
                intent.putExtra("fatherName", clDocumentsUpload.W);
                intent.putExtra("clName", clDocumentsUpload.V);
                intent.putExtra("clPhoto", clDocumentsUpload.T);
                intent.putExtra("address", clDocumentsUpload.X).toString();
                intent.putExtra("issuing_authority", clDocumentsUpload.Z).toString();
                intent.putExtra("validity", clDocumentsUpload.f7868a0).toString();
                intent.putExtra("cl_Status", clDocumentsUpload.Y).toString();
                clDocumentsUpload.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        clDocumentsUpload.finish();
    }

    /* access modifiers changed from: private */
    public static final void i2(ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(clDocumentsUpload, "this$0");
        clDocumentsUpload.finish();
    }

    private final void j2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new a1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void k2(Dialog dialog, ClDocumentsUpload clDocumentsUpload, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clDocumentsUpload, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(clDocumentsUpload, DashBoard.class);
        intent.setFlags(67108864);
        clDocumentsUpload.startActivity(intent);
        clDocumentsUpload.finish();
    }

    /* access modifiers changed from: private */
    public final void l2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(str);
        ((TextView) findViewById2).setOnClickListener(new z0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void m2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void o2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void s2(boolean z10) {
        if (z10) {
            try {
                this.f7870c0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f7870c0;
        if (t0Var == null) {
            return;
        }
        if (z10) {
            t0Var.b();
        } else {
            t0Var.a();
        }
    }

    /* access modifiers changed from: private */
    public final void u2(List list) {
        Integer num;
        String str;
        String str2;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                num = null;
                break;
            }
            Object obj = list.get(i10);
            cm.l.c(obj);
            if (cm.l.a(((ApplFlowStatusListItem) obj).getStatus(), "Pending")) {
                Object obj2 = list.get(i10);
                cm.l.c(obj2);
                Integer acCd = ((ApplFlowStatusListItem) obj2).getAcCd();
                if (acCd != null && acCd.intValue() == 455) {
                }
            }
            i10++;
        }
        Object obj3 = list.get(i10);
        cm.l.c(obj3);
        num = ((ApplFlowStatusListItem) obj3).getAcCd();
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
            return;
        }
        try {
            DlLogUpdate.a aVar = DlLogUpdate.f8706k;
            String str3 = this.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.J;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str4 = null;
            }
            long parseLong = Long.parseLong(str4);
            int parseInt = Integer.parseInt(Q1().k());
            String str5 = this.R;
            cm.l.c(str5);
            String str6 = this.Q;
            cm.l.c(str6);
            String str7 = this.M;
            if (str7 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2);
        } catch (Exception unused) {
        }
        g2(num);
    }

    /* access modifiers changed from: private */
    public final void v2() {
        try {
            if (this.P.size() > 0) {
                List t02 = y.t0(y.x0(this.P));
                this.P.clear();
                this.P.addAll(t02);
            }
            p0 p0Var = this.G;
            p0 p0Var2 = null;
            if (p0Var == null) {
                cm.l.v("mBinding");
                p0Var = null;
            }
            p0Var.K.p();
            p0 p0Var3 = this.G;
            if (p0Var3 == null) {
                cm.l.v("mBinding");
                p0Var3 = null;
            }
            p0Var3.K.setVisibility(8);
            Application application = getApplication();
            cm.l.e(application, "getApplication(...)");
            this.I = new a(this, application, this.P, this);
            p0 p0Var4 = this.G;
            if (p0Var4 == null) {
                cm.l.v("mBinding");
                p0Var4 = null;
            }
            RecyclerView recyclerView = p0Var4.V;
            a aVar = this.I;
            if (aVar == null) {
                cm.l.v("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            p0 p0Var5 = this.G;
            if (p0Var5 == null) {
                cm.l.v("mBinding");
                p0Var5 = null;
            }
            p0Var5.f27915z.setVisibility(0);
            ArrayList arrayList = this.f7871d0;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.f7871d0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = (Integer) this.f7871d0.get(i10);
                    String valueOf = num != null ? String.valueOf(num) : null;
                    int size2 = this.P.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (i11 < this.P.size()) {
                            DocumentListItem documentListItem = (DocumentListItem) this.P.get(i11);
                            if (cm.l.a(valueOf, String.valueOf(documentListItem != null ? documentListItem.getId() : null))) {
                                a aVar2 = this.I;
                                if (aVar2 == null) {
                                    cm.l.v("adapter");
                                    aVar2 = null;
                                }
                                aVar2.Z(i11);
                            }
                        }
                    }
                }
                if (this.P.size() > 0) {
                    p0 p0Var6 = this.G;
                    if (p0Var6 == null) {
                        cm.l.v("mBinding");
                    } else {
                        p0Var2 = p0Var6;
                    }
                    p0Var2.f27915z.setVisibility(0);
                    return;
                }
                p0 p0Var7 = this.G;
                if (p0Var7 == null) {
                    cm.l.v("mBinding");
                } else {
                    p0Var2 = p0Var7;
                }
                p0Var2.f27915z.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    private final void w2() {
        try {
            Intent intent = new Intent(this, ClDocumentsUpload.class);
            String str = this.J;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.U);
            String str4 = this.M;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("fatherName", this.W);
            intent.putExtra("clName", this.V);
            intent.putExtra("clPhoto", this.T);
            intent.putExtra("address", this.X).toString();
            intent.putExtra("issuing_authority", this.Z).toString();
            intent.putExtra("validity", this.f7868a0).toString();
            intent.putExtra("cl_Status", this.Y).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void x2() {
        try {
            Intent intent = new Intent(this, ClFeePayment.class);
            String str = this.J;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.U);
            String str4 = this.M;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("fatherName", this.W);
            intent.putExtra("clName", this.V);
            intent.putExtra("clPhoto", this.T);
            intent.putExtra("address", this.X).toString();
            intent.putExtra("issuing_authority", this.Z).toString();
            intent.putExtra("validity", this.f7868a0).toString();
            intent.putExtra("cl_Status", this.Y).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void y2(ClDocumentsUpload clDocumentsUpload, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(clDocumentsUpload, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                a aVar2 = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = clDocumentsUpload.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(clDocumentsUpload.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                File file = new File(oi.h.b(clDocumentsUpload, data));
                DocumentListItem documentListItem = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(data);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(file.getName());
                }
                String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                if (f10 != null) {
                    DocumentListItem documentListItem4 = (DocumentListItem) clDocumentsUpload.P.get(clDocumentsUpload.f7874g0);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(f10);
                    }
                }
                a aVar3 = clDocumentsUpload.I;
                if (aVar3 == null) {
                    cm.l.v("adapter");
                } else {
                    aVar2 = aVar3;
                }
                aVar2.k(clDocumentsUpload.f7874g0);
            } else if (d10 == 64) {
                clDocumentsUpload.s2(false);
                Toast.makeText(clDocumentsUpload, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            clDocumentsUpload.s2(false);
        } catch (Exception unused) {
        }
    }

    private final void z2() {
        try {
            Intent intent = new Intent(this, ClPhotoSignature.class);
            String str = this.J;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.U);
            String str4 = this.M;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("fatherName", this.W);
            intent.putExtra("clName", this.V);
            intent.putExtra("clPhoto", this.T);
            intent.putExtra("address", this.X).toString();
            intent.putExtra("issuing_authority", this.Z).toString();
            intent.putExtra("validity", this.f7868a0).toString();
            intent.putExtra("cl_Status", this.Y).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final ArrayList N1() {
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

    public final ld.c P1() {
        ld.c cVar = this.f7872e0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g Q1() {
        ld.g gVar = this.f7869b0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ld.f R1() {
        ld.f fVar = this.f7873f0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public void a(int i10) {
        DocumentListItem documentListItem = (DocumentListItem) this.P.get(i10);
        if (documentListItem != null) {
            documentListItem.setBrowseStatus(false);
        }
        DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
        a aVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI((Uri) null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(i10);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        a aVar2 = this.I;
        if (aVar2 == null) {
            cm.l.v("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.k(i10);
    }

    public void b(int i10, DocumentListItem documentListItem) {
        cm.l.f(documentListItem, "item");
        this.f7874g0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.f7876i0.a("*/*");
        }
    }

    public void c(int i10, DocumentListItem documentListItem) {
        a.C0223a i11;
        l hVar;
        cm.l.f(documentListItem, "item");
        this.f7874g0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f7874g0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.b.f22373a.a(this)) {
            i11 = t2.a.f16505a.b(this).e().f(600).i();
            hVar = new h(this);
        } else if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            i11 = t2.a.f16505a.b(this).e().f(600).i();
            hVar = new g(this);
        } else {
            return;
        }
        i11.h(hVar);
    }

    public final void g2(Integer num) {
        if (num != null && num.intValue() == 135) {
            z2();
        } else if (num != null && num.intValue() == 134) {
            x2();
        } else if (num != null && num.intValue() == 123) {
            w2();
        } else if (num != null && num.intValue() == 371) {
            A2();
        } else if (num != null && num.intValue() == 455) {
            j2(P1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void n2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.doc_uploading_diloge_ui);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Window window2 = dialog.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.windowAnimations = R.style.PauseDialogAnimation;
        }
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(P1().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new b1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_cl_documents_upload);
        cm.l.e(f10, "setContentView(...)");
        this.G = (p0) f10;
        this.H = (q) new androidx.lifecycle.u0(this).a(q.class);
        p0 p0Var = this.G;
        p0 p0Var2 = null;
        if (p0Var == null) {
            cm.l.v("mBinding");
            p0Var = null;
        }
        p0Var.v(this);
        r2(new ld.g(this));
        q2(new ld.c(this));
        t2(new ld.f(this));
        p2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        T1();
        W1();
        Z1();
        e2();
        p0 p0Var3 = this.G;
        if (p0Var3 == null) {
            cm.l.v("mBinding");
            p0Var3 = null;
        }
        p0Var3.I.f29577d.setOnClickListener(new q0(this));
        p0 p0Var4 = this.G;
        if (p0Var4 == null) {
            cm.l.v("mBinding");
        } else {
            p0Var2 = p0Var4;
        }
        p0Var2.F.f25959e.setOnClickListener(new v0(this));
    }

    public final void p2(String[] strArr) {
        cm.l.f(strArr, "<set-?>");
        this.O = strArr;
    }

    public final void q2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f7872e0 = cVar;
    }

    public final void r2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f7869b0 = gVar;
    }

    public final void t2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f7873f0 = fVar;
    }
}
