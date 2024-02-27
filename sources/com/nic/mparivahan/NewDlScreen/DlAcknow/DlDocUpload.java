package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.NewDlScreen.DlAcknow.a;
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
import gc.i;
import gc.j;
import gc.k;
import gc.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ni.h2;
import nj.q;
import pl.x;

public final class DlDocUpload extends androidx.appcompat.app.d implements a.C0120a {
    /* access modifiers changed from: private */
    public h2 G;
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
    public ld.g V;
    private t0 W;
    /* access modifiers changed from: private */
    public ArrayList X = new ArrayList();
    public ld.c Y;
    private int Z = -1;
    /* access modifiers changed from: private */

    /* renamed from: a0  reason: collision with root package name */
    public final d.c f9292a0;

    /* renamed from: b0  reason: collision with root package name */
    private d.c f9293b0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocUpload f9294e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlDocUpload dlDocUpload) {
            super(1);
            this.f9294e = dlDocUpload;
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r1 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0050
                java.lang.String r4 = r0.getOmOfficecd()     // Catch:{ Exception -> 0x019d }
                goto L_0x0051
            L_0x0050:
                r4 = r3
            L_0x0051:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x019d }
                r1.M = r4     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r1 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0061
                java.lang.String r0 = r0.getOmStCode()     // Catch:{ Exception -> 0x019d }
                goto L_0x0062
            L_0x0061:
                r0 = r3
            L_0x0062:
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x019d }
                r1.L = r0     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "mBinding"
                if (r0 != 0) goto L_0x0077
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0077:
                android.widget.TextView r0 = r0.f26600y     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r4 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                java.lang.String r4 = r4.J     // Catch:{ Exception -> 0x019d }
                java.lang.String r5 = "mApplNo"
                if (r4 != 0) goto L_0x0087
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x0087:
                r0.setText(r4)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x0096
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0096:
                android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r4 = r7.f9294e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r4 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ni.h2 r4 = r4.G     // Catch:{ Exception -> 0x019d }
                if (r4 != 0) goto L_0x00c9
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x00c9:
                android.widget.TextView r4 = r4.B     // Catch:{ Exception -> 0x019d }
                r4.setText(r0)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r8 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.J     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x011c
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x011c:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r8 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.L     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = "mApplStateCd"
                if (r8 != 0) goto L_0x0130
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x0130:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.a$a r8 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r1 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                boolean r8 = r8.a(r1)     // Catch:{ Exception -> 0x019d }
                if (r8 == 0) goto L_0x017b
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r8 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                nj.q r8 = r8.H     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x014e
                java.lang.String r8 = "viewModel"
                cm.l.v(r8)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x014e:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r1 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = r1.J     // Catch:{ Exception -> 0x019d }
                if (r1 != 0) goto L_0x015a
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r1 = r3
            L_0x015a:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r2 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x019d }
                if (r2 != 0) goto L_0x0166
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r2 = r3
            L_0x0166:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r8 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                ld.c r0 = r0.M1()     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "label_log_check_internet"
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r3 = r7.f9294e     // Catch:{ Exception -> 0x019d }
                r4 = 2132018237(0x7f14043d, float:1.9674775E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = r0.b(r1, r3)     // Catch:{ Exception -> 0x019d }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)     // Catch:{ Exception -> 0x019d }
                r8.show()     // Catch:{ Exception -> 0x019d }
            L_0x019d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload.a.b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocUpload f9295e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlDocUpload dlDocUpload) {
            super(1);
            this.f9295e = dlDocUpload;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                            this.f9295e.r2(uploadDocListResponse.getDocumentList());
                        }
                    }
                }
                q z12 = this.f9295e.H;
                String str = null;
                if (z12 == null) {
                    cm.l.v("viewModel");
                    z12 = null;
                }
                String u12 = this.f9295e.J;
                if (u12 == null) {
                    cm.l.v("mApplNo");
                    u12 = null;
                }
                String v12 = this.f9295e.L;
                if (v12 == null) {
                    cm.l.v("mApplStateCd");
                    v12 = null;
                }
                String x12 = this.f9295e.N;
                if (x12 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = x12;
                }
                z12.i(u12, v12, str);
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
        final /* synthetic */ DlDocUpload f9296e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlDocUpload dlDocUpload) {
            super(1);
            this.f9296e = dlDocUpload;
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
                                q z12 = this.f9296e.H;
                                if (z12 == null) {
                                    cm.l.v("viewModel");
                                    z12 = null;
                                }
                                String u12 = this.f9296e.J;
                                if (u12 == null) {
                                    cm.l.v("mApplNo");
                                    u12 = null;
                                }
                                String v12 = this.f9296e.L;
                                if (v12 == null) {
                                    cm.l.v("mApplStateCd");
                                } else {
                                    str = v12;
                                }
                                z12.p(u12, str);
                                return;
                            }
                            Collection dCodes = uploadDocListResponse.getDCodes();
                            if (dCodes != null) {
                                if (!dCodes.isEmpty()) {
                                    for (Integer add : uploadDocListResponse.getDCodes()) {
                                        this.f9296e.X.add(add);
                                    }
                                }
                            }
                            this.f9296e.J1(uploadDocListResponse.getDocumentList());
                            return;
                        }
                    }
                }
                h2 w12 = this.f9296e.G;
                if (w12 == null) {
                    cm.l.v("mBinding");
                    w12 = null;
                }
                w12.T.setVisibility(8);
                DlDocUpload dlDocUpload = this.f9296e;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                if (responseBean2 != null) {
                    str = responseBean2.getDeveloperMessage();
                }
                dlDocUpload.d2(str);
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
        final /* synthetic */ DlDocUpload f9297e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlDocUpload dlDocUpload) {
            super(1);
            this.f9297e = dlDocUpload;
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
                                this.f9297e.m2();
                                return;
                            } else {
                                this.f9297e.T1(insertedUploadDocResponse.getInsertedDocBean());
                                return;
                            }
                        }
                    }
                }
                DlDocUpload dlDocUpload = this.f9297e;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                dlDocUpload.d2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
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
        final /* synthetic */ DlDocUpload f9298e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlDocUpload dlDocUpload) {
            super(1);
            this.f9298e = dlDocUpload;
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x00b8 }
                r1 = 0
                if (r0 != 0) goto L_0x000f
                java.lang.String r0 = "mBinding"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00b8 }
                r0 = r1
            L_0x000f:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.T     // Catch:{ Exception -> 0x00b8 }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r5 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00b8 }
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x005e
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r5 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                r5.clear()     // Catch:{ Exception -> 0x00b8 }
            L_0x005e:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r5 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                nj.q r5 = r5.H     // Catch:{ Exception -> 0x00b8 }
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x00b8 }
                r5 = r1
            L_0x006c:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r0 = r0.J     // Catch:{ Exception -> 0x00b8 }
                if (r0 != 0) goto L_0x007a
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00b8 }
                r0 = r1
            L_0x007a:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r2 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x00b8 }
                if (r2 != 0) goto L_0x0088
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x00b8 }
                r2 = r1
            L_0x0088:
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r3 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
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
                com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload r0 = r4.f9298e     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.util.List r5 = r5.getResponses()     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00b8 }
                r1 = r5
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r1     // Catch:{ Exception -> 0x00b8 }
            L_0x00ae:
                cm.l.c(r1)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r5 = r1.getDeveloperMessage()     // Catch:{ Exception -> 0x00b8 }
                r0.d2(r5)     // Catch:{ Exception -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload.e.b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadedDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocUpload f9299e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlDocUpload dlDocUpload) {
            super(1);
            this.f9299e = dlDocUpload;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                h2 w12 = this.f9299e.G;
                if (w12 == null) {
                    cm.l.v("mBinding");
                    w12 = null;
                }
                w12.K.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f9299e.l2(applStatusDetailsItem.getApplFlowStatusList());
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
        final /* synthetic */ DlDocUpload f9300e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DlDocUpload dlDocUpload) {
            super(1);
            this.f9300e = dlDocUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9300e.f9292a0.a(intent);
            this.f9300e.k2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9301a;

        h(l lVar) {
            cm.l.f(lVar, "function");
            this.f9301a = lVar;
        }

        public final pl.c a() {
            return this.f9301a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9301a.invoke(obj);
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

    public DlDocUpload() {
        d.c y02 = y0(new e.d(), new j(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f9292a0 = y02;
        d.c y03 = y0(new e.b(), new k(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f9293b0 = y03;
    }

    /* access modifiers changed from: private */
    public final void J1(List list) {
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
        Toast.makeText(getApplicationContext(), M1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void L1(DlDocUpload dlDocUpload, Uri uri) {
        cm.l.f(dlDocUpload, "this$0");
        if (uri != null) {
            try {
                String q10 = com.nic.mparivahan.dlservices.utilities.e.q(dlDocUpload, uri);
                String r10 = com.nic.mparivahan.dlservices.utilities.e.r(dlDocUpload, uri);
                if (dlDocUpload.K1().contains(q.B0(r10).toString())) {
                    DocumentListItem documentListItem = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                    if (documentListItem != null) {
                        documentListItem.setBrowseStatus(true);
                    }
                    DocumentListItem documentListItem2 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                    if (documentListItem2 != null) {
                        documentListItem2.setURI(uri);
                    }
                    DocumentListItem documentListItem3 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                    if (documentListItem3 != null) {
                        documentListItem3.setFileNmae(q10);
                    }
                    boolean o10 = p.o(q.B0(r10).toString(), "pdf", true);
                    a aVar = null;
                    if (o10) {
                        String a10 = com.nic.mparivahan.dlservices.utilities.e.a(dlDocUpload, uri);
                        Log.e("log", a10);
                        DocumentListItem documentListItem4 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                        if (documentListItem4 != null) {
                            documentListItem4.setFileToUpload(a10);
                        }
                        DocumentListItem documentListItem5 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                        Log.e("log2", String.valueOf(documentListItem5 != null ? documentListItem5.getFileToUpload() : null));
                    } else {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(dlDocUpload.getContentResolver(), uri);
                        cm.l.c(bitmap);
                        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                        DocumentListItem documentListItem6 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                        if (documentListItem6 != null) {
                            documentListItem6.setFileToUpload(f10);
                        }
                    }
                    a aVar2 = dlDocUpload.I;
                    if (aVar2 == null) {
                        cm.l.v("adapter");
                    } else {
                        aVar = aVar2;
                    }
                    aVar.k(dlDocUpload.Z);
                    return;
                }
                dlDocUpload.d2(dlDocUpload.M1().b("upload_file_types", dlDocUpload.getString(R.string.you_can_upload)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void O1(java.util.ArrayList r7) {
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
            ld.c r7 = r6.M1()
            r0 = 2132017671(0x7f140207, float:1.9673627E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.f2(r6, r7)
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
            ni.h2 r7 = r6.G
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L_0x007d
            cm.l.v(r0)
            r7 = r4
        L_0x007d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.T
            r1 = 8
            r7.setVisibility(r1)
            ni.h2 r7 = r6.G
            if (r7 != 0) goto L_0x008c
            cm.l.v(r0)
            goto L_0x008d
        L_0x008c:
            r4 = r7
        L_0x008d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r4.K
            r7.setVisibility(r3)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload.O1(java.util.ArrayList):void");
    }

    private final void P1() {
        ld.f fVar = new ld.f(this);
        h2 h2Var = null;
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
                h2 h2Var2 = this.G;
                if (h2Var2 == null) {
                    cm.l.v("mBinding");
                    h2Var2 = null;
                }
                h2Var2.F.f25961g.setText(fVar.i());
                h2 h2Var3 = this.G;
                if (h2Var3 == null) {
                    cm.l.v("mBinding");
                    h2Var3 = null;
                }
                h2Var3.A.setText(M1().b("dl_no", "DL No. : ") + " : " + this.Q);
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
            Toast.makeText(getApplicationContext(), M1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        q qVar2 = this.H;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.n().g(this, new h(new a(this)));
        h2 h2Var4 = this.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
            h2Var4 = null;
        }
        h2Var4.U.setLayoutManager(new LinearLayoutManager(this));
        h2 h2Var5 = this.G;
        if (h2Var5 == null) {
            cm.l.v("mBinding");
            h2Var5 = null;
        }
        h2Var5.U.setHasFixedSize(true);
        h2 h2Var6 = this.G;
        if (h2Var6 == null) {
            cm.l.v("mBinding");
            h2Var6 = null;
        }
        h2Var6.f26598w.setOnClickListener(new gc.l(this));
        h2 h2Var7 = this.G;
        if (h2Var7 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var = h2Var7;
        }
        h2Var.f26599x.setOnClickListener(new gc.m(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        h2 h2Var = dlDocUpload.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.f26598w.setVisibility(8);
        h2 h2Var3 = dlDocUpload.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.f26599x.setVisibility(0);
        h2 h2Var4 = dlDocUpload.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var4;
        }
        h2Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void R1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        h2 h2Var = dlDocUpload.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.f26599x.setVisibility(8);
        h2 h2Var3 = dlDocUpload.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.f26598w.setVisibility(0);
        h2 h2Var4 = dlDocUpload.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var4;
        }
        h2Var2.H.setVisibility(8);
    }

    private final void S1() {
        h2 h2Var = this.G;
        q qVar = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.J.o();
        q qVar2 = this.H;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.k().g(this, new h(new b(this)));
        q qVar3 = this.H;
        if (qVar3 == null) {
            cm.l.v("viewModel");
            qVar3 = null;
        }
        qVar3.j().g(this, new h(new c(this)));
        q qVar4 = this.H;
        if (qVar4 == null) {
            cm.l.v("viewModel");
            qVar4 = null;
        }
        qVar4.l().g(this, new h(new d(this)));
        q qVar5 = this.H;
        if (qVar5 == null) {
            cm.l.v("viewModel");
            qVar5 = null;
        }
        qVar5.q().g(this, new h(new e(this)));
        q qVar6 = this.H;
        if (qVar6 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar6;
        }
        qVar.o().g(this, new h(new f(this)));
    }

    /* access modifiers changed from: private */
    public final void T1(List list) {
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
        O1(this.P);
        m2();
    }

    private final boolean U1() {
        for (DocumentListItem documentListItem : this.P) {
            if (documentListItem != null && documentListItem.isBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void V1() {
        h2 h2Var = this.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.T.setOnClickListener(new gc.d(this));
        h2 h2Var3 = this.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.F.f25959e.setOnClickListener(new gc.f(this));
        h2 h2Var4 = this.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
            h2Var4 = null;
        }
        h2Var4.F.f25957c.setOnClickListener(new gc.g(this));
        h2 h2Var5 = this.G;
        if (h2Var5 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var5;
        }
        h2Var2.K.setOnClickListener(new gc.h(this));
    }

    /* access modifiers changed from: private */
    public static final void W1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        if (!(!dlDocUpload.P.isEmpty()) || !dlDocUpload.U1()) {
            dlDocUpload.d2(dlDocUpload.M1().b("label_attach_document", dlDocUpload.getString(R.string.attach_doc)));
            return;
        }
        h2 h2Var = dlDocUpload.G;
        String str = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.T.c(true);
        if (com.nic.mparivahan.a.f9624a.a(dlDocUpload)) {
            q qVar = dlDocUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = dlDocUpload.M;
            if (str2 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str = str2;
            }
            qVar.s(str, dlDocUpload.P);
            return;
        }
        Toast.makeText(dlDocUpload.getApplicationContext(), dlDocUpload.M1().b("label_log_check_internet", dlDocUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void X1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        dlDocUpload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void Y1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        Intent intent = new Intent(dlDocUpload, DashBoard.class);
        intent.setFlags(67108864);
        dlDocUpload.startActivity(intent);
        dlDocUpload.finish();
    }

    /* access modifiers changed from: private */
    public static final void Z1(DlDocUpload dlDocUpload, View view) {
        cm.l.f(dlDocUpload, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlDocUpload)) {
            h2 h2Var = dlDocUpload.G;
            String str = null;
            if (h2Var == null) {
                cm.l.v("mBinding");
                h2Var = null;
            }
            h2Var.K.c(true);
            q qVar = dlDocUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = dlDocUpload.J;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            String str3 = dlDocUpload.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str = str3;
            }
            qVar.h(str2, str);
            return;
        }
        Toast.makeText(dlDocUpload.getApplicationContext(), dlDocUpload.M1().b("label_log_check_internet", dlDocUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    private final void b2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new i(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, DlDocUpload dlDocUpload, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlDocUpload, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlDocUpload, DashBoard.class);
        intent.setFlags(67108864);
        dlDocUpload.startActivity(intent);
        dlDocUpload.finish();
    }

    /* access modifiers changed from: private */
    public final void d2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new n(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void k2(boolean z10) {
        if (z10) {
            try {
                this.W = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.W;
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
    public final void l2(List list) {
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
            int parseInt = Integer.parseInt(N1().k());
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
        a2(num);
    }

    /* access modifiers changed from: private */
    public final void m2() {
        try {
            if (this.P.size() > 0) {
                List t02 = y.t0(y.x0(this.P));
                this.P.clear();
                this.P.addAll(t02);
            }
            h2 h2Var = this.G;
            h2 h2Var2 = null;
            if (h2Var == null) {
                cm.l.v("mBinding");
                h2Var = null;
            }
            h2Var.J.p();
            h2 h2Var3 = this.G;
            if (h2Var3 == null) {
                cm.l.v("mBinding");
                h2Var3 = null;
            }
            h2Var3.J.setVisibility(8);
            Application application = getApplication();
            cm.l.e(application, "getApplication(...)");
            this.I = new a(this, application, this.P, this);
            h2 h2Var4 = this.G;
            if (h2Var4 == null) {
                cm.l.v("mBinding");
                h2Var4 = null;
            }
            RecyclerView recyclerView = h2Var4.U;
            a aVar = this.I;
            if (aVar == null) {
                cm.l.v("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            h2 h2Var5 = this.G;
            if (h2Var5 == null) {
                cm.l.v("mBinding");
                h2Var5 = null;
            }
            h2Var5.f26601z.setVisibility(0);
            ArrayList arrayList = this.X;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.X.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = (Integer) this.X.get(i10);
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
                    h2 h2Var6 = this.G;
                    if (h2Var6 == null) {
                        cm.l.v("mBinding");
                    } else {
                        h2Var2 = h2Var6;
                    }
                    h2Var2.f26601z.setVisibility(0);
                    return;
                }
                h2 h2Var7 = this.G;
                if (h2Var7 == null) {
                    cm.l.v("mBinding");
                } else {
                    h2Var2 = h2Var7;
                }
                h2Var2.f26601z.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    private final void n2() {
        Intent intent = new Intent(this, DlDocUpload.class);
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
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void o2(DlDocUpload dlDocUpload, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlDocUpload, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                a aVar2 = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = dlDocUpload.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlDocUpload.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                File file = new File(oi.h.b(dlDocUpload, data));
                DocumentListItem documentListItem = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(data);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(file.getName());
                }
                String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                if (f10 != null) {
                    DocumentListItem documentListItem4 = (DocumentListItem) dlDocUpload.P.get(dlDocUpload.Z);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(f10);
                    }
                }
                a aVar3 = dlDocUpload.I;
                if (aVar3 == null) {
                    cm.l.v("adapter");
                } else {
                    aVar2 = aVar3;
                }
                aVar2.k(dlDocUpload.Z);
            } else if (d10 == 64) {
                dlDocUpload.k2(false);
                Toast.makeText(dlDocUpload, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlDocUpload.k2(false);
        } catch (Exception unused) {
        }
    }

    private final void p2() {
        Intent intent = new Intent(this, DlPhotoSign.class);
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
        startActivity(intent);
        finish();
    }

    private final void q2() {
        Intent intent = new Intent(this, DlSlots.class);
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
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void r2(List list) {
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

    public final ArrayList K1() {
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

    public final ld.c M1() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g N1() {
        ld.g gVar = this.V;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
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

    public final void a2(Integer num) {
        if ((num != null && num.intValue() == 135) || (num != null && num.intValue() == 134)) {
            p2();
        } else if (num != null && num.intValue() == 123) {
            n2();
        } else if (num != null && num.intValue() == 371) {
            q2();
        } else if (num != null && num.intValue() == 455) {
            b2(M1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public void b(int i10, DocumentListItem documentListItem) {
        cm.l.f(documentListItem, "item");
        this.Z = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.f9293b0.a("*/*");
        }
    }

    public void c(int i10, DocumentListItem documentListItem) {
        cm.l.f(documentListItem, "item");
        this.Z = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.Z);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.e.d(this)) {
            t2.a.f16505a.b(this).e().f(600).i().h(new g(this));
        }
    }

    public final void f2(Context context, String str) {
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
        textView.setText(M1().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new gc.e(dialog));
        dialog.show();
    }

    public final void h2(String[] strArr) {
        cm.l.f(strArr, "<set-?>");
        this.O = strArr;
    }

    public final void i2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final void j2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.V = gVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dl_doc_upload);
        h2 x10 = h2.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        if (x10 == null) {
            cm.l.v("mBinding");
            x10 = null;
        }
        setContentView(x10.m());
        this.H = (q) new u0(this).a(q.class);
        j2(new ld.g(this));
        i2(new ld.c(this));
        h2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        P1();
        S1();
        V1();
    }
}
