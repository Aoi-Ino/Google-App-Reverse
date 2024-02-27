package com.nic.mparivahan.ClServices.View;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import cm.l;
import cm.m;
import cm.u;
import com.nic.mparivahan.ClServices.ClInterface.ClInter;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.ClServices.Pojo.ServiceSubmitResponse;
import com.nic.mparivahan.ClServicesMainScreens.ClDetailsTop;
import com.nic.mparivahan.ClServicesMainScreens.ClSubmitScreen;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import java.util.ArrayList;
import java.util.List;
import kk.e;
import ni.x;
import p9.i;
import p9.j;
import p9.k;

public final class ChangeNameCl extends androidx.appcompat.app.d {
    public x G;
    public Context H;
    public ProgressDialog I;
    public ld.c J;
    public ld.f K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public String S;
    public String T;
    public t9.a U;
    public ClInter V;
    private String W = "";
    private String X = "";
    private String Y = "";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f7833a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f7834b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private ek.a f7835c0;
    /* access modifiers changed from: private */

    /* renamed from: d0  reason: collision with root package name */
    public List f7836d0;

    /* renamed from: e0  reason: collision with root package name */
    private int f7837e0;

    /* renamed from: f0  reason: collision with root package name */
    private String f7838f0 = "";

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7839e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f7840f;

