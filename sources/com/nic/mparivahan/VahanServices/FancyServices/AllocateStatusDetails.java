package com.nic.mparivahan.VahanServices.FancyServices;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ld.c;
import ni.i;
import v9.e;
import ye.a;

public final class AllocateStatusDetails extends d {
    public i G;
    public c H;

    /* access modifiers changed from: private */
    public static final void h1(AllocateStatusDetails allocateStatusDetails, View view) {
        l.f(allocateStatusDetails, "this$0");
        allocateStatusDetails.finish();
    }

    public final void G0() {
        g1().f26749s.f28448b.setOnClickListener(new a(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("regno");
            String string2 = extras.getString("ackNo");
            String string3 = extras.getString("recpno");
            String string4 = extras.getString("ownerName");
            String string5 = extras.getString("fatherName");
            String string6 = extras.getString("mobileNumber");
            String string7 = extras.getString("address");
            String string8 = extras.getString("pincode");
            String string9 = extras.getString("state");
            String string10 = extras.getString("rto");
            int i10 = extras.getInt("reserve_amt");
            int i11 = extras.getInt("auctionAmt");
            String string11 = extras.getString("bookingDate");
            String string12 = extras.getString("allotmentType");
            String string13 = extras.getString("status");
            l.c(string11);
            String w10 = p.w(string11, " ", "T", false, 4, (Object) null);
            String str = string13;
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", locale);
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale).parse(w10);
            l.e(parse, "parse(...)");
            String format = simpleDateFormat.format(parse);
            l.e(format, "format(...)");
            g1().F.setText(string);
            g1().f26732b.setText(string2);
            g1().C.setText(string3);
            g1().f26753w.setText(string4);
            g1().f26747q.setText(string5);
            g1().f26750t.setText(string6);
            g1().f26735e.setText(string7);
            g1().f26756z.setText(string8);
            g1().M.setText(string9);
            g1().J.setText(string10);
            g1().G.setText(String.valueOf(i10));
            g1().f26741k.setText(String.valueOf(i11));
            g1().f26744n.setText(format);
            g1().f26738h.setText(string12);
            g1().P.setText(str);
        }
    }

    public final i g1() {
        i iVar = this.G;
        if (iVar != null) {
            return iVar;
        }
        l.v("binding");
        return null;
    }

    public final void i1(i iVar) {
        l.f(iVar, "<set-?>");
        this.G = iVar;
    }

    public final void j1(c cVar) {
        l.f(cVar, "<set-?>");
        this.H = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i c10 = i.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        i1(c10);
        setContentView((View) g1().b());
        j1(new c(this));
        g1().f26749s.f28452f.setText("Allocate Status Details");
        e.f17509a.A(this, g1());
        G0();
    }
}
