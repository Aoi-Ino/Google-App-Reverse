package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.m9;

public final class VahanVerifyPendingTransactionDetails extends d {
    private m9 G;

    /* access modifiers changed from: private */
    public static final void g1(VahanVerifyPendingTransactionDetails vahanVerifyPendingTransactionDetails, View view) {
        l.f(vahanVerifyPendingTransactionDetails, "this$0");
        vahanVerifyPendingTransactionDetails.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_verify_pending_transaction_details);
        m9 c10 = m9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        m9 m9Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        m9 m9Var2 = this.G;
        if (m9Var2 == null) {
            l.v("binding");
        } else {
            m9Var = m9Var2;
        }
        m9Var.f27456d.f25959e.setOnClickListener(new w1(this));
    }
}
