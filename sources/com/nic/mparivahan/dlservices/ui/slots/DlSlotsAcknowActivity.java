package com.nic.mparivahan.dlservices.ui.slots;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import com.nic.mparivahan.dlservices.ui.dms.DlDocActivity;
import com.nic.mparivahan.dlservices.ui.payment.DLRenewalFeePaymentActivity;
import com.nic.mparivahan.dlservices.ui.photoandsign.DlPhotoAndSignatureActivity;
import fj.q;
import fk.i;
import fk.j;
import fk.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ld.f;
import ni.h3;
import oi.g;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class DlSlotsAcknowActivity extends g {
    /* access modifiers changed from: private */
    public h3 J;
    private q K;
    /* access modifiers changed from: private */
    public String L;
    private String M;
    public DldetobjX N;
    private String O;
    /* access modifiers changed from: private */
    public ProgressDialog P;
    private final int Q = 5001;
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    private String V = "";
    private String W = "";
    public ld.c X;
    public f Y;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlSlotsAcknowActivity f22369e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlSlotsAcknowActivity dlSlotsAcknowActivity) {
            super(1);
            this.f22369e = dlSlotsAcknowActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            h3 B1 = this.f22369e.J;
            if (B1 == null) {
                cm.l.v("mBinding");
                B1 = null;
            }
            B1.E.c(false);
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                this.f22369e.Z1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlSlotsAcknowActivity f22370e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlSlotsAcknowActivity dlSlotsAcknowActivity) {
            super(1);
            this.f22370e = dlSlotsAcknowActivity;
        }

        public final void b(JSONObject jSONObject) {
            ProgressDialog C1 = this.f22370e.P;
            String str = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog C12 = this.f22370e.P;
                    if (C12 == null) {
                        cm.l.v("pDialog");
                        C12 = null;
                    }
                    C12.dismiss();
                    if (jSONObject.has("Reportdets")) {
                        Log.v("Insode", "true");
                        String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
                        File file = new File(str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        String A1 = this.f22370e.L;
                        if (A1 == null) {
                            cm.l.v("mApplNo");
                        } else {
                            str = A1;
                        }
                        sb2.append(str);
                        sb2.append(".pdf");
                        File file2 = new File(sb2.toString());
                        byte[] decode = Base64.decode(jSONObject.getString("Reportdets"), 0);
                        cm.l.e(decode, "decode(...)");
                        Log.v("Decode", decode.toString());
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(decode);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        DlSlotsAcknowActivity dlSlotsAcknowActivity = this.f22370e;
                        dlSlotsAcknowActivity.R1(dlSlotsAcknowActivity);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((JSONObject) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f22371a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f22371a = lVar;
        }

        public final pl.c a() {
            return this.f22371a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f22371a.invoke(obj);
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

    private final void G1(Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString());
        sb2.append("/mParivahan_doc/");
        String str = this.L;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        sb2.append(str);
        sb2.append(".pdf");
        Uri g10 = FileProvider.g(context, "com.nic.mparivahan.provider", new File(sb2.toString()));
        Log.e("create pdf uri path==>", "" + g10);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(g10, "application/pdf");
            intent.setFlags(67108864);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, I1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void K1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            h3 h3Var = null;
            this.L = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.M = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            Bundle extras3 = getIntent().getExtras();
            Serializable serializable = extras3 != null ? extras3.getSerializable("dl_st_dl_details_obj") : null;
            cm.l.d(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            W1((DldetobjX) serializable);
            Bundle extras4 = getIntent().getExtras();
            Object obj = extras4 != null ? extras4.get("slot-date") : null;
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle extras5 = getIntent().getExtras();
            Object obj2 = extras5 != null ? extras5.get("slot-time") : null;
            cm.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            h3 h3Var2 = this.J;
            if (h3Var2 == null) {
                cm.l.v("mBinding");
                h3Var2 = null;
            }
            h3Var2.f26602w.setText(str);
            h3 h3Var3 = this.J;
            if (h3Var3 == null) {
                cm.l.v("mBinding");
            } else {
                h3Var = h3Var3;
            }
            h3Var.f26603x.setText(str2);
        }
    }

    private final void L1() {
        q qVar = (q) new u0(this).a(q.class);
        this.K = qVar;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new c(new a(this)));
    }

    private final void M1() {
        h3 h3Var = this.J;
        q qVar = null;
        if (h3Var == null) {
            cm.l.v("mBinding");
            h3Var = null;
        }
        h3Var.A.setOnClickListener(new j(this));
        h3 h3Var2 = this.J;
        if (h3Var2 == null) {
            cm.l.v("mBinding");
            h3Var2 = null;
        }
        h3Var2.E.setOnClickListener(new k(this));
        h3 h3Var3 = this.J;
        if (h3Var3 == null) {
            cm.l.v("mBinding");
            h3Var3 = null;
        }
        h3Var3.B.f25959e.setOnClickListener(new fk.l(this));
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void N1(DlSlotsAcknowActivity dlSlotsAcknowActivity, View view) {
        cm.l.f(dlSlotsAcknowActivity, "this$0");
        if (dlSlotsAcknowActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            dlSlotsAcknowActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, dlSlotsAcknowActivity.Q);
        } else {
            dlSlotsAcknowActivity.V1();
        }
    }

    /* access modifiers changed from: private */
    public static final void O1(DlSlotsAcknowActivity dlSlotsAcknowActivity, View view) {
        cm.l.f(dlSlotsAcknowActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlSlotsAcknowActivity)) {
            String str = dlSlotsAcknowActivity.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplDob");
                str = null;
            }
            String F1 = dlSlotsAcknowActivity.F1(str);
            if (F1 != null) {
                h3 h3Var = dlSlotsAcknowActivity.J;
                if (h3Var == null) {
                    cm.l.v("mBinding");
                    h3Var = null;
                }
                h3Var.E.c(true);
                q qVar = dlSlotsAcknowActivity.K;
                if (qVar == null) {
                    cm.l.v("viewModel");
                    qVar = null;
                }
                String str3 = dlSlotsAcknowActivity.L;
                if (str3 == null) {
                    cm.l.v("mApplNo");
                } else {
                    str2 = str3;
                }
                qVar.h(str2, F1);
                return;
            }
            return;
        }
        Toast.makeText(dlSlotsAcknowActivity.getApplicationContext(), dlSlotsAcknowActivity.I1().b("label_log_check_internet", dlSlotsAcknowActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void P1(DlSlotsAcknowActivity dlSlotsAcknowActivity, View view) {
        cm.l.f(dlSlotsAcknowActivity, "this$0");
        dlSlotsAcknowActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void R1(Context context) {
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
        textView.setText(I1().b(v9.f.f17510a.c(), "Open PDF"));
        ((TextView) findViewById).setText(I1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new fk.m(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, DlSlotsAcknowActivity dlSlotsAcknowActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlSlotsAcknowActivity, "this$0");
        dialog.dismiss();
        dlSlotsAcknowActivity.G1(dlSlotsAcknowActivity);
    }

    private final void T1(String str) {
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
        ((TextView) findViewById3).setText(I1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(I1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new i(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void U1(Dialog dialog, DlSlotsAcknowActivity dlSlotsAcknowActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlSlotsAcknowActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlSlotsAcknowActivity, DashBoard.class);
        intent.setFlags(67108864);
        dlSlotsAcknowActivity.startActivity(intent);
        dlSlotsAcknowActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void Z1(List list) {
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
            Q1(num);
        }
    }

    private final void a2() {
        Intent intent = new Intent(this, DlDocActivity.class);
        String str = this.L;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.M;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", H1());
        intent.putExtra("DL", this.R);
        intent.putExtra("dob", this.S);
        intent.putExtra("DLDetails", H1());
        intent.putExtra("Mobile_no", this.T);
        intent.putExtra("lastEndorsedRTO", this.U);
        intent.putExtra("lastEndorsedState", this.V);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("lastEndorseStateCode", this.W);
        startActivity(intent);
        finish();
    }

    private final void b2() {
        Intent intent = new Intent(this, DLRenewalFeePaymentActivity.class);
        String str = this.L;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.M;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", H1());
        intent.putExtra("DL", this.R);
        intent.putExtra("dob", this.S);
        intent.putExtra("DLDetails", H1());
        intent.putExtra("Mobile_no", this.T);
        intent.putExtra("lastEndorsedRTO", this.U);
        intent.putExtra("lastEndorsedState", this.V);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("lastEndorseStateCode", this.W);
        startActivity(intent);
        finish();
    }

    private final void c2() {
        Intent intent = new Intent(this, DlPhotoAndSignatureActivity.class);
        String str = this.L;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.M;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", H1());
        intent.putExtra("DL", this.R);
        intent.putExtra("dob", this.S);
        intent.putExtra("DLDetails", H1());
        intent.putExtra("Mobile_no", this.T);
        intent.putExtra("lastEndorsedRTO", this.U);
        intent.putExtra("lastEndorsedState", this.V);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("lastEndorseStateCode", this.W);
        startActivity(intent);
        finish();
    }

    private final void d2() {
        Intent intent = new Intent(this, DlRenewalSlotsActivity.class);
        String str = this.L;
        String str2 = null;
        if (str == null) {
            cm.l.v("mApplNo");
            str = null;
        }
        intent.putExtra("dl_st_appl_ackno_no", str);
        String str3 = this.M;
        if (str3 == null) {
            cm.l.v("mApplDob");
        } else {
            str2 = str3;
        }
        intent.putExtra("dl_st_appl_ackno_no_dob", str2);
        intent.putExtra("dl_st_dl_details_obj", H1());
        intent.putExtra("DL", this.R);
        intent.putExtra("dob", this.S);
        intent.putExtra("DLDetails", H1());
        intent.putExtra("Mobile_no", this.T);
        intent.putExtra("lastEndorsedRTO", this.U);
        intent.putExtra("lastEndorsedState", this.V);
        intent.putExtra("lastEndorsedRTOCode", this.O);
        intent.putExtra("lastEndorseStateCode", this.W);
        startActivity(intent);
        finish();
    }

    public final String F1(String str) {
        Log.e("slot-dob", String.valueOf(str));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date parse = simpleDateFormat.parse(str);
            cm.l.e(parse, "parse(...)");
            return simpleDateFormat2.format(parse);
        } catch (ParseException unused) {
            return null;
        }
    }

    public final DldetobjX H1() {
        DldetobjX dldetobjX = this.N;
        if (dldetobjX != null) {
            return dldetobjX;
        }
        cm.l.v("dlDetails");
        return null;
    }

    public final ld.c I1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final f J1() {
        f fVar = this.Y;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void Q1(Integer num) {
        if (num != null && num.intValue() == 135) {
            c2();
        } else if (num != null && num.intValue() == 134) {
            b2();
        } else if (num != null && num.intValue() == 123) {
            a2();
        } else if (num != null && num.intValue() == 371) {
            d2();
        } else if (num != null && num.intValue() == 455) {
            T1(I1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void V1() {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.P = progressDialog;
            progressDialog.setMessage(getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.P;
            String str = null;
            if (progressDialog2 == null) {
                cm.l.v("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.P;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.P;
            if (progressDialog4 == null) {
                cm.l.v("pDialog");
                progressDialog4 = null;
            }
            progressDialog4.setCanceledOnTouchOutside(false);
            q qVar = this.K;
            if (qVar == null) {
                cm.l.v("viewModel");
                qVar = null;
            }
            String str2 = this.M;
            if (str2 == null) {
                cm.l.v("mApplDob");
                str2 = null;
            }
            String str3 = this.L;
            if (str3 == null) {
                cm.l.v("mApplNo");
            } else {
                str = str3;
            }
            qVar.g(str2, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void W1(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.N = dldetobjX;
    }

    public final void X1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void Y1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.Y = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_slots_acknow);
        cm.l.e(f10, "setContentView(...)");
        h3 h3Var = (h3) f10;
        this.J = h3Var;
        e.a aVar = e.f17509a;
        h3 h3Var2 = null;
        if (h3Var == null) {
            cm.l.v("mBinding");
            h3Var = null;
        }
        aVar.P1(this, h3Var);
        X1(new ld.c(this));
        Y1(new f(this));
        K1();
        L1();
        M1();
        h3 h3Var3 = this.J;
        if (h3Var3 == null) {
            cm.l.v("mBinding");
            h3Var3 = null;
        }
        h3Var3.C.f29578e.setVisibility(8);
        h3 h3Var4 = this.J;
        if (h3Var4 == null) {
            cm.l.v("mBinding");
            h3Var4 = null;
        }
        h3Var4.B.f25961g.setVisibility(0);
        h3 h3Var5 = this.J;
        if (h3Var5 == null) {
            cm.l.v("mBinding");
        } else {
            h3Var2 = h3Var5;
        }
        h3Var2.B.f25961g.setText(J1().i());
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.Q) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                V1();
            }
        }
    }
}
