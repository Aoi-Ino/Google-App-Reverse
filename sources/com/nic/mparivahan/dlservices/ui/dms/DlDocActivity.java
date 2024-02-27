package com.nic.mparivahan.dlservices.ui.dms;

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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.View.DlServiceDetailsActivity;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.DlLog.DlLogUpdate;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
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
import com.nic.mparivahan.dlservices.ui.acknow.OlaMast;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseBody;
import com.nic.mparivahan.dlservices.ui.acknow.ResponseMessage;
import com.nic.mparivahan.dlservices.ui.acknow.TransReqItem;
import com.nic.mparivahan.dlservices.ui.dms.a;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import java.io.File;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import ni.p3;
import nj.j;
import nj.k;
import nj.n;
import nj.o;
import nj.p;
import nj.q;
import pl.x;
import t2.a;
import v9.e;

public final class DlDocActivity extends oi.g implements a.C0273a {
    /* access modifiers changed from: private */
    public p3 J;
    /* access modifiers changed from: private */
    public q K;
    private a L;
    /* access modifiers changed from: private */
    public String M;
    /* access modifiers changed from: private */
    public String N;
    /* access modifiers changed from: private */
    public String O;
    public DldetobjX P;
    /* access modifiers changed from: private */
    public String Q;
    /* access modifiers changed from: private */
    public String R;
    public String[] S;
    /* access modifiers changed from: private */
    public ArrayList T = new ArrayList();
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    public ld.g f22028a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f22029b0;
    /* access modifiers changed from: private */

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList f22030c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public ld.c f22031d0;

    /* renamed from: e0  reason: collision with root package name */
    private t0 f22032e0;

    /* renamed from: f0  reason: collision with root package name */
    public ld.f f22033f0;

    /* renamed from: g0  reason: collision with root package name */
    public ArrayList f22034g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f22035h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f22036i0;

    /* renamed from: j0  reason: collision with root package name */
    private String f22037j0 = "";

    /* renamed from: k0  reason: collision with root package name */
    private int f22038k0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public final d.c f22039l0;

