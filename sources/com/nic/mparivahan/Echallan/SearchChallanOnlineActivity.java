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
import cb.p1;
import cb.q1;
import cb.r1;
import cb.s1;
import cb.t1;
import cb.u1;
import cb.v1;
import cb.w1;
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
import ni.a8;
import pl.x;
import v9.d;
import wc.h;

public final class SearchChallanOnlineActivity extends androidx.appcompat.app.d {
    private AppCompatImageView G;
    private AppCompatImageView H;
    private LinearLayout I;
    private RadioButton J;
    private LinearLayout K;
    private RadioButton L;
    private LinearLayout M;
    private RadioButton N;
    /* access modifiers changed from: private */
    public EditText O;
    private AppCompatTextView P;
    private RelativeLayout Q;
    public DatabaseHelper R;
    public ArrayList S;
    public h T;
    /* access modifiers changed from: private */
    public String U = "RC";
    private final String V = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    /* access modifiers changed from: private */
    public a8 W;
    public cd.c X;
    public RcService Y;
    public ProgressDialog Z;

    /* renamed from: a0  reason: collision with root package name */
    public g f8837a0;

    /* renamed from: b0  reason: collision with root package name */
    public ld.c f8838b0;

    /* renamed from: c0  reason: collision with root package name */
    private final TextWatcher f8839c0 = new a(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanOnlineActivity f8840e;

        a(SearchChallanOnlineActivity searchChallanOnlineActivity) {
            this.f8840e = searchChallanOnlineActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                EditText o12 = this.f8840e.O;
                if (o12 == null) {
                    l.v("inputEt");
                    o12 = null;
                }
                o12.setError((CharSequence) null);
            }
        }
    }

    static final class b extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanOnlineActivity f8841e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(SearchChallanOnlineActivity searchChallanOnlineActivity) {
            super(1);
            this.f8841e = searchChallanOnlineActivity;
        }

        public final void b(ValidateRcSuccess validateRcSuccess) {
            d.a aVar;
            SearchChallanOnlineActivity searchChallanOnlineActivity;
            String statusDesc;
            if (this.f8841e.s1().isShowing()) {
                this.f8841e.s1().dismiss();
            }
            int i10 = 1;
            if (p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(this.f8841e, SearchChallanListActivity.class);
                a8 n12 = this.f8841e.W;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                intent.putExtra("inputValue", n12.f25230k.getText().toString());
                intent.putExtra("inputType", this.f8841e.U);
                this.f8841e.startActivity(intent);
            } else if (p.o(validateRcSuccess.getStatusCode(), "NP985", true) || p.o(validateRcSuccess.getStatusCode(), "NR005", true)) {
                SearchChallanOnlineActivity searchChallanOnlineActivity2 = this.f8841e;
                searchChallanOnlineActivity2.S1(searchChallanOnlineActivity2, validateRcSuccess.getStatusDesc());
            } else {
                if (validateRcSuccess.getStatusCode().equals("NR090")) {
                    aVar = v9.d.f17494a;
                    searchChallanOnlineActivity = this.f8841e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                } else if (validateRcSuccess.getStatusCode().equals("NR091")) {
                    aVar = v9.d.f17494a;
                    searchChallanOnlineActivity = this.f8841e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                    i10 = 2;
                } else {
                    SearchChallanOnlineActivity searchChallanOnlineActivity3 = this.f8841e;
                    searchChallanOnlineActivity3.S1(searchChallanOnlineActivity3, searchChallanOnlineActivity3.t1().b("error_msg_record_not_found", this.f8841e.getString(R.string.service_unavable_please_try)));
                    return;
                }
                aVar.D(searchChallanOnlineActivity, statusDesc, i10);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateRcSuccess) obj);
            return x.f30437a;
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchChallanOnlineActivity f8842e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SearchChallanOnlineActivity searchChallanOnlineActivity) {
            super(1);
            this.f8842e = searchChallanOnlineActivity;
        }

        public final void b(String str) {
            if (this.f8842e.s1().isShowing()) {
                this.f8842e.s1().dismiss();
            }
            SearchChallanOnlineActivity searchChallanOnlineActivity = this.f8842e;
            searchChallanOnlineActivity.S1(searchChallanOnlineActivity, searchChallanOnlineActivity.t1().b("error_msg_record_not_found", this.f8842e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class d implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8843a;

        d(bm.l lVar) {
            l.f(lVar, "function");
            this.f8843a = lVar;
        }

        public final pl.c a() {
            return this.f8843a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8843a.invoke(obj);
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
    public static final void A1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        RadioButton radioButton = searchChallanOnlineActivity.L;
        a8 a8Var = null;
        if (radioButton == null) {
            l.v("vehicleNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            RadioButton radioButton2 = searchChallanOnlineActivity.J;
            if (radioButton2 == null) {
                l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = searchChallanOnlineActivity.J;
            if (radioButton3 == null) {
                l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            LinearLayout linearLayout = searchChallanOnlineActivity.I;
            if (linearLayout == null) {
                l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = searchChallanOnlineActivity.L;
            if (radioButton4 == null) {
                l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(true);
            RadioButton radioButton5 = searchChallanOnlineActivity.L;
            if (radioButton5 == null) {
                l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(true);
            LinearLayout linearLayout2 = searchChallanOnlineActivity.K;
            if (linearLayout2 == null) {
                l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_14_selected);
            RadioButton radioButton6 = searchChallanOnlineActivity.N;
            if (radioButton6 == null) {
                l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(false);
            RadioButton radioButton7 = searchChallanOnlineActivity.N;
            if (radioButton7 == null) {
                l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(false);
            LinearLayout linearLayout3 = searchChallanOnlineActivity.M;
            if (linearLayout3 == null) {
                l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_bg_14);
            EditText editText = searchChallanOnlineActivity.O;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = searchChallanOnlineActivity.O;
            if (editText2 == null) {
                l.v("inputEt");
                editText2 = null;
            }
            editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            EditText editText3 = searchChallanOnlineActivity.O;
            if (editText3 == null) {
                l.v("inputEt");
                editText3 = null;
            }
            editText3.setHint(searchChallanOnlineActivity.t1().b("label_challan_enter_vehicle_no", searchChallanOnlineActivity.getString(R.string.enter_vehicle_number)));
            searchChallanOnlineActivity.U = "RC";
            EditText editText4 = searchChallanOnlineActivity.O;
            if (editText4 == null) {
                l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            a8 a8Var2 = searchChallanOnlineActivity.W;
            if (a8Var2 == null) {
                l.v("binding");
                a8Var2 = null;
            }
            a8Var2.f25241v.setVisibility(0);
            a8 a8Var3 = searchChallanOnlineActivity.W;
            if (a8Var3 == null) {
                l.v("binding");
            } else {
                a8Var = a8Var3;
            }
            a8Var.f25245z.setVisibility(8);
            searchChallanOnlineActivity.Q1();
            return;
        }
        a8 a8Var4 = searchChallanOnlineActivity.W;
        if (a8Var4 == null) {
            l.v("binding");
            a8Var4 = null;
        }
        a8Var4.f25241v.setVisibility(8);
        searchChallanOnlineActivity.U = "";
        RadioButton radioButton8 = searchChallanOnlineActivity.L;
        if (radioButton8 == null) {
            l.v("vehicleNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = searchChallanOnlineActivity.L;
        if (radioButton9 == null) {
            l.v("vehicleNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        LinearLayout linearLayout4 = searchChallanOnlineActivity.K;
        if (linearLayout4 == null) {
            l.v("vehicleNoLl");
            linearLayout4 = null;
        }
        linearLayout4.setBackgroundResource(R.drawable.corner_circle_bg_14);
        a8 a8Var5 = searchChallanOnlineActivity.W;
        if (a8Var5 == null) {
            l.v("binding");
            a8Var5 = null;
        }
        a8Var5.f25234o.setVisibility(8);
        a8 a8Var6 = searchChallanOnlineActivity.W;
        if (a8Var6 == null) {
            l.v("binding");
        } else {
            a8Var = a8Var6;
        }
        a8Var.A.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void B1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        RadioButton radioButton = searchChallanOnlineActivity.N;
        a8 a8Var = null;
        if (radioButton == null) {
            l.v("dlNoRb");
            radioButton = null;
        }
        if (!radioButton.isSelected()) {
            a8 a8Var2 = searchChallanOnlineActivity.W;
            if (a8Var2 == null) {
                l.v("binding");
                a8Var2 = null;
            }
            a8Var2.f25234o.setVisibility(8);
            a8 a8Var3 = searchChallanOnlineActivity.W;
            if (a8Var3 == null) {
                l.v("binding");
                a8Var3 = null;
            }
            a8Var3.A.setVisibility(8);
            RadioButton radioButton2 = searchChallanOnlineActivity.J;
            if (radioButton2 == null) {
                l.v("challanNoRb");
                radioButton2 = null;
            }
            radioButton2.setChecked(false);
            RadioButton radioButton3 = searchChallanOnlineActivity.J;
            if (radioButton3 == null) {
                l.v("challanNoRb");
                radioButton3 = null;
            }
            radioButton3.setSelected(false);
            LinearLayout linearLayout = searchChallanOnlineActivity.I;
            if (linearLayout == null) {
                l.v("challanNoLl");
                linearLayout = null;
            }
            linearLayout.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton4 = searchChallanOnlineActivity.L;
            if (radioButton4 == null) {
                l.v("vehicleNoRb");
                radioButton4 = null;
            }
            radioButton4.setChecked(false);
            RadioButton radioButton5 = searchChallanOnlineActivity.L;
            if (radioButton5 == null) {
                l.v("vehicleNoRb");
                radioButton5 = null;
            }
            radioButton5.setSelected(false);
            LinearLayout linearLayout2 = searchChallanOnlineActivity.K;
            if (linearLayout2 == null) {
                l.v("vehicleNoLl");
                linearLayout2 = null;
            }
            linearLayout2.setBackgroundResource(R.drawable.corner_circle_bg_14);
            RadioButton radioButton6 = searchChallanOnlineActivity.N;
            if (radioButton6 == null) {
                l.v("dlNoRb");
                radioButton6 = null;
            }
            radioButton6.setChecked(true);
            RadioButton radioButton7 = searchChallanOnlineActivity.N;
            if (radioButton7 == null) {
                l.v("dlNoRb");
                radioButton7 = null;
            }
            radioButton7.setSelected(true);
            LinearLayout linearLayout3 = searchChallanOnlineActivity.M;
            if (linearLayout3 == null) {
                l.v("dlNoLl");
                linearLayout3 = null;
            }
            linearLayout3.setBackgroundResource(R.drawable.corner_circle_14_selected);
            EditText editText = searchChallanOnlineActivity.O;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            Editable text = editText.getText();
            if (text != null) {
                text.clear();
            }
            EditText editText2 = searchChallanOnlineActivity.O;
            if (editText2 == null) {
                l.v("inputEt");
                editText2 = null;
            }
            editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            EditText editText3 = searchChallanOnlineActivity.O;
            if (editText3 == null) {
                l.v("inputEt");
                editText3 = null;
            }
            editText3.setHint(searchChallanOnlineActivity.t1().b("label_challan_enter_dl_no", searchChallanOnlineActivity.getString(R.string.enter_dl_number)));
            searchChallanOnlineActivity.U = "DL";
            EditText editText4 = searchChallanOnlineActivity.O;
            if (editText4 == null) {
                l.v("inputEt");
                editText4 = null;
            }
            editText4.setError((CharSequence) null);
            a8 a8Var4 = searchChallanOnlineActivity.W;
            if (a8Var4 == null) {
                l.v("binding");
            } else {
                a8Var = a8Var4;
            }
            a8Var.f25241v.setVisibility(8);
            searchChallanOnlineActivity.R1();
            return;
        }
        searchChallanOnlineActivity.U = "";
        RadioButton radioButton8 = searchChallanOnlineActivity.N;
        if (radioButton8 == null) {
            l.v("dlNoRb");
            radioButton8 = null;
        }
        radioButton8.setChecked(false);
        RadioButton radioButton9 = searchChallanOnlineActivity.N;
        if (radioButton9 == null) {
            l.v("dlNoRb");
            radioButton9 = null;
        }
        radioButton9.setSelected(false);
        LinearLayout linearLayout4 = searchChallanOnlineActivity.M;
        if (linearLayout4 == null) {
            l.v("dlNoLl");
            linearLayout4 = null;
        }
        linearLayout4.setBackgroundResource(R.drawable.corner_circle_bg_14);
        a8 a8Var5 = searchChallanOnlineActivity.W;
        if (a8Var5 == null) {
            l.v("binding");
        } else {
            a8Var = a8Var5;
        }
        a8Var.f25245z.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void C1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        if (searchChallanOnlineActivity.U1() || !com.nic.mparivahan.dlservices.utilities.d.d(searchChallanOnlineActivity.U)) {
            if (l.a(searchChallanOnlineActivity.U, "")) {
                searchChallanOnlineActivity.S1(searchChallanOnlineActivity, searchChallanOnlineActivity.t1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else if (l.a(searchChallanOnlineActivity.U, "RC")) {
            searchChallanOnlineActivity.V1();
        } else {
            Intent intent = new Intent(searchChallanOnlineActivity, SearchChallanListActivity.class);
            EditText editText = searchChallanOnlineActivity.O;
            if (editText == null) {
                l.v("inputEt");
                editText = null;
            }
            intent.putExtra("inputValue", editText.getText().toString());
            intent.putExtra("inputType", searchChallanOnlineActivity.U);
            searchChallanOnlineActivity.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void D1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        Intent intent = new Intent(searchChallanOnlineActivity, SearchChallanListActivity.class);
        a8 a8Var = searchChallanOnlineActivity.W;
        if (a8Var == null) {
            l.v("binding");
            a8Var = null;
        }
        intent.putExtra("inputValue", a8Var.f25233n.getText().toString());
        intent.putExtra("inputType", "DL");
        searchChallanOnlineActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void E1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        searchChallanOnlineActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void F1(SearchChallanOnlineActivity searchChallanOnlineActivity, View view) {
        l.f(searchChallanOnlineActivity, "this$0");
        searchChallanOnlineActivity.H1();
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: ni.a8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: ni.a8} */
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r4 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x01eb
            cm.l.v(r1)
            goto L_0x01ec
        L_0x01eb:
            r2 = r0
        L_0x01ec:
            r2.requestFocus()
            return r7
        L_0x01f0:
            ni.a8 r0 = r8.W
            java.lang.String r1 = "binding"
            if (r0 != 0) goto L_0x01fa
            cm.l.v(r1)
            r0 = r2
        L_0x01fa:
            android.widget.EditText r0 = r0.f25223d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x0233
            ni.a8 r0 = r8.W
            if (r0 != 0) goto L_0x0213
            cm.l.v(r1)
            r0 = r2
        L_0x0213:
            android.widget.EditText r0 = r0.f25223d
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_chassis_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of chassis no."
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.a8 r0 = r8.W
            if (r0 != 0) goto L_0x022c
            cm.l.v(r1)
            goto L_0x022d
        L_0x022c:
            r2 = r0
        L_0x022d:
            android.widget.EditText r0 = r2.f25223d
        L_0x022f:
            r0.requestFocus()
            return r7
        L_0x0233:
            ni.a8 r0 = r8.W
            if (r0 != 0) goto L_0x023b
            cm.l.v(r1)
            r0 = r2
        L_0x023b:
            android.widget.EditText r0 = r0.f25227h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r3) goto L_0x02d3
            ni.a8 r0 = r8.W
            if (r0 != 0) goto L_0x0253
            cm.l.v(r1)
            r0 = r2
        L_0x0253:
            android.widget.EditText r0 = r0.f25227h
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_engine_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of engine no"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.a8 r0 = r8.W
            if (r0 != 0) goto L_0x026c
            cm.l.v(r1)
            goto L_0x026d
        L_0x026c:
            r2 = r0
        L_0x026d:
            android.widget.EditText r0 = r2.f25227h
            goto L_0x022f
        L_0x0270:
            java.lang.String r3 = r8.U
            java.lang.String r4 = "DL"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x02d3
            int r3 = r0.length()
            if (r3 != 0) goto L_0x02a9
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
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
            android.widget.EditText r0 = r8.O
            if (r0 != 0) goto L_0x02b7
            cm.l.v(r1)
            r0 = r2
        L_0x02b7:
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_min_char_dl_validation"
            java.lang.String r5 = "Please enter minimum 10 characters of DL number"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            android.widget.EditText r0 = r8.O
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
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanOnlineActivity.U1():boolean");
    }

    private final void V1() {
        s1().show();
        cd.c v12 = v1();
        a8 a8Var = this.W;
        a8 a8Var2 = null;
        if (a8Var == null) {
            l.v("binding");
            a8Var = null;
        }
        String obj = a8Var.f25230k.getText().toString();
        String str = x1().k().toString();
        a8 a8Var3 = this.W;
        if (a8Var3 == null) {
            l.v("binding");
            a8Var3 = null;
        }
        String obj2 = a8Var3.f25223d.getText().toString();
        a8 a8Var4 = this.W;
        if (a8Var4 == null) {
            l.v("binding");
        } else {
            a8Var2 = a8Var4;
        }
        v12.m(obj, str, obj2, a8Var2.f25227h.getText().toString(), this, v9.d.f17494a.k());
    }

    private final void y1() {
        P1(new g(this));
        M1(RcService.f9484a.c(this));
        N1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(u1()))).a(cd.c.class));
        View findViewById = findViewById(R.id.mvvm_back);
        l.e(findViewById, "findViewById(...)");
        this.G = (AppCompatImageView) findViewById;
        View findViewById2 = findViewById(R.id.notificationIv);
        l.e(findViewById2, "findViewById(...)");
        this.H = (AppCompatImageView) findViewById2;
        View findViewById3 = findViewById(R.id.challanNoLl);
        l.e(findViewById3, "findViewById(...)");
        this.I = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(R.id.challanNoRb);
        l.e(findViewById4, "findViewById(...)");
        this.J = (RadioButton) findViewById4;
        View findViewById5 = findViewById(R.id.vehicleNoLl);
        l.e(findViewById5, "findViewById(...)");
        this.K = (LinearLayout) findViewById5;
        View findViewById6 = findViewById(R.id.vehicleNoRb);
        l.e(findViewById6, "findViewById(...)");
        this.L = (RadioButton) findViewById6;
        View findViewById7 = findViewById(R.id.drivingLicenseLl);
        l.e(findViewById7, "findViewById(...)");
        this.M = (LinearLayout) findViewById7;
        View findViewById8 = findViewById(R.id.nexGenHolder);
        l.e(findViewById8, "findViewById(...)");
        this.Q = (RelativeLayout) findViewById8;
        View findViewById9 = findViewById(R.id.dLNoRb);
        l.e(findViewById9, "findViewById(...)");
        this.N = (RadioButton) findViewById9;
        View findViewById10 = findViewById(R.id.inputEt);
        l.e(findViewById10, "findViewById(...)");
        this.O = (EditText) findViewById10;
        View findViewById11 = findViewById(R.id.getDetailsTv);
        l.e(findViewById11, "findViewById(...)");
        this.P = (AppCompatTextView) findViewById11;
        Q1();
        RadioButton radioButton = this.J;
        RelativeLayout relativeLayout = null;
        if (radioButton == null) {
            l.v("challanNoRb");
            radioButton = null;
        }
        radioButton.setOnClickListener(new p1(this));
        RadioButton radioButton2 = this.L;
        if (radioButton2 == null) {
            l.v("vehicleNoRb");
            radioButton2 = null;
        }
        radioButton2.setOnClickListener(new q1(this));
        RadioButton radioButton3 = this.N;
        if (radioButton3 == null) {
            l.v("dlNoRb");
            radioButton3 = null;
        }
        radioButton3.setOnClickListener(new r1(this));
        AppCompatTextView appCompatTextView = this.P;
        if (appCompatTextView == null) {
            l.v("getDetails");
            appCompatTextView = null;
        }
        appCompatTextView.setOnClickListener(new s1(this));
        a8 a8Var = this.W;
        if (a8Var == null) {
            l.v("binding");
            a8Var = null;
        }
        a8Var.f25244y.setOnClickListener(new t1(this));
        AppCompatImageView appCompatImageView = this.G;
        if (appCompatImageView == null) {
            l.v("backBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setOnClickListener(new u1(this));
        RelativeLayout relativeLayout2 = this.Q;
        if (relativeLayout2 == null) {
            l.v("nexGenHolder");
        } else {
            relativeLayout = relativeLayout2;
        }
        relativeLayout.setOnClickListener(new v1(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ni.a8} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void z1(com.nic.mparivahan.Echallan.SearchChallanOnlineActivity r9, android.view.View r10) {
        /*
            java.lang.String r10 = "this$0"
            cm.l.f(r9, r10)
            android.widget.RadioButton r10 = r9.J
            java.lang.String r0 = "challanNoRb"
            r1 = 0
            if (r10 != 0) goto L_0x0010
            cm.l.v(r0)
            r10 = r1
        L_0x0010:
            boolean r10 = r10.isSelected()
            java.lang.String r2 = "challanNoLl"
            r3 = 2131230970(0x7f0800fa, float:1.8078008E38)
            r4 = 0
            if (r10 != 0) goto L_0x011b
            ni.a8 r10 = r9.W
            java.lang.String r5 = "binding"
            if (r10 != 0) goto L_0x0026
            cm.l.v(r5)
            r10 = r1
        L_0x0026:
            androidx.recyclerview.widget.RecyclerView r10 = r10.f25234o
            r6 = 8
            r10.setVisibility(r6)
            ni.a8 r10 = r9.W
            if (r10 != 0) goto L_0x0035
            cm.l.v(r5)
            r10 = r1
        L_0x0035:
            android.widget.LinearLayout r10 = r10.A
            r10.setVisibility(r6)
            ni.a8 r10 = r9.W
            if (r10 != 0) goto L_0x0042
            cm.l.v(r5)
            r10 = r1
        L_0x0042:
            android.widget.LinearLayout r10 = r10.f25245z
            r10.setVisibility(r6)
            android.widget.RadioButton r10 = r9.J
            if (r10 != 0) goto L_0x004f
            cm.l.v(r0)
            r10 = r1
        L_0x004f:
            r7 = 1
            r10.setChecked(r7)
            android.widget.RadioButton r10 = r9.J
            if (r10 != 0) goto L_0x005b
            cm.l.v(r0)
            r10 = r1
        L_0x005b:
            r10.setSelected(r7)
            android.widget.LinearLayout r10 = r9.I
            if (r10 != 0) goto L_0x0066
            cm.l.v(r2)
            r10 = r1
        L_0x0066:
            r0 = 2131230969(0x7f0800f9, float:1.8078006E38)
            r10.setBackgroundResource(r0)
            android.widget.RadioButton r10 = r9.L
            java.lang.String r0 = "vehicleNoRb"
            if (r10 != 0) goto L_0x0076
            cm.l.v(r0)
            r10 = r1
        L_0x0076:
            r10.setChecked(r4)
            android.widget.RadioButton r10 = r9.L
            if (r10 != 0) goto L_0x0081
            cm.l.v(r0)
            r10 = r1
        L_0x0081:
            r10.setSelected(r4)
            android.widget.LinearLayout r10 = r9.K
            if (r10 != 0) goto L_0x008e
            java.lang.String r10 = "vehicleNoLl"
            cm.l.v(r10)
            r10 = r1
        L_0x008e:
            r10.setBackgroundResource(r3)
            android.widget.RadioButton r10 = r9.N
            java.lang.String r0 = "dlNoRb"
            if (r10 != 0) goto L_0x009b
            cm.l.v(r0)
            r10 = r1
        L_0x009b:
            r10.setChecked(r4)
            android.widget.RadioButton r10 = r9.N
            if (r10 != 0) goto L_0x00a6
            cm.l.v(r0)
            r10 = r1
        L_0x00a6:
            r10.setSelected(r4)
            android.widget.LinearLayout r10 = r9.M
            if (r10 != 0) goto L_0x00b3
            java.lang.String r10 = "dlNoLl"
            cm.l.v(r10)
            r10 = r1
        L_0x00b3:
            r10.setBackgroundResource(r3)
            android.widget.EditText r10 = r9.O
            java.lang.String r0 = "inputEt"
            if (r10 != 0) goto L_0x00c0
            cm.l.v(r0)
            r10 = r1
        L_0x00c0:
            android.text.Editable r10 = r10.getText()
            if (r10 == 0) goto L_0x00c9
            r10.clear()
        L_0x00c9:
            android.widget.EditText r10 = r9.O
            if (r10 != 0) goto L_0x00d1
            cm.l.v(r0)
            r10 = r1
        L_0x00d1:
            ld.c r2 = r9.t1()
            r3 = 2132017803(0x7f14028b, float:1.9673895E38)
            java.lang.String r3 = r9.getString(r3)
            java.lang.String r8 = "label_challan_enter_challan_no"
            java.lang.String r2 = r2.b(r8, r3)
            r10.setHint(r2)
            android.widget.EditText r10 = r9.O
            if (r10 != 0) goto L_0x00ed
            cm.l.v(r0)
            r10 = r1
        L_0x00ed:
            android.text.InputFilter$LengthFilter[] r2 = new android.text.InputFilter.LengthFilter[r7]
            android.text.InputFilter$LengthFilter r3 = new android.text.InputFilter$LengthFilter
            r7 = 30
            r3.<init>(r7)
            r2[r4] = r3
            android.text.InputFilter[] r2 = (android.text.InputFilter[]) r2
            r10.setFilters(r2)
            java.lang.String r10 = "Challan"
            r9.U = r10
            android.widget.EditText r10 = r9.O
            if (r10 != 0) goto L_0x0109
            cm.l.v(r0)
            r10 = r1
        L_0x0109:
            r10.setError(r1)
            ni.a8 r9 = r9.W
            if (r9 != 0) goto L_0x0114
            cm.l.v(r5)
            goto L_0x0115
        L_0x0114:
            r1 = r9
        L_0x0115:
            android.widget.LinearLayout r9 = r1.f25241v
            r9.setVisibility(r6)
            goto L_0x0141
        L_0x011b:
            java.lang.String r10 = ""
            r9.U = r10
            android.widget.RadioButton r10 = r9.J
            if (r10 != 0) goto L_0x0127
            cm.l.v(r0)
            r10 = r1
        L_0x0127:
            r10.setChecked(r4)
            android.widget.RadioButton r10 = r9.J
            if (r10 != 0) goto L_0x0132
            cm.l.v(r0)
            r10 = r1
        L_0x0132:
            r10.setSelected(r4)
            android.widget.LinearLayout r9 = r9.I
            if (r9 != 0) goto L_0x013d
            cm.l.v(r2)
            goto L_0x013e
        L_0x013d:
            r1 = r9
        L_0x013e:
            r1.setBackgroundResource(r3)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanOnlineActivity.z1(com.nic.mparivahan.Echallan.SearchChallanOnlineActivity, android.view.View):void");
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
        this.S = arrayList;
    }

    public final void J1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.R = databaseHelper;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.Z = progressDialog;
    }

    public final void L1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.f8838b0 = cVar;
    }

    public final void M1(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.Y = rcService;
    }

    public final void N1(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.X = cVar;
    }

    public final void O1(h hVar) {
        l.f(hVar, "<set-?>");
        this.T = hVar;
    }

    public final void P1(g gVar) {
        l.f(gVar, "<set-?>");
        this.f8837a0 = gVar;
    }

    public final void Q1() {
        ArrayList E0 = r1().E0();
        l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        I1(E0);
        a8 a8Var = null;
        if (q1().size() > 0) {
            Log.e("Arraylist", "1---------------->");
            a8 a8Var2 = this.W;
            if (a8Var2 == null) {
                l.v("binding");
                a8Var2 = null;
            }
            a8Var2.A.setVisibility(0);
            a8 a8Var3 = this.W;
            if (a8Var3 == null) {
                l.v("binding");
                a8Var3 = null;
            }
            a8Var3.f25234o.setVisibility(0);
            h hVar = new h(q1(), this, 1, "");
            l.c(hVar);
            O1(hVar);
            a8 a8Var4 = this.W;
            if (a8Var4 == null) {
                l.v("binding");
            } else {
                a8Var = a8Var4;
            }
            a8Var.f25234o.setAdapter(w1());
            return;
        }
        a8 a8Var5 = this.W;
        if (a8Var5 == null) {
            l.v("binding");
            a8Var5 = null;
        }
        a8Var5.f25234o.setVisibility(8);
        a8 a8Var6 = this.W;
        if (a8Var6 == null) {
            l.v("binding");
        } else {
            a8Var = a8Var6;
        }
        a8Var.A.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ni.a8} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R1() {
        /*
            r5 = this;
            com.nic.mparivahan.DB.DatabaseHelper r0 = r5.r1()
            java.util.ArrayList r0 = r0.c0()
            java.lang.String r1 = "binding"
            r2 = 0
            if (r0 == 0) goto L_0x005f
            com.nic.mparivahan.DB.DatabaseHelper r0 = r5.r1()     // Catch:{ Exception -> 0x0030 }
            java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x0030 }
            java.lang.String r3 = "getDLDetailsList(...)"
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x0030 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x0030 }
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x0030 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()     // Catch:{ Exception -> 0x0030 }
            if (r4 == 0) goto L_0x006f
            ni.a8 r4 = r5.W     // Catch:{ Exception -> 0x0030 }
            if (r4 != 0) goto L_0x0032
            cm.l.v(r1)     // Catch:{ Exception -> 0x0030 }
            r4 = r2
            goto L_0x0032
        L_0x0030:
            r0 = move-exception
            goto L_0x005b
        L_0x0032:
            android.widget.LinearLayout r4 = r4.f25245z     // Catch:{ Exception -> 0x0030 }
            r4.setVisibility(r3)     // Catch:{ Exception -> 0x0030 }
            ni.a8 r4 = r5.W     // Catch:{ Exception -> 0x0030 }
            if (r4 != 0) goto L_0x003f
            cm.l.v(r1)     // Catch:{ Exception -> 0x0030 }
            r4 = r2
        L_0x003f:
            android.widget.TextView r1 = r4.f25233n     // Catch:{ Exception -> 0x0030 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0030 }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0030 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0057
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0057
            java.lang.String r2 = r0.getDlLicno()     // Catch:{ Exception -> 0x0030 }
        L_0x0057:
            r1.setText(r2)     // Catch:{ Exception -> 0x0030 }
            goto L_0x006f
        L_0x005b:
            r0.printStackTrace()
            goto L_0x006f
        L_0x005f:
            ni.a8 r0 = r5.W
            if (r0 != 0) goto L_0x0067
            cm.l.v(r1)
            goto L_0x0068
        L_0x0067:
            r2 = r0
        L_0x0068:
            android.widget.LinearLayout r0 = r2.f25245z
            r1 = 8
            r0.setVisibility(r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchChallanOnlineActivity.R1():void");
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
        textView.setOnClickListener(new w1(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a8 c10 = a8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.W = c10;
        a8 a8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        L1(new ld.c(this));
        a.C0148a aVar = fb.a.f11584a;
        a8 a8Var2 = this.W;
        if (a8Var2 == null) {
            l.v("binding");
            a8Var2 = null;
        }
        aVar.g(this, a8Var2);
        K1(new ProgressDialog(this));
        s1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        J1(A0);
        a8 a8Var3 = this.W;
        if (a8Var3 == null) {
            l.v("binding");
            a8Var3 = null;
        }
        a8Var3.f25234o.setLayoutManager(new LinearLayoutManager(this, 0, false));
        a.C0153a aVar2 = gb.a.f11754a;
        a8 a8Var4 = this.W;
        if (a8Var4 == null) {
            l.v("binding");
            a8Var4 = null;
        }
        EditText editText = a8Var4.f25227h;
        l.e(editText, "engineEt");
        aVar2.a(this, editText);
        a8 a8Var5 = this.W;
        if (a8Var5 == null) {
            l.v("binding");
            a8Var5 = null;
        }
        EditText editText2 = a8Var5.f25230k;
        l.e(editText2, "inputEt");
        aVar2.a(this, editText2);
        a8 a8Var6 = this.W;
        if (a8Var6 == null) {
            l.v("binding");
        } else {
            a8Var = a8Var6;
        }
        EditText editText3 = a8Var.f25223d;
        l.e(editText3, "chasisEt");
        aVar2.a(this, editText3);
        y1();
        v1().V().g(this, new d(new b(this)));
        v1().W().g(this, new d(new c(this)));
    }

    public final ArrayList q1() {
        ArrayList arrayList = this.S;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("arrayList");
        return null;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.R;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.Z;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("dialog");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.f8838b0;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final RcService u1() {
        RcService rcService = this.Y;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final cd.c v1() {
        cd.c cVar = this.X;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final h w1() {
        h hVar = this.T;
        if (hVar != null) {
            return hVar;
        }
        l.v("myRcAdapter");
        return null;
    }

    public final g x1() {
        g gVar = this.f8837a0;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }
}
