package com.nic.mparivahan.Sarathithreeservices.view;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bm.l;
import cb.t0;
import cm.m;
import com.nic.mparivahan.ClServices.Pojo.ClApplFlowStatus;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.DlLastRtoDetailsDto;
import com.nic.mparivahan.DLServicesAuth.Model.RTO.Result;
import com.nic.mparivahan.Dl.Model.DLServiceResponseModleV1;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.UI.LlDocumentUpload;
import com.nic.mparivahan.LLServices.UI.LlPayment;
import com.nic.mparivahan.LLServices.UI.LlPhotoSignature;
import com.nic.mparivahan.LLServices.UI.LlSlots;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlDocUpload;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlFeePayment;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlPhotoSign;
import com.nic.mparivahan.NewDlScreen.DlAcknow.DlSlots;
import com.nic.mparivahan.R;
import com.nic.mparivahan.Sarathithreeservices.model.ResponseBody;
import com.nic.mparivahan.Sarathithreeservices.model.TransReqItem;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplFlowStatus;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.ApplStatusDetail;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.GetAppStatusMain;
import com.nic.mparivahan.Sarathithreeservices.model.app_status.PendingAt;
import com.nic.mparivahan.Sarathithreeservices.model.slot_pdf.SlotPdfDownloadResponse;
import com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.network.DlServiceInt;
import com.nic.mparivahan.dlservices.newlearner.LLDocUpload;
import com.nic.mparivahan.dlservices.newlearner.LLFeePayment;
import com.nic.mparivahan.dlservices.newlearner.LLPhotoSign;
import com.nic.mparivahan.dlservices.newlearner.LLSlots;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import com.nic.mparivahan.dlservices.utilities.c;
import gd.g0;
import gd.j;
import gd.k;
import gd.n;
import gd.o;
import gd.q;
import gd.r;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ni.p;
import pl.x;

public final class ApplicationDetailsActivity extends oi.g implements dd.b {
    /* access modifiers changed from: private */
    public String J;
    private ba.b K;
    public p L;
    private String M;
    private String N = "";
    private hd.a O;
    public GetApplStatusService P;
    private t0 Q;
    public ld.f R;
    private String S;
    private String T;
    private boolean U = true;
    /* access modifiers changed from: private */
    public String V = "1";
    /* access modifiers changed from: private */
    public String W = "1";
    private String X;
    private final int Y = 5001;
    private String Z;

    /* renamed from: a0  reason: collision with root package name */
    private String f9548a0;

    /* renamed from: b0  reason: collision with root package name */
    private String f9549b0;

    /* renamed from: c0  reason: collision with root package name */
    private String f9550c0;

    /* renamed from: d0  reason: collision with root package name */
    public DlServiceInt f9551d0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f9552e0;

    /* renamed from: f0  reason: collision with root package name */
    public x9.d f9553f0;

    /* renamed from: g0  reason: collision with root package name */
    public FormsInterface f9554g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f9555h0 = "0";

    /* renamed from: i0  reason: collision with root package name */
    public ld.c f9556i0;

    /* renamed from: j0  reason: collision with root package name */
    public ld.f f9557j0;

    /* renamed from: k0  reason: collision with root package name */
    private String f9558k0 = "";

    /* renamed from: l0  reason: collision with root package name */
    public ResponseBody f9559l0;

    /* renamed from: m0  reason: collision with root package name */
    public sb.c f9560m0;

    /* renamed from: n0  reason: collision with root package name */
    public LlInterface f9561n0;

    /* renamed from: o0  reason: collision with root package name */
    public FetchLlDetails f9562o0;

    /* renamed from: p0  reason: collision with root package name */
    public ArrayList f9563p0;

    /* renamed from: q0  reason: collision with root package name */
    public ArrayList f9564q0;

