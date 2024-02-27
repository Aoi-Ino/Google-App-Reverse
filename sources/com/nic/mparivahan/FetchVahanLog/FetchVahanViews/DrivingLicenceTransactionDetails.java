package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ka.c;
import nb.b;
import ni.v3;
import v9.e;

public final class DrivingLicenceTransactionDetails extends d {
    public ImageView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public TextView R;
    private v3 S;

    /* access modifiers changed from: private */
    public static final void s1(DrivingLicenceTransactionDetails drivingLicenceTransactionDetails, View view) {
        l.f(drivingLicenceTransactionDetails, "this$0");
        drivingLicenceTransactionDetails.finish();
    }

    public final void A1(TextView textView) {
        l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void B1(TextView textView) {
        l.f(textView, "<set-?>");
        this.R = textView;
    }

    public final void C1(TextView textView) {
        l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void D1(TextView textView) {
        l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void E1(TextView textView) {
        l.f(textView, "<set-?>");
        this.O = textView;
    }

    public final void G0() {
        View findViewById = findViewById(R.id.applicationNo);
        l.e(findViewById, "findViewById(...)");
        v1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.applicationDate);
        l.e(findViewById2, "findViewById(...)");
        u1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.receiptno);
        l.e(findViewById3, "findViewById(...)");
        z1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.tv_receiptno);
        l.e(findViewById4, "findViewById(...)");
        D1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.receiptdate);
        l.e(findViewById5, "findViewById(...)");
        y1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.amount);
        l.e(findViewById6, "findViewById(...)");
        t1((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.transactionname);
        l.e(findViewById7, "findViewById(...)");
        A1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.tv_transactionname);
        l.e(findViewById8, "findViewById(...)");
        E1((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.drivinglic_no);
        l.e(findViewById9, "findViewById(...)");
        w1((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.back_icon);
        l.e(findViewById10, "findViewById(...)");
        x1((ImageView) findViewById10);
        View findViewById11 = findViewById(R.id.tv_receiptdate);
        l.e(findViewById11, "findViewById(...)");
        C1((TextView) findViewById11);
        View findViewById12 = findViewById(R.id.tv_amount);
        l.e(findViewById12, "findViewById(...)");
        B1((TextView) findViewById12);
        k1().setOnClickListener(new b(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            i1().setText(extras.getString("ApplicationNo"));
            h1().setText(extras.getString("ApplicationDate"));
            c.a aVar = c.f13158a;
            if (!aVar.m(extras.getString("ReceiptNo"))) {
                m1().setText(extras.getString("ReceiptNo"));
            } else {
                m1().setVisibility(8);
                q1().setVisibility(8);
            }
            if (!aVar.m(extras.getString("TransactionName"))) {
                n1().setText(extras.getString("TransactionName"));
            } else {
                n1().setVisibility(8);
                r1().setVisibility(8);
            }
            g1().setText(extras.getString("Amount"));
            j1().setText(extras.getString("sarlogDlNumber"));
            String string = extras.getString("sarlogFeeDate");
            if (string == null || string.length() == 0 || p.p(extras.getString("sarlogFeeDate"), "NA", false, 2, (Object) null)) {
                p1().setVisibility(8);
                l1().setVisibility(8);
            } else {
                p1().setVisibility(0);
                l1().setVisibility(0);
                l1().setText(extras.getString("sarlogFeeDate"));
            }
            String string2 = extras.getString("Amount");
            if (string2 == null || string2.length() == 0 || p.o(extras.getString("Amount"), "NA", true)) {
                o1().setVisibility(8);
                g1().setVisibility(8);
                return;
            }
            o1().setVisibility(0);
            g1().setVisibility(0);
            g1().setText(extras.getString("Amount"));
        }
    }

    public final TextView g1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        l.v("amount");
        return null;
    }

    public final TextView h1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        l.v("applicationDate");
        return null;
    }

    public final TextView i1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        l.v("applicationNo");
        return null;
    }

    public final TextView j1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        l.v("drivinglic_no");
        return null;
    }

    public final ImageView k1() {
        ImageView imageView = this.G;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        l.v("receiptdate");
        return null;
    }

    public final TextView m1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        l.v("receiptno");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        l.v("transactionname");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.R;
        if (textView != null) {
            return textView;
        }
        l.v("tv_amount");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_dl_transaction);
        v3 c10 = v3.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.S = c10;
        v3 v3Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        v3 v3Var2 = this.S;
        if (v3Var2 == null) {
            l.v("binding");
        } else {
            v3Var = v3Var2;
        }
        aVar.H1(this, v3Var);
        G0();
    }

    public final TextView p1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        l.v("tv_receiptdate");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        l.v("tv_receiptno");
        return null;
    }

    public final TextView r1() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        l.v("tv_transactionname");
        return null;
    }

    public final void t1(TextView textView) {
        l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final void u1(TextView textView) {
        l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void v1(TextView textView) {
        l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void w1(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void x1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.G = imageView;
    }

    public final void y1(TextView textView) {
        l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void z1(TextView textView) {
        l.f(textView, "<set-?>");
        this.J = textView;
    }
}
