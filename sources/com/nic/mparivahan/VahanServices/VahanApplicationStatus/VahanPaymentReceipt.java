package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.c7;

public final class VahanPaymentReceipt extends d {
    private c7 G;

    /* access modifiers changed from: private */
    public static final void g1(VahanPaymentReceipt vahanPaymentReceipt, View view) {
        l.f(vahanPaymentReceipt, "this$0");
        vahanPaymentReceipt.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_payment_receipt);
        c7 c10 = c7.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        c7 c7Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        c7 c7Var2 = this.G;
        if (c7Var2 == null) {
            l.v("binding");
        } else {
            c7Var = c7Var2;
        }
        c7Var.f25631c.f25959e.setOnClickListener(new i1(this));
    }
}
