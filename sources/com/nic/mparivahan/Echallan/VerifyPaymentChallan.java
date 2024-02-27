package com.nic.mparivahan.Echallan;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cb.c3;
import cb.d3;
import cb.e3;
import cb.f3;
import cb.g3;
import cb.h3;
import cb.i3;
import cb.j3;
import cm.l;
import cm.m;
import com.nic.mparivahan.DB.DatabaseHelper;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.RC.Model.ValidateRcSuccess;
import com.nic.mparivahan.RC.RcInterface.RcService;
import fb.a;
import gb.a;
import java.util.ArrayList;
import ld.g;
import ni.y7;
import pl.x;
import v9.d;
import wc.h;

public final class VerifyPaymentChallan extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private LinearLayout H;
    private RadioButton I;
    private LinearLayout J;
    private RadioButton K;
    private LinearLayout L;
    private RadioButton M;
    /* access modifiers changed from: private */
    public EditText N;
    private AppCompatTextView O;
    private AppCompatTextView P;
    private LinearLayout Q;
    private RelativeLayout R;
    private AppCompatTextView S;
    private RelativeLayout T;
    /* access modifiers changed from: private */
    public String U = "RC";
    private final String V = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public DatabaseHelper W;
    public ArrayList X;
    public h Y;
    /* access modifiers changed from: private */
    public y7 Z;

    /* renamed from: a0  reason: collision with root package name */
    public cd.c f8868a0;

    /* renamed from: b0  reason: collision with root package name */
    public RcService f8869b0;

    /* renamed from: c0  reason: collision with root package name */
    public ProgressDialog f8870c0;

    /* renamed from: d0  reason: collision with root package name */
    public g f8871d0;

    /* renamed from: e0  reason: collision with root package name */
    public ld.c f8872e0;

    /* renamed from: f0  reason: collision with root package name */
    private final TextWatcher f8873f0 = new c(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallan f8874e;

        a(VerifyPaymentChallan verifyPaymentChallan) {
            this.f8874e = verifyPaymentChallan;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                y7 n12 = this.f8874e.Z;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f29484f.setError((CharSequence) null);
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallan f8875e;

        b(VerifyPaymentChallan verifyPaymentChallan) {
            this.f8875e = verifyPaymentChallan;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                y7 n12 = this.f8875e.Z;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f29488j.setError((CharSequence) null);
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallan f8876e;

        c(VerifyPaymentChallan verifyPaymentChallan) {
            this.f8876e = verifyPaymentChallan;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                EditText o12 = this.f8876e.N;
                if (o12 == null) {
                    l.v("inputEt");
                    o12 = null;
                }
                o12.setError((CharSequence) null);
            }
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallan f8877e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(VerifyPaymentChallan verifyPaymentChallan) {
            super(1);
            this.f8877e = verifyPaymentChallan;
        }

        public final void b(ValidateRcSuccess validateRcSuccess) {
            d.a aVar;
            VerifyPaymentChallan verifyPaymentChallan;
            String statusDesc;
            if (this.f8877e.s1().isShowing()) {
                this.f8877e.s1().dismiss();
            }
            int i10 = 1;
            if (p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(this.f8877e, VerifyPaymentChallanList.class);
                EditText o12 = this.f8877e.N;
                if (o12 == null) {
                    l.v("inputEt");
                    o12 = null;
                }
                intent.putExtra("inputValue", o12.getText().toString());
                intent.putExtra("inputType", this.f8877e.U);
                this.f8877e.startActivity(intent);
            } else if (p.o(validateRcSuccess.getStatusCode(), "NP985", true) || p.o(validateRcSuccess.getStatusCode(), "NR005", true)) {
                VerifyPaymentChallan verifyPaymentChallan2 = this.f8877e;
                verifyPaymentChallan2.S1(verifyPaymentChallan2, validateRcSuccess.getStatusDesc());
            } else {
                if (validateRcSuccess.getStatusCode().equals("NR090")) {
                    aVar = v9.d.f17494a;
                    verifyPaymentChallan = this.f8877e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                } else if (validateRcSuccess.getStatusCode().equals("NR091")) {
                    aVar = v9.d.f17494a;
                    verifyPaymentChallan = this.f8877e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                    i10 = 2;
                } else {
                    VerifyPaymentChallan verifyPaymentChallan3 = this.f8877e;
                    verifyPaymentChallan3.S1(verifyPaymentChallan3, verifyPaymentChallan3.t1().b("error_msg_record_not_found", this.f8877e.getString(R.string.service_unavable_please_try)));
                    return;
                }
                aVar.D(verifyPaymentChallan, statusDesc, i10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateRcSuccess) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ VerifyPaymentChallan f8878e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(VerifyPaymentChallan verifyPaymentChallan) {
            super(1);
            this.f8878e = verifyPaymentChallan;
        }

        public final void b(String str) {
            if (this.f8878e.s1().isShowing()) {
                this.f8878e.s1().dismiss();
            }
            VerifyPaymentChallan verifyPaymentChallan = this.f8878e;
            verifyPaymentChallan.S1(verifyPaymentChallan, verifyPaymentChallan.t1().b("error_msg_record_not_found", this.f8878e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8879a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f8879a = lVar;
        }

        public final pl.c a() {
            return this.f8879a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8879a.invoke(obj);
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

    /* access modifiers changed from: private */
    public static final void A1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        RadioButton radioButton = verifyPaymentChallan.K;
        y7 y7Var = null;
        if (radioButton == null) {
            l.v("vehicleNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            RadioButton radioButton2 = verifyPaymentChallan.I;
            if (radioButton2 == null) {
                l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = verifyPaymentChallan.I;
            if (radioButton3 == null) {
                l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            LinearLayout linearLayout = verifyPaymentChallan.H;
            if (linearLayout == null) {
                l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = verifyPaymentChallan.K;
            if (radioButton4 == null) {
                l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(true);
            RadioButton radioButton5 = verifyPaymentChallan.K;
            if (radioButton5 == null) {
                l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(true);
            LinearLayout linearLayout2 = verifyPaymentChallan.J;
            if (linearLayout2 == null) {
                l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
            RadioButton radioButton6 = verifyPaymentChallan.M;
            if (radioButton6 == null) {
                l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(false);
            RadioButton radioButton7 = verifyPaymentChallan.M;
            if (radioButton7 == null) {
                l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(false);
            LinearLayout linearLayout3 = verifyPaymentChallan.L;
            if (linearLayout3 == null) {
                l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
            EditText editText = verifyPaymentChallan.N;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = verifyPaymentChallan.N;
            if (editText2 == null) {
                l.v("inputEt");
                editText2 = null;
            }
            editText2.setHint(verifyPaymentChallan.t1().b("label_challan_enter_vehicle_no", verifyPaymentChallan.getString(R.string.enter_vehicle_number)));
            EditText editText3 = verifyPaymentChallan.N;
            if (editText3 == null) {
                l.v("inputEt");
                editText3 = null;
            }
            editText3.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            verifyPaymentChallan.U = "RC";
            EditText editText4 = verifyPaymentChallan.N;
            if (editText4 == null) {
                l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            y7 y7Var2 = verifyPaymentChallan.Z;
            if (y7Var2 == null) {
                l.v("binding");
                y7Var2 = null;
            }
            y7Var2.M.setVisibility(0);
            y7 y7Var3 = verifyPaymentChallan.Z;
            if (y7Var3 == null) {
                l.v("binding");
                y7Var3 = null;
            }
            y7Var3.M.setVisibility(0);
            y7 y7Var4 = verifyPaymentChallan.Z;
            if (y7Var4 == null) {
                l.v("binding");
            } else {
                y7Var = y7Var4;
            }
            y7Var.Q.setVisibility(8);
            verifyPaymentChallan.Q1();
            return;
        }
        verifyPaymentChallan.U = "";
        y7 y7Var5 = verifyPaymentChallan.Z;
        if (y7Var5 == null) {
            l.v("binding");
            y7Var5 = null;
        }
        y7Var5.M.setVisibility(8);
        RadioButton radioButton8 = verifyPaymentChallan.K;
        if (radioButton8 == null) {
            l.v("vehicleNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = verifyPaymentChallan.K;
        if (radioButton9 == null) {
            l.v("vehicleNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        LinearLayout linearLayout4 = verifyPaymentChallan.J;
        if (linearLayout4 == null) {
            l.v("vehicleNoLl");
            linearLayout4 = null;
        }
        linearLayout4.setBackgroundResource(R.drawable.corner_circle_bg_14);
        y7 y7Var6 = verifyPaymentChallan.Z;
        if (y7Var6 == null) {
            l.v("binding");
            y7Var6 = null;
        }
        y7Var6.f29501w.setVisibility(8);
        y7 y7Var7 = verifyPaymentChallan.Z;
        if (y7Var7 == null) {
            l.v("binding");
        } else {
            y7Var = y7Var7;
        }
        y7Var.R.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void B1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        RadioButton radioButton = verifyPaymentChallan.M;
        y7 y7Var = null;
        if (radioButton == null) {
            l.v("dlNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            RadioButton radioButton2 = verifyPaymentChallan.I;
            if (radioButton2 == null) {
                l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = verifyPaymentChallan.I;
            if (radioButton3 == null) {
                l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            y7 y7Var2 = verifyPaymentChallan.Z;
            if (y7Var2 == null) {
                l.v("binding");
                y7Var2 = null;
            }
            y7Var2.f29501w.setVisibility(8);
            y7 y7Var3 = verifyPaymentChallan.Z;
            if (y7Var3 == null) {
                l.v("binding");
                y7Var3 = null;
            }
            y7Var3.R.setVisibility(8);
            LinearLayout linearLayout = verifyPaymentChallan.H;
            if (linearLayout == null) {
                l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = verifyPaymentChallan.K;
            if (radioButton4 == null) {
                l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(false);
            RadioButton radioButton5 = verifyPaymentChallan.K;
            if (radioButton5 == null) {
                l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(false);
            LinearLayout linearLayout2 = verifyPaymentChallan.J;
            if (linearLayout2 == null) {
                l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton6 = verifyPaymentChallan.M;
            if (radioButton6 == null) {
                l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(true);
            RadioButton radioButton7 = verifyPaymentChallan.M;
            if (radioButton7 == null) {
                l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(true);
            LinearLayout linearLayout3 = verifyPaymentChallan.L;
            if (linearLayout3 == null) {
                l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_14_selected);
            EditText editText = verifyPaymentChallan.N;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = verifyPaymentChallan.N;
            if (editText2 == null) {
                l.v("inputEt");
                editText2 = null;
            }
            editText2.setHint(verifyPaymentChallan.t1().b("label_challan_enter_dl_no", verifyPaymentChallan.getString(R.string.enter_dl_number)));
            EditText editText3 = verifyPaymentChallan.N;
            if (editText3 == null) {
                l.v("inputEt");
                editText3 = null;
            }
            editText3.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            verifyPaymentChallan.U = "DL";
            EditText editText4 = verifyPaymentChallan.N;
            if (editText4 == null) {
                l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            y7 y7Var4 = verifyPaymentChallan.Z;
            if (y7Var4 == null) {
                l.v("binding");
                y7Var4 = null;
            }
            y7Var4.M.setVisibility(8);
            y7 y7Var5 = verifyPaymentChallan.Z;
            if (y7Var5 == null) {
                l.v("binding");
            } else {
                y7Var = y7Var5;
            }
            y7Var.M.setVisibility(8);
            verifyPaymentChallan.R1();
            return;
        }
        verifyPaymentChallan.U = "";
        RadioButton radioButton8 = verifyPaymentChallan.M;
        if (radioButton8 == null) {
            l.v("dlNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = verifyPaymentChallan.M;
        if (radioButton9 == null) {
            l.v("dlNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        RadioButton radioButton10 = verifyPaymentChallan.M;
        if (radioButton10 == null) {
            l.v("dlNoRb");
            radioButton10 = null;
        }
        radioButton10.setBackgroundResource(R.drawable.corner_circle_bg_14);
        y7 y7Var6 = verifyPaymentChallan.Z;
        if (y7Var6 == null) {
            l.v("binding");
        } else {
            y7Var = y7Var6;
        }
        y7Var.Q.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void C1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        if (verifyPaymentChallan.U1() || !com.nic.mparivahan.dlservices.utilities.d.d(verifyPaymentChallan.U)) {
            if (l.a(verifyPaymentChallan.U, "")) {
                verifyPaymentChallan.S1(verifyPaymentChallan, verifyPaymentChallan.t1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else if (l.a(verifyPaymentChallan.U, "RC")) {
            verifyPaymentChallan.V1();
        } else {
            Intent intent = new Intent(verifyPaymentChallan, VerifyPaymentChallanList.class);
            EditText editText = verifyPaymentChallan.N;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            intent.putExtra("inputValue", editText.getText().toString());
            intent.putExtra("inputType", verifyPaymentChallan.U);
            verifyPaymentChallan.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        Intent intent = new Intent(verifyPaymentChallan, VerifyPaymentChallanList.class);
        y7 y7Var = verifyPaymentChallan.Z;
        if (y7Var == null) {
            l.v("binding");
            y7Var = null;
        }
        intent.putExtra("inputValue", y7Var.f29500v.getText().toString());
        intent.putExtra("inputType", "DL");
        verifyPaymentChallan.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        verifyPaymentChallan.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void F1(VerifyPaymentChallan verifyPaymentChallan, View view) {
        l.f(verifyPaymentChallan, "this$0");
        verifyPaymentChallan.H1();
    }

    private final void H1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    /* access modifiers changed from: private */
    public static final void T1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ni.y7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ni.y7} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v22 */
    /* JADX WARNING: type inference failed for: r2v23, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v24 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean U1() {
        /*
            r8 = this;
            android.widget.EditText r0 = r8.N
            java.lang.String r1 = "inputEt"
            r2 = 0
            if (r0 != 0) goto L_0x000b
            cm.l.v(r1)
            r0 = r2
        L_0x000b:
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            char[] r3 = r0.toCharArray()
            java.lang.String r4 = "this as java.lang.String).toCharArray()"
            cm.l.e(r3, r4)
            int r4 = r0.length()
            r5 = 0
            if (r4 <= 0) goto L_0x0054
            int r4 = r0.length()
            r6 = 2
            if (r4 <= r6) goto L_0x0054
            android.widget.EditText r4 = r8.N
            if (r4 != 0) goto L_0x003a
            cm.l.v(r1)
            r4 = r2
        L_0x003a:
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = km.q.B0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r6)
            goto L_0x0056
        L_0x0054:
            java.lang.String r4 = ""
        L_0x0056:
            java.lang.String r6 = r8.U
            java.lang.String r7 = "Challan"
            boolean r6 = cm.l.a(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x0121
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0090
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x006f
            cm.l.v(r1)
            r0 = r2
        L_0x006f:
            ld.c r3 = r8.t1()
            r4 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_challan_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x008b
            cm.l.v(r1)
            goto L_0x008c
        L_0x008b:
            r2 = r0
        L_0x008c:
            r2.requestFocus()
            return r7
        L_0x0090:
            boolean r3 = r8.G1(r4)
            if (r3 != 0) goto L_0x00bf
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x009e
            cm.l.v(r1)
            r0 = r2
        L_0x009e:
            ld.c r3 = r8.t1()
            r4 = 2132018725(0x7f140625, float:1.9675765E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_enter_first_two_char_as_state"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x00ba
            cm.l.v(r1)
            goto L_0x00bb
        L_0x00ba:
            r2 = r0
        L_0x00bb:
            r2.requestFocus()
            return r7
        L_0x00bf:
            int r3 = r0.length()
            r4 = 12
            if (r3 >= r4) goto L_0x00f0
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x00cf
            cm.l.v(r1)
            r0 = r2
        L_0x00cf:
            ld.c r3 = r8.t1()
            r4 = 2132018368(0x7f1404c0, float:1.967504E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x00eb
            cm.l.v(r1)
            goto L_0x00ec
        L_0x00eb:
            r2 = r0
        L_0x00ec:
            r2.requestFocus()
            return r7
        L_0x00f0:
            int r0 = r0.length()
            r3 = 30
            if (r0 <= r3) goto L_0x02d3
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x0100
            cm.l.v(r1)
            r0 = r2
        L_0x0100:
            ld.c r3 = r8.t1()
            r4 = 2132018346(0x7f1404aa, float:1.9674996E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_max_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x011c
            cm.l.v(r1)
            goto L_0x011d
        L_0x011c:
            r2 = r0
        L_0x011d:
            r2.requestFocus()
            return r7
        L_0x0121:
            java.lang.String r4 = r8.U
            java.lang.String r6 = "RC"
            boolean r4 = cm.l.a(r4, r6)
            r6 = 10
            if (r4 == 0) goto L_0x0270
            int r4 = r0.length()
            if (r4 != 0) goto L_0x015c
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x013b
            cm.l.v(r1)
            r0 = r2
        L_0x013b:
            ld.c r3 = r8.t1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x0157
            cm.l.v(r1)
            goto L_0x0158
        L_0x0157:
            r2 = r0
        L_0x0158:
            r2.requestFocus()
            return r7
        L_0x015c:
            int r3 = r3.length
            if (r3 < 0) goto L_0x018b
            r4 = 4
            if (r3 >= r4) goto L_0x018b
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x016a
            cm.l.v(r1)
            r0 = r2
        L_0x016a:
            ld.c r3 = r8.t1()
            r4 = 2132018892(0x7f1406cc, float:1.9676103E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_char_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x0186
            cm.l.v(r1)
            goto L_0x0187
        L_0x0186:
            r2 = r0
        L_0x0187:
            r2.requestFocus()
            return r7
        L_0x018b:
            int r3 = r0.length()
            if (r3 <= r6) goto L_0x01ba
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x0199
            cm.l.v(r1)
            r0 = r2
        L_0x0199:
            ld.c r3 = r8.t1()
            r4 = 2132018908(0x7f1406dc, float:1.9676136E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x01b5
            cm.l.v(r1)
            goto L_0x01b6
        L_0x01b5:
            r2 = r0
        L_0x01b6:
            r2.requestFocus()
            return r7
        L_0x01ba:
            km.f r3 = new km.f
            java.lang.String r4 = "[a-zA-Z0-9]*"
            r3.<init>((java.lang.String) r4)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x01f0
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x01cf
            cm.l.v(r1)
            r0 = r2
        L_0x01cf:
            ld.c r3 = r8.t1()
            r4 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x01eb
            cm.l.v(r1)
            goto L_0x01ec
        L_0x01eb:
            r2 = r0
        L_0x01ec:
            r2.requestFocus()
            return r7
        L_0x01f0:
            ni.y7 r0 = r8.Z
            java.lang.String r1 = "binding"
            if (r0 != 0) goto L_0x01fa
            cm.l.v(r1)
            r0 = r2
        L_0x01fa:
            android.widget.EditText r0 = r0.f29484f
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x0233
            ni.y7 r0 = r8.Z
            if (r0 != 0) goto L_0x0213
            cm.l.v(r1)
            r0 = r2
        L_0x0213:
            android.widget.EditText r0 = r0.f29484f
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_chassis_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of chassis no."
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.y7 r0 = r8.Z
            if (r0 != 0) goto L_0x022c
            cm.l.v(r1)
            goto L_0x022d
        L_0x022c:
            r2 = r0
        L_0x022d:
            android.widget.EditText r0 = r2.f29484f
        L_0x022f:
            r0.requestFocus()
            return r7
        L_0x0233:
            ni.y7 r0 = r8.Z
            if (r0 != 0) goto L_0x023b
            cm.l.v(r1)
            r0 = r2
        L_0x023b:
            android.widget.EditText r0 = r0.f29488j
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r3) goto L_0x02d3
            ni.y7 r0 = r8.Z
            if (r0 != 0) goto L_0x0253
            cm.l.v(r1)
            r0 = r2
        L_0x0253:
            android.widget.EditText r0 = r0.f29488j
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_engine_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of engine no"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.y7 r0 = r8.Z
            if (r0 != 0) goto L_0x026c
            cm.l.v(r1)
            goto L_0x026d
        L_0x026c:
            r2 = r0
        L_0x026d:
            android.widget.EditText r0 = r2.f29488j
            goto L_0x022f
        L_0x0270:
            java.lang.String r3 = r8.U
            java.lang.String r4 = "DL"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x02d3
            int r3 = r0.length()
            if (r3 != 0) goto L_0x02a9
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x0288
            cm.l.v(r1)
            r0 = r2
        L_0x0288:
            ld.c r3 = r8.t1()
            r4 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_valid_dl_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x02a4
            cm.l.v(r1)
            goto L_0x02a5
        L_0x02a4:
            r2 = r0
        L_0x02a5:
            r2.requestFocus()
            return r7
        L_0x02a9:
            int r0 = r0.length()
            if (r0 >= r6) goto L_0x02d3
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x02b7
            cm.l.v(r1)
            r0 = r2
        L_0x02b7:
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_min_char_dl_validation"
            java.lang.String r5 = "Please enter minimum 10 characters of DL number"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            android.widget.EditText r0 = r8.N
            if (r0 != 0) goto L_0x02ce
            cm.l.v(r1)
            goto L_0x02cf
        L_0x02ce:
            r2 = r0
        L_0x02cf:
            r2.requestFocus()
            return r7
        L_0x02d3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallan.U1():boolean");
    }

    private final void V1() {
        s1().show();
        cd.c v12 = v1();
        y7 y7Var = this.Z;
        y7 y7Var2 = null;
        if (y7Var == null) {
            l.v("binding");
            y7Var = null;
        }
        String obj = y7Var.f29491m.getText().toString();
        String str = x1().k().toString();
        y7 y7Var3 = this.Z;
        if (y7Var3 == null) {
            l.v("binding");
            y7Var3 = null;
        }
        String obj2 = y7Var3.f29484f.getText().toString();
        y7 y7Var4 = this.Z;
        if (y7Var4 == null) {
            l.v("binding");
        } else {
            y7Var2 = y7Var4;
        }
        v12.m(obj, str, obj2, y7Var2.f29488j.getText().toString(), this, v9.d.f17494a.k());
    }

    private final void y1() {
        P1(new g(this));
        M1(RcService.f9484a.c(this));
        N1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(u1()))).a(cd.c.class));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        this.G = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(R.id.challanNoLl);
        l.e(findViewById2, "findViewById(...)");
        this.H = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.challanNoRb);
        l.e(findViewById3, "findViewById(...)");
        this.I = (RadioButton) findViewById3;
        View findViewById4 = findViewById(R.id.vehicleNoLl);
        l.e(findViewById4, "findViewById(...)");
        this.J = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(R.id.vehicleNoRb);
        l.e(findViewById5, "findViewById(...)");
        this.K = (RadioButton) findViewById5;
        View findViewById6 = findViewById(R.id.drivingLicenseLl);
        l.e(findViewById6, "findViewById(...)");
        this.L = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.dLNoRb);
        l.e(findViewById7, "findViewById(...)");
        this.M = (RadioButton) findViewById7;
        View findViewById8 = findViewById(R.id.inputEt);
        l.e(findViewById8, "findViewById(...)");
        this.N = (EditText) findViewById8;
        View findViewById9 = findViewById(R.id.topTitleTv);
        l.e(findViewById9, "findViewById(...)");
        this.P = (AppCompatTextView) findViewById9;
        View findViewById10 = findViewById(R.id.nexGenHolder);
        l.e(findViewById10, "findViewById(...)");
        this.T = (RelativeLayout) findViewById10;
        AppCompatTextView appCompatTextView = this.P;
        RelativeLayout relativeLayout = null;
        if (appCompatTextView == null) {
            l.v("topTitleTv");
            appCompatTextView = null;
        }
        appCompatTextView.setText(t1().b("label_verify_payment_status", "Verify Payment Status"));
        View findViewById11 = findViewById(R.id.topBtnHolderLl);
        l.e(findViewById11, "findViewById(...)");
        LinearLayout linearLayout = (LinearLayout) findViewById11;
        this.Q = linearLayout;
        if (linearLayout == null) {
            l.v("topBtnHolderLl");
            linearLayout = null;
        }
        linearLayout.setVisibility(8);
        View findViewById12 = findViewById(R.id.paymentStatusRl);
        l.e(findViewById12, "findViewById(...)");
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById12;
        this.R = relativeLayout2;
        if (relativeLayout2 == null) {
            l.v("paymentStatusRl");
            relativeLayout2 = null;
        }
        relativeLayout2.setVisibility(8);
        View findViewById13 = findViewById(R.id.challanDetailTv);
        l.e(findViewById13, "findViewById(...)");
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById13;
        this.S = appCompatTextView2;
        if (appCompatTextView2 == null) {
            l.v("challanDetailTv");
            appCompatTextView2 = null;
        }
        appCompatTextView2.setVisibility(8);
        View findViewById14 = findViewById(R.id.getDetailsTv);
        l.e(findViewById14, "findViewById(...)");
        this.O = (AppCompatTextView) findViewById14;
        RadioButton radioButton = this.I;
        if (radioButton == null) {
            l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setOnClickListener(new d3(this));
        RadioButton radioButton2 = this.K;
        if (radioButton2 == null) {
            l.v("vehicleNoRb");
            radioButton2 = null;
        }
        radioButton2.setOnClickListener(new e3(this));
        RadioButton radioButton3 = this.M;
        if (radioButton3 == null) {
            l.v("dlNoRb");
            radioButton3 = null;
        }
        radioButton3.setOnClickListener(new f3(this));
        EditText editText = this.N;
        if (editText == null) {
            l.v("inputEt");
            editText = null;
        }
        editText.addTextChangedListener(this.f8873f0);
        y7 y7Var = this.Z;
        if (y7Var == null) {
            l.v("binding");
            y7Var = null;
        }
        y7Var.f29484f.addTextChangedListener(new a(this));
        y7 y7Var2 = this.Z;
        if (y7Var2 == null) {
            l.v("binding");
            y7Var2 = null;
        }
        y7Var2.f29488j.addTextChangedListener(new b(this));
        AppCompatTextView appCompatTextView3 = this.O;
        if (appCompatTextView3 == null) {
            l.v("getDetails");
            appCompatTextView3 = null;
        }
        appCompatTextView3.setOnClickListener(new g3(this));
        y7 y7Var3 = this.Z;
        if (y7Var3 == null) {
            l.v("binding");
            y7Var3 = null;
        }
        y7Var3.P.setOnClickListener(new h3(this));
        AppCompatImageView appCompatImageView = this.G;
        if (appCompatImageView == null) {
            l.v("backBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new i3(this));
        RelativeLayout relativeLayout3 = this.T;
        if (relativeLayout3 == null) {
            l.v("nexGenHolder");
        } else {
            relativeLayout = relativeLayout3;
        }
        relativeLayout.setOnClickListener(new j3(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ni.y7} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z1(com.nic.mparivahan.Echallan.VerifyPaymentChallan r8, android.view.View r9) {
        /*
            java.lang.String r9 = "this$0"
            cm.l.f(r8, r9)
            android.widget.RadioButton r9 = r8.I
            java.lang.String r0 = "challanNoRb"
            r1 = 0
            if (r9 != 0) goto L_0x0010
            cm.l.v(r0)
            r9 = r1
        L_0x0010:
            boolean r9 = r9.isSelected()
            java.lang.String r2 = "challanNoLl"
            r3 = 2131230970(0x7f0800fa, float:1.8078008E38)
            r4 = 0
            if (r9 != 0) goto L_0x011b
            ni.y7 r9 = r8.Z
            java.lang.String r5 = "binding"
            if (r9 != 0) goto L_0x0026
            cm.l.v(r5)
            r9 = r1
        L_0x0026:
            androidx.recyclerview.widget.RecyclerView r9 = r9.f29501w
            r6 = 8
            r9.setVisibility(r6)
            ni.y7 r9 = r8.Z
            if (r9 != 0) goto L_0x0035
            cm.l.v(r5)
            r9 = r1
        L_0x0035:
            android.widget.LinearLayout r9 = r9.R
            r9.setVisibility(r6)
            ni.y7 r9 = r8.Z
            if (r9 != 0) goto L_0x0042
            cm.l.v(r5)
            r9 = r1
        L_0x0042:
            android.widget.LinearLayout r9 = r9.Q
            r9.setVisibility(r6)
            android.widget.RadioButton r9 = r8.I
            if (r9 != 0) goto L_0x004f
            cm.l.v(r0)
            r9 = r1
        L_0x004f:
            r7 = 1
            r9.setChecked(r7)
            android.widget.RadioButton r9 = r8.I
            if (r9 != 0) goto L_0x005b
            cm.l.v(r0)
            r9 = r1
        L_0x005b:
            r9.setSelected(r7)
            android.widget.LinearLayout r9 = r8.H
            if (r9 != 0) goto L_0x0066
            cm.l.v(r2)
            r9 = r1
        L_0x0066:
            r0 = 2131230969(0x7f0800f9, float:1.8078006E38)
            r9.setBackgroundResource(r0)
            android.widget.RadioButton r9 = r8.K
            java.lang.String r0 = "vehicleNoRb"
            if (r9 != 0) goto L_0x0076
            cm.l.v(r0)
            r9 = r1
        L_0x0076:
            r9.setChecked(r4)
            android.widget.RadioButton r9 = r8.K
            if (r9 != 0) goto L_0x0081
            cm.l.v(r0)
            r9 = r1
        L_0x0081:
            r9.setSelected(r4)
            android.widget.LinearLayout r9 = r8.J
            if (r9 != 0) goto L_0x008e
            java.lang.String r9 = "vehicleNoLl"
            cm.l.v(r9)
            r9 = r1
        L_0x008e:
            r9.setBackgroundResource(r3)
            android.widget.RadioButton r9 = r8.M
            java.lang.String r0 = "dlNoRb"
            if (r9 != 0) goto L_0x009b
            cm.l.v(r0)
            r9 = r1
        L_0x009b:
            r9.setChecked(r4)
            android.widget.RadioButton r9 = r8.M
            if (r9 != 0) goto L_0x00a6
            cm.l.v(r0)
            r9 = r1
        L_0x00a6:
            r9.setSelected(r4)
            android.widget.LinearLayout r9 = r8.L
            if (r9 != 0) goto L_0x00b3
            java.lang.String r9 = "dlNoLl"
            cm.l.v(r9)
            r9 = r1
        L_0x00b3:
            r9.setBackgroundResource(r3)
            android.widget.EditText r9 = r8.N
            java.lang.String r0 = "inputEt"
            if (r9 != 0) goto L_0x00c0
            cm.l.v(r0)
            r9 = r1
        L_0x00c0:
            android.text.Editable r9 = r9.getText()
            if (r9 == 0) goto L_0x00c9
            r9.clear()
        L_0x00c9:
            android.widget.EditText r9 = r8.N
            if (r9 != 0) goto L_0x00d1
            cm.l.v(r0)
            r9 = r1
        L_0x00d1:
            android.text.InputFilter$LengthFilter[] r2 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            r7 = 30
            r3.<init>(r7)
            r2[r4] = r3
            android.text.InputFilter[] r2 = (android.text.InputFilter[]) r2
            r9.setFilters(r2)
            android.widget.EditText r9 = r8.N
            if (r9 != 0) goto L_0x00e9
            cm.l.v(r0)
            r9 = r1
        L_0x00e9:
            ld.c r2 = r8.t1()
            r3 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r3 = r8.getString(r3)
            java.lang.String r4 = "label_challan_enter_challan_no"
            java.lang.String r2 = r2.b(r4, r3)
            r9.setHint(r2)
            java.lang.String r9 = "Challan"
            r8.U = r9
            android.widget.EditText r9 = r8.N
            if (r9 != 0) goto L_0x0109
            cm.l.v(r0)
            r9 = r1
        L_0x0109:
            r9.setError(r1)
            ni.y7 r8 = r8.Z
            if (r8 != 0) goto L_0x0114
            cm.l.v(r5)
            goto L_0x0115
        L_0x0114:
            r1 = r8
        L_0x0115:
            android.widget.LinearLayout r8 = r1.M
            r8.setVisibility(r6)
            goto L_0x0141
        L_0x011b:
            java.lang.String r9 = ""
            r8.U = r9
            android.widget.RadioButton r9 = r8.I
            if (r9 != 0) goto L_0x0127
            cm.l.v(r0)
            r9 = r1
        L_0x0127:
            r9.setChecked(r4)
            android.widget.RadioButton r9 = r8.I
            if (r9 != 0) goto L_0x0132
            cm.l.v(r0)
            r9 = r1
        L_0x0132:
            r9.setSelected(r4)
            android.widget.LinearLayout r8 = r8.H
            if (r8 != 0) goto L_0x013d
            cm.l.v(r2)
            goto L_0x013e
        L_0x013d:
            r1 = r8
        L_0x013e:
            r1.setBackgroundResource(r3)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallan.z1(com.nic.mparivahan.Echallan.VerifyPaymentChallan, android.view.View):void");
    }

    public final boolean G1(String str) {
        l.f(str, "string");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (('A' > charAt || charAt >= '[') && ('a' > charAt || charAt >= '{')) {
                return false;
            }
        }
        return true;
    }

    public final void I1(ArrayList arrayList) {
        l.f(arrayList, "<set-?>");
        this.X = arrayList;
    }

    public final void J1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.W = databaseHelper;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.f8870c0 = progressDialog;
    }

    public final void L1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8872e0 = cVar;
    }

    public final void M1(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.f8869b0 = rcService;
    }

    public final void N1(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8868a0 = cVar;
    }

    public final void O1(h hVar) {
        l.f(hVar, "<set-?>");
        this.Y = hVar;
    }

    public final void P1(g gVar) {
        l.f(gVar, "<set-?>");
        this.f8871d0 = gVar;
    }

    public final void Q1() {
        ArrayList E0 = r1().E0();
        l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        I1(E0);
        y7 y7Var = null;
        if (q1().size() > 0) {
            Log.e("Arraylist", "1---------------->");
            y7 y7Var2 = this.Z;
            if (y7Var2 == null) {
                l.v("binding");
                y7Var2 = null;
            }
            y7Var2.R.setVisibility(0);
            y7 y7Var3 = this.Z;
            if (y7Var3 == null) {
                l.v("binding");
                y7Var3 = null;
            }
            y7Var3.f29501w.setVisibility(0);
            h hVar = new h(q1(), this, 13, "");
            l.c(hVar);
            O1(hVar);
            y7 y7Var4 = this.Z;
            if (y7Var4 == null) {
                l.v("binding");
            } else {
                y7Var = y7Var4;
            }
            y7Var.f29501w.setAdapter(w1());
            return;
        }
        y7 y7Var5 = this.Z;
        if (y7Var5 == null) {
            l.v("binding");
            y7Var5 = null;
        }
        y7Var5.f29501w.setVisibility(8);
        y7 y7Var6 = this.Z;
        if (y7Var6 == null) {
            l.v("binding");
        } else {
            y7Var = y7Var6;
        }
        y7Var.R.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ni.y7} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R1() {
        /*
            r6 = this;
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.r1()
            java.util.ArrayList r0 = r0.c0()
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 == 0) goto L_0x00b0
            ni.y7 r0 = r6.Z     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x0019
            cm.l.v(r1)     // Catch:{ Exception -> 0x0016 }
            r0 = r2
            goto L_0x0019
        L_0x0016:
            r0 = move-exception
            goto L_0x00ac
        L_0x0019:
            android.widget.TextView r0 = r0.P     // Catch:{ Exception -> 0x0016 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0016 }
            java.lang.String r4 = "label_verify_payment_status"
            java.lang.String r5 = "Verify Payment Status"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0016 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0016 }
            ni.y7 r0 = r6.Z     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x0032
            cm.l.v(r1)     // Catch:{ Exception -> 0x0016 }
            r0 = r2
        L_0x0032:
            android.widget.TextView r0 = r0.L     // Catch:{ Exception -> 0x0016 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0016 }
            java.lang.String r4 = "label_challan_dl_no"
            java.lang.String r5 = "Driving Licence No"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0016 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0016 }
            ni.y7 r0 = r6.Z     // Catch:{ Exception -> 0x0016 }
            if (r0 != 0) goto L_0x004b
            cm.l.v(r1)     // Catch:{ Exception -> 0x0016 }
            r0 = r2
        L_0x004b:
            com.nic.mparivahan.MyTextView r0 = r0.f29493o     // Catch:{ Exception -> 0x0016 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0016 }
            java.lang.String r4 = "label_challan_my_dl_number"
            r5 = 2132018462(0x7f14051e, float:1.9675231E38)
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Exception -> 0x0016 }
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0016 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0016 }
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.r1()     // Catch:{ Exception -> 0x0016 }
            java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x0016 }
            java.lang.String r3 = "getDLDetailsList(...)"
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x0016 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x0016 }
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x0016 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()     // Catch:{ Exception -> 0x0016 }
            if (r4 == 0) goto L_0x00c0
            ni.y7 r4 = r6.Z     // Catch:{ Exception -> 0x0016 }
            if (r4 != 0) goto L_0x0083
            cm.l.v(r1)     // Catch:{ Exception -> 0x0016 }
            r4 = r2
        L_0x0083:
            android.widget.LinearLayout r4 = r4.Q     // Catch:{ Exception -> 0x0016 }
            r4.setVisibility(r3)     // Catch:{ Exception -> 0x0016 }
            ni.y7 r4 = r6.Z     // Catch:{ Exception -> 0x0016 }
            if (r4 != 0) goto L_0x0090
            cm.l.v(r1)     // Catch:{ Exception -> 0x0016 }
            r4 = r2
        L_0x0090:
            android.widget.TextView r1 = r4.f29500v     // Catch:{ Exception -> 0x0016 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0016 }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0016 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x00a8
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x0016 }
            if (r0 == 0) goto L_0x00a8
            java.lang.String r2 = r0.getDlLicno()     // Catch:{ Exception -> 0x0016 }
        L_0x00a8:
            r1.setText(r2)     // Catch:{ Exception -> 0x0016 }
            goto L_0x00c0
        L_0x00ac:
            r0.printStackTrace()
            goto L_0x00c0
        L_0x00b0:
            ni.y7 r0 = r6.Z
            if (r0 != 0) goto L_0x00b8
            cm.l.v(r1)
            goto L_0x00b9
        L_0x00b8:
            r2 = r0
        L_0x00b9:
            android.widget.LinearLayout r0 = r2.Q
            r1 = 8
            r0.setVisibility(r1)
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.VerifyPaymentChallan.R1():void");
    }

    public final void S1(Context context, String str) {
        l.f(context, "context");
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.msg_dialog);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        l.c(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        View findViewById = dialog.findViewById(R.id.pop_up_msg);
        l.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        View findViewById2 = dialog.findViewById(R.id.pop_up_close);
        l.d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setText(t1().b("label_challan_ok_dialog_text", getString(R.string.ok_txt)));
        ((TextView) findViewById).setText(str);
        View findViewById3 = dialog.findViewById(R.id.tv_title);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById3).setText(t1().b("nex_parivahan", getString(R.string.app_name)));
        textView.setOnClickListener(new c3(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y7 c10 = y7.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.Z = c10;
        y7 y7Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        L1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        y7 y7Var2 = this.Z;
        if (y7Var2 == null) {
            l.v("binding");
            y7Var2 = null;
        }
        aVar.c(this, y7Var2);
        K1(new ProgressDialog(this));
        s1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        J1(A0);
        y7 y7Var3 = this.Z;
        if (y7Var3 == null) {
            l.v("binding");
            y7Var3 = null;
        }
        y7Var3.f29501w.setLayoutManager(new LinearLayoutManager(this, 0, false));
        a.C0153a aVar2 = gb.a.f11754a;
        y7 y7Var4 = this.Z;
        if (y7Var4 == null) {
            l.v("binding");
            y7Var4 = null;
        }
        EditText editText = y7Var4.f29488j;
        l.e(editText, "engineEt");
        aVar2.a(this, editText);
        y7 y7Var5 = this.Z;
        if (y7Var5 == null) {
            l.v("binding");
            y7Var5 = null;
        }
        EditText editText2 = y7Var5.f29491m;
        l.e(editText2, "inputEt");
        aVar2.a(this, editText2);
        y7 y7Var6 = this.Z;
        if (y7Var6 == null) {
            l.v("binding");
            y7Var6 = null;
        }
        EditText editText3 = y7Var6.f29484f;
        l.e(editText3, "chasisEt");
        aVar2.a(this, editText3);
        y1();
        Q1();
        y7 y7Var7 = this.Z;
        if (y7Var7 == null) {
            l.v("binding");
        } else {
            y7Var = y7Var7;
        }
        y7Var.E.f28308i.setText(t1().b("label_challan_verify_payment", "Verify Challan Payment"));
        v1().V().g(this, new f(new d(this)));
        v1().W().g(this, new f(new e(this)));
    }

    public final ArrayList q1() {
        ArrayList arrayList = this.X;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("arrayList");
        return null;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.W;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.f8870c0;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("dialog");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.f8872e0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final RcService u1() {
        RcService rcService = this.f8869b0;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final cd.c v1() {
        cd.c cVar = this.f8868a0;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final h w1() {
        h hVar = this.Y;
        if (hVar != null) {
            return hVar;
        }
        l.v("myRcAdapter");
        return null;
    }

    public final g x1() {
        g gVar = this.f8871d0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }
}
