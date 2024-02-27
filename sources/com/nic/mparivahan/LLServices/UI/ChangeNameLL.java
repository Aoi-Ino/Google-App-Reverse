package com.nic.mparivahan.LLServices.UI;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import cm.u;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface;
import com.nic.mparivahan.CheckFormOne.SubmitFormOne.Pojo.SubmitResponse;
import com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest;
import com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.LLMainScreen.LlDetails;
import com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails;
import com.nic.mparivahan.LLServices.LlInterface;
import com.nic.mparivahan.LLServices.SubmitServiceAssets.ChangeOfNameReq;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.GetReasonsTransWiseResponse;
import com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem;
import com.nic.mparivahan.dlservices.widget.CustomWegetLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import kk.e;
import ni.z;
import pl.x;
import tb.q;
import tb.r;
import tb.s;
import tb.t;
import tb.v;
import tb.w;

public final class ChangeNameLL extends oi.g {
    public z J;
    public Context K;
    public ProgressDialog L;
    public ld.f M;
    public FetchLlDetails N;
    public sb.c O;
    public LlInterface P;
    private ek.a Q;
    /* access modifiers changed from: private */
    public List R;
    /* access modifiers changed from: private */
    public ld.c S;
    private ld.f T;
    private int U;
    private String V = "";
    private String W;
    private String X = "N";
    private String Y = "N";
    private String Z = "";

    /* renamed from: a0  reason: collision with root package name */
    private String f9037a0 = "";

    /* renamed from: b0  reason: collision with root package name */
    private String f9038b0 = "";

    /* renamed from: c0  reason: collision with root package name */
    private String f9039c0 = "";

    /* renamed from: d0  reason: collision with root package name */
    private String f9040d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    private String f9041e0 = "";

    /* renamed from: f0  reason: collision with root package name */
    private String f9042f0 = "N";

    /* renamed from: g0  reason: collision with root package name */
    private String f9043g0;

    /* renamed from: h0  reason: collision with root package name */
    private String f9044h0;

    /* renamed from: i0  reason: collision with root package name */
    public w9.c f9045i0;

    /* renamed from: j0  reason: collision with root package name */
    public FromEligCheck f9046j0;

    /* renamed from: k0  reason: collision with root package name */
    public y8.c f9047k0;

    /* renamed from: l0  reason: collision with root package name */
    public SubmitInterface f9048l0;

    public static final class a implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9049e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f9050f;

        a(ChangeNameLL changeNameLL, u uVar) {
            this.f9049e = changeNameLL;
            this.f9050f = uVar;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            cm.l.f(view, "view");
            this.f9049e.t2(((SpinnerPojo) ((ArrayList) this.f9050f.f20234e).get(i10)).getCode());
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class b extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9051e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ChangeNameLL changeNameLL) {
            super(1);
            this.f9051e = changeNameLL;
        }

        public final void b(x9.a aVar) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((x9.a) null);
            return x.f30437a;
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9052e;

