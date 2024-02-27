package com.nic.mparivahan.InformationService;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cm.l;
import com.nic.mparivahan.R;
import ob.a;

public final class InformationalWebView extends d {
    public String G;
    public String H;
    private WebView I;
    private CoordinatorLayout J;
    public ImageView K;
    public TextView L;

    private final void k1() {
        View findViewById = findViewById(R.id.mvvm_Back);
        l.e(findViewById, "findViewById(...)");
        n1((ImageView) findViewById);
        g1().setOnClickListener(new a(this));
        m1();
    }

    /* access modifiers changed from: private */
    public static final void l1(InformationalWebView informationalWebView, View view) {
        l.f(informationalWebView, "this$0");
        informationalWebView.finish();
    }

    private final void m1() {
        WebView webView = this.I;
        if (webView == null) {
            l.v("webView");
            webView = null;
        }
        webView.loadUrl(h1());
    }

    public final ImageView g1() {
        ImageView imageView = this.K;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final String h1() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        l.v("printUrl");
        return null;
    }

    public final TextView i1() {
        TextView textView = this.L;
        if (textView != null) {
            return textView;
        }
        l.v("service_label");
        return null;
    }

    public final String j1() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        l.v("titletxt");
        return null;
    }

    public final void n1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.K = imageView;
    }

    public final void o1(String str) {
        l.f(str, "<set-?>");
        this.G = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.information_service);
        View findViewById = findViewById(R.id.paymentWv);
        l.e(findViewById, "findViewById(...)");
        this.I = (WebView) findViewById;
        View findViewById2 = findViewById(R.id.rootView);
        l.e(findViewById2, "findViewById(...)");
        this.J = (CoordinatorLayout) findViewById2;
        View findViewById3 = findViewById(R.id.service_label);
        l.e(findViewById3, "findViewById(...)");
        p1((TextView) findViewById3);
        String stringExtra = getIntent().getStringExtra("URL");
        l.c(stringExtra);
        o1(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("title");
        l.c(stringExtra2);
        q1(stringExtra2);
        i1().setText(j1());
        k1();
    }

    public final void p1(TextView textView) {
        l.f(textView, "<set-?>");
        this.L = textView;
    }

    public final void q1(String str) {
        l.f(str, "<set-?>");
        this.H = str;
    }
}
