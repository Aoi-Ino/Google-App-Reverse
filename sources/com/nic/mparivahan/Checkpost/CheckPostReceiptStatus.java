package com.nic.mparivahan.Checkpost;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import bi.h;
import cm.l;
import cm.m;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNew;
import com.nic.mparivahan.Checkpost.CheckPostRepository.CheckPostService;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModle;
import com.nic.mparivahan.VahanServices.VahanModel.VahanStateModleSubList;
import com.nic.mparivahan.VahanServices.VahanService.VahanProService;
import java.util.ArrayList;
import ni.j0;
import pl.x;
import v9.e;

public final class CheckPostReceiptStatus extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public j0 G;
    /* access modifiers changed from: private */
    public String H = "Receipt";
    public ld.c I;
    public c9.a J;
    public CheckPostService K;
    public h L;
    public VahanProService M;
    private String N = "";
    public ProgressDialog O;

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7736e;

        a(CheckPostReceiptStatus checkPostReceiptStatus) {
            this.f7736e = checkPostReceiptStatus;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                j0 m12 = this.f7736e.G;
                if (m12 == null) {
                    l.v("binding");
                    m12 = null;
                }
                m12.f26897d.setError((CharSequence) null);
            }
        }
    }

    public static final class b implements AdapterView.OnItemSelectedListener {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7737e;

        b(CheckPostReceiptStatus checkPostReceiptStatus) {
            this.f7737e = checkPostReceiptStatus;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            j0 m12 = this.f7737e.G;
            j0 j0Var = null;
            if (m12 == null) {
                l.v("binding");
                m12 = null;
            }
            if (m12.f26900g.getSelectedItemPosition() != 0) {
                j0 m13 = this.f7737e.G;
                if (m13 == null) {
                    l.v("binding");
                    m13 = null;
                }
                Log.e("stateInfo", m13.f26900g.getSelectedItem().toString());
                j0 m14 = this.f7737e.G;
                if (m14 == null) {
                    l.v("binding");
                } else {
                    j0Var = m14;
                }
                Object selectedItem = j0Var.f26900g.getSelectedItem();
                l.d(selectedItem, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                ArrayList arrayList = (ArrayList) selectedItem;
                Object obj = arrayList.get(0);
                l.d(obj, "null cannot be cast to non-null type kotlin.String");
                Log.e("stateInfo2", (String) obj);
                CheckPostReceiptStatus checkPostReceiptStatus = this.f7737e;
                Object obj2 = arrayList.get(0);
                l.d(obj2, "null cannot be cast to non-null type kotlin.String");
                checkPostReceiptStatus.H1((String) obj2);
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static final class c extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7738e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CheckPostReceiptStatus checkPostReceiptStatus) {
            super(1);
            this.f7738e = checkPostReceiptStatus;
        }

        public final void b(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            if (checkPostReceiptDetailNew.size() > 0) {
                this.f7738e.q1().dismiss();
                Intent intent = new Intent(this.f7738e, CheckPostSearchList.class);
                j0 m12 = this.f7738e.G;
                if (m12 == null) {
                    l.v("binding");
                    m12 = null;
                }
                intent.putExtra("vehReciptNo", m12.f26897d.getText().toString());
                intent.putExtra("stateCode", this.f7738e.u1());
                intent.putExtra("inputType", this.f7738e.H);
                this.f7738e.startActivity(intent);
                return;
            }
            CheckPostReceiptStatus checkPostReceiptStatus = this.f7738e;
            checkPostReceiptStatus.J1(checkPostReceiptStatus.r1().b("record_error_msg", this.f7738e.getString(R.string.service_unavable_please_try)));
            this.f7738e.q1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckPostReceiptDetailNew) obj);
            return x.f30437a;
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7739e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CheckPostReceiptStatus checkPostReceiptStatus) {
            super(1);
            this.f7739e = checkPostReceiptStatus;
        }

        public final void b(CheckPostReceiptDetailNew checkPostReceiptDetailNew) {
            if (checkPostReceiptDetailNew.size() > 0) {
                this.f7739e.q1().dismiss();
                Intent intent = new Intent(this.f7739e, CheckPostSearchList.class);
                j0 m12 = this.f7739e.G;
                if (m12 == null) {
                    l.v("binding");
                    m12 = null;
                }
                intent.putExtra("vehReciptNo", m12.f26895b.getText().toString());
                intent.putExtra("stateCode", this.f7739e.u1());
                intent.putExtra("inputType", this.f7739e.H);
                this.f7739e.startActivity(intent);
                return;
            }
            CheckPostReceiptStatus checkPostReceiptStatus = this.f7739e;
            checkPostReceiptStatus.J1(checkPostReceiptStatus.r1().b("record_error_msg", this.f7739e.getString(R.string.service_unavable_please_try)));
            this.f7739e.q1().dismiss();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((CheckPostReceiptDetailNew) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7740e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(CheckPostReceiptStatus checkPostReceiptStatus) {
            super(1);
            this.f7740e = checkPostReceiptStatus;
        }

        public final void b(String str) {
            Log.e("ErrorCheck", str);
            if (this.f7740e.q1().isShowing()) {
                this.f7740e.q1().dismiss();
                this.f7740e.J1("Record Not Available");
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckPostReceiptStatus f7741e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CheckPostReceiptStatus checkPostReceiptStatus) {
            super(1);
            this.f7741e = checkPostReceiptStatus;
        }

        public final void b(String str) {
            Log.e("ErrorCheck", str);
            if (this.f7741e.q1().isShowing()) {
                this.f7741e.q1().dismiss();
                CheckPostReceiptStatus checkPostReceiptStatus = this.f7741e;
                checkPostReceiptStatus.J1(checkPostReceiptStatus.r1().b("record_error_msg", this.f7741e.getString(R.string.service_unavable_please_try)));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class g implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f7742a;

        g(bm.l lVar) {
            l.f(lVar, "function");
            this.f7742a = lVar;
        }

        public final pl.c a() {
            return this.f7742a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f7742a.invoke(obj);
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
    public static final void A1(CheckPostReceiptStatus checkPostReceiptStatus, View view) {
        l.f(checkPostReceiptStatus, "this$0");
        checkPostReceiptStatus.finish();
    }

    /* access modifiers changed from: private */
    public static final void B1(CheckPostReceiptStatus checkPostReceiptStatus, VahanStateModle vahanStateModle) {
        l.f(checkPostReceiptStatus, "this$0");
        checkPostReceiptStatus.q1().dismiss();
        Log.e("got state", vahanStateModle.toString());
        try {
            VahanStateModleSubList vahanStateModleSubList = new VahanStateModleSubList();
            vahanStateModleSubList.clear();
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            vahanStateModleSubList.add("Select State");
            l.c(vahanStateModle);
            vahanStateModle.add(0, vahanStateModleSubList);
            og.b0 b0Var = new og.b0(checkPostReceiptStatus, vahanStateModle);
            j0 j0Var = checkPostReceiptStatus.G;
            if (j0Var == null) {
                l.v("binding");
                j0Var = null;
            }
            j0Var.f26900g.setAdapter(b0Var);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void J1(String str) {
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.exit_app_diloge);
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
        View findViewById3 = dialog.findViewById(R.id.cancle);
        l.d(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) findViewById3;
        textView2.setVisibility(8);
        textView.setText(r1().b("btn_ok", getString(R.string.ok_txt)));
        textView.setBackground(androidx.core.content.a.e(this, R.drawable.shape_red));
        textView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ((TextView) findViewById).setText(str);
        textView.setOnClickListener(new z8.g(dialog));
        textView2.setOnClickListener(new z8.h(dialog));
        dialog.show();
    }

    /* access modifiers changed from: private */
    public static final void K1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void L1(Dialog dialog, View view) {
        l.f(dialog, "$d");
        dialog.dismiss();
    }

    private final boolean M1() {
        j0 j0Var = null;
        if (l.a(this.H, "Vehicle")) {
            j0 j0Var2 = this.G;
            if (j0Var2 == null) {
                l.v("binding");
                j0Var2 = null;
            }
            if (j0Var2.f26900g.getSelectedItemPosition() == 0) {
                Toast.makeText(this, r1().b("label_log_sel_state", getString(R.string.please_selecr_State)), 0).show();
                return true;
            }
            j0 j0Var3 = this.G;
            if (j0Var3 == null) {
                l.v("binding");
                j0Var3 = null;
            }
            if (j0Var3.f26895b.length() < 3) {
                j0 j0Var4 = this.G;
                if (j0Var4 == null) {
                    l.v("binding");
                    j0Var4 = null;
                }
                j0Var4.f26895b.setError(r1().b("enter_vehicle_no", getString(R.string.enter_rc_no_for_pending_transaction)));
                j0 j0Var5 = this.G;
                if (j0Var5 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var5;
                }
                j0Var.f26895b.requestFocus();
                return true;
            }
            j0 j0Var6 = this.G;
            if (j0Var6 == null) {
                l.v("binding");
                j0Var6 = null;
            }
            Editable text = j0Var6.f26895b.getText();
            l.e(text, "getText(...)");
            if (!new km.f("[a-zA-Z0-9]*").a(text)) {
                j0 j0Var7 = this.G;
                if (j0Var7 == null) {
                    l.v("binding");
                    j0Var7 = null;
                }
                j0Var7.f26897d.setError(r1().b("label_challan_invalid_vehicle_no", getString(R.string.invalid_rc_no)));
                j0 j0Var8 = this.G;
                if (j0Var8 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var8;
                }
                j0Var.f26897d.requestFocus();
                return true;
            }
            j0 j0Var9 = this.G;
            if (j0Var9 == null) {
                l.v("binding");
                j0Var9 = null;
            }
            if (j0Var9.f26895b.getText().toString().length() < 5) {
                j0 j0Var10 = this.G;
                if (j0Var10 == null) {
                    l.v("binding");
                    j0Var10 = null;
                }
                j0Var10.f26895b.setError(r1().b("label_challan_valid_chassis_no", "Please enter the valid last 5 digit of chassis no."));
                j0 j0Var11 = this.G;
                if (j0Var11 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var11;
                }
                j0Var.f26895b.requestFocus();
                return true;
            }
        } else if (l.a(this.H, "Receipt")) {
            j0 j0Var12 = this.G;
            if (j0Var12 == null) {
                l.v("binding");
                j0Var12 = null;
            }
            if (j0Var12.f26897d.getText().length() == 0) {
                j0 j0Var13 = this.G;
                if (j0Var13 == null) {
                    l.v("binding");
                    j0Var13 = null;
                }
                j0Var13.f26897d.setError(r1().b("pls_enter_FancyRecpNo", getString(R.string.please_enter_rcpt_no)));
                j0 j0Var14 = this.G;
                if (j0Var14 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var14;
                }
                j0Var.f26897d.requestFocus();
                return true;
            }
            j0 j0Var15 = this.G;
            if (j0Var15 == null) {
                l.v("binding");
                j0Var15 = null;
            }
            if (j0Var15.f26897d.getText().length() < 5) {
                j0 j0Var16 = this.G;
                if (j0Var16 == null) {
                    l.v("binding");
                    j0Var16 = null;
                }
                j0Var16.f26897d.setError(r1().b("please_enter_rcpt_no5_char", getString(R.string.please_enter5_char_rcpt_no)));
                j0 j0Var17 = this.G;
                if (j0Var17 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var17;
                }
                j0Var.f26897d.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void w1() {
        F1(CheckPostService.f7743a.b(this));
        C1((c9.a) new u0((x0) this, (u0.b) new b9.c(new b9.a(s1()))).a(c9.a.class));
        j0 j0Var = this.G;
        j0 j0Var2 = null;
        if (j0Var == null) {
            l.v("binding");
            j0Var = null;
        }
        j0Var.f26898e.setOnClickListener(new z8.d(this));
        j0 j0Var3 = this.G;
        if (j0Var3 == null) {
            l.v("binding");
            j0Var3 = null;
        }
        j0Var3.f26907n.setOnClickListener(new z8.e(this));
        j0 j0Var4 = this.G;
        if (j0Var4 == null) {
            l.v("binding");
            j0Var4 = null;
        }
        j0Var4.f26896c.setOnClickListener(new z8.f(this));
        j0 j0Var5 = this.G;
        if (j0Var5 == null) {
            l.v("binding");
        } else {
            j0Var2 = j0Var5;
        }
        j0Var2.f26897d.addTextChangedListener(new a(this));
    }

    /* access modifiers changed from: private */
    public static final void x1(CheckPostReceiptStatus checkPostReceiptStatus, View view) {
        l.f(checkPostReceiptStatus, "this$0");
        j0 j0Var = checkPostReceiptStatus.G;
        j0 j0Var2 = null;
        if (j0Var == null) {
            l.v("binding");
            j0Var = null;
        }
        if (!j0Var.f26898e.isSelected()) {
            j0 j0Var3 = checkPostReceiptStatus.G;
            if (j0Var3 == null) {
                l.v("binding");
                j0Var3 = null;
            }
            j0Var3.f26898e.setChecked(true);
            j0 j0Var4 = checkPostReceiptStatus.G;
            if (j0Var4 == null) {
                l.v("binding");
                j0Var4 = null;
            }
            j0Var4.f26898e.setSelected(true);
            j0 j0Var5 = checkPostReceiptStatus.G;
            if (j0Var5 == null) {
                l.v("binding");
                j0Var5 = null;
            }
            j0Var5.f26907n.setChecked(false);
            j0 j0Var6 = checkPostReceiptStatus.G;
            if (j0Var6 == null) {
                l.v("binding");
                j0Var6 = null;
            }
            j0Var6.f26907n.setSelected(false);
            j0 j0Var7 = checkPostReceiptStatus.G;
            if (j0Var7 == null) {
                l.v("binding");
                j0Var7 = null;
            }
            j0Var7.f26899f.setBackgroundResource(R.drawable.corner_circle_14_selected);
            j0 j0Var8 = checkPostReceiptStatus.G;
            if (j0Var8 == null) {
                l.v("binding");
                j0Var8 = null;
            }
            j0Var8.f26906m.setBackgroundResource(R.drawable.corner_circle_bg_14);
            j0 j0Var9 = checkPostReceiptStatus.G;
            if (j0Var9 == null) {
                l.v("binding");
                j0Var9 = null;
            }
            Editable text = j0Var9.f26897d.getText();
            if (text != null) {
                text.clear();
            }
            j0 j0Var10 = checkPostReceiptStatus.G;
            if (j0Var10 == null) {
                l.v("binding");
                j0Var10 = null;
            }
            j0Var10.f26897d.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(15)});
            j0 j0Var11 = checkPostReceiptStatus.G;
            if (j0Var11 == null) {
                l.v("binding");
                j0Var11 = null;
            }
            j0Var11.f26897d.setVisibility(0);
            checkPostReceiptStatus.H = "Receipt";
            j0 j0Var12 = checkPostReceiptStatus.G;
            if (j0Var12 == null) {
                l.v("binding");
                j0Var12 = null;
            }
            j0Var12.f26897d.setHint(checkPostReceiptStatus.r1().b("enter_FancyRecpNo", checkPostReceiptStatus.getString(R.string.enter_receipt_number)));
            j0 j0Var13 = checkPostReceiptStatus.G;
            if (j0Var13 == null) {
                l.v("binding");
                j0Var13 = null;
            }
            j0Var13.f26897d.setError((CharSequence) null);
            j0 j0Var14 = checkPostReceiptStatus.G;
            if (j0Var14 == null) {
                l.v("binding");
            } else {
                j0Var2 = j0Var14;
            }
            j0Var2.f26905l.setVisibility(8);
            return;
        }
        checkPostReceiptStatus.H = "";
        j0 j0Var15 = checkPostReceiptStatus.G;
        if (j0Var15 == null) {
            l.v("binding");
            j0Var15 = null;
        }
        j0Var15.f26898e.setChecked(false);
        j0 j0Var16 = checkPostReceiptStatus.G;
        if (j0Var16 == null) {
            l.v("binding");
            j0Var16 = null;
        }
        j0Var16.f26898e.setSelected(false);
        j0 j0Var17 = checkPostReceiptStatus.G;
        if (j0Var17 == null) {
            l.v("binding");
        } else {
            j0Var2 = j0Var17;
        }
        j0Var2.f26899f.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void y1(CheckPostReceiptStatus checkPostReceiptStatus, View view) {
        l.f(checkPostReceiptStatus, "this$0");
        j0 j0Var = checkPostReceiptStatus.G;
        j0 j0Var2 = null;
        if (j0Var == null) {
            l.v("binding");
            j0Var = null;
        }
        if (!j0Var.f26907n.isSelected()) {
            j0 j0Var3 = checkPostReceiptStatus.G;
            if (j0Var3 == null) {
                l.v("binding");
                j0Var3 = null;
            }
            j0Var3.f26898e.setChecked(false);
            j0 j0Var4 = checkPostReceiptStatus.G;
            if (j0Var4 == null) {
                l.v("binding");
                j0Var4 = null;
            }
            j0Var4.f26898e.setSelected(false);
            j0 j0Var5 = checkPostReceiptStatus.G;
            if (j0Var5 == null) {
                l.v("binding");
                j0Var5 = null;
            }
            j0Var5.f26907n.setChecked(true);
            j0 j0Var6 = checkPostReceiptStatus.G;
            if (j0Var6 == null) {
                l.v("binding");
                j0Var6 = null;
            }
            j0Var6.f26907n.setSelected(true);
            j0 j0Var7 = checkPostReceiptStatus.G;
            if (j0Var7 == null) {
                l.v("binding");
                j0Var7 = null;
            }
            j0Var7.f26899f.setBackgroundResource(R.drawable.corner_circle_bg_14);
            j0 j0Var8 = checkPostReceiptStatus.G;
            if (j0Var8 == null) {
                l.v("binding");
                j0Var8 = null;
            }
            j0Var8.f26906m.setBackgroundResource(R.drawable.corner_circle_14_selected);
            j0 j0Var9 = checkPostReceiptStatus.G;
            if (j0Var9 == null) {
                l.v("binding");
                j0Var9 = null;
            }
            Editable text = j0Var9.f26897d.getText();
            if (text != null) {
                text.clear();
            }
            j0 j0Var10 = checkPostReceiptStatus.G;
            if (j0Var10 == null) {
                l.v("binding");
                j0Var10 = null;
            }
            j0Var10.f26897d.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            j0 j0Var11 = checkPostReceiptStatus.G;
            if (j0Var11 == null) {
                l.v("binding");
                j0Var11 = null;
            }
            j0Var11.f26897d.setHint(checkPostReceiptStatus.getString(R.string.enter_vehicle_number));
            checkPostReceiptStatus.H = "Vehicle";
            j0 j0Var12 = checkPostReceiptStatus.G;
            if (j0Var12 == null) {
                l.v("binding");
                j0Var12 = null;
            }
            j0Var12.f26897d.setError((CharSequence) null);
            j0 j0Var13 = checkPostReceiptStatus.G;
            if (j0Var13 == null) {
                l.v("binding");
                j0Var13 = null;
            }
            j0Var13.f26905l.setVisibility(0);
            j0 j0Var14 = checkPostReceiptStatus.G;
            if (j0Var14 == null) {
                l.v("binding");
                j0Var14 = null;
            }
            j0Var14.f26897d.setVisibility(8);
            j0 j0Var15 = checkPostReceiptStatus.G;
            if (j0Var15 == null) {
                l.v("binding");
            } else {
                j0Var2 = j0Var15;
            }
            j0Var2.f26896c.setClickable(true);
            Log.e("butvehicle", checkPostReceiptStatus.H + "selected");
            return;
        }
        checkPostReceiptStatus.H = "";
        j0 j0Var16 = checkPostReceiptStatus.G;
        if (j0Var16 == null) {
            l.v("binding");
            j0Var16 = null;
        }
        j0Var16.f26907n.setChecked(false);
        j0 j0Var17 = checkPostReceiptStatus.G;
        if (j0Var17 == null) {
            l.v("binding");
            j0Var17 = null;
        }
        j0Var17.f26907n.setSelected(false);
        j0 j0Var18 = checkPostReceiptStatus.G;
        if (j0Var18 == null) {
            l.v("binding");
        } else {
            j0Var2 = j0Var18;
        }
        j0Var2.f26906m.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void z1(CheckPostReceiptStatus checkPostReceiptStatus, View view) {
        l.f(checkPostReceiptStatus, "this$0");
        if (!checkPostReceiptStatus.M1() && com.nic.mparivahan.dlservices.utilities.d.d(checkPostReceiptStatus.H)) {
            j0 j0Var = null;
            if (l.a(checkPostReceiptStatus.H, "Vehicle")) {
                checkPostReceiptStatus.q1().show();
                c9.a p12 = checkPostReceiptStatus.p1();
                String str = checkPostReceiptStatus.N;
                j0 j0Var2 = checkPostReceiptStatus.G;
                if (j0Var2 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var2;
                }
                p12.l(str, q.B0(j0Var.f26895b.getText().toString()).toString());
            } else if (l.a(checkPostReceiptStatus.H, "Receipt")) {
                checkPostReceiptStatus.q1().show();
                c9.a p13 = checkPostReceiptStatus.p1();
                j0 j0Var3 = checkPostReceiptStatus.G;
                if (j0Var3 == null) {
                    l.v("binding");
                } else {
                    j0Var = j0Var3;
                }
                p13.k(q.B0(j0Var.f26897d.getText().toString()).toString());
            }
        } else if (l.a(checkPostReceiptStatus.H, "")) {
            checkPostReceiptStatus.J1(checkPostReceiptStatus.r1().b("label_challan_please_select_one_search_type", "Please select one search type"));
        }
    }

    public final void C1(c9.a aVar) {
        l.f(aVar, "<set-?>");
        this.J = aVar;
    }

    public final void D1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.O = progressDialog;
    }

    public final void E1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.I = cVar;
    }

    public final void F1(CheckPostService checkPostService) {
        l.f(checkPostService, "<set-?>");
        this.K = checkPostService;
    }

    public final void G1(VahanProService vahanProService) {
        l.f(vahanProService, "<set-?>");
        this.M = vahanProService;
    }

    public final void H1(String str) {
        l.f(str, "<set-?>");
        this.N = str;
    }

    public final void I1(h hVar) {
        l.f(hVar, "<set-?>");
        this.L = hVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j0 c10 = j0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        j0 j0Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        E1(new ld.c(this));
        G1(VahanProService.f21196b.b(this));
        e.a aVar = v9.e.f17509a;
        j0 j0Var2 = this.G;
        if (j0Var2 == null) {
            l.v("binding");
            j0Var2 = null;
        }
        aVar.W(this, j0Var2);
        D1(new ProgressDialog(this));
        q1().setMessage(r1().b("label_challan_please_wait", "Please wait..."));
        q1().setCancelable(false);
        q1().setCanceledOnTouchOutside(false);
        I1((h) new u0((x0) this, (u0.b) new bi.g(new wg.d(t1()))).a(h.class));
        w1();
        j0 j0Var3 = this.G;
        if (j0Var3 == null) {
            l.v("binding");
            j0Var3 = null;
        }
        j0Var3.f26904k.f28305f.setOnClickListener(new z8.b(this));
        try {
            q1().show();
            v1().V0(this);
        } catch (Exception unused) {
        }
        v1().U0().g(this, new z8.c(this));
        j0 j0Var4 = this.G;
        if (j0Var4 == null) {
            l.v("binding");
        } else {
            j0Var = j0Var4;
        }
        Spinner spinner = j0Var.f26900g;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(new b(this));
        }
        p1().g().g(this, new g(new c(this)));
        p1().i().g(this, new g(new d(this)));
        p1().h().g(this, new g(new e(this)));
        p1().j().g(this, new g(new f(this)));
    }

    public final c9.a p1() {
        c9.a aVar = this.J;
        if (aVar != null) {
            return aVar;
        }
        l.v("checkpostViewModel");
        return null;
    }

    public final ProgressDialog q1() {
        ProgressDialog progressDialog = this.O;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("dialog");
        return null;
    }

    public final ld.c r1() {
        ld.c cVar = this.I;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final CheckPostService s1() {
        CheckPostService checkPostService = this.K;
        if (checkPostService != null) {
            return checkPostService;
        }
        l.v("mRcService");
        return null;
    }

    public final VahanProService t1() {
        VahanProService vahanProService = this.M;
        if (vahanProService != null) {
            return vahanProService;
        }
        l.v("retrofitService");
        return null;
    }

    public final String u1() {
        return this.N;
    }

    public final h v1() {
        h hVar = this.L;
        if (hVar != null) {
            return hVar;
        }
        l.v("viewModel");
        return null;
    }
}