        c(ChangeNameLL changeNameLL) {
            this.f9052e = changeNameLL;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (String.valueOf(charSequence).length() > 0) {
                EditText editText = this.f9052e.O1().Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9052e.O1().O.getText());
                sb2.append(' ');
                sb2.append(charSequence);
                sb2.append(' ');
                sb2.append(this.f9052e.O1().S.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class d implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9053e;

        d(ChangeNameLL changeNameLL) {
            this.f9053e = changeNameLL;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            if (String.valueOf(charSequence).length() > 0) {
                if (this.f9053e.O1().Y.getText().toString().length() > 0) {
                    editText = this.f9053e.O1().Q;
                    sb2 = new StringBuilder();
                    sb2.append(this.f9053e.O1().O.getText());
                    sb2.append(' ');
                    sb2.append(this.f9053e.O1().Y.getText());
                    sb2.append(' ');
                } else {
                    editText = this.f9053e.O1().Q;
                    sb2 = new StringBuilder();
                    sb2.append(this.f9053e.O1().O.getText());
                    sb2.append(' ');
                    sb2.append(this.f9053e.O1().Y.getText());
                }
                sb2.append(charSequence);
                editText.setText(sb2.toString());
            }
        }
    }

    static final class e extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9054e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(ChangeNameLL changeNameLL) {
            super(1);
            this.f9054e = changeNameLL;
        }

        public final void b(SubmitResponse submitResponse) {
            this.f9054e.W1().dismiss();
            try {
                if (cm.l.a(submitResponse.getStatus_code(), "00")) {
                    this.f9054e.v2("Y");
                    CustomWegetLayout customWegetLayout = this.f9054e.O1().f29619y;
                    ld.c D1 = this.f9054e.S;
                    if (D1 == null) {
                        cm.l.v("langSession");
                        D1 = null;
                    }
                    customWegetLayout.setText(D1.b("vahan_btn_submit", "Submit"));
                    this.f9054e.h2(submitResponse.getFoneObject().get(0).getMsg());
                    return;
                }
                this.f9054e.f2(submitResponse.getFoneObject().get(0).getMsg());
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SubmitResponse) obj);
            return x.f30437a;
        }
    }

    static final class f extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9055e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(ChangeNameLL changeNameLL) {
            super(1);
            this.f9055e = changeNameLL;
        }

        public final void b(String str) {
            this.f9055e.W1().dismiss();
            ChangeNameLL changeNameLL = this.f9055e;
            ld.c D1 = changeNameLL.S;
            if (D1 == null) {
                cm.l.v("langSession");
                D1 = null;
            }
            changeNameLL.h2(D1.b("service_is_not_present", this.f9055e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9056e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(ChangeNameLL changeNameLL) {
            super(1);
            this.f9056e = changeNameLL;
        }

        public final void b(GetReasonsTransWiseResponse getReasonsTransWiseResponse) {
            this.f9056e.W1().dismiss();
            ld.c cVar = null;
            try {
                if (p.p(getReasonsTransWiseResponse.getStatusCode(), "00", false, 2, (Object) null)) {
                    this.f9056e.R = getReasonsTransWiseResponse.getReasonsMaster();
                } else {
                    this.f9056e.h2(getReasonsTransWiseResponse.getStatusDesc());
                }
            } catch (Exception e10) {
                ChangeNameLL changeNameLL = this.f9056e;
                ld.c D1 = changeNameLL.S;
                if (D1 == null) {
                    cm.l.v("langSession");
                } else {
                    cVar = D1;
                }
                String b10 = cVar.b("service_is_not_present", "");
                cm.l.c(b10);
                Toast.makeText(changeNameLL, b10, 1).show();
                e10.printStackTrace();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((GetReasonsTransWiseResponse) obj);
            return x.f30437a;
        }
    }

    static final class h extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9057e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(ChangeNameLL changeNameLL) {
            super(1);
            this.f9057e = changeNameLL;
        }

        public final void b(sb.d dVar) {
            this.f9057e.O1().f29619y.c(false);
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            b((sb.d) null);
            return x.f30437a;
        }
    }

    static final class i extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9058e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(ChangeNameLL changeNameLL) {
            super(1);
            this.f9058e = changeNameLL;
        }

        public final void b(String str) {
            this.f9058e.O1().f29619y.c(false);
            ChangeNameLL changeNameLL = this.f9058e;
            ld.c D1 = changeNameLL.S;
            if (D1 == null) {
                cm.l.v("langSession");
                D1 = null;
            }
            changeNameLL.h2(D1.b("service_is_not_present", this.f9058e.getString(R.string.unable_to_get_details)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    public static final class j implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9059e;

        j(ChangeNameLL changeNameLL) {
            this.f9059e = changeNameLL;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditText editText;
            StringBuilder sb2;
            cm.l.c(charSequence);
            if (charSequence.length() > 0) {
                if (this.f9059e.O1().Y.getText().toString().length() > 0) {
                    editText = this.f9059e.O1().Q;
                    sb2 = new StringBuilder();
                    sb2.append(charSequence);
                    sb2.append(' ');
                    sb2.append(this.f9059e.O1().Y.getText());
                    sb2.append(' ');
                } else {
                    editText = this.f9059e.O1().Q;
                    sb2 = new StringBuilder();
                    sb2.append(charSequence);
                    sb2.append(' ');
                    sb2.append(this.f9059e.O1().Y.getText());
                }
                sb2.append(this.f9059e.O1().S.getText());
                editText.setText(sb2.toString());
            }
        }
    }

    public static final class k implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeNameLL f9060a;

        k(ChangeNameLL changeNameLL) {
            this.f9060a = changeNameLL;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r4 = (com.nic.mparivahan.dlservices.data.model.duplicatedl.ReasonsMasterItem) r1.get(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r3, int r4) {
            /*
                r2 = this;
                com.nic.mparivahan.LLServices.UI.ChangeNameLL r0 = r2.f9060a
                java.util.List r1 = r0.R
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
                r0.i2(r4)
                com.nic.mparivahan.LLServices.UI.ChangeNameLL r4 = r2.f9060a
                ni.z r4 = r4.O1()
                android.widget.EditText r4 = r4.f29618x
                r4.setText(r3)
                com.nic.mparivahan.LLServices.UI.ChangeNameLL r3 = r2.f9060a
                ni.z r3 = r3.O1()
                android.widget.EditText r3 = r3.f29618x
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = ""
                r4.append(r0)
                com.nic.mparivahan.LLServices.UI.ChangeNameLL r0 = r2.f9060a
                int r0 = r0.M1()
                r4.append(r0)
                java.lang.String r4 = r4.toString()
                r3.setContentDescription(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.ChangeNameLL.k.a(java.lang.String, int):void");
        }
    }

    static final class l extends cm.m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        public static final l f9061e = new l();

        l() {
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

    static final class m implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f9062a;

        m(bm.l lVar) {
            cm.l.f(lVar, "function");
            this.f9062a = lVar;
        }

        public final pl.c a() {
            return this.f9062a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9062a.invoke(obj);
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

    private final FormOneRequest G1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(574);
        String str = this.f9043g0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        return new FormOneRequest("mobSARATHI", "657d1c758e2e95af0014e16f5109f933", "10.248.210.8", "sarathiservice", q.B0(str).toString(), arrayList);
    }

    private final void H1() {
        O1().L.setOnClickListener(new t(this));
        O1().f29619y.setOnClickListener(new tb.u(this));
        O1().f29618x.setOnClickListener(new v(this));
    }

    /* access modifiers changed from: private */
    public static final void I1(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        try {
            Intent intent = new Intent(changeNameLL, LlDetails.class);
            intent.putExtra("LLDetails", changeNameLL.N1());
            changeNameLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void J1(ChangeNameLL changeNameLL, View view) {
        String string;
        String str;
        Toast toast;
        String str2;
        cm.l.f(changeNameLL, "this$0");
        Editable text = changeNameLL.O1().O.getText();
        ld.c cVar = null;
        if (text == null || text.length() == 0) {
            ld.c cVar2 = changeNameLL.S;
            if (cVar2 == null) {
                cm.l.v("langSession");
            } else {
                cVar = cVar2;
            }
            string = changeNameLL.getString(R.string.enter_first_name);
            str = "PLEASE_ENTER_FIRST_NAME";
        } else if (changeNameLL.O1().O.getText().length() < 3) {
            ld.c cVar3 = changeNameLL.S;
            if (cVar3 == null) {
                cm.l.v("langSession");
            } else {
                cVar = cVar3;
            }
            string = changeNameLL.getString(R.string.enter_valid_3_first_name);
            str = "enter_valid_3_first_name";
        } else {
            Editable text2 = changeNameLL.O1().U.getText();
            cm.l.e(text2, "getText(...)");
            if (text2.length() <= 0 || changeNameLL.O1().U.getText().length() >= 3) {
                Editable text3 = changeNameLL.O1().Q.getText();
                if (text3 == null || text3.length() == 0 || changeNameLL.O1().Q.getText().length() < 3) {
                    ld.c cVar4 = changeNameLL.S;
                    if (cVar4 == null) {
                        cm.l.v("langSession");
                    } else {
                        cVar = cVar4;
                    }
                    string = changeNameLL.getString(R.string.enter_valid_3_full_name);
                    str = "enter_valid_3_full_name";
                } else if (cm.l.a(changeNameLL.V, "0")) {
                    ld.c cVar5 = changeNameLL.S;
                    if (cVar5 == null) {
                        cm.l.v("langSession");
                    } else {
                        cVar = cVar5;
                    }
                    str2 = cVar.b("pls_enter_relation", "Please enter relation");
                    toast = Toast.makeText(changeNameLL, str2, 0);
                    toast.show();
                } else {
                    Editable text4 = changeNameLL.O1().Z.getText();
                    if (text4 == null || text4.length() == 0) {
                        ld.c cVar6 = changeNameLL.S;
                        if (cVar6 == null) {
                            cm.l.v("langSession");
                        } else {
                            cVar = cVar6;
                        }
                        string = changeNameLL.getString(R.string.rel_first_name);
                        str = "PLEASE_ENTER_REL_FIRST_NAME";
                    } else if (changeNameLL.O1().Z.getText().length() < 3) {
                        ld.c cVar7 = changeNameLL.S;
                        if (cVar7 == null) {
                            cm.l.v("langSession");
                        } else {
                            cVar = cVar7;
                        }
                        string = changeNameLL.getString(R.string.enter_valid_rel_3_first_name);
                        str = "enter_valid_rel_3_first_name";
                    } else {
                        Editable text5 = changeNameLL.O1().S.getText();
                        cm.l.e(text5, "getText(...)");
                        if (text5.length() > 0 && changeNameLL.O1().S.getText().length() < 3) {
                            ld.c cVar8 = changeNameLL.S;
                            if (cVar8 == null) {
                                cm.l.v("langSession");
                            } else {
                                cVar = cVar8;
                            }
                            string = changeNameLL.getString(R.string.enter_valid_rel_3_last_name);
                            str = "enter_valid_rel_3_last_name";
                        } else if (com.nic.mparivahan.a.f9624a.a(changeNameLL)) {
                            try {
                                changeNameLL.O1().f29619y.c(true);
                                changeNameLL.T1().o(changeNameLL, changeNameLL.L1());
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        } else {
                            Context P1 = changeNameLL.P1();
                            ld.c cVar9 = changeNameLL.S;
                            if (cVar9 == null) {
                                cm.l.v("langSession");
                            } else {
                                cVar = cVar9;
                            }
                            toast = Toast.makeText(P1, cVar.b("label_log_check_internet", changeNameLL.getString(R.string.kindly_check_your_internet_connection)), 1);
                            toast.show();
                        }
                    }
                }
            } else {
                ld.c cVar10 = changeNameLL.S;
                if (cVar10 == null) {
                    cm.l.v("langSession");
                } else {
                    cVar = cVar10;
                }
                string = changeNameLL.getString(R.string.enter_valid_3_last_name);
                str = "enter_valid_3_last_name";
            }
        }
        str2 = cVar.b(str, string);
        toast = Toast.makeText(changeNameLL, str2, 0);
        toast.show();
    }

    /* access modifiers changed from: private */
    public static final void K1(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        changeNameLL.e2();
    }

    private final ChangeOfNameReq L1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("changeOfName");
        String obj = q.B0(O1().Y.getText().toString()).toString();
        String obj2 = (obj == null || obj.length() == 0) ? "" : q.B0(O1().Y.getText().toString()).toString();
        String obj3 = q.B0(O1().W.getText().toString()).toString();
        String obj4 = (obj3 == null || obj3.length() == 0) ? "" : q.B0(O1().W.getText().toString()).toString();
        String format = new SimpleDateFormat("dd-MM-yyyy").format(Long.valueOf(System.currentTimeMillis()));
        String obj5 = q.B0(N1().getLearningLicence()).toString();
        String obj6 = q.B0(N1().getDateOfBirth()).toString();
        String stCd = N1().getState().getStCd();
        String str = this.f9043g0;
        if (str == null) {
            cm.l.v("selectedRtoCd");
            str = null;
        }
        String str2 = str;
        String obj7 = q.B0(O1().Q.getText().toString()).toString();
        String obj8 = q.B0(O1().O.getText().toString()).toString();
        String obj9 = q.B0(O1().U.getText().toString()).toString();
        String str3 = this.V;
        String obj10 = q.B0(O1().Z.getText().toString()).toString();
        String obj11 = q.B0(O1().S.getText().toString()).toString();
        String obj12 = O1().f29618x.getText().toString();
        cm.l.c(format);
        return new ChangeOfNameReq("UmangOD", "2335647e653c970102713f68f6aad970", "164.100.161.142", "SarathiMobileService", obj5, obj6, stCd, str2, "NA", obj7, obj8, obj2, obj9, str3, obj10, obj4, obj11, obj12, format, "changeOfName", arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ld.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ek.a} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void Y1() {
        /*
            r9 = this;
            ld.c r0 = new ld.c
            r0.<init>(r9)
            r9.S = r0
            ld.f r0 = new ld.f
            r0.<init>(r9)
            r9.T = r0
            android.app.ProgressDialog r0 = new android.app.ProgressDialog
            r0.<init>(r9)
            r9.s2(r0)
            android.app.ProgressDialog r0 = r9.W1()
            ld.c r1 = r9.S
            java.lang.String r2 = "langSession"
            r3 = 0
            if (r1 != 0) goto L_0x0025
            cm.l.v(r2)
            r1 = r3
        L_0x0025:
            java.lang.String r4 = "label_challan_please_wait"
            java.lang.String r5 = "Please wait..."
            java.lang.String r1 = r1.b(r4, r5)
            r0.setMessage(r1)
            android.app.ProgressDialog r0 = r9.W1()
            r1 = 0
            r0.setCancelable(r1)
            android.app.ProgressDialog r0 = r9.W1()
            r0.setCanceledOnTouchOutside(r1)
            ni.z r0 = r9.O1()
            android.widget.TextView r0 = r0.L
            ni.z r4 = r9.O1()
            android.widget.TextView r4 = r4.L
            int r4 = r4.getPaintFlags()
            r4 = r4 | 8
            r0.setPaintFlags(r4)
            ni.z r0 = r9.O1()
            ni.dc r0 = r0.C
            android.widget.TextView r0 = r0.f25961g
            ld.f r4 = r9.T
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = "sarthiSession"
            cm.l.v(r4)
            r4 = r3
        L_0x0066:
            java.lang.String r4 = r4.i()
            r0.setText(r4)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            r0.<init>(r9)
            java.lang.Class<ek.a> r4 = ek.a.class
            androidx.lifecycle.t0 r0 = r0.a(r4)
            ek.a r0 = (ek.a) r0
            r9.Q = r0
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "Mobile_no"
            java.lang.String r0 = r0.getStringExtra(r4)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00ea }
            r9.W = r0     // Catch:{ Exception -> 0x00ea }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "LLDetails"
            java.io.Serializable r0 = r0.getSerializableExtra(r4)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "null cannot be cast to non-null type com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails"
            cm.l.d(r0, r4)     // Catch:{ Exception -> 0x00ea }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r0 = (com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails) r0     // Catch:{ Exception -> 0x00ea }
            r9.j2(r0)     // Catch:{ Exception -> 0x00ea }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "selectedRtoCd"
            java.lang.String r0 = r0.getStringExtra(r4)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00ea }
            r9.f9043g0 = r0     // Catch:{ Exception -> 0x00ea }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = "selectedRtoName"
            java.lang.String r0 = r0.getStringExtra(r4)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00ea }
            r9.f9044h0 = r0     // Catch:{ Exception -> 0x00ea }
            ni.z r0 = r9.O1()     // Catch:{ Exception -> 0x00ea }
            android.widget.TextView r0 = r0.J     // Catch:{ Exception -> 0x00ea }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ea }
            r4.<init>()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r5 = "LL No. : "
            r4.append(r5)     // Catch:{ Exception -> 0x00ea }
            com.nic.mparivahan.LLMainScreen.UpdatedFetchDetails.FetchLlDetails r5 = r9.N1()     // Catch:{ Exception -> 0x00ea }
            java.lang.String r5 = r5.getLearningLicence()     // Catch:{ Exception -> 0x00ea }
            java.lang.CharSequence r5 = km.q.B0(r5)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ea }
            r4.append(r5)     // Catch:{ Exception -> 0x00ea }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ea }
            r0.setText(r4)     // Catch:{ Exception -> 0x00ea }
        L_0x00ea:
            com.nic.mparivahan.LLServices.LlInterface$a r0 = com.nic.mparivahan.LLServices.LlInterface.f9003a
            android.content.Context r4 = r9.P1()
            com.nic.mparivahan.LLServices.LlInterface r0 = r0.a(r4)
            r9.o2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            sb.a r4 = new sb.a
            sb.b r5 = new sb.b
            com.nic.mparivahan.LLServices.LlInterface r6 = r9.S1()
            r5.<init>(r6)
            r4.<init>(r5)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r4)
            java.lang.Class<sb.c> r4 = sb.c.class
            androidx.lifecycle.t0 r0 = r0.a(r4)
            sb.c r0 = (sb.c) r0
            r9.p2(r0)
            cm.u r0 = new cm.u
            r0.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f20234e = r4
            com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo r5 = new com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo
            java.lang.String r6 = "0"
            java.lang.String r7 = "Select Relation"
            r5.<init>(r6, r7)
            r4.add(r1, r5)
            java.lang.Object r4 = r0.f20234e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo r5 = new com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo
            java.lang.String r6 = "F"
            java.lang.String r7 = "Father Name"
            r5.<init>(r6, r7)
            r6 = 1
            r4.add(r6, r5)
            java.lang.Object r4 = r0.f20234e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo r5 = new com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo
            java.lang.String r6 = "M"
            java.lang.String r7 = "Mother Name"
            r5.<init>(r6, r7)
            r6 = 2
            r4.add(r6, r5)
            java.lang.Object r4 = r0.f20234e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo r5 = new com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo
            java.lang.String r6 = "H"
            java.lang.String r7 = "Husband Name"
            r5.<init>(r6, r7)
            r6 = 3
            r4.add(r6, r5)
            java.lang.Object r4 = r0.f20234e
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo r5 = new com.nic.mparivahan.ClServices.Pojo.NewClPojo.SpinnerPojo
            java.lang.String r7 = "G"
            java.lang.String r8 = "Guardian Name"
            r5.<init>(r7, r8)
            r4.add(r6, r5)
            r9.a r4 = new r9.a
            java.lang.Object r5 = r0.f20234e
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.<init>(r9, r5)
            ni.z r5 = r9.O1()
            android.widget.Spinner r5 = r5.H
            r5.setAdapter(r4)
            ni.z r4 = r9.O1()
            android.widget.Spinner r4 = r4.H
            com.nic.mparivahan.LLServices.UI.ChangeNameLL$a r5 = new com.nic.mparivahan.LLServices.UI.ChangeNameLL$a
            r5.<init>(r9, r0)
            r4.setOnItemSelectedListener(r5)
            com.nic.mparivahan.a$a r0 = com.nic.mparivahan.a.f9624a
            boolean r0 = r0.a(r9)
            if (r0 == 0) goto L_0x01b0
            android.app.ProgressDialog r0 = r9.W1()
            r0.show()
            ek.a r0 = r9.Q
            if (r0 != 0) goto L_0x01a9
            java.lang.String r0 = "viewModel"
            cm.l.v(r0)
            goto L_0x01aa
        L_0x01a9:
            r3 = r0
        L_0x01aa:
            java.lang.String r0 = "574"
            r3.n(r0)
            goto L_0x01d1
        L_0x01b0:
            android.content.Context r0 = r9.getApplicationContext()
            ld.c r4 = r9.S
            if (r4 != 0) goto L_0x01bc
            cm.l.v(r2)
            goto L_0x01bd
        L_0x01bc:
            r3 = r4
        L_0x01bd:
            r2 = 2132019337(0x7f140889, float:1.9677006E38)
            java.lang.String r2 = r9.getString(r2)
            java.lang.String r4 = "service_is_not_present"
            java.lang.String r2 = r3.b(r4, r2)
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r2, r1)
            r0.show()
        L_0x01d1:
            com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck$a r0 = com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck.f8099a
            com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck r0 = r0.a(r9)
            r9.n2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            w9.b r1 = new w9.b
            w9.a r2 = new w9.a
            com.nic.mparivahan.DLServicesAuth.CheckEligibility.FromEligCheck r3 = r9.R1()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<w9.c> r1 = w9.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            w9.c r0 = (w9.c) r0
            r9.m2(r0)
            com.nic.mparivahan.DLServicesAuth.CheckEligibility.FormOneRequest r0 = r9.G1()
            w9.c r1 = r9.Q1()
            r1.h(r0)
            w9.c r0 = r9.Q1()
            androidx.lifecycle.a0 r0 = r0.j()
            com.nic.mparivahan.LLServices.UI.ChangeNameLL$b r1 = new com.nic.mparivahan.LLServices.UI.ChangeNameLL$b
            r1.<init>(r9)
            com.nic.mparivahan.LLServices.UI.ChangeNameLL$m r2 = new com.nic.mparivahan.LLServices.UI.ChangeNameLL$m
            r2.<init>(r1)
            r0.g(r9, r2)
            com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface$a r0 = com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface.f7733a
            com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface r0 = r0.a(r9)
            r9.r2(r0)
            androidx.lifecycle.u0 r0 = new androidx.lifecycle.u0
            y8.a r1 = new y8.a
            y8.b r2 = new y8.b
            com.nic.mparivahan.CheckFormOne.SubmitFormOne.Other.SubmitInterface r3 = r9.V1()
            r2.<init>(r3)
            r1.<init>(r2)
            r0.<init>((androidx.lifecycle.x0) r9, (androidx.lifecycle.u0.b) r1)
            java.lang.Class<y8.c> r1 = y8.c.class
            androidx.lifecycle.t0 r0 = r0.a(r1)
            y8.c r0 = (y8.c) r0
            r9.q2(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.LLServices.UI.ChangeNameLL.Y1():void");
    }

    private final void Z1() {
        try {
            O1().J.setVisibility(8);
            O1().L.setVisibility(8);
            O1().D.f29580g.setText(X1().i());
            O1().D.f29581h.setPaintFlags(8 | O1().D.f29581h.getPaintFlags());
            O1().D.f29581h.setText(q.B0(N1().getLearningLicence()).toString());
            O1().D.f29581h.setOnClickListener(new tb.x(this));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void a2(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        try {
            Intent intent = new Intent(changeNameLL, LlDetails.class);
            intent.putExtra("LLDetails", changeNameLL.N1());
            changeNameLL.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void b2(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        changeNameLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void c2(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        changeNameLL.finish();
    }

    /* access modifiers changed from: private */
    public static final void d2(ChangeNameLL changeNameLL, View view) {
        cm.l.f(changeNameLL, "this$0");
        changeNameLL.finish();
    }

    private final void e2() {
        ArrayList arrayList = new ArrayList();
        List<ReasonsMasterItem> list = this.R;
        if (list != null) {
            for (ReasonsMasterItem reasonsMasterItem : list) {
                arrayList.add(String.valueOf(reasonsMasterItem != null ? reasonsMasterItem.getReasonName() : null));
            }
        }
        kk.e a10 = kk.e.A0.a("Select Reason", arrayList);
        a10.k2(F0(), "ReasonPicker");
        a10.n2(new k(this));
    }

    /* access modifiers changed from: private */
    public static final void g2(Dialog dialog, ChangeNameLL changeNameLL, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(changeNameLL, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(changeNameLL, DashBoard.class);
        intent.addFlags(67108864);
        changeNameLL.startActivity(intent);
        changeNameLL.finish();
    }

    public final int M1() {
        return this.U;
    }

    public final FetchLlDetails N1() {
        FetchLlDetails fetchLlDetails = this.N;
        if (fetchLlDetails != null) {
            return fetchLlDetails;
        }
        cm.l.v("llDetails");
        return null;
    }

    public final z O1() {
        z zVar = this.J;
        if (zVar != null) {
            return zVar;
        }
        cm.l.v("mBinding");
        return null;
    }

    public final Context P1() {
        Context context = this.K;
        if (context != null) {
            return context;
        }
        cm.l.v("mContext");
        return null;
    }

    public final w9.c Q1() {
        w9.c cVar = this.f9045i0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mFormEligVM");
        return null;
    }

    public final FromEligCheck R1() {
        FromEligCheck fromEligCheck = this.f9046j0;
        if (fromEligCheck != null) {
            return fromEligCheck;
        }
        cm.l.v("mFormsInterface");
        return null;
    }

    public final LlInterface S1() {
        LlInterface llInterface = this.P;
        if (llInterface != null) {
            return llInterface;
        }
        cm.l.v("mLlInterface");
        return null;
    }

    public final sb.c T1() {
        sb.c cVar = this.O;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mLlViewModel");
        return null;
    }

    public final y8.c U1() {
        y8.c cVar = this.f9047k0;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("mSubmitFormVM");
        return null;
    }

    public final SubmitInterface V1() {
        SubmitInterface submitInterface = this.f9048l0;
        if (submitInterface != null) {
            return submitInterface;
        }
        cm.l.v("mSubmitInterface");
        return null;
    }

    public final ProgressDialog W1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final ld.f X1() {
        ld.f fVar = this.M;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarathiSession");
        return null;
    }

    public final void f2(String str) {
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
        TextView textView2 = (TextView) findViewById3;
        ld.c cVar = this.S;
        ld.c cVar2 = null;
        if (cVar == null) {
            cm.l.v("langSession");
            cVar = null;
        }
        textView2.setText(cVar.b("nex_parivahan", "NextGen mParivahan"));
        ld.c cVar3 = this.S;
        if (cVar3 == null) {
            cm.l.v("langSession");
        } else {
            cVar2 = cVar3;
        }
        textView.setText(cVar2.b("btn_ok", "OK"));
        textView.setOnClickListener(new w(dialog, this));
        dialog.show();
    }

    public final void h2(String str) {
        if (str != null) {
            ld.c cVar = this.S;
            ld.c cVar2 = null;
            if (cVar == null) {
                cm.l.v("langSession");
                cVar = null;
            }
            String b10 = cVar.b("nex_parivahan", getString(R.string.app_name));
            cm.l.c(b10);
            ld.c cVar3 = this.S;
            if (cVar3 == null) {
                cm.l.v("langSession");
            } else {
                cVar2 = cVar3;
            }
            String b11 = cVar2.b("btn_ok", getString(R.string.ok_txt));
            cm.l.c(b11);
            oi.g.n1(this, b10, str, 1, b11, (String) null, l.f9061e, 16, (Object) null);
        }
    }

    public final void i2(int i10) {
        this.U = i10;
    }

    public final void j2(FetchLlDetails fetchLlDetails) {
        cm.l.f(fetchLlDetails, "<set-?>");
        this.N = fetchLlDetails;
    }

    public final void k2(z zVar) {
        cm.l.f(zVar, "<set-?>");
        this.J = zVar;
    }

    public final void l2(Context context) {
        cm.l.f(context, "<set-?>");
        this.K = context;
    }

    public final void m2(w9.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9045i0 = cVar;
    }

    public final void n2(FromEligCheck fromEligCheck) {
        cm.l.f(fromEligCheck, "<set-?>");
        this.f9046j0 = fromEligCheck;
    }

    public final void o2(LlInterface llInterface) {
        cm.l.f(llInterface, "<set-?>");
        this.P = llInterface;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        z x10 = z.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        k2(x10);
        setContentView(O1().m());
        l2(this);
        v9.e.f17509a.R(this, O1());
        u2(new ld.f(P1()));
        Y1();
        H1();
        O1().C.f25959e.setOnClickListener(new q(this));
        O1().D.f29577d.setOnClickListener(new r(this));
        O1().E.setOnClickListener(new s(this));
        U1().i().g(this, new m(new e(this)));
        U1().h().g(this, new m(new f(this)));
        ek.a aVar = this.Q;
        if (aVar == null) {
            cm.l.v("viewModel");
            aVar = null;
        }
        aVar.m().g(this, new m(new g(this)));
        T1().l().g(this, new m(new h(this)));
        T1().i().g(this, new m(new i(this)));
        O1().O.addTextChangedListener(new j(this));
        O1().Y.addTextChangedListener(new c(this));
        O1().U.addTextChangedListener(new d(this));
        Z1();
    }

    public final void p2(sb.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.O = cVar;
    }

    public final void q2(y8.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.f9047k0 = cVar;
    }

    public final void r2(SubmitInterface submitInterface) {
        cm.l.f(submitInterface, "<set-?>");
        this.f9048l0 = submitInterface;
    }

    public final void s2(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void t2(String str) {
        cm.l.f(str, "<set-?>");
        this.V = str;
    }

    public final void u2(ld.f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.M = fVar;
    }

    public final void v2(String str) {
        cm.l.f(str, "<set-?>");
        this.Y = str;
    }
}
