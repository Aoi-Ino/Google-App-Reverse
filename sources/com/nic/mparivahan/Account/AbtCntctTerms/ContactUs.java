package com.nic.mparivahan.Account.AbtCntctTerms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.b;
import cm.l;
import com.nic.mparivahan.AbtCntctTerms.ComplaintActivity;
import com.nic.mparivahan.R;
import ni.m1;
import p8.a;
import p8.c;
import v9.e;

public final class ContactUs extends d {
    public ConstraintLayout G;
    public LinearLayout H;
    public ConstraintLayout I;
    public ImageView J;
    private final int K = 23;
    public LinearLayout L;
    private m1 M;

    private final void k1() {
        b.u(this, "android.permission.CALL_PHONE");
        b.s(this, new String[]{"android.permission.CALL_PHONE"}, this.K);
    }

    private final void o1() {
        View findViewById = findViewById(R.id.mvvm_Back);
        l.e(findViewById, "findViewById(...)");
        y1((ImageView) findViewById);
        t1().setOnClickListener(new a(this));
        View findViewById2 = findViewById(R.id.text_number);
        l.e(findViewById2, "findViewById(...)");
        v1((ConstraintLayout) findViewById2);
        View findViewById3 = findViewById(R.id.layout_timing);
        l.e(findViewById3, "findViewById(...)");
        z1((LinearLayout) findViewById3);
        View findViewById4 = findViewById(R.id.challan_help);
        l.e(findViewById4, "findViewById(...)");
        x1((ConstraintLayout) findViewById4);
        View findViewById5 = findViewById(R.id.raise_complaint_ll);
        l.e(findViewById5, "findViewById(...)");
        w1((LinearLayout) findViewById5);
        l1().setOnClickListener(new p8.b(this));
        n1().setOnClickListener(new c(this));
        m1().setOnClickListener(new p8.d(this));
    }

    /* access modifiers changed from: private */
    public static final void p1(ContactUs contactUs, View view) {
        l.f(contactUs, "this$0");
        contactUs.finish();
    }

    /* access modifiers changed from: private */
    public static final void q1(ContactUs contactUs, View view) {
        l.f(contactUs, "this$0");
        if (contactUs.u1()) {
            contactUs.j1();
        } else {
            contactUs.k1();
        }
    }

    /* access modifiers changed from: private */
    public static final void r1(ContactUs contactUs, View view) {
        l.f(contactUs, "this$0");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "helpdesk-mparivahan@gov.in", (String) null));
        intent.putExtra("android.intent.extra.SUBJECT", "");
        intent.putExtra("android.intent.extra.TEXT", "");
        contactUs.startActivity(Intent.createChooser(intent, ""));
    }

    /* access modifiers changed from: private */
    public static final void s1(ContactUs contactUs, View view) {
        l.f(contactUs, "this$0");
        contactUs.startActivity(new Intent(contactUs, ComplaintActivity.class));
    }

    private final boolean u1() {
        return androidx.core.content.a.a(this, "android.permission.CALL_PHONE") == 0;
    }

    public final void j1() {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:" + "0120-4925505"));
        startActivity(intent);
    }

    public final ConstraintLayout l1() {
        ConstraintLayout constraintLayout = this.G;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.v("callNumber");
        return null;
    }

    public final LinearLayout m1() {
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            return linearLayout;
        }
        l.v("complaint_ll");
        return null;
    }

    public final ConstraintLayout n1() {
        ConstraintLayout constraintLayout = this.I;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        l.v("email");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_contact_us);
        m1 c10 = m1.c(getLayoutInflater());
        l.e(c10, "inflate(...)");
        this.M = c10;
        m1 m1Var = null;
        if (c10 == null) {
            l.v("binding");
            c10 = null;
        }
        setContentView((View) c10.b());
        e.a aVar = e.f17509a;
        m1 m1Var2 = this.M;
        if (m1Var2 == null) {
            l.v("binding");
        } else {
            m1Var = m1Var2;
        }
        aVar.i0(this, m1Var);
        o1();
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == this.K) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "Oops you just denied the permission", 1).show();
            } else {
                j1();
            }
        }
    }

    public final ImageView t1() {
        ImageView imageView = this.J;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final void v1(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.G = constraintLayout;
    }

    public final void w1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.L = linearLayout;
    }

    public final void x1(ConstraintLayout constraintLayout) {
        l.f(constraintLayout, "<set-?>");
        this.I = constraintLayout;
    }

    public final void y1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.J = imageView;
    }

    public final void z1(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.H = linearLayout;
    }
}