        a(ChangeNameCl changeNameCl, u uVar) {
            this.f7839e = changeNameCl;
            this.f7840f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            l.f(view, "view");
            this.f7839e.r2(((SpinnerPojo) ((ArrayList) this.f7840f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7841e;

        b(ChangeNameCl changeNameCl) {
            this.f7841e = changeNameCl;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            l.c(charSequence);
            if (charSequence.length() > 0) {
                if (this.f7841e.C1().f29250c0.getText().toString().length() > 0) {
                    editText = this.f7841e.C1().U;
                    sb2 = new StringBuilder();
                    sb2.append(charSequence);
                    sb2.append(' ');
                    sb2.append(this.f7841e.C1().f29250c0.getText());
                    sb2.append(' ');
                } else {
                    editText = this.f7841e.C1().U;
                    sb2 = new StringBuilder();
                    sb2.append(charSequence);
                    sb2.append(' ');
                    sb2.append(this.f7841e.C1().f29250c0.getText());
                }
                sb2.append(this.f7841e.C1().W.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7842e;

        c(ChangeNameCl changeNameCl) {
            this.f7842e = changeNameCl;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (String.valueOf(charSequence).length() > 0) {
                EditText editText = this.f7842e.C1().U;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f7842e.C1().S.getText());
                sb2.append(' ');
                sb2.append(charSequence);
                sb2.append(' ');
                sb2.append(this.f7842e.C1().W.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7843e;

        d(ChangeNameCl changeNameCl) {
            this.f7843e = changeNameCl;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            if (String.valueOf(charSequence).length() > 0) {
                if (this.f7843e.C1().f29250c0.getText().toString().length() > 0) {
                    editText = this.f7843e.C1().U;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7843e.C1().S.getText());
                    sb2.append(' ');
                    sb2.append(this.f7843e.C1().f29250c0.getText());
                    sb2.append(' ');
                } else {
                    editText = this.f7843e.C1().U;
                    sb2 = new StringBuilder();
                    sb2.append(this.f7843e.C1().S.getText());
                    sb2.append(' ');
                    sb2.append(this.f7843e.C1().f29250c0.getText());
                }
                sb2.append(charSequence);
                editText.setText(sb2.toString());
            }
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7844e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChangeNameCl changeNameCl) {
            super(1);
            this.f7844e = changeNameCl;
        }

        public final void b(ServiceSubmitResponse serviceSubmitResponse) {
            ChangeNameCl changeNameCl;
            ld.c L1;
            Log.d("nameResponse", serviceSubmitResponse.toString());
            this.f7844e.H1().dismiss();
            try {
                if (p.o(serviceSubmitResponse.getStatus_code(), "00", true)) {
                    String applicationNo = serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo();
                    if (applicationNo == null || applicationNo.length() == 0) {
                        changeNameCl = this.f7844e;
                        L1 = changeNameCl.L1();
                    } else {
                        try {
                            Intent intent = new Intent(this.f7844e, ClSubmitScreen.class);
                            intent.putExtra("appNumber", serviceSubmitResponse.getClServiceAckknowledgement().get(0).getApplicationNo());
                            intent.putExtra("dlValue", this.f7844e.y1());
                            intent.putExtra("dobValue", this.f7844e.z1());
                            intent.putExtra("fatherName", this.f7844e.A1());
                            intent.putExtra("clName", this.f7844e.u1());
                            intent.putExtra("clPhoto", this.f7844e.v1());
                            intent.putExtra("stateCode", this.f7844e.M1());
                            intent.putExtra("rtoCode", this.f7844e.I1());
                            intent.putExtra("rtoName", this.f7844e.J1());
                            intent.putExtra("Mobile_no", this.f7844e.G1());
                            intent.putExtra("address", this.f7844e.t1()).toString();
                            intent.putExtra("issuing_authority", this.f7844e.B1()).toString();
                            intent.putExtra("validity", this.f7844e.N1()).toString();
                            intent.putExtra("cl_Status", this.f7844e.w1()).toString();
                            this.f7844e.startActivity(intent);
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                } else if (p.o(serviceSubmitResponse.getStatus_code(), "01", true)) {
                    this.f7844e.d2(serviceSubmitResponse.getStatus_desc());
                    return;
                } else {
                    changeNameCl = this.f7844e;
                    L1 = changeNameCl.L1();
                }
                changeNameCl.d2(L1.b("service_is_not_present", "Something went wrong, Try after some time"));
            } catch (Exception unused2) {
                ChangeNameCl changeNameCl2 = this.f7844e;
                changeNameCl2.d2(changeNameCl2.L1().b("service_is_not_present", "Something went wrong, Try after some time"));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ServiceSubmitResponse) obj);
            return pl.x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7845e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChangeNameCl changeNameCl) {
            super(1);
            this.f7845e = changeNameCl;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            try {
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f7845e.f7836d0 = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    this.f7845e.d2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return pl.x.f30437a;
        }
    }

    public static final class g implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeNameCl f7846a;

        g(ChangeNameCl changeNameCl) {
            this.f7846a = changeNameCl;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r4 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r1.get(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r3, int r4) {
            /*
                r2 = this;
                com.nic.mparivahan.ClServices.View.ChangeNameCl r0 = r2.f7846a
                java.util.List r1 = r0.f7836d0
                if (r1 == 0) goto L_0x0015
                java.lang.Object r4 = r1.get(r4)
                com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem r4 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r4
                if (r4 == 0) goto L_0x0015
                java.lang.Integer r4 = r4.getReasonCode()
                goto L_0x0016
            L_0x0015:
                r4 = 0
            L_0x0016:
                cm.l.c(r4)
                int r4 = r4.intValue()
                r0.h2(r4)
                com.nic.mparivahan.ClServices.View.ChangeNameCl r4 = r2.f7846a
                ni.x r4 = r4.C1()
                android.widget.EditText r4 = r4.f29255y
                r4.setText(r3)
                com.nic.mparivahan.ClServices.View.ChangeNameCl r3 = r2.f7846a
                ni.x r3 = r3.C1()
                android.widget.EditText r3 = r3.f29255y
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = ""
                r4.append(r0)
                com.nic.mparivahan.ClServices.View.ChangeNameCl r0 = r2.f7846a
                int r0 = r0.x1()
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.setContentDescription(r4)
                com.nic.mparivahan.ClServices.View.ChangeNameCl r3 = r2.f7846a
                ni.x r3 = r3.C1()
                android.widget.EditText r3 = r3.f29255y
                android.text.Editable r3 = r3.getText()
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "Miscellaneous"
                r0 = 1
                boolean r3 = km.p.o(r3, r4, r0)
                if (r3 == 0) goto L_0x0073
                com.nic.mparivahan.ClServices.View.ChangeNameCl r3 = r2.f7846a
                ni.x r3 = r3.C1()
                android.widget.LinearLayout r3 = r3.f29256z
                r4 = 0
            L_0x006f:
                r3.setVisibility(r4)
                goto L_0x007e
            L_0x0073:
                com.nic.mparivahan.ClServices.View.ChangeNameCl r3 = r2.f7846a
                ni.x r3 = r3.C1()
                android.widget.LinearLayout r3 = r3.f29256z
                r4 = 8
                goto L_0x006f
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.ClServices.View.ChangeNameCl.g.a(java.lang.String, int):void");
        }
    }

    static final class h implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7847a;

        h(bm.l lVar) {
            l.f(lVar, "function");
            this.f7847a = lVar;
        }

        public final pl.c a() {
            return this.f7847a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7847a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b0) || !(obj instanceof cm.h)) {
                return false;
            }
            return l.a(a(), ((cm.h) obj).a());
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    private final void O1() {
        o2(this);
        v2(new ld.c(F1()));
        u2(new ld.f(F1()));
        q2(new ProgressDialog(F1()));
        H1().setMessage(L1().b("label_challan_please_wait", getString(R.string.please_wait)));
        H1().setCancelable(false);
        H1().setCanceledOnTouchOutside(false);
        this.f7835c0 = (ek.a) new u0(this).a(ek.a.class);
        try {
            j2(String.valueOf(getIntent().getStringExtra("dobValue")));
            i2(String.valueOf(getIntent().getStringExtra("dlValue")));
            k2(String.valueOf(getIntent().getStringExtra("fatherName")));
            f2(String.valueOf(getIntent().getStringExtra("clName")));
            g2(String.valueOf(getIntent().getStringExtra("clPhoto")));
            s2(String.valueOf(getIntent().getStringExtra("rtoCode")));
            t2(String.valueOf(getIntent().getStringExtra("rtoName")));
            w2(String.valueOf(getIntent().getStringExtra("stateCode")));
            p2(String.valueOf(getIntent().getStringExtra("Mobile_no")));
            C1().E.f25961g.setText(K1().i());
            TextView textView = C1().K;
            textView.setText(L1().b("CL_NO", "CL No.") + ' ' + y1());
            String v12 = v1();
            if (v12 != null) {
                if (v12.length() != 0) {
                    C1().E.f25960f.setVisibility(0);
                    C1().E.f25956b.setImageBitmap(com.nic.mparivahan.dlservices.utilities.d.a(v1()));
                    this.Y = String.valueOf(getIntent().getStringExtra("address"));
                    this.Z = String.valueOf(getIntent().getStringExtra("issuing_authority"));
                    this.f7833a0 = String.valueOf(getIntent().getStringExtra("validity"));
                    this.f7834b0 = String.valueOf(getIntent().getStringExtra("cl_Status"));
                    n2(ClInter.f7830a.a(F1()));
                    m2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(E1()))).a(t9.a.class));
                    u uVar = new u();
                    ArrayList arrayList = new ArrayList();
                    uVar.f20234e = arrayList;
                    arrayList.add(0, new SpinnerPojo("0", "Select Relation"));
                    ((ArrayList) uVar.f20234e).add(1, new SpinnerPojo("F", "Father Name"));
                    ((ArrayList) uVar.f20234e).add(2, new SpinnerPojo("M", "Mother Name"));
                    ((ArrayList) uVar.f20234e).add(3, new SpinnerPojo("H", "Husband Name"));
                    ((ArrayList) uVar.f20234e).add(3, new SpinnerPojo("G", "Guardian Name"));
                    C1().J.setAdapter(new r9.a(this, (ArrayList) uVar.f20234e));
                    C1().J.setOnItemSelectedListener(new a(this, uVar));
                    C1().S.addTextChangedListener(new b(this));
                    C1().f29250c0.addTextChangedListener(new c(this));
                    C1().Y.addTextChangedListener(new d(this));
                }
            }
            C1().E.f25960f.setVisibility(8);
            this.Y = String.valueOf(getIntent().getStringExtra("address"));
            this.Z = String.valueOf(getIntent().getStringExtra("issuing_authority"));
            this.f7833a0 = String.valueOf(getIntent().getStringExtra("validity"));
            this.f7834b0 = String.valueOf(getIntent().getStringExtra("cl_Status"));
        } catch (Exception unused) {
        }
        n2(ClInter.f7830a.a(F1()));
        m2((t9.a) new u0((x0) this, (u0.b) new m9.a(new n9.a(E1()))).a(t9.a.class));
        u uVar2 = new u();
        ArrayList arrayList2 = new ArrayList();
        uVar2.f20234e = arrayList2;
        arrayList2.add(0, new SpinnerPojo("0", "Select Relation"));
        ((ArrayList) uVar2.f20234e).add(1, new SpinnerPojo("F", "Father Name"));
        ((ArrayList) uVar2.f20234e).add(2, new SpinnerPojo("M", "Mother Name"));
        ((ArrayList) uVar2.f20234e).add(3, new SpinnerPojo("H", "Husband Name"));
        ((ArrayList) uVar2.f20234e).add(3, new SpinnerPojo("G", "Guardian Name"));
        C1().J.setAdapter(new r9.a(this, (ArrayList) uVar2.f20234e));
        C1().J.setOnItemSelectedListener(new a(this, uVar2));
        C1().S.addTextChangedListener(new b(this));
        C1().f29250c0.addTextChangedListener(new c(this));
        C1().Y.addTextChangedListener(new d(this));
    }

    private final void P1() {
        C1().P.setOnClickListener(new i(this));
        C1().A.setOnClickListener(new j(this));
    }

    /* access modifiers changed from: private */
    public static final void Q1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        Intent intent = new Intent(changeNameCl, ClDetailsTop.class);
        intent.putExtra("dlValue", changeNameCl.y1());
        intent.putExtra("dobValue", changeNameCl.z1());
        intent.putExtra("fatherName", changeNameCl.A1());
        intent.putExtra("clName", changeNameCl.u1());
        intent.putExtra("clPhoto", changeNameCl.v1());
        intent.putExtra("address", changeNameCl.Y).toString();
        intent.putExtra("issuing_authority", changeNameCl.Z).toString();
        intent.putExtra("validity", changeNameCl.f7833a0).toString();
        intent.putExtra("cl_Status", changeNameCl.f7834b0).toString();
        changeNameCl.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void R1(ChangeNameCl changeNameCl, View view) {
        Toast makeText;
        ld.c L1;
        String string;
        String str;
        String b10;
        l.f(changeNameCl, "this$0");
        int i10 = 1;
        if (com.nic.mparivahan.a.f9624a.a(changeNameCl)) {
            if (changeNameCl.f7837e0 == 0) {
                L1 = changeNameCl.L1();
                string = changeNameCl.getString(R.string.sel_rsn);
                str = "label_select_reason";
            } else {
                LinearLayout linearLayout = changeNameCl.C1().f29256z;
                l.e(linearLayout, "idDupdl");
                if (linearLayout.getVisibility() != 0 || changeNameCl.C1().f29253w.getText().length() >= 3) {
                    Editable text = changeNameCl.C1().S.getText();
                    i10 = 0;
                    if (text == null || text.length() == 0) {
                        L1 = changeNameCl.L1();
                        string = changeNameCl.getString(R.string.enter_first_name);
                        str = "PLEASE_ENTER_FIRST_NAME";
                    } else if (changeNameCl.C1().S.getText().length() < 3) {
                        L1 = changeNameCl.L1();
                        string = changeNameCl.getString(R.string.enter_valid_3_first_name);
                        str = "enter_valid_3_first_name";
                    } else {
                        Editable text2 = changeNameCl.C1().U.getText();
                        l.e(text2, "getText(...)");
                        if (text2.length() == 0) {
                            L1 = changeNameCl.L1();
                            string = changeNameCl.getString(R.string.enter_full_name);
                            str = "PLEASE_ENTER_FULL_NAME";
                        } else if (changeNameCl.C1().U.getText().length() < 3) {
                            L1 = changeNameCl.L1();
                            string = changeNameCl.getString(R.string.enter_valid_3_full_name);
                            str = "enter_valid_3_full_name";
                        } else if (l.a(changeNameCl.f7838f0, "0")) {
                            b10 = changeNameCl.L1().b("pls_enter_relation", "Please enter relation");
                            makeText = Toast.makeText(changeNameCl, b10, i10);
                        } else {
                            Editable text3 = changeNameCl.C1().f29251d0.getText();
                            if (text3 == null || text3.length() == 0) {
                                L1 = changeNameCl.L1();
                                string = changeNameCl.getString(R.string.rel_first_name);
                                str = "PLEASE_ENTER_REL_FIRST_NAME";
                            } else if (changeNameCl.C1().f29251d0.getText().length() < 3) {
                                L1 = changeNameCl.L1();
                                string = changeNameCl.getString(R.string.rel_valid_first_name);
                                str = "PLEASE_ENTER_REL_VALID_FIRST_NAME";
                            } else {
                                String obj = changeNameCl.C1().f29250c0.getText().toString();
                                if (obj == null || obj.length() == 0) {
                                    changeNameCl.W = "";
                                } else {
                                    changeNameCl.W = changeNameCl.C1().f29250c0.getText().toString();
                                }
                                String obj2 = changeNameCl.C1().f29248a0.getText().toString();
                                if (obj2 == null || obj2.length() == 0) {
                                    changeNameCl.X = "";
                                } else {
                                    changeNameCl.X = changeNameCl.C1().f29248a0.getText().toString();
                                }
                                changeNameCl.a2(changeNameCl.F1(), changeNameCl.L1().b("label_want_to_proceed", "Are you sure, You want to proceed ?"));
                                return;
                            }
                        }
                    }
                } else {
                    L1 = changeNameCl.L1();
                    string = changeNameCl.getString(R.string.enter_Reason);
                    str = "label_dl_serv_enter_reas_manul";
                }
            }
            b10 = L1.b(str, string);
            makeText = Toast.makeText(changeNameCl, b10, i10);
        } else {
            makeText = Toast.makeText(changeNameCl.F1(), changeNameCl.L1().b("label_log_check_internet", changeNameCl.getString(R.string.kindly_check_your_internet_connection)), 1);
        }
        makeText.show();
    }

    private final void S1() {
        C1().F.f29580g.setText(K1().i());
        C1().F.f29581h.setPaintFlags(C1().F.f29581h.getPaintFlags() | 8);
        C1().F.f29581h.setText(q.B0(y1()).toString());
        C1().F.f29581h.setOnClickListener(new p9.g(this));
    }

    /* access modifiers changed from: private */
    public static final void T1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        try {
            Intent intent = new Intent(changeNameCl, ClDetailsTop.class);
            intent.putExtra("dlValue", changeNameCl.y1());
            intent.putExtra("dobValue", changeNameCl.z1());
            intent.putExtra("fatherName", changeNameCl.A1());
            intent.putExtra("clName", changeNameCl.u1());
            intent.putExtra("clPhoto", changeNameCl.v1());
            intent.putExtra("address", changeNameCl.Y).toString();
            intent.putExtra("issuing_authority", changeNameCl.Z).toString();
            intent.putExtra("validity", changeNameCl.f7833a0).toString();
            intent.putExtra("cl_Status", changeNameCl.f7834b0).toString();
            changeNameCl.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void U1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        changeNameCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void V1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        changeNameCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void W1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        changeNameCl.finish();
    }

    /* access modifiers changed from: private */
    public static final void X1(ChangeNameCl changeNameCl, String str) {
        l.f(changeNameCl, "this$0");
        changeNameCl.H1().dismiss();
        String b10 = changeNameCl.L1().b("label_unable_details", changeNameCl.getString(R.string.unable_to_get_details));
        l.c(b10);
        changeNameCl.d2(b10);
    }

    /* access modifiers changed from: private */
    public static final void Y1(ChangeNameCl changeNameCl, View view) {
        l.f(changeNameCl, "this$0");
        changeNameCl.Z1();
    }

    private final void Z1() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.f7836d0;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new g(this));
    }

    private final void a2(Context context, String str) {
        l.c(context);
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.confirmation_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_proceed);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.pop_up_cancel);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        ((TextView) findViewById).setText(str);
        View findViewById4 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById4).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("radio_dl_serv_yes", "Proceed"));
        textView2.setText(L1().b("radio_dl_serv_no", "No"));
        textView2.setOnClickListener(new k(dialog));
        textView.setOnClickListener(new p9.b(dialog, this));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void b2(Dialog dialog, ChangeNameCl changeNameCl, View view) {
        ChangeNameCl changeNameCl2 = changeNameCl;
        l.f(dialog, "$d");
        l.f(changeNameCl2, "this$0");
        dialog.dismiss();
        try {
            changeNameCl.H1().show();
            t9.a D1 = changeNameCl.D1();
            String M1 = changeNameCl.M1();
            String I1 = changeNameCl.I1();
            String obj = changeNameCl.C1().S.getText().toString();
            String str = changeNameCl2.W;
            String obj2 = changeNameCl.C1().Y.getText().toString();
            String obj3 = changeNameCl.C1().f29251d0.getText().toString();
            String str2 = changeNameCl2.X;
            String obj4 = changeNameCl.C1().W.getText().toString();
            String str3 = changeNameCl2.f7838f0;
            String obj5 = changeNameCl.C1().T.getText().toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(changeNameCl.C1().f29251d0.getText());
            sb2.append(' ');
            sb2.append(changeNameCl.C1().f29248a0.getText());
            sb2.append(' ');
            sb2.append(changeNameCl.C1().W.getText());
            D1.i(changeNameCl, M1, I1, obj, str, obj2, obj3, str2, obj4, str3, obj5, sb2.toString(), "559", changeNameCl.y1(), changeNameCl.z1());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void c2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public final void d2(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.msg_dialog);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(L1().b("btn_ok", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(L1().b("nex_parivahan", "NextGen mParivahan"));
        textView.setText(L1().b("btn_ok", "OK"));
        textView.setOnClickListener(new p9.h(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void e2(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final String A1() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        l.v("fatherName");
        return null;
    }

    public final String B1() {
        return this.Z;
    }

    public final x C1() {
        x xVar = this.G;
        if (xVar != null) {
            return xVar;
        }
        l.v("mBinding");
        return null;
    }

    public final t9.a D1() {
        t9.a aVar = this.U;
        if (aVar != null) {
            return aVar;
        }
        l.v("mClDlViewModel");
        return null;
    }

    public final ClInter E1() {
        ClInter clInter = this.V;
        if (clInter != null) {
            return clInter;
        }
        l.v("mClInter");
        return null;
    }

    public final Context F1() {
        Context context = this.H;
        if (context != null) {
            return context;
        }
        l.v("mContext");
        return null;
    }

    public final String G1() {
        String str = this.T;
        if (str != null) {
            return str;
        }
        l.v("Mobile_no");
        return null;
    }

    public final ProgressDialog H1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public final String I1() {
        String str = this.Q;
        if (str != null) {
            return str;
        }
        l.v("rtoCode");
        return null;
    }

    public final String J1() {
        String str = this.S;
        if (str != null) {
            return str;
        }
        l.v("rtoName");
        return null;
    }

    public final ld.f K1() {
        ld.f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        l.v("sarathiSession");
        return null;
    }

    public final ld.c L1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("session");
        return null;
    }

    public final String M1() {
        String str = this.R;
        if (str != null) {
            return str;
        }
        l.v("stateCode");
        return null;
    }

    public final String N1() {
        return this.f7833a0;
    }

    public final void f2(String str) {
        l.f(str, "<set-?>");
        this.O = str;
    }

    public final void g2(String str) {
        l.f(str, "<set-?>");
        this.P = str;
    }

    public final void h2(int i10) {
        this.f7837e0 = i10;
    }

    public final void i2(String str) {
        l.f(str, "<set-?>");
        this.L = str;
    }

    public final void j2(String str) {
        l.f(str, "<set-?>");
        this.M = str;
    }

    public final void k2(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void l2(x xVar) {
        l.f(xVar, "<set-?>");
        this.G = xVar;
    }

    public final void m2(t9.a aVar) {
        l.f(aVar, "<set-?>");
        this.U = aVar;
    }

    public final void n2(ClInter clInter) {
        l.f(clInter, "<set-?>");
        this.V = clInter;
    }

    public final void o2(Context context) {
        l.f(context, "<set-?>");
        this.H = context;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x x10 = x.x(getLayoutInflater());
        l.e(x10, "inflate(...)");
        l2(x10);
        setContentView(C1().m());
        O1();
        P1();
        C1().E.f25959e.setOnClickListener(new p9.a(this));
        C1().F.f29577d.setOnClickListener(new p9.c(this));
        C1().G.setOnClickListener(new p9.d(this));
        v9.e.f17509a.P(this, C1());
        D1().l().g(this, new p9.e(this));
        D1().s().g(this, new h(new e(this)));
        C1().J.setSelection(1);
        ek.a aVar = null;
        if (com.nic.mparivahan.a.f9624a.a(this)) {
            ek.a aVar2 = this.f7835c0;
            if (aVar2 == null) {
                l.v("viewModel");
                aVar2 = null;
            }
            aVar2.n("559");
        } else {
            Toast.makeText(getApplicationContext(), L1().b("service_is_not_present", getString(R.string.unable_to_get_details)), 0).show();
        }
        ek.a aVar3 = this.f7835c0;
        if (aVar3 == null) {
            l.v("viewModel");
        } else {
            aVar = aVar3;
        }
        aVar.m().g(this, new h(new f(this)));
        C1().f29255y.setOnClickListener(new p9.f(this));
        S1();
    }

    public final void p2(String str) {
        l.f(str, "<set-?>");
        this.T = str;
    }

    public final void q2(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void r2(String str) {
        l.f(str, "<set-?>");
        this.f7838f0 = str;
    }

    public final void s2(String str) {
        l.f(str, "<set-?>");
        this.Q = str;
    }

    public final String t1() {
        return this.Y;
    }

    public final void t2(String str) {
        l.f(str, "<set-?>");
        this.S = str;
    }

    public final String u1() {
        String str = this.O;
        if (str != null) {
            return str;
        }
        l.v("clName");
        return null;
    }

    public final void u2(ld.f fVar) {
        l.f(fVar, "<set-?>");
        this.K = fVar;
    }

    public final String v1() {
        String str = this.P;
        if (str != null) {
            return str;
        }
        l.v("clPhoto");
        return null;
    }

    public final void v2(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final String w1() {
        return this.f7834b0;
    }

    public final void w2(String str) {
        l.f(str, "<set-?>");
        this.R = str;
    }

    public final int x1() {
        return this.f7837e0;
    }

    public final String y1() {
        String str = this.L;
        if (str != null) {
            return str;
        }
        l.v("dlValue");
        return null;
    }

    public final String z1() {
        String str = this.M;
        if (str != null) {
            return str;
        }
        l.v("dobValue");
        return null;
    }
}
