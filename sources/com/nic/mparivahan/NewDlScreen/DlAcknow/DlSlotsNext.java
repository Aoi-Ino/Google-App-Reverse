package com.nic.mparivahan.NewDlScreen.DlAcknow;

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
import com.nic.mparivahan.ClServices.View.ClDocumentsUpload;
import com.nic.mparivahan.ClServices.View.ClFeePayment;
import com.nic.mparivahan.ClServices.View.ClPhotoSignature;
import com.nic.mparivahan.ClServices.View.ClSots;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import gc.r0;
import gc.s0;
import gc.t0;
import gc.v0;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ni.l3;
import oi.g;
import org.json.JSONObject;
import pl.x;
import v9.f;

public final class DlSlotsNext extends g {
    /* access modifiers changed from: private */
    public l3 J;
    private q K;
    /* access modifiers changed from: private */
    public String L;
    private String M;
    private String N;
    /* access modifiers changed from: private */
    public ProgressDialog O;
    private final int P = 5001;
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    public ld.c U;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlSlotsNext f9336e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DlSlotsNext dlSlotsNext) {
            super(1);
            this.f9336e = dlSlotsNext;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            l3 A1 = this.f9336e.J;
            if (A1 == null) {
                cm.l.v("cBinding");
                A1 = null;
            }
            A1.D.c(false);
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                this.f9336e.V1(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DlSlotsNext f9337e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DlSlotsNext dlSlotsNext) {
            super(1);
            this.f9337e = dlSlotsNext;
        }

        public final void b(JSONObject jSONObject) {
            ProgressDialog C1 = this.f9337e.O;
            String str = null;
            if (C1 == null) {
                cm.l.v("pDialog");
                C1 = null;
            }
            C1.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog C12 = this.f9337e.O;
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
                        String B1 = this.f9337e.L;
                        if (B1 == null) {
                            cm.l.v("mApplNo");
                        } else {
                            str = B1;
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
                        DlSlotsNext dlSlotsNext = this.f9337e;
                        dlSlotsNext.P1(dlSlotsNext);
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
        private final /* synthetic */ l f9338a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9338a = lVar;
        }

        public final pl.c a() {
            return this.f9338a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9338a.invoke(obj);
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

    private final void I1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            l3 l3Var = null;
            this.L = String.valueOf(extras != null ? extras.get("dl_st_appl_ackno_no") : null);
            Bundle extras2 = getIntent().getExtras();
            this.M = String.valueOf(extras2 != null ? extras2.get("dl_st_appl_ackno_no_dob") : null);
            Bundle extras3 = getIntent().getExtras();
            Object obj = extras3 != null ? extras3.get("slot-date") : null;
            cm.l.d(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            Bundle extras4 = getIntent().getExtras();
            Object obj2 = extras4 != null ? extras4.get("slot-time") : null;
            cm.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            l3 l3Var2 = this.J;
            if (l3Var2 == null) {
                cm.l.v("cBinding");
                l3Var2 = null;
            }
            l3Var2.f27245w.setText(str);
            l3 l3Var3 = this.J;
            if (l3Var3 == null) {
                cm.l.v("cBinding");
            } else {
                l3Var = l3Var3;
            }
            l3Var.f27246x.setText(str2);
        }
    }

    private final void J1() {
        q qVar = (q) new u0(this).a(q.class);
        this.K = qVar;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new c(new a(this)));
    }

    private final void K1() {
        l3 l3Var = this.J;
        q qVar = null;
        if (l3Var == null) {
            cm.l.v("cBinding");
            l3Var = null;
        }
        l3Var.A.setOnClickListener(new s0(this));
        l3 l3Var2 = this.J;
        if (l3Var2 == null) {
            cm.l.v("cBinding");
            l3Var2 = null;
        }
        l3Var2.D.setOnClickListener(new t0(this));
        l3 l3Var3 = this.J;
        if (l3Var3 == null) {
            cm.l.v("cBinding");
            l3Var3 = null;
        }
        l3Var3.B.f25959e.setOnClickListener(new gc.u0(this));
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void L1(DlSlotsNext dlSlotsNext, View view) {
        cm.l.f(dlSlotsNext, "this$0");
        if (dlSlotsNext.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            dlSlotsNext.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, dlSlotsNext.P);
        } else {
            dlSlotsNext.T1();
        }
    }

    /* access modifiers changed from: private */
    public static final void M1(DlSlotsNext dlSlotsNext, View view) {
        cm.l.f(dlSlotsNext, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(dlSlotsNext)) {
            String str = dlSlotsNext.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplDob");
                str = null;
            }
            String F1 = dlSlotsNext.F1(str);
            if (F1 != null) {
                l3 l3Var = dlSlotsNext.J;
                if (l3Var == null) {
                    cm.l.v("cBinding");
                    l3Var = null;
                }
                l3Var.D.c(true);
                q qVar = dlSlotsNext.K;
                if (qVar == null) {
                    cm.l.v("viewModel");
                    qVar = null;
                }
                String str3 = dlSlotsNext.L;
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
        Toast.makeText(dlSlotsNext.getApplicationContext(), dlSlotsNext.H1().b("label_log_check_internet", dlSlotsNext.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void N1(DlSlotsNext dlSlotsNext, View view) {
        cm.l.f(dlSlotsNext, "this$0");
        dlSlotsNext.onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void P1(Context context) {
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
        textView.setText(H1().b(f.f17510a.c(), "Open PDF"));
        ((TextView) findViewById).setText(H1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new v0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Q1(Dialog dialog, DlSlotsNext dlSlotsNext, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlSlotsNext, "this$0");
        dialog.dismiss();
        dlSlotsNext.G1(dlSlotsNext);
    }

    private final void R1(String str) {
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
        textView.setOnClickListener(new r0(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void S1(Dialog dialog, DlSlotsNext dlSlotsNext, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(dlSlotsNext, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(dlSlotsNext, DashBoard.class);
        intent.setFlags(67108864);
        dlSlotsNext.startActivity(intent);
        dlSlotsNext.finish();
    }

    /* access modifiers changed from: private */
    public final void V1(List list) {
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
        } else {
            O1(num);
        }
    }

    private final void W1() {
        Intent intent = new Intent(this, ClDocumentsUpload.class);
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
        intent.putExtra("DL", this.Q);
        intent.putExtra("dob", this.R);
        intent.putExtra("Mobile_no", this.S);
        intent.putExtra("lastEndorsedRTO", this.T);
        intent.putExtra("lastEndorsedRTOCode", this.N);
        startActivity(intent);
        finish();
    }

    private final void X1() {
        Intent intent = new Intent(this, ClFeePayment.class);
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
        intent.putExtra("DL", this.Q);
        intent.putExtra("dob", this.R);
        intent.putExtra("Mobile_no", this.S);
        intent.putExtra("lastEndorsedRTO", this.T);
        intent.putExtra("lastEndorsedRTOCode", this.N);
        startActivity(intent);
        finish();
    }

    private final void Y1() {
        Intent intent = new Intent(this, ClPhotoSignature.class);
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
        intent.putExtra("DL", this.Q);
        intent.putExtra("dob", this.R);
        intent.putExtra("Mobile_no", this.S);
        intent.putExtra("lastEndorsedRTO", this.T);
        intent.putExtra("lastEndorsedRTOCode", this.N);
        startActivity(intent);
        finish();
    }

    private final void Z1() {
        Intent intent = new Intent(this, ClSots.class);
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
        intent.putExtra("DL", this.Q);
        intent.putExtra("dob", this.R);
        intent.putExtra("Mobile_no", this.S);
        intent.putExtra("lastEndorsedRTO", this.T);
        intent.putExtra("lastEndorsedRTOCode", this.N);
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

    public final ld.c H1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final void O1(Integer num) {
        if (num != null && num.intValue() == 135) {
            Y1();
        } else if (num != null && num.intValue() == 134) {
            X1();
        } else if (num != null && num.intValue() == 123) {
            W1();
        } else if (num != null && num.intValue() == 371) {
            Z1();
        } else if (num != null && num.intValue() == 455) {
            R1(H1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void T1() {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.O = progressDialog;
            progressDialog.setMessage(getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.O;
            String str = null;
            if (progressDialog2 == null) {
                cm.l.v("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.O;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.O;
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

    public final void U1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l3 x10 = l3.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.J = x10;
        if (x10 == null) {
            cm.l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        U1(new ld.c(this));
        I1();
        J1();
        K1();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.P) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                T1();
            }
        }
    }
}
