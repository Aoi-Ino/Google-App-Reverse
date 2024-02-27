package com.nic.mparivahan.dlservices.newlearner;

import android.app.Application;
import android.app.Dialog;
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
import bj.a0;
import bj.r;
import bj.s;
import bj.t;
import bj.u;
import bj.v;
import bj.w;
import bj.y;
import bj.z;
import bm.l;
import cb.t0;
import cj.m;
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
import ni.h2;
import nj.q;
import pl.x;
import t2.a;

public final class LLDocUpload extends androidx.appcompat.app.d implements m.a {
    /* access modifiers changed from: private */
    public h2 G;
    /* access modifiers changed from: private */
    public q H;
    private m I;
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
    private boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    private final int f21685a0 = 7092;

    /* renamed from: b0  reason: collision with root package name */
    private int f21686b0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public final d.c f21687c0;

    /* renamed from: d0  reason: collision with root package name */
    private d.c f21688d0;

    static final class a extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21689e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLDocUpload lLDocUpload) {
            super(1);
            this.f21689e = lLDocUpload;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            r1 = (r1 = r1.getTransReq()).get(0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse r8) {
            /*
                r7 = this;
                com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage r0 = r8.getResponseMessage()     // Catch:{ Exception -> 0x0033 }
                if (r0 == 0) goto L_0x01a4
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x0033 }
                if (r0 != 0) goto L_0x000e
                goto L_0x01a4
            L_0x000e:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x0033 }
                r1 = 200(0xc8, float:2.8E-43)
                if (r0 != r1) goto L_0x01a4
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r1 = r8.getResponseBody()     // Catch:{ Exception -> 0x0033 }
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L_0x0036
                java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0036
                java.lang.Object r1 = r1.get(r2)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.ui.acknow.TransReqItem r1 = (com.nic.mparivahan.dlservices.ui.acknow.TransReqItem) r1     // Catch:{ Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0036
                java.lang.Integer r1 = r1.getTrTrCd()     // Catch:{ Exception -> 0x0033 }
                goto L_0x0037
            L_0x0033:
                r8 = move-exception
                goto L_0x01a1
            L_0x0036:
                r1 = r3
            L_0x0037:
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0033 }
                r0.N = r1     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r0 = r8.getResponseBody()     // Catch:{ Exception -> 0x0033 }
                if (r0 == 0) goto L_0x0049
                com.nic.mparivahan.dlservices.ui.acknow.OlaMast r0 = r0.getOlaMast()     // Catch:{ Exception -> 0x0033 }
                goto L_0x004a
            L_0x0049:
                r0 = r3
            L_0x004a:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r1 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                if (r0 == 0) goto L_0x0053
                java.lang.String r4 = r0.getOmOfficecd()     // Catch:{ Exception -> 0x0033 }
                goto L_0x0054
            L_0x0053:
                r4 = r3
            L_0x0054:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0033 }
                r1.M = r4     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r1 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                if (r0 == 0) goto L_0x0064
                java.lang.String r0 = r0.getOmStCode()     // Catch:{ Exception -> 0x0033 }
                goto L_0x0065
            L_0x0064:
                r0 = r3
            L_0x0065:
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0033 }
                r1.L = r0     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = "mBinding"
                if (r0 != 0) goto L_0x007a
                cm.l.v(r1)     // Catch:{ Exception -> 0x0033 }
                r0 = r3
            L_0x007a:
                android.widget.TextView r0 = r0.f26600y     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r4 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r4 = r4.J     // Catch:{ Exception -> 0x0033 }
                java.lang.String r5 = "mApplNo"
                if (r4 != 0) goto L_0x008a
                cm.l.v(r5)     // Catch:{ Exception -> 0x0033 }
                r4 = r3
            L_0x008a:
                r0.setText(r4)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x0033 }
                if (r0 != 0) goto L_0x0099
                cm.l.v(r1)     // Catch:{ Exception -> 0x0033 }
                r0 = r3
            L_0x0099:
                android.widget.TextView r0 = r0.C     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r4 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r4 = r4.K     // Catch:{ Exception -> 0x0033 }
                if (r4 != 0) goto L_0x00a9
                java.lang.String r4 = "mApplDob"
                cm.l.v(r4)     // Catch:{ Exception -> 0x0033 }
                r4 = r3
            L_0x00a9:
                r0.setText(r4)     // Catch:{ Exception -> 0x0033 }
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0033 }
                java.lang.String r4 = "dd-MM-yyyy"
                java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0033 }
                r0.<init>(r4, r6)     // Catch:{ Exception -> 0x0033 }
                java.util.Date r4 = new java.util.Date     // Catch:{ Exception -> 0x0033 }
                r4.<init>()     // Catch:{ Exception -> 0x0033 }
                java.lang.String r0 = r0.format(r4)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r4 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ni.h2 r4 = r4.G     // Catch:{ Exception -> 0x0033 }
                if (r4 != 0) goto L_0x00cc
                cm.l.v(r1)     // Catch:{ Exception -> 0x0033 }
                r4 = r3
            L_0x00cc:
                android.widget.TextView r4 = r4.B     // Catch:{ Exception -> 0x0033 }
                r4.setText(r0)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x0033 }
                if (r0 != 0) goto L_0x00dd
                cm.l.v(r1)     // Catch:{ Exception -> 0x0033 }
                r0 = r3
            L_0x00dd:
                android.widget.TextView r0 = r0.E     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r4 = r8.getResponseBody()     // Catch:{ Exception -> 0x0033 }
                if (r4 == 0) goto L_0x00ea
                java.lang.String r4 = r4.getApdFullName()     // Catch:{ Exception -> 0x0033 }
                goto L_0x00eb
            L_0x00ea:
                r4 = r3
            L_0x00eb:
                java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0033 }
                r0.setText(r4)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x0033 }
                if (r0 != 0) goto L_0x00fe
                cm.l.v(r1)     // Catch:{ Exception -> 0x0033 }
                r0 = r3
            L_0x00fe:
                android.widget.TextView r0 = r0.D     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.ui.acknow.ResponseBody r8 = r8.getResponseBody()     // Catch:{ Exception -> 0x0033 }
                if (r8 == 0) goto L_0x010b
                java.lang.String r8 = r8.getApdSwdFullName()     // Catch:{ Exception -> 0x0033 }
                goto L_0x010c
            L_0x010b:
                r8 = r3
            L_0x010c:
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0033 }
                r0.setText(r8)     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r8 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r8 = r8.J     // Catch:{ Exception -> 0x0033 }
                if (r8 != 0) goto L_0x011f
                cm.l.v(r5)     // Catch:{ Exception -> 0x0033 }
                r8 = r3
            L_0x011f:
                int r8 = r8.length()     // Catch:{ Exception -> 0x0033 }
                if (r8 <= 0) goto L_0x01a4
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r8 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r8 = r8.L     // Catch:{ Exception -> 0x0033 }
                java.lang.String r0 = "mApplStateCd"
                if (r8 != 0) goto L_0x0133
                cm.l.v(r0)     // Catch:{ Exception -> 0x0033 }
                r8 = r3
            L_0x0133:
                int r8 = r8.length()     // Catch:{ Exception -> 0x0033 }
                if (r8 <= 0) goto L_0x01a4
                com.nic.mparivahan.a$a r8 = com.nic.mparivahan.a.f9624a     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r1 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                boolean r8 = r8.a(r1)     // Catch:{ Exception -> 0x0033 }
                if (r8 == 0) goto L_0x017e
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r8 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                nj.q r8 = r8.H     // Catch:{ Exception -> 0x0033 }
                if (r8 != 0) goto L_0x0151
                java.lang.String r8 = "viewModel"
                cm.l.v(r8)     // Catch:{ Exception -> 0x0033 }
                r8 = r3
            L_0x0151:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r1 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = r1.J     // Catch:{ Exception -> 0x0033 }
                if (r1 != 0) goto L_0x015d
                cm.l.v(r5)     // Catch:{ Exception -> 0x0033 }
                r1 = r3
            L_0x015d:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r2 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x0033 }
                if (r2 != 0) goto L_0x0169
                cm.l.v(r0)     // Catch:{ Exception -> 0x0033 }
                r2 = r3
            L_0x0169:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                java.lang.String r0 = r0.N     // Catch:{ Exception -> 0x0033 }
                if (r0 != 0) goto L_0x0177
                java.lang.String r0 = "serviceCode"
                cm.l.v(r0)     // Catch:{ Exception -> 0x0033 }
                goto L_0x0178
            L_0x0177:
                r3 = r0
            L_0x0178:
                java.lang.String r0 = "A"
                r8.m(r1, r2, r3, r0)     // Catch:{ Exception -> 0x0033 }
                goto L_0x01a4
            L_0x017e:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r8 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0033 }
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                ld.c r0 = r0.N1()     // Catch:{ Exception -> 0x0033 }
                java.lang.String r1 = "label_log_check_internet"
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r3 = r7.f21689e     // Catch:{ Exception -> 0x0033 }
                r4 = 2132018237(0x7f14043d, float:1.9674775E38)
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0033 }
                java.lang.String r0 = r0.b(r1, r3)     // Catch:{ Exception -> 0x0033 }
                android.widget.Toast r8 = android.widget.Toast.makeText(r8, r0, r2)     // Catch:{ Exception -> 0x0033 }
                r8.show()     // Catch:{ Exception -> 0x0033 }
                goto L_0x01a4
            L_0x01a1:
                r8.printStackTrace()
            L_0x01a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLDocUpload.a.b(com.nic.mparivahan.dlservices.ui.acknow.DlApplStatusResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21690e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LLDocUpload lLDocUpload) {
            super(1);
            this.f21690e = lLDocUpload;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                            this.f21690e.t2(uploadDocListResponse.getDocumentList());
                        }
                    }
                }
                q z12 = this.f21690e.H;
                String str = null;
                if (z12 == null) {
                    cm.l.v("viewModel");
                    z12 = null;
                }
                String u12 = this.f21690e.J;
                if (u12 == null) {
                    cm.l.v("mApplNo");
                    u12 = null;
                }
                String v12 = this.f21690e.L;
                if (v12 == null) {
                    cm.l.v("mApplStateCd");
                    v12 = null;
                }
                String x12 = this.f21690e.N;
                if (x12 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = x12;
                }
                z12.i(u12, v12, str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    static final class c extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21691e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LLDocUpload lLDocUpload) {
            super(1);
            this.f21691e = lLDocUpload;
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
                                q z12 = this.f21691e.H;
                                if (z12 == null) {
                                    cm.l.v("viewModel");
                                    z12 = null;
                                }
                                String u12 = this.f21691e.J;
                                if (u12 == null) {
                                    cm.l.v("mApplNo");
                                    u12 = null;
                                }
                                String v12 = this.f21691e.L;
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
                                        this.f21691e.X.add(add);
                                    }
                                }
                            }
                            this.f21691e.K1(uploadDocListResponse.getDocumentList());
                            return;
                        }
                    }
                }
                h2 w12 = this.f21691e.G;
                if (w12 == null) {
                    cm.l.v("mBinding");
                    w12 = null;
                }
                w12.T.setVisibility(8);
                LLDocUpload lLDocUpload = this.f21691e;
                ResponseBean responseBean2 = uploadDocListResponse.getResponseBean();
                if (responseBean2 != null) {
                    str = responseBean2.getDeveloperMessage();
                }
                lLDocUpload.e2(str);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21692e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(LLDocUpload lLDocUpload) {
            super(1);
            this.f21692e = lLDocUpload;
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
                                this.f21692e.n2();
                                return;
                            } else {
                                this.f21692e.U1(insertedUploadDocResponse.getInsertedDocBean());
                                return;
                            }
                        }
                    }
                }
                LLDocUpload lLDocUpload = this.f21692e;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                lLDocUpload.e2(responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((InsertedUploadDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class e extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21693e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(LLDocUpload lLDocUpload) {
            super(1);
            this.f21693e = lLDocUpload;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse r5) {
            /*
                r4 = this;
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                ni.h2 r0 = r0.G     // Catch:{ Exception -> 0x0010 }
                r1 = 0
                if (r0 != 0) goto L_0x0013
                java.lang.String r0 = "mBinding"
                cm.l.v(r0)     // Catch:{ Exception -> 0x0010 }
                r0 = r1
                goto L_0x0013
            L_0x0010:
                r5 = move-exception
                goto L_0x00bb
            L_0x0013:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.T     // Catch:{ Exception -> 0x0010 }
                r2 = 0
                r0.c(r2)     // Catch:{ Exception -> 0x0010 }
                if (r5 == 0) goto L_0x009f
                java.lang.Integer r0 = r5.getStatusCode()     // Catch:{ Exception -> 0x0010 }
                if (r0 != 0) goto L_0x0023
                goto L_0x009f
            L_0x0023:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x0010 }
                r3 = 200(0xc8, float:2.8E-43)
                if (r0 != r3) goto L_0x009f
                java.util.List r0 = r5.getResponses()     // Catch:{ Exception -> 0x0010 }
                if (r0 == 0) goto L_0x0038
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0010 }
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r0     // Catch:{ Exception -> 0x0010 }
                goto L_0x0039
            L_0x0038:
                r0 = r1
            L_0x0039:
                cm.l.c(r0)     // Catch:{ Exception -> 0x0010 }
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x0010 }
                if (r0 != 0) goto L_0x0043
                goto L_0x009f
            L_0x0043:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x0010 }
                if (r0 != r3) goto L_0x009f
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r5 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x0010 }
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x0010 }
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x0060
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r5 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                java.util.ArrayList r5 = r5.P     // Catch:{ Exception -> 0x0010 }
                r5.clear()     // Catch:{ Exception -> 0x0010 }
            L_0x0060:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r5 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                nj.q r5 = r5.H     // Catch:{ Exception -> 0x0010 }
                if (r5 != 0) goto L_0x006e
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x0010 }
                r5 = r1
            L_0x006e:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                java.lang.String r0 = r0.J     // Catch:{ Exception -> 0x0010 }
                if (r0 != 0) goto L_0x007c
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x0010 }
                r0 = r1
            L_0x007c:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r2 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                java.lang.String r2 = r2.L     // Catch:{ Exception -> 0x0010 }
                if (r2 != 0) goto L_0x008a
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x0010 }
                r2 = r1
            L_0x008a:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r3 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                java.lang.String r3 = r3.N     // Catch:{ Exception -> 0x0010 }
                if (r3 != 0) goto L_0x0098
                java.lang.String r3 = "serviceCode"
                cm.l.v(r3)     // Catch:{ Exception -> 0x0010 }
                goto L_0x0099
            L_0x0098:
                r1 = r3
            L_0x0099:
                java.lang.String r3 = "A"
                r5.m(r0, r2, r1, r3)     // Catch:{ Exception -> 0x0010 }
                goto L_0x00be
            L_0x009f:
                com.nic.mparivahan.dlservices.newlearner.LLDocUpload r0 = r4.f21693e     // Catch:{ Exception -> 0x0010 }
                if (r5 == 0) goto L_0x00b0
                java.util.List r5 = r5.getResponses()     // Catch:{ Exception -> 0x0010 }
                if (r5 == 0) goto L_0x00b0
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x0010 }
                r1 = r5
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r1     // Catch:{ Exception -> 0x0010 }
            L_0x00b0:
                cm.l.c(r1)     // Catch:{ Exception -> 0x0010 }
                java.lang.String r5 = r1.getDeveloperMessage()     // Catch:{ Exception -> 0x0010 }
                r0.e2(r5)     // Catch:{ Exception -> 0x0010 }
                goto L_0x00be
            L_0x00bb:
                r5.printStackTrace()
            L_0x00be:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLDocUpload.e.b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadedDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21694e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(LLDocUpload lLDocUpload) {
            super(1);
            this.f21694e = lLDocUpload;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                h2 w12 = this.f21694e.G;
                if (w12 == null) {
                    cm.l.v("mBinding");
                    w12 = null;
                }
                w12.K.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                    this.f21694e.m2(applStatusDetailsItem.getApplFlowStatusList());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21695e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LLDocUpload lLDocUpload) {
            super(1);
            this.f21695e = lLDocUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f21695e.f21687c0.a(intent);
            this.f21695e.l2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLDocUpload f21696e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(LLDocUpload lLDocUpload) {
            super(1);
            this.f21696e = lLDocUpload;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f21696e.f21687c0.a(intent);
            this.f21696e.l2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21697a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f21697a = lVar;
        }

        public final pl.c a() {
            return this.f21697a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21697a.invoke(obj);
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

    public LLDocUpload() {
        d.c y02 = y0(new e.d(), new r(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f21687c0 = y02;
        d.c y03 = y0(new e.b(), new t(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f21688d0 = y03;
    }

    private final void J1() {
        boolean z10;
        if (checkSelfPermission("android.permission.CAMERA") == -1) {
            requestPermissions(new String[]{"android.permission.CAMERA"}, this.f21685a0);
            z10 = false;
        } else {
            z10 = true;
        }
        this.Z = z10;
    }

    /* access modifiers changed from: private */
    public final void K1(List list) {
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
        Toast.makeText(getApplicationContext(), N1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void M1(LLDocUpload lLDocUpload, Uri uri) {
        cm.l.f(lLDocUpload, "this$0");
        if (uri != null) {
            try {
                String q10 = com.nic.mparivahan.dlservices.utilities.e.q(lLDocUpload, uri);
                String r10 = com.nic.mparivahan.dlservices.utilities.e.r(lLDocUpload, uri);
                if (lLDocUpload.L1().contains(q.B0(r10).toString())) {
                    DocumentListItem documentListItem = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                    if (documentListItem != null) {
                        documentListItem.setBrowseStatus(true);
                    }
                    DocumentListItem documentListItem2 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                    if (documentListItem2 != null) {
                        documentListItem2.setURI(uri);
                    }
                    DocumentListItem documentListItem3 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                    if (documentListItem3 != null) {
                        documentListItem3.setFileNmae(q10);
                    }
                    boolean o10 = p.o(q.B0(r10).toString(), "pdf", true);
                    m mVar = null;
                    if (o10) {
                        String a10 = com.nic.mparivahan.dlservices.utilities.e.a(lLDocUpload, uri);
                        Log.e("log", a10);
                        DocumentListItem documentListItem4 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                        if (documentListItem4 != null) {
                            documentListItem4.setFileToUpload(a10);
                        }
                        DocumentListItem documentListItem5 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                        Log.e("log2", String.valueOf(documentListItem5 != null ? documentListItem5.getFileToUpload() : null));
                    } else {
                        Bitmap bitmap = MediaStore.Images.Media.getBitmap(lLDocUpload.getContentResolver(), uri);
                        cm.l.c(bitmap);
                        String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                        DocumentListItem documentListItem6 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                        if (documentListItem6 != null) {
                            documentListItem6.setFileToUpload(f10);
                        }
                    }
                    m mVar2 = lLDocUpload.I;
                    if (mVar2 == null) {
                        cm.l.v("adapter");
                    } else {
                        mVar = mVar2;
                    }
                    mVar.k(lLDocUpload.f21686b0);
                    return;
                }
                lLDocUpload.e2(lLDocUpload.N1().b("upload_file_types", lLDocUpload.getString(R.string.you_can_upload)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void P1(java.util.ArrayList r7) {
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
            ld.c r7 = r6.N1()
            r0 = 2132017671(0x7f140207, float:1.9673627E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.g2(r6, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.newlearner.LLDocUpload.P1(java.util.ArrayList):void");
    }

    private final void Q1() {
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
                this.Q = String.valueOf(getIntent().getStringExtra("dob"));
                this.R = String.valueOf(getIntent().getStringExtra("Mobile_no"));
                String stringExtra = getIntent().getStringExtra("lastEndorsedRTO");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.T = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("aadharPhoto");
                cm.l.c(stringExtra2);
                this.U = stringExtra2;
                h2 h2Var2 = this.G;
                if (h2Var2 == null) {
                    cm.l.v("mBinding");
                    h2Var2 = null;
                }
                h2Var2.F.f25961g.setText(fVar.i());
            } catch (Exception e10) {
                e10.printStackTrace();
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
            Toast.makeText(getApplicationContext(), N1().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
        }
        q qVar2 = this.H;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.n().g(this, new i(new a(this)));
        h2 h2Var3 = this.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.U.setLayoutManager(new LinearLayoutManager(this));
        h2 h2Var4 = this.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
            h2Var4 = null;
        }
        h2Var4.U.setHasFixedSize(true);
        h2 h2Var5 = this.G;
        if (h2Var5 == null) {
            cm.l.v("mBinding");
            h2Var5 = null;
        }
        h2Var5.f26598w.setOnClickListener(new w(this));
        h2 h2Var6 = this.G;
        if (h2Var6 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var = h2Var6;
        }
        h2Var.f26599x.setOnClickListener(new bj.x(this));
    }

    /* access modifiers changed from: private */
    public static final void R1(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        h2 h2Var = lLDocUpload.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.f26598w.setVisibility(8);
        h2 h2Var3 = lLDocUpload.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.f26599x.setVisibility(0);
        h2 h2Var4 = lLDocUpload.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var4;
        }
        h2Var2.H.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void S1(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        h2 h2Var = lLDocUpload.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.f26599x.setVisibility(8);
        h2 h2Var3 = lLDocUpload.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.f26598w.setVisibility(0);
        h2 h2Var4 = lLDocUpload.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var4;
        }
        h2Var2.H.setVisibility(8);
    }

    private final void T1() {
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
    public final void U1(List list) {
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
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        P1(this.P);
        n2();
    }

    private final boolean V1() {
        for (DocumentListItem documentListItem : this.P) {
            if (documentListItem != null && documentListItem.isBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void W1() {
        h2 h2Var = this.G;
        h2 h2Var2 = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.T.setOnClickListener(new z(this));
        h2 h2Var3 = this.G;
        if (h2Var3 == null) {
            cm.l.v("mBinding");
            h2Var3 = null;
        }
        h2Var3.F.f25959e.setOnClickListener(new a0(this));
        h2 h2Var4 = this.G;
        if (h2Var4 == null) {
            cm.l.v("mBinding");
            h2Var4 = null;
        }
        h2Var4.F.f25957c.setOnClickListener(new bj.b0(this));
        h2 h2Var5 = this.G;
        if (h2Var5 == null) {
            cm.l.v("mBinding");
        } else {
            h2Var2 = h2Var5;
        }
        h2Var2.K.setOnClickListener(new s(this));
    }

    /* access modifiers changed from: private */
    public static final void X1(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        if (!(!lLDocUpload.P.isEmpty()) || !lLDocUpload.V1()) {
            lLDocUpload.e2(lLDocUpload.N1().b("label_attach_document", lLDocUpload.getString(R.string.attach_doc)));
            return;
        }
        h2 h2Var = lLDocUpload.G;
        String str = null;
        if (h2Var == null) {
            cm.l.v("mBinding");
            h2Var = null;
        }
        h2Var.T.c(true);
        if (com.nic.mparivahan.a.f9624a.a(lLDocUpload)) {
            q qVar = lLDocUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = lLDocUpload.M;
            if (str2 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str = str2;
            }
            qVar.s(str, lLDocUpload.P);
            return;
        }
        Toast.makeText(lLDocUpload.getApplicationContext(), lLDocUpload.N1().b("label_log_check_internet", lLDocUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        lLDocUpload.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void Z1(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        Intent intent = new Intent(lLDocUpload, DashBoard.class);
        intent.setFlags(67108864);
        lLDocUpload.startActivity(intent);
        lLDocUpload.finish();
    }

    /* access modifiers changed from: private */
    public static final void a2(LLDocUpload lLDocUpload, View view) {
        cm.l.f(lLDocUpload, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(lLDocUpload)) {
            h2 h2Var = lLDocUpload.G;
            String str = null;
            if (h2Var == null) {
                cm.l.v("mBinding");
                h2Var = null;
            }
            h2Var.K.c(true);
            q qVar = lLDocUpload.H;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = lLDocUpload.J;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            String str3 = lLDocUpload.K;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str = str3;
            }
            qVar.h(str2, str);
            return;
        }
        Toast.makeText(lLDocUpload.getApplicationContext(), lLDocUpload.N1().b("label_log_check_internet", lLDocUpload.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    private final void c2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new v(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void d2(Dialog dialog, LLDocUpload lLDocUpload, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLDocUpload, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLDocUpload, DashBoard.class);
        intent.setFlags(67108864);
        lLDocUpload.startActivity(intent);
        lLDocUpload.finish();
    }

    /* access modifiers changed from: private */
    public final void e2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new y(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void f2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void h2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void l2(boolean z10) {
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
    public final void m2(List list) {
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
            int parseInt = Integer.parseInt(O1().k());
            String str5 = this.Q;
            cm.l.c(str5);
            String str6 = this.M;
            if (str6 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str6;
            }
            aVar.a(this, str, parseLong, parseInt, str5, "", str2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        b2(num);
    }

    /* access modifiers changed from: private */
    public final void n2() {
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
            this.I = new m(this, application, this.P, this);
            h2 h2Var4 = this.G;
            if (h2Var4 == null) {
                cm.l.v("mBinding");
                h2Var4 = null;
            }
            RecyclerView recyclerView = h2Var4.U;
            m mVar = this.I;
            if (mVar == null) {
                cm.l.v("adapter");
                mVar = null;
            }
            recyclerView.setAdapter(mVar);
            h2 h2Var5 = this.G;
            if (h2Var5 == null) {
                cm.l.v("mBinding");
                h2Var5 = null;
            }
            h2Var5.f26601z.setVisibility(0);
            if (this.X.size() > 0) {
                int size = this.X.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = (Integer) this.X.get(i10);
                    String valueOf = num != null ? String.valueOf(num) : null;
                    int size2 = this.P.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (i11 < this.P.size()) {
                            DocumentListItem documentListItem = (DocumentListItem) this.P.get(i11);
                            if (cm.l.a(valueOf, String.valueOf(documentListItem != null ? documentListItem.getId() : null))) {
                                m mVar2 = this.I;
                                if (mVar2 == null) {
                                    cm.l.v("adapter");
                                    mVar2 = null;
                                }
                                mVar2.Z(i11);
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
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void o2() {
        Intent intent = new Intent(this, LLDocUpload.class);
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
        intent.putExtra("dob", this.Q);
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.T);
        String str4 = this.M;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.U);
        startActivity(intent);
        finish();
    }

    private final void p2() {
        Intent intent = new Intent(this, LLFeePayment.class);
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
        intent.putExtra("dob", this.Q);
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.T);
        String str4 = this.M;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.U);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void q2(LLDocUpload lLDocUpload, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(lLDocUpload, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                m mVar = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(lLDocUpload.getContentResolver(), data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(lLDocUpload.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                File file = new File(oi.h.b(lLDocUpload, data));
                DocumentListItem documentListItem = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(data);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(file.getName());
                }
                String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                if (f10 != null) {
                    DocumentListItem documentListItem4 = (DocumentListItem) lLDocUpload.P.get(lLDocUpload.f21686b0);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(f10);
                    }
                }
                m mVar2 = lLDocUpload.I;
                if (mVar2 == null) {
                    cm.l.v("adapter");
                } else {
                    mVar = mVar2;
                }
                mVar.k(lLDocUpload.f21686b0);
            } else if (d10 == 64) {
                lLDocUpload.l2(false);
                Toast.makeText(lLDocUpload, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            lLDocUpload.l2(false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void r2() {
        Intent intent = new Intent(this, LLPhotoSign.class);
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
        intent.putExtra("dob", this.Q);
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.T);
        String str4 = this.M;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.U);
        startActivity(intent);
        finish();
    }

    private final void s2() {
        Intent intent = new Intent(this, LLSlots.class);
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
        intent.putExtra("dob", this.Q);
        intent.putExtra("Mobile_no", this.R);
        intent.putExtra("lastEndorsedRTO", this.T);
        String str4 = this.M;
        if (str4 == null) {
            cm.l.v("lastEndorseRTOCode");
        } else {
            str2 = str4;
        }
        intent.putExtra("lastEndorsedRTOCode", str2);
        intent.putExtra("aadharPhoto", this.U);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public final void t2(List list) {
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

    public final ArrayList L1() {
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

    public final ld.c N1() {
        ld.c cVar = this.Y;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ld.g O1() {
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
        m mVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI((Uri) null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(i10);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        m mVar2 = this.I;
        if (mVar2 == null) {
            cm.l.v("adapter");
        } else {
            mVar = mVar2;
        }
        mVar.k(i10);
    }

    public void b(int i10, DocumentListItem documentListItem) {
        cm.l.f(documentListItem, "item");
        this.f21686b0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.f21688d0.a("*/*");
        }
    }

    public final void b2(Integer num) {
        if (num != null && num.intValue() == 135) {
            r2();
        } else if (num != null && num.intValue() == 134) {
            p2();
        } else if (num != null && num.intValue() == 123) {
            o2();
        } else if (num != null && num.intValue() == 371) {
            s2();
        } else if (num != null && num.intValue() == 455) {
            c2(N1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public void c(int i10, DocumentListItem documentListItem) {
        a.C0223a i11;
        l hVar;
        cm.l.f(documentListItem, "item");
        this.f21686b0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.P.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.P.get(this.f21686b0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
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

    public final void g2(Context context, String str) {
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
        textView.setText(N1().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new u(dialog));
        dialog.show();
    }

    public final void i2(String[] strArr) {
        cm.l.f(strArr, "<set-?>");
        this.O = strArr;
    }

    public final void j2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.Y = cVar;
    }

    public final void k2(ld.g gVar) {
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
        k2(new ld.g(this));
        j2(new ld.c(this));
        i2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        J1();
        Q1();
        T1();
        W1();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        boolean z10 = true;
        if (i10 == 222) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, N1().b("go_settings", ""), 0).show();
            }
        } else if (i10 == LLPhotoSign.f21704h0.a()) {
            if ((!(iArr.length == 0)) && iArr[0] != 0) {
                e2("Please grant permission to proceed");
                z10 = false;
            }
            this.Z = z10;
        }
    }
}
