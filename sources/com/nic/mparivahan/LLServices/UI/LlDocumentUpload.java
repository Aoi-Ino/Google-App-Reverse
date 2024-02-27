package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.UI.a;
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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ni.o5;
import nj.q;
import pl.x;
import t2.a;
import tb.a1;
import tb.b1;
import tb.c1;
import tb.d1;
import tb.q0;
import tb.r0;
import tb.s0;
import tb.u0;
import tb.v0;
import tb.w0;
import tb.x0;
import tb.y0;
import tb.z0;
import v9.e;

public final class LlDocumentUpload extends androidx.appcompat.app.d implements a.C0119a {
    /* access modifiers changed from: private */
    public o5 G;
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
    public ld.f Z;

    /* renamed from: a0  reason: collision with root package name */
    public FetchLlDetails f9074a0;

    /* renamed from: b0  reason: collision with root package name */
    private int f9075b0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public final d.c f9076c0;

    /* renamed from: d0  reason: collision with root package name */
    private d.c f9077d0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlDocumentUpload f9078e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9078e = llDocumentUpload;
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r1 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0050
                java.lang.String r4 = r0.getOmOfficecd()     // Catch:{ Exception -> 0x019d }
                goto L_0x0051
            L_0x0050:
                r4 = r3
            L_0x0051:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x019d }
                r1.M = r4     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r1 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                if (r0 == 0) goto L_0x0061
                java.lang.String r0 = r0.getOmStCode()     // Catch:{ Exception -> 0x019d }
                goto L_0x0062
            L_0x0061:
                r0 = r3
            L_0x0062:
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x019d }
                r1.L = r0     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ni.o5 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "mBinding"
                if (r0 != 0) goto L_0x0077
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0077:
                android.widget.TextView r0 = r0.f27763y     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r4 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                java.lang.String r4 = r4.J     // Catch:{ Exception -> 0x019d }
                java.lang.String r5 = "mApplNo"
                if (r4 != 0) goto L_0x0087
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x0087:
                r0.setText(r4)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ni.o5 r0 = r0.G     // Catch:{ Exception -> 0x019d }
                if (r0 != 0) goto L_0x0096
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r0 = r3
            L_0x0096:
                android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r4 = r7.f9078e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r4 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ni.o5 r4 = r4.G     // Catch:{ Exception -> 0x019d }
                if (r4 != 0) goto L_0x00c9
                cm.l.v(r1)     // Catch:{ Exception -> 0x019d }
                r4 = r3
            L_0x00c9:
                android.widget.TextView r4 = r4.B     // Catch:{ Exception -> 0x019d }
                r4.setText(r0)     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ni.o5 r0 = r0.G     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ni.o5 r0 = r0.G     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r8 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.J     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x011c
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x011c:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r8 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                java.lang.String r8 = r8.L     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = "mApplStateCd"
                if (r8 != 0) goto L_0x0130
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x0130:
                int r8 = r8.length()     // Catch:{ Exception -> 0x019d }
                if (r8 <= 0) goto L_0x019d
                com.nic.mparivahan.a$a r8 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r1 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                boolean r8 = r8.a(r1)     // Catch:{ Exception -> 0x019d }
                if (r8 == 0) goto L_0x017b
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r8 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                nj.q r8 = r8.H     // Catch:{ Exception -> 0x019d }
                if (r8 != 0) goto L_0x014e
                java.lang.String r8 = "viewModel"
                cm.l.v(r8)     // Catch:{ Exception -> 0x019d }
                r8 = r3
            L_0x014e:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r1 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = r1.J     // Catch:{ Exception -> 0x019d }
                if (r1 != 0) goto L_0x015a
                cm.l.v(r5)     // Catch:{ Exception -> 0x019d }
                r1 = r3
            L_0x015a:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r2 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x019d }
                if (r2 != 0) goto L_0x0166
                cm.l.v(r0)     // Catch:{ Exception -> 0x019d }
                r2 = r3
            L_0x0166:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r8 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x019d }
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                ld.c r0 = r0.P1()     // Catch:{ Exception -> 0x019d }
                java.lang.String r1 = "label_log_check_internet"
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r3 = r7.f9078e     // Catch:{ Exception -> 0x019d }
                r4 = 2132018237(0x7f14043d, float:1.9674775E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x019d }
                java.lang.String r0 = r0.b(r1, r3)     // Catch:{ Exception -> 0x019d }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)     // Catch:{ Exception -> 0x019d }
                r8.show()     // Catch:{ Exception -> 0x019d }
            L_0x019d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.LlDocumentUpload.a.b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlDocumentUpload f9079e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9079e = llDocumentUpload;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                            this.f9079e.D2(uploadDocListResponse.getDocumentList());
                        }
                    }
                }
                q C1 = this.f9079e.H;
                String str = null;
                if (C1 == null) {
                    cm.l.v("viewModel");
                    C1 = null;
                }
                String x12 = this.f9079e.J;
                if (x12 == null) {
                    cm.l.v("mApplNo");
                    x12 = null;
                }
                String y12 = this.f9079e.L;
                if (y12 == null) {
                    cm.l.v("mApplStateCd");
                    y12 = null;
                }
                String A1 = this.f9079e.N;
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
        final /* synthetic */ LlDocumentUpload f9080e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9080e = llDocumentUpload;
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
                                q C1 = this.f9080e.H;
                                if (C1 == null) {
                                    cm.l.v("viewModel");
                                    C1 = null;
                                }
                                String x12 = this.f9080e.J;
                                if (x12 == null) {
                                    cm.l.v("mApplNo");
                                    x12 = null;
                                }
                                String y12 = this.f9080e.L;
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
                                        this.f9080e.X.add(add);
                                    }
                                }
                            }
                            this.f9080e.M1(uploadDocListResponse.getDocumentList());
                            return;
                        }
                    }
                }
                o5 z12 = this.f9080e.G;
                if (z12 == null) {
                    cm.l.v("mBinding");
                    z12 = null;
                }
                z12.U.setVisibility(8);
                LlDocumentUpload llDocumentUpload = this.f9080e;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                if (responseBean2 != null) {
                    str = responseBean2.getDeveloperMessage();
                }
                llDocumentUpload.m2(str);
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
        final /* synthetic */ LlDocumentUpload f9081e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9081e = llDocumentUpload;
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
                                this.f9081e.x2();
                                return;
                            } else {
                                this.f9081e.Y1(insertedUploadDocResponse.getInsertedDocBean());
                                return;
                            }
                        }
                    }
                }
                LlDocumentUpload llDocumentUpload = this.f9081e;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                llDocumentUpload.m2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
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
        final /* synthetic */ LlDocumentUpload f9082e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9082e = llDocumentUpload;
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                ni.o5 r0 = r0.G     // Catch:{ Exception -> 0x00b8 }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r5 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00b8 }
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x005e
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r5 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x00b8 }
                r5.clear()     // Catch:{ Exception -> 0x00b8 }
            L_0x005e:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r5 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                nj.q r5 = r5.H     // Catch:{ Exception -> 0x00b8 }
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x00b8 }
                r5 = r1
            L_0x006c:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r0 = r0.J     // Catch:{ Exception -> 0x00b8 }
                if (r0 != 0) goto L_0x007a
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00b8 }
                r0 = r1
            L_0x007a:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r2 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x00b8 }
                if (r2 != 0) goto L_0x0088
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x00b8 }
                r2 = r1
            L_0x0088:
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r3 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
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
                com.nic.mparivahan.LLServices.UI.LlDocumentUpload r0 = r4.f9082e     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.util.List r5 = r5.getResponses()     // Catch:{ Exception -> 0x00b8 }
                if (r5 == 0) goto L_0x00ae
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00b8 }
                r1 = r5
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r1     // Catch:{ Exception -> 0x00b8 }
            L_0x00ae:
                cm.l.c(r1)     // Catch:{ Exception -> 0x00b8 }
                java.lang.String r5 = r1.getDeveloperMessage()     // Catch:{ Exception -> 0x00b8 }
                r0.m2(r5)     // Catch:{ Exception -> 0x00b8 }
            L_0x00b8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.LlDocumentUpload.e.b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadedDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlDocumentUpload f9083e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9083e = llDocumentUpload;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                o5 z12 = this.f9083e.G;
                if (z12 == null) {
                    cm.l.v("mBinding");
                    z12 = null;
                }
                z12.L.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f9083e.w2(applStatusDetailsItem.getApplFlowStatusList());
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
        final /* synthetic */ LlDocumentUpload f9084e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9084e = llDocumentUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9084e.f9076c0.a(intent);
            this.f9084e.u2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlDocumentUpload f9085e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LlDocumentUpload llDocumentUpload) {
            super(1);
            this.f9085e = llDocumentUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f9085e.f9076c0.a(intent);
            this.f9085e.u2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9086a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f9086a = lVar;
        }

        public final pl.c a() {
            return this.f9086a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9086a.invoke(obj);
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

    public LlDocumentUpload() {
        d.c y02 = y0(new e.d(), new r0(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f9076c0 = y02;
        d.c y03 = y0(new e.b(), new s0(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f9077d0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void A2(LlDocumentUpload llDocumentUpload, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(llDocumentUpload, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                a aVar2 = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = llDocumentUpload.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(llDocumentUpload.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                File file = new File(oi.h.b(llDocumentUpload, data));
                DocumentListItem documentListItem = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(data);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(file.getName());
                }
                String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                if (f10 != null) {
                    DocumentListItem documentListItem4 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(f10);
                    }
                }
                a aVar3 = llDocumentUpload.I;
                if (aVar3 == null) {
                    cm.l.v("adapter");
                } else {
                    aVar2 = aVar3;
                }
                aVar2.k(llDocumentUpload.f9075b0);
            } else if (d10 == 64) {
                llDocumentUpload.u2(false);
                Toast.makeText(llDocumentUpload, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            llDocumentUpload.u2(false);
        } catch (Exception unused) {
        }
    }

    private final void B2() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", Q1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void C2() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
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
            intent.putExtra("LLDetails", Q1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void D2(List list) {
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
    public static final void O1(LlDocumentUpload llDocumentUpload, Uri uri) {
        cm.l.f(llDocumentUpload, "this$0");
        if (uri != null) {
            try {
                String q10 = com.nic.mparivahan.dlservices.utilities.e.q(llDocumentUpload, uri);
                String r10 = com.nic.mparivahan.dlservices.utilities.e.r(llDocumentUpload, uri);
                if (llDocumentUpload.N1().contains(q.B0(r10).toString())) {
                    DocumentListItem documentListItem = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                    if (documentListItem != null) {
                        documentListItem.setBrowseStatus(true);
                    }
                    DocumentListItem documentListItem2 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                    if (documentListItem2 != null) {
                        documentListItem2.setURI(uri);
                    }
                    DocumentListItem documentListItem3 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                    if (documentListItem3 != null) {
                        documentListItem3.setFileNmae(q10);
                    }
                    boolean o10 = p.o(q.B0(r10).toString(), "pdf", true);
                    a aVar = null;
                    if (o10) {
                        String a10 = com.nic.mparivahan.dlservices.utilities.e.a(llDocumentUpload, uri);
                        Log.e("log", a10);
                        DocumentListItem documentListItem4 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                        if (documentListItem4 != null) {
                            documentListItem4.setFileToUpload(a10);
                        }
                        DocumentListItem documentListItem5 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                        Log.e("log2", String.valueOf(documentListItem5 != null ? documentListItem5.getFileToUpload() : null));
                    } else {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(llDocumentUpload.getContentResolver(), uri);
                        cm.l.c(bitmap);
                        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                        DocumentListItem documentListItem6 = (DocumentListItem) llDocumentUpload.P.get(llDocumentUpload.f9075b0);
                        if (documentListItem6 != null) {
                            documentListItem6.setFileToUpload(f10);
                        }
                    }
                    a aVar2 = llDocumentUpload.I;
                    if (aVar2 == null) {
                        cm.l.v("adapter");
                    } else {
                        aVar = aVar2;
                    }
                    aVar.k(llDocumentUpload.f9075b0);
                    return;
                }
                llDocumentUpload.m2(llDocumentUpload.P1().b("upload_file_types", llDocumentUpload.getString(R.string.you_can_upload)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void T1(java.util.ArrayList r7) {
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
            r6.o2(r6, r7)
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
            ni.o5 r7 = r6.G
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L_0x007d
            cm.l.v(r0)
            r7 = r4
        L_0x007d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.U
            r1 = 8
            r7.setVisibility(r1)
            ni.o5 r7 = r6.G
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.LlDocumentUpload.T1(java.util.ArrayList):void");
    }

    private final void U1() {
        o5 o5Var = null;
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
                o5 o5Var2 = this.G;
                if (o5Var2 == null) {
                    cm.l.v("mBinding");
                    o5Var2 = null;
                }
                o5Var2.F.f25961g.setText(S1().i());
                o5 o5Var3 = this.G;
                if (o5Var3 == null) {
                    cm.l.v("mBinding");
                    o5Var3 = null;
                }
                o5Var3.A.setText("LL No. : " + this.Q);
                Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
                s2((FetchLlDetails) serializableExtra);
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
        o5 o5Var4 = this.G;
        if (o5Var4 == null) {
            cm.l.v("mBinding");
            o5Var4 = null;
        }
        o5Var4.V.setLayoutManager(new LinearLayoutManager(this));
        o5 o5Var5 = this.G;
        if (o5Var5 == null) {
            cm.l.v("mBinding");
            o5Var5 = null;
        }
        o5Var5.V.setHasFixedSize(true);
        o5 o5Var6 = this.G;
        if (o5Var6 == null) {
            cm.l.v("mBinding");
            o5Var6 = null;
        }
        o5Var6.f27761w.setOnClickListener(new q0(this));
        o5 o5Var7 = this.G;
        if (o5Var7 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var = o5Var7;
        }
        o5Var.f27762x.setOnClickListener(new v0(this));
    }

    /* access modifiers changed from: private */
    public static final void V1(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        o5 o5Var = llDocumentUpload.G;
        o5 o5Var2 = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.f27761w.setVisibility(8);
        o5 o5Var3 = llDocumentUpload.G;
        if (o5Var3 == null) {
            cm.l.v("mBinding");
            o5Var3 = null;
        }
        o5Var3.f27762x.setVisibility(0);
        o5 o5Var4 = llDocumentUpload.G;
        if (o5Var4 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var2 = o5Var4;
        }
        o5Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void W1(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        o5 o5Var = llDocumentUpload.G;
        o5 o5Var2 = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.f27762x.setVisibility(8);
        o5 o5Var3 = llDocumentUpload.G;
        if (o5Var3 == null) {
            cm.l.v("mBinding");
            o5Var3 = null;
        }
        o5Var3.f27761w.setVisibility(0);
        o5 o5Var4 = llDocumentUpload.G;
        if (o5Var4 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var2 = o5Var4;
        }
        o5Var2.H.setVisibility(8);
    }

    private final void X1() {
        o5 o5Var = this.G;
        q qVar = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.K.o();
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
    public final void Y1(List list) {
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
        T1(this.P);
        x2();
    }

    private final boolean Z1() {
        for (DocumentListItem documentListItem : this.P) {
            if (documentListItem != null && documentListItem.isBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void a2() {
        o5 o5Var = this.G;
        o5 o5Var2 = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.U.setOnClickListener(new y0(this));
        o5 o5Var3 = this.G;
        if (o5Var3 == null) {
            cm.l.v("mBinding");
            o5Var3 = null;
        }
        o5Var3.F.f25959e.setOnClickListener(new z0(this));
        o5 o5Var4 = this.G;
        if (o5Var4 == null) {
            cm.l.v("mBinding");
            o5Var4 = null;
        }
        o5Var4.F.f25957c.setOnClickListener(new a1(this));
        o5 o5Var5 = this.G;
        if (o5Var5 == null) {
            cm.l.v("mBinding");
            o5Var5 = null;
        }
        o5Var5.L.setOnClickListener(new b1(this));
        o5 o5Var6 = this.G;
        if (o5Var6 == null) {
            cm.l.v("mBinding");
            o5Var6 = null;
        }
        o5Var6.I.f29577d.setOnClickListener(new c1(this));
        o5 o5Var7 = this.G;
        if (o5Var7 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var2 = o5Var7;
        }
        o5Var2.F.f25959e.setOnClickListener(new d1(this));
    }

    /* access modifiers changed from: private */
    public static final void b2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        if (!(!llDocumentUpload.P.isEmpty()) || !llDocumentUpload.Z1()) {
            llDocumentUpload.m2(llDocumentUpload.P1().b("label_attach_document", llDocumentUpload.getString(R.string.attach_doc)));
            return;
        }
        o5 o5Var = llDocumentUpload.G;
        String str = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.U.c(true);
        if (com.nic.mparivahan.a.f9624a.a(llDocumentUpload)) {
            q qVar = llDocumentUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = llDocumentUpload.M;
            if (str2 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str = str2;
            }
            qVar.s(str, llDocumentUpload.P);
            return;
        }
        Toast.makeText(llDocumentUpload.getApplicationContext(), llDocumentUpload.P1().b("label_log_check_internet", llDocumentUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void c2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        llDocumentUpload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void d2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        Intent intent = new Intent(llDocumentUpload, DashBoard.class);
        intent.setFlags(67108864);
        llDocumentUpload.startActivity(intent);
        llDocumentUpload.finish();
    }

    /* access modifiers changed from: private */
    public static final void e2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(llDocumentUpload)) {
            o5 o5Var = llDocumentUpload.G;
            String str = null;
            if (o5Var == null) {
                cm.l.v("mBinding");
                o5Var = null;
            }
            o5Var.L.c(true);
            q qVar = llDocumentUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = llDocumentUpload.J;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            String str3 = llDocumentUpload.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str = str3;
            }
            qVar.h(str2, str);
            return;
        }
        Toast.makeText(llDocumentUpload.getApplicationContext(), llDocumentUpload.P1().b("label_log_check_internet", llDocumentUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void f2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        llDocumentUpload.finish();
    }

    /* access modifiers changed from: private */
    public static final void g2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        llDocumentUpload.finish();
    }

    private final void h2() {
        o5 o5Var = this.G;
        o5 o5Var2 = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.I.f29580g.setText(S1().i());
        o5 o5Var3 = this.G;
        if (o5Var3 == null) {
            cm.l.v("mBinding");
            o5Var3 = null;
        }
        TextView textView = o5Var3.I.f29581h;
        o5 o5Var4 = this.G;
        if (o5Var4 == null) {
            cm.l.v("mBinding");
            o5Var4 = null;
        }
        textView.setPaintFlags(o5Var4.I.f29581h.getPaintFlags() | 8);
        o5 o5Var5 = this.G;
        if (o5Var5 == null) {
            cm.l.v("mBinding");
            o5Var5 = null;
        }
        TextView textView2 = o5Var5.I.f29581h;
        String str = this.Q;
        cm.l.c(str);
        textView2.setText(q.B0(str).toString());
        o5 o5Var6 = this.G;
        if (o5Var6 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var2 = o5Var6;
        }
        o5Var2.I.f29581h.setOnClickListener(new u0(this));
    }

    /* access modifiers changed from: private */
    public static final void i2(LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(llDocumentUpload, "this$0");
        try {
            Intent intent = new Intent(llDocumentUpload, LlDetails.class);
            intent.putExtra("LLDetails", llDocumentUpload.Q1());
            llDocumentUpload.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void k2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new tb.t0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void l2(Dialog dialog, LlDocumentUpload llDocumentUpload, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(llDocumentUpload, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(llDocumentUpload, DashBoard.class);
        intent.setFlags(67108864);
        llDocumentUpload.startActivity(intent);
        llDocumentUpload.finish();
    }

    /* access modifiers changed from: private */
    public final void m2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new x0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void n2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void p2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void u2(boolean z10) {
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
    public final void w2(List list) {
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
            int parseInt = Integer.parseInt(R1().k());
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
        j2(num);
    }

    /* access modifiers changed from: private */
    public final void x2() {
        try {
            if (this.P.size() > 0) {
                List t02 = y.t0(y.x0(this.P));
                this.P.clear();
                this.P.addAll(t02);
            }
            o5 o5Var = this.G;
            o5 o5Var2 = null;
            if (o5Var == null) {
                cm.l.v("mBinding");
                o5Var = null;
            }
            o5Var.K.p();
            o5 o5Var3 = this.G;
            if (o5Var3 == null) {
                cm.l.v("mBinding");
                o5Var3 = null;
            }
            o5Var3.K.setVisibility(8);
            Application application = getApplication();
            cm.l.e(application, "getApplication(...)");
            this.I = new a(this, application, this.P, this);
            o5 o5Var4 = this.G;
            if (o5Var4 == null) {
                cm.l.v("mBinding");
                o5Var4 = null;
            }
            RecyclerView recyclerView = o5Var4.V;
            a aVar = this.I;
            if (aVar == null) {
                cm.l.v("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            o5 o5Var5 = this.G;
            if (o5Var5 == null) {
                cm.l.v("mBinding");
                o5Var5 = null;
            }
            o5Var5.f27764z.setVisibility(0);
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
                    o5 o5Var6 = this.G;
                    if (o5Var6 == null) {
                        cm.l.v("mBinding");
                    } else {
                        o5Var2 = o5Var6;
                    }
                    o5Var2.f27764z.setVisibility(0);
                    return;
                }
                o5 o5Var7 = this.G;
                if (o5Var7 == null) {
                    cm.l.v("mBinding");
                } else {
                    o5Var2 = o5Var7;
                }
                o5Var2.f27764z.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    private final void y2() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", Q1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void z2() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
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
            intent.putExtra("LLDetails", Q1());
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
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails Q1() {
        FetchLlDetails fetchLlDetails = this.f9074a0;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final ld.g R1() {
        ld.g gVar = this.V;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ld.f S1() {
        ld.f fVar = this.Z;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
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
        this.f9075b0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f9075b0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f9075b0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f9075b0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.f9077d0.a("*/*");
        }
    }

    public void c(int i10, DocumentListItem documentListItem) {
        a.C0223a i11;
        l hVar;
        cm.l.f(documentListItem, "item");
        this.f9075b0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f9075b0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f9075b0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f9075b0);
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

    public final void j2(Integer num) {
        if (num != null && num.intValue() == 135) {
            B2();
        } else if (num != null && num.intValue() == 134) {
            z2();
        } else if (num != null && num.intValue() == 123) {
            y2();
        } else if (num != null && num.intValue() == 371) {
            C2();
        } else if (num != null && num.intValue() == 455) {
            k2(P1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void o2(Context context, String str) {
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
        textView.setOnClickListener(new w0(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_ll_document_upload);
        cm.l.e(f10, "setContentView(...)");
        this.G = (o5) f10;
        this.H = (q) new androidx.lifecycle.u0(this).a(q.class);
        o5 o5Var = this.G;
        o5 o5Var2 = null;
        if (o5Var == null) {
            cm.l.v("mBinding");
            o5Var = null;
        }
        o5Var.v(this);
        t2(new ld.g(this));
        r2(new ld.c(this));
        q2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        e.a aVar = v9.e.f17509a;
        o5 o5Var3 = this.G;
        if (o5Var3 == null) {
            cm.l.v("mBinding");
        } else {
            o5Var2 = o5Var3;
        }
        aVar.d1(this, o5Var2);
        v2(new ld.f(this));
        U1();
        X1();
        a2();
        h2();
    }

    public final void q2(String[] strArr) {
        cm.l.f(strArr, "<set-?>");
        this.O = strArr;
    }

    public final void r2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final void s2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.f9074a0 = fetchLlDetails;
    }

    public final void t2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.V = gVar;
    }

    public final void v2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Z = fVar;
    }
}