    /* renamed from: r0  reason: collision with root package name */
    public DldetobjX f9565r0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9566e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9566e = applicationDetailsActivity;
        }

        public final void b(FetchLlDetails fetchLlDetails) {
            this.f9566e.f3(false);
            try {
                Log.d("ll_response", fetchLlDetails.toString());
                if (p.o(fetchLlDetails.getLLDetails().get(0).getStatus_code(), "00", true)) {
                    ApplicationDetailsActivity applicationDetailsActivity = this.f9566e;
                    cm.l.c(fetchLlDetails);
                    applicationDetailsActivity.X2(fetchLlDetails);
                }
            } catch (Exception e10) {
                Log.d("ll_response_err", e10.toString());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FetchLlDetails) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9567e = applicationDetailsActivity;
        }

        public final void b(String str) {
            this.f9567e.f3(false);
            this.f9567e.J2("Service is temporary unavailable. Try After some time");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9568e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9568e = applicationDetailsActivity;
        }

        public final void b(DLServiceResponseModleV1 dLServiceResponseModleV1) {
            this.f9568e.f3(false);
            try {
                if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 0) {
                    if (dLServiceResponseModleV1.getDldetobj().get(0).getErrorcd() != 1) {
                        if (!ka.c.f13158a.m(dLServiceResponseModleV1.getStatusDesc())) {
                            this.f9568e.J2(String.valueOf(dLServiceResponseModleV1.getStatusDesc()));
                            return;
                        } else {
                            this.f9568e.J2("Something went wrong.");
                            return;
                        }
                    }
                }
                this.f9568e.U2(dLServiceResponseModleV1.getDldetobj().get(0));
            } catch (Exception e10) {
                ApplicationDetailsActivity applicationDetailsActivity = this.f9568e;
                String b10 = applicationDetailsActivity.l2().b("record_error_msg", "Record not found");
                cm.l.c(b10);
                applicationDetailsActivity.J2(b10);
                String message = e10.getMessage();
                if (message != null) {
                    Log.d("DlServicesMainScreen_L", message);
                }
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DLServiceResponseModleV1) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9569e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9569e = applicationDetailsActivity;
        }

        public final void b(GetAppStatusMain getAppStatusMain) {
            p o22;
            p o23;
            int i10 = 0;
            this.f9569e.f3(false);
            try {
                if (!cm.l.a(getAppStatusMain.getStatus_code(), "00") || !cm.l.a(getAppStatusMain.getStatus_desc(), "Success")) {
                    this.f9569e.o2().f27907v.setVisibility(8);
                    this.f9569e.o2().f27905t.setVisibility(8);
                    ApplicationDetailsActivity applicationDetailsActivity = this.f9569e;
                    applicationDetailsActivity.K2(applicationDetailsActivity, getAppStatusMain.getStatus_desc());
                    return;
                }
                this.f9569e.o2().f27907v.setVisibility(0);
                this.f9569e.o2().f27905t.setVisibility(0);
                List<ApplStatusDetail> applStatus_Details = getAppStatusMain.getApplStatus_Details();
                this.f9569e.o2().f27892g.setText(applStatus_Details.get(0).getApplno());
                this.f9569e.o2().f27888c.setText(applStatus_Details.get(0).getApplName());
                this.f9569e.o2().f27890e.setText(applStatus_Details.get(0).getDob());
                this.f9569e.o2().K.setText(applStatus_Details.get(0).getRtoCd());
                this.f9569e.o2().F.setText(applStatus_Details.get(0).getRtoName());
                List<List<String>> reqObjlst = applStatus_Details.get(0).getReqObjlst();
                String str = "";
                this.f9569e.e3(new ArrayList());
                this.f9569e.W2(new ArrayList());
                Iterator<List<String>> it = reqObjlst.iterator();
                if (it.hasNext()) {
                    List next = it.next();
                    String str2 = (String) next.get(1);
                    this.f9569e.o2().E.setVisibility(8);
                    if (next.size() >= 3) {
                        this.f9569e.J = (String) next.get(3);
                    }
                    str = str2;
                }
                if (reqObjlst.size() > 1) {
                    this.f9569e.x2().r("DL Services", VContant.MULTISERVICE_PURPOSE_CODE);
                    for (List next2 : reqObjlst) {
                        this.f9569e.u2().add(next2.get(1));
                        this.f9569e.m2().add(next2.get(1));
                    }
                } else {
                    this.f9569e.x2().r(str, "0000");
                }
                int size = applStatus_Details.get(0).getReqObjlst().size();
                for (int i11 = 0; i11 < size; i11++) {
                    if (reqObjlst.get(i11).size() > 0) {
                        ApplicationDetailsActivity applicationDetailsActivity2 = this.f9569e;
                        applicationDetailsActivity2.T2(applicationDetailsActivity2.j2() + ((String) reqObjlst.get(i11).get(0)) + " . " + ((String) reqObjlst.get(i11).get(1)) + 10);
                    }
                }
                this.f9569e.o2().f27903r.setText(this.f9569e.j2());
                if (applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 552) {
                    if (!(applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 553 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 554 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 559 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 551 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 502 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 504 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 574 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 511 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 501)) {
                        if (applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() != 509) {
                            this.f9569e.V1();
                            this.f9569e.Y1(applStatus_Details.get(0).getApplFlowStatusList());
                            this.f9569e.o2().H.setLayoutManager(new LinearLayoutManager(this.f9569e));
                            this.f9569e.o2().H.setAdapter((RecyclerView.h) null);
                            this.f9569e.b3(getAppStatusMain.getApplStatus_Details().get(0).getApplFlowStatusList());
                            ArrayList r22 = this.f9569e.r2();
                            ApplicationDetailsActivity applicationDetailsActivity3 = this.f9569e;
                            this.f9569e.o2().H.setAdapter(new gd.b(r22, applicationDetailsActivity3, applicationDetailsActivity3));
                            int size2 = this.f9569e.r2().size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                if (applStatus_Details.get(0).getApplFlowStatusList().get(i12).getAcCd() == 371) {
                                    if (p.o(applStatus_Details.get(0).getApplFlowStatusList().get(i12).getStatus(), "Completed", true)) {
                                        this.f9569e.W = "0";
                                    }
                                }
                                if (applStatus_Details.get(0).getApplFlowStatusList().get(i12).getAcCd() == 134 && p.o(applStatus_Details.get(0).getApplFlowStatusList().get(i12).getStatus(), "Completed", true)) {
                                    this.f9569e.V = "0";
                                }
                            }
                            if (q.D(getAppStatusMain.toString(), "pendingAt", true)) {
                                ArrayList arrayList = new ArrayList();
                                ArrayList<PendingAt> pendingAt = getAppStatusMain.getApplStatus_Details().get(0).getPendingAt();
                                if (pendingAt == null) {
                                    return;
                                }
                                if (!pendingAt.isEmpty()) {
                                    this.f9569e.o2().I.setVisibility(0);
                                    this.f9569e.o2().I.setLayoutManager(new LinearLayoutManager(this.f9569e));
                                    this.f9569e.o2().I.setAdapter((RecyclerView.h) null);
                                    int size3 = pendingAt.size();
                                    while (i10 < size3) {
                                        if (!arrayList.contains(pendingAt.get(i10).getPending_at())) {
                                            arrayList.add(pendingAt.get(i10).getPending_at());
                                        }
                                        i10++;
                                    }
                                    this.f9569e.o2().I.setAdapter(new g0(arrayList));
                                    o23 = this.f9569e.o2();
                                    o23.C.setText("Application Pending at RTO Side");
                                    return;
                                }
                                return;
                            }
                            this.f9569e.o2().I.setVisibility(8);
                            o22 = this.f9569e.o2();
                            o22.C.setText("Licence has been Approved");
                        }
                    }
                }
                this.f9569e.Y1(applStatus_Details.get(0).getApplFlowStatusList());
                this.f9569e.o2().H.setLayoutManager(new LinearLayoutManager(this.f9569e));
                this.f9569e.o2().H.setAdapter((RecyclerView.h) null);
                this.f9569e.b3(getAppStatusMain.getApplStatus_Details().get(0).getApplFlowStatusList());
                ArrayList arrayList2 = new ArrayList();
                int size4 = this.f9569e.r2().size();
                for (int i13 = 0; i13 < size4; i13++) {
                    if (((ApplFlowStatus) this.f9569e.r2().get(i13)).getAcCd() != 455) {
                        ClApplFlowStatus clApplFlowStatus = new ClApplFlowStatus();
                        clApplFlowStatus.setAcCd(((ApplFlowStatus) this.f9569e.r2().get(i13)).getAcCd());
                        clApplFlowStatus.setAcDesc(((ApplFlowStatus) this.f9569e.r2().get(i13)).getAcDesc());
                        clApplFlowStatus.setFlowSlno(((ApplFlowStatus) this.f9569e.r2().get(i13)).getFlowSlno());
                        clApplFlowStatus.setStatus(((ApplFlowStatus) this.f9569e.r2().get(i13)).getStatus());
                        clApplFlowStatus.setTrCd(((ApplFlowStatus) this.f9569e.r2().get(i13)).getTrCd());
                        clApplFlowStatus.setTrName(((ApplFlowStatus) this.f9569e.r2().get(i13)).getTrName());
                        arrayList2.add(clApplFlowStatus);
                    }
                }
                ApplicationDetailsActivity applicationDetailsActivity4 = this.f9569e;
                this.f9569e.o2().H.setAdapter(new l9.b(arrayList2, applicationDetailsActivity4, applicationDetailsActivity4));
                this.f9569e.o2().f27905t.setVisibility(8);
                if (applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 502 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 504 || applStatus_Details.get(0).getApplFlowStatusList().get(0).getTrCd() == 574) {
                    this.f9569e.U1();
                }
                if (q.D(getAppStatusMain.toString(), "pendingAt", true)) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<PendingAt> pendingAt2 = getAppStatusMain.getApplStatus_Details().get(0).getPendingAt();
                    if (pendingAt2 != null) {
                        if (!pendingAt2.isEmpty()) {
                            this.f9569e.o2().I.setVisibility(0);
                            this.f9569e.o2().I.setLayoutManager(new LinearLayoutManager(this.f9569e));
                            this.f9569e.o2().I.setAdapter((RecyclerView.h) null);
                            int size5 = pendingAt2.size();
                            while (i10 < size5) {
                                if (!arrayList3.contains(pendingAt2.get(i10).getPending_at())) {
                                    arrayList3.add(pendingAt2.get(i10).getPending_at());
                                }
                                i10++;
                            }
                            this.f9569e.o2().I.setAdapter(new g0(arrayList3));
                            o23 = this.f9569e.o2();
                            o23.C.setText("Application Pending at RTO Side");
                            return;
                        }
                    }
                    o22 = this.f9569e.o2();
                } else {
                    this.f9569e.o2().I.setVisibility(8);
                    o22 = this.f9569e.o2();
                }
                o22.C.setText("Licence has been Approved");
            } catch (Exception unused) {
                this.f9569e.o2().f27907v.setVisibility(8);
                this.f9569e.o2().f27905t.setVisibility(8);
                ApplicationDetailsActivity applicationDetailsActivity5 = this.f9569e;
                applicationDetailsActivity5.K2(applicationDetailsActivity5, applicationDetailsActivity5.l2().b("record_error_msg", "Record not found"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetAppStatusMain) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9570e = applicationDetailsActivity;
        }

        public final void b(FormsPojo formsPojo) {
            this.f9570e.o2().f27887b.setVisibility(8);
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                ApplicationDetailsActivity applicationDetailsActivity = this.f9570e;
                applicationDetailsActivity.O2(applicationDetailsActivity.l2().b("label_form2_download", this.f9570e.getString(R.string.form2_download)), formsPojo.getForm_report());
                return;
            }
            Toast.makeText(this.f9570e, formsPojo.getStatus_desc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9571e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9571e = applicationDetailsActivity;
        }

        public final void b(FormsPojo formsPojo) {
            this.f9571e.o2().f27887b.setVisibility(8);
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                ApplicationDetailsActivity applicationDetailsActivity = this.f9571e;
                applicationDetailsActivity.M2(applicationDetailsActivity.l2().b("label_form1_download", this.f9571e.getString(R.string.form1a_download)), formsPojo.getForm_report());
                return;
            }
            Toast.makeText(this.f9571e, formsPojo.getStatus_desc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class g extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ApplicationDetailsActivity f9572e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ApplicationDetailsActivity applicationDetailsActivity) {
            super(1);
            this.f9572e = applicationDetailsActivity;
        }

        public final void b(String str) {
            this.f9572e.o2().f27887b.setVisibility(8);
            ApplicationDetailsActivity applicationDetailsActivity = this.f9572e;
            Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("record_error_msg", "Record not found"), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class h extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        public static final h f9573e = new h();

        h() {
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

    static final class i implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9574a;

        i(l lVar) {
            cm.l.f(lVar, "function");
            this.f9574a = lVar;
        }

        public final pl.c a() {
            return this.f9574a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9574a.invoke(obj);
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
    public static final void A2(ApplicationDetailsActivity applicationDetailsActivity, SlotPdfDownloadResponse slotPdfDownloadResponse) {
        cm.l.f(applicationDetailsActivity, "this$0");
        applicationDetailsActivity.f3(false);
        if (cm.l.a(slotPdfDownloadResponse.getStatus_code(), "00")) {
            applicationDetailsActivity.X = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            String str = applicationDetailsActivity.X;
            String str2 = null;
            if (str == null) {
                cm.l.v("dir_path");
                str = null;
            }
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = applicationDetailsActivity.X;
            if (str3 == null) {
                cm.l.v("dir_path");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append("\n ");
            sb2.append(slotPdfDownloadResponse.getReportdets());
            Log.v("apppl_path_data", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(fd.a.a());
            String str4 = applicationDetailsActivity.M;
            if (str4 == null) {
                cm.l.v("app_no");
                str4 = null;
            }
            sb3.append(str4);
            sb3.append(".pdf");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            String str5 = applicationDetailsActivity.X;
            if (str5 == null) {
                cm.l.v("dir_path");
            } else {
                str2 = str5;
            }
            sb5.append(str2);
            sb5.append(sb4);
            File file2 = new File(sb5.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(slotPdfDownloadResponse.getReportdets(), 0);
                cm.l.e(decode, "decode(...)");
                Log.v("apppl_Decode", decode.toString());
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            applicationDetailsActivity.H2(sb4);
            return;
        }
        Toast.makeText(applicationDetailsActivity, slotPdfDownloadResponse.getStatus_desc(), 1).show();
    }

    private final void A3() {
        try {
            Intent intent = new Intent(this, LLPhotoSign.class);
            String str = this.M;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0141, code lost:
        if (r8.N.length() > 0) goto L_0x0143;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void B2() {
        /*
            r8 = this;
            java.lang.String r0 = "statusAdapter"
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            ld.f r2 = new ld.f
            r2.<init>(r8)
            r8.i3(r2)
            ni.p r2 = r8.o2()
            ni.rc r2 = r2.f27906u
            android.widget.TextView r2 = r2.f28452f
            ld.c r3 = r8.l2()
            java.lang.String r4 = "label_application_status"
            java.lang.String r5 = "Application Status"
            java.lang.String r3 = r3.b(r4, r5)
            r2.setText(r3)
            android.content.Intent r2 = r8.getIntent()
            java.lang.String r3 = "format(...)"
            java.lang.String r4 = "dd-MM-yyyy"
            java.lang.String r5 = "app_no"
            if (r2 == 0) goto L_0x009c
            java.lang.String r6 = r2.getStringExtra(r5)     // Catch:{ Exception -> 0x0048 }
            cm.l.d(r6, r1)     // Catch:{ Exception -> 0x0048 }
            r8.M = r6     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x0048 }
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x0048 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x0048 }
            r8.f9555h0 = r0     // Catch:{ Exception -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = move-exception
            goto L_0x0093
        L_0x004a:
            java.lang.String r0 = r8.f9555h0     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = "1"
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r6 = "dob"
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x0048 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x0048 }
            r8.N = r0     // Catch:{ Exception -> 0x0048 }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0048 }
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0048 }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0048 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = r8.N     // Catch:{ Exception -> 0x0048 }
            java.util.Date r0 = r0.parse(r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = r1.format(r0)     // Catch:{ Exception -> 0x0048 }
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x0048 }
        L_0x0078:
            r8.N = r0     // Catch:{ Exception -> 0x0048 }
            goto L_0x009c
        L_0x007b:
            java.lang.String r0 = "respBody"
            java.io.Serializable r0 = r2.getSerializableExtra(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r7 = "null cannot be cast to non-null type com.nic.mparivahan.Sarathithreeservices.model.ResponseBody"
            cm.l.d(r0, r7)     // Catch:{ Exception -> 0x0048 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r0 = (com.nic.mparivahan.Sarathithreeservices.model.ResponseBody) r0     // Catch:{ Exception -> 0x0048 }
            r8.g3(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = r2.getStringExtra(r6)     // Catch:{ Exception -> 0x0048 }
            cm.l.d(r0, r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0078
        L_0x0093:
            java.lang.String r1 = "errors"
            java.lang.String r0 = r0.getLocalizedMessage()
            android.util.Log.d(r1, r0)
        L_0x009c:
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0     // Catch:{ Exception -> 0x00dd }
            hd.b r1 = new hd.b     // Catch:{ Exception -> 0x00dd }
            ed.a r2 = new ed.a     // Catch:{ Exception -> 0x00dd }
            com.nic.mparivahan.Sarathithreeservices.network.GetApplStatusService r6 = r8.h2()     // Catch:{ Exception -> 0x00dd }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00dd }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            r0.<init>((androidx.lifecycle.x0) r8, (androidx.lifecycle.u0.b) r1)     // Catch:{ Exception -> 0x00dd }
            java.lang.Class<hd.a> r1 = hd.a.class
            androidx.lifecycle.t0 r0 = r0.a(r1)     // Catch:{ Exception -> 0x00dd }
            hd.a r0 = (hd.a) r0     // Catch:{ Exception -> 0x00dd }
            r8.O = r0     // Catch:{ Exception -> 0x00dd }
            ld.f r0 = new ld.f     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00dd }
            r8.j3(r0)     // Catch:{ Exception -> 0x00dd }
            ld.f r0 = r8.y2()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r0.i()     // Catch:{ Exception -> 0x00dd }
            r8.S = r0     // Catch:{ Exception -> 0x00dd }
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            androidx.appcompat.widget.AppCompatTextView r0 = r0.N     // Catch:{ Exception -> 0x00dd }
            java.lang.String r1 = r8.S     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "title_name"
            r6 = 0
            if (r1 != 0) goto L_0x00e0
            cm.l.v(r2)     // Catch:{ Exception -> 0x00dd }
            r1 = r6
            goto L_0x00e0
        L_0x00dd:
            r0 = move-exception
            goto L_0x0162
        L_0x00e0:
            r0.setText(r1)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r8.S     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x00eb
            cm.l.v(r2)     // Catch:{ Exception -> 0x00dd }
            r0 = r6
        L_0x00eb:
            java.lang.String r1 = "Dispose Application"
            boolean r0 = cm.l.a(r0, r1)     // Catch:{ Exception -> 0x00dd }
            if (r0 == 0) goto L_0x0110
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            android.widget.CheckBox r0 = r0.f27895j     // Catch:{ Exception -> 0x00dd }
            r1 = 0
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00dd }
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f27902q     // Catch:{ Exception -> 0x00dd }
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00dd }
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f27894i     // Catch:{ Exception -> 0x00dd }
        L_0x010c:
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00dd }
            goto L_0x012b
        L_0x0110:
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            android.widget.CheckBox r0 = r0.f27895j     // Catch:{ Exception -> 0x00dd }
            r1 = 8
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00dd }
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f27902q     // Catch:{ Exception -> 0x00dd }
            r0.setVisibility(r1)     // Catch:{ Exception -> 0x00dd }
            ni.p r0 = r8.o2()     // Catch:{ Exception -> 0x00dd }
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f27894i     // Catch:{ Exception -> 0x00dd }
            goto L_0x010c
        L_0x012b:
            java.lang.String r0 = r8.M     // Catch:{ Exception -> 0x00dd }
            if (r0 != 0) goto L_0x0133
            cm.l.v(r5)     // Catch:{ Exception -> 0x00dd }
            goto L_0x0134
        L_0x0133:
            r6 = r0
        L_0x0134:
            int r0 = r6.length()     // Catch:{ Exception -> 0x00dd }
            if (r0 <= 0) goto L_0x013b
            goto L_0x0143
        L_0x013b:
            java.lang.String r0 = r8.N     // Catch:{ Exception -> 0x00dd }
            int r0 = r0.length()     // Catch:{ Exception -> 0x00dd }
            if (r0 <= 0) goto L_0x016b
        L_0x0143:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00dd }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00dd }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "dd/MM/yyyy"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = r8.N     // Catch:{ Exception -> 0x00dd }
            java.util.Date r0 = r0.parse(r2)     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = r1.format(r0)     // Catch:{ Exception -> 0x00dd }
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x00dd }
            r8.T = r0     // Catch:{ Exception -> 0x00dd }
            r8.i2()     // Catch:{ Exception -> 0x00dd }
            goto L_0x016b
        L_0x0162:
            java.lang.String r1 = "errors1"
            java.lang.String r0 = r0.getLocalizedMessage()
            android.util.Log.d(r1, r0)
        L_0x016b:
            r8.z2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.B2():void");
    }

    private final void B3() {
        try {
            Intent intent = new Intent(this, LLSlots.class);
            String str = this.M;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void C2() {
        o2().f27894i.setOnClickListener(new gd.e(this));
        o2().f27905t.setOnClickListener(new gd.f(this));
        o2().f27902q.setOnClickListener(new gd.g(this));
    }

    private final void C3() {
        try {
            Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dl_st_dl_details_obj", k2());
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", k2().getBioObj().getBioMobileNo());
            String str4 = this.f9549b0;
            if (str4 == null) {
                cm.l.v("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.f9550c0;
            if (str5 == null) {
                cm.l.v("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.Z;
            if (str6 == null) {
                cm.l.v("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.f9548a0;
            if (str7 == null) {
                cm.l.v("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void D2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        applicationDetailsActivity.finish();
    }

    private final void D3() {
        try {
            Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dl_st_dl_details_obj", k2());
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", k2().getBioObj().getBioMobileNo());
            String str4 = this.f9549b0;
            if (str4 == null) {
                cm.l.v("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.f9550c0;
            if (str5 == null) {
                cm.l.v("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.Z;
            if (str6 == null) {
                cm.l.v("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.f9548a0;
            if (str7 == null) {
                cm.l.v("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void E2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        if (Build.VERSION.SDK_INT < 26 || applicationDetailsActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            applicationDetailsActivity.Z1(applicationDetailsActivity);
        } else {
            applicationDetailsActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, applicationDetailsActivity.Y);
        }
    }

    /* access modifiers changed from: private */
    public static final void F2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        applicationDetailsActivity.Q2(applicationDetailsActivity);
    }

    /* access modifiers changed from: private */
    public static final void G2(ApplicationDetailsActivity applicationDetailsActivity, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        applicationDetailsActivity.finish();
    }

    private final void H2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(l2().b("button_open_pd", getString(R.string.open_pdf)));
        ((TextView) findViewById).setText(l2().b("popup_pdf_desc", getString(R.string.pdf_description)));
        textView.setOnClickListener(new gd.i(this, str, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void I2(ApplicationDetailsActivity applicationDetailsActivity, String str, Dialog dialog, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(str, "$fileName");
        cm.l.f(dialog, "$d");
        applicationDetailsActivity.g2(str);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L2(Dialog dialog, ApplicationDetailsActivity applicationDetailsActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationDetailsActivity, "this$0");
        dialog.dismiss();
        applicationDetailsActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void M2(String str, String str2) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(l2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(l2().b("btn_ok", "OK"));
        textView.setOnClickListener(new gd.d(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void N2(Dialog dialog, ApplicationDetailsActivity applicationDetailsActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str2 + (q.B0(applicationDetailsActivity.o2().f27892g.getText().toString()).toString() + ".pdf"));
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri g10 = FileProvider.g(applicationDetailsActivity, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + q.B0(applicationDetailsActivity.o2().f27892g.getText().toString()).toString() + ".pdf"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(g10);
            Log.e("create pdf uri path==>", sb2.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(g10, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                applicationDetailsActivity.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("record_error_msg", "Record not found"), 1).show();
        }
    }

    /* access modifiers changed from: private */
    public final void O2(String str, String str2) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(l2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(l2().b("btn_ok", "OK"));
        textView.setOnClickListener(new q(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void P2(Dialog dialog, ApplicationDetailsActivity applicationDetailsActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(str2 + (q.B0(applicationDetailsActivity.o2().f27892g.getText().toString()).toString() + "_form.pdf"));
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            Uri g10 = FileProvider.g(applicationDetailsActivity, "com.nic.mparivahan.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + q.B0(applicationDetailsActivity.o2().f27892g.getText().toString()).toString() + "_form.pdf"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(g10);
            Log.e("create pdf uri path==>", sb2.toString());
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(g10, "application/pdf");
                intent.setFlags(67108864);
                intent.addFlags(1);
                applicationDetailsActivity.startActivity(intent);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("record_error_msg", "Record not found"), 1).show();
        }
    }

    private final void Q2(Context context) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirm_dialog);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.msg_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_cancel);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        dialog.show();
        ((TextView) findViewById).setText(getString(R.string.dispose_pop_msg));
        ((TextView) findViewById2).setOnClickListener(new gd.h(dialog));
    }

    /* access modifiers changed from: private */
    public static final void R2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void U1() {
        f3(true);
        sb.c t22 = t2();
        List<TransReqItem> transReq = v2().getTransReq();
        cm.l.c(transReq);
        TransReqItem transReqItem = transReq.get(0);
        cm.l.c(transReqItem);
        t22.j(this, q.B0(String.valueOf(transReqItem.getTrRefLicno())).toString(), this.N, "mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice");
        t2().k().g(this, new i(new a(this)));
        t2().i().g(this, new i(new b(this)));
    }

    /* access modifiers changed from: private */
    public final void V1() {
        this.K = (ba.b) new u0((x0) this, (u0.b) new ba.a(new y9.a(w2(), this))).a(ba.b.class);
        c.a aVar = com.nic.mparivahan.dlservices.utilities.c.f22374a;
        q.B0(String.valueOf(aVar.b(aVar.g(9999.0d, 99999.0d)))).toString();
        f3(true);
        ba.b bVar = this.K;
        ba.b bVar2 = null;
        if (bVar == null) {
            cm.l.v("dlServicesViewModel");
            bVar = null;
        }
        String str = this.J;
        if (str == null) {
            cm.l.v("dlNo");
            str = null;
        }
        bVar.k(this, str, f2(this.N));
        ba.b bVar3 = this.K;
        if (bVar3 == null) {
            cm.l.v("dlServicesViewModel");
            bVar3 = null;
        }
        bVar3.o().g(this, new i(new c(this)));
        ba.b bVar4 = this.K;
        if (bVar4 == null) {
            cm.l.v("dlServicesViewModel");
            bVar4 = null;
        }
        String str2 = this.J;
        if (str2 == null) {
            cm.l.v("dlNo");
            str2 = null;
        }
        bVar4.x(this, str2, this.N);
        ba.b bVar5 = this.K;
        if (bVar5 == null) {
            cm.l.v("dlServicesViewModel");
        } else {
            bVar2 = bVar5;
        }
        bVar2.l().g(this, new o(this));
    }

    /* access modifiers changed from: private */
    public static final void W1(ApplicationDetailsActivity applicationDetailsActivity, DlLastRtoDetailsDto dlLastRtoDetailsDto) {
        List<Result> result;
        cm.l.f(applicationDetailsActivity, "this$0");
        if (dlLastRtoDetailsDto.getStatus_code().equals("00") && dlLastRtoDetailsDto.getStatus_desc().equals("success") && (result = dlLastRtoDetailsDto.getResult()) != null) {
            String rtoCode = result.get(0).getRtoCode();
            cm.l.c(rtoCode);
            applicationDetailsActivity.Z = rtoCode;
            String stCode = result.get(0).getStCode();
            cm.l.c(stCode);
            applicationDetailsActivity.f9548a0 = stCode;
            applicationDetailsActivity.f9549b0 = String.valueOf(result.get(0).getLastEndRTO());
            applicationDetailsActivity.f9550c0 = String.valueOf(result.get(0).getLastEndState());
        }
    }

    /* access modifiers changed from: private */
    public final void Y1(List list) {
        View view;
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (p.o(((ApplFlowStatus) it.next()).getStatus(), "pending", true)) {
                z10 = false;
            }
        }
        p o22 = o2();
        if (z10) {
            o22.f27905t.setVisibility(0);
            view = o2().M;
        } else {
            o22.B.setVisibility(8);
            view = o2().C;
        }
        view.setVisibility(8);
    }

    private final void Z1(Context context) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_app_status);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setLayout(-1, -1);
        Window window2 = dialog.getWindow();
        cm.l.c(window2);
        window2.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.fee_receipt_title);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.fee_receipt);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.slot_acknol_slip_title);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.slot_acknol_slip);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.floatBtn);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.form_one_a_title);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.form_one_a);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView7 = (TextView) findViewById7;
        View findViewById8 = dialog.findViewById(R.id.form_one_title);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView8 = (TextView) findViewById8;
        View findViewById9 = dialog.findViewById(R.id.form_one);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView9 = (TextView) findViewById9;
        textView.setText(l2().b("label_fee_receipt", "Fee Receipt"));
        textView3.setText(l2().b("label_slot_ackno_slip", "Slot Acknowledgement Slip"));
        textView6.setText(l2().b("label_view_form_1", "View Form 1-A"));
        textView8.setText(l2().b("label_view_form_2", "View Form 2"));
        dialog.show();
        try {
            if (cm.l.a(this.V, "0")) {
                textView2.setVisibility(0);
                textView.setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
            }
            Log.d("slot_book", this.W);
            if (cm.l.a(this.W, "0")) {
                textView4.setVisibility(0);
                textView3.setVisibility(0);
            } else {
                textView4.setVisibility(8);
                textView3.setVisibility(8);
            }
            CharSequence text = o2().f27903r.getText();
            cm.l.e(text, "getText(...)");
            if (!q.D(text, "RENEWAL", true)) {
                CharSequence text2 = o2().f27903r.getText();
                cm.l.e(text2, "getText(...)");
                if (!q.D(text2, "Renewal", true)) {
                    CharSequence text3 = o2().f27903r.getText();
                    cm.l.e(text3, "getText(...)");
                    if (!q.D(text3, "renewal", true)) {
                        textView6.setVisibility(8);
                        textView7.setVisibility(8);
                        textView7.setOnClickListener(new gd.c(this, dialog));
                        textView9.setOnClickListener(new j(this, dialog));
                        textView5.setOnClickListener(new k(dialog));
                        textView2.setOnClickListener(new gd.l(this, dialog));
                        textView4.setOnClickListener(new gd.m(this, dialog));
                    }
                }
            }
            textView6.setVisibility(0);
            textView7.setVisibility(0);
            textView9.setVisibility(0);
            textView8.setVisibility(0);
            textView7.setOnClickListener(new gd.c(this, dialog));
            textView9.setOnClickListener(new j(this, dialog));
        } catch (Exception unused) {
        }
        textView5.setOnClickListener(new k(dialog));
        textView2.setOnClickListener(new gd.l(this, dialog));
        textView4.setOnClickListener(new gd.m(this, dialog));
    }

    /* access modifiers changed from: private */
    public static final void a2(ApplicationDetailsActivity applicationDetailsActivity, Dialog dialog, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(dialog, "$d");
        Intent intent = new Intent();
        intent.setClass(applicationDetailsActivity, DownloadApplicationActivity.class);
        String str = applicationDetailsActivity.M;
        if (str == null) {
            cm.l.v("app_no");
            str = null;
        }
        intent.putExtra("app_no", str);
        intent.putExtra("dob", applicationDetailsActivity.N);
        applicationDetailsActivity.startActivity(intent);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void b2(ApplicationDetailsActivity applicationDetailsActivity, Dialog dialog, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.dlservices.utilities.e.e(applicationDetailsActivity)) {
            if (dd.a.f9964a.a(applicationDetailsActivity)) {
                applicationDetailsActivity.f3(true);
                hd.a aVar = applicationDetailsActivity.O;
                String str = null;
                if (aVar == null) {
                    cm.l.v("appStatusVM");
                    aVar = null;
                }
                String str2 = applicationDetailsActivity.M;
                if (str2 == null) {
                    cm.l.v("app_no");
                    str2 = null;
                }
                String str3 = applicationDetailsActivity.T;
                if (str3 == null) {
                    cm.l.v("format_date");
                } else {
                    str = str3;
                }
                aVar.m(applicationDetailsActivity, str2, str);
            } else {
                Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("label_log_check_internet", applicationDetailsActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            }
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(ApplicationDetailsActivity applicationDetailsActivity, Dialog dialog, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.dlservices.utilities.e.e(applicationDetailsActivity)) {
            dialog.dismiss();
            if (dd.a.f9964a.a(applicationDetailsActivity)) {
                try {
                    String X1 = applicationDetailsActivity.X1(applicationDetailsActivity.o2().f27890e.getText().toString());
                    String obj = applicationDetailsActivity.o2().f27892g.getText().toString();
                    Charset forName = Charset.forName("UTF-8");
                    cm.l.e(forName, "forName(charsetName)");
                    byte[] bytes = obj.getBytes(forName);
                    cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(bytes, 0);
                    Charset forName2 = Charset.forName("UTF-8");
                    cm.l.e(forName2, "forName(charsetName)");
                    byte[] bytes2 = X1.getBytes(forName2);
                    cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString2 = Base64.encodeToString(bytes2, 0);
                    applicationDetailsActivity.o2().f27887b.setVisibility(0);
                    x9.d q22 = applicationDetailsActivity.q2();
                    cm.l.c(encodeToString);
                    cm.l.c(encodeToString2);
                    q22.g(encodeToString, encodeToString2);
                } catch (Exception unused) {
                }
            } else {
                Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("label_log_check_internet", applicationDetailsActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void d2(ApplicationDetailsActivity applicationDetailsActivity, Dialog dialog, View view) {
        cm.l.f(applicationDetailsActivity, "this$0");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.dlservices.utilities.e.e(applicationDetailsActivity)) {
            dialog.dismiss();
            if (dd.a.f9964a.a(applicationDetailsActivity)) {
                try {
                    String X1 = applicationDetailsActivity.X1(applicationDetailsActivity.o2().f27890e.getText().toString());
                    String obj = applicationDetailsActivity.o2().f27892g.getText().toString();
                    Charset forName = Charset.forName("UTF-8");
                    cm.l.e(forName, "forName(charsetName)");
                    byte[] bytes = obj.getBytes(forName);
                    cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(bytes, 0);
                    Charset forName2 = Charset.forName("UTF-8");
                    cm.l.e(forName2, "forName(charsetName)");
                    byte[] bytes2 = X1.getBytes(forName2);
                    cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString2 = Base64.encodeToString(bytes2, 0);
                    applicationDetailsActivity.o2().f27887b.setVisibility(0);
                    x9.d q22 = applicationDetailsActivity.q2();
                    cm.l.c(encodeToString);
                    cm.l.c(encodeToString2);
                    q22.h(encodeToString, encodeToString2);
                } catch (Exception unused) {
                }
            } else {
                Toast.makeText(applicationDetailsActivity, applicationDetailsActivity.l2().b("label_log_check_internet", applicationDetailsActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void f3(boolean z10) {
        if (z10) {
            try {
                this.Q = new t0(this, R.string.please_wait_2, true);
            } catch (WindowManager.BadTokenException e10) {
                e10.printStackTrace();
                return;
            }
        }
        t0 t0Var = this.Q;
        if (t0Var == null) {
            return;
        }
        if (z10) {
            t0Var.b();
        } else {
            t0Var.a();
        }
    }

    private final void g2(String str) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.debug.provider", new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/" + str));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(g10);
        Log.e("create pdf uri path==>", sb2.toString());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, l2().b("popup_pdf_error", ""), 1).show();
        }
    }

    private final void i2() {
        if (dd.a.f9964a.a(this)) {
            f3(true);
            hd.a aVar = this.O;
            hd.a aVar2 = null;
            if (aVar == null) {
                cm.l.v("appStatusVM");
                aVar = null;
            }
            String str = this.M;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            String str2 = this.T;
            if (str2 == null) {
                cm.l.v("format_date");
                str2 = null;
            }
            aVar.h(this, str, str2);
            hd.a aVar3 = this.O;
            if (aVar3 == null) {
                cm.l.v("appStatusVM");
            } else {
                aVar2 = aVar3;
            }
            aVar2.k().g(this, new i(new d(this)));
        } else {
            K2(this, l2().b("label_log_check_internet", getString(R.string.kindly_check_your_internet_connection)));
        }
        q2().k().g(this, new i(new e(this)));
        q2().j().g(this, new i(new f(this)));
        q2().i().g(this, new i(new g(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116 A[SYNTHETIC, Splitter:B:20:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void k3() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0157 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.ClDocumentsUpload> r1 = com.nic.mparivahan.ClServices.View.ClDocumentsUpload.class
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no"
            java.lang.String r2 = r6.M     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = "app_no"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            r2 = r3
        L_0x0014:
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no_dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "DL"
            java.lang.String r2 = r6.J     // Catch:{ Exception -> 0x0157 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = "dlNo"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTO"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTOCode"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.K     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clName"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r2.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.getApdFirstName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            r3 = 32
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r4 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = r4.getApdLastName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r4)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clPhoto"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "NA"
            java.lang.String r4 = "fatherName"
            if (r1 == 0) goto L_0x00bc
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x00bf
        L_0x00bc:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x00bf:
            java.lang.String r1 = "address"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.getApdPermAdd1()     // Catch:{ Exception -> 0x0157 }
            r4.append(r5)     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r3 = r3.getApdPermAdd2()     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "issuing_authority"
            ni.p r3 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r3 = r3.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = "validity"
            if (r1 == 0) goto L_0x0147
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x011d
            goto L_0x0147
        L_0x011d:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r2 = 10
            java.lang.String r1 = r1.substring(r3, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x014a
        L_0x0147:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x014a:
            java.lang.String r1 = "cl_Status"
            java.lang.String r2 = "Active"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0157 }
            r6.finish()     // Catch:{ Exception -> 0x0157 }
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.k3():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116 A[SYNTHETIC, Splitter:B:20:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void l3() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0157 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.ClFeePayment> r1 = com.nic.mparivahan.ClServices.View.ClFeePayment.class
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no"
            java.lang.String r2 = r6.M     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = "app_no"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            r2 = r3
        L_0x0014:
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no_dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "DL"
            java.lang.String r2 = r6.J     // Catch:{ Exception -> 0x0157 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = "dlNo"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTO"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTOCode"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.K     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clName"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r2.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.getApdFirstName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            r3 = 32
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r4 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = r4.getApdLastName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r4)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clPhoto"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "NA"
            java.lang.String r4 = "fatherName"
            if (r1 == 0) goto L_0x00bc
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x00bf
        L_0x00bc:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x00bf:
            java.lang.String r1 = "address"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.getApdPermAdd1()     // Catch:{ Exception -> 0x0157 }
            r4.append(r5)     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r3 = r3.getApdPermAdd2()     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "issuing_authority"
            ni.p r3 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r3 = r3.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = "validity"
            if (r1 == 0) goto L_0x0147
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x011d
            goto L_0x0147
        L_0x011d:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r2 = 10
            java.lang.String r1 = r1.substring(r3, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x014a
        L_0x0147:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x014a:
            java.lang.String r1 = "cl_Status"
            java.lang.String r2 = "Active"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0157 }
            r6.finish()     // Catch:{ Exception -> 0x0157 }
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.l3():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116 A[SYNTHETIC, Splitter:B:20:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m3() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0157 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.ClPhotoSignature> r1 = com.nic.mparivahan.ClServices.View.ClPhotoSignature.class
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no"
            java.lang.String r2 = r6.M     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = "app_no"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            r2 = r3
        L_0x0014:
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no_dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "DL"
            java.lang.String r2 = r6.J     // Catch:{ Exception -> 0x0157 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = "dlNo"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTO"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTOCode"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.K     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clName"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r2.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.getApdFirstName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            r3 = 32
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r4 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = r4.getApdLastName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r4)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clPhoto"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "NA"
            java.lang.String r4 = "fatherName"
            if (r1 == 0) goto L_0x00bc
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x00bf
        L_0x00bc:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x00bf:
            java.lang.String r1 = "address"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.getApdPermAdd1()     // Catch:{ Exception -> 0x0157 }
            r4.append(r5)     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r3 = r3.getApdPermAdd2()     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "issuing_authority"
            ni.p r3 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r3 = r3.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = "validity"
            if (r1 == 0) goto L_0x0147
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x011d
            goto L_0x0147
        L_0x011d:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r2 = 10
            java.lang.String r1 = r1.substring(r3, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x014a
        L_0x0147:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x014a:
            java.lang.String r1 = "cl_Status"
            java.lang.String r2 = "Active"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0157 }
            r6.finish()     // Catch:{ Exception -> 0x0157 }
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.m3():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0116 A[SYNTHETIC, Splitter:B:20:0x0116] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n3() {
        /*
            r6 = this;
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0157 }
            java.lang.Class<com.nic.mparivahan.ClServices.View.ClSots> r1 = com.nic.mparivahan.ClServices.View.ClSots.class
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no"
            java.lang.String r2 = r6.M     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            if (r2 != 0) goto L_0x0014
            java.lang.String r2 = "app_no"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            r2 = r3
        L_0x0014:
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dl_st_appl_ackno_no_dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "DL"
            java.lang.String r2 = r6.J     // Catch:{ Exception -> 0x0157 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = "dlNo"
            cm.l.v(r2)     // Catch:{ Exception -> 0x0157 }
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "dob"
            java.lang.String r2 = r6.N     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTO"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "lastEndorsedRTOCode"
            ni.p r2 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r2 = r2.K     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = r2.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r2 = km.q.B0(r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clName"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r2.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.getApdFirstName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            r3 = 32
            r2.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r4 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = r4.getApdLastName()     // Catch:{ Exception -> 0x0157 }
            r2.append(r4)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "clPhoto"
            java.lang.String r2 = ""
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "NA"
            java.lang.String r4 = "fatherName"
            if (r1 == 0) goto L_0x00bc
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x00b0
            goto L_0x00bc
        L_0x00b0:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getApdSwdFullName()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x00bf
        L_0x00bc:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x00bf:
            java.lang.String r1 = "address"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0157 }
            r4.<init>()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r5 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r5 = r5.getApdPermAdd1()     // Catch:{ Exception -> 0x0157 }
            r4.append(r5)     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r3 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r3 = r3.getApdPermAdd2()     // Catch:{ Exception -> 0x0157 }
            r4.append(r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = "issuing_authority"
            ni.p r3 = r6.o2()     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.MyTextView r3 = r3.F     // Catch:{ Exception -> 0x0157 }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r1, r3)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r3 = 0
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            java.lang.String r4 = "validity"
            if (r1 == 0) goto L_0x0147
            int r1 = r1.length()     // Catch:{ Exception -> 0x0157 }
            if (r1 != 0) goto L_0x011d
            goto L_0x0147
        L_0x011d:
            com.nic.mparivahan.Sarathithreeservices.model.ResponseBody r1 = r6.v2()     // Catch:{ Exception -> 0x0157 }
            java.util.List r1 = r1.getTransReq()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            com.nic.mparivahan.Sarathithreeservices.model.TransReqItem r1 = (com.nic.mparivahan.Sarathithreeservices.model.TransReqItem) r1     // Catch:{ Exception -> 0x0157 }
            java.lang.String r1 = r1.getTrRefLicvalidDt()     // Catch:{ Exception -> 0x0157 }
            cm.l.c(r1)     // Catch:{ Exception -> 0x0157 }
            r2 = 10
            java.lang.String r1 = r1.substring(r3, r2)     // Catch:{ Exception -> 0x0157 }
            java.lang.String r2 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r0.putExtra(r4, r1)     // Catch:{ Exception -> 0x0157 }
            goto L_0x014a
        L_0x0147:
            r0.putExtra(r4, r2)     // Catch:{ Exception -> 0x0157 }
        L_0x014a:
            java.lang.String r1 = "cl_Status"
            java.lang.String r2 = "Active"
            r0.putExtra(r1, r2)     // Catch:{ Exception -> 0x0157 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0157 }
            r6.finish()     // Catch:{ Exception -> 0x0157 }
        L_0x0157:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Sarathithreeservices.view.ApplicationDetailsActivity.n3():void");
    }

    private final void o3() {
        try {
            Intent intent = new Intent(this, DlDocUpload.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void p3() {
        try {
            Intent intent = new Intent(this, DlFeePayment.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void q3() {
        try {
            Intent intent = new Intent(this, DlPhotoSign.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void r3() {
        try {
            Intent intent = new Intent(this, DlSlots.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void s3() {
        try {
            Intent intent = new Intent(this, DlDocActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dl_st_dl_details_obj", k2());
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", k2().getBioObj().getBioMobileNo());
            String str4 = this.f9549b0;
            if (str4 == null) {
                cm.l.v("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.f9550c0;
            if (str5 == null) {
                cm.l.v("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.Z;
            if (str6 == null) {
                cm.l.v("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.f9548a0;
            if (str7 == null) {
                cm.l.v("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void t3() {
        try {
            Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dl_st_dl_details_obj", k2());
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
                str3 = null;
            }
            intent.putExtra("DL", str3);
            intent.putExtra("dob", this.N);
            intent.putExtra("DLDetails", k2());
            intent.putExtra("Mobile_no", k2().getBioObj().getBioMobileNo());
            String str4 = this.f9549b0;
            if (str4 == null) {
                cm.l.v("lastEndRTO");
                str4 = null;
            }
            intent.putExtra("lastEndorsedRTO", str4);
            String str5 = this.f9550c0;
            if (str5 == null) {
                cm.l.v("lastEndState");
                str5 = null;
            }
            intent.putExtra("lastEndorsedState", str5);
            String str6 = this.Z;
            if (str6 == null) {
                cm.l.v("lastEndorseRtoCode");
                str6 = null;
            }
            intent.putExtra("lastEndorsedRTOCode", str6);
            String str7 = this.f9548a0;
            if (str7 == null) {
                cm.l.v("lastEndorseStateCode");
            } else {
                str2 = str7;
            }
            intent.putExtra("lastEndorseStateCode", str2);
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void u3() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", n2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void v3() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", n2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void w3() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", n2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void x3() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
            String str = this.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            String str3 = this.J;
            if (str3 == null) {
                cm.l.v("dlNo");
            } else {
                str2 = str3;
            }
            intent.putExtra("DL", str2);
            intent.putExtra("dob", this.N);
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("LLDetails", n2());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void y3() {
        try {
            Intent intent = new Intent(this, LLDocUpload.class);
            String str = this.M;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void z2() {
        hd.a aVar = this.O;
        if (aVar == null) {
            cm.l.v("appStatusVM");
            aVar = null;
        }
        aVar.l().g(this, new gd.p(this));
    }

    private final void z3() {
        try {
            Intent intent = new Intent(this, LLFeePayment.class);
            String str = this.M;
            if (str == null) {
                cm.l.v("app_no");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            intent.putExtra("dl_st_appl_ackno_no_dob", this.N);
            intent.putExtra("dob", this.N);
            intent.putExtra("Mobile_no", "NA");
            intent.putExtra("lastEndorsedRTO", q.B0(o2().F.getText().toString()).toString());
            intent.putExtra("lastEndorsedRTOCode", q.B0(o2().K.getText().toString()).toString());
            intent.putExtra("aadharPhoto", "");
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void H(Integer num, int i10, int i11) {
        if (num != null && num.intValue() == 135) {
            if (i11 != 501) {
                if (!(i11 == 502 || i11 == 504)) {
                    if (i11 != 509) {
                        if (i11 != 511) {
                            if (i11 != 559) {
                                if (i11 != 574) {
                                    switch (i11) {
                                        case 551:
                                        case 552:
                                        case 553:
                                        case 554:
                                            break;
                                        default:
                                            C3();
                                            return;
                                    }
                                }
                            }
                            m3();
                            return;
                        }
                        q3();
                        return;
                    }
                }
                w3();
                return;
            }
            A3();
        } else if (num != null && num.intValue() == 123) {
            if (i11 != 501) {
                if (!(i11 == 502 || i11 == 504)) {
                    if (i11 != 509) {
                        if (i11 != 511) {
                            if (i11 != 559) {
                                if (i11 != 574) {
                                    switch (i11) {
                                        case 551:
                                        case 552:
                                        case 553:
                                        case 554:
                                            break;
                                        default:
                                            s3();
                                            return;
                                    }
                                }
                            }
                            k3();
                            return;
                        }
                        o3();
                        return;
                    }
                }
                u3();
                return;
            }
            y3();
        } else if (num != null && num.intValue() == 134) {
            if (i11 != 501) {
                if (!(i11 == 502 || i11 == 504)) {
                    if (i11 != 509) {
                        if (i11 != 511) {
                            if (i11 != 559) {
                                if (i11 != 574) {
                                    switch (i11) {
                                        case 551:
                                        case 552:
                                        case 553:
                                        case 554:
                                            break;
                                        default:
                                            t3();
                                            return;
                                    }
                                }
                            }
                            l3();
                            return;
                        }
                        p3();
                        return;
                    }
                }
                v3();
                return;
            }
            z3();
        } else {
            if (num != null && num.intValue() == 371) {
                if (i11 != 501) {
                    if (!(i11 == 502 || i11 == 504)) {
                        if (i11 != 509) {
                            if (i11 != 511) {
                                if (i11 != 559) {
                                    if (i11 != 574) {
                                        switch (i11) {
                                            case 551:
                                            case 552:
                                            case 553:
                                            case 554:
                                                break;
                                        }
                                    }
                                }
                                n3();
                                return;
                            }
                            r3();
                            return;
                        }
                    }
                    x3();
                    return;
                }
                B3();
                return;
            } else if (num != null && num.intValue() == 132) {
                if (i11 != 501) {
                    if (!(i11 == 502 || i11 == 504)) {
                        if (i11 != 509) {
                            if (i11 != 511) {
                                if (i11 != 559) {
                                    if (i11 != 574) {
                                        switch (i11) {
                                            case 551:
                                            case 552:
                                            case 553:
                                            case 554:
                                                break;
                                        }
                                    }
                                }
                                n3();
                                return;
                            }
                            r3();
                            return;
                        }
                    }
                    x3();
                    return;
                }
                B3();
                return;
            } else {
                return;
            }
            D3();
        }
    }

    public final void J2(String str) {
        cm.l.f(str, "message");
        oi.g.n1(this, com.nic.mparivahan.dlservices.utilities.e.n(), str, 1, com.nic.mparivahan.dlservices.utilities.e.o(), (String) null, h.f9573e, 16, (Object) null);
    }

    public final void K2(Context context, String str) {
        cm.l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
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
        ((TextView) findViewById3).setText(l2().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(l2().b("btn_ok", "OK"));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new r(dialog, this));
        dialog.show();
    }

    public final void S2(GetApplStatusService getApplStatusService) {
        cm.l.f(getApplStatusService, "<set-?>");
        this.P = getApplStatusService;
    }

    public final void T2(String str) {
        cm.l.f(str, "<set-?>");
        this.f9558k0 = str;
    }

    public final void U2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.f9565r0 = dldetobjX;
    }

    public final void V2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9556i0 = cVar;
    }

    public final void W2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f9564q0 = arrayList;
    }

    public final String X1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("dd/MM/yyyy").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final void X2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.f9562o0 = fetchLlDetails;
    }

    public final void Y2(p pVar) {
        cm.l.f(pVar, "<set-?>");
        this.L = pVar;
    }

    public final void Z2(FormsInterface formsInterface) {
        cm.l.f(formsInterface, "<set-?>");
        this.f9554g0 = formsInterface;
    }

    public final void a3(x9.d dVar) {
        cm.l.f(dVar, "<set-?>");
        this.f9553f0 = dVar;
    }

    public final void b3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f9552e0 = arrayList;
    }

    public final void c3(LlInterface llInterface) {
        cm.l.f(llInterface, "<set-?>");
        this.f9561n0 = llInterface;
    }

    public final void d3(sb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9560m0 = cVar;
    }

    public final void e3(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f9563p0 = arrayList;
    }

    public final String f2(String str) {
        cm.l.f(str, "fdate");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            String format = simpleDateFormat2.format(parse);
            cm.l.e(format, "format(...)");
            return format;
        } catch (ParseException unused) {
            return "";
        }
    }

    public final void g3(ResponseBody responseBody) {
        cm.l.f(responseBody, "<set-?>");
        this.f9559l0 = responseBody;
    }

    public final GetApplStatusService h2() {
        GetApplStatusService getApplStatusService = this.P;
        if (getApplStatusService != null) {
            return getApplStatusService;
        }
        cm.l.v("appInfoService");
        return null;
    }

    public final void h3(DlServiceInt dlServiceInt) {
        cm.l.f(dlServiceInt, "<set-?>");
        this.f9551d0 = dlServiceInt;
    }

    public final void i3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f9557j0 = fVar;
    }

    public final String j2() {
        return this.f9558k0;
    }

    public final void j3(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.R = fVar;
    }

    public final DldetobjX k2() {
        DldetobjX dldetobjX = this.f9565r0;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c l2() {
        ld.c cVar = this.f9556i0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ArrayList m2() {
        ArrayList arrayList = this.f9564q0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final FetchLlDetails n2() {
        FetchLlDetails fetchLlDetails = this.f9562o0;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final p o2() {
        p pVar = this.L;
        if (pVar != null) {
            return pVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p c10 = p.c(getLayoutInflater());
        cm.l.e(c10, "inflate(...)");
        Y2(c10);
        setContentView((View) o2().b());
        v9.e.f17509a.G(this, o2());
        V2(new ld.c(this));
        h3(DlServiceInt.f21675a.a(this));
        S2(GetApplStatusService.f9545a.a(this));
        Z2(FormsInterface.f8102a.a(this));
        c3(LlInterface.f9003a.a(this));
        a3((x9.d) new u0((x0) this, (u0.b) new x9.c(new x9.b(p2()))).a(x9.d.class));
        d3((sb.c) new u0((x0) this, (u0.b) new sb.a(new sb.b(s2()))).a(sb.c.class));
        B2();
        C2();
        o2().f27906u.f28448b.setOnClickListener(new n(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.Y) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                Z1(this);
            }
        }
    }

    public final FormsInterface p2() {
        FormsInterface formsInterface = this.f9554g0;
        if (formsInterface != null) {
            return formsInterface;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final x9.d q2() {
        x9.d dVar = this.f9553f0;
        if (dVar != null) {
            return dVar;
        }
        cm.l.v("mFormsVM");
        return null;
    }

    public final ArrayList r2() {
        ArrayList arrayList = this.f9552e0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("mListVal");
        return null;
    }

    public final LlInterface s2() {
        LlInterface llInterface = this.f9561n0;
        if (llInterface != null) {
            return llInterface;
        }
        cm.l.v("mLlInterface");
        return null;
    }

    public final sb.c t2() {
        sb.c cVar = this.f9560m0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mLlViewModel");
        return null;
    }

    public final ArrayList u2() {
        ArrayList arrayList = this.f9563p0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiList");
        return null;
    }

    public final ResponseBody v2() {
        ResponseBody responseBody = this.f9559l0;
        if (responseBody != null) {
            return responseBody;
        }
        cm.l.v("respBody");
        return null;
    }

    public final DlServiceInt w2() {
        DlServiceInt dlServiceInt = this.f9551d0;
        if (dlServiceInt != null) {
            return dlServiceInt;
        }
        cm.l.v("retrofitService");
        return null;
    }

    public final ld.f x2() {
        ld.f fVar = this.f9557j0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final ld.f y2() {
        ld.f fVar = this.R;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }
}
