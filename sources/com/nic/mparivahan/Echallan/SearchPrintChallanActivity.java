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
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.b0;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import cb.a2;
import cb.b2;
import cb.c2;
import cb.d2;
import cb.e2;
import cb.x1;
import cb.y1;
import cb.z1;
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
import ni.d8;
import pl.x;
import v9.d;
import wc.h;

public final class SearchPrintChallanActivity extends androidx.appcompat.app.d {
    /* access modifiers changed from: private */
    public d8 G;
    /* access modifiers changed from: private */
    public String H = "RC";
    private final String I = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    public cd.c J;
    public RcService K;
    public ProgressDialog L;
    public g M;
    public DatabaseHelper N;
    public ArrayList O;
    public h P;
    private String Q = "";
    public ld.c R;
    private final TextWatcher S = new c(this);

    public static final class a implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintChallanActivity f8844e;

        a(SearchPrintChallanActivity searchPrintChallanActivity) {
            this.f8844e = searchPrintChallanActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                d8 n12 = this.f8844e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f25882d.setError((CharSequence) null);
            }
        }
    }

    public static final class b implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintChallanActivity f8845e;

        b(SearchPrintChallanActivity searchPrintChallanActivity) {
            this.f8845e = searchPrintChallanActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                d8 n12 = this.f8845e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f25886h.setError((CharSequence) null);
            }
        }
    }

    public static final class c implements TextWatcher {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintChallanActivity f8846e;

        c(SearchPrintChallanActivity searchPrintChallanActivity) {
            this.f8846e = searchPrintChallanActivity;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence != null && charSequence.length() > 0) {
                d8 n12 = this.f8846e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                n12.f25890l.setError((CharSequence) null);
            }
        }
    }

    static final class d extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintChallanActivity f8847e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SearchPrintChallanActivity searchPrintChallanActivity) {
            super(1);
            this.f8847e = searchPrintChallanActivity;
        }

        public final void b(ValidateRcSuccess validateRcSuccess) {
            d.a aVar;
            SearchPrintChallanActivity searchPrintChallanActivity;
            String statusDesc;
            if (this.f8847e.s1().isShowing()) {
                this.f8847e.s1().dismiss();
            }
            int i10 = 1;
            if (p.o(validateRcSuccess.getStatusCode(), "NP001", true)) {
                Intent intent = new Intent(this.f8847e, SearchPrintChallanListActivity.class);
                d8 n12 = this.f8847e.G;
                if (n12 == null) {
                    l.v("binding");
                    n12 = null;
                }
                intent.putExtra("inputValue", n12.f25890l.getText().toString());
                intent.putExtra("inputType", this.f8847e.H);
                intent.putExtra("Service_name", this.f8847e.q1());
                this.f8847e.startActivity(intent);
                return;
            }
            if (!p.o(validateRcSuccess.getStatusCode(), "NP985", true) && !p.o(validateRcSuccess.getStatusCode(), "NR005", true)) {
                if (validateRcSuccess.getStatusCode().equals("NR090")) {
                    aVar = v9.d.f17494a;
                    searchPrintChallanActivity = this.f8847e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                } else if (validateRcSuccess.getStatusCode().equals("NR091")) {
                    aVar = v9.d.f17494a;
                    searchPrintChallanActivity = this.f8847e;
                    statusDesc = validateRcSuccess.getStatusDesc();
                    i10 = 2;
                } else if (ka.c.f13158a.m(validateRcSuccess.getStatusDesc())) {
                    SearchPrintChallanActivity searchPrintChallanActivity2 = this.f8847e;
                    searchPrintChallanActivity2.S1(searchPrintChallanActivity2, searchPrintChallanActivity2.t1().b("error_msg_record_not_found", this.f8847e.getString(R.string.service_unavable_please_try)));
                    return;
                }
                aVar.D(searchPrintChallanActivity, statusDesc, i10);
                return;
            }
            SearchPrintChallanActivity searchPrintChallanActivity3 = this.f8847e;
            searchPrintChallanActivity3.S1(searchPrintChallanActivity3, validateRcSuccess.getStatusDesc());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((ValidateRcSuccess) obj);
            return x.f30437a;
        }
    }

    static final class e extends m implements bm.l {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ SearchPrintChallanActivity f8848e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(SearchPrintChallanActivity searchPrintChallanActivity) {
            super(1);
            this.f8848e = searchPrintChallanActivity;
        }

        public final void b(String str) {
            if (this.f8848e.s1().isShowing()) {
                this.f8848e.s1().dismiss();
            }
            SearchPrintChallanActivity searchPrintChallanActivity = this.f8848e;
            searchPrintChallanActivity.S1(searchPrintChallanActivity, searchPrintChallanActivity.t1().b("error_msg_record_not_found", this.f8848e.getString(R.string.service_unavable_please_try)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((String) obj);
            return x.f30437a;
        }
    }

    static final class f implements b0, cm.h {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ bm.l f8849a;

        f(bm.l lVar) {
            l.f(lVar, "function");
            this.f8849a = lVar;
        }

        public final pl.c a() {
            return this.f8849a;
        }

        public final /* synthetic */ void b(Object obj) {
            this.f8849a.invoke(obj);
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
    public static final void A1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        searchPrintChallanActivity.H1();
    }

    /* access modifiers changed from: private */
    public static final void B1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        d8 d8Var = searchPrintChallanActivity.G;
        d8 d8Var2 = null;
        if (d8Var == null) {
            l.v("binding");
            d8Var = null;
        }
        if (!d8Var.f25881c.isSelected()) {
            d8 d8Var3 = searchPrintChallanActivity.G;
            if (d8Var3 == null) {
                l.v("binding");
                d8Var3 = null;
            }
            d8Var3.f25894p.setVisibility(8);
            d8 d8Var4 = searchPrintChallanActivity.G;
            if (d8Var4 == null) {
                l.v("binding");
                d8Var4 = null;
            }
            d8Var4.A.setVisibility(8);
            d8 d8Var5 = searchPrintChallanActivity.G;
            if (d8Var5 == null) {
                l.v("binding");
                d8Var5 = null;
            }
            d8Var5.f25904z.setVisibility(8);
            d8 d8Var6 = searchPrintChallanActivity.G;
            if (d8Var6 == null) {
                l.v("binding");
                d8Var6 = null;
            }
            d8Var6.f25881c.setChecked(true);
            d8 d8Var7 = searchPrintChallanActivity.G;
            if (d8Var7 == null) {
                l.v("binding");
                d8Var7 = null;
            }
            d8Var7.f25881c.setSelected(true);
            d8 d8Var8 = searchPrintChallanActivity.G;
            if (d8Var8 == null) {
                l.v("binding");
                d8Var8 = null;
            }
            d8Var8.f25880b.setBackgroundResource(R.drawable.corner_circle_14_selected);
            d8 d8Var9 = searchPrintChallanActivity.G;
            if (d8Var9 == null) {
                l.v("binding");
                d8Var9 = null;
            }
            d8Var9.f25902x.setChecked(false);
            d8 d8Var10 = searchPrintChallanActivity.G;
            if (d8Var10 == null) {
                l.v("binding");
                d8Var10 = null;
            }
            d8Var10.f25902x.setSelected(false);
            d8 d8Var11 = searchPrintChallanActivity.G;
            if (d8Var11 == null) {
                l.v("binding");
                d8Var11 = null;
            }
            d8Var11.f25901w.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var12 = searchPrintChallanActivity.G;
            if (d8Var12 == null) {
                l.v("binding");
                d8Var12 = null;
            }
            d8Var12.f25883e.setChecked(false);
            d8 d8Var13 = searchPrintChallanActivity.G;
            if (d8Var13 == null) {
                l.v("binding");
                d8Var13 = null;
            }
            d8Var13.f25883e.setSelected(false);
            d8 d8Var14 = searchPrintChallanActivity.G;
            if (d8Var14 == null) {
                l.v("binding");
                d8Var14 = null;
            }
            d8Var14.f25900v.setVisibility(8);
            d8 d8Var15 = searchPrintChallanActivity.G;
            if (d8Var15 == null) {
                l.v("binding");
                d8Var15 = null;
            }
            d8Var15.f25885g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var16 = searchPrintChallanActivity.G;
            if (d8Var16 == null) {
                l.v("binding");
                d8Var16 = null;
            }
            Editable text = d8Var16.f25890l.getText();
            if (text != null) {
                text.clear();
            }
            d8 d8Var17 = searchPrintChallanActivity.G;
            if (d8Var17 == null) {
                l.v("binding");
                d8Var17 = null;
            }
            d8Var17.f25890l.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(30)});
            d8 d8Var18 = searchPrintChallanActivity.G;
            if (d8Var18 == null) {
                l.v("binding");
                d8Var18 = null;
            }
            d8Var18.f25890l.setHint(searchPrintChallanActivity.t1().b("label_challan_enter_challan_no", searchPrintChallanActivity.getString(R.string.enter_challan_no)));
            searchPrintChallanActivity.H = "Challan";
            d8 d8Var19 = searchPrintChallanActivity.G;
            if (d8Var19 == null) {
                l.v("binding");
                d8Var19 = null;
            }
            d8Var19.f25890l.setError((CharSequence) null);
            return;
        }
        searchPrintChallanActivity.H = "";
        d8 d8Var20 = searchPrintChallanActivity.G;
        if (d8Var20 == null) {
            l.v("binding");
            d8Var20 = null;
        }
        d8Var20.f25881c.setChecked(false);
        d8 d8Var21 = searchPrintChallanActivity.G;
        if (d8Var21 == null) {
            l.v("binding");
            d8Var21 = null;
        }
        d8Var21.f25881c.setSelected(false);
        d8 d8Var22 = searchPrintChallanActivity.G;
        if (d8Var22 == null) {
            l.v("binding");
        } else {
            d8Var2 = d8Var22;
        }
        d8Var2.f25880b.setBackgroundResource(R.drawable.corner_circle_bg_14);
    }

    /* access modifiers changed from: private */
    public static final void C1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        d8 d8Var = searchPrintChallanActivity.G;
        d8 d8Var2 = null;
        if (d8Var == null) {
            l.v("binding");
            d8Var = null;
        }
        if (!d8Var.f25902x.isSelected()) {
            d8 d8Var3 = searchPrintChallanActivity.G;
            if (d8Var3 == null) {
                l.v("binding");
                d8Var3 = null;
            }
            d8Var3.f25881c.setChecked(false);
            d8 d8Var4 = searchPrintChallanActivity.G;
            if (d8Var4 == null) {
                l.v("binding");
                d8Var4 = null;
            }
            d8Var4.f25881c.setSelected(false);
            d8 d8Var5 = searchPrintChallanActivity.G;
            if (d8Var5 == null) {
                l.v("binding");
                d8Var5 = null;
            }
            d8Var5.f25880b.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var6 = searchPrintChallanActivity.G;
            if (d8Var6 == null) {
                l.v("binding");
                d8Var6 = null;
            }
            d8Var6.f25902x.setChecked(true);
            d8 d8Var7 = searchPrintChallanActivity.G;
            if (d8Var7 == null) {
                l.v("binding");
                d8Var7 = null;
            }
            d8Var7.f25902x.setSelected(true);
            d8 d8Var8 = searchPrintChallanActivity.G;
            if (d8Var8 == null) {
                l.v("binding");
                d8Var8 = null;
            }
            d8Var8.f25901w.setBackgroundResource(R.drawable.corner_circle_14_selected);
            d8 d8Var9 = searchPrintChallanActivity.G;
            if (d8Var9 == null) {
                l.v("binding");
                d8Var9 = null;
            }
            d8Var9.f25883e.setChecked(false);
            d8 d8Var10 = searchPrintChallanActivity.G;
            if (d8Var10 == null) {
                l.v("binding");
                d8Var10 = null;
            }
            d8Var10.f25883e.setSelected(false);
            d8 d8Var11 = searchPrintChallanActivity.G;
            if (d8Var11 == null) {
                l.v("binding");
                d8Var11 = null;
            }
            d8Var11.f25885g.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var12 = searchPrintChallanActivity.G;
            if (d8Var12 == null) {
                l.v("binding");
                d8Var12 = null;
            }
            Editable text = d8Var12.f25890l.getText();
            if (text != null) {
                text.clear();
            }
            d8 d8Var13 = searchPrintChallanActivity.G;
            if (d8Var13 == null) {
                l.v("binding");
                d8Var13 = null;
            }
            d8Var13.f25890l.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
            d8 d8Var14 = searchPrintChallanActivity.G;
            if (d8Var14 == null) {
                l.v("binding");
                d8Var14 = null;
            }
            d8Var14.f25890l.setHint(searchPrintChallanActivity.t1().b("label_challan_enter_vehicle_no", searchPrintChallanActivity.getString(R.string.enter_vehicle_number)));
            searchPrintChallanActivity.H = "RC";
            d8 d8Var15 = searchPrintChallanActivity.G;
            if (d8Var15 == null) {
                l.v("binding");
                d8Var15 = null;
            }
            d8Var15.f25900v.setVisibility(0);
            d8 d8Var16 = searchPrintChallanActivity.G;
            if (d8Var16 == null) {
                l.v("binding");
                d8Var16 = null;
            }
            d8Var16.f25890l.setError((CharSequence) null);
            d8 d8Var17 = searchPrintChallanActivity.G;
            if (d8Var17 == null) {
                l.v("binding");
                d8Var17 = null;
            }
            d8Var17.f25900v.setVisibility(0);
            d8 d8Var18 = searchPrintChallanActivity.G;
            if (d8Var18 == null) {
                l.v("binding");
            } else {
                d8Var2 = d8Var18;
            }
            d8Var2.f25904z.setVisibility(8);
            searchPrintChallanActivity.Q1();
            return;
        }
        d8 d8Var19 = searchPrintChallanActivity.G;
        if (d8Var19 == null) {
            l.v("binding");
            d8Var19 = null;
        }
        d8Var19.f25900v.setVisibility(8);
        searchPrintChallanActivity.H = "";
        d8 d8Var20 = searchPrintChallanActivity.G;
        if (d8Var20 == null) {
            l.v("binding");
            d8Var20 = null;
        }
        d8Var20.f25902x.setChecked(false);
        d8 d8Var21 = searchPrintChallanActivity.G;
        if (d8Var21 == null) {
            l.v("binding");
            d8Var21 = null;
        }
        d8Var21.f25902x.setSelected(false);
        d8 d8Var22 = searchPrintChallanActivity.G;
        if (d8Var22 == null) {
            l.v("binding");
            d8Var22 = null;
        }
        d8Var22.f25901w.setBackgroundResource(R.drawable.corner_circle_bg_14);
        d8 d8Var23 = searchPrintChallanActivity.G;
        if (d8Var23 == null) {
            l.v("binding");
            d8Var23 = null;
        }
        d8Var23.f25894p.setVisibility(8);
        d8 d8Var24 = searchPrintChallanActivity.G;
        if (d8Var24 == null) {
            l.v("binding");
        } else {
            d8Var2 = d8Var24;
        }
        d8Var2.A.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void D1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        d8 d8Var = searchPrintChallanActivity.G;
        d8 d8Var2 = null;
        if (d8Var == null) {
            l.v("binding");
            d8Var = null;
        }
        if (!d8Var.f25883e.isSelected()) {
            d8 d8Var3 = searchPrintChallanActivity.G;
            if (d8Var3 == null) {
                l.v("binding");
                d8Var3 = null;
            }
            d8Var3.f25894p.setVisibility(8);
            d8 d8Var4 = searchPrintChallanActivity.G;
            if (d8Var4 == null) {
                l.v("binding");
                d8Var4 = null;
            }
            d8Var4.A.setVisibility(8);
            d8 d8Var5 = searchPrintChallanActivity.G;
            if (d8Var5 == null) {
                l.v("binding");
                d8Var5 = null;
            }
            d8Var5.f25881c.setChecked(false);
            d8 d8Var6 = searchPrintChallanActivity.G;
            if (d8Var6 == null) {
                l.v("binding");
                d8Var6 = null;
            }
            d8Var6.f25881c.setSelected(false);
            d8 d8Var7 = searchPrintChallanActivity.G;
            if (d8Var7 == null) {
                l.v("binding");
                d8Var7 = null;
            }
            d8Var7.f25880b.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var8 = searchPrintChallanActivity.G;
            if (d8Var8 == null) {
                l.v("binding");
                d8Var8 = null;
            }
            d8Var8.f25902x.setChecked(false);
            d8 d8Var9 = searchPrintChallanActivity.G;
            if (d8Var9 == null) {
                l.v("binding");
                d8Var9 = null;
            }
            d8Var9.f25902x.setSelected(false);
            d8 d8Var10 = searchPrintChallanActivity.G;
            if (d8Var10 == null) {
                l.v("binding");
                d8Var10 = null;
            }
            d8Var10.f25901w.setBackgroundResource(R.drawable.corner_circle_bg_14);
            d8 d8Var11 = searchPrintChallanActivity.G;
            if (d8Var11 == null) {
                l.v("binding");
                d8Var11 = null;
            }
            d8Var11.f25883e.setChecked(true);
            d8 d8Var12 = searchPrintChallanActivity.G;
            if (d8Var12 == null) {
                l.v("binding");
                d8Var12 = null;
            }
            d8Var12.f25883e.setSelected(true);
            d8 d8Var13 = searchPrintChallanActivity.G;
            if (d8Var13 == null) {
                l.v("binding");
                d8Var13 = null;
            }
            d8Var13.f25900v.setVisibility(8);
            d8 d8Var14 = searchPrintChallanActivity.G;
            if (d8Var14 == null) {
                l.v("binding");
                d8Var14 = null;
            }
            d8Var14.f25885g.setBackgroundResource(R.drawable.corner_circle_14_selected);
            d8 d8Var15 = searchPrintChallanActivity.G;
            if (d8Var15 == null) {
                l.v("binding");
                d8Var15 = null;
            }
            Editable text = d8Var15.f25890l.getText();
            if (text != null) {
                text.clear();
            }
            d8 d8Var16 = searchPrintChallanActivity.G;
            if (d8Var16 == null) {
                l.v("binding");
                d8Var16 = null;
            }
            d8Var16.f25890l.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(16)});
            d8 d8Var17 = searchPrintChallanActivity.G;
            if (d8Var17 == null) {
                l.v("binding");
                d8Var17 = null;
            }
            d8Var17.f25890l.setHint(searchPrintChallanActivity.t1().b("label_challan_enter_dl_no", searchPrintChallanActivity.getString(R.string.enter_dl_number)));
            searchPrintChallanActivity.H = "DL";
            d8 d8Var18 = searchPrintChallanActivity.G;
            if (d8Var18 == null) {
                l.v("binding");
                d8Var18 = null;
            }
            d8Var18.f25890l.setError((CharSequence) null);
            d8 d8Var19 = searchPrintChallanActivity.G;
            if (d8Var19 == null) {
                l.v("binding");
            } else {
                d8Var2 = d8Var19;
            }
            d8Var2.f25900v.setVisibility(8);
            searchPrintChallanActivity.R1();
            return;
        }
        searchPrintChallanActivity.H = "";
        d8 d8Var20 = searchPrintChallanActivity.G;
        if (d8Var20 == null) {
            l.v("binding");
            d8Var20 = null;
        }
        d8Var20.f25883e.setChecked(false);
        d8 d8Var21 = searchPrintChallanActivity.G;
        if (d8Var21 == null) {
            l.v("binding");
            d8Var21 = null;
        }
        d8Var21.f25883e.setSelected(false);
        d8 d8Var22 = searchPrintChallanActivity.G;
        if (d8Var22 == null) {
            l.v("binding");
            d8Var22 = null;
        }
        d8Var22.f25885g.setBackgroundResource(R.drawable.corner_circle_bg_14);
        d8 d8Var23 = searchPrintChallanActivity.G;
        if (d8Var23 == null) {
            l.v("binding");
        } else {
            d8Var2 = d8Var23;
        }
        d8Var2.f25904z.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public static final void E1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        if (searchPrintChallanActivity.U1() || !com.nic.mparivahan.dlservices.utilities.d.d(searchPrintChallanActivity.H)) {
            if (l.a(searchPrintChallanActivity.H, "")) {
                searchPrintChallanActivity.S1(searchPrintChallanActivity, searchPrintChallanActivity.t1().b("label_challan_please_select_one_search_type", "Please select one search type"));
            }
        } else if (l.a(searchPrintChallanActivity.H, "RC")) {
            searchPrintChallanActivity.V1();
        } else {
            Intent intent = new Intent(searchPrintChallanActivity, SearchPrintChallanListActivity.class);
            d8 d8Var = searchPrintChallanActivity.G;
            if (d8Var == null) {
                l.v("binding");
                d8Var = null;
            }
            intent.putExtra("inputValue", d8Var.f25890l.getText().toString());
            intent.putExtra("inputType", searchPrintChallanActivity.H);
            intent.putExtra("Service_name", searchPrintChallanActivity.Q);
            searchPrintChallanActivity.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public static final void F1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        Intent intent = new Intent(searchPrintChallanActivity, SearchPrintChallanListActivity.class);
        d8 d8Var = searchPrintChallanActivity.G;
        if (d8Var == null) {
            l.v("binding");
            d8Var = null;
        }
        intent.putExtra("inputValue", d8Var.f25893o.getText().toString());
        intent.putExtra("inputType", "DL");
        intent.putExtra("Service_name", searchPrintChallanActivity.Q);
        searchPrintChallanActivity.startActivity(intent);
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

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0280, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a5, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008b, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e9, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0114, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x014a, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0174, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019e, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cf, code lost:
        if (r0 == null) goto L_0x008d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean U1() {
        /*
            r8 = this;
            ni.d8 r0 = r8.G
            r1 = 0
            java.lang.String r2 = "binding"
            if (r0 != 0) goto L_0x000b
            cm.l.v(r2)
            r0 = r1
        L_0x000b:
            android.widget.EditText r0 = r0.f25890l
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = km.q.B0(r0)
            java.lang.String r0 = r0.toString()
            char[] r3 = r0.toCharArray()
            java.lang.String r4 = "this as java.lang.String).toCharArray()"
            cm.l.e(r3, r4)
            int r4 = r0.length()
            r5 = 0
            if (r4 <= 0) goto L_0x0058
            int r4 = r0.length()
            r6 = 2
            if (r4 <= r6) goto L_0x0058
            ni.d8 r4 = r8.G
            if (r4 != 0) goto L_0x003c
            cm.l.v(r2)
            r4 = r1
        L_0x003c:
            android.widget.EditText r4 = r4.f25890l
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            java.lang.CharSequence r4 = km.q.B0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.substring(r5, r6)
            java.lang.String r6 = "this as java.lang.String…ing(startIndex, endIndex)"
            cm.l.e(r4, r6)
            goto L_0x005a
        L_0x0058:
            java.lang.String r4 = ""
        L_0x005a:
            java.lang.String r6 = r8.H
            java.lang.String r7 = "Challan"
            boolean r6 = cm.l.a(r6, r7)
            r7 = 1
            if (r6 == 0) goto L_0x0118
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0098
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0073
            cm.l.v(r2)
            r0 = r1
        L_0x0073:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018723(0x7f140623, float:1.967576E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_challan_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
        L_0x008d:
            cm.l.v(r2)
            goto L_0x0092
        L_0x0091:
            r1 = r0
        L_0x0092:
            android.widget.EditText r0 = r1.f25890l
        L_0x0094:
            r0.requestFocus()
            return r7
        L_0x0098:
            boolean r3 = r8.G1(r4)
            if (r3 != 0) goto L_0x00c1
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x00a6
            cm.l.v(r2)
            r0 = r1
        L_0x00a6:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018725(0x7f140625, float:1.9675765E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_enter_first_two_char_as_state"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x00c1:
            int r3 = r0.length()
            r4 = 12
            if (r3 >= r4) goto L_0x00ec
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x00d1
            cm.l.v(r2)
            r0 = r1
        L_0x00d1:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018368(0x7f1404c0, float:1.967504E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x00ec:
            int r0 = r0.length()
            r3 = 30
            if (r0 <= r3) goto L_0x02a9
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x00fc
            cm.l.v(r2)
            r0 = r1
        L_0x00fc:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018346(0x7f1404aa, float:1.9674996E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_max_length_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0118:
            java.lang.String r4 = r8.H
            java.lang.String r6 = "RC"
            boolean r4 = cm.l.a(r4, r6)
            r6 = 10
            if (r4 == 0) goto L_0x0250
            int r4 = r0.length()
            if (r4 != 0) goto L_0x014e
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0132
            cm.l.v(r2)
            r0 = r1
        L_0x0132:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018782(0x7f14065e, float:1.967588E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_please_enter_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x014e:
            int r3 = r3.length
            if (r3 < 0) goto L_0x0178
            r4 = 4
            if (r3 >= r4) goto L_0x0178
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x015c
            cm.l.v(r2)
            r0 = r1
        L_0x015c:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018892(0x7f1406cc, float:1.9676103E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_min_char_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0178:
            int r3 = r0.length()
            if (r3 <= r6) goto L_0x01a2
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0186
            cm.l.v(r2)
            r0 = r1
        L_0x0186:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018908(0x7f1406dc, float:1.9676136E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_rc_validation"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x01a2:
            km.f r3 = new km.f
            java.lang.String r4 = "[a-zA-Z0-9]*"
            r3.<init>((java.lang.String) r4)
            boolean r0 = r3.a(r0)
            if (r0 != 0) goto L_0x01d3
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x01b7
            cm.l.v(r2)
            r0 = r1
        L_0x01b7:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018211(0x7f140423, float:1.9674722E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_invalid_vehicle_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x01d3:
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x01db
            cm.l.v(r2)
            r0 = r1
        L_0x01db:
            android.widget.EditText r0 = r0.f25882d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            r3 = 5
            if (r0 >= r3) goto L_0x0212
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x01f4
            cm.l.v(r2)
            r0 = r1
        L_0x01f4:
            android.widget.EditText r0 = r0.f25882d
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_chassis_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of chassis no."
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x020d
            cm.l.v(r2)
            goto L_0x020e
        L_0x020d:
            r1 = r0
        L_0x020e:
            android.widget.EditText r0 = r1.f25882d
            goto L_0x0094
        L_0x0212:
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x021a
            cm.l.v(r2)
            r0 = r1
        L_0x021a:
            android.widget.EditText r0 = r0.f25886h
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            if (r0 >= r3) goto L_0x02a9
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0232
            cm.l.v(r2)
            r0 = r1
        L_0x0232:
            android.widget.EditText r0 = r0.f25886h
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_valid_engine_no"
            java.lang.String r5 = "Please enter the valid last 5 digit of engine no"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x024b
            cm.l.v(r2)
            goto L_0x024c
        L_0x024b:
            r1 = r0
        L_0x024c:
            android.widget.EditText r0 = r1.f25886h
            goto L_0x0094
        L_0x0250:
            java.lang.String r3 = r8.H
            java.lang.String r4 = "DL"
            boolean r3 = cm.l.a(r3, r4)
            if (r3 == 0) goto L_0x02a9
            int r3 = r0.length()
            if (r3 != 0) goto L_0x0284
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0268
            cm.l.v(r2)
            r0 = r1
        L_0x0268:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            r4 = 2132018769(0x7f140651, float:1.9675854E38)
            java.lang.String r4 = r8.getString(r4)
            java.lang.String r5 = "label_challan_valid_dl_no"
            java.lang.String r3 = r3.b(r5, r4)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x0284:
            int r0 = r0.length()
            if (r0 >= r6) goto L_0x02a9
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0292
            cm.l.v(r2)
            r0 = r1
        L_0x0292:
            android.widget.EditText r0 = r0.f25890l
            ld.c r3 = r8.t1()
            java.lang.String r4 = "label_challan_min_char_dl_validation"
            java.lang.String r5 = "Please enter minimum 10 characters of DL number"
            java.lang.String r3 = r3.b(r4, r5)
            r0.setError(r3)
            ni.d8 r0 = r8.G
            if (r0 != 0) goto L_0x0091
            goto L_0x008d
        L_0x02a9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintChallanActivity.U1():boolean");
    }

    private final void V1() {
        s1().show();
        cd.c v12 = v1();
        d8 d8Var = this.G;
        d8 d8Var2 = null;
        if (d8Var == null) {
            l.v("binding");
            d8Var = null;
        }
        String obj = d8Var.f25890l.getText().toString();
        String str = x1().k().toString();
        d8 d8Var3 = this.G;
        if (d8Var3 == null) {
            l.v("binding");
            d8Var3 = null;
        }
        String obj2 = d8Var3.f25882d.getText().toString();
        d8 d8Var4 = this.G;
        if (d8Var4 == null) {
            l.v("binding");
        } else {
            d8Var2 = d8Var4;
        }
        v12.m(obj, str, obj2, d8Var2.f25886h.getText().toString(), this, v9.d.f17494a.k());
    }

    private final void y1() {
        d8 d8Var = null;
        try {
            if (getIntent() != null) {
                this.Q = String.valueOf(getIntent().getStringExtra("Service_name"));
                String valueOf = String.valueOf(getIntent().getStringExtra("Service_name"));
                d8 d8Var2 = this.G;
                if (d8Var2 == null) {
                    l.v("binding");
                    d8Var2 = null;
                }
                d8Var2.f25888j.f28308i.setText(t1().b("label_challan_download", valueOf));
            } else {
                d8 d8Var3 = this.G;
                if (d8Var3 == null) {
                    l.v("binding");
                    d8Var3 = null;
                }
                d8Var3.f25888j.f28308i.setText(t1().b("label_challan_print", getString(R.string.echallan_print_challan)));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        P1(new g(this));
        M1(RcService.f9484a.c(this));
        N1((cd.c) new u0((x0) this, (u0.b) new cd.d(new bd.b(u1()))).a(cd.c.class));
        d8 d8Var4 = this.G;
        if (d8Var4 == null) {
            l.v("binding");
            d8Var4 = null;
        }
        d8Var4.f25888j.f28305f.setOnClickListener(new x1(this));
        d8 d8Var5 = this.G;
        if (d8Var5 == null) {
            l.v("binding");
            d8Var5 = null;
        }
        d8Var5.f25888j.f28306g.setOnClickListener(new y1(this));
        d8 d8Var6 = this.G;
        if (d8Var6 == null) {
            l.v("binding");
            d8Var6 = null;
        }
        d8Var6.f25881c.setOnClickListener(new z1(this));
        d8 d8Var7 = this.G;
        if (d8Var7 == null) {
            l.v("binding");
            d8Var7 = null;
        }
        d8Var7.f25902x.setOnClickListener(new a2(this));
        d8 d8Var8 = this.G;
        if (d8Var8 == null) {
            l.v("binding");
            d8Var8 = null;
        }
        d8Var8.f25883e.setOnClickListener(new b2(this));
        d8 d8Var9 = this.G;
        if (d8Var9 == null) {
            l.v("binding");
            d8Var9 = null;
        }
        d8Var9.f25890l.addTextChangedListener(this.S);
        d8 d8Var10 = this.G;
        if (d8Var10 == null) {
            l.v("binding");
            d8Var10 = null;
        }
        d8Var10.f25882d.addTextChangedListener(new a(this));
        d8 d8Var11 = this.G;
        if (d8Var11 == null) {
            l.v("binding");
            d8Var11 = null;
        }
        d8Var11.f25886h.addTextChangedListener(new b(this));
        d8 d8Var12 = this.G;
        if (d8Var12 == null) {
            l.v("binding");
            d8Var12 = null;
        }
        d8Var12.f25887i.setOnClickListener(new c2(this));
        d8 d8Var13 = this.G;
        if (d8Var13 == null) {
            l.v("binding");
        } else {
            d8Var = d8Var13;
        }
        d8Var.f25903y.setOnClickListener(new d2(this));
    }

    /* access modifiers changed from: private */
    public static final void z1(SearchPrintChallanActivity searchPrintChallanActivity, View view) {
        l.f(searchPrintChallanActivity, "this$0");
        searchPrintChallanActivity.onBackPressed();
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
        this.O = arrayList;
    }

    public final void J1(DatabaseHelper databaseHelper) {
        l.f(databaseHelper, "<set-?>");
        this.N = databaseHelper;
    }

    public final void K1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.L = progressDialog;
    }

    public final void L1(ld.c cVar) {
        l.f(cVar, "<set-?>");
        this.R = cVar;
    }

    public final void M1(RcService rcService) {
        l.f(rcService, "<set-?>");
        this.K = rcService;
    }

    public final void N1(cd.c cVar) {
        l.f(cVar, "<set-?>");
        this.J = cVar;
    }

    public final void O1(h hVar) {
        l.f(hVar, "<set-?>");
        this.P = hVar;
    }

    public final void P1(g gVar) {
        l.f(gVar, "<set-?>");
        this.M = gVar;
    }

    public final void Q1() {
        ArrayList E0 = r1().E0();
        l.d(E0, "null cannot be cast to non-null type java.util.ArrayList<com.nic.mparivahan.RC.Model.Document>");
        I1(E0);
        d8 d8Var = null;
        if (p1().size() > 0) {
            d8 d8Var2 = this.G;
            if (d8Var2 == null) {
                l.v("binding");
                d8Var2 = null;
            }
            d8Var2.A.setVisibility(0);
            d8 d8Var3 = this.G;
            if (d8Var3 == null) {
                l.v("binding");
                d8Var3 = null;
            }
            d8Var3.f25894p.setVisibility(0);
            h hVar = new h(p1(), this, 3, this.Q);
            l.c(hVar);
            O1(hVar);
            d8 d8Var4 = this.G;
            if (d8Var4 == null) {
                l.v("binding");
            } else {
                d8Var = d8Var4;
            }
            d8Var.f25894p.setAdapter(w1());
            return;
        }
        d8 d8Var5 = this.G;
        if (d8Var5 == null) {
            l.v("binding");
            d8Var5 = null;
        }
        d8Var5.f25894p.setVisibility(8);
        d8 d8Var6 = this.G;
        if (d8Var6 == null) {
            l.v("binding");
        } else {
            d8Var = d8Var6;
        }
        d8Var.A.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ni.d8} */
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
            if (r0 == 0) goto L_0x00d2
            ka.c$a r0 = ka.c.f13158a     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = r6.Q     // Catch:{ Exception -> 0x0020 }
            boolean r0 = r0.m(r3)     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0035
            ni.d8 r0 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0023
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r0 = r2
            goto L_0x0023
        L_0x0020:
            r0 = move-exception
            goto L_0x00ce
        L_0x0023:
            android.widget.TextView r0 = r0.f25903y     // Catch:{ Exception -> 0x0020 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = "label_challan_download"
            java.lang.String r5 = r6.Q     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0020 }
        L_0x0031:
            r0.setText(r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x004c
        L_0x0035:
            ni.d8 r0 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x003d
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r0 = r2
        L_0x003d:
            android.widget.TextView r0 = r0.f25903y     // Catch:{ Exception -> 0x0020 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = "label_challan_print"
            java.lang.String r5 = "Print Challan"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0020 }
            goto L_0x0031
        L_0x004c:
            ni.d8 r0 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x0054
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r0 = r2
        L_0x0054:
            android.widget.TextView r0 = r0.f25899u     // Catch:{ Exception -> 0x0020 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = "label_challan_dl_no"
            java.lang.String r5 = "Driving Licence No"
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0020 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0020 }
            ni.d8 r0 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r0 != 0) goto L_0x006d
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r0 = r2
        L_0x006d:
            com.nic.mparivahan.MyTextView r0 = r0.f25892n     // Catch:{ Exception -> 0x0020 }
            ld.c r3 = r6.t1()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r4 = "label_challan_my_dl_number"
            r5 = 2132018462(0x7f14051e, float:1.9675231E38)
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = r3.b(r4, r5)     // Catch:{ Exception -> 0x0020 }
            r0.setText(r3)     // Catch:{ Exception -> 0x0020 }
            com.nic.mparivahan.DB.DatabaseHelper r0 = r6.r1()     // Catch:{ Exception -> 0x0020 }
            java.util.ArrayList r0 = r0.c0()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r3 = "getDLDetailsList(...)"
            cm.l.e(r0, r3)     // Catch:{ Exception -> 0x0020 }
            r3 = 0
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x0020 }
            com.nic.mparivahan.Dl.Model.DLDocument r4 = (com.nic.mparivahan.Dl.Model.DLDocument) r4     // Catch:{ Exception -> 0x0020 }
            com.nic.mparivahan.Dl.Model.DldetobjX r4 = r4.getDldetails()     // Catch:{ Exception -> 0x0020 }
            if (r4 == 0) goto L_0x00e2
            ni.d8 r4 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r4 != 0) goto L_0x00a5
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r4 = r2
        L_0x00a5:
            android.widget.LinearLayout r4 = r4.f25904z     // Catch:{ Exception -> 0x0020 }
            r4.setVisibility(r3)     // Catch:{ Exception -> 0x0020 }
            ni.d8 r4 = r6.G     // Catch:{ Exception -> 0x0020 }
            if (r4 != 0) goto L_0x00b2
            cm.l.v(r1)     // Catch:{ Exception -> 0x0020 }
            r4 = r2
        L_0x00b2:
            android.widget.TextView r1 = r4.f25893o     // Catch:{ Exception -> 0x0020 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0020 }
            com.nic.mparivahan.Dl.Model.DLDocument r0 = (com.nic.mparivahan.Dl.Model.DLDocument) r0     // Catch:{ Exception -> 0x0020 }
            com.nic.mparivahan.Dl.Model.DldetobjX r0 = r0.getDldetails()     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x00ca
            com.nic.mparivahan.Dl.Model.DlobjX r0 = r0.getDlobj()     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x00ca
            java.lang.String r2 = r0.getDlLicno()     // Catch:{ Exception -> 0x0020 }
        L_0x00ca:
            r1.setText(r2)     // Catch:{ Exception -> 0x0020 }
            goto L_0x00e2
        L_0x00ce:
            r0.printStackTrace()
            goto L_0x00e2
        L_0x00d2:
            ni.d8 r0 = r6.G
            if (r0 != 0) goto L_0x00da
            cm.l.v(r1)
            goto L_0x00db
        L_0x00da:
            r2 = r0
        L_0x00db:
            android.widget.LinearLayout r0 = r2.f25904z
            r1 = 8
            r0.setVisibility(r1)
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nic.mparivahan.Echallan.SearchPrintChallanActivity.R1():void");
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
        textView.setOnClickListener(new e2(dialog));
        dialog.show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d8 c10 = d8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        d8 d8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        a.C0148a aVar = fb.a.f11584a;
        d8 d8Var2 = this.G;
        if (d8Var2 == null) {
            l.v("binding");
            d8Var2 = null;
        }
        aVar.j(this, d8Var2);
        L1(new ld.c(this));
        K1(new ProgressDialog(this));
        s1().setMessage(t1().b("label_challan_please_wait", "Please wait..."));
        s1().setCancelable(false);
        s1().setCanceledOnTouchOutside(false);
        DatabaseHelper A0 = DatabaseHelper.A0(this);
        l.e(A0, "getInstance(...)");
        J1(A0);
        d8 d8Var3 = this.G;
        if (d8Var3 == null) {
            l.v("binding");
            d8Var3 = null;
        }
        d8Var3.f25894p.setLayoutManager(new LinearLayoutManager(this, 0, false));
        a.C0153a aVar2 = gb.a.f11754a;
        d8 d8Var4 = this.G;
        if (d8Var4 == null) {
            l.v("binding");
            d8Var4 = null;
        }
        EditText editText = d8Var4.f25886h;
        l.e(editText, "engineEt");
        aVar2.a(this, editText);
        d8 d8Var5 = this.G;
        if (d8Var5 == null) {
            l.v("binding");
            d8Var5 = null;
        }
        EditText editText2 = d8Var5.f25890l;
        l.e(editText2, "inputEt");
        aVar2.a(this, editText2);
        d8 d8Var6 = this.G;
        if (d8Var6 == null) {
            l.v("binding");
        } else {
            d8Var = d8Var6;
        }
        EditText editText3 = d8Var.f25882d;
        l.e(editText3, "chasisEt");
        aVar2.a(this, editText3);
        y1();
        Q1();
        v1().V().g(this, new f(new d(this)));
        v1().W().g(this, new f(new e(this)));
    }

    public final ArrayList p1() {
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            return arrayList;
        }
        l.v("arrayList");
        return null;
    }

    public final String q1() {
        return this.Q;
    }

    public final DatabaseHelper r1() {
        DatabaseHelper databaseHelper = this.N;
        if (databaseHelper != null) {
            return databaseHelper;
        }
        l.v("databaseHelper");
        return null;
    }

    public final ProgressDialog s1() {
        ProgressDialog progressDialog = this.L;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("dialog");
        return null;
    }

    public final ld.c t1() {
        ld.c cVar = this.R;
        if (cVar != null) {
            return cVar;
        }
        l.v("langSession");
        return null;
    }

    public final RcService u1() {
        RcService rcService = this.K;
        if (rcService != null) {
            return rcService;
        }
        l.v("mRcService");
        return null;
    }

    public final cd.c v1() {
        cd.c cVar = this.J;
        if (cVar != null) {
            return cVar;
        }
        l.v("mRcViewModel");
        return null;
    }

    public final h w1() {
        h hVar = this.P;
        if (hVar != null) {
            return hVar;
        }
        l.v("myRcAdapter");
        return null;
    }

    public final g x1() {
        g gVar = this.M;
        if (gVar != null) {
            return gVar;
        }
        l.v("sessionManager");
        return null;
    }
}
