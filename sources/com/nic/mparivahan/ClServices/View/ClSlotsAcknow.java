package com.nic.mparivahan.ClServices.View;

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
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.ApplFlowStatusListItem;
import com.nic.mparivahan.dlservices.data.model.ApplStatusDetailsItem;
import com.nic.mparivahan.dlservices.data.model.DlApplStatusDto;
import com.nic.mparivahan.dlservices.ui.DLServiceFinalSubmitedActivity;
import fj.q;
import java.io.File;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ld.f;
import ni.c1;
import oi.g;
import org.json.JSONObject;
import p9.k2;
import p9.l2;
import p9.m2;
import p9.n2;
import p9.o2;
import p9.p2;
import p9.q2;
import pl.x;

public final class ClSlotsAcknow extends g {
    /* access modifiers changed from: private */
    public c1 J;
    private q K;
    /* access modifiers changed from: private */
    public String L;
    private String M;
    private String N;
    private String O = "";
    private String P = "";
    private String Q = "";
    private String R = "";
    private String S = "";
    private String T = "";
    private String U = "";
    /* access modifiers changed from: private */
    public ProgressDialog V;
    private final int W = 5001;
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f7916a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    public ld.c f7917b0;

    /* renamed from: c0  reason: collision with root package name */
    public f f7918c0;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSlotsAcknow f7919e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ClSlotsAcknow clSlotsAcknow) {
            super(1);
            this.f7919e = clSlotsAcknow;
        }

        public final void b(DlApplStatusDto dlApplStatusDto) {
            List<ApplStatusDetailsItem> applStatusDetails;
            ApplStatusDetailsItem applStatusDetailsItem;
            List<ApplFlowStatusListItem> applFlowStatusList;
            c1 C1 = this.f7919e.J;
            if (C1 == null) {
                cm.l.v("cBinding");
                C1 = null;
            }
            C1.E.c(false);
            if (p.p(dlApplStatusDto != null ? dlApplStatusDto.getStatusCode() : null, "00", false, 2, (Object) null) && dlApplStatusDto != null && (applStatusDetails = dlApplStatusDto.getApplStatusDetails()) != null && (!applStatusDetails.isEmpty()) && (applStatusDetailsItem = dlApplStatusDto.getApplStatusDetails().get(0)) != null && (applFlowStatusList = applStatusDetailsItem.getApplFlowStatusList()) != null && (!applFlowStatusList.isEmpty())) {
                Log.e("before", applStatusDetailsItem.getApplFlowStatusList().toString());
                this.f7919e.c2(applStatusDetailsItem.getApplFlowStatusList());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((DlApplStatusDto) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ClSlotsAcknow f7920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ClSlotsAcknow clSlotsAcknow) {
            super(1);
            this.f7920e = clSlotsAcknow;
        }

        public final void b(JSONObject jSONObject) {
            ProgressDialog E1 = this.f7920e.V;
            String str = null;
            if (E1 == null) {
                cm.l.v("pDialog");
                E1 = null;
            }
            E1.dismiss();
            if (jSONObject != null) {
                try {
                    Log.e("save_slot_pdf_res", jSONObject.toString());
                    ProgressDialog E12 = this.f7920e.V;
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
                        String D1 = this.f7920e.L;
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
                        ClSlotsAcknow clSlotsAcknow = this.f7920e;
                        clSlotsAcknow.V1(clSlotsAcknow);
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
        private final /* synthetic */ l f7921a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f7921a = lVar;
        }

        public final pl.c a() {
            return this.f7921a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7921a.invoke(obj);
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

    private final void L1() {
        try {
            b2(new f(this));
            if (getIntent() != null) {
                Bundle extras = getIntent().getExtras();
                c1 c1Var = null;
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
                c1 c1Var2 = this.J;
                if (c1Var2 == null) {
                    cm.l.v("cBinding");
                    c1Var2 = null;
                }
                c1Var2.f25593w.setText(str);
                c1 c1Var3 = this.J;
                if (c1Var3 == null) {
                    cm.l.v("cBinding");
                } else {
                    c1Var = c1Var3;
                }
                c1Var.f25594x.setText(str2);
                String stringExtra = getIntent().getStringExtra("clName");
                cm.l.d(stringExtra, "null cannot be cast to non-null type kotlin.String");
                this.O = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("fatherName");
                cm.l.d(stringExtra2, "null cannot be cast to non-null type kotlin.String");
                this.P = stringExtra2;
                this.Q = String.valueOf(getIntent().getStringExtra("address"));
                this.T = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                this.U = String.valueOf(getIntent().getStringExtra("validity"));
                this.R = String.valueOf(getIntent().getStringExtra("cl_Status"));
                String stringExtra3 = getIntent().getStringExtra("clPhoto");
                cm.l.d(stringExtra3, "null cannot be cast to non-null type kotlin.String");
                this.S = stringExtra3;
            }
        } catch (Exception unused) {
        }
    }

    private final void M1() {
        q qVar = (q) new u0(this).a(q.class);
        this.K = qVar;
        if (qVar == null) {
            cm.l.v("viewModel");
            qVar = null;
        }
        qVar.l().g(this, new c(new a(this)));
    }

    private final void N1() {
        c1 c1Var = this.J;
        q qVar = null;
        if (c1Var == null) {
            cm.l.v("cBinding");
            c1Var = null;
        }
        c1Var.A.setOnClickListener(new m2(this));
        c1 c1Var2 = this.J;
        if (c1Var2 == null) {
            cm.l.v("cBinding");
            c1Var2 = null;
        }
        c1Var2.E.setOnClickListener(new n2(this));
        c1 c1Var3 = this.J;
        if (c1Var3 == null) {
            cm.l.v("cBinding");
            c1Var3 = null;
        }
        c1Var3.B.f25959e.setOnClickListener(new o2(this));
        q qVar2 = this.K;
        if (qVar2 == null) {
            cm.l.v("viewModel");
        } else {
            qVar = qVar2;
        }
        qVar.j().g(this, new c(new b(this)));
    }

    /* access modifiers changed from: private */
    public static final void O1(ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(clSlotsAcknow, "this$0");
        if (clSlotsAcknow.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
            clSlotsAcknow.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, clSlotsAcknow.W);
        } else {
            clSlotsAcknow.Z1();
        }
    }

    /* access modifiers changed from: private */
    public static final void P1(ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(clSlotsAcknow, "this$0");
        if (com.nic.mparivahan.a.f9624a.a(clSlotsAcknow)) {
            String str = clSlotsAcknow.M;
            String str2 = null;
            if (str == null) {
                cm.l.v("mApplDob");
                str = null;
            }
            String H1 = clSlotsAcknow.H1(str);
            if (H1 != null) {
                c1 c1Var = clSlotsAcknow.J;
                if (c1Var == null) {
                    cm.l.v("cBinding");
                    c1Var = null;
                }
                c1Var.E.c(true);
                q qVar = clSlotsAcknow.K;
                if (qVar == null) {
                    cm.l.v("viewModel");
                    qVar = null;
                }
                String str3 = clSlotsAcknow.L;
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
        Toast.makeText(clSlotsAcknow.getApplicationContext(), clSlotsAcknow.J1().b("label_log_check_internet", clSlotsAcknow.getString(R.string.kindly_check_your_internet_connection)), 0).show();
    }

    /* access modifiers changed from: private */
    public static final void Q1(ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(clSlotsAcknow, "this$0");
        clSlotsAcknow.onBackPressed();
    }

    private final void R1() {
        c1 c1Var = this.J;
        c1 c1Var2 = null;
        if (c1Var == null) {
            cm.l.v("cBinding");
            c1Var = null;
        }
        c1Var.C.f29580g.setText(K1().i());
        c1 c1Var3 = this.J;
        if (c1Var3 == null) {
            cm.l.v("cBinding");
            c1Var3 = null;
        }
        TextView textView = c1Var3.C.f29581h;
        c1 c1Var4 = this.J;
        if (c1Var4 == null) {
            cm.l.v("cBinding");
            c1Var4 = null;
        }
        textView.setPaintFlags(c1Var4.C.f29581h.getPaintFlags() | 8);
        c1 c1Var5 = this.J;
        if (c1Var5 == null) {
            cm.l.v("cBinding");
            c1Var5 = null;
        }
        TextView textView2 = c1Var5.C.f29581h;
        String str = this.X;
        cm.l.c(str);
        textView2.setText(q.B0(str).toString());
        c1 c1Var6 = this.J;
        if (c1Var6 == null) {
            cm.l.v("cBinding");
        } else {
            c1Var2 = c1Var6;
        }
        c1Var2.C.f29581h.setOnClickListener(new p2(this));
    }

    /* access modifiers changed from: private */
    public static final void S1(ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(clSlotsAcknow, "this$0");
        try {
            Intent intent = new Intent(clSlotsAcknow, ClDetailsTop.class);
            intent.putExtra("dlValue", q.B0(String.valueOf(clSlotsAcknow.X)).toString());
            intent.putExtra("dobValue", clSlotsAcknow.Y);
            intent.putExtra("fatherName", clSlotsAcknow.P);
            intent.putExtra("clName", clSlotsAcknow.O);
            intent.putExtra("clPhoto", clSlotsAcknow.S);
            intent.putExtra("address", clSlotsAcknow.Q).toString();
            intent.putExtra("issuing_authority", clSlotsAcknow.T).toString();
            intent.putExtra("validity", clSlotsAcknow.U).toString();
            intent.putExtra("cl_Status", clSlotsAcknow.R).toString();
            clSlotsAcknow.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(clSlotsAcknow, "this$0");
        clSlotsAcknow.finish();
    }

    /* access modifiers changed from: private */
    public final void V1(Context context) {
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
        textView.setOnClickListener(new q2(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void W1(Dialog dialog, ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clSlotsAcknow, "this$0");
        dialog.dismiss();
        clSlotsAcknow.I1(clSlotsAcknow);
    }

    private final void X1(String str) {
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
        textView.setOnClickListener(new l2(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void Y1(Dialog dialog, ClSlotsAcknow clSlotsAcknow, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(clSlotsAcknow, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(clSlotsAcknow, DashBoard.class);
        intent.setFlags(67108864);
        clSlotsAcknow.startActivity(intent);
        clSlotsAcknow.finish();
    }

    /* access modifiers changed from: private */
    public final void c2(List list) {
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
            T1(num);
        }
    }

    private final void d2() {
        try {
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
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", this.f7916a0);
            intent.putExtra("lastEndorsedRTOCode", this.N);
            intent.putExtra("fatherName", this.P);
            intent.putExtra("clName", this.O);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.Q).toString();
            intent.putExtra("issuing_authority", this.T).toString();
            intent.putExtra("validity", this.U).toString();
            intent.putExtra("cl_Status", this.R).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void e2() {
        try {
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
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", this.f7916a0);
            intent.putExtra("lastEndorsedRTOCode", this.N);
            intent.putExtra("fatherName", this.P);
            intent.putExtra("clName", this.O);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.Q).toString();
            intent.putExtra("issuing_authority", this.T).toString();
            intent.putExtra("validity", this.U).toString();
            intent.putExtra("cl_Status", this.R).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void f2() {
        try {
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
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", this.f7916a0);
            intent.putExtra("lastEndorsedRTOCode", this.N);
            intent.putExtra("fatherName", this.P);
            intent.putExtra("clName", this.O);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.Q).toString();
            intent.putExtra("issuing_authority", this.T).toString();
            intent.putExtra("validity", this.U).toString();
            intent.putExtra("cl_Status", this.R).toString();
            startActivity(intent);
            finish();
        } catch (Exception unused) {
        }
    }

    private final void g2() {
        try {
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
            intent.putExtra("DL", this.X);
            intent.putExtra("dob", this.Y);
            intent.putExtra("Mobile_no", this.Z);
            intent.putExtra("lastEndorsedRTO", this.f7916a0);
            intent.putExtra("lastEndorsedRTOCode", this.N);
            intent.putExtra("fatherName", this.P);
            intent.putExtra("clName", this.O);
            intent.putExtra("clPhoto", this.S);
            intent.putExtra("address", this.Q).toString();
            intent.putExtra("issuing_authority", this.T).toString();
            intent.putExtra("validity", this.U).toString();
            intent.putExtra("cl_Status", this.R).toString();
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
        ld.c cVar = this.f7917b0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final f K1() {
        f fVar = this.f7918c0;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    public final void T1(Integer num) {
        if (num != null && num.intValue() == 135) {
            f2();
        } else if (num != null && num.intValue() == 134) {
            e2();
        } else if (num != null && num.intValue() == 123) {
            d2();
        } else if (num != null && num.intValue() == 371) {
            g2();
        } else if (num != null && num.intValue() == 455) {
            X1(J1().b("label_e_sign", getString(R.string.esign)));
        }
    }

    public final void Z1() {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this);
            this.V = progressDialog;
            progressDialog.setMessage(getResources().getString(R.string.loading_msg));
            ProgressDialog progressDialog2 = this.V;
            String str = null;
            if (progressDialog2 == null) {
                cm.l.v("pDialog");
                progressDialog2 = null;
            }
            progressDialog2.show();
            ProgressDialog progressDialog3 = this.V;
            if (progressDialog3 == null) {
                cm.l.v("pDialog");
                progressDialog3 = null;
            }
            progressDialog3.setCancelable(false);
            ProgressDialog progressDialog4 = this.V;
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

    public final void a2(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f7917b0 = cVar;
    }

    public final void b2(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.f7918c0 = fVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c1 x10 = c1.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.J = x10;
        c1 c1Var = null;
        if (x10 == null) {
            cm.l.v("cBinding");
            x10 = null;
        }
        setContentView(x10.m());
        b2(new f(this));
        a2(new ld.c(this));
        L1();
        M1();
        N1();
        R1();
        c1 c1Var2 = this.J;
        if (c1Var2 == null) {
            cm.l.v("cBinding");
        } else {
            c1Var = c1Var2;
        }
        c1Var.C.f29577d.setOnClickListener(new k2(this));
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        cm.l.f(strArr, "permissions");
        cm.l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.W) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                Z1();
            }
        }
    }
}
