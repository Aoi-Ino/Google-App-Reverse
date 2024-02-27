package com.nic.mparivahan.dlservices.newlearner;

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
import bj.g1;
import bj.h1;
import bj.i1;
import bj.j1;
import bj.k1;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Dl.Model.DldetobjX;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ld.f;
import ni.h3;
import oi.g;
import org.json.JSONObject;
import pl.x;
import v9.e;

public final class LLSlotsAcknowActivity extends g {
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
    public ArrayList Y;
    public ArrayList Z;

    /* renamed from: a0  reason: collision with root package name */
    public f f21735a0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLSlotsAcknowActivity f21736e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLSlotsAcknowActivity lLSlotsAcknowActivity) {
            super(1);
            this.f21736e = lLSlotsAcknowActivity;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            h3 B1 = this.f21736e.J;
            if (B1 == null) {
                cm.l.v("mBinding");
                B1 = null;
            }
            B1.E.c(false);
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                this.f21736e.a2(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLSlotsAcknowActivity f21737e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LLSlotsAcknowActivity lLSlotsAcknowActivity) {
            super(1);
            this.f21737e = lLSlotsAcknowActivity;
        }

        public final void b(JSONObject jSONObject) {
            ProgressDialog C1 = this.f21737e.P;
            String str = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog C12 = this.f21737e.P;
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
                        String A1 = this.f21737e.L;
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
                        LLSlotsAcknowActivity lLSlotsAcknowActivity = this.f21737e;
                        lLSlotsAcknowActivity.Q1(lLSlotsAcknowActivity);
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
        private final /* synthetic */ l f21738a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f21738a = lVar;
        }

        public final pl.c a() {
            return this.f21738a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f21738a.invoke(obj);
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
            Toast.makeText(context, H1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void J1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            h3 h3Var = null;
            this.L = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.M = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            Bundle extras3 = getIntent().getExtras();
            Serializable serializable = extras3 != null ? extras3.getSerializable("dl_st_dl_details_obj") : null;
            cm.l.d(serializable, "null cannot be cast to non-null type com.nic.mparivahan.Dl.Model.DldetobjX");
            V1((DldetobjX) serializable);
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

    private final void K1() {
        q qVar = (q) new u0(this).a(q.class);
        this.K = qVar;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new c(new a(this)));
    }

    private final void L1() {
        h3 h3Var = this.J;
        q qVar = null;
        if (h3Var == null) {
            cm.l.v("mBinding");
            h3Var = null;
        }
        h3Var.A.setOnClickListener(new h1(this));
        h3 h3Var2 = this.J;
        if (h3Var2 == null) {
            cm.l.v("mBinding");
            h3Var2 = null;
        }
        h3Var2.E.setOnClickListener(new i1(this));
        h3 h3Var3 = this.J;
        if (h3Var3 == null) {
            cm.l.v("mBinding");
            h3Var3 = null;
        }
        h3Var3.B.f25959e.setOnClickListener(new j1(this));
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void M1(LLSlotsAcknowActivity lLSlotsAcknowActivity, View view) {
        cm.l.f(lLSlotsAcknowActivity, "this$0");
        if (lLSlotsAcknowActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            lLSlotsAcknowActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, lLSlotsAcknowActivity.Q);
        } else {
            lLSlotsAcknowActivity.U1();
        }
    }

    /* access modifiers changed from: private */
    public static final void N1(LLSlotsAcknowActivity lLSlotsAcknowActivity, View view) {
        cm.l.f(lLSlotsAcknowActivity, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(lLSlotsAcknowActivity)) {
            String str = lLSlotsAcknowActivity.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplDob");
                str = null;
            }
            String F1 = lLSlotsAcknowActivity.F1(str);
            if (F1 != null) {
                h3 h3Var = lLSlotsAcknowActivity.J;
                if (h3Var == null) {
                    cm.l.v("mBinding");
                    h3Var = null;
                }
                h3Var.E.c(true);
                q qVar = lLSlotsAcknowActivity.K;
                if (qVar == null) {
                    cm.l.v("viewModel");
                    qVar = null;
                }
                String str3 = lLSlotsAcknowActivity.L;
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
        Toast.makeText(lLSlotsAcknowActivity.getApplicationContext(), lLSlotsAcknowActivity.H1().b("label_log_check_internet", lLSlotsAcknowActivity.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void O1(LLSlotsAcknowActivity lLSlotsAcknowActivity, View view) {
        cm.l.f(lLSlotsAcknowActivity, "this$0");
        lLSlotsAcknowActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void Q1(Context context) {
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
        textView.setText(H1().b(v9.f.f17510a.c(), "Open PDF"));
        ((TextView) findViewById).setText(H1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new k1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void R1(Dialog dialog, LLSlotsAcknowActivity lLSlotsAcknowActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLSlotsAcknowActivity, "this$0");
        dialog.dismiss();
        lLSlotsAcknowActivity.G1(lLSlotsAcknowActivity);
    }

    private final void S1(String str) {
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
        ((TextView) findViewById3).setText(H1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(H1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new g1(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, LLSlotsAcknowActivity lLSlotsAcknowActivity, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLSlotsAcknowActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLSlotsAcknowActivity, DashBoard.class);
        intent.setFlags(67108864);
        lLSlotsAcknowActivity.startActivity(intent);
        lLSlotsAcknowActivity.finish();
    }

    /* access modifiers changed from: private */
    public final void a2(List list) {
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
            P1(num);
        }
    }

    private final void b2() {
        try {
            Intent intent = new Intent(this, LLDocUpload.class);
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
            intent.putExtra("dob", this.S);
            intent.putExtra("Mobile_no", this.T);
            intent.putExtra("lastEndorsedRTO", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void c2() {
        try {
            Intent intent = new Intent(this, LLFeePayment.class);
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
            intent.putExtra("dob", this.S);
            intent.putExtra("Mobile_no", this.T);
            intent.putExtra("lastEndorsedRTO", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void d2() {
        try {
            Intent intent = new Intent(this, LLPhotoSign.class);
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
            intent.putExtra("dob", this.S);
            intent.putExtra("Mobile_no", this.T);
            intent.putExtra("lastEndorsedRTO", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private final void e2() {
        try {
            Intent intent = new Intent(this, LLSlots.class);
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
            intent.putExtra("dob", this.S);
            intent.putExtra("Mobile_no", this.T);
            intent.putExtra("lastEndorsedRTO", this.U);
            intent.putExtra("lastEndorsedRTOCode", this.O);
            startActivity(intent);
            finish();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final String F1(String str) {
        Log.e("slot-dob", String.valueOf(str));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            cm.l.c(str);
            Date parse = simpleDateFormat.parse(str);
            cm.l.c(parse);
            return simpleDateFormat2.format(parse);
        } catch (ParseException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final ld.c H1() {
        ld.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final f I1() {
        f fVar = this.f21735a0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void P1(Integer num) {
        if (num != null && num.intValue() == 135) {
            d2();
        } else if (num != null && num.intValue() == 134) {
            c2();
        } else if (num != null && num.intValue() == 123) {
            b2();
        } else if (num != null && num.intValue() == 371) {
            e2();
        } else if (num != null && num.intValue() == 455) {
            S1(H1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void U1() {
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

    public final void V1(DldetobjX dldetobjX) {
        cm.l.f(dldetobjX, "<set-?>");
        this.N = dldetobjX;
    }

    public final void W1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void X1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.Z = arrayList;
    }

    public final void Y1(ArrayList arrayList) {
        cm.l.f(arrayList, "<set-?>");
        this.Y = arrayList;
    }

    public final void Z1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f21735a0 = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.databinding.h f10 = androidx.databinding.f.f(this, R.layout.activity_dl_slots_acknow);
        cm.l.e(f10, "setContentView(...)");
        h3 h3Var = (h3) f10;
        this.J = h3Var;
        e.a aVar = e.f17509a;
        if (h3Var == null) {
            cm.l.v("mBinding");
            h3Var = null;
        }
        aVar.P1(this, h3Var);
        W1(new ld.c(this));
        Z1(new f(this));
        J1();
        K1();
        L1();
        if (cm.l.a(I1().b(), VContant.MULTISERVICE_PURPOSE_CODE)) {
            try {
                Serializable serializableExtra = getIntent().getSerializableExtra("multiList");
                cm.l.d(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                Y1((ArrayList) serializableExtra);
                Serializable serializableExtra2 = getIntent().getSerializableExtra("listHeaderSteps");
                cm.l.d(serializableExtra2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                X1((ArrayList) serializableExtra2);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.Q) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                U1();
            }
        }
    }
}
