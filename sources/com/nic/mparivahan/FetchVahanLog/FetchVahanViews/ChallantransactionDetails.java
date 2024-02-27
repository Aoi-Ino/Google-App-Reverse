package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.MyTextView;
import com.nic.mparivahan.R;
import com.nic.mparivahan.VahanServices.VahanConst.VContant;
import ka.c;
import nb.a;
import ni.u;
import v9.e;

public final class ChallantransactionDetails extends d {
    public u G;

    /* access modifiers changed from: private */
    public static final void h1(ChallantransactionDetails challantransactionDetails, View view) {
        l.f(challantransactionDetails, "this$0");
        challantransactionDetails.finish();
    }

    public final void G0() {
        MyTextView myTextView;
        g1().f28789q.f28448b.setOnClickListener(new a(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("echlogchallannumber");
            String string2 = extras.getString("echlogDocNumber");
            String string3 = extras.getString("echlogStateCd");
            String string4 = extras.getString("echlogChallanDate");
            String string5 = extras.getString("challanAmt");
            String string6 = extras.getString("echlogChallanStatus");
            String string7 = extras.getString("echlogPaymentDate");
            String string8 = extras.getString("echlogTransId");
            String string9 = extras.getString("echlogReceiptNo");
            String string10 = extras.getString("doctype");
            g1().f28779g.setText(string);
            g1().f28775c.setText(string4);
            g1().f28774b.setText(string5);
            g1().f28796x.setText(string6);
            g1().f28795w.setText(VContant.Companion.k(String.valueOf(string3)));
            g1().f28798z.setText(string8);
            g1().f28793u.setText(string9);
            g1().f28791s.setText(string7);
            c.a aVar = c.f13158a;
            if (aVar.m(string8) || p.p(string8, "NA", false, 2, (Object) null)) {
                g1().f28785m.setVisibility(8);
            }
            if (aVar.m(string9) || p.p(string9, "NA", false, 2, (Object) null)) {
                g1().f28781i.setVisibility(8);
            }
            if (aVar.m(string7) || p.p(string7, "NA", false, 2, (Object) null)) {
                g1().f28780h.setVisibility(8);
            }
            if (aVar.m(string5) || p.p(string5, "NA", false, 2, (Object) null)) {
                g1().f28777e.setVisibility(8);
            }
            if (p.p(string10, "RC", false, 2, (Object) null)) {
                g1().f28787o.setVisibility(8);
                g1().f28788p.setText(string2);
            }
            if (p.p(string10, "DL", false, 2, (Object) null)) {
                g1().C.setVisibility(8);
                g1().E.setText(string2);
            }
            if (!aVar.m(string2)) {
                if (String.valueOf(string2).length() > 11) {
                    g1().C.setVisibility(8);
                    myTextView = g1().f28788p;
                } else {
                    g1().f28787o.setVisibility(8);
                    myTextView = g1().E;
                }
                myTextView.setText(string2);
            }
        }
    }

    public final u g1() {
        u uVar = this.G;
        if (uVar != null) {
            return uVar;
        }
        l.v("binding");
        return null;
    }

    public final void i1(u uVar) {
        l.f(uVar, "<set-?>");
        this.G = uVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_challan_transaction);
        u c10 = u.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        i1(c10);
        setContentView((View) g1().b());
        e.f17509a.L(this, g1());
        G0();
    }
}
