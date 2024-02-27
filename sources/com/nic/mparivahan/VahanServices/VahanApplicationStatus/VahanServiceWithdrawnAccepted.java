package com.nic.mparivahan.VahanServices.VahanApplicationStatus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ni.i8;

public final class VahanServiceWithdrawnAccepted extends d {
    private i8 G;

    /* access modifiers changed from: private */
    public static final void h1(VahanServiceWithdrawnAccepted vahanServiceWithdrawnAccepted, View view) {
        l.f(vahanServiceWithdrawnAccepted, "this$0");
        vahanServiceWithdrawnAccepted.finish();
    }

    /* access modifiers changed from: private */
    public static final void i1(VahanServiceWithdrawnAccepted vahanServiceWithdrawnAccepted, View view) {
        l.f(vahanServiceWithdrawnAccepted, "this$0");
        Intent intent = new Intent(vahanServiceWithdrawnAccepted, VahanWithdraw.class);
        intent.addFlags(67108864);
        vahanServiceWithdrawnAccepted.startActivity(intent);
        vahanServiceWithdrawnAccepted.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_service_withdrawn_accepted);
        i8 c10 = i8.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.G = c10;
        i8 i8Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        i8 i8Var2 = this.G;
        if (i8Var2 == null) {
            l.v("binding");
            i8Var2 = null;
        }
        i8Var2.f26819d.f25959e.setOnClickListener(new m1(this));
        i8 i8Var3 = this.G;
        if (i8Var3 == null) {
            l.v("binding");
        } else {
            i8Var = i8Var3;
        }
        i8Var.f26817b.setOnClickListener(new n1(this));
    }
}
