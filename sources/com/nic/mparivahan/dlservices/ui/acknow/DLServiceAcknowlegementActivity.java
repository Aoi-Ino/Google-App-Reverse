package com.nic.mparivahan.dlservices.ui.acknow;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsInterface;
import com.nic.mparivahan.DLServicesAuth.Forms.FormsPojo;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.data.model.ResultItemSubmit;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import com.nic.mparivahan.dlservices.ui.slots.DlRenewalSlotsActivity;
import fj.i;
import fj.j;
import fj.k;
import fj.n;
import fj.o;
import fj.q;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import ni.f3;
import oi.g;
import pl.x;
import v9.e;

public final class DLServiceAcknowlegementActivity extends g {

    /* renamed from: d0  reason: collision with root package name */
    public static final a f21894d0 = new a((cm.g) null);
    /* access modifiers changed from: private */
    public f3 J;
    private ResultItemSubmit K;
    private q L;
    public DldetobjX M;
    public ld.f N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    private String X = "";
    public x9.d Y;
    public FormsInterface Z;

    /* renamed from: a0  reason: collision with root package name */
    public ld.c f21895a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList f21896b0;

    /* renamed from: c0  reason: collision with root package name */
    public ArrayList f21897c0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(cm.g gVar) {
            this();
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLServiceAcknowlegementActivity f21898e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity) {
            super(1);
            this.f21898e = dLServiceAcknowlegementActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            f3 K1 = this.f21898e.J;
            if (K1 == null) {
                cm.l.v("mBinding");
                K1 = null;
            }
            K1.G.c(false);
            if (p.p(dlApplStatusDto.getStatusCode(), "00", false, 2, (Object) null)) {
                List<ApplStatusDetailsItem> applStatusDetails = dlApplStatusDto.getApplStatusDetails();
                if (applStatusDetails != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                    this.f21898e.C2(applStatusDetailsItem.getApplFlowStatusList());
                    return;
                }
                return;
            }
            Toast.makeText(this.f21898e, dlApplStatusDto.getStatusDesc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLServiceAcknowlegementActivity f21899e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity) {
            super(1);
            this.f21899e = dLServiceAcknowlegementActivity;
        }

        public final void b(FormsPojo formsPojo) {
            f3 K1 = this.f21899e.J;
            if (K1 == null) {
                cm.l.v("mBinding");
                K1 = null;
            }
            K1.K.c(false);
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = this.f21899e;
                dLServiceAcknowlegementActivity.r2(dLServiceAcknowlegementActivity.R1().b("label_form1_download", this.f21899e.getString(R.string.form1a_download)), formsPojo.getForm_report());
                return;
            }
            Toast.makeText(this.f21899e, formsPojo.getStatus_desc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLServiceAcknowlegementActivity f21900e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity) {
            super(1);
            this.f21900e = dLServiceAcknowlegementActivity;
        }

        public final void b(FormsPojo formsPojo) {
            DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity;
            ld.c R1;
            String string;
            String str;
            f3 K1 = this.f21900e.J;
            if (K1 == null) {
                cm.l.v("mBinding");
                K1 = null;
            }
            K1.K.c(false);
            if (p.o(formsPojo.getStatus_code(), "11", true)) {
                if (p.o(this.f21900e.W1().b(), VContant.CHANGE_OF_ADDRESS_PURPOSE_CODE, true)) {
                    dLServiceAcknowlegementActivity = this.f21900e;
                    R1 = dLServiceAcknowlegementActivity.R1();
                    string = this.f21900e.getString(R.string.form4_download);
                    str = "label_form4_download";
                } else {
                    dLServiceAcknowlegementActivity = this.f21900e;
                    R1 = dLServiceAcknowlegementActivity.R1();
                    string = this.f21900e.getString(R.string.form2_download);
                    str = "label_form2_download";
                }
                dLServiceAcknowlegementActivity.t2(R1.b(str, string), formsPojo.getForm_report());
                return;
            }
            Toast.makeText(this.f21900e, formsPojo.getStatus_desc(), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((FormsPojo) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DLServiceAcknowlegementActivity f21901e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity) {
            super(1);
            this.f21901e = dLServiceAcknowlegementActivity;
        }

        public final void b(String str) {
            f3 K1 = this.f21901e.J;
            if (K1 == null) {
                cm.l.v("mBinding");
                K1 = null;
            }
            K1.K.c(false);
            DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity = this.f21901e;
            Toast.makeText(dLServiceAcknowlegementActivity, dLServiceAcknowlegementActivity.R1().b("service_is_not_present", this.f21901e.getString(R.string.unable_to_get_details)), 1).show();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f21902a;

        f(l lVar) {
            cm.l.f(lVar, "function");
            this.f21902a = lVar;
        }

        public final pl.c a() {
            return this.f21902a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21902a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof h)) {
                return false;
            }
            return cm.l.a(a(), ((h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    /* access modifiers changed from: private */
    public final void C2(List list) {
        Integer num;
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
        } else {
            k2(num);
        }
    }

    private final void D2(File file) {
        Uri g10 = FileProvider.g(this, "com.nic.mparivahan.provider", file);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "image/*");
            intent.setFlags(67108864);
            intent.addFlags(1);
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, R1().b("popup_pdf_error", getString(R.string.pdf_error)), 1).show();
        }
    }

    private final void F2() {
        try {
            Intent intent = new Intent(this, DlDocActivity.class);
            String str = this.O;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.P;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", Q1());
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("DLDetails", Q1());
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.T);
            intent.putExtra("lastEndorsedState", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.V);
            intent.putExtra("lastEndorseStateCode", this.W);
            if (cm.l.a(W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", V1());
                intent.putExtra("listHeaderSteps", S1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void G2() {
        try {
            Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
            String str = this.O;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.P;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", Q1());
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("DLDetails", Q1());
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.T);
            intent.putExtra("lastEndorsedState", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.V);
            intent.putExtra("lastEndorseStateCode", this.W);
            if (cm.l.a(W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", V1());
                intent.putExtra("listHeaderSteps", S1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void H2() {
        try {
            Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
            String str = this.O;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.P;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", Q1());
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("DLDetails", Q1());
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.T);
            intent.putExtra("lastEndorsedState", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.V);
            intent.putExtra("lastEndorseStateCode", this.W);
            if (cm.l.a(W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", V1());
                intent.putExtra("listHeaderSteps", S1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void I2() {
        try {
            Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
            String str = this.O;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplNo");
                str = null;
            }
            intent.putExtra("dl_st_appl_ackno_no", str);
            String str3 = this.P;
            if (str3 == null) {
                cm.l.v("mApplDob");
            } else {
                str2 = str3;
            }
            intent.putExtra("dl_st_appl_ackno_no_dob", str2);
            intent.putExtra("dl_st_dl_details_obj", Q1());
            intent.putExtra("DL", this.Q);
            intent.putExtra("dob", this.R);
            intent.putExtra("DLDetails", Q1());
            intent.putExtra("Mobile_no", this.S);
            intent.putExtra("lastEndorsedRTO", this.T);
            intent.putExtra("lastEndorsedState", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.V);
            intent.putExtra("lastEndorseStateCode", this.W);
            if (cm.l.a(W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
                intent.putExtra("multiList", V1());
                intent.putExtra("listHeaderSteps", S1());
            }
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void P1(ResultItemSubmit resultItemSubmit) {
        new aj.b(this).execute(new ResultItemSubmit[]{resultItemSubmit});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.nic.mparivahan.dlservices.data.model.ResultItemSubmit} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [ni.f3] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02d3, code lost:
        if (r0 != null) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x02d5, code lost:
        cm.l.v("mBinding");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02d9, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02da, code lost:
        r6.f26210w.setText(R1().b("label_app_for_four", getString(com.nic.mparivahan.R.string.lbl4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02ee, code lost:
        if (r0 == null) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void X1() {
        /*
            r15 = this;
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>"
            java.lang.String r1 = "multiList"
            android.content.Intent r2 = r15.getIntent()
            r3 = 1
            java.lang.String r4 = "dlSuccessData"
            java.lang.String r5 = "mBinding"
            r6 = 0
            if (r2 == 0) goto L_0x0154
            android.content.Intent r2 = r15.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x0021
            java.lang.String r7 = "dl_success_response"
            java.lang.Object r2 = r2.get(r7)
            goto L_0x0022
        L_0x0021:
            r2 = r6
        L_0x0022:
            java.lang.String r7 = "null cannot be cast to non-null type com.nic.mparivahan.dlservices.data.model.ResultItemSubmit"
            cm.l.d(r2, r7)
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r2 = (com.nic.mparivahan.dlservices.data.model.ResultItemSubmit) r2
            r15.K = r2
            if (r2 != 0) goto L_0x0031
            cm.l.v(r4)
            r2 = r6
        L_0x0031:
            java.lang.String r2 = r2.getApplicationNo()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r15.O = r2
            android.content.Intent r2 = r15.getIntent()
            android.os.Bundle r2 = r2.getExtras()
            if (r2 == 0) goto L_0x004c
            java.lang.String r7 = "rto_code"
            java.lang.String r2 = r2.getString(r7)
            goto L_0x004d
        L_0x004c:
            r2 = r6
        L_0x004d:
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.String"
            cm.l.d(r2, r7)
            r15.V = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r8 = "DLDetails"
            java.io.Serializable r2 = r2.getSerializableExtra(r8)
            java.lang.String r9 = "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX"
            cm.l.d(r2, r9)
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2
            r15.v2(r2)
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r10 = "DL"
            java.lang.String r2 = r2.getStringExtra(r10)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r15.Q = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r10 = "dob"
            java.lang.String r2 = r2.getStringExtra(r10)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r15.R = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r10 = "Mobile_no"
            java.lang.String r2 = r2.getStringExtra(r10)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r15.S = r2
            android.content.Intent r2 = r15.getIntent()
            java.io.Serializable r2 = r2.getSerializableExtra(r8)
            cm.l.d(r2, r9)
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = (com.nic.mparivahan.Dl.Model.DldetobjX) r2
            r15.v2(r2)
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r8 = "lastEndorsedRTO"
            java.lang.String r2 = r2.getStringExtra(r8)
            cm.l.d(r2, r7)
            r15.T = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r8 = "lastEndorsedState"
            java.lang.String r2 = r2.getStringExtra(r8)
            cm.l.d(r2, r7)
            r15.U = r2
            android.content.Intent r2 = r15.getIntent()
            java.lang.String r8 = "lastEndorseStateCode"
            java.lang.String r2 = r2.getStringExtra(r8)
            cm.l.d(r2, r7)
            r15.W = r2
            com.nic.mparivahan.Dl.Model.DldetobjX r2 = r15.Q1()
            com.nic.mparivahan.Dl.Model.BioObjX r2 = r2.getBioObj()
            java.lang.String r2 = r2.getBioDob()
            java.lang.String r2 = com.nic.mparivahan.dlservices.utilities.e.j(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r15.P = r2
            ld.f r2 = r15.W1()
            java.lang.String r2 = r2.b()
            java.lang.String r7 = "1"
            boolean r2 = km.p.o(r2, r7, r3)
            if (r2 == 0) goto L_0x011a
            ni.f3 r2 = r15.J
            if (r2 != 0) goto L_0x0103
            cm.l.v(r5)
            r2 = r6
        L_0x0103:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r2.K
            ld.c r7 = r15.R1()
            r8 = 2132019514(0x7f14093a, float:1.9677365E38)
            java.lang.String r8 = r15.getString(r8)
            java.lang.String r9 = "label_view_forms"
            java.lang.String r7 = r7.b(r9, r8)
        L_0x0116:
            r2.setText(r7)
            goto L_0x0154
        L_0x011a:
            ld.f r2 = r15.W1()
            java.lang.String r2 = r2.b()
            java.lang.String r7 = "4"
            boolean r2 = km.p.o(r2, r7, r3)
            if (r2 == 0) goto L_0x0141
            ni.f3 r2 = r15.J
            if (r2 != 0) goto L_0x0132
            cm.l.v(r5)
            r2 = r6
        L_0x0132:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r2.K
            ld.c r7 = r15.R1()
            java.lang.String r8 = "label_form_4"
            java.lang.String r9 = "View Form 4-A"
        L_0x013c:
            java.lang.String r7 = r7.b(r8, r9)
            goto L_0x0116
        L_0x0141:
            ni.f3 r2 = r15.J
            if (r2 != 0) goto L_0x0149
            cm.l.v(r5)
            r2 = r6
        L_0x0149:
            com.nic.mparivahan.dlservices.widget.CustomWegetLayout r2 = r2.K
            ld.c r7 = r15.R1()
            java.lang.String r8 = "label_view_form_2"
            java.lang.String r9 = "View Form 2"
            goto L_0x013c
        L_0x0154:
            ni.f3 r2 = r15.J     // Catch:{ Exception -> 0x0191 }
            if (r2 != 0) goto L_0x015c
            cm.l.v(r5)     // Catch:{ Exception -> 0x0191 }
            r2 = r6
        L_0x015c:
            ni.yb r2 = r2.B     // Catch:{ Exception -> 0x0191 }
            android.widget.TextView r2 = r2.f29581h     // Catch:{ Exception -> 0x0191 }
            java.lang.String r7 = r15.Q     // Catch:{ Exception -> 0x0191 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0191 }
            java.lang.CharSequence r7 = km.q.B0(r7)     // Catch:{ Exception -> 0x0191 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0191 }
            r2.setText(r7)     // Catch:{ Exception -> 0x0191 }
            android.content.Intent r2 = r15.getIntent()     // Catch:{ Exception -> 0x0191 }
            java.io.Serializable r2 = r2.getSerializableExtra(r1)     // Catch:{ Exception -> 0x0191 }
            cm.l.d(r2, r0)     // Catch:{ Exception -> 0x0191 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ Exception -> 0x0191 }
            r15.A2(r2)     // Catch:{ Exception -> 0x0191 }
            android.content.Intent r2 = r15.getIntent()     // Catch:{ Exception -> 0x0191 }
            java.io.Serializable r1 = r2.getSerializableExtra(r1)     // Catch:{ Exception -> 0x0191 }
            cm.l.d(r1, r0)     // Catch:{ Exception -> 0x0191 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0191 }
            r15.x2(r1)     // Catch:{ Exception -> 0x0191 }
        L_0x0191:
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r0 = r15.K
            if (r0 != 0) goto L_0x0199
            cm.l.v(r4)
            r0 = r6
        L_0x0199:
            java.lang.String r0 = r0.getApplicationNo()
            cm.l.c(r0)
            int r0 = r0.length()
            r1 = 2132018257(0x7f140451, float:1.9674816E38)
            java.lang.String r2 = "label_app_for_four"
            if (r0 <= 0) goto L_0x02ec
            ld.f r0 = r15.W1()
            java.lang.String r0 = r0.i()
            java.lang.String r7 = "0"
            boolean r0 = cm.l.a(r0, r7)
            r7 = 2132018256(0x7f140450, float:1.9674814E38)
            java.lang.String r8 = "label_app_for_three"
            r9 = 10
            r10 = 32
            if (r0 == 0) goto L_0x021c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ld.c r3 = r15.R1()
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r1 = r3.b(r2, r1)
            r0.append(r1)
            r0.append(r9)
            ld.c r1 = r15.R1()
            java.lang.String r2 = r15.getString(r7)
            java.lang.String r1 = r1.b(r8, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            ni.f3 r1 = r15.J
            if (r1 != 0) goto L_0x01f6
            cm.l.v(r5)
            r1 = r6
        L_0x01f6:
            com.nic.mparivahan.dlservices.widget.MyTextView r1 = r1.f26210w
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r10)
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r0 = r15.K
            if (r0 != 0) goto L_0x020b
            cm.l.v(r4)
            goto L_0x020c
        L_0x020b:
            r6 = r0
        L_0x020c:
            java.lang.String r0 = r6.getApplicationNo()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            goto L_0x02f1
        L_0x021c:
            java.lang.String r0 = ""
            java.util.ArrayList r11 = r15.S1()     // Catch:{ Exception -> 0x02d1 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x02d1 }
            r12 = 0
            r13 = r12
        L_0x0228:
            if (r13 >= r11) goto L_0x024b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d1 }
            r14.<init>()     // Catch:{ Exception -> 0x02d1 }
            r14.append(r0)     // Catch:{ Exception -> 0x02d1 }
            java.util.ArrayList r0 = r15.S1()     // Catch:{ Exception -> 0x02d1 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02d1 }
            r14.append(r0)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = ", "
            r14.append(r0)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x02d1 }
            int r13 = r13 + 1
            goto L_0x0228
        L_0x024b:
            int r11 = r0.length()     // Catch:{ Exception -> 0x02d1 }
            int r11 = r11 - r3
            java.lang.String r0 = r0.substring(r12, r11)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x02d1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d1 }
            r3.<init>()     // Catch:{ Exception -> 0x02d1 }
            ld.c r11 = r15.R1()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r12 = "label_app_for"
            r13 = 2132018254(0x7f14044e, float:1.967481E38)
            java.lang.String r13 = r15.getString(r13)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r11 = r11.b(r12, r13)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r11)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r10)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r0)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r10)     // Catch:{ Exception -> 0x02d1 }
            ld.c r0 = r15.R1()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r11 = "label_app_for_two"
            r12 = 2132018255(0x7f14044f, float:1.9674811E38)
            java.lang.String r12 = r15.getString(r12)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = r0.b(r11, r12)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r0)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r9)     // Catch:{ Exception -> 0x02d1 }
            ld.c r0 = r15.R1()     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r7 = r15.getString(r7)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = r0.b(r8, r7)     // Catch:{ Exception -> 0x02d1 }
            r3.append(r0)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x02d1 }
            ni.f3 r3 = r15.J     // Catch:{ Exception -> 0x02d1 }
            if (r3 != 0) goto L_0x02ad
            cm.l.v(r5)     // Catch:{ Exception -> 0x02d1 }
            r3 = r6
        L_0x02ad:
            com.nic.mparivahan.dlservices.widget.MyTextView r3 = r3.f26210w     // Catch:{ Exception -> 0x02d1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d1 }
            r7.<init>()     // Catch:{ Exception -> 0x02d1 }
            r7.append(r0)     // Catch:{ Exception -> 0x02d1 }
            r7.append(r10)     // Catch:{ Exception -> 0x02d1 }
            com.nic.mparivahan.dlservices.data.model.ResultItemSubmit r0 = r15.K     // Catch:{ Exception -> 0x02d1 }
            if (r0 != 0) goto L_0x02c2
            cm.l.v(r4)     // Catch:{ Exception -> 0x02d1 }
            r0 = r6
        L_0x02c2:
            java.lang.String r0 = r0.getApplicationNo()     // Catch:{ Exception -> 0x02d1 }
            r7.append(r0)     // Catch:{ Exception -> 0x02d1 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x02d1 }
            r3.setText(r0)     // Catch:{ Exception -> 0x02d1 }
            goto L_0x02f1
        L_0x02d1:
            ni.f3 r0 = r15.J
            if (r0 != 0) goto L_0x02d9
        L_0x02d5:
            cm.l.v(r5)
            goto L_0x02da
        L_0x02d9:
            r6 = r0
        L_0x02da:
            com.nic.mparivahan.dlservices.widget.MyTextView r0 = r6.f26210w
            ld.c r3 = r15.R1()
            java.lang.String r1 = r15.getString(r1)
            java.lang.String r1 = r3.b(r2, r1)
            r0.setText(r1)
            goto L_0x02f1
        L_0x02ec:
            ni.f3 r0 = r15.J
            if (r0 != 0) goto L_0x02d9
            goto L_0x02d5
        L_0x02f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.dlservices.ui.acknow.DLServiceAcknowlegementActivity.X1():void");
    }

    private final void Y1() {
        q qVar = this.L;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new f(new b(this)));
    }

    private final void Z1() {
        f3 f3Var = this.J;
        f3 f3Var2 = null;
        if (f3Var == null) {
            cm.l.v("mBinding");
            f3Var = null;
        }
        f3Var.B.f29580g.setOnClickListener(new fj.a(this));
        f3 f3Var3 = this.J;
        if (f3Var3 == null) {
            cm.l.v("mBinding");
            f3Var3 = null;
        }
        f3Var3.B.f29577d.setOnClickListener(new fj.g(this));
        f3 f3Var4 = this.J;
        if (f3Var4 == null) {
            cm.l.v("mBinding");
            f3Var4 = null;
        }
        f3Var4.f26212y.setOnClickListener(new fj.h(this));
        f3 f3Var5 = this.J;
        if (f3Var5 == null) {
            cm.l.v("mBinding");
            f3Var5 = null;
        }
        f3Var5.G.setOnClickListener(new i(this));
        f3 f3Var6 = this.J;
        if (f3Var6 == null) {
            cm.l.v("mBinding");
            f3Var6 = null;
        }
        f3Var6.D.setOnClickListener(new j(this));
        f3 f3Var7 = this.J;
        if (f3Var7 == null) {
            cm.l.v("mBinding");
            f3Var7 = null;
        }
        f3Var7.H.setOnClickListener(new k(this));
        f3 f3Var8 = this.J;
        if (f3Var8 == null) {
            cm.l.v("mBinding");
        } else {
            f3Var2 = f3Var8;
        }
        f3Var2.K.setOnClickListener(new fj.l(this));
        U1().k().g(this, new f(new d(this)));
        U1().i().g(this, new f(new e(this)));
        U1().j().g(this, new f(new c(this)));
    }

    /* access modifiers changed from: private */
    public static final void a2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        String str = dLServiceAcknowlegementActivity.R;
        cm.l.c(str);
        String O1 = dLServiceAcknowlegementActivity.O1(str);
        if (p.o(dLServiceAcknowlegementActivity.W1().b(), "1", true)) {
            dLServiceAcknowlegementActivity.l2();
        } else if (com.nic.mparivahan.dlservices.utilities.e.e(dLServiceAcknowlegementActivity)) {
            try {
                String str2 = dLServiceAcknowlegementActivity.O;
                f3 f3Var = null;
                if (str2 == null) {
                    cm.l.v("mApplNo");
                    str2 = null;
                }
                Charset forName = Charset.forName("UTF-8");
                cm.l.e(forName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(forName);
                cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                Charset forName2 = Charset.forName("UTF-8");
                cm.l.e(forName2, "forName(charsetName)");
                byte[] bytes2 = O1.getBytes(forName2);
                cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                String encodeToString2 = Base64.encodeToString(bytes2, 0);
                if (dd.a.f9964a.a(dLServiceAcknowlegementActivity)) {
                    f3 f3Var2 = dLServiceAcknowlegementActivity.J;
                    if (f3Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        f3Var = f3Var2;
                    }
                    f3Var.K.c(true);
                    x9.d U1 = dLServiceAcknowlegementActivity.U1();
                    cm.l.c(encodeToString);
                    cm.l.c(encodeToString2);
                    U1.h(encodeToString, encodeToString2);
                    return;
                }
                Toast.makeText(dLServiceAcknowlegementActivity, dLServiceAcknowlegementActivity.getString(R.string.no_internet), 1).show();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        if (cm.l.a(dLServiceAcknowlegementActivity.W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            Dialog dialog = new Dialog(dLServiceAcknowlegementActivity);
            dialog.setContentView(R.layout.layout_multi);
            Window window = dialog.getWindow();
            cm.l.c(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            View findViewById = dialog.findViewById(R.id.service_label_cross);
            cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            View findViewById2 = dialog.findViewById(R.id.pop_up_close);
            cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            View findViewById3 = dialog.findViewById(R.id.service_label_list);
            cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById3;
            View findViewById4 = dialog.findViewById(R.id.service_label_list_serial);
            cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById4;
            ((ImageView) findViewById).setOnClickListener(new n(dialog));
            ((TextView) findViewById2).setOnClickListener(new o(dialog));
            int size = dLServiceAcknowlegementActivity.S1().size();
            String str = "";
            int i10 = 0;
            String str2 = str;
            while (i10 < size) {
                str = str + ((String) dLServiceAcknowlegementActivity.S1().get(i10)) + 10;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                i10++;
                sb2.append(i10);
                sb2.append(".\n");
                str2 = sb2.toString();
            }
            textView.setText(str);
            textView2.setText(str2);
            Window window2 = dialog.getWindow();
            cm.l.c(window2);
            window2.setGravity(48);
            window2.setLayout(-2, -2);
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void d2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void e2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        dLServiceAcknowlegementActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void f2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        if (com.nic.mparivahan.dlservices.utilities.e.e(dLServiceAcknowlegementActivity)) {
            ResultItemSubmit resultItemSubmit = dLServiceAcknowlegementActivity.K;
            if (resultItemSubmit == null) {
                cm.l.v("dlSuccessData");
                resultItemSubmit = null;
            }
            dLServiceAcknowlegementActivity.P1(resultItemSubmit);
        }
    }

    /* access modifiers changed from: private */
    public static final void g2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        ResultItemSubmit resultItemSubmit = dLServiceAcknowlegementActivity.K;
        q qVar = null;
        if (resultItemSubmit == null) {
            cm.l.v("dlSuccessData");
            resultItemSubmit = null;
        }
        String applicationNo = resultItemSubmit.getApplicationNo();
        if (applicationNo != null) {
            ResultItemSubmit resultItemSubmit2 = dLServiceAcknowlegementActivity.K;
            if (resultItemSubmit2 == null) {
                cm.l.v("dlSuccessData");
                resultItemSubmit2 = null;
            }
            String k10 = com.nic.mparivahan.dlservices.utilities.e.k(resultItemSubmit2.getDateofBirth(), "yyyy-MM-dd", "dd-MM-yyyy");
            if (k10 != null) {
                f3 f3Var = dLServiceAcknowlegementActivity.J;
                if (f3Var == null) {
                    cm.l.v("mBinding");
                    f3Var = null;
                }
                f3Var.G.c(true);
                q qVar2 = dLServiceAcknowlegementActivity.L;
                if (qVar2 == null) {
                    cm.l.v("viewModel");
                } else {
                    qVar = qVar2;
                }
                qVar.h(applicationNo, k10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void h2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        Intent intent = new Intent(dLServiceAcknowlegementActivity, DashBoard.class);
        intent.addFlags(67108864);
        dLServiceAcknowlegementActivity.startActivity(intent);
        dLServiceAcknowlegementActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void i2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        if (com.nic.mparivahan.dlservices.utilities.e.e(dLServiceAcknowlegementActivity)) {
            f3 f3Var = dLServiceAcknowlegementActivity.J;
            if (f3Var == null) {
                cm.l.v("mBinding");
                f3Var = null;
            }
            ConstraintLayout constraintLayout = f3Var.f26211x;
            cm.l.e(constraintLayout, "containerCl");
            dLServiceAcknowlegementActivity.j2(constraintLayout);
        }
    }

    private final void j2(ConstraintLayout constraintLayout) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
            cm.l.e(createBitmap, "createBitmap(...)");
            constraintLayout.draw(new Canvas(createBitmap));
            String str = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "//";
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("screenshot");
            String str2 = this.O;
            if (str2 == null) {
                cm.l.v("mApplNo");
                str2 = null;
            }
            sb2.append(str2);
            sb2.append(".png");
            File file2 = new File(sb2.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            createBitmap.compress(Bitmap.CompressFormat.PNG, 70, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            D2(file2);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private final void l2() {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.download_forms);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.cancelIv);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View findViewById2 = dialog.findViewById(R.id.form_one);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById3 = dialog.findViewById(R.id.form_two);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((ImageView) findViewById).setOnClickListener(new fj.b(dialog));
        ((TextView) findViewById2).setOnClickListener(new fj.c(this, dialog));
        ((TextView) findViewById3).setOnClickListener(new fj.d(this, dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void m2(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void n2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, Dialog dialog, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.dlservices.utilities.e.e(dLServiceAcknowlegementActivity)) {
            try {
                dialog.dismiss();
                String str = dLServiceAcknowlegementActivity.R;
                cm.l.c(str);
                String O1 = dLServiceAcknowlegementActivity.O1(str);
                String str2 = dLServiceAcknowlegementActivity.O;
                f3 f3Var = null;
                if (str2 == null) {
                    cm.l.v("mApplNo");
                    str2 = null;
                }
                Charset forName = Charset.forName("UTF-8");
                cm.l.e(forName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(forName);
                cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                Charset forName2 = Charset.forName("UTF-8");
                cm.l.e(forName2, "forName(charsetName)");
                byte[] bytes2 = O1.getBytes(forName2);
                cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                String encodeToString2 = Base64.encodeToString(bytes2, 0);
                if (dd.a.f9964a.a(dLServiceAcknowlegementActivity)) {
                    f3 f3Var2 = dLServiceAcknowlegementActivity.J;
                    if (f3Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        f3Var = f3Var2;
                    }
                    f3Var.K.c(true);
                    x9.d U1 = dLServiceAcknowlegementActivity.U1();
                    cm.l.c(encodeToString);
                    cm.l.c(encodeToString2);
                    U1.g(encodeToString, encodeToString2);
                    return;
                }
                Toast.makeText(dLServiceAcknowlegementActivity, dLServiceAcknowlegementActivity.R1().b("label_log_check_internet", dLServiceAcknowlegementActivity.getString(R.string.kindly_check_your_internet_connection)), 1).show();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void o2(DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, Dialog dialog, View view) {
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        cm.l.f(dialog, "$d");
        if (com.nic.mparivahan.dlservices.utilities.e.e(dLServiceAcknowlegementActivity)) {
            try {
                dialog.dismiss();
                String str = dLServiceAcknowlegementActivity.R;
                cm.l.c(str);
                String O1 = dLServiceAcknowlegementActivity.O1(str);
                String str2 = dLServiceAcknowlegementActivity.O;
                f3 f3Var = null;
                if (str2 == null) {
                    cm.l.v("mApplNo");
                    str2 = null;
                }
                Charset forName = Charset.forName("UTF-8");
                cm.l.e(forName, "forName(charsetName)");
                byte[] bytes = str2.getBytes(forName);
                cm.l.e(bytes, "this as java.lang.String).getBytes(charset)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                Charset forName2 = Charset.forName("UTF-8");
                cm.l.e(forName2, "forName(charsetName)");
                byte[] bytes2 = O1.getBytes(forName2);
                cm.l.e(bytes2, "this as java.lang.String).getBytes(charset)");
                String encodeToString2 = Base64.encodeToString(bytes2, 0);
                if (dd.a.f9964a.a(dLServiceAcknowlegementActivity)) {
                    f3 f3Var2 = dLServiceAcknowlegementActivity.J;
                    if (f3Var2 == null) {
                        cm.l.v("mBinding");
                    } else {
                        f3Var = f3Var2;
                    }
                    f3Var.K.c(true);
                    x9.d U1 = dLServiceAcknowlegementActivity.U1();
                    cm.l.c(encodeToString);
                    cm.l.c(encodeToString2);
                    U1.h(encodeToString, encodeToString2);
                    return;
                }
                Toast.makeText(dLServiceAcknowlegementActivity, dLServiceAcknowlegementActivity.getString(R.string.no_internet), 1).show();
            } catch (Exception unused) {
            }
        }
    }

    private final void p2(String str) {
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
        ((TextView) findViewById2).setOnClickListener(new fj.m(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void q2(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dLServiceAcknowlegementActivity, DashBoard.class);
        intent.setFlags(67108864);
        dLServiceAcknowlegementActivity.startActivity(intent);
        dLServiceAcknowlegementActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void r2(String str, String str2) {
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
        ((TextView) findViewById2).setOnClickListener(new fj.e(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void s2(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = dLServiceAcknowlegementActivity.O;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("mApplNo");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append(".pdf");
            File file2 = new File(str2 + sb2.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append("/mParivahan_doc/");
            String str5 = dLServiceAcknowlegementActivity.O;
            if (str5 == null) {
                cm.l.v("mApplNo");
            } else {
                str4 = str5;
            }
            sb3.append(str4);
            sb3.append(".pdf");
            Uri g10 = FileProvider.g(dLServiceAcknowlegementActivity, "com.nic.mparivahan.provider", new File(sb3.toString()));
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            dLServiceAcknowlegementActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public final void t2(String str, String str2) {
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
        ((TextView) findViewById2).setOnClickListener(new fj.f(dialog, this, str2));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void u2(Dialog dialog, DLServiceAcknowlegementActivity dLServiceAcknowlegementActivity, String str, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dLServiceAcknowlegementActivity, "this$0");
        cm.l.f(str, "$pdfUrl");
        dialog.dismiss();
        try {
            String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
            File file = new File(str2);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            String str3 = dLServiceAcknowlegementActivity.O;
            String str4 = null;
            if (str3 == null) {
                cm.l.v("mApplNo");
                str3 = null;
            }
            sb2.append(str3);
            sb2.append("_form.pdf");
            File file2 = new File(str2 + sb2.toString());
            if (!file2.exists()) {
                byte[] decode = Base64.decode(str, 0);
                cm.l.e(decode, "decode(...)");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
            sb3.append("/mParivahan_doc/");
            String str5 = dLServiceAcknowlegementActivity.O;
            if (str5 == null) {
                cm.l.v("mApplNo");
            } else {
                str4 = str5;
            }
            sb3.append(str4);
            sb3.append("_form.pdf");
            Uri g10 = FileProvider.g(dLServiceAcknowlegementActivity, "com.nic.mparivahan.provider", new File(sb3.toString()));
            Log.e("create pdf uri path==>", "" + g10);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            dLServiceAcknowlegementActivity.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    public final void A2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f21896b0 = arrayList;
    }

    public final void B2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.N = fVar;
    }

    public final void E2(Context context, ResultItemSubmit resultItemSubmit, String str, DldetobjX dldetobjX, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList) {
        cm.l.f(context, "context");
        cm.l.f(resultItemSubmit, "dlSuccessDetails");
        cm.l.f(dldetobjX, "dlDetails");
        cm.l.f(arrayList, "multiListName");
        try {
            Intent intent = new Intent(context, DLServiceAcknowlegementActivity.class);
            intent.setFlags(268468224);
            intent.putExtra("dl_success_response", resultItemSubmit);
            intent.putExtra("rto_code", str);
            intent.putExtra("DLDetails", dldetobjX);
            intent.putExtra("DL", str2);
            intent.putExtra("dob", str3);
            intent.putExtra("Mobile_no", str4);
            intent.putExtra("lastEndorsedRTO", str5);
            intent.putExtra("lastEndorsedState", str6);
            intent.putExtra("lastEndorsedRTOCode", this.V);
            intent.putExtra("lastEndorseStateCode", str7);
            intent.putExtra("multiList", arrayList);
            context.startActivity(intent);
        } catch (Throwable th2) {
            Log.d("dup_dl_respo++", th2.getLocalizedMessage());
        }
    }

    public final String O1(String str) {
        cm.l.f(str, "date");
        try {
            String format = new SimpleDateFormat("dd-MM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
            cm.l.c(format);
            return format;
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public final DldetobjX Q1() {
        DldetobjX dldetobjX = this.M;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c R1() {
        ld.c cVar = this.f21895a0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ArrayList S1() {
        ArrayList arrayList = this.f21897c0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("listHeaderSteps");
        return null;
    }

    public final FormsInterface T1() {
        FormsInterface formsInterface = this.Z;
        if (formsInterface != null) {
            return formsInterface;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final x9.d U1() {
        x9.d dVar = this.Y;
        if (dVar != null) {
            return dVar;
        }
        cm.l.v("mFormsVM");
        return null;
    }

    public final ArrayList V1() {
        ArrayList arrayList = this.f21896b0;
        if (arrayList != null) {
            return arrayList;
        }
        cm.l.v("multiListName");
        return null;
    }

    public final ld.f W1() {
        ld.f fVar = this.N;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void k2(Integer num) {
        if (num != null && num.intValue() == 135) {
            H2();
        } else if (num != null && num.intValue() == 134) {
            G2();
        } else if (num != null && num.intValue() == 123) {
            F2();
        } else if (num != null && num.intValue() == 371) {
            I2();
        } else if (num != null && num.intValue() == 455) {
            p2(R1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_service_acknow);
        cm.l.e(f10, "setContentView(...)");
        this.J = (f3) f10;
        B2(new ld.f(this));
        w2(new ld.c(this));
        e.a aVar = v9.e.f17509a;
        f3 f3Var = this.J;
        f3 f3Var2 = null;
        if (f3Var == null) {
            cm.l.v("mBinding");
            f3Var = null;
        }
        aVar.n0(this, f3Var);
        this.L = (q) new u0(this).a(q.class);
        y2(FormsInterface.f8102a.a(this));
        z2((x9.d) new u0((x0) this, (u0.b) new x9.c(new x9.b(T1()))).a(x9.d.class));
        X1();
        Y1();
        Z1();
        f3 f3Var3 = this.J;
        if (f3Var3 == null) {
            cm.l.v("mBinding");
            f3Var3 = null;
        }
        f3Var3.I.setText(W1().i());
        if (cm.l.a(W1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            f3 f3Var4 = this.J;
            if (f3Var4 == null) {
                cm.l.v("mBinding");
                f3Var4 = null;
            }
            f3Var4.C.setVisibility(8);
            f3 f3Var5 = this.J;
            if (f3Var5 == null) {
                cm.l.v("mBinding");
                f3Var5 = null;
            }
            f3Var5.B.f29578e.setVisibility(0);
            f3 f3Var6 = this.J;
            if (f3Var6 == null) {
                cm.l.v("mBinding");
                f3Var6 = null;
            }
            f3Var6.B.f29581h.setText(q.B0(String.valueOf(this.Q)).toString());
            f3 f3Var7 = this.J;
            if (f3Var7 == null) {
                cm.l.v("mBinding");
                f3Var7 = null;
            }
            TextView textView = f3Var7.B.f29581h;
            f3 f3Var8 = this.J;
            if (f3Var8 == null) {
                cm.l.v("mBinding");
            } else {
                f3Var2 = f3Var8;
            }
            textView.setPaintFlags(f3Var2.B.f29581h.getPaintFlags() | 8);
            return;
        }
        f3 f3Var9 = this.J;
        if (f3Var9 == null) {
            cm.l.v("mBinding");
            f3Var9 = null;
        }
        f3Var9.B.f29578e.setVisibility(8);
        f3 f3Var10 = this.J;
        if (f3Var10 == null) {
            cm.l.v("mBinding");
        } else {
            f3Var2 = f3Var10;
        }
        f3Var2.C.setVisibility(0);
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 1002) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "Permission denied", 0).show();
            }
        }
    }

    public final void v2(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.M = dldetobjX;
    }

    public final void w2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f21895a0 = cVar;
    }

    public final void x2(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.f21897c0 = arrayList;
    }

    public final void y2(FormsInterface formsInterface) {
        cm.l.f(formsInterface, "<set-?>");
        this.Z = formsInterface;
    }

    public final void z2(x9.d dVar) {
        cm.l.f(dVar, "<set-?>");
        this.Y = dVar;
    }
}