    /* renamed from: m0  reason: collision with root package name */
    private d.c f22040m0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocActivity f22041e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlDocActivity dlDocActivity) {
            super(1);
            this.f22041e = dlDocActivity;
        }

        public final void b(DlApplStatusResponse dlApplStatusResponse) {
            List<TransReqItem> transReq;
            TransReqItem transReqItem;
            try {
                ResponseMessage responseMessage = dlApplStatusResponse.getResponseMessage();
                if (responseMessage != null) {
                    Integer statusCode = responseMessage.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200) {
                            DlDocActivity dlDocActivity = this.f22041e;
                            ResponseBody responseBody = dlApplStatusResponse.getResponseBody();
                            String str = null;
                            String apdApplicantCatg = responseBody != null ? responseBody.getApdApplicantCatg() : null;
                            cm.l.c(apdApplicantCatg);
                            dlDocActivity.N2(apdApplicantCatg);
                            DlDocActivity dlDocActivity2 = this.f22041e;
                            ResponseBody responseBody2 = dlApplStatusResponse.getResponseBody();
                            dlDocActivity2.R = String.valueOf((responseBody2 == null || (transReq = responseBody2.getTransReq()) == null || (transReqItem = transReq.get(0)) == null) ? null : transReqItem.getTrTrCd());
                            ResponseBody responseBody3 = dlApplStatusResponse.getResponseBody();
                            OlaMast olaMast = responseBody3 != null ? responseBody3.getOlaMast() : null;
                            this.f22041e.Q = String.valueOf(olaMast != null ? olaMast.getOmOfficecd() : null);
                            this.f22041e.O = String.valueOf(olaMast != null ? olaMast.getOmStCode() : null);
                            p3 R1 = this.f22041e.J;
                            if (R1 == null) {
                                cm.l.v("mBinding");
                                R1 = null;
                            }
                            TextView textView = R1.f27925y;
                            String P1 = this.f22041e.M;
                            if (P1 == null) {
                                cm.l.v("mApplNo");
                                P1 = null;
                            }
                            textView.setText(P1);
                            p3 R12 = this.f22041e.J;
                            if (R12 == null) {
                                cm.l.v("mBinding");
                                R12 = null;
                            }
                            TextView textView2 = R12.C;
                            String O1 = this.f22041e.N;
                            if (O1 == null) {
                                cm.l.v("mApplDob");
                                O1 = null;
                            }
                            textView2.setText(O1);
                            String format = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date());
                            p3 R13 = this.f22041e.J;
                            if (R13 == null) {
                                cm.l.v("mBinding");
                                R13 = null;
                            }
                            R13.B.setText(format);
                            p3 R14 = this.f22041e.J;
                            if (R14 == null) {
                                cm.l.v("mBinding");
                                R14 = null;
                            }
                            TextView textView3 = R14.E;
                            ResponseBody responseBody4 = dlApplStatusResponse.getResponseBody();
                            textView3.setText(String.valueOf(responseBody4 != null ? responseBody4.getApdFullName() : null));
                            p3 R15 = this.f22041e.J;
                            if (R15 == null) {
                                cm.l.v("mBinding");
                                R15 = null;
                            }
                            TextView textView4 = R15.D;
                            ResponseBody responseBody5 = dlApplStatusResponse.getResponseBody();
                            textView4.setText(String.valueOf(responseBody5 != null ? responseBody5.getApdSwdFullName() : null));
                            String P12 = this.f22041e.M;
                            if (P12 == null) {
                                cm.l.v("mApplNo");
                                P12 = null;
                            }
                            if (P12.length() > 0) {
                                String Q1 = this.f22041e.O;
                                if (Q1 == null) {
                                    cm.l.v("mApplStateCd");
                                    Q1 = null;
                                }
                                if (Q1.length() <= 0) {
                                    return;
                                }
                                if (com.nic.mparivahan.a.f9624a.a(this.f22041e)) {
                                    q U1 = this.f22041e.K;
                                    if (U1 == null) {
                                        cm.l.v("viewModel");
                                        U1 = null;
                                    }
                                    String P13 = this.f22041e.M;
                                    if (P13 == null) {
                                        cm.l.v("mApplNo");
                                        P13 = null;
                                    }
                                    String Q12 = this.f22041e.O;
                                    if (Q12 == null) {
                                        cm.l.v("mApplStateCd");
                                        Q12 = null;
                                    }
                                    String S1 = this.f22041e.R;
                                    if (S1 == null) {
                                        cm.l.v("serviceCode");
                                    } else {
                                        str = S1;
                                    }
                                    U1.m(P13, Q12, str, this.f22041e.g2());
                                    return;
                                }
                                Toast.makeText(this.f22041e.getApplicationContext(), this.f22041e.j2().b("label_log_check_internet", this.f22041e.getString(R.string.kindly_check_your_internet_connection)), 0).show();
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.d("dldoc", e10.getLocalizedMessage());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusResponse) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocActivity f22042e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlDocActivity dlDocActivity) {
            super(1);
            this.f22042e = dlDocActivity;
        }

        public final void b(UploadDocListResponse uploadDocListResponse) {
            List<DocumentListItem> documentList;
            try {
                ResponseBean responseBean = uploadDocListResponse.getResponseBean();
                if (responseBean != null) {
                    Integer statusCode = responseBean.getStatusCode();
                    if (statusCode != null) {
                        if (statusCode.intValue() == 200 && (documentList = uploadDocListResponse.getDocumentList()) != null && (!documentList.isEmpty())) {
                            this.f22042e.d3(uploadDocListResponse.getDocumentList());
                        }
                    }
                }
                q U1 = this.f22042e.K;
                String str = null;
                if (U1 == null) {
                    cm.l.v("viewModel");
                    U1 = null;
                }
                String P1 = this.f22042e.M;
                if (P1 == null) {
                    cm.l.v("mApplNo");
                    P1 = null;
                }
                String Q1 = this.f22042e.O;
                if (Q1 == null) {
                    cm.l.v("mApplStateCd");
                    Q1 = null;
                }
                String S1 = this.f22042e.R;
                if (S1 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = S1;
                }
                U1.i(P1, Q1, str);
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
        final /* synthetic */ DlDocActivity f22043e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DlDocActivity dlDocActivity) {
            super(1);
            this.f22043e = dlDocActivity;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [androidx.databinding.h] */
        /* JADX WARNING: type inference failed for: r1v3 */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse r5) {
            /*
                r4 = this;
                com.nic.mparivahan.dlservices.data.model.temp.ResponseBean r0 = r5.getResponseBean()     // Catch:{ Exception -> 0x00c5 }
                r1 = 0
                if (r0 == 0) goto L_0x008e
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x00c5 }
                if (r0 != 0) goto L_0x000f
                goto L_0x008e
            L_0x000f:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x00c5 }
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x008e
                java.util.List r0 = r5.getDocumentList()     // Catch:{ Exception -> 0x00c5 }
                if (r0 == 0) goto L_0x005f
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x00c5 }
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00c5 }
                r2 = 1
                r0 = r0 ^ r2
                if (r0 != r2) goto L_0x005f
                java.util.List r0 = r5.getDCodes()     // Catch:{ Exception -> 0x00c5 }
                java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x00c5 }
                if (r0 == 0) goto L_0x0054
                boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00c5 }
                if (r0 == 0) goto L_0x0036
                goto L_0x0054
            L_0x0036:
                java.util.List r0 = r5.getDCodes()     // Catch:{ Exception -> 0x00c5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00c5 }
            L_0x003e:
                boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x00c5 }
                if (r1 == 0) goto L_0x0054
                java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x00c5 }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00c5 }
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r2 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                java.util.ArrayList r2 = r2.f22030c0     // Catch:{ Exception -> 0x00c5 }
                r2.add(r1)     // Catch:{ Exception -> 0x00c5 }
                goto L_0x003e
            L_0x0054:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                java.util.List r5 = r5.getDocumentList()     // Catch:{ Exception -> 0x00c5 }
                r0.e2(r5)     // Catch:{ Exception -> 0x00c5 }
                goto L_0x00c5
            L_0x005f:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r5 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                nj.q r5 = r5.K     // Catch:{ Exception -> 0x00c5 }
                if (r5 != 0) goto L_0x006d
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x00c5 }
                r5 = r1
            L_0x006d:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r0 = r0.M     // Catch:{ Exception -> 0x00c5 }
                if (r0 != 0) goto L_0x007b
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00c5 }
                r0 = r1
            L_0x007b:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r2 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r2 = r2.O     // Catch:{ Exception -> 0x00c5 }
                if (r2 != 0) goto L_0x0089
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x00c5 }
                goto L_0x008a
            L_0x0089:
                r1 = r2
            L_0x008a:
                r5.p(r0, r1)     // Catch:{ Exception -> 0x00c5 }
                goto L_0x00c5
            L_0x008e:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                ni.p3 r0 = r0.J     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r2 = "mBinding"
                if (r0 != 0) goto L_0x009c
                cm.l.v(r2)     // Catch:{ Exception -> 0x00c5 }
                r0 = r1
            L_0x009c:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.Z     // Catch:{ Exception -> 0x00c5 }
                r3 = 8
                r0.setVisibility(r3)     // Catch:{ Exception -> 0x00c5 }
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                com.nic.mparivahan.dlservices.data.model.temp.ResponseBean r5 = r5.getResponseBean()     // Catch:{ Exception -> 0x00c5 }
                if (r5 == 0) goto L_0x00b0
                java.lang.String r5 = r5.getDeveloperMessage()     // Catch:{ Exception -> 0x00c5 }
                goto L_0x00b1
            L_0x00b0:
                r5 = r1
            L_0x00b1:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r3 = r4.f22043e     // Catch:{ Exception -> 0x00c5 }
                ni.p3 r3 = r3.J     // Catch:{ Exception -> 0x00c5 }
                if (r3 != 0) goto L_0x00bd
                cm.l.v(r2)     // Catch:{ Exception -> 0x00c5 }
                goto L_0x00be
            L_0x00bd:
                r1 = r3
            L_0x00be:
                android.view.View r1 = r1.m()     // Catch:{ Exception -> 0x00c5 }
                r0.t1(r5, r1)     // Catch:{ Exception -> 0x00c5 }
            L_0x00c5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.c.b(com.nic.mparivahan.dlservices.data.model.temp.UploadDocListResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadDocListResponse) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocActivity f22044e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DlDocActivity dlDocActivity) {
            super(1);
            this.f22044e = dlDocActivity;
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
                                this.f22044e.X2();
                                return;
                            } else {
                                this.f22044e.t2(insertedUploadDocResponse.getInsertedDocBean());
                                return;
                            }
                        }
                    }
                }
                DlDocActivity dlDocActivity = this.f22044e;
                InsertedUploadResponseMessage responseMessage2 = insertedUploadDocResponse.getResponseMessage();
                p3 p3Var = null;
                String developerMessage = responseMessage2 != null ? responseMessage2.getDeveloperMessage() : null;
                p3 R1 = this.f22044e.J;
                if (R1 == null) {
                    cm.l.v("mBinding");
                } else {
                    p3Var = R1;
                }
                dlDocActivity.t1(developerMessage, p3Var.m());
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
        final /* synthetic */ DlDocActivity f22045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DlDocActivity dlDocActivity) {
            super(1);
            this.f22045e = dlDocActivity;
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
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                ni.p3 r0 = r0.J     // Catch:{ Exception -> 0x00bc }
                r1 = 0
                if (r0 != 0) goto L_0x000f
                java.lang.String r0 = "mBinding"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00bc }
                r0 = r1
            L_0x000f:
                com.nic.mparivahan.dlservices.widget.CustomWegetLayout r0 = r0.Z     // Catch:{ Exception -> 0x00bc }
                r2 = 0
                r0.c(r2)     // Catch:{ Exception -> 0x00bc }
                if (r5 == 0) goto L_0x00a1
                java.lang.Integer r0 = r5.getStatusCode()     // Catch:{ Exception -> 0x00bc }
                if (r0 != 0) goto L_0x001f
                goto L_0x00a1
            L_0x001f:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x00bc }
                r3 = 200(0xc8, float:2.8E-43)
                if (r0 != r3) goto L_0x00a1
                if (r5 == 0) goto L_0x0036
                java.util.List r0 = r5.getResponses()     // Catch:{ Exception -> 0x00bc }
                if (r0 == 0) goto L_0x0036
                java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x00bc }
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r0     // Catch:{ Exception -> 0x00bc }
                goto L_0x0037
            L_0x0036:
                r0 = r1
            L_0x0037:
                cm.l.c(r0)     // Catch:{ Exception -> 0x00bc }
                java.lang.Integer r0 = r0.getStatusCode()     // Catch:{ Exception -> 0x00bc }
                if (r0 != 0) goto L_0x0041
                goto L_0x00a1
            L_0x0041:
                int r0 = r0.intValue()     // Catch:{ Exception -> 0x00bc }
                if (r0 != r3) goto L_0x00a1
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r5 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.util.ArrayList r5 = r5.T     // Catch:{ Exception -> 0x00bc }
                boolean r5 = r5.isEmpty()     // Catch:{ Exception -> 0x00bc }
                r5 = r5 ^ 1
                if (r5 == 0) goto L_0x005e
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r5 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.util.ArrayList r5 = r5.T     // Catch:{ Exception -> 0x00bc }
                r5.clear()     // Catch:{ Exception -> 0x00bc }
            L_0x005e:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r5 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                nj.q r5 = r5.K     // Catch:{ Exception -> 0x00bc }
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = "viewModel"
                cm.l.v(r5)     // Catch:{ Exception -> 0x00bc }
                r5 = r1
            L_0x006c:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.lang.String r0 = r0.M     // Catch:{ Exception -> 0x00bc }
                if (r0 != 0) goto L_0x007a
                java.lang.String r0 = "mApplNo"
                cm.l.v(r0)     // Catch:{ Exception -> 0x00bc }
                r0 = r1
            L_0x007a:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r2 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.lang.String r2 = r2.O     // Catch:{ Exception -> 0x00bc }
                if (r2 != 0) goto L_0x0088
                java.lang.String r2 = "mApplStateCd"
                cm.l.v(r2)     // Catch:{ Exception -> 0x00bc }
                r2 = r1
            L_0x0088:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r3 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.lang.String r3 = r3.R     // Catch:{ Exception -> 0x00bc }
                if (r3 != 0) goto L_0x0096
                java.lang.String r3 = "serviceCode"
                cm.l.v(r3)     // Catch:{ Exception -> 0x00bc }
                goto L_0x0097
            L_0x0096:
                r1 = r3
            L_0x0097:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r3 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                java.lang.String r3 = r3.g2()     // Catch:{ Exception -> 0x00bc }
                r5.m(r0, r2, r1, r3)     // Catch:{ Exception -> 0x00bc }
                goto L_0x00bc
            L_0x00a1:
                com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r0 = r4.f22045e     // Catch:{ Exception -> 0x00bc }
                if (r5 == 0) goto L_0x00b2
                java.util.List r5 = r5.getResponses()     // Catch:{ Exception -> 0x00bc }
                if (r5 == 0) goto L_0x00b2
                java.lang.Object r5 = r5.get(r2)     // Catch:{ Exception -> 0x00bc }
                r1 = r5
                com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem r1 = (com.nic.mparivahan.dlservices.data.model.temp.ResponsesItem) r1     // Catch:{ Exception -> 0x00bc }
            L_0x00b2:
                cm.l.c(r1)     // Catch:{ Exception -> 0x00bc }
                java.lang.String r5 = r1.getDeveloperMessage()     // Catch:{ Exception -> 0x00bc }
                r0.I2(r5)     // Catch:{ Exception -> 0x00bc }
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.e.b(com.nic.mparivahan.dlservices.data.model.temp.UploadedDocResponse):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((UploadedDocResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocActivity f22046e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DlDocActivity dlDocActivity) {
            super(1);
            this.f22046e = dlDocActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            try {
                p3 R1 = this.f22046e.J;
                if (R1 == null) {
                    cm.l.v("mBinding");
                    R1 = null;
                }
                R1.P.c(false);
                if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    this.f22046e.W2(applStatusDetailsItem.getApplFlowStatusList());
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
        final /* synthetic */ DlDocActivity f22047e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(DlDocActivity dlDocActivity) {
            super(1);
            this.f22047e = dlDocActivity;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f22047e.f22039l0.a(intent);
            this.f22047e.U2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlDocActivity f22048e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(DlDocActivity dlDocActivity) {
            super(1);
            this.f22048e = dlDocActivity;
        }

        public final void b(Intent intent) {
            cm.l.f(intent, "intent");
            this.f22048e.f22039l0.a(intent);
            this.f22048e.U2(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Intent) obj);
            return x.f30437a;
        }
    }

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22049a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f22049a = lVar;
        }

        public final pl.c a() {
            return this.f22049a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22049a.invoke(obj);
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

    public DlDocActivity() {
        d.c y02 = y0(new e.d(), new j(this));
        cm.l.e(y02, "registerForActivityResult(...)");
        this.f22039l0 = y02;
        d.c y03 = y0(new e.b(), new k(this));
        cm.l.e(y03, "registerForActivityResult(...)");
        this.f22040m0 = y03;
    }

    /* access modifiers changed from: private */
    public static final void B2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        Intent intent = new Intent(dlDocActivity, DlServiceDetailsActivity.class);
        intent.putExtra("DL", dlDocActivity.U);
        intent.putExtra("dob", dlDocActivity.V);
        intent.putExtra("DLDetails", dlDocActivity.h2());
        intent.putExtra("Mobile_no", dlDocActivity.W);
        intent.putExtra("lastEndorsedRTO", dlDocActivity.X);
        intent.putExtra("lastEndorsedState", dlDocActivity.Y);
        String str = dlDocActivity.Q;
        if (str == null) {
            cm.l.v("lastEndorseRTOCode");
            str = null;
        }
        intent.putExtra("lastEndorsedRTOCode", str);
        intent.putExtra("lastEndorseStateCode", dlDocActivity.Z);
        dlDocActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void C2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        dlDocActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void D2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        try {
            if (cm.l.a(dlDocActivity.n2().b(), VContant.MULTISERVICE_PURPOSE_CODE) && dlDocActivity.k2().size() > 1) {
                Dialog dialog = new Dialog(dlDocActivity);
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
                TextView textView2 = (TextView) findViewById3;
                View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
                cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView3 = (TextView) findViewById4;
                ((ImageView) findViewById).setOnClickListener(new nj.l(dialog));
                int size = dlDocActivity.k2().size();
                String str = "";
                int i10 = 0;
                String str2 = str;
                while (i10 < size) {
                    str = str + ((String) dlDocActivity.k2().get(i10)) + 10;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    i10++;
                    sb2.append(i10);
                    sb2.append(".\n");
                    str2 = sb2.toString();
                }
                textView2.setText(str);
                textView3.setText(str2);
                textView.setOnClickListener(new nj.m(dialog));
                Window window2 = dialog.getWindow();
                cm.l.c(window2);
                window2.setGravity(48);
                window2.setLayout(-2, -2);
                dialog.show();
            }
        } catch (Exception e10) {
            Log.e("click_error", e10.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void F2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void G2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new o(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void H2(Dialog dialog, DlDocActivity dlDocActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlDocActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlDocActivity, DashBoard.class);
        intent.setFlags(67108864);
        dlDocActivity.startActivity(intent);
        dlDocActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void I2(String str) {
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
    public static final void J2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final void M2() {
    }

    /* access modifiers changed from: private */
    public final void U2(boolean z10) {
        if (z10) {
            try {
                this.f22032e0 = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.f22032e0;
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
    public final void W2(List list) {
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
                num = ((ApplFlowStatusListItem) obj2).getAcCd();
                break;
            }
            i10++;
        }
        if (num == null) {
            new DLServiceFinalSubmitedActivity().D1(this);
            return;
        }
        try {
            DlLogUpdate.a aVar = DlLogUpdate.f8706k;
            String str3 = this.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str = null;
            } else {
                str = str3;
            }
            String str4 = this.M;
            if (str4 == null) {
                cm.l.v("mApplNo");
                str4 = null;
            }
            long parseLong = Long.parseLong(str4);
            int parseInt = Integer.parseInt(l2().k());
            String str5 = this.V;
            cm.l.c(str5);
            String str6 = this.U;
            cm.l.c(str6);
            String str7 = this.Q;
            if (str7 == null) {
                cm.l.v("lastEndorseRTOCode");
                str2 = null;
            } else {
                str2 = str7;
            }
            aVar.a(this, str, parseLong, parseInt, str5, str6, str2);
        } catch (Exception unused) {
        }
        A2(num);
    }

    /* access modifiers changed from: private */
    public final void X2() {
        try {
            if (this.T.size() > 0) {
                List t02 = y.t0(y.x0(this.T));
                this.T.clear();
                this.T.addAll(t02);
            }
            p3 p3Var = this.J;
            p3 p3Var2 = null;
            if (p3Var == null) {
                cm.l.v("mBinding");
                p3Var = null;
            }
            p3Var.O.p();
            p3 p3Var3 = this.J;
            if (p3Var3 == null) {
                cm.l.v("mBinding");
                p3Var3 = null;
            }
            p3Var3.O.setVisibility(8);
            Application application = getApplication();
            cm.l.e(application, "getApplication(...)");
            this.L = new a(this, application, this.T, this);
            p3 p3Var4 = this.J;
            if (p3Var4 == null) {
                cm.l.v("mBinding");
                p3Var4 = null;
            }
            RecyclerView recyclerView = p3Var4.f27920a0;
            a aVar = this.L;
            if (aVar == null) {
                cm.l.v("adapter");
                aVar = null;
            }
            recyclerView.setAdapter(aVar);
            p3 p3Var5 = this.J;
            if (p3Var5 == null) {
                cm.l.v("mBinding");
                p3Var5 = null;
            }
            p3Var5.f27926z.setVisibility(0);
            ArrayList arrayList = this.f22030c0;
            if (arrayList != null && arrayList.size() > 0) {
                int size = this.f22030c0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Integer num = (Integer) this.f22030c0.get(i10);
                    String valueOf = num != null ? String.valueOf(num) : null;
                    int size2 = this.T.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (i11 < this.T.size()) {
                            DocumentListItem documentListItem = (DocumentListItem) this.T.get(i11);
                            if (cm.l.a(valueOf, String.valueOf(documentListItem != null ? documentListItem.getId() : null))) {
                                a aVar2 = this.L;
                                if (aVar2 == null) {
                                    cm.l.v("adapter");
                                    aVar2 = null;
                                }
                                aVar2.Z(i11);
                            }
                        }
                    }
                }
                if (this.T.size() > 0) {
                    p3 p3Var6 = this.J;
                    if (p3Var6 == null) {
                        cm.l.v("mBinding");
                    } else {
                        p3Var2 = p3Var6;
                    }
                    p3Var2.f27926z.setVisibility(0);
                    return;
                }
                p3 p3Var7 = this.J;
                if (p3Var7 == null) {
                    cm.l.v("mBinding");
                } else {
                    p3Var2 = p3Var7;
                }
                p3Var2.f27926z.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    private final void Y2() {
        try {
            Intent intent = new Intent(this, DlDocActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", h2());
            intent.putExtra("DL", this.U);
            intent.putExtra("dob", this.V);
            intent.putExtra("DLDetails", h2());
            intent.putExtra("Mobile_no", this.W);
            intent.putExtra("lastEndorsedRTO", this.X);
            intent.putExtra("lastEndorsedState", this.Y);
            String str4 = this.Q;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.Z);
            if (cm.l.a(n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", m2());
                intent.putExtra("listHeaderSteps", k2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void Z2() {
        try {
            Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", h2());
            intent.putExtra("DL", this.U);
            intent.putExtra("dob", this.V);
            intent.putExtra("DLDetails", h2());
            intent.putExtra("Mobile_no", this.W);
            intent.putExtra("lastEndorsedRTO", this.X);
            intent.putExtra("lastEndorsedState", this.Y);
            String str4 = this.Q;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.Z);
            if (cm.l.a(n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", m2());
                intent.putExtra("listHeaderSteps", k2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void a3(DlDocActivity dlDocActivity, d.a aVar) {
        Bitmap bitmap;
        String str;
        cm.l.f(dlDocActivity, "this$0");
        cm.l.f(aVar, "result");
        try {
            int d10 = aVar.d();
            Intent c10 = aVar.c();
            if (d10 == -1) {
                a aVar2 = null;
                Uri data = c10 != null ? c10.getData() : null;
                cm.l.c(data);
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = dlDocActivity.getContentResolver();
                    cm.l.c(data);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, data));
                    str = "decodeBitmap(...)";
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(dlDocActivity.getContentResolver(), data);
                    str = "getBitmap(...)";
                }
                cm.l.e(bitmap, str);
                File file = new File(oi.h.b(dlDocActivity, data));
                DocumentListItem documentListItem = (DocumentListItem) dlDocActivity.T.get(dlDocActivity.f22038k0);
                if (documentListItem != null) {
                    documentListItem.setBrowseStatus(true);
                }
                DocumentListItem documentListItem2 = (DocumentListItem) dlDocActivity.T.get(dlDocActivity.f22038k0);
                if (documentListItem2 != null) {
                    documentListItem2.setURI(data);
                }
                DocumentListItem documentListItem3 = (DocumentListItem) dlDocActivity.T.get(dlDocActivity.f22038k0);
                if (documentListItem3 != null) {
                    documentListItem3.setFileNmae(file.getName());
                }
                String f10 = com.nic.mparivahan.dlservices.utilities.e.f(bitmap);
                if (f10 != null) {
                    DocumentListItem documentListItem4 = (DocumentListItem) dlDocActivity.T.get(dlDocActivity.f22038k0);
                    if (documentListItem4 != null) {
                        documentListItem4.setFileToUpload(f10);
                    }
                }
                a aVar3 = dlDocActivity.L;
                if (aVar3 == null) {
                    cm.l.v("adapter");
                } else {
                    aVar2 = aVar3;
                }
                aVar2.k(dlDocActivity.f22038k0);
            } else if (d10 == 64) {
                dlDocActivity.U2(false);
                Toast.makeText(dlDocActivity, t2.a.f16505a.a(c10), 0).show();
                return;
            }
            dlDocActivity.U2(false);
        } catch (Exception unused) {
        }
    }

    private final void b3() {
        try {
            Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", h2());
            intent.putExtra("DL", this.U);
            intent.putExtra("dob", this.V);
            intent.putExtra("DLDetails", h2());
            intent.putExtra("Mobile_no", this.W);
            intent.putExtra("lastEndorsedRTO", this.X);
            intent.putExtra("lastEndorsedState", this.Y);
            String str4 = this.Q;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.Z);
            if (cm.l.a(n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", m2());
                intent.putExtra("listHeaderSteps", k2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void c3() {
        try {
            Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
                str3 = null;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str3);
            intent.putExtra("dl_st_dl_details_obj", h2());
            intent.putExtra("DL", this.U);
            intent.putExtra("dob", this.V);
            intent.putExtra("DLDetails", h2());
            intent.putExtra("Mobile_no", this.W);
            intent.putExtra("lastEndorsedRTO", this.X);
            intent.putExtra("lastEndorsedState", this.Y);
            String str4 = this.Q;
            if (str4 == null) {
                cm.l.v("lastEndorseRTOCode");
            } else {
                str2 = str4;
            }
            intent.putExtra("lastEndorsedRTOCode", str2);
            intent.putExtra("lastEndorseStateCode", this.Z);
            if (cm.l.a(n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", m2());
                intent.putExtra("listHeaderSteps", k2());
            }
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void d3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            String str = null;
            if (documentListItem != null) {
                String str2 = this.M;
                if (str2 == null) {
                    cm.l.v("mApplNo");
                    str2 = null;
                }
                documentListItem.setApplication_no(str2);
            }
            if (documentListItem != null) {
                String str3 = this.O;
                if (str3 == null) {
                    cm.l.v("mApplStateCd");
                    str3 = null;
                }
                documentListItem.setStateCode(str3);
            }
            if (documentListItem != null) {
                String str4 = this.R;
                if (str4 == null) {
                    cm.l.v("serviceCode");
                } else {
                    str = str4;
                }
                documentListItem.setTransationCode(str);
            }
            this.T.add(documentListItem);
        }
    }

    /* access modifiers changed from: private */
    public final void e2(List list) {
        String str;
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            str = null;
            if (!it.hasNext()) {
                break;
            }
            DocumentListItem documentListItem = (DocumentListItem) it.next();
            for (DocumentListItem documentListItem2 : this.T) {
                if (cm.l.a(documentListItem != null ? documentListItem.getId() : null, documentListItem2 != null ? documentListItem2.getId() : null)) {
                    z10 = true;
                }
            }
            if (!z10) {
                if (documentListItem != null) {
                    String str2 = this.M;
                    if (str2 == null) {
                        cm.l.v("mApplNo");
                        str2 = null;
                    }
                    documentListItem.setApplication_no(str2);
                }
                if (documentListItem != null) {
                    String str3 = this.O;
                    if (str3 == null) {
                        cm.l.v("mApplStateCd");
                        str3 = null;
                    }
                    documentListItem.setStateCode(str3);
                }
                if (documentListItem != null) {
                    String str4 = this.R;
                    if (str4 == null) {
                        cm.l.v("serviceCode");
                    } else {
                        str = str4;
                    }
                    documentListItem.setTransationCode(str);
                }
                this.T.add(documentListItem);
            }
        }
        M2();
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            q qVar = this.K;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str5 = this.M;
            if (str5 == null) {
                cm.l.v("mApplNo");
                str5 = null;
            }
            String str6 = this.O;
            if (str6 == null) {
                cm.l.v("mApplStateCd");
            } else {
                str = str6;
            }
            qVar.p(str5, str);
            return;
        }
        Toast.makeText(getApplicationContext(), j2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [androidx.databinding.h] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [androidx.recyclerview.widget.RecyclerView$h] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i2(com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r6, android.net.Uri r7) {
        /*
            java.lang.String r0 = "this$0"
            cm.l.f(r6, r0)
            if (r7 == 0) goto L_0x00e6
            java.lang.String r0 = com.nic.mparivahan.dlservices.utilities.e.q(r6, r7)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = com.nic.mparivahan.dlservices.utilities.e.r(r6, r7)     // Catch:{ Exception -> 0x00e6 }
            java.util.ArrayList r2 = r6.f2()     // Catch:{ Exception -> 0x00e6 }
            java.lang.CharSequence r3 = km.q.B0(r1)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00e6 }
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x00e6 }
            r3 = 0
            if (r2 == 0) goto L_0x00c3
            java.util.ArrayList r2 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r4 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r2 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r2     // Catch:{ Exception -> 0x00e6 }
            r4 = 1
            if (r2 != 0) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r2.setBrowseStatus(r4)     // Catch:{ Exception -> 0x00e6 }
        L_0x0033:
            java.util.ArrayList r2 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r5 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r2 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r2     // Catch:{ Exception -> 0x00e6 }
            if (r2 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            r2.setURI(r7)     // Catch:{ Exception -> 0x00e6 }
        L_0x0043:
            java.util.ArrayList r2 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r5 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r2 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r2     // Catch:{ Exception -> 0x00e6 }
            if (r2 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r2.setFileNmae(r0)     // Catch:{ Exception -> 0x00e6 }
        L_0x0053:
            java.lang.CharSequence r0 = km.q.B0(r1)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r1 = "pdf"
            boolean r0 = km.p.o(r0, r1, r4)     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x0093
            java.lang.String r7 = com.nic.mparivahan.dlservices.utilities.e.a(r6, r7)     // Catch:{ Exception -> 0x00e6 }
            java.util.ArrayList r0 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r1 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r0     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r0.setFileToUpload(r7)     // Catch:{ Exception -> 0x00e6 }
        L_0x0077:
            java.lang.String r7 = "log2"
            java.util.ArrayList r0 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r1 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r0     // Catch:{ Exception -> 0x00e6 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r0 = r0.getFileToUpload()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x008b
        L_0x008a:
            r0 = r3
        L_0x008b:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00e6 }
            android.util.Log.e(r7, r0)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00b2
        L_0x0093:
            android.content.ContentResolver r0 = r6.getContentResolver()     // Catch:{ Exception -> 0x00e6 }
            android.graphics.Bitmap r7 = android.provider.MediaStore.Images.Media.getBitmap(r0, r7)     // Catch:{ Exception -> 0x00e6 }
            cm.l.c(r7)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r7 = com.nic.mparivahan.dlservices.utilities.e.f(r7)     // Catch:{ Exception -> 0x00e6 }
            java.util.ArrayList r0 = r6.T     // Catch:{ Exception -> 0x00e6 }
            int r1 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x00e6 }
            com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem r0 = (com.nic.mparivahan.dlservices.data.model.temp.DocumentListItem) r0     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r0.setFileToUpload(r7)     // Catch:{ Exception -> 0x00e6 }
        L_0x00b2:
            com.nic.mparivahan.dlservices.ui.dms.a r7 = r6.L     // Catch:{ Exception -> 0x00e6 }
            if (r7 != 0) goto L_0x00bc
            java.lang.String r7 = "adapter"
            cm.l.v(r7)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00bd
        L_0x00bc:
            r3 = r7
        L_0x00bd:
            int r6 = r6.f22038k0     // Catch:{ Exception -> 0x00e6 }
            r3.k(r6)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00e6
        L_0x00c3:
            ld.c r7 = r6.j2()     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r0 = "upload_file_types"
            r1 = 2132019564(0x7f14096c, float:1.9677466E38)
            java.lang.String r1 = r6.getString(r1)     // Catch:{ Exception -> 0x00e6 }
            java.lang.String r7 = r7.b(r0, r1)     // Catch:{ Exception -> 0x00e6 }
            ni.p3 r0 = r6.J     // Catch:{ Exception -> 0x00e6 }
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "mBinding"
            cm.l.v(r0)     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00df
        L_0x00de:
            r3 = r0
        L_0x00df:
            android.view.View r0 = r3.m()     // Catch:{ Exception -> 0x00e6 }
            r6.t1(r7, r0)     // Catch:{ Exception -> 0x00e6 }
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.i2(com.nic.mparivahan.dlservices.ui.dms.DlDocActivity, android.net.Uri):void");
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void o2(java.util.ArrayList r7) {
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
            ld.c r7 = r6.j2()
            r0 = 2132017671(0x7f140207, float:1.9673627E38)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = "label_document_uploaded"
            java.lang.String r7 = r7.b(r1, r0)
            r6.K2(r6, r7)
            nj.q r7 = r6.K
            if (r7 != 0) goto L_0x0048
            java.lang.String r7 = "viewModel"
            cm.l.v(r7)
            r7 = r4
        L_0x0048:
            java.lang.String r0 = r6.M
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "mApplNo"
            cm.l.v(r0)
            r0 = r4
        L_0x0052:
            java.lang.String r1 = r6.R
            if (r1 != 0) goto L_0x005c
            java.lang.String r1 = "serviceCode"
            cm.l.v(r1)
            r1 = r4
        L_0x005c:
            java.lang.String r2 = r6.O
            if (r2 != 0) goto L_0x0066
            java.lang.String r2 = "mApplStateCd"
            cm.l.v(r2)
            r2 = r4
        L_0x0066:
            java.lang.String r5 = r6.Q
            if (r5 != 0) goto L_0x0070
            java.lang.String r5 = "lastEndorseRTOCode"
            cm.l.v(r5)
            r5 = r4
        L_0x0070:
            r7.r(r0, r1, r2, r5)
            ni.p3 r7 = r6.J
            java.lang.String r0 = "mBinding"
            if (r7 != 0) goto L_0x007d
            cm.l.v(r0)
            r7 = r4
        L_0x007d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r7.Z
            r1 = 8
            r7.setVisibility(r1)
            ni.p3 r7 = r6.J
            if (r7 != 0) goto L_0x008c
            cm.l.v(r0)
            goto L_0x008d
        L_0x008c:
            r4 = r7
        L_0x008d:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r7 = r4.P
            r7.setVisibility(r3)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.o2(java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0174 A[Catch:{ Exception -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0179 A[Catch:{ Exception -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x017c A[Catch:{ Exception -> 0x01c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01ba A[Catch:{ Exception -> 0x01c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p2() {
        /*
            r9 = this;
            java.lang.String r0 = "DLDetails"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            java.lang.String r2 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            ld.f r3 = new ld.f
            r3.<init>(r9)
            android.content.Intent r3 = r9.getIntent()
            r4 = 0
            java.lang.String r5 = "mBinding"
            r6 = 0
            if (r3 == 0) goto L_0x01c6
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            android.os.Bundle r3 = r3.getExtras()     // Catch:{ Exception -> 0x01c6 }
            if (r3 == 0) goto L_0x0026
            java.lang.String r7 = "dl_st_appl_ackno_no"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0027
        L_0x0026:
            r3 = r6
        L_0x0027:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.M = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            android.os.Bundle r3 = r3.getExtras()     // Catch:{ Exception -> 0x01c6 }
            if (r3 == 0) goto L_0x003e
            java.lang.String r7 = "dl_st_appl_ackno_no_dob"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x003f
        L_0x003e:
            r3 = r6
        L_0x003f:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.N = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            android.os.Bundle r3 = r3.getExtras()     // Catch:{ Exception -> 0x01c6 }
            if (r3 == 0) goto L_0x0056
            java.lang.String r7 = "lastEndorseRTOCode"
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x0057
        L_0x0056:
            r3 = r6
        L_0x0057:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.Q = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "DL"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.U = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "dob"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.V = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "Mobile_no"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01c6 }
            r9.W = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.io.Serializable r3 = r3.getSerializableExtra(r0)     // Catch:{ Exception -> 0x01c6 }
            cm.l.d(r3, r2)     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r3 = (com.nic.mparivahan.Dl.Model.DldetobjX) r3     // Catch:{ Exception -> 0x01c6 }
            r9.P2(r3)     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "lastEndorsedRTO"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            cm.l.d(r3, r1)     // Catch:{ Exception -> 0x01c6 }
            r9.X = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "lastEndorsedState"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            cm.l.d(r3, r1)     // Catch:{ Exception -> 0x01c6 }
            r9.Y = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r7 = "lastEndorseStateCode"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01c6 }
            cm.l.d(r3, r1)     // Catch:{ Exception -> 0x01c6 }
            r9.Z = r3     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r1 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            java.io.Serializable r0 = r1.getSerializableExtra(r0)     // Catch:{ Exception -> 0x01c6 }
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x01c6 }
            r9.P2(r0)     // Catch:{ Exception -> 0x01c6 }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x01c6 }
            android.os.Bundle r0 = r0.getExtras()     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = "dl_st_dl_details_obj"
            java.io.Serializable r0 = r0.getSerializable(r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x00ec
        L_0x00eb:
            r0 = r6
        L_0x00ec:
            cm.l.d(r0, r2)     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = (com.nic.mparivahan.Dl.Model.DldetobjX) r0     // Catch:{ Exception -> 0x01c6 }
            r9.P2(r0)     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r9.h2()     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.BioObjX r0 = r0.getBioObj()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r0 = r0.getBioDlno()     // Catch:{ Exception -> 0x01c6 }
            r1 = 32
            java.lang.String r2 = "DL No. : "
            java.lang.String r3 = "dl_no"
            if (r0 == 0) goto L_0x0143
            int r0 = r0.length()     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x010f
            goto L_0x0143
        L_0x010f:
            ni.p3 r0 = r9.J     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x0117
            cm.l.v(r5)     // Catch:{ Exception -> 0x01c6 }
            r0 = r6
        L_0x0117:
            android.widget.TextView r0 = r0.A     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            r7.<init>()     // Catch:{ Exception -> 0x01c6 }
            ld.c r8 = r9.j2()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = r8.b(r3, r2)     // Catch:{ Exception -> 0x01c6 }
            r7.append(r2)     // Catch:{ Exception -> 0x01c6 }
            r7.append(r1)     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r9.h2()     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.BioObjX r1 = r1.getBioObj()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = r1.getBioDlno()     // Catch:{ Exception -> 0x01c6 }
            r7.append(r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x013b:
            java.lang.String r1 = r7.toString()     // Catch:{ Exception -> 0x01c6 }
            r0.setText(r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x016a
        L_0x0143:
            java.lang.String r0 = r9.U     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x016a
            ni.p3 r0 = r9.J     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x014f
            cm.l.v(r5)     // Catch:{ Exception -> 0x01c6 }
            r0 = r6
        L_0x014f:
            android.widget.TextView r0 = r0.A     // Catch:{ Exception -> 0x01c6 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
            r7.<init>()     // Catch:{ Exception -> 0x01c6 }
            ld.c r8 = r9.j2()     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r2 = r8.b(r3, r2)     // Catch:{ Exception -> 0x01c6 }
            r7.append(r2)     // Catch:{ Exception -> 0x01c6 }
            r7.append(r1)     // Catch:{ Exception -> 0x01c6 }
            java.lang.String r1 = r9.U     // Catch:{ Exception -> 0x01c6 }
            r7.append(r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x013b
        L_0x016a:
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r9.h2()     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r0 = r0.getBioImgObj()     // Catch:{ Exception -> 0x01c6 }
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = r0.getBiPhoto()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x017a
        L_0x0179:
            r0 = r6
        L_0x017a:
            if (r0 == 0) goto L_0x01b6
            int r0 = r0.length()     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x0183
            goto L_0x01b6
        L_0x0183:
            ni.p3 r0 = r9.J     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x018b
            cm.l.v(r5)     // Catch:{ Exception -> 0x01c6 }
            r0 = r6
        L_0x018b:
            ni.dc r0 = r0.F     // Catch:{ Exception -> 0x01c6 }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x01c6 }
            r0.setVisibility(r4)     // Catch:{ Exception -> 0x01c6 }
            ni.p3 r0 = r9.J     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x019a
            cm.l.v(r5)     // Catch:{ Exception -> 0x01c6 }
            r0 = r6
        L_0x019a:
            ni.dc r0 = r0.F     // Catch:{ Exception -> 0x01c6 }
            android.widget.ImageView r0 = r0.f25956b     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.DldetobjX r1 = r9.h2()     // Catch:{ Exception -> 0x01c6 }
            com.nic.mparivahan.Dl.Model.BioImgObjX r1 = r1.getBioImgObj()     // Catch:{ Exception -> 0x01c6 }
            if (r1 == 0) goto L_0x01ad
            java.lang.String r1 = r1.getBiPhoto()     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01ae
        L_0x01ad:
            r1 = r6
        L_0x01ae:
            android.graphics.Bitmap r1 = com.nic.mparivahan.dlservices.utilities.d.a(r1)     // Catch:{ Exception -> 0x01c6 }
            r0.setImageBitmap(r1)     // Catch:{ Exception -> 0x01c6 }
            goto L_0x01c6
        L_0x01b6:
            ni.p3 r0 = r9.J     // Catch:{ Exception -> 0x01c6 }
            if (r0 != 0) goto L_0x01be
            cm.l.v(r5)     // Catch:{ Exception -> 0x01c6 }
            r0 = r6
        L_0x01be:
            ni.dc r0 = r0.F     // Catch:{ Exception -> 0x01c6 }
            androidx.cardview.widget.CardView r0 = r0.f25960f     // Catch:{ Exception -> 0x01c6 }
            r1 = 4
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x01c6 }
        L_0x01c6:
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r9)
            java.lang.String r1 = "viewModel"
            if (r0 == 0) goto L_0x01f0
            nj.q r0 = r9.K
            if (r0 != 0) goto L_0x01d8
            cm.l.v(r1)
            r0 = r6
        L_0x01d8:
            java.lang.String r2 = r9.M
            if (r2 != 0) goto L_0x01e2
            java.lang.String r2 = "mApplNo"
            cm.l.v(r2)
            r2 = r6
        L_0x01e2:
            java.lang.String r3 = r9.N
            if (r3 != 0) goto L_0x01ec
            java.lang.String r3 = "mApplDob"
            cm.l.v(r3)
            r3 = r6
        L_0x01ec:
            r0.g(r2, r3)
            goto L_0x020c
        L_0x01f0:
            android.content.Context r0 = r9.getApplicationContext()
            ld.c r2 = r9.j2()
            r3 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r7 = "label_log_check_internet"
            java.lang.String r2 = r2.b(r7, r3)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r4)
            r0.show()
        L_0x020c:
            nj.q r0 = r9.K
            if (r0 != 0) goto L_0x0214
            cm.l.v(r1)
            r0 = r6
        L_0x0214:
            androidx.lifecycle.y r0 = r0.n()
            com.nic.mparivahan.dlservices.ui.dms.DlDocActivity$a r1 = new com.nic.mparivahan.dlservices.ui.dms.DlDocActivity$a
            r1.<init>(r9)
            com.nic.mparivahan.dlservices.ui.dms.DlDocActivity$i r2 = new com.nic.mparivahan.dlservices.ui.dms.DlDocActivity$i
            r2.<init>(r1)
            r0.g(r9, r2)
            ni.p3 r0 = r9.J
            if (r0 != 0) goto L_0x022d
            cm.l.v(r5)
            r0 = r6
        L_0x022d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f27920a0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.<init>(r9)
            r0.setLayoutManager(r1)
            ni.p3 r0 = r9.J
            if (r0 != 0) goto L_0x023f
            cm.l.v(r5)
            r0 = r6
        L_0x023f:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f27920a0
            r1 = 1
            r0.setHasFixedSize(r1)
            ni.p3 r0 = r9.J
            if (r0 != 0) goto L_0x024d
            cm.l.v(r5)
            r0 = r6
        L_0x024d:
            android.widget.ImageView r0 = r0.f27923w
            nj.e r1 = new nj.e
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            ni.p3 r0 = r9.J
            if (r0 != 0) goto L_0x025f
            cm.l.v(r5)
            goto L_0x0260
        L_0x025f:
            r6 = r0
        L_0x0260:
            android.widget.ImageView r0 = r6.f27924x
            nj.f r1 = new nj.f
            r1.<init>(r9)
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.p2():void");
    }

    /* access modifiers changed from: private */
    public static final void q2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        p3 p3Var = dlDocActivity.J;
        p3 p3Var2 = null;
        if (p3Var == null) {
            cm.l.v("mBinding");
            p3Var = null;
        }
        p3Var.f27923w.setVisibility(8);
        p3 p3Var3 = dlDocActivity.J;
        if (p3Var3 == null) {
            cm.l.v("mBinding");
            p3Var3 = null;
        }
        p3Var3.f27924x.setVisibility(0);
        p3 p3Var4 = dlDocActivity.J;
        if (p3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            p3Var2 = p3Var4;
        }
        p3Var2.J.setVisibility(0);
    }

    /* access modifiers changed from: private */
    public static final void r2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        p3 p3Var = dlDocActivity.J;
        p3 p3Var2 = null;
        if (p3Var == null) {
            cm.l.v("mBinding");
            p3Var = null;
        }
        p3Var.f27924x.setVisibility(8);
        p3 p3Var3 = dlDocActivity.J;
        if (p3Var3 == null) {
            cm.l.v("mBinding");
            p3Var3 = null;
        }
        p3Var3.f27923w.setVisibility(0);
        p3 p3Var4 = dlDocActivity.J;
        if (p3Var4 == null) {
            cm.l.v("mBinding");
        } else {
            p3Var2 = p3Var4;
        }
        p3Var2.J.setVisibility(8);
    }

    private final void s2() {
        p3 p3Var = this.J;
        q qVar = null;
        if (p3Var == null) {
            cm.l.v("mBinding");
            p3Var = null;
        }
        p3Var.O.o();
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
            qVar2 = null;
        }
        qVar2.k().g(this, new i(new b(this)));
        q qVar3 = this.K;
        if (qVar3 == null) {
            cm.l.v("viewModel");
            qVar3 = null;
        }
        qVar3.j().g(this, new i(new c(this)));
        q qVar4 = this.K;
        if (qVar4 == null) {
            cm.l.v("viewModel");
            qVar4 = null;
        }
        qVar4.l().g(this, new i(new d(this)));
        q qVar5 = this.K;
        if (qVar5 == null) {
            cm.l.v("viewModel");
            qVar5 = null;
        }
        qVar5.q().g(this, new i(new e(this)));
        q qVar6 = this.K;
        if (qVar6 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar6;
        }
        qVar.o().g(this, new i(new f(this)));
    }

    /* access modifiers changed from: private */
    public final void t2(List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InsertedDocBeanItem insertedDocBeanItem = (InsertedDocBeanItem) it.next();
                    String remarks = insertedDocBeanItem != null ? insertedDocBeanItem.getRemarks() : null;
                    if (remarks == null || remarks.length() == 0) {
                        for (DocumentListItem documentListItem : this.T) {
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
        o2(this.T);
        X2();
    }

    private final boolean u2() {
        for (DocumentListItem documentListItem : this.T) {
            if (documentListItem != null && documentListItem.isBrowseStatus()) {
                return true;
            }
        }
        return false;
    }

    private final void v2() {
        p3 p3Var = this.J;
        p3 p3Var2 = null;
        if (p3Var == null) {
            cm.l.v("mBinding");
            p3Var = null;
        }
        p3Var.Z.setOnClickListener(new p(this));
        p3 p3Var3 = this.J;
        if (p3Var3 == null) {
            cm.l.v("mBinding");
            p3Var3 = null;
        }
        p3Var3.F.f25959e.setOnClickListener(new nj.b(this));
        p3 p3Var4 = this.J;
        if (p3Var4 == null) {
            cm.l.v("mBinding");
            p3Var4 = null;
        }
        p3Var4.P.setOnClickListener(new nj.c(this));
        p3 p3Var5 = this.J;
        if (p3Var5 == null) {
            cm.l.v("mBinding");
        } else {
            p3Var2 = p3Var5;
        }
        p3Var2.K.f29581h.setOnClickListener(new nj.d(this));
    }

    /* access modifiers changed from: private */
    public static final void w2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        try {
            Intent intent = new Intent(dlDocActivity, DlServiceDetailsActivity.class);
            intent.putExtra("DL", dlDocActivity.U);
            intent.putExtra("dob", dlDocActivity.V);
            intent.putExtra("DLDetails", dlDocActivity.h2());
            intent.putExtra("Mobile_no", dlDocActivity.W);
            intent.putExtra("lastEndorsedRTO", dlDocActivity.X);
            intent.putExtra("lastEndorsedState", dlDocActivity.Y);
            String str = dlDocActivity.Q;
            if (str == null) {
                cm.l.v("lastEndorseRTOCode");
                str = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str);
            intent.putExtra("lastEndorseStateCode", dlDocActivity.Z);
            if (cm.l.a(dlDocActivity.n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", dlDocActivity.m2());
                intent.putExtra("listHeaderSteps", dlDocActivity.k2());
            }
            dlDocActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.databinding.h] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x2(com.nic.mparivahan.dlservices.ui.dms.DlDocActivity r4, android.view.View r5) {
        /*
            java.lang.String r5 = "this$0"
            cm.l.f(r4, r5)
            java.util.ArrayList r5 = r4.T
            boolean r5 = r5.isEmpty()
            r0 = 1
            r5 = r5 ^ r0
            java.lang.String r1 = "mBinding"
            r2 = 0
            if (r5 == 0) goto L_0x0066
            boolean r5 = r4.u2()
            if (r5 == 0) goto L_0x0066
            ni.p3 r5 = r4.J
            if (r5 != 0) goto L_0x0020
            cm.l.v(r1)
            r5 = r2
        L_0x0020:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r5 = r5.Z
            r5.c(r0)
            com.nic.mparivahan.a$a r5 = com.nic.mparivahan.a.f9624a
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0048
            nj.q r5 = r4.K
            if (r5 != 0) goto L_0x0037
            java.lang.String r5 = "viewModel"
            cm.l.v(r5)
            r5 = r2
        L_0x0037:
            java.lang.String r0 = r4.Q
            if (r0 != 0) goto L_0x0041
            java.lang.String r0 = "lastEndorseRTOCode"
            cm.l.v(r0)
            goto L_0x0042
        L_0x0041:
            r2 = r0
        L_0x0042:
            java.util.ArrayList r4 = r4.T
            r5.s(r2, r4)
            goto L_0x0087
        L_0x0048:
            android.content.Context r5 = r4.getApplicationContext()
            ld.c r0 = r4.j2()
            r1 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r4 = r4.getString(r1)
            java.lang.String r1 = "label_log_check_internet"
            java.lang.String r4 = r0.b(r1, r4)
            r0 = 0
            android.widget.Toast r4 = android.widget.Toast.makeText(r5, r4, r0)
            r4.show()
            goto L_0x0087
        L_0x0066:
            ld.c r5 = r4.j2()
            r0 = 2132017376(0x7f1400e0, float:1.9673029E38)
            java.lang.String r0 = r4.getString(r0)
            java.lang.String r3 = "label_attach_document"
            java.lang.String r5 = r5.b(r3, r0)
            ni.p3 r0 = r4.J
            if (r0 != 0) goto L_0x007f
            cm.l.v(r1)
            goto L_0x0080
        L_0x007f:
            r2 = r0
        L_0x0080:
            android.view.View r0 = r2.m()
            r4.t1(r5, r0)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.dms.DlDocActivity.x2(com.nic.mparivahan.dlservices.ui.dms.DlDocActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public static final void y2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        dlDocActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void z2(DlDocActivity dlDocActivity, View view) {
        cm.l.f(dlDocActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlDocActivity)) {
            p3 p3Var = dlDocActivity.J;
            String str = null;
            if (p3Var == null) {
                cm.l.v("mBinding");
                p3Var = null;
            }
            p3Var.P.c(true);
            q qVar = dlDocActivity.K;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = dlDocActivity.M;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            String str3 = dlDocActivity.N;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str = str3;
            }
            qVar.h(str2, str);
            return;
        }
        Toast.makeText(dlDocActivity.getApplicationContext(), dlDocActivity.j2().b("label_log_check_internet", dlDocActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    public final void A2(Integer num) {
        if (num != null && num.intValue() == 135) {
            b3();
        } else if (num != null && num.intValue() == 134) {
            Z2();
        } else if (num != null && num.intValue() == 123) {
            Y2();
        } else if (num != null && num.intValue() == 371) {
            c3();
        } else if (num != null && num.intValue() == 455) {
            G2(j2().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void K2(Context context, String str) {
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
        textView.setText(j2().b("btn_ok", context.getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new nj.g(dialog));
        dialog.show();
    }

    public final void N2(String str) {
        cm.l.f(str, "<set-?>");
        this.f22029b0 = str;
    }

    public final void O2(String[] strArr) {
        cm.l.f(strArr, "<set-?>");
        this.S = strArr;
    }

    public final void P2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.P = dldetobjX;
    }

    public final void Q2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f22031d0 = cVar;
    }

    public final void R2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22036i0 = arrayList;
    }

    public final void S2(ld.g gVar) {
        cm.l.f(gVar, "<set-?>");
        this.f22028a0 = gVar;
    }

    public final void T2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f22034g0 = arrayList;
    }

    public final void V2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f22033f0 = fVar;
    }

    public void a(int i10) {
        DocumentListItem documentListItem = (DocumentListItem) this.T.get(i10);
        if (documentListItem != null) {
            documentListItem.setBrowseStatus(false);
        }
        DocumentListItem documentListItem2 = (DocumentListItem) this.T.get(i10);
        a aVar = null;
        if (documentListItem2 != null) {
            documentListItem2.setURI((Uri) null);
        }
        DocumentListItem documentListItem3 = (DocumentListItem) this.T.get(i10);
        if (documentListItem3 != null) {
            documentListItem3.setFileNmae("");
        }
        a aVar2 = this.L;
        if (aVar2 == null) {
            cm.l.v("adapter");
        } else {
            aVar = aVar2;
        }
        aVar.k(i10);
    }

    public void b(int i10, DocumentListItem documentListItem) {
        cm.l.f(documentListItem, "item");
        this.f22038k0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.T.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.T.get(this.f22038k0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.T.get(this.f22038k0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.T.get(this.f22038k0);
            if (documentListItem5 != null) {
                documentListItem5.setContactNo(documentListItem.getContactNo());
            }
        } catch (Exception unused) {
        }
        if (com.nic.mparivahan.dlservices.utilities.e.e(this)) {
            this.f22040m0.a("*/*");
        }
    }

    public void c(int i10, DocumentListItem documentListItem) {
        a.C0223a i11;
        l hVar;
        cm.l.f(documentListItem, "item");
        this.f22038k0 = i10;
        try {
            DocumentListItem documentListItem2 = (DocumentListItem) this.T.get(i10);
            if (documentListItem2 != null) {
                documentListItem2.setIssueAuthDesg(documentListItem.getIssueAuthDesg());
            }
            DocumentListItem documentListItem3 = (DocumentListItem) this.T.get(this.f22038k0);
            if (documentListItem3 != null) {
                documentListItem3.setIssueDate(documentListItem.getIssueDate());
            }
            DocumentListItem documentListItem4 = (DocumentListItem) this.T.get(this.f22038k0);
            if (documentListItem4 != null) {
                documentListItem4.setDocNo(documentListItem.getDocNo());
            }
            DocumentListItem documentListItem5 = (DocumentListItem) this.T.get(this.f22038k0);
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

    public final ArrayList f2() {
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

    public final String g2() {
        String str = this.f22029b0;
        if (str != null) {
            return str;
        }
        cm.l.v("apdApplicant");
        return null;
    }

    public final DldetobjX h2() {
        DldetobjX dldetobjX = this.P;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c j2() {
        ld.c cVar = this.f22031d0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ArrayList k2() {
        ArrayList arrayList = this.f22036i0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final ld.g l2() {
        ld.g gVar = this.f22028a0;
        if (gVar != null) {
            return gVar;
        }
        cm.l.v("mSessionmanger");
        return null;
    }

    public final ArrayList m2() {
        ArrayList arrayList = this.f22034g0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final ld.f n2() {
        ld.f fVar = this.f22033f0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_status_documents);
        cm.l.e(f10, "setContentView(...)");
        p3 p3Var = (p3) f10;
        this.J = p3Var;
        e.a aVar = v9.e.f17509a;
        p3 p3Var2 = null;
        if (p3Var == null) {
            cm.l.v("mBinding");
            p3Var = null;
        }
        aVar.z0(this, p3Var);
        V2(new ld.f(this));
        this.K = (q) new u0(this).a(q.class);
        p3 p3Var3 = this.J;
        if (p3Var3 == null) {
            cm.l.v("mBinding");
            p3Var3 = null;
        }
        p3Var3.v(this);
        S2(new ld.g(this));
        Q2(new ld.c(this));
        O2(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
        p2();
        s2();
        v2();
        p3 p3Var4 = this.J;
        if (p3Var4 == null) {
            cm.l.v("mBinding");
            p3Var4 = null;
        }
        TextView textView = p3Var4.Y;
        p3 p3Var5 = this.J;
        if (p3Var5 == null) {
            cm.l.v("mBinding");
            p3Var5 = null;
        }
        textView.setPaintFlags(p3Var5.Y.getPaintFlags() | 8);
        p3 p3Var6 = this.J;
        if (p3Var6 == null) {
            cm.l.v("mBinding");
            p3Var6 = null;
        }
        p3Var6.Y.setOnClickListener(new nj.a(this));
        p3 p3Var7 = this.J;
        if (p3Var7 == null) {
            cm.l.v("mBinding");
            p3Var7 = null;
        }
        p3Var7.K.f29577d.setOnClickListener(new nj.h(this));
        if (cm.l.a(n2().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                T2((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                R2((ArrayList) serializableExtra2);
                if (k2().size() == 1) {
                    p3 p3Var8 = this.J;
                    if (p3Var8 == null) {
                        cm.l.v("mBinding");
                        p3Var8 = null;
                    }
                    p3Var8.K.f29580g.setText((CharSequence) k2().get(0));
                    p3 p3Var9 = this.J;
                    if (p3Var9 == null) {
                        cm.l.v("mBinding");
                        p3Var9 = null;
                    }
                    p3Var9.K.f29579f.setVisibility(8);
                } else {
                    p3 p3Var10 = this.J;
                    if (p3Var10 == null) {
                        cm.l.v("mBinding");
                        p3Var10 = null;
                    }
                    TextView textView2 = p3Var10.K.f29580g;
                    String b10 = j2().b("dl_services", getString(R.string.dl_services));
                    cm.l.c(b10);
                    textView2.setText(b10);
                    p3 p3Var11 = this.J;
                    if (p3Var11 == null) {
                        cm.l.v("mBinding");
                        p3Var11 = null;
                    }
                    p3Var11.K.f29579f.setVisibility(8);
                    p3 p3Var12 = this.J;
                    if (p3Var12 == null) {
                        cm.l.v("mBinding");
                        p3Var12 = null;
                    }
                    TextView textView3 = p3Var12.K.f29580g;
                    p3 p3Var13 = this.J;
                    if (p3Var13 == null) {
                        cm.l.v("mBinding");
                        p3Var13 = null;
                    }
                    textView3.setPaintFlags(p3Var13.K.f29580g.getPaintFlags() | 8);
                }
            } catch (Exception e10) {
                Log.e("click_error_getting", e10.getLocalizedMessage());
            }
        } else {
            p3 p3Var14 = this.J;
            if (p3Var14 == null) {
                cm.l.v("mBinding");
                p3Var14 = null;
            }
            p3Var14.K.f29580g.setText(n2().i());
        }
        p3 p3Var15 = this.J;
        if (p3Var15 == null) {
            cm.l.v("mBinding");
            p3Var15 = null;
        }
        p3Var15.K.f29580g.setOnClickListener(new nj.i(this));
        p3 p3Var16 = this.J;
        if (p3Var16 == null) {
            cm.l.v("mBinding");
            p3Var16 = null;
        }
        p3Var16.K.f29578e.setVisibility(8);
        p3 p3Var17 = this.J;
        if (p3Var17 == null) {
            cm.l.v("mBinding");
            p3Var17 = null;
        }
        p3Var17.A.setVisibility(0);
        p3 p3Var18 = this.J;
        if (p3Var18 == null) {
            cm.l.v("mBinding");
            p3Var18 = null;
        }
        p3Var18.Y.setVisibility(0);
        p3 p3Var19 = this.J;
        if (p3Var19 == null) {
            cm.l.v("mBinding");
        } else {
            p3Var2 = p3Var19;
        }
        p3Var2.F.f25961g.setText(n2().i());
    }
}
