package com.nic.mparivahan.Checkpost;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.Checkpost.CheckPostModel.CheckPostReceiptDetailNewItem;
import com.nic.mparivahan.MyTextView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import ni.i0;
import v9.e;
import z8.a;

public final class CheckPostReceiptDetails extends d {
    public i0 G;
    private String H = "";
    private CheckPostReceiptDetailNewItem I;

    /* access modifiers changed from: private */
    public static final void h1(CheckPostReceiptDetails checkPostReceiptDetails, View view) {
        l.f(checkPostReceiptDetails, "this$0");
        checkPostReceiptDetails.finish();
    }

    public final void G0() {
        g1().f26764h.f28448b.setOnClickListener(new a(this));
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem = this.I;
        String str = null;
        String paymentDate = checkPostReceiptDetailNewItem != null ? checkPostReceiptDetailNewItem.getPaymentDate() : null;
        l.c(paymentDate);
        Date parse = simpleDateFormat2.parse(p.w(paymentDate, " ", "T", false, 4, (Object) null));
        l.e(parse, "parse(...)");
        String format = simpleDateFormat.format(parse);
        l.e(format, "format(...)");
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem2 = this.I;
        String taxFrom = checkPostReceiptDetailNewItem2 != null ? checkPostReceiptDetailNewItem2.getTaxFrom() : null;
        l.c(taxFrom);
        Date parse2 = simpleDateFormat2.parse(p.w(taxFrom, " ", "T", false, 4, (Object) null));
        l.e(parse2, "parse(...)");
        String format2 = simpleDateFormat.format(parse2);
        l.e(format2, "format(...)");
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem3 = this.I;
        String paymentDate2 = checkPostReceiptDetailNewItem3 != null ? checkPostReceiptDetailNewItem3.getPaymentDate() : null;
        l.c(paymentDate2);
        Date parse3 = simpleDateFormat2.parse(p.w(paymentDate2, " ", "T", false, 4, (Object) null));
        l.e(parse3, "parse(...)");
        String format3 = simpleDateFormat.format(parse3);
        l.e(format3, "format(...)");
        MyTextView myTextView = g1().f26765i;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem4 = this.I;
        myTextView.setText(checkPostReceiptDetailNewItem4 != null ? checkPostReceiptDetailNewItem4.getOwnerName() : null);
        MyTextView myTextView2 = g1().L;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem5 = this.I;
        myTextView2.setText(checkPostReceiptDetailNewItem5 != null ? checkPostReceiptDetailNewItem5.getRegnNo() : null);
        MyTextView myTextView3 = g1().f26775s;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem6 = this.I;
        myTextView3.setText(checkPostReceiptDetailNewItem6 != null ? checkPostReceiptDetailNewItem6.getRcptNo() : null);
        g1().f26766j.setText(format);
        MyTextView myTextView4 = g1().J;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem7 = this.I;
        myTextView4.setText(checkPostReceiptDetailNewItem7 != null ? checkPostReceiptDetailNewItem7.getVehicleClass() : null);
        MyTextView myTextView5 = g1().G;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem8 = this.I;
        myTextView5.setText(checkPostReceiptDetailNewItem8 != null ? checkPostReceiptDetailNewItem8.getVehicleType() : null);
        MyTextView myTextView6 = g1().f26761e;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem9 = this.I;
        myTextView6.setText(checkPostReceiptDetailNewItem9 != null ? checkPostReceiptDetailNewItem9.getChassisNo() : null);
        g1().f26778v.setText(format2);
        g1().B.setText(format3);
        MyTextView myTextView7 = g1().f26758b;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem10 = this.I;
        myTextView7.setText(String.valueOf(checkPostReceiptDetailNewItem10 != null ? checkPostReceiptDetailNewItem10.getAmount() : null));
        MyTextView myTextView8 = g1().f26781y;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem11 = this.I;
        myTextView8.setText(String.valueOf(checkPostReceiptDetailNewItem11 != null ? checkPostReceiptDetailNewItem11.getTaxMode() : null));
        MyTextView myTextView9 = g1().f26769m;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem12 = this.I;
        myTextView9.setText(checkPostReceiptDetailNewItem12 != null ? checkPostReceiptDetailNewItem12.getPaymentMode() : null);
        MyTextView myTextView10 = g1().f26772p;
        CheckPostReceiptDetailNewItem checkPostReceiptDetailNewItem13 = this.I;
        if (checkPostReceiptDetailNewItem13 != null) {
            str = checkPostReceiptDetailNewItem13.getPaymentStatus();
        }
        myTextView10.setText(str);
    }

    public final i0 g1() {
        i0 i0Var = this.G;
        if (i0Var != null) {
            return i0Var;
        }
        l.v("binding");
        return null;
    }

    public final void i1(i0 i0Var) {
        l.f(i0Var, "<set-?>");
        this.G = i0Var;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i0 c10 = i0.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        i1(c10);
        setContentView((View) g1().b());
        this.I = (CheckPostReceiptDetailNewItem) getIntent().getParcelableExtra("selectedData");
        String stringExtra = getIntent().getStringExtra("inputType");
        l.c(stringExtra);
        this.H = stringExtra;
        e.f17509a.V(this, g1());
        G0();
    }
}
