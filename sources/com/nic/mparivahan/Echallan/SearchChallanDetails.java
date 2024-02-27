package com.nic.mparivahan.Echallan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.core.content.a;
import cb.c1;
import cb.d1;
import cb.e1;
import cb.f1;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.Echallan.Model.SearchChallanResultModel;
import com.nic.mparivahan.R;
import java.util.HashMap;
import ni.vc;

public final class SearchChallanDetails extends d {
    private SearchChallanResultModel G;
    public vc H;
    private HashMap I = new HashMap();
    private String J = "";

    private final void j1() {
        this.I.put("AN", "Andaman and Nicobar Islands");
        this.I.put("AP", "Andhra Pradesh");
        this.I.put("AR", "Arunachal Pradesh");
        this.I.put("AS", "Assam");
        this.I.put("BR", "Bihar");
        this.I.put("CG", "Chandigarh");
        this.I.put("CH", "Chandigarh");
        this.I.put("DH", "Dadra and Nagar Haveli");
        this.I.put("DD", "Daman and Diu");
        this.I.put("DL", "Delhi");
        this.I.put("GA", "Goa");
        this.I.put("GJ", "Gujarat");
        this.I.put("HR", "Haryana");
        this.I.put("HP", "Himachal Pradesh");
        this.I.put("JK", "Jammu and Kashmir");
        this.I.put("JH", "Jharkhand");
        this.I.put("KA", "Karnataka");
        this.I.put("KL", "Kerala");
        this.I.put("LD", "Lakshadweep");
        this.I.put("MP", "Madhya Pradesh");
        this.I.put("MH", "Maharashtra");
        this.I.put("MN", "Manipur");
        this.I.put("ML", "Meghalaya");
        this.I.put("MZ", "Mizoram");
        this.I.put("NL", "Nagaland");
        this.I.put("OR", "Odisha");
        this.I.put("PY", "Puducherry");
        this.I.put("PB", "Punjab");
        this.I.put("RJ", "Rajasthan");
        this.I.put("SK", "Sikkim");
        this.I.put("TN", "Tamil Nadu");
        this.I.put("TS", "Telangana");
        this.I.put("TR", "Tripura");
        this.I.put("UK", "Uttarakhand");
        this.I.put("UP", "Uttar Pradesh");
        this.I.put("WB", "West Bengal");
    }

    private final void l1() {
        k1().f29087y.f28305f.setOnClickListener(new c1(this));
        k1().f29070h.setOnClickListener(new d1(this));
        k1().f29087y.f28306g.setOnClickListener(new e1(this));
        k1().f29078p.setOnClickListener(new f1(this));
    }

    /* access modifiers changed from: private */
    public static final void m1(SearchChallanDetails searchChallanDetails, View view) {
        l.f(searchChallanDetails, "this$0");
        searchChallanDetails.onBackPressed();
    }

    /* access modifiers changed from: private */
    public static final void n1(SearchChallanDetails searchChallanDetails, View view) {
        l.f(searchChallanDetails, "this$0");
        Intent intent = new Intent(searchChallanDetails, PrintChallanWebView.class);
        SearchChallanResultModel searchChallanResultModel = searchChallanDetails.G;
        String str = null;
        intent.putExtra("challanPdfUrl", searchChallanResultModel != null ? searchChallanResultModel.getPdfUrl() : null);
        SearchChallanResultModel searchChallanResultModel2 = searchChallanDetails.G;
        if (searchChallanResultModel2 != null) {
            str = searchChallanResultModel2.getDocNo();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "searchChallanDetails");
        searchChallanDetails.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void o1(SearchChallanDetails searchChallanDetails, View view) {
        l.f(searchChallanDetails, "this$0");
        searchChallanDetails.q1();
    }

    /* access modifiers changed from: private */
    public static final void p1(SearchChallanDetails searchChallanDetails, View view) {
        l.f(searchChallanDetails, "this$0");
        Intent intent = new Intent(searchChallanDetails, PrintChallanWebView.class);
        SearchChallanResultModel searchChallanResultModel = searchChallanDetails.G;
        String str = null;
        intent.putExtra("challanPdfUrl", searchChallanResultModel != null ? searchChallanResultModel.getReceiptUrl() : null);
        SearchChallanResultModel searchChallanResultModel2 = searchChallanDetails.G;
        if (searchChallanResultModel2 != null) {
            str = searchChallanResultModel2.getDocNo();
        }
        intent.putExtra("challanNo", str);
        intent.putExtra("fromActivity", "searchChallanDetails");
        searchChallanDetails.startActivity(intent);
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    private final void s1(SearchChallanResultModel searchChallanResultModel) {
        Boolean bool;
        View view;
        int i10;
        String ownerName;
        if (searchChallanResultModel == null || (ownerName = searchChallanResultModel.getOwnerName()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(ownerName.length() > 0);
        }
        l.c(bool);
        if (bool.booleanValue()) {
            k1().f29076n.setText(searchChallanResultModel.getOwnerName());
        }
        if (searchChallanResultModel.getDocNo().length() > 0) {
            k1().f29074l.setText(searchChallanResultModel.getDocNo());
        }
        if (searchChallanResultModel.getChallanNo().length() > 0) {
            k1().f29072j.setText(searchChallanResultModel.getChallanNo());
        }
        if (searchChallanResultModel.getDateTime().length() > 0) {
            k1().f29067e.setText(a.f8906a.a(searchChallanResultModel.getDateTime()));
        }
        if (searchChallanResultModel.getAmount().length() > 0) {
            k1().f29065c.setText(searchChallanResultModel.getAmount());
        }
        if (searchChallanResultModel.getChallanStatus().length() > 0) {
            k1().f29080r.setText(searchChallanResultModel.getChallanStatus());
        }
        if (searchChallanResultModel.getPdfUrl().length() > 0) {
            k1().f29070h.setVisibility(0);
        } else {
            k1().f29070h.setVisibility(8);
        }
        if (searchChallanResultModel.getPaymentEligible() == 3) {
            k1().f29078p.setVisibility(0);
            k1().f29083u.setChecked(true);
            view = k1().f29088z;
            i10 = R.color.dodger_blue_new;
        } else {
            k1().f29078p.setVisibility(8);
            k1().f29077o.setChecked(false);
            view = k1().f29081s;
            i10 = R.color.geyser;
        }
        view.setBackgroundColor(a.c(this, i10));
        if (searchChallanResultModel.getStateCd().length() > 0) {
            for (Object next : this.I.keySet()) {
                l.e(next, "next(...)");
                String str = (String) next;
                String str2 = (String) this.I.get(str);
                if (l.a(str, searchChallanResultModel.getStateCd())) {
                    k1().f29085w.setText(str2);
                    return;
                }
                k1().f29085w.setText(searchChallanResultModel.getStateCd());
            }
        }
    }

    public final vc k1() {
        vc vcVar = this.H;
        if (vcVar != null) {
            return vcVar;
        }
        l.v("binding");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vc c10 = vc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        r1(c10);
        setContentView((View) k1().b());
        fb.a.f11584a.f(this, k1());
        this.G = (SearchChallanResultModel) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        l.c(stringExtra);
        this.J = stringExtra;
        l1();
        j1();
        s1(this.G);
    }

    public final void r1(vc vcVar) {
        l.f(vcVar, "<set-?>");
        this.H = vcVar;
    }
}
