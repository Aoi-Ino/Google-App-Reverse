package com.nic.mparivahan.FetchVahanLog.FetchVahanViews;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ka.c;
import nb.t;
import ni.g9;
import v9.e;

public final class VehicleTransactionDetails extends d {
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
    private g9 R;

    /* access modifiers changed from: private */
    public static final void r1(VehicleTransactionDetails vehicleTransactionDetails, View view) {
        l.f(vehicleTransactionDetails, "this$0");
        vehicleTransactionDetails.finish();
    }

    public final void A1(TextView textView) {
        l.f(textView, "<set-?>");
        this.Q = textView;
    }

    public final void B1(TextView textView) {
        l.f(textView, "<set-?>");
        this.K = textView;
    }

    public final void C1(TextView textView) {
        l.f(textView, "<set-?>");
        this.H = textView;
    }

    public final void G0() {
        View findViewById = findViewById(R.id.vehicleno);
        l.e(findViewById, "findViewById(...)");
        C1((TextView) findViewById);
        View findViewById2 = findViewById(R.id.applicationNo);
        l.e(findViewById2, "findViewById(...)");
        u1((TextView) findViewById2);
        View findViewById3 = findViewById(R.id.applicationDate);
        l.e(findViewById3, "findViewById(...)");
        t1((TextView) findViewById3);
        View findViewById4 = findViewById(R.id.tv_receiptno);
        l.e(findViewById4, "findViewById(...)");
        B1((TextView) findViewById4);
        View findViewById5 = findViewById(R.id.receiptno);
        l.e(findViewById5, "findViewById(...)");
        x1((TextView) findViewById5);
        View findViewById6 = findViewById(R.id.receiptdate);
        l.e(findViewById6, "findViewById(...)");
        w1((TextView) findViewById6);
        View findViewById7 = findViewById(R.id.tv_receiptdate);
        l.e(findViewById7, "findViewById(...)");
        A1((TextView) findViewById7);
        View findViewById8 = findViewById(R.id.amount);
        l.e(findViewById8, "findViewById(...)");
        s1((TextView) findViewById8);
        View findViewById9 = findViewById(R.id.tv_amount);
        l.e(findViewById9, "findViewById(...)");
        z1((TextView) findViewById9);
        View findViewById10 = findViewById(R.id.transactionname);
        l.e(findViewById10, "findViewById(...)");
        y1((TextView) findViewById10);
        View findViewById11 = findViewById(R.id.back_icon);
        l.e(findViewById11, "findViewById(...)");
        v1((ImageView) findViewById11);
        j1().setOnClickListener(new t(this));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            q1().setText(extras.getString("vehicleno"));
            i1().setText(extras.getString("ApplicationNo"));
            h1().setText(extras.getString("ApplicationDate"));
            m1().setText(extras.getString("TransactionName"));
            c.a aVar = c.f13158a;
            if (!aVar.m(extras.getString("ReceiptNo"))) {
                l1().setText(extras.getString("ReceiptNo"));
            } else {
                l1().setVisibility(8);
                p1().setVisibility(8);
            }
            if (!aVar.m(extras.getString("ReceiptDate"))) {
                k1().setText(extras.getString("ReceiptDate"));
            } else {
                k1().setVisibility(8);
                o1().setVisibility(8);
            }
            if (!aVar.m(extras.getString("Amount"))) {
                g1().setText(extras.getString("Amount"));
                return;
            }
            g1().setVisibility(8);
            n1().setVisibility(8);
        }
    }

    public final TextView g1() {
        TextView textView = this.N;
        if (textView != null) {
            return textView;
        }
        l.v("amount");
        return null;
    }

    public final TextView h1() {
        TextView textView = this.J;
        if (textView != null) {
            return textView;
        }
        l.v("applicationDate");
        return null;
    }

    public final TextView i1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        l.v("applicationNo");
        return null;
    }

    public final ImageView j1() {
        ImageView imageView = this.G;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final TextView k1() {
        TextView textView = this.M;
        if (textView != null) {
            return textView;
        }
        l.v("receiptdate");
        return null;
    }

    public final TextView l1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        l.v("receiptno");
        return null;
    }

    public final TextView m1() {
        TextView textView = this.P;
        if (textView != null) {
            return textView;
        }
        l.v("transactionname");
        return null;
    }

    public final TextView n1() {
        TextView textView = this.O;
        if (textView != null) {
            return textView;
        }
        l.v("tv_amount");
        return null;
    }

    public final TextView o1() {
        TextView textView = this.Q;
        if (textView != null) {
            return textView;
        }
        l.v("tv_receiptdate");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_transcation);
        g9 c10 = g9.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.R = c10;
        g9 g9Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        g9 g9Var2 = this.R;
        if (g9Var2 == null) {
            l.v("binding");
        } else {
            g9Var = g9Var2;
        }
        aVar.k2(this, g9Var);
        G0();
    }

    public final TextView p1() {
        TextView textView = this.K;
        if (textView != null) {
            return textView;
        }
        l.v("tv_receiptno");
        return null;
    }

    public final TextView q1() {
        TextView textView = this.H;
        if (textView != null) {
            return textView;
        }
        l.v("vehicleno");
        return null;
    }

    public final void s1(TextView textView) {
        l.f(textView, "<set-?>");
        this.N = textView;
    }

    public final void t1(TextView textView) {
        l.f(textView, "<set-?>");
        this.J = textView;
    }

    public final void u1(TextView textView) {
        l.f(textView, "<set-?>");
        this.I = textView;
    }

    public final void v1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.G = imageView;
    }

    public final void w1(TextView textView) {
        l.f(textView, "<set-?>");
        this.M = textView;
    }

    public final void x1(TextView textView) {
        l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void y1(TextView textView) {
        l.f(textView, "<set-?>");
        this.P = textView;
    }

    public final void z1(TextView textView) {
        l.f(textView, "<set-?>");
        this.O = textView;
    }
}
