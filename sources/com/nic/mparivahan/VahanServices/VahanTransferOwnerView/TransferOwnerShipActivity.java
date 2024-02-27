package com.nic.mparivahan.VahanServices.VahanTransferOwnerView;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.ae;

public final class TransferOwnerShipActivity extends d {
    public ae G;

    public final ae f1() {
        ae aeVar = this.G;
        if (aeVar != null) {
            return aeVar;
        }
        l.v("binding");
        return null;
    }

    public final void g1(ae aeVar) {
        l.f(aeVar, "<set-?>");
        this.G = aeVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.vahan_transfer_ownership);
        ae c10 = ae.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        g1(c10);
        setContentView((View) f1().b());
    }
}
