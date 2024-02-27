package com.nic.mparivahan.NewDlScreen.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bm.l;
import cm.h;
import cm.m;
import com.nic.mparivahan.LLServices.GetLlPojo.LlstoDisplayMap;
import com.nic.mparivahan.NewDlScreen.Modal.CheckLLExitModal;
import com.nic.mparivahan.NewDlScreen.Modal.LLDetailsResultModal;
import com.nic.mparivahan.R;
import com.nic.mparivahan.dlservices.ui.editlearnerlicence.Service.NewDLService;
import ec.n;
import ec.o;
import ec.p;
import ec.q;
import ec.r;
import ec.s;
import java.util.ArrayList;
import java.util.Calendar;
import ld.f;
import ni.y1;
import pl.x;
import v9.e;

public final class LLNoCheckActivity extends d {
    private y1 G;
    private Calendar H = Calendar.getInstance();
    public ProgressDialog I;
    public ld.c J;
    public f K;
    private Context L;
    private rj.b M;
    private NewDLService N;
    private SharedPreferences O;

    static final class a extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLNoCheckActivity f9284e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LLNoCheckActivity lLNoCheckActivity) {
            super(1);
            this.f9284e = lLNoCheckActivity;
        }

        public final void b(CheckLLExitModal checkLLExitModal) {
            LLNoCheckActivity lLNoCheckActivity;
            String dlAppliedAfterFewDays;
            try {
                if (this.f9284e.n1().isShowing()) {
                    this.f9284e.n1().dismiss();
                }
                if (cm.l.a(checkLLExitModal.getStatusDesc(), "success")) {
                    ArrayList<LLDetailsResultModal> lLDetails = checkLLExitModal.getLLDetails();
                    cm.l.c(lLDetails);
                    if (lLDetails.size() > 0) {
                        this.f9284e.y1(checkLLExitModal.getLLDetails().get(0).getLlstoDisplayMap(), checkLLExitModal.getLLDetails());
                        return;
                    }
                    return;
                }
                ArrayList<LLDetailsResultModal> lLDetails2 = checkLLExitModal.getLLDetails();
                cm.l.c(lLDetails2);
                if (com.nic.mparivahan.dlservices.utilities.d.d(lLDetails2.get(0).getError())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getDobError())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getDobError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getDateNotMatchError())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getDateNotMatchError();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getInvalidLLNo())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getInvalidLLNo();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getAlreadyApplied())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getAlreadyApplied();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getAlreadyHavingDL())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getAlreadyHavingDL();
                } else if (com.nic.mparivahan.dlservices.utilities.d.d(checkLLExitModal.getLLDetails().get(0).getDlAppliedAfterFewDays())) {
                    lLNoCheckActivity = this.f9284e;
                    dlAppliedAfterFewDays = checkLLExitModal.getLLDetails().get(0).getDlAppliedAfterFewDays();
                } else {
                    return;
                }
                Toast.makeText(lLNoCheckActivity, dlAppliedAfterFewDays, 0).show();
            } catch (Exception unused) {
                if (this.f9284e.n1().isShowing()) {
                    this.f9284e.n1().dismiss();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckLLExitModal) obj);
            return x.f30437a;
        }
    }

    static final class b extends m implements l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LLNoCheckActivity f9285e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LLNoCheckActivity lLNoCheckActivity) {
            super(1);
            this.f9285e = lLNoCheckActivity;
        }

        public final void b(String str) {
            if (this.f9285e.n1().isShowing()) {
                this.f9285e.n1().dismiss();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class c implements b0, h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f9286a;

        c(l lVar) {
            cm.l.f(lVar, "function");
            this.f9286a = lVar;
        }

        public final pl.c a() {
            return this.f9286a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f9286a.invoke(obj);
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
    public static final void A1(Dialog dialog, LLNoCheckActivity lLNoCheckActivity, ArrayList arrayList, View view) {
        cm.l.f(dialog, "$d");
        cm.l.f(lLNoCheckActivity, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(lLNoCheckActivity, NewDLPersonalDetailsActivity.class);
        intent.putParcelableArrayListExtra("LLDetails", arrayList);
        y1 y1Var = lLNoCheckActivity.G;
        y1 y1Var2 = null;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        intent.putExtra("llNo", y1Var.A.getText().toString());
        y1 y1Var3 = lLNoCheckActivity.G;
        if (y1Var3 == null) {
            cm.l.v("binding");
        } else {
            y1Var2 = y1Var3;
        }
        intent.putExtra("dob", y1Var2.B.getText().toString());
        lLNoCheckActivity.startActivity(intent);
    }

    private final void p1() {
        this.L = this;
        Context context = this.L;
        NewDLService newDLService = null;
        if (context == null) {
            cm.l.v("mContext");
            context = null;
        }
        x1(new f(context));
        Context context2 = this.L;
        if (context2 == null) {
            cm.l.v("mContext");
            context2 = null;
        }
        v1(new ld.c(context2));
        y1 y1Var = this.G;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        y1Var.C.f28452f.setText(o1().i());
        w1(new ProgressDialog(this));
        n1().setMessage(m1().b("label_challan_please_wait", getString(R.string.please_wait)));
        n1().setCancelable(true);
        n1().setCanceledOnTouchOutside(true);
        NewDLService.a aVar = NewDLService.f22140a;
        Context context3 = this.L;
        if (context3 == null) {
            cm.l.v("mContext");
            context3 = null;
        }
        this.N = aVar.a(context3);
        NewDLService newDLService2 = this.N;
        if (newDLService2 == null) {
            cm.l.v("service");
        } else {
            newDLService = newDLService2;
        }
        this.M = (rj.b) new u0((x0) this, (u0.b) new sj.a(new rj.a(newDLService))).a(rj.b.class);
    }

    private final void q1() {
        p pVar = new p(this);
        y1 y1Var = this.G;
        y1 y1Var2 = null;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        y1Var.B.setOnClickListener(new q(this, pVar));
        y1 y1Var3 = this.G;
        if (y1Var3 == null) {
            cm.l.v("binding");
            y1Var3 = null;
        }
        y1Var3.f29436x.setOnClickListener(new r(this));
        y1 y1Var4 = this.G;
        if (y1Var4 == null) {
            cm.l.v("binding");
        } else {
            y1Var2 = y1Var4;
        }
        y1Var2.f29437y.setOnClickListener(new s(this));
    }

    /* access modifiers changed from: private */
    public static final void r1(LLNoCheckActivity lLNoCheckActivity, DatePicker datePicker, int i10, int i11, int i12) {
        cm.l.f(lLNoCheckActivity, "this$0");
        lLNoCheckActivity.H.set(1, i10);
        lLNoCheckActivity.H.set(2, i11);
        lLNoCheckActivity.H.set(5, i12);
        CharSequence format = DateFormat.format("dd", lLNoCheckActivity.H.getTime());
        cm.l.d(format, "null cannot be cast to non-null type kotlin.String");
        String str = (String) format;
        CharSequence format2 = DateFormat.format("MM", lLNoCheckActivity.H.getTime());
        cm.l.d(format2, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) format2;
        CharSequence format3 = DateFormat.format("yyyy", lLNoCheckActivity.H.getTime());
        cm.l.d(format3, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) format3;
        y1 y1Var = lLNoCheckActivity.G;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        TextView textView = y1Var.B;
        textView.setText(str + '-' + str2 + '-' + str3);
    }

    /* access modifiers changed from: private */
    public static final void s1(LLNoCheckActivity lLNoCheckActivity, DatePickerDialog.OnDateSetListener onDateSetListener, View view) {
        cm.l.f(lLNoCheckActivity, "this$0");
        cm.l.f(onDateSetListener, "$dateSetListener");
        DatePickerDialog datePickerDialog = new DatePickerDialog(lLNoCheckActivity, onDateSetListener, lLNoCheckActivity.H.get(1), lLNoCheckActivity.H.get(2), lLNoCheckActivity.H.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
        datePickerDialog.getButton(-2).setTextColor(-16777216);
        datePickerDialog.getButton(-1).setTextColor(-65536);
    }

    /* access modifiers changed from: private */
    public static final void t1(LLNoCheckActivity lLNoCheckActivity, View view) {
        cm.l.f(lLNoCheckActivity, "this$0");
        y1 y1Var = lLNoCheckActivity.G;
        y1 y1Var2 = null;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        y1Var.A.setText("");
        y1 y1Var3 = lLNoCheckActivity.G;
        if (y1Var3 == null) {
            cm.l.v("binding");
        } else {
            y1Var2 = y1Var3;
        }
        y1Var2.B.setText("");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [ni.y1] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void u1(com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity r6, android.view.View r7) {
        /*
            java.lang.String r7 = "this$0"
            cm.l.f(r6, r7)
            com.nic.mparivahan.a$a r7 = com.nic.mparivahan.a.f9624a
            boolean r7 = r7.a(r6)
            java.lang.String r0 = "mContext"
            r1 = 0
            if (r7 == 0) goto L_0x00e4
            ni.y1 r7 = r6.G
            java.lang.String r2 = "binding"
            if (r7 != 0) goto L_0x001a
            cm.l.v(r2)
            r7 = r1
        L_0x001a:
            android.widget.EditText r7 = r7.A
            android.text.Editable r7 = r7.getText()
            java.lang.String r3 = "getText(...)"
            cm.l.e(r7, r3)
            int r7 = r7.length()
            r4 = 0
            if (r7 != 0) goto L_0x004f
            android.content.Context r7 = r6.L
            if (r7 != 0) goto L_0x0034
            cm.l.v(r0)
            goto L_0x0035
        L_0x0034:
            r1 = r7
        L_0x0035:
            ld.c r7 = r6.m1()
            r0 = 2132018816(0x7f140680, float:1.967595E38)
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "pls_enter_lln"
        L_0x0042:
            java.lang.String r6 = r7.b(r0, r6)
            android.widget.Toast r6 = android.widget.Toast.makeText(r1, r6, r4)
        L_0x004a:
            r6.show()
            goto L_0x0105
        L_0x004f:
            ni.y1 r7 = r6.G
            if (r7 != 0) goto L_0x0057
            cm.l.v(r2)
            r7 = r1
        L_0x0057:
            android.widget.EditText r7 = r7.A
            android.text.Editable r7 = r7.getText()
            int r7 = r7.length()
            r5 = 10
            if (r7 >= r5) goto L_0x007c
            android.content.Context r7 = r6.L
            if (r7 != 0) goto L_0x006d
            cm.l.v(r0)
            goto L_0x006e
        L_0x006d:
            r1 = r7
        L_0x006e:
            ld.c r7 = r6.m1()
            r0 = 2132019458(0x7f140902, float:1.9677251E38)
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "dl_validation_msg"
            goto L_0x0042
        L_0x007c:
            ni.y1 r7 = r6.G
            if (r7 != 0) goto L_0x0084
            cm.l.v(r2)
            r7 = r1
        L_0x0084:
            android.widget.TextView r7 = r7.B
            java.lang.CharSequence r7 = r7.getText()
            cm.l.e(r7, r3)
            int r7 = r7.length()
            if (r7 != 0) goto L_0x00aa
            android.content.Context r7 = r6.L
            if (r7 != 0) goto L_0x009b
            cm.l.v(r0)
            goto L_0x009c
        L_0x009b:
            r1 = r7
        L_0x009c:
            ld.c r7 = r6.m1()
            r0 = 2132018722(0x7f140622, float:1.9675759E38)
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "please_enter_bd"
            goto L_0x0042
        L_0x00aa:
            android.app.ProgressDialog r7 = r6.n1()
            r7.show()
            rj.b r7 = r6.M
            if (r7 != 0) goto L_0x00bb
            java.lang.String r7 = "viewModal"
            cm.l.v(r7)
            r7 = r1
        L_0x00bb:
            ni.y1 r0 = r6.G
            if (r0 != 0) goto L_0x00c3
            cm.l.v(r2)
            r0 = r1
        L_0x00c3:
            android.widget.EditText r0 = r0.A
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            ni.y1 r6 = r6.G
            if (r6 != 0) goto L_0x00d5
            cm.l.v(r2)
            goto L_0x00d6
        L_0x00d5:
            r1 = r6
        L_0x00d6:
            android.widget.TextView r6 = r1.B
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            r7.g(r0, r6)
            goto L_0x0105
        L_0x00e4:
            android.content.Context r7 = r6.L
            if (r7 != 0) goto L_0x00ec
            cm.l.v(r0)
            goto L_0x00ed
        L_0x00ec:
            r1 = r7
        L_0x00ed:
            ld.c r7 = r6.m1()
            r0 = 2132018237(0x7f14043d, float:1.9674775E38)
            java.lang.String r6 = r6.getString(r0)
            java.lang.String r0 = "label_log_check_internet"
            java.lang.String r6 = r7.b(r0, r6)
            r7 = 1
            android.widget.Toast r6 = android.widget.Toast.makeText(r1, r6, r7)
            goto L_0x004a
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity.u1(com.nic.mparivahan.NewDlScreen.Activity.LLNoCheckActivity, android.view.View):void");
    }

    /* access modifiers changed from: private */
    public final void y1(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = arrayList;
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.confirm_new_dl_popup);
        Window window = dialog.getWindow();
        cm.l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.llNoValue);
        cm.l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.oldLlNoValue);
        cm.l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById2;
        View findViewById3 = dialog.findViewById(R.id.covsValue);
        cm.l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.equCovsValue);
        cm.l.d(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView4 = (TextView) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.issueDateValue);
        cm.l.d(findViewById5, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView5 = (TextView) findViewById5;
        View findViewById6 = dialog.findViewById(R.id.expireOnValue);
        cm.l.d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView6 = (TextView) findViewById6;
        View findViewById7 = dialog.findViewById(R.id.llNoTv);
        cm.l.d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById8 = dialog.findViewById(R.id.covs);
        cm.l.d(findViewById8, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById9 = dialog.findViewById(R.id.equCovs);
        cm.l.d(findViewById9, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById10 = dialog.findViewById(R.id.issueDate);
        cm.l.d(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById11 = dialog.findViewById(R.id.expireOn);
        cm.l.d(findViewById11, "null cannot be cast to non-null type android.widget.TextView");
        String str = "null cannot be cast to non-null type android.widget.TextView";
        Dialog dialog2 = dialog;
        ((TextView) findViewById11).setText(m1().b("dl_expire_on", getString(R.string.expire_on)));
        ((TextView) findViewById10).setText(m1().b("issue_date", getString(R.string.issue_date_sarthi)) + " :");
        ((TextView) findViewById7).setText(m1().b("ll_number", getString(R.string.ll_no)));
        ((TextView) findViewById8).setText(m1().b("dl_covs", getString(R.string.covs)));
        ((TextView) findViewById9).setText(m1().b("dl_equ_covs", getString(R.string.equ_covs)));
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getLlNumber())) {
            textView.setText(((LlstoDisplayMap) arrayList3.get(0)).getLlNumber());
        } else {
            textView.setText("");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getOldLLNumber())) {
            textView2.setText(((LlstoDisplayMap) arrayList3.get(0)).getOldLLNumber());
        } else {
            textView2.setText("");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getCovs())) {
            textView3.setText(((LlstoDisplayMap) arrayList3.get(0)).getCovs());
        } else {
            textView3.setText("");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getEquivalentCovs())) {
            textView4.setText(((LlstoDisplayMap) arrayList3.get(0)).getEquivalentCovs());
        } else {
            textView4.setText("");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getIssueDate())) {
            textView5.setText(((LlstoDisplayMap) arrayList3.get(0)).getIssueDate());
        } else {
            textView5.setText("");
        }
        if (com.nic.mparivahan.dlservices.utilities.d.d(((LlstoDisplayMap) arrayList3.get(0)).getExpiresOn())) {
            textView6.setText(((LlstoDisplayMap) arrayList3.get(0)).getExpiresOn());
        } else {
            textView6.setText("");
        }
        Dialog dialog3 = dialog2;
        View findViewById12 = dialog3.findViewById(R.id.confirmTv);
        String str2 = str;
        cm.l.d(findViewById12, str2);
        TextView textView7 = (TextView) findViewById12;
        View findViewById13 = dialog3.findViewById(R.id.cancelTv);
        cm.l.d(findViewById13, str2);
        TextView textView8 = (TextView) findViewById13;
        textView8.setText(m1().b("button_cancel", getString(R.string.cancel)));
        textView7.setText(m1().b("btn_ok", getString(R.string.ok_txt)));
        View findViewById14 = dialog3.findViewById(R.id.tv_title);
        cm.l.d(findViewById14, str2);
        ((TextView) findViewById14).setText(m1().b("nex_parivahan", "NextGen mParivahan"));
        textView7.setText(m1().b("button_proceed", "Proceed"));
        textView8.setOnClickListener(new n(dialog3));
        textView7.setOnClickListener(new o(dialog3, this, arrayList2));
        dialog3.show();
    }

    /* access modifiers changed from: private */
    public static final void z1(Dialog dialog, View view) {
        cm.l.f(dialog, "$d");
        dialog.dismiss();
    }

    public final ld.c m1() {
        ld.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        cm.l.v("langSession");
        return null;
    }

    public final ProgressDialog n1() {
        ProgressDialog progressDialog = this.I;
        if (progressDialog != null) {
            return progressDialog;
        }
        cm.l.v("pDialog");
        return null;
    }

    public final f o1() {
        f fVar = this.K;
        if (fVar != null) {
            return fVar;
        }
        cm.l.v("sarthiSession");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y1 x10 = y1.x(getLayoutInflater());
        cm.l.e(x10, "inflate(...)");
        this.G = x10;
        rj.b bVar = null;
        if (x10 == null) {
            cm.l.v("binding");
            x10 = null;
        }
        setContentView(x10.m());
        e.a aVar = e.f17509a;
        y1 y1Var = this.G;
        if (y1Var == null) {
            cm.l.v("binding");
            y1Var = null;
        }
        aVar.e(this, y1Var);
        SharedPreferences sharedPreferences = getSharedPreferences("AddVehicleClass", 0);
        cm.l.e(sharedPreferences, "getSharedPreferences(...)");
        this.O = sharedPreferences;
        if (sharedPreferences == null) {
            cm.l.v("pref");
            sharedPreferences = null;
        }
        sharedPreferences.edit().clear().apply();
        p1();
        q1();
        rj.b bVar2 = this.M;
        if (bVar2 == null) {
            cm.l.v("viewModal");
            bVar2 = null;
        }
        bVar2.i().g(this, new c(new a(this)));
        rj.b bVar3 = this.M;
        if (bVar3 == null) {
            cm.l.v("viewModal");
        } else {
            bVar = bVar3;
        }
        bVar.m().g(this, new c(new b(this)));
    }

    public final void v1(ld.c cVar) {
        cm.l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void w1(ProgressDialog progressDialog) {
        cm.l.f(progressDialog, "<set-?>");
        this.I = progressDialog;
    }

    public final void x1(f fVar) {
        cm.l.f(fVar, "<set-?>");
        this.K = fVar;
    }
}
