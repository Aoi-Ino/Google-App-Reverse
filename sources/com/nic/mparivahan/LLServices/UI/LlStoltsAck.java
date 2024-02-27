package com.nic.mparivahan.LLServices.UI;

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
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.R;
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
import java.util.Date;
import java.util.List;
import ld.f;
import ni.a6;
import oi.g;
import org.json.JSONObject;
import pl.x;
import tb.o2;
import tb.p2;
import tb.q2;
import tb.r2;
import tb.s2;
import tb.t2;
import tb.u2;
import v9.e;

public final class LlStoltsAck extends g {
    /* access modifiers changed from: private */
    public a6 J;
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
    public f V;
    public FetchLlDetails W;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlStoltsAck f9126e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LlStoltsAck llStoltsAck) {
            super(1);
            this.f9126e = llStoltsAck;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            a6 C1 = this.f9126e.J;
            if (C1 == null) {
                cm.l.v("cBinding");
                C1 = null;
            }
            C1.E.c(false);
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                this.f9126e.e2(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LlStoltsAck f9127e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LlStoltsAck llStoltsAck) {
            super(1);
            this.f9127e = llStoltsAck;
        }

        public final void b(JSONObject jSONObject) {
            ProgressDialog E1 = this.f9127e.O;
            String str = null;
            if (E1 == null) {
                cm.l.v("pDialog");
                E1 = null;
            }
            E1.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog E12 = this.f9127e.O;
                    if (E12 == null) {
                        cm.l.v("pDialog");
                        E12 = null;
                    }
                    E12.dismiss();
                    if (jSONObject.has("Reportdets")) {
                        Log.v("Insode", "true");
                        String str2 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).toString() + "/mParivahan_doc/";
                        File file = new File(str2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        String D1 = this.f9127e.L;
                        if (D1 == null) {
                            cm.l.v("mApplNo");
                        } else {
                            str = D1;
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
                        LlStoltsAck llStoltsAck = this.f9127e;
                        llStoltsAck.W1(llStoltsAck);
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
        private final /* synthetic */ l f9128a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9128a = lVar;
        }

        public final pl.c a() {
            return this.f9128a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9128a.invoke(obj);
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

    private final void I1(Context context) {
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
            Toast.makeText(context, J1().b("label_no_app_avl_pdf", ""), 1).show();
        }
    }

    private final void M1() {
        if (getIntent() != null) {
            Bundle extras = getIntent().getExtras();
            a6 a6Var = null;
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
            a6 a6Var2 = this.J;
            if (a6Var2 == null) {
                cm.l.v("cBinding");
                a6Var2 = null;
            }
            a6Var2.f25195w.setText(str);
            a6 a6Var3 = this.J;
            if (a6Var3 == null) {
                cm.l.v("cBinding");
            } else {
                a6Var = a6Var3;
            }
            a6Var.f25196x.setText(str2);
            Serializable serializableExtra = getIntent().getSerializableExtra("LLDetails");
            cm.l.d(serializableExtra, "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails");
            c2((FetchLlDetails) serializableExtra);
        }
    }

    private final void N1() {
        q qVar = (q) new u0(this).a(q.class);
        this.K = qVar;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new c(new a(this)));
    }

    private final void O1() {
        a6 a6Var = this.J;
        q qVar = null;
        if (a6Var == null) {
            cm.l.v("cBinding");
            a6Var = null;
        }
        a6Var.A.setOnClickListener(new r2(this));
        a6 a6Var2 = this.J;
        if (a6Var2 == null) {
            cm.l.v("cBinding");
            a6Var2 = null;
        }
        a6Var2.E.setOnClickListener(new s2(this));
        a6 a6Var3 = this.J;
        if (a6Var3 == null) {
            cm.l.v("cBinding");
            a6Var3 = null;
        }
        a6Var3.B.f25959e.setOnClickListener(new t2(this));
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void P1(LlStoltsAck llStoltsAck, View view) {
        cm.l.f(llStoltsAck, "this$0");
        if (llStoltsAck.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            llStoltsAck.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, llStoltsAck.P);
        } else {
            llStoltsAck.a2();
        }
    }

    /* access modifiers changed from: private */
    public static final void Q1(LlStoltsAck llStoltsAck, View view) {
        cm.l.f(llStoltsAck, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(llStoltsAck)) {
            String str = llStoltsAck.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplDob");
                str = null;
            }
            String H1 = llStoltsAck.H1(str);
            if (H1 != null) {
                a6 a6Var = llStoltsAck.J;
                if (a6Var == null) {
                    cm.l.v("cBinding");
                    a6Var = null;
                }
                a6Var.E.c(true);
                q qVar = llStoltsAck.K;
                if (qVar == null) {
                    cm.l.v("viewModel");
                    qVar = null;
                }
                String str3 = llStoltsAck.L;
                if (str3 == null) {
                    cm.l.v("mApplNo");
                } else {
                    str2 = str3;
                }
                qVar.h(str2, H1);
                return;
            }
            return;
        }
        Toast.makeText(llStoltsAck.getApplicationContext(), llStoltsAck.J1().b("label_log_check_internet", llStoltsAck.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void R1(LlStoltsAck llStoltsAck, View view) {
        cm.l.f(llStoltsAck, "this$0");
        llStoltsAck.onBackPressed();
    }

    private final void S1() {
        a6 a6Var = this.J;
        a6 a6Var2 = null;
        if (a6Var == null) {
            cm.l.v("cBinding");
            a6Var = null;
        }
        a6Var.C.f29580g.setText(L1().i());
        a6 a6Var3 = this.J;
        if (a6Var3 == null) {
            cm.l.v("cBinding");
            a6Var3 = null;
        }
        TextView textView = a6Var3.C.f29581h;
        a6 a6Var4 = this.J;
        if (a6Var4 == null) {
            cm.l.v("cBinding");
            a6Var4 = null;
        }
        textView.setPaintFlags(a6Var4.C.f29581h.getPaintFlags() | 8);
        a6 a6Var5 = this.J;
        if (a6Var5 == null) {
            cm.l.v("cBinding");
            a6Var5 = null;
        }
        TextView textView2 = a6Var5.C.f29581h;
        String str = this.Q;
        cm.l.c(str);
        textView2.setText(q.B0(str).toString());
        a6 a6Var6 = this.J;
        if (a6Var6 == null) {
            cm.l.v("cBinding");
        } else {
            a6Var2 = a6Var6;
        }
        a6Var2.C.f29581h.setOnClickListener(new p2(this));
    }

    /* access modifiers changed from: private */
    public static final void T1(LlStoltsAck llStoltsAck, View view) {
        cm.l.f(llStoltsAck, "this$0");
        try {
            Intent intent = new Intent(llStoltsAck, LlDetails.class);
            intent.putExtra("LLDetails", llStoltsAck.K1());
            llStoltsAck.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void V1(LlStoltsAck llStoltsAck, View view) {
        cm.l.f(llStoltsAck, "this$0");
        llStoltsAck.finish();
    }

    /* access modifiers changed from: private */
    public final void W1(Context context) {
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
        textView.setText(J1().b(v9.f.f17510a.c(), "Open PDF"));
        ((TextView) findViewById).setText(J1().b("label_pdf_saved_in_download", getString(R.string.pdf_file_Save)));
        textView.setOnClickListener(new u2(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void X1(Dialog dialog, LlStoltsAck llStoltsAck, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(llStoltsAck, "this$0");
        dialog.dismiss();
        llStoltsAck.I1(llStoltsAck);
    }

    private final void Y1(String str) {
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
        ((TextView) findViewById3).setText(J1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(J1().b("btn_dl_serv_next", "Next"));
        textView.setOnClickListener(new q2(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Z1(Dialog dialog, LlStoltsAck llStoltsAck, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(llStoltsAck, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(llStoltsAck, DashBoard.class);
        intent.setFlags(67108864);
        llStoltsAck.startActivity(intent);
        llStoltsAck.finish();
    }

    /* access modifiers changed from: private */
    public final void e2(List list) {
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
            U1(num);
        }
    }

    private final void f2() {
        try {
            Intent intent = new Intent(this, LlDocumentUpload.class);
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
            intent.putExtra("LLDetails", K1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void g2() {
        try {
            Intent intent = new Intent(this, LlPayment.class);
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
            intent.putExtra("LLDetails", K1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void h2() {
        try {
            Intent intent = new Intent(this, LlPhotoSignature.class);
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
            intent.putExtra("LLDetails", K1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void i2() {
        try {
            Intent intent = new Intent(this, LlSlots.class);
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
            intent.putExtra("LLDetails", K1());
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    public final String H1(String str) {
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

    public final ld.c J1() {
        ld.c cVar = this.U;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final FetchLlDetails K1() {
        FetchLlDetails fetchLlDetails = this.W;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final f L1() {
        f fVar = this.V;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void U1(Integer num) {
        if (num != null && num.intValue() == 135) {
            h2();
        } else if (num != null && num.intValue() == 134) {
            g2();
        } else if (num != null && num.intValue() == 123) {
            f2();
        } else if (num != null && num.intValue() == 371) {
            i2();
        } else if (num != null && num.intValue() == 455) {
            Y1(J1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void a2() {
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

    public final void b2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.U = cVar;
    }

    public final void c2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.W = fetchLlDetails;
    }

    public final void d2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.V = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a6 x10 = a6.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.J = x10;
        a6 a6Var = null;
        if (x10 == null) {
            cm.l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        b2(new ld.c(this));
        d2(new f(this));
        e.a aVar = e.f17509a;
        a6 a6Var2 = this.J;
        if (a6Var2 == null) {
            cm.l.v("cBinding");
            a6Var2 = null;
        }
        aVar.j1(this, a6Var2);
        M1();
        N1();
        O1();
        S1();
        a6 a6Var3 = this.J;
        if (a6Var3 == null) {
            cm.l.v("cBinding");
        } else {
            a6Var = a6Var3;
        }
        a6Var.C.f29577d.setOnClickListener(new o2(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.P) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                a2();
            }
        }
    }
}
