package com.nic.mparivahan.AbtCntctTerms;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.d;
import cm.l;
import com.nic.mparivahan.R;
import ld.c;
import n8.a;

public final class AboutUs extends d {
    public ImageView G;
    public WebView H;
    public TextView I;

    /* access modifiers changed from: private */
    public static final void j1(AboutUs aboutUs, View view) {
        l.f(aboutUs, "this$0");
        aboutUs.finish();
    }

    public final WebView g1() {
        WebView webView = this.H;
        if (webView != null) {
            return webView;
        }
        l.v("aboutUsWv");
        return null;
    }

    public final ImageView h1() {
        ImageView imageView = this.G;
        if (imageView != null) {
            return imageView;
        }
        l.v("mvvm_back");
        return null;
    }

    public final TextView i1() {
        TextView textView = this.I;
        if (textView != null) {
            return textView;
        }
        l.v("service_label");
        return null;
    }

    public final void k1(WebView webView) {
        l.f(webView, "<set-?>");
        this.H = webView;
    }

    public final void l1(ImageView imageView) {
        l.f(imageView, "<set-?>");
        this.G = imageView;
    }

    public final void m1(TextView textView) {
        l.f(textView, "<set-?>");
        this.I = textView;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_about_us);
        View findViewById = findViewById(R.id.mvvm_Back);
        l.e(findViewById, "findViewById(...)");
        l1((ImageView) findViewById);
        View findViewById2 = findViewById(R.id.aboutUsWv);
        l.e(findViewById2, "findViewById(...)");
        k1((WebView) findViewById2);
        View findViewById3 = findViewById(R.id.service_label);
        l.e(findViewById3, "findViewById(...)");
        m1((TextView) findViewById3);
        c cVar = new c(this);
        i1().setText(cVar.b("label_about_us", "About Us"));
        h1().setOnClickListener(new a(this));
        String str = hc.a.f12073a.g() + cVar.d() + "/mparivahan-info-about-us.html";
        Log.e("URL", str);
        g1().loadUrl(str);
        g1().clearCache(true);
    }
}
