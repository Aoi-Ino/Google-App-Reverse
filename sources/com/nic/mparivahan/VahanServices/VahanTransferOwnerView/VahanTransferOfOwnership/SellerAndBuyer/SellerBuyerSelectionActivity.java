package com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.SellerAndBuyer;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.app.d;
import bh.a;
import bh.b;
import cm.l;
import com.nic.mparivahan.Dashboard.ui.DashBoard;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import com.nic.mparivahan.VahanServices.VahanTransferOwnerView.VahanTransferOfOwnership.TOBuyer.TOBuyerInit;
import java.util.ArrayList;
import java.util.Calendar;
import ld.c;
import ld.h;
import ni.yc;
import v9.e;

public final class SellerBuyerSelectionActivity extends d {
    public yc G;
    public ProgressDialog H;
    private Calendar I = Calendar.getInstance();
    private String J;
    public c K;
    private final ArrayList L = new ArrayList();

    /* access modifiers changed from: private */
    public static final void m1(SellerBuyerSelectionActivity sellerBuyerSelectionActivity, View view) {
        l.f(sellerBuyerSelectionActivity, "this$0");
        sellerBuyerSelectionActivity.finish();
    }

    /* access modifiers changed from: private */
    public static final void n1(SellerBuyerSelectionActivity sellerBuyerSelectionActivity, View view) {
        l.f(sellerBuyerSelectionActivity, "this$0");
        sellerBuyerSelectionActivity.q1();
    }

    /* access modifiers changed from: private */
    public static final void o1(SellerBuyerSelectionActivity sellerBuyerSelectionActivity, View view) {
        l.f(sellerBuyerSelectionActivity, "this$0");
        new h(sellerBuyerSelectionActivity).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        Intent intent = new Intent(sellerBuyerSelectionActivity, VahanSellerBuyerMainScreen.class);
        intent.putExtra("state_code", sellerBuyerSelectionActivity.J);
        sellerBuyerSelectionActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public static final void p1(SellerBuyerSelectionActivity sellerBuyerSelectionActivity, View view) {
        l.f(sellerBuyerSelectionActivity, "this$0");
        new h(sellerBuyerSelectionActivity).h(VContant.TRANFER_OF_OWNERSHIP, VContant.TRANFER_OF_OWNERSHIP_CODE);
        Intent intent = new Intent(sellerBuyerSelectionActivity, TOBuyerInit.class);
        intent.putExtra("state_code", sellerBuyerSelectionActivity.J);
        sellerBuyerSelectionActivity.startActivity(intent);
    }

    private final void q1() {
        Intent intent = new Intent(this, DashBoard.class);
        intent.addFlags(67108864);
        startActivity(intent);
        finish();
    }

    public final yc j1() {
        yc ycVar = this.G;
        if (ycVar != null) {
            return ycVar;
        }
        l.v("binding");
        return null;
    }

    public final c k1() {
        c cVar = this.K;
        if (cVar != null) {
            return cVar;
        }
        l.v("languageKeySession");
        return null;
    }

    public final ProgressDialog l1() {
        ProgressDialog progressDialog = this.H;
        if (progressDialog != null) {
            return progressDialog;
        }
        l.v("pDialog");
        return null;
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.seller_buyer_selection_activity);
        yc c10 = yc.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        r1(c10);
        setContentView((View) j1().b());
        e.f17509a.K1(this, j1());
        s1(new c(this));
        t1(new ProgressDialog(this));
        l1().setMessage("Please wait...");
        l1().setCancelable(false);
        l1().setCanceledOnTouchOutside(false);
        if (getIntent() != null) {
            this.J = String.valueOf(getIntent().getStringExtra("state_code"));
        }
        j1().D.f28304e.setVisibility(0);
        j1().D.f28308i.setText(String.valueOf(k1().b("toSellerBuyer", "Transfer of Ownership \n (Seller & Buyer)")));
        j1().D.f28305f.setOnClickListener(new a(this));
        j1().D.f28306g.setOnClickListener(new b(this));
        j1().A.setOnClickListener(new bh.c(this));
        j1().f29584b.setOnClickListener(new bh.d(this));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        l.f(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        finish();
        return true;
    }

    public final void r1(yc ycVar) {
        l.f(ycVar, "<set-?>");
        this.G = ycVar;
    }

    public final void s1(c cVar) {
        l.f(cVar, "<set-?>");
        this.K = cVar;
    }

    public final void t1(ProgressDialog progressDialog) {
        l.f(progressDialog, "<set-?>");
        this.H = progressDialog;
    }
}
